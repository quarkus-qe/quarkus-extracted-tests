package com.example.test;

import java.util.function.BiFunction;
import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: test.proto")
public class TestRawClient implements TestRaw, MutinyClient<MutinyTestRawGrpc.MutinyTestRawStub> {

    private final MutinyTestRawGrpc.MutinyTestRawStub stub;

    public TestRawClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyTestRawGrpc.MutinyTestRawStub, MutinyTestRawGrpc.MutinyTestRawStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinyTestRawGrpc.newMutinyStub(channel));
    }

    private TestRawClient(MutinyTestRawGrpc.MutinyTestRawStub stub) {
        this.stub = stub;
    }

    public TestRawClient newInstanceWithStub(MutinyTestRawGrpc.MutinyTestRawStub stub) {
        return new TestRawClient(stub);
    }

    @Override
    public MutinyTestRawGrpc.MutinyTestRawStub getStub() {
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
