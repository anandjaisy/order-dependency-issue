package fete.bird.api;

import fete.bird.BaseController;
import fete.bird.interfaces.IOrderService;
import fete.bird.model.order.OrderDto;
import fete.bird.model.product.ProductDto;
import fete.bird.model.product.ProductFilterDto;
import fete.bird.operation.IOrderOperation;
import fete.bird.utils.IServiceBus;
import fete.bird.validation.ValidObjectId;
import io.micronaut.http.MutableHttpResponse;
import io.micronaut.http.annotation.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Controller("/order")
public class OrderController extends BaseController implements IOrderOperation {
    private static final Logger LOG = LoggerFactory.getLogger(OrderController.class);
    private final IOrderService iOrderService;
    public OrderController(IServiceBus iServiceBus, IOrderService iOrderService) {
        super(iServiceBus);
        this.iOrderService = iOrderService;
    }

    @Override
    public Flux<?> freeTextSearch(String text) {
        return null;
    }

    @Override
    public Mono<?> find(ProductFilterDto searchCriteria) {
        return null;
    }

    @Override
    public Mono<?> findById(@NotNull @ValidObjectId UUID id) {
        return Mono.just(iOrderService.findbyId(id));
    }

    @Override
    public Mono<MutableHttpResponse<?>> post(@Valid OrderDto model) {
        return null;
    }

    @Override
    public Mono<MutableHttpResponse<?>> patch(@NotNull @ValidObjectId String id, @Valid ProductDto model) {
        return null;
    }

    @Override
    public Mono<MutableHttpResponse<?>> deleteOrder(@ValidObjectId @NotNull String categoryId, @ValidObjectId @NotNull String id) {
        return null;
    }
}
