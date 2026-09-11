package com.example.test;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: test.proto")
public class TestBean extends MutinyTestGrpc.TestImplBase implements BindableService, MutinyBean {

    private final Test delegate;

    TestBean(@GrpcService Test delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.example.test.TestOuterClass.Empty> add(com.example.test.TestOuterClass.Item request) {
        try {
            return delegate.add(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.example.test.TestOuterClass.Empty> clear(com.example.test.TestOuterClass.Empty request) {
        try {
            return delegate.clear(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Multi<com.example.test.TestOuterClass.Item> getAll(com.example.test.TestOuterClass.Empty request) {
        try {
            return delegate.getAll(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Multi<com.example.test.TestOuterClass.Item> bidi(io.smallrye.mutiny.Multi<com.example.test.TestOuterClass.Item> request) {
        try {
            return delegate.bidi(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
