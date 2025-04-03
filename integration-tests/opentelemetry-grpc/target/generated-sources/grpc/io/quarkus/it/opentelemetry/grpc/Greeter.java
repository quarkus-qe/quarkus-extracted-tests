package io.quarkus.it.opentelemetry.grpc;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: hello.proto")
public interface Greeter extends MutinyService {

    /**
     * <pre>
     *  Sends a greeting
     * </pre>
     */
    io.smallrye.mutiny.Uni<io.quarkus.it.opentelemetry.grpc.HelloReply> sayHello(io.quarkus.it.opentelemetry.grpc.HelloRequest request);
}
