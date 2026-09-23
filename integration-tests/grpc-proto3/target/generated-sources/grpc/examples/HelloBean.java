package examples;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: helloworld.proto")
public class HelloBean extends MutinyHelloGrpc.HelloImplBase implements BindableService, MutinyBean {

    private final Hello delegate;

    HelloBean(@GrpcService Hello delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<examples.HelloReply> sayHello(examples.HelloRequest request) {
        try {
            return delegate.sayHello(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
