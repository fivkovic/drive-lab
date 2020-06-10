package com.drivelab.core.service;

import com.drivelab.core.exception.NotFoundException;
import com.drivelab.core.model.RepairShop;
import com.drivelab.core.repository.RepairShopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RepairShopService {

    private final RepairShopRepository repairShopRepository;
    private final PasswordEncoder passwordEncoder;

    public RepairShop findByUsernameAndPassword(String username, String password) {
        final RepairShop repairShop = this.repairShopRepository.findByUsername(username)
                .orElseThrow(() -> new NotFoundException("No repair shop with given credentials found."));
        if (!this.passwordEncoder.matches(password, repairShop.getPassword())) {
            throw new NotFoundException("Credentials are invalid.");
        }

        return repairShop;
    }
}
