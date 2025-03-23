package com.test;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: proto-with-java_generic_services.proto")
public class MyJavaGenericServicesTestBean extends MutinyMyJavaGenericServicesTestGrpc.MyJavaGenericServicesTestImplBase implements BindableService, MutinyBean {

    private final MyJavaGenericServicesTest delegate;

    MyJavaGenericServicesTestBean(@GrpcService MyJavaGenericServicesTest delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.test.ProtoWithJavaGenericServices.JavaGenericServices> doTest(com.test.ProtoWithJavaGenericServices.JavaGenericServices request) {
        try {
            return delegate.doTest(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
