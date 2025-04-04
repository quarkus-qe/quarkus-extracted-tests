package examples;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: helloworld.proto")
public class GreeterBean extends MutinyGreeterGrpc.GreeterImplBase implements BindableService, MutinyBean {

    private final Greeter delegate;

    GreeterBean(@GrpcService Greeter delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<examples.HelloReply> sayHelloTester(examples.HelloRequest request) {
        try {
            return delegate.sayHelloTester(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<examples.HelloReply> sayHelloAdmin(examples.HelloRequest request) {
        try {
            return delegate.sayHelloAdmin(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
