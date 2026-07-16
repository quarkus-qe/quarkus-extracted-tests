package examples;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: saluter.proto")
public class SaluterBean extends MutinySaluterGrpc.SaluterImplBase implements BindableService, MutinyBean {

    private final Saluter delegate;

    SaluterBean(@GrpcService Saluter delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<examples.SaluteReply> bearer(examples.SaluteRequest request) {
        try {
            return delegate.bearer(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
