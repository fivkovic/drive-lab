package com.drivelab.core.service;

import com.drivelab.core.model.CarPart;
import com.drivelab.core.model.events.CarPartPriceChangedEvent;
import com.drivelab.core.model.events.CarPartStockChangedEvent;
import com.drivelab.core.repository.CarPartRepository;
import org.kie.api.KieBase;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Random;

@Service
public class CarPartsStockService {

    private final KieSession kieSession;
    private final SimpMessagingTemplate simpMessagingTemplate;
    private final CarPartRepository carPartRepository;

    @Autowired
    public CarPartsStockService(KieBase kieBase, SimpMessagingTemplate simpMessagingTemplate, CarPartRepository carPartRepository) {
        this.kieSession = kieBase.newKieSession();
        this.simpMessagingTemplate = simpMessagingTemplate;
        this.carPartRepository = carPartRepository;
        kieSession.setGlobal("carPartsStockService", this);
    }

    // Scheduled to run on first second each minute.
    @Scheduled(cron = "1 */1 * * * ?")
    //@Scheduled(cron = "* * * * * ?")
    private void simulateCarPartPriceChangedEvent() {
        CarPart carPart = this.carPartRepository.findById(245L).get();

        // Double rangeMin = carPart.getPurchasePrice().doubleValue() * 0.75;
        // Double rangeMax = carPart.getPurchasePrice().doubleValue() * 1.25;
        // CarPartPriceChangedEvent event = new CarPartPriceChangedEvent(carPart, getRandomBigDecimal(rangeMin, rangeMax));

        CarPartPriceChangedEvent event = new CarPartPriceChangedEvent(carPart, BigDecimal.valueOf(carPart.getPurchasePrice().doubleValue() * 1.21), "Supplier A");
        kieSession.insert(event);

        kieSession.getAgenda().getAgendaGroup("carPartsStock").setFocus();
        kieSession.fireAllRules();
    }

    // Scheduled to run on 5th secound of each minute.
    @Scheduled(cron = "5 * * * * ?")
    private void simulateCarPartStockChangedEvent() {
        CarPart carPart = this.carPartRepository.findById(111L).get();

        CarPartStockChangedEvent event = new CarPartStockChangedEvent(carPart, -2);
        kieSession.insert(event);

        kieSession.getAgenda().getAgendaGroup("carPartsStock").setFocus();
        kieSession.fireAllRules();
    }

    @SuppressWarnings("unused")
    public void sendCarPartPriceChangedNotification(CarPart carPart, CarPartPriceChangedEvent event) {
        final String message = String.format("The purchase price for %s just went 20 %% up from %s $ to %s $ (Supplier: %s)",
                carPart.getName(), carPart.getPurchasePrice(), event.getNewPrice(), event.getSupplier());

        this.simpMessagingTemplate.convertAndSend("/notifications", message);
    }

    @SuppressWarnings("unused")
    public void sendCarPartStockChangedNotification(CarPartStockChangedEvent event) {
        final String message  =String.format("The car part %s is low on stock.", event.getCarPart().getName());

        this.simpMessagingTemplate.convertAndSend("/notifications", message);
    }

    private static BigDecimal getRandomBigDecimal(Double rangeMin, Double rangeMax) {
        Random r = new Random();
        double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();

        return new BigDecimal(randomValue);
    }
}
