package com.h2.controller;

import com.h2.entity.Client;
import com.h2.exceptions.ClientNoFoundException;
import com.h2.exceptions.PostNoFoundException;
import com.h2.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/client")
public class ClientController {
    private final ClientService clientService;

    @PostMapping(value = "/register")
    public ResponseEntity<Integer> saveOrUpdateClient(@RequestBody Client client) {
        Client savedClient = clientService.registerClient(client);
        int clientId = savedClient.getUserId();
        return new ResponseEntity<>(clientId, HttpStatus.OK);
    }

    @GetMapping(value = "/find")
    public ResponseEntity<Client> findClient(@RequestParam String client) {
        System.out.println("client"+client);
        Client savedClient = clientService.loginClient(client);

        return new ResponseEntity<>(savedClient, HttpStatus.OK);
    }

    @GetMapping(value = "/getAll")
    public ResponseEntity<List<Client>> allClient() {
        System.out.println("get all clients");
        List<Client> allClient = clientService.getAllClient();
        if(allClient.isEmpty()){
            throw new ClientNoFoundException("No Client register yet!");
        }
        return ResponseEntity.ok(allClient);
    }
}
