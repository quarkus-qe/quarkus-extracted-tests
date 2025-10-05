package com.example.test;

import static com.example.test.TestRawGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: test.proto")
public final class MutinyTestRawGrpc implements io.quarkus.grpc.MutinyGrpc {

    private MutinyTestRawGrpc() {
    }

    public static MutinyTestRawStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyTestRawStub(channel);
    }

    public static class MutinyTestRawStub extends io.grpc.stub.AbstractStub<MutinyTestRawStub> implements io.quarkus.grpc.MutinyStub {

        private TestRawGrpc.TestRawStub delegateStub;

        private MutinyTestRawStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = TestRawGrpc.newStub(channel);
        }

        private MutinyTestRawStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = TestRawGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyTestRawStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyTestRawStub(channel, callOptions);
        }

        public io.smallrye.mutiny.Uni<com.example.test.TestOuterClass.Empty> add(com.example.test.TestOuterClass.Item request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::add);
        }

        public io.smallrye.mutiny.Uni<com.example.test.TestOuterClass.Empty> clear(com.example.test.TestOuterClass.Empty request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::clear);
        }

        public io.smallrye.mutiny.Multi<com.example.test.TestOuterClass.Item> getAll(com.example.test.TestOuterClass.Empty request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToMany(request, delegateStub::getAll);
        }

        public io.smallrye.mutiny.Multi<com.example.test.TestOuterClass.Item> bidi(io.smallrye.mutiny.Multi<com.example.test.TestOuterClass.Item> request) {
            return io.quarkus.grpc.stubs.ClientCalls.manyToMany(request, delegateStub::bidi);
        }
    }

    public static abstract class TestRawImplBase implements io.grpc.BindableService {

        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public TestRawImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        public io.smallrye.mutiny.Uni<com.example.test.TestOuterClass.Empty> add(com.example.test.TestOuterClass.Item request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<com.example.test.TestOuterClass.Empty> clear(com.example.test.TestOuterClass.Empty request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Multi<com.example.test.TestOuterClass.Item> getAll(com.example.test.TestOuterClass.Empty request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Multi<com.example.test.TestOuterClass.Item> bidi(io.smallrye.mutiny.Multi<com.example.test.TestOuterClass.Item> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(com.example.test.TestRawGrpc.getAddMethod(), asyncUnaryCall(new MethodHandlers<com.example.test.TestOuterClass.Item, com.example.test.TestOuterClass.Empty>(this, METHODID_ADD, compression))).addMethod(com.example.test.TestRawGrpc.getGetAllMethod(), asyncServerStreamingCall(new MethodHandlers<com.example.test.TestOuterClass.Empty, com.example.test.TestOuterClass.Item>(this, METHODID_GET_ALL, compression))).addMethod(com.example.test.TestRawGrpc.getClearMethod(), asyncUnaryCall(new MethodHandlers<com.example.test.TestOuterClass.Empty, com.example.test.TestOuterClass.Empty>(this, METHODID_CLEAR, compression))).addMethod(com.example.test.TestRawGrpc.getBidiMethod(), asyncBidiStreamingCall(new MethodHandlers<com.example.test.TestOuterClass.Item, com.example.test.TestOuterClass.Item>(this, METHODID_BIDI, compression))).build();
        }
    }

    private static final int METHODID_ADD = 0;

    private static final int METHODID_GET_ALL = 1;

    private static final int METHODID_CLEAR = 2;

    private static final int METHODID_BIDI = 3;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final TestRawImplBase serviceImpl;

        private final int methodId;

        private final String compression;

        MethodHandlers(TestRawImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_ADD:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.example.test.TestOuterClass.Item) request, (io.grpc.stub.StreamObserver<com.example.test.TestOuterClass.Empty>) responseObserver, compression, serviceImpl::add);
                    break;
                case METHODID_GET_ALL:
                    io.quarkus.grpc.stubs.ServerCalls.oneToMany((com.example.test.TestOuterClass.Empty) request, (io.grpc.stub.StreamObserver<com.example.test.TestOuterClass.Item>) responseObserver, compression, serviceImpl::getAll);
                    break;
                case METHODID_CLEAR:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.example.test.TestOuterClass.Empty) request, (io.grpc.stub.StreamObserver<com.example.test.TestOuterClass.Empty>) responseObserver, compression, serviceImpl::clear);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_BIDI:
                    return (io.grpc.stub.StreamObserver<Req>) io.quarkus.grpc.stubs.ServerCalls.manyToMany((io.grpc.stub.StreamObserver<com.example.test.TestOuterClass.Item>) responseObserver, serviceImpl::bidi);
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }
}
