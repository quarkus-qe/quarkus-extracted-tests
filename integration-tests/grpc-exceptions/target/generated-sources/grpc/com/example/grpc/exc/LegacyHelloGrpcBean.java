package com.example.grpc.exc;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: hello.proto")
public class LegacyHelloGrpcBean extends MutinyLegacyHelloGrpcGrpc.LegacyHelloGrpcImplBase implements BindableService, MutinyBean {

    private final LegacyHelloGrpc delegate;

    LegacyHelloGrpcBean(@GrpcService LegacyHelloGrpc delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.example.grpc.exc.HelloReply> legacySayHello(com.example.grpc.exc.HelloRequest request) {
        try {
            return delegate.legacySayHello(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
