package io.grpc.examples.streaming;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: streaming.proto")
public interface Streaming extends MutinyService {

    io.smallrye.mutiny.Multi<io.grpc.examples.streaming.Item> source(io.grpc.examples.streaming.Empty request);

    io.smallrye.mutiny.Uni<io.grpc.examples.streaming.Empty> sink(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.Item> request);

    io.smallrye.mutiny.Uni<io.grpc.examples.streaming.StringReply> quickStringStream(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringRequest> request);

    io.smallrye.mutiny.Uni<io.grpc.examples.streaming.StringReply> midStringStream(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringRequest> request);

    io.smallrye.mutiny.Multi<io.grpc.examples.streaming.Item> pipe(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.Item> request);

    io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringReply> quickStringBiDiStream(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringRequest> request);

    io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringReply> midStringBiDiStream(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringRequest> request);
}
