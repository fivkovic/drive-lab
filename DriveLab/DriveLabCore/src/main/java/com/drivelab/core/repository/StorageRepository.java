package com.drivelab.core.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.drivelab.core.exception.BadRequestException;
import com.drivelab.core.service.RuleService;
import org.springframework.stereotype.Repository;

import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Repository
public class StorageRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageRepository.class);

    private static final String DRL_RULES_PATH = "..\\DriveLab\\DriveLabRules\\src\\main\\resources\\rules";
    private static final String DRL_EXTENSION = ".drl";

    public void save(Long id, String rule) {
        LOGGER.info("Saving rule (id={})", id);
        final Path rulePath = this.formatRulePath(id);
        try (final Writer writer = Files.newBufferedWriter(rulePath)) {
            writer.write(rule);
            LOGGER.info("Rule (id={}) successfully saved", id);
        } catch (Exception e) {
            LOGGER.info("Error occured while saving rule (id={})", id);
            throw new BadRequestException("Could not save rule");
        }
    }

    private Path formatRulePath(long id) {
        return Paths.get(DRL_RULES_PATH, String.valueOf(id) + DRL_EXTENSION);
    }
}