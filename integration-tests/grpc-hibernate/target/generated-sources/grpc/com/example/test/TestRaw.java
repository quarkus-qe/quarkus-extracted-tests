package com.example.test;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: test.proto")
public interface TestRaw extends MutinyService {

    io.smallrye.mutiny.Uni<com.example.test.TestOuterClass.Empty> add(com.example.test.TestOuterClass.Item request);

    io.smallrye.mutiny.Uni<com.example.test.TestOuterClass.Empty> clear(com.example.test.TestOuterClass.Empty request);

    io.smallrye.mutiny.Multi<com.example.test.TestOuterClass.Item> getAll(com.example.test.TestOuterClass.Empty request);

    io.smallrye.mutiny.Multi<com.example.test.TestOuterClass.Item> bidi(io.smallrye.mutiny.Multi<com.example.test.TestOuterClass.Item> request);
}
