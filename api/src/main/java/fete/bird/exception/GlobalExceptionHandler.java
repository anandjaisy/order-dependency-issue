package fete.bird.exception;

import io.micronaut.context.annotation.Requires;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.server.exceptions.ExceptionHandler;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
@Produces
@Singleton
@Requires(classes = {GlobalException.class, ExceptionHandler.class})
public class GlobalExceptionHandler implements ExceptionHandler<GlobalException, HttpResponse> {
    private static final Logger LOG = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @Override
    public HttpResponse handle(HttpRequest request, GlobalException exception) {
        var causeMessage = exception.getMessage();
        LOG.error(exception.getLocalizedMessage());
        LOG.error(causeMessage);
        Arrays.stream(exception.getStackTrace()).forEach(item -> LOG.error(item.toString()));
        return HttpResponse.serverError(exception.getLocalizedMessage());
    }
}
