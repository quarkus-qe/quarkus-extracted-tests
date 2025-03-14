package com.test;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: my-proto.proto")
public class MyTestBean extends MutinyMyTestGrpc.MyTestImplBase implements BindableService, MutinyBean {

    private final MyTest delegate;

    MyTestBean(@GrpcService MyTest delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.test.MyProto.TextContainer> doTest(com.test.MyProto.TextContainer request) {
        try {
            return delegate.doTest(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
