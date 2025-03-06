package com.example.grpc.exc;

import java.util.function.BiFunction;
import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: hello.proto")
public class LegacyHelloGrpcClient implements LegacyHelloGrpc, MutinyClient<MutinyLegacyHelloGrpcGrpc.MutinyLegacyHelloGrpcStub> {

    private final MutinyLegacyHelloGrpcGrpc.MutinyLegacyHelloGrpcStub stub;

    public LegacyHelloGrpcClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyLegacyHelloGrpcGrpc.MutinyLegacyHelloGrpcStub, MutinyLegacyHelloGrpcGrpc.MutinyLegacyHelloGrpcStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinyLegacyHelloGrpcGrpc.newMutinyStub(channel));
    }

    private LegacyHelloGrpcClient(MutinyLegacyHelloGrpcGrpc.MutinyLegacyHelloGrpcStub stub) {
        this.stub = stub;
    }

    public LegacyHelloGrpcClient newInstanceWithStub(MutinyLegacyHelloGrpcGrpc.MutinyLegacyHelloGrpcStub stub) {
        return new LegacyHelloGrpcClient(stub);
    }

    @Override
    public MutinyLegacyHelloGrpcGrpc.MutinyLegacyHelloGrpcStub getStub() {
        return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.example.grpc.exc.HelloReply> legacySayHello(com.example.grpc.exc.HelloRequest request) {
        return stub.legacySayHello(request);
    }
}
