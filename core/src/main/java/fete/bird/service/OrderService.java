package fete.bird.service;

import fete.bird.entities.Order;
import fete.bird.interfaces.IOrderRepository;
import fete.bird.interfaces.IOrderService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.Optional;
import java.util.UUID;

@Singleton
public record OrderService(IOrderRepository iOrderRepository) implements IOrderService {
    @Override
    public Order findbyId(UUID id) {
        return iOrderRepository.findById(id);
    }
}
