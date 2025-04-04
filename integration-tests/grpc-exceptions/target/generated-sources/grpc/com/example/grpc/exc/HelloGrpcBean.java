package com.example.grpc.exc;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: hello.proto")
public class HelloGrpcBean extends MutinyHelloGrpcGrpc.HelloGrpcImplBase implements BindableService, MutinyBean {

    private final HelloGrpc delegate;

    HelloGrpcBean(@GrpcService HelloGrpc delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.example.grpc.exc.HelloReply> sayHello(com.example.grpc.exc.HelloRequest request) {
        try {
            return delegate.sayHello(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
