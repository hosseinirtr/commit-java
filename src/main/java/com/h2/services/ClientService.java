package com.h2.services;

import com.h2.Dao.ClientDao;
import com.h2.entity.Client;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class ClientService {

    private final ClientDao clientDao;

    public Client registerClient(Client client) {
        System.out.print("Register");
        return clientDao.save(client);

    }

    public Client loginClient(String userName) {
        log.info("Client with username: id-{}", userName);
        System.out.print("loginClient");
        return clientDao.findById(Integer.parseInt(userName)).orElse(null);
    }

    public List<Client> getAllClient() {
        System.out.print("getAllClient");
        return clientDao.findAll();
    }
}
