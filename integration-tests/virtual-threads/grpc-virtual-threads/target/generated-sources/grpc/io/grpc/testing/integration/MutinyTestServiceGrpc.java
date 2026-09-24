package io.grpc.testing.integration;

import static io.grpc.testing.integration.TestServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: test.proto")
public final class MutinyTestServiceGrpc implements io.quarkus.grpc.MutinyGrpc {

    private MutinyTestServiceGrpc() {
    }

    public static MutinyTestServiceStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyTestServiceStub(channel);
    }

    public static class MutinyTestServiceStub extends io.grpc.stub.AbstractStub<MutinyTestServiceStub> implements io.quarkus.grpc.MutinyStub {

        private TestServiceGrpc.TestServiceStub delegateStub;

        private MutinyTestServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = TestServiceGrpc.newStub(channel);
        }

        private MutinyTestServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = TestServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyTestServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyTestServiceStub(channel, callOptions);
        }

        /**
         * <pre>
         *  One empty request followed by one empty response.
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.google.protobuf.EmptyProtos.Empty> emptyCall(com.google.protobuf.EmptyProtos.Empty request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::emptyCall);
        }

        /**
         * <pre>
         *  One request followed by one response.
         * </pre>
         */
        public io.smallrye.mutiny.Uni<io.grpc.testing.integration.Messages.SimpleResponse> unaryCall(io.grpc.testing.integration.Messages.SimpleRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::unaryCall);
        }

        /**
         * <pre>
         *  One request followed by a sequence of responses (streamed download).
         *  The server returns the payload with client desired type and sizes.
         * </pre>
         */
        public io.smallrye.mutiny.Multi<io.grpc.testing.integration.Messages.StreamingOutputCallResponse> streamingOutputCall(io.grpc.testing.integration.Messages.StreamingOutputCallRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToMany(request, delegateStub::streamingOutputCall);
        }
    }

    public static abstract class TestServiceImplBase implements io.grpc.BindableService {

        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public TestServiceImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        /**
         * <pre>
         *  One empty request followed by one empty response.
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.google.protobuf.EmptyProtos.Empty> emptyCall(com.google.protobuf.EmptyProtos.Empty request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  One request followed by one response.
         * </pre>
         */
        public io.smallrye.mutiny.Uni<io.grpc.testing.integration.Messages.SimpleResponse> unaryCall(io.grpc.testing.integration.Messages.SimpleRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  One request followed by a sequence of responses (streamed download).
         *  The server returns the payload with client desired type and sizes.
         * </pre>
         */
        public io.smallrye.mutiny.Multi<io.grpc.testing.integration.Messages.StreamingOutputCallResponse> streamingOutputCall(io.grpc.testing.integration.Messages.StreamingOutputCallRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(io.grpc.testing.integration.TestServiceGrpc.getEmptyCallMethod(), asyncUnaryCall(new MethodHandlers<com.google.protobuf.EmptyProtos.Empty, com.google.protobuf.EmptyProtos.Empty>(this, METHODID_EMPTY_CALL, compression))).addMethod(io.grpc.testing.integration.TestServiceGrpc.getUnaryCallMethod(), asyncUnaryCall(new MethodHandlers<io.grpc.testing.integration.Messages.SimpleRequest, io.grpc.testing.integration.Messages.SimpleResponse>(this, METHODID_UNARY_CALL, compression))).addMethod(io.grpc.testing.integration.TestServiceGrpc.getStreamingOutputCallMethod(), asyncServerStreamingCall(new MethodHandlers<io.grpc.testing.integration.Messages.StreamingOutputCallRequest, io.grpc.testing.integration.Messages.StreamingOutputCallResponse>(this, METHODID_STREAMING_OUTPUT_CALL, compression))).build();
        }
    }

    private static final int METHODID_EMPTY_CALL = 0;

    private static final int METHODID_UNARY_CALL = 1;

    private static final int METHODID_STREAMING_OUTPUT_CALL = 2;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final TestServiceImplBase serviceImpl;

        private final int methodId;

        private final String compression;

        MethodHandlers(TestServiceImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_EMPTY_CALL:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.google.protobuf.EmptyProtos.Empty) request, (io.grpc.stub.StreamObserver<com.google.protobuf.EmptyProtos.Empty>) responseObserver, compression, serviceImpl::emptyCall);
                    break;
                case METHODID_UNARY_CALL:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.grpc.testing.integration.Messages.SimpleRequest) request, (io.grpc.stub.StreamObserver<io.grpc.testing.integration.Messages.SimpleResponse>) responseObserver, compression, serviceImpl::unaryCall);
                    break;
                case METHODID_STREAMING_OUTPUT_CALL:
                    io.quarkus.grpc.stubs.ServerCalls.oneToMany((io.grpc.testing.integration.Messages.StreamingOutputCallRequest) request, (io.grpc.stub.StreamObserver<io.grpc.testing.integration.Messages.StreamingOutputCallResponse>) responseObserver, compression, serviceImpl::streamingOutputCall);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }
}
