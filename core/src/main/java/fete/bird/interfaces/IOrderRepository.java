package fete.bird.interfaces;

import fete.bird.entities.Order;

import java.util.Optional;
import java.util.UUID;

public interface IOrderRepository {
    Optional<Order> findById(UUID id);
}
