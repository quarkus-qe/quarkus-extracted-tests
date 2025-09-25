package io.grpc.examples.streaming;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: streaming.proto")
public class StreamingBean extends MutinyStreamingGrpc.StreamingImplBase implements BindableService, MutinyBean {

    private final Streaming delegate;

    StreamingBean(@GrpcService Streaming delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Multi<io.grpc.examples.streaming.Item> source(io.grpc.examples.streaming.Empty request) {
        try {
            return delegate.source(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.grpc.examples.streaming.Empty> sink(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.Item> request) {
        try {
            return delegate.sink(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.grpc.examples.streaming.StringReply> quickStringStream(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringRequest> request) {
        try {
            return delegate.quickStringStream(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.grpc.examples.streaming.StringReply> midStringStream(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringRequest> request) {
        try {
            return delegate.midStringStream(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Multi<io.grpc.examples.streaming.Item> pipe(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.Item> request) {
        try {
            return delegate.pipe(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringReply> quickStringBiDiStream(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringRequest> request) {
        try {
            return delegate.quickStringBiDiStream(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringReply> midStringBiDiStream(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringRequest> request) {
        try {
            return delegate.midStringBiDiStream(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
