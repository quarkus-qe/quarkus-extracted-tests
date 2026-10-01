package io.quarkus.it.opentelemetry.grpc;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: hello.proto")
public class GreeterBean extends MutinyGreeterGrpc.GreeterImplBase implements BindableService, MutinyBean {

    private final Greeter delegate;

    GreeterBean(@GrpcService Greeter delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<io.quarkus.it.opentelemetry.grpc.HelloReply> sayHello(io.quarkus.it.opentelemetry.grpc.HelloRequest request) {
        try {
            return delegate.sayHello(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
