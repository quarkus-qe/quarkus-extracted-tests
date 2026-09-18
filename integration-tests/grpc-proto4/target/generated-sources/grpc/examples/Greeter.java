package examples;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: greeter.proto")
public interface Greeter extends MutinyService {

    io.smallrye.mutiny.Uni<examples.GpReply> greet(examples.GpRequest request);
}
