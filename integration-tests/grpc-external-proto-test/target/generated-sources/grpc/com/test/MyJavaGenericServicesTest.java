package com.test;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: dir/proto-with-java_generic_services.proto")
public interface MyJavaGenericServicesTest extends MutinyService {

    io.smallrye.mutiny.Uni<com.test.ProtoWithJavaGenericServices.JavaGenericServices> doTest(com.test.ProtoWithJavaGenericServices.JavaGenericServices request);
}
