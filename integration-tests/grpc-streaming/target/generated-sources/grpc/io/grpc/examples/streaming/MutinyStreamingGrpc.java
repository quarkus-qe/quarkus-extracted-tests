package io.grpc.examples.streaming;

import static io.grpc.examples.streaming.StreamingGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: streaming.proto")
public final class MutinyStreamingGrpc implements io.quarkus.grpc.MutinyGrpc {

    private MutinyStreamingGrpc() {
    }

    public static MutinyStreamingStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyStreamingStub(channel);
    }

    /**
     * <pre>
     *  Interface exported by the server.
     * </pre>
     */
    public static class MutinyStreamingStub extends io.grpc.stub.AbstractStub<MutinyStreamingStub> implements io.quarkus.grpc.MutinyStub {

        private StreamingGrpc.StreamingStub delegateStub;

        private MutinyStreamingStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = StreamingGrpc.newStub(channel);
        }

        private MutinyStreamingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = StreamingGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyStreamingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyStreamingStub(channel, callOptions);
        }

        public io.smallrye.mutiny.Multi<io.grpc.examples.streaming.Item> source(io.grpc.examples.streaming.Empty request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToMany(request, delegateStub::source);
        }

        public io.smallrye.mutiny.Uni<io.grpc.examples.streaming.Empty> sink(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.Item> request) {
            return io.quarkus.grpc.stubs.ClientCalls.manyToOne(request, delegateStub::sink);
        }

        public io.smallrye.mutiny.Uni<io.grpc.examples.streaming.StringReply> quickStringStream(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringRequest> request) {
            return io.quarkus.grpc.stubs.ClientCalls.manyToOne(request, delegateStub::quickStringStream);
        }

        public io.smallrye.mutiny.Uni<io.grpc.examples.streaming.StringReply> midStringStream(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringRequest> request) {
            return io.quarkus.grpc.stubs.ClientCalls.manyToOne(request, delegateStub::midStringStream);
        }

        public io.smallrye.mutiny.Multi<io.grpc.examples.streaming.Item> pipe(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.Item> request) {
            return io.quarkus.grpc.stubs.ClientCalls.manyToMany(request, delegateStub::pipe);
        }

        public io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringReply> quickStringBiDiStream(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringRequest> request) {
            return io.quarkus.grpc.stubs.ClientCalls.manyToMany(request, delegateStub::quickStringBiDiStream);
        }

        public io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringReply> midStringBiDiStream(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringRequest> request) {
            return io.quarkus.grpc.stubs.ClientCalls.manyToMany(request, delegateStub::midStringBiDiStream);
        }
    }

    /**
     * <pre>
     *  Interface exported by the server.
     * </pre>
     */
    public static abstract class StreamingImplBase implements io.grpc.BindableService {

        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public StreamingImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        public io.smallrye.mutiny.Multi<io.grpc.examples.streaming.Item> source(io.grpc.examples.streaming.Empty request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.grpc.examples.streaming.Empty> sink(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.Item> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.grpc.examples.streaming.StringReply> quickStringStream(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.grpc.examples.streaming.StringReply> midStringStream(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Multi<io.grpc.examples.streaming.Item> pipe(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.Item> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringReply> quickStringBiDiStream(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringReply> midStringBiDiStream(io.smallrye.mutiny.Multi<io.grpc.examples.streaming.StringRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(io.grpc.examples.streaming.StreamingGrpc.getSourceMethod(), asyncServerStreamingCall(new MethodHandlers<io.grpc.examples.streaming.Empty, io.grpc.examples.streaming.Item>(this, METHODID_SOURCE, compression))).addMethod(io.grpc.examples.streaming.StreamingGrpc.getSinkMethod(), asyncClientStreamingCall(new MethodHandlers<io.grpc.examples.streaming.Item, io.grpc.examples.streaming.Empty>(this, METHODID_SINK, compression))).addMethod(io.grpc.examples.streaming.StreamingGrpc.getPipeMethod(), asyncBidiStreamingCall(new MethodHandlers<io.grpc.examples.streaming.Item, io.grpc.examples.streaming.Item>(this, METHODID_PIPE, compression))).addMethod(io.grpc.examples.streaming.StreamingGrpc.getQuickStringStreamMethod(), asyncClientStreamingCall(new MethodHandlers<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply>(this, METHODID_QUICK_STRING_STREAM, compression))).addMethod(io.grpc.examples.streaming.StreamingGrpc.getMidStringStreamMethod(), asyncClientStreamingCall(new MethodHandlers<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply>(this, METHODID_MID_STRING_STREAM, compression))).addMethod(io.grpc.examples.streaming.StreamingGrpc.getQuickStringBiDiStreamMethod(), asyncBidiStreamingCall(new MethodHandlers<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply>(this, METHODID_QUICK_STRING_BI_DI_STREAM, compression))).addMethod(io.grpc.examples.streaming.StreamingGrpc.getMidStringBiDiStreamMethod(), asyncBidiStreamingCall(new MethodHandlers<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply>(this, METHODID_MID_STRING_BI_DI_STREAM, compression))).build();
        }
    }

    private static final int METHODID_SOURCE = 0;

    private static final int METHODID_SINK = 1;

    private static final int METHODID_PIPE = 2;

    private static final int METHODID_QUICK_STRING_STREAM = 3;

    private static final int METHODID_MID_STRING_STREAM = 4;

    private static final int METHODID_QUICK_STRING_BI_DI_STREAM = 5;

    private static final int METHODID_MID_STRING_BI_DI_STREAM = 6;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final StreamingImplBase serviceImpl;

        private final int methodId;

        private final String compression;

        MethodHandlers(StreamingImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_SOURCE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToMany((io.grpc.examples.streaming.Empty) request, (io.grpc.stub.StreamObserver<io.grpc.examples.streaming.Item>) responseObserver, compression, serviceImpl::source);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_SINK:
                    return (io.grpc.stub.StreamObserver<Req>) io.quarkus.grpc.stubs.ServerCalls.manyToOne((io.grpc.stub.StreamObserver<io.grpc.examples.streaming.Empty>) responseObserver, serviceImpl::sink);
                case METHODID_PIPE:
                    return (io.grpc.stub.StreamObserver<Req>) io.quarkus.grpc.stubs.ServerCalls.manyToMany((io.grpc.stub.StreamObserver<io.grpc.examples.streaming.Item>) responseObserver, serviceImpl::pipe);
                case METHODID_QUICK_STRING_STREAM:
                    return (io.grpc.stub.StreamObserver<Req>) io.quarkus.grpc.stubs.ServerCalls.manyToOne((io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringReply>) responseObserver, serviceImpl::quickStringStream);
                case METHODID_MID_STRING_STREAM:
                    return (io.grpc.stub.StreamObserver<Req>) io.quarkus.grpc.stubs.ServerCalls.manyToOne((io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringReply>) responseObserver, serviceImpl::midStringStream);
                case METHODID_QUICK_STRING_BI_DI_STREAM:
                    return (io.grpc.stub.StreamObserver<Req>) io.quarkus.grpc.stubs.ServerCalls.manyToMany((io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringReply>) responseObserver, serviceImpl::quickStringBiDiStream);
                case METHODID_MID_STRING_BI_DI_STREAM:
                    return (io.grpc.stub.StreamObserver<Req>) io.quarkus.grpc.stubs.ServerCalls.manyToMany((io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringReply>) responseObserver, serviceImpl::midStringBiDiStream);
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }
}
