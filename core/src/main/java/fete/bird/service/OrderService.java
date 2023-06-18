package fete.bird.service;

import fete.bird.entities.Order;
import fete.bird.interfaces.IOrderService;
import jakarta.inject.Singleton;

import java.util.Optional;
import java.util.UUID;

@Singleton
public record OrderService() implements IOrderService {
    @Override
    public Order findbyId(UUID id) {
        return new Order(UUID.randomUUID(), "Name", "Description name");
    }
}
