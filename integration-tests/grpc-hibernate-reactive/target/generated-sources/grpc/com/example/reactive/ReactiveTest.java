package com.example.reactive;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: test.proto")
public interface ReactiveTest extends MutinyService {

    io.smallrye.mutiny.Uni<com.example.reactive.Test.Empty> add(com.example.reactive.Test.Item request);

    io.smallrye.mutiny.Multi<com.example.reactive.Test.Item> watch(com.example.reactive.Test.Empty request);
}
