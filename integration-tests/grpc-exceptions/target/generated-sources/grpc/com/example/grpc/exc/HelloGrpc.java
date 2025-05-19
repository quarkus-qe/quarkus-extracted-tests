package com.example.grpc.exc;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: hello.proto")
public interface HelloGrpc extends MutinyService {

    io.smallrye.mutiny.Uni<com.example.grpc.exc.HelloReply> sayHello(com.example.grpc.exc.HelloRequest request);
}
