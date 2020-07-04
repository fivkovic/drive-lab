package com.drivelab.core.controller;

import com.drivelab.core.dto.AuthenticationRequest;
import com.drivelab.core.model.RepairShop;
import com.drivelab.core.service.DiagnosticsService;
import com.drivelab.core.service.RepairShopService;
import org.kie.api.runtime.KieSession;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;
import org.springframework.web.bind.annotation.*;
import org.kie.api.KieBase;
import lombok.RequiredArgsConstructor;
import javax.validation.Valid;

import java.util.ArrayList;
import java.util.Collection;

import static com.drivelab.core.common.Constants.API.AUTHENTICATION_ENDPOINT;

@RestController
@RequestMapping(AUTHENTICATION_ENDPOINT)
@RequiredArgsConstructor
public class AuthenticationController {

    private final RepairShopService repairShopService;
    private final KieBase kieBase;
    private final DiagnosticsService diagnosticsService;

    @PostMapping
    public ResponseEntity<?> authenticate(@RequestBody @Valid AuthenticationRequest authenticationRequest) {
        final RepairShop repairShop = this.repairShopService.findByUsernameAndPassword(authenticationRequest.getUsername(), authenticationRequest.getPassword());
        final KieSession kieSession = kieBase.newKieSession();
        final Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>() {{
            add(new SimpleGrantedAuthority(repairShop.getRepairShopRole().name()));
        }};

        final Authentication authentication = new PreAuthenticatedAuthenticationToken(kieSession, null, authorities);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        this.diagnosticsService.initializeKieSession();

        return ResponseEntity.ok(repairShop);
    }

    @PutMapping
    public ResponseEntity<?> logOut() {
        SecurityContextHolder.clearContext();
        return ResponseEntity.ok().build();
    }
}
