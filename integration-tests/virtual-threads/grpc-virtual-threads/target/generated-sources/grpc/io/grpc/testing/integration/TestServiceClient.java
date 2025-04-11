package io.grpc.testing.integration;

import java.util.function.BiFunction;
import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: test.proto")
public class TestServiceClient implements TestService, MutinyClient<MutinyTestServiceGrpc.MutinyTestServiceStub> {

    private final MutinyTestServiceGrpc.MutinyTestServiceStub stub;

    public TestServiceClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyTestServiceGrpc.MutinyTestServiceStub, MutinyTestServiceGrpc.MutinyTestServiceStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinyTestServiceGrpc.newMutinyStub(channel));
    }

    private TestServiceClient(MutinyTestServiceGrpc.MutinyTestServiceStub stub) {
        this.stub = stub;
    }

    public TestServiceClient newInstanceWithStub(MutinyTestServiceGrpc.MutinyTestServiceStub stub) {
        return new TestServiceClient(stub);
    }

    @Override
    public MutinyTestServiceGrpc.MutinyTestServiceStub getStub() {
        return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.google.protobuf.EmptyProtos.Empty> emptyCall(com.google.protobuf.EmptyProtos.Empty request) {
        return stub.emptyCall(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.grpc.testing.integration.Messages.SimpleResponse> unaryCall(io.grpc.testing.integration.Messages.SimpleRequest request) {
        return stub.unaryCall(request);
    }

    @Override
    public io.smallrye.mutiny.Multi<io.grpc.testing.integration.Messages.StreamingOutputCallResponse> streamingOutputCall(io.grpc.testing.integration.Messages.StreamingOutputCallRequest request) {
        return stub.streamingOutputCall(request);
    }
}
