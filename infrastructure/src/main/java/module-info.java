module InfrastructureModule {
    requires CoreModule;

    requires java.validation;
    requires io.micronaut.core;
//    requires commonModule;
//    requires io.micronaut.data.data_model;
//    requires reactor.core;
    requires jakarta.inject;
    requires org.slf4j;
    requires io.micronaut.inject;
//    requires io.micronaut.microstream.microstream;

    exports fete.bird.persistence;
}