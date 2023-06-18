package fete.bird.interfaces;

import fete.bird.entities.Order;
import io.micronaut.core.annotation.Introspected;
import java.util.UUID;

@Introspected
public interface IOrderRepository {
    Order findById(UUID id);
}
