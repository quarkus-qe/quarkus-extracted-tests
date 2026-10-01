package examples;

import java.util.function.BiFunction;
import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: helloworld.proto")
public class CopycatClient implements Copycat, MutinyClient<MutinyCopycatGrpc.MutinyCopycatStub> {

    private final MutinyCopycatGrpc.MutinyCopycatStub stub;

    public CopycatClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyCopycatGrpc.MutinyCopycatStub, MutinyCopycatGrpc.MutinyCopycatStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinyCopycatGrpc.newMutinyStub(channel));
    }

    private CopycatClient(MutinyCopycatGrpc.MutinyCopycatStub stub) {
        this.stub = stub;
    }

    public CopycatClient newInstanceWithStub(MutinyCopycatGrpc.MutinyCopycatStub stub) {
        return new CopycatClient(stub);
    }

    @Override
    public MutinyCopycatGrpc.MutinyCopycatStub getStub() {
        return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<examples.HelloReply> sayCat(examples.HelloRequest request) {
        return stub.sayCat(request);
    }

    @Override
    public io.smallrye.mutiny.Multi<examples.HelloReply> multiCat(io.smallrye.mutiny.Multi<examples.HelloRequest> request) {
        return stub.multiCat(request);
    }
}
