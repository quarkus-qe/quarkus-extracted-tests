package com.test;

import static com.test.MyTestGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: my-proto.proto")
public final class MutinyMyTestGrpc implements io.quarkus.grpc.MutinyGrpc {

    private MutinyMyTestGrpc() {
    }

    public static MutinyMyTestStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyMyTestStub(channel);
    }

    public static class MutinyMyTestStub extends io.grpc.stub.AbstractStub<MutinyMyTestStub> implements io.quarkus.grpc.MutinyStub {

        private MyTestGrpc.MyTestStub delegateStub;

        private MutinyMyTestStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = MyTestGrpc.newStub(channel);
        }

        private MutinyMyTestStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = MyTestGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyMyTestStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyMyTestStub(channel, callOptions);
        }

        public io.smallrye.mutiny.Uni<com.test.MyProto.TextContainer> doTest(com.test.MyProto.TextContainer request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::doTest);
        }
    }

    public static abstract class MyTestImplBase implements io.grpc.BindableService {

        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public MyTestImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        public io.smallrye.mutiny.Uni<com.test.MyProto.TextContainer> doTest(com.test.MyProto.TextContainer request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(com.test.MyTestGrpc.getDoTestMethod(), asyncUnaryCall(new MethodHandlers<com.test.MyProto.TextContainer, com.test.MyProto.TextContainer>(this, METHODID_DO_TEST, compression))).build();
        }
    }

    private static final int METHODID_DO_TEST = 0;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final MyTestImplBase serviceImpl;

        private final int methodId;

        private final String compression;

        MethodHandlers(MyTestImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_DO_TEST:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.test.MyProto.TextContainer) request, (io.grpc.stub.StreamObserver<com.test.MyProto.TextContainer>) responseObserver, compression, serviceImpl::doTest);
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
