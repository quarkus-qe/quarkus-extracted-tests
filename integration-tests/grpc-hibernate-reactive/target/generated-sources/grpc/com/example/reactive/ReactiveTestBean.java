package com.example.reactive;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: test.proto")
public class ReactiveTestBean extends MutinyReactiveTestGrpc.ReactiveTestImplBase implements BindableService, MutinyBean {

    private final ReactiveTest delegate;

    ReactiveTestBean(@GrpcService ReactiveTest delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.example.reactive.Test.Empty> add(com.example.reactive.Test.Item request) {
        try {
            return delegate.add(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Multi<com.example.reactive.Test.Item> watch(com.example.reactive.Test.Empty request) {
        try {
            return delegate.watch(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
