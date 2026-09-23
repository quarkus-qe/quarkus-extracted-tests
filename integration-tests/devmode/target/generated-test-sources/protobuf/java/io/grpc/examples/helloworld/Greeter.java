package io.grpc.examples.helloworld;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: helloworld.proto")
public interface Greeter extends MutinyService {

    /**
         * <pre>
         *  Sends a greeting
         * </pre>
         */
    io.smallrye.mutiny.Uni<io.grpc.examples.helloworld.HelloReply> sayHello(io.grpc.examples.helloworld.HelloRequest request);
    
    
    

}