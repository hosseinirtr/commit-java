package com.h2.services;

import com.h2.Dao.ClientDao;
import com.h2.entity.Client;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ClientService {
    private final ClientDao clientDao;

    public void registerClient(Client client) {
        System.out.print("Register");
        clientDao.save(client);

    }

    public Client loginClient(String userName) {
        System.out.print("loginClient");
        return clientDao.findByUsername(userName);
    }

    public List<Client> getAllClient() {
        System.out.print("getAllClient");
        return clientDao.findAll();
    }
}
