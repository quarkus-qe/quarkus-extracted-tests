package org.acme;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: hello.proto")
public interface HelloGrpc extends MutinyService {

    io.smallrye.mutiny.Uni<org.acme.HelloReply> sayHello(org.acme.HelloRequest request);
}
