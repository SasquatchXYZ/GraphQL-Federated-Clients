package com.playground.GraphQL_Federated_Clients.domain;

import java.util.List;

public record BankAccount(Integer id, List<Client> client) {
}
