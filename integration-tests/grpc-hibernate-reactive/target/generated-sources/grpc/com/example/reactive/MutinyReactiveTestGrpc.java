package com.example.reactive;

import static com.example.reactive.ReactiveTestGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: test.proto")
public final class MutinyReactiveTestGrpc implements io.quarkus.grpc.MutinyGrpc {

    private MutinyReactiveTestGrpc() {
    }

    public static MutinyReactiveTestStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyReactiveTestStub(channel);
    }

    public static class MutinyReactiveTestStub extends io.grpc.stub.AbstractStub<MutinyReactiveTestStub> implements io.quarkus.grpc.MutinyStub {

        private ReactiveTestGrpc.ReactiveTestStub delegateStub;

        private MutinyReactiveTestStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = ReactiveTestGrpc.newStub(channel);
        }

        private MutinyReactiveTestStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = ReactiveTestGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyReactiveTestStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyReactiveTestStub(channel, callOptions);
        }

        public io.smallrye.mutiny.Uni<com.example.reactive.Test.Empty> add(com.example.reactive.Test.Item request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::add);
        }

        public io.smallrye.mutiny.Multi<com.example.reactive.Test.Item> watch(com.example.reactive.Test.Empty request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToMany(request, delegateStub::watch);
        }
    }

    public static abstract class ReactiveTestImplBase implements io.grpc.BindableService {

        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public ReactiveTestImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        public io.smallrye.mutiny.Uni<com.example.reactive.Test.Empty> add(com.example.reactive.Test.Item request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Multi<com.example.reactive.Test.Item> watch(com.example.reactive.Test.Empty request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(com.example.reactive.ReactiveTestGrpc.getWatchMethod(), asyncServerStreamingCall(new MethodHandlers<com.example.reactive.Test.Empty, com.example.reactive.Test.Item>(this, METHODID_WATCH, compression))).addMethod(com.example.reactive.ReactiveTestGrpc.getAddMethod(), asyncUnaryCall(new MethodHandlers<com.example.reactive.Test.Item, com.example.reactive.Test.Empty>(this, METHODID_ADD, compression))).build();
        }
    }

    private static final int METHODID_WATCH = 0;

    private static final int METHODID_ADD = 1;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final ReactiveTestImplBase serviceImpl;

        private final int methodId;

        private final String compression;

        MethodHandlers(ReactiveTestImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_WATCH:
                    io.quarkus.grpc.stubs.ServerCalls.oneToMany((com.example.reactive.Test.Empty) request, (io.grpc.stub.StreamObserver<com.example.reactive.Test.Item>) responseObserver, compression, serviceImpl::watch);
                    break;
                case METHODID_ADD:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.example.reactive.Test.Item) request, (io.grpc.stub.StreamObserver<com.example.reactive.Test.Empty>) responseObserver, compression, serviceImpl::add);
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
