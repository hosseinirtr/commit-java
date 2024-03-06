package com.h2.controller;

import com.h2.entity.Client;
import com.h2.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @PostMapping(value = "/register")
    public ResponseEntity<Integer> saveOrUpdateClient(@RequestBody Client client) {
        Client savedClient = clientService.registerClient(client);
        int clientId = savedClient.getUserId();
        return new ResponseEntity<>(clientId, HttpStatus.OK);
    }

    @PostMapping(value = "/find")
    public ResponseEntity<Integer> findClient(@RequestBody String client) {
        Client savedClient = clientService.loginClient(client);
        int clientId = savedClient.getUserId();
        return new ResponseEntity<>(clientId, HttpStatus.OK);
    }


}
