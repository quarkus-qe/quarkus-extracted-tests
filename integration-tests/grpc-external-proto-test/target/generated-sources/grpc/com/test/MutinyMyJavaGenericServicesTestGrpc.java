package com.test;

import static com.test.MyJavaGenericServicesTestGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: proto-with-java_generic_services.proto")
public final class MutinyMyJavaGenericServicesTestGrpc implements io.quarkus.grpc.MutinyGrpc {

    private MutinyMyJavaGenericServicesTestGrpc() {
    }

    public static MutinyMyJavaGenericServicesTestStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyMyJavaGenericServicesTestStub(channel);
    }

    public static class MutinyMyJavaGenericServicesTestStub extends io.grpc.stub.AbstractStub<MutinyMyJavaGenericServicesTestStub> implements io.quarkus.grpc.MutinyStub {

        private MyJavaGenericServicesTestGrpc.MyJavaGenericServicesTestStub delegateStub;

        private MutinyMyJavaGenericServicesTestStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = MyJavaGenericServicesTestGrpc.newStub(channel);
        }

        private MutinyMyJavaGenericServicesTestStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = MyJavaGenericServicesTestGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyMyJavaGenericServicesTestStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyMyJavaGenericServicesTestStub(channel, callOptions);
        }

        public io.smallrye.mutiny.Uni<com.test.ProtoWithJavaGenericServices.JavaGenericServices> doTest(com.test.ProtoWithJavaGenericServices.JavaGenericServices request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::doTest);
        }
    }

    public static abstract class MyJavaGenericServicesTestImplBase implements io.grpc.BindableService {

        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public MyJavaGenericServicesTestImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        public io.smallrye.mutiny.Uni<com.test.ProtoWithJavaGenericServices.JavaGenericServices> doTest(com.test.ProtoWithJavaGenericServices.JavaGenericServices request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(com.test.MyJavaGenericServicesTestGrpc.getDoTestMethod(), asyncUnaryCall(new MethodHandlers<com.test.ProtoWithJavaGenericServices.JavaGenericServices, com.test.ProtoWithJavaGenericServices.JavaGenericServices>(this, METHODID_DO_TEST, compression))).build();
        }
    }

    private static final int METHODID_DO_TEST = 0;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final MyJavaGenericServicesTestImplBase serviceImpl;

        private final int methodId;

        private final String compression;

        MethodHandlers(MyJavaGenericServicesTestImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_DO_TEST:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.test.ProtoWithJavaGenericServices.JavaGenericServices) request, (io.grpc.stub.StreamObserver<com.test.ProtoWithJavaGenericServices.JavaGenericServices>) responseObserver, compression, serviceImpl::doTest);
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
