package fete.bird.persistence;

import fete.bird.entities.Order;
import fete.bird.interfaces.IOrderRepository;
import jakarta.inject.Singleton;
import java.util.UUID;

@Singleton
public record OrderRepository() implements IOrderRepository {
    @Override
    public Order findById(UUID id) {
        return new Order(UUID.randomUUID(), "Name", "Description name");
    }
}
