package io.grpc.testing.integration;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: test.proto")
public interface TestService extends MutinyService {

    /**
     * <pre>
     *  One empty request followed by one empty response.
     * </pre>
     */
    io.smallrye.mutiny.Uni<com.google.protobuf.EmptyProtos.Empty> emptyCall(com.google.protobuf.EmptyProtos.Empty request);

    /**
     * <pre>
     *  One request followed by one response.
     * </pre>
     */
    io.smallrye.mutiny.Uni<io.grpc.testing.integration.Messages.SimpleResponse> unaryCall(io.grpc.testing.integration.Messages.SimpleRequest request);

    /**
     * <pre>
     *  One request followed by a sequence of responses (streamed download).
     *  The server returns the payload with client desired type and sizes.
     * </pre>
     */
    io.smallrye.mutiny.Multi<io.grpc.testing.integration.Messages.StreamingOutputCallResponse> streamingOutputCall(io.grpc.testing.integration.Messages.StreamingOutputCallRequest request);
}
