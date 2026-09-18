package com.example.reactive;

import java.util.function.BiFunction;
import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: test.proto")
public class ReactiveTestClient implements ReactiveTest, MutinyClient<MutinyReactiveTestGrpc.MutinyReactiveTestStub> {

    private final MutinyReactiveTestGrpc.MutinyReactiveTestStub stub;

    public ReactiveTestClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyReactiveTestGrpc.MutinyReactiveTestStub, MutinyReactiveTestGrpc.MutinyReactiveTestStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinyReactiveTestGrpc.newMutinyStub(channel));
    }

    private ReactiveTestClient(MutinyReactiveTestGrpc.MutinyReactiveTestStub stub) {
        this.stub = stub;
    }

    public ReactiveTestClient newInstanceWithStub(MutinyReactiveTestGrpc.MutinyReactiveTestStub stub) {
        return new ReactiveTestClient(stub);
    }

    @Override
    public MutinyReactiveTestGrpc.MutinyReactiveTestStub getStub() {
        return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.example.reactive.Test.Empty> add(com.example.reactive.Test.Item request) {
        return stub.add(request);
    }

    @Override
    public io.smallrye.mutiny.Multi<com.example.reactive.Test.Item> watch(com.example.reactive.Test.Empty request) {
        return stub.watch(request);
    }
}
