package examples;

import java.util.function.BiFunction;
import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: saluter.proto")
public class SaluterClient implements Saluter, MutinyClient<MutinySaluterGrpc.MutinySaluterStub> {

    private final MutinySaluterGrpc.MutinySaluterStub stub;

    public SaluterClient(String name, io.grpc.Channel channel, BiFunction<String, MutinySaluterGrpc.MutinySaluterStub, MutinySaluterGrpc.MutinySaluterStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinySaluterGrpc.newMutinyStub(channel));
    }

    private SaluterClient(MutinySaluterGrpc.MutinySaluterStub stub) {
        this.stub = stub;
    }

    public SaluterClient newInstanceWithStub(MutinySaluterGrpc.MutinySaluterStub stub) {
        return new SaluterClient(stub);
    }

    @Override
    public MutinySaluterGrpc.MutinySaluterStub getStub() {
        return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<examples.SaluteReply> bearer(examples.SaluteRequest request) {
        return stub.bearer(request);
    }
}
