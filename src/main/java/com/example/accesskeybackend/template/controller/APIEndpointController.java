package com.example.accesskeybackend.template.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import org.apache.commons.validator.routines.InetAddressValidator;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping
public class APIEndpointController {

    @PostMapping("/api/web/checkIpv6Support")

    public boolean checkIPv6(@RequestParam(required = false) String siteUrl) {
        InetAddressValidator validator = InetAddressValidator.getInstance();
        if (validator.isValidInet6Address(siteUrl)) {
            System.out.print("The IP address " + siteUrl + " is valid");
            return true;
        }
      else return false;
    }
}
