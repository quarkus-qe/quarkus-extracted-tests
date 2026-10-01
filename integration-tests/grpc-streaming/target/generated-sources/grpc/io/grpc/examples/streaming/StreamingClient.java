package io.grpc.examples.streaming;

import java.util.function.BiFunction;
import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: streaming.proto")
public class StreamingClient implements Streaming, MutinyClient<MutinyStreamingGrpc.MutinyStreamingStub> {

    private final MutinyStreamingGrpc.MutinyStreamingStub stub;

    public StreamingClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyStreamingGrpc.MutinyStreamingStub, MutinyStreamingGrpc.MutinyStreamingStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinyStreamingGrpc.newMutinyStub(channel));
    }

    private StreamingClient(MutinyStreamingGrpc.MutinyStreamingStub stub) {
        this.stub = stub;
    }

    public StreamingClient newInstanceWithStub(MutinyStreamingGrpc.MutinyStreamingStub stub) {
        return new StreamingClient(stub);
    }

    @Override
    public MutinyStreamingGrpc.MutinyStreamingStub getStub() {
        return stub;
    }

    @Override
    public io.smallrye.mutiny.Multi<io.grpc.examples.streaming.Item> source(io.grpc.examples.streaming.Empty request) {
        return stub.source(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.grpc.examples.streaming.Empty> sink(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.Item> request) {
        return stub.sink(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.grpc.examples.streaming.StringReply> quickStringStream(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringRequest> request) {
        return stub.quickStringStream(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.grpc.examples.streaming.StringReply> midStringStream(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringRequest> request) {
        return stub.midStringStream(request);
    }

    @Override
    public io.smallrye.mutiny.Multi<io.grpc.examples.streaming.Item> pipe(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.Item> request) {
        return stub.pipe(request);
    }

    @Override
    public io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringReply> quickStringBiDiStream(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringRequest> request) {
        return stub.quickStringBiDiStream(request);
    }

    @Override
    public io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringReply> midStringBiDiStream(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringRequest> request) {
        return stub.midStringBiDiStream(request);
    }
}
