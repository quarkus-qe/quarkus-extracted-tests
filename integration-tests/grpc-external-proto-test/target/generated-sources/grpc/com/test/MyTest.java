package com.test;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: dir/my-proto.proto")
public interface MyTest extends MutinyService {

    io.smallrye.mutiny.Uni<com.test.MyProto.TextContainer> doTest(com.test.MyProto.TextContainer request);
}
