package fete.bird.interfaces;

import fete.bird.entities.Order;

import java.util.Optional;
import java.util.UUID;

public interface IOrderService {
    /**
     * Find the order with the specified ID
     *
     * @param id The Id of the Discount to find
     * @return Return the specified order
     */
    Order findbyId(UUID id);
}
