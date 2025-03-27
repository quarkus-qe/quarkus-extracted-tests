package examples;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: helloworld.proto")
public class CopycatBean extends MutinyCopycatGrpc.CopycatImplBase implements BindableService, MutinyBean {

    private final Copycat delegate;

    CopycatBean(@GrpcService Copycat delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<examples.HelloReply> sayCat(examples.HelloRequest request) {
        try {
            return delegate.sayCat(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Multi<examples.HelloReply> multiCat(io.smallrye.mutiny.Multi<examples.HelloRequest> request) {
        try {
            return delegate.multiCat(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
