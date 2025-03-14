package com.test;

import java.util.function.BiFunction;
import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: proto-with-java_generic_services.proto")
public class MyJavaGenericServicesTestClient implements MyJavaGenericServicesTest, MutinyClient<MutinyMyJavaGenericServicesTestGrpc.MutinyMyJavaGenericServicesTestStub> {

    private final MutinyMyJavaGenericServicesTestGrpc.MutinyMyJavaGenericServicesTestStub stub;

    public MyJavaGenericServicesTestClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyMyJavaGenericServicesTestGrpc.MutinyMyJavaGenericServicesTestStub, MutinyMyJavaGenericServicesTestGrpc.MutinyMyJavaGenericServicesTestStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinyMyJavaGenericServicesTestGrpc.newMutinyStub(channel));
    }

    private MyJavaGenericServicesTestClient(MutinyMyJavaGenericServicesTestGrpc.MutinyMyJavaGenericServicesTestStub stub) {
        this.stub = stub;
    }

    public MyJavaGenericServicesTestClient newInstanceWithStub(MutinyMyJavaGenericServicesTestGrpc.MutinyMyJavaGenericServicesTestStub stub) {
        return new MyJavaGenericServicesTestClient(stub);
    }

    @Override
    public MutinyMyJavaGenericServicesTestGrpc.MutinyMyJavaGenericServicesTestStub getStub() {
        return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.test.ProtoWithJavaGenericServices.JavaGenericServices> doTest(com.test.ProtoWithJavaGenericServices.JavaGenericServices request) {
        return stub.doTest(request);
    }
}
