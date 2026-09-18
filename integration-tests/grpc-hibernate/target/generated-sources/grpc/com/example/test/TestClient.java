package com.example.test;

import java.util.function.BiFunction;
import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: test.proto")
public class TestClient implements Test, MutinyClient<MutinyTestGrpc.MutinyTestStub> {

    private final MutinyTestGrpc.MutinyTestStub stub;

    public TestClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyTestGrpc.MutinyTestStub, MutinyTestGrpc.MutinyTestStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinyTestGrpc.newMutinyStub(channel));
    }

    private TestClient(MutinyTestGrpc.MutinyTestStub stub) {
        this.stub = stub;
    }

    public TestClient newInstanceWithStub(MutinyTestGrpc.MutinyTestStub stub) {
        return new TestClient(stub);
    }

    @Override
    public MutinyTestGrpc.MutinyTestStub getStub() {
        return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.example.test.TestOuterClass.Empty> add(com.example.test.TestOuterClass.Item request) {
        return stub.add(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.example.test.TestOuterClass.Empty> clear(com.example.test.TestOuterClass.Empty request) {
        return stub.clear(request);
    }

    @Override
    public io.smallrye.mutiny.Multi<com.example.test.TestOuterClass.Item> getAll(com.example.test.TestOuterClass.Empty request) {
        return stub.getAll(request);
    }

    @Override
    public io.smallrye.mutiny.Multi<com.example.test.TestOuterClass.Item> bidi(io.smallrye.mutiny.Multi<com.example.test.TestOuterClass.Item> request) {
        return stub.bidi(request);
    }
}
