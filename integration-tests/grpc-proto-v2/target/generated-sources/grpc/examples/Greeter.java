package examples;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: helloworld.proto")
public interface Greeter extends MutinyService {

    io.smallrye.mutiny.Uni<examples.HelloReply> sayHello(examples.HelloRequest request);
}
