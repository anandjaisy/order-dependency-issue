module CoreModule {
    exports fete.bird.interfaces;
    exports fete.bird.entities;
    exports fete.bird.service;

    requires java.validation;
    requires io.micronaut.core;
//    requires commonModule;
//    requires io.micronaut.data.data_model;
//    requires reactor.core;
    requires jakarta.inject;
    requires org.slf4j;
    requires io.micronaut.inject;
}