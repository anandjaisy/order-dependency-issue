package fete.bird.api;

import fete.bird.interfaces.IOrderService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.annotation.security.PermitAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Controller("/order")
public class OrderController {
    private static final Logger LOG = LoggerFactory.getLogger(OrderController.class);
    private final IOrderService iOrderService;
    public OrderController(IOrderService iOrderService) {
        this.iOrderService = iOrderService;
    }

//    @Get
//    @PermitAll
//    public Flux<?> freeTextSearch(String text) {
//        return null;
//    }

//    @Override
//    public Mono<?> find(ProductFilterDto searchCriteria) {
//        return null;
//    }

    @Get("{id}")
    @PermitAll
    public Mono<?> findById(@NotNull UUID id) {
        return Mono.just(iOrderService.findbyId(id));
    }

//    @Override
//    public Mono<MutableHttpResponse<?>> post(@Valid OrderDto model) {
//        return null;
//    }
//
//    @Override
//    public Mono<MutableHttpResponse<?>> patch(@NotNull @ValidObjectId String id, @Valid ProductDto model) {
//        return null;
//    }

//    @Override
//    public Mono<MutableHttpResponse<?>> deleteOrder(@ValidObjectId @NotNull String categoryId, @ValidObjectId @NotNull String id) {
//        return null;
//    }
}
