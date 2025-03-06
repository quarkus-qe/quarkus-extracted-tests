package com.test;

import java.util.function.BiFunction;
import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: my-proto.proto")
public class MyTestClient implements MyTest, MutinyClient<MutinyMyTestGrpc.MutinyMyTestStub> {

    private final MutinyMyTestGrpc.MutinyMyTestStub stub;

    public MyTestClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyMyTestGrpc.MutinyMyTestStub, MutinyMyTestGrpc.MutinyMyTestStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinyMyTestGrpc.newMutinyStub(channel));
    }

    private MyTestClient(MutinyMyTestGrpc.MutinyMyTestStub stub) {
        this.stub = stub;
    }

    public MyTestClient newInstanceWithStub(MutinyMyTestGrpc.MutinyMyTestStub stub) {
        return new MyTestClient(stub);
    }

    @Override
    public MutinyMyTestGrpc.MutinyMyTestStub getStub() {
        return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.test.MyProto.TextContainer> doTest(com.test.MyProto.TextContainer request) {
        return stub.doTest(request);
    }
}
