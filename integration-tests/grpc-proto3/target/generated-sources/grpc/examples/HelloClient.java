package examples;

import java.util.function.BiFunction;
import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: helloworld.proto")
public class HelloClient implements Hello, MutinyClient<MutinyHelloGrpc.MutinyHelloStub> {

    private final MutinyHelloGrpc.MutinyHelloStub stub;

    public HelloClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyHelloGrpc.MutinyHelloStub, MutinyHelloGrpc.MutinyHelloStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinyHelloGrpc.newMutinyStub(channel));
    }

    private HelloClient(MutinyHelloGrpc.MutinyHelloStub stub) {
        this.stub = stub;
    }

    public HelloClient newInstanceWithStub(MutinyHelloGrpc.MutinyHelloStub stub) {
        return new HelloClient(stub);
    }

    @Override
    public MutinyHelloGrpc.MutinyHelloStub getStub() {
        return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<examples.HelloReply> sayHello(examples.HelloRequest request) {
        return stub.sayHello(request);
    }
}
