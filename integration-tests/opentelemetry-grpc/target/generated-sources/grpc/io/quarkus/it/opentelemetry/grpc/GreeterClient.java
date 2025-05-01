package io.quarkus.it.opentelemetry.grpc;

import java.util.function.BiFunction;
import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: hello.proto")
public class GreeterClient implements Greeter, MutinyClient<MutinyGreeterGrpc.MutinyGreeterStub> {

    private final MutinyGreeterGrpc.MutinyGreeterStub stub;

    public GreeterClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyGreeterGrpc.MutinyGreeterStub, MutinyGreeterGrpc.MutinyGreeterStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinyGreeterGrpc.newMutinyStub(channel));
    }

    private GreeterClient(MutinyGreeterGrpc.MutinyGreeterStub stub) {
        this.stub = stub;
    }

    public GreeterClient newInstanceWithStub(MutinyGreeterGrpc.MutinyGreeterStub stub) {
        return new GreeterClient(stub);
    }

    @Override
    public MutinyGreeterGrpc.MutinyGreeterStub getStub() {
        return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<io.quarkus.it.opentelemetry.grpc.HelloReply> sayHello(io.quarkus.it.opentelemetry.grpc.HelloRequest request) {
        return stub.sayHello(request);
    }
}
