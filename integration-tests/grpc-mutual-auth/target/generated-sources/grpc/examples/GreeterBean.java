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
    public io.smallrye.mutiny.Uni<examples.HelloReply> sayHello(examples.HelloRequest request) {
        try {
            return delegate.sayHello(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<examples.HelloReply> sayHelloRoleAdmin(examples.HelloRequest request) {
        try {
            return delegate.sayHelloRoleAdmin(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<examples.HelloReply> sayHelloRoleUser(examples.HelloRequest request) {
        try {
            return delegate.sayHelloRoleUser(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
