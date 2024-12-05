package com.playground.GraphQL_Federated_Clients.service;

import com.playground.GraphQL_Federated_Clients.domain.Client;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BankService {

    private static final List<Client> clients = Arrays.asList(
            new Client("C100", 100, "John", "T.", "Doe"),
            new Client("C101", 101, "Emma", "B.", "Smith"),
            new Client("C102", 102, "James", "B.", "Brown"),
            new Client("C103", 103, "Olivia", "S.", "Johnson"),
            new Client("C100", 100, "William", "K.", "Jones")
    );

    public List<Client> getClients(Integer accountIds) {
        return clients.stream().filter(client -> client.accountId().equals(accountIds)).collect(Collectors.toList());
    }
}
