package com.example.grpc.exc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.quarkus.Generated(value = "by gRPC proto compiler (version 1.65.1)", comments = "Source: hello.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LegacyHelloGrpcGrpc {

    private LegacyHelloGrpcGrpc() {
    }

    public static final java.lang.String SERVICE_NAME = "hello.LegacyHelloGrpc";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<com.example.grpc.exc.HelloRequest, com.example.grpc.exc.HelloReply> getLegacySayHelloMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "LegacySayHello", requestType = com.example.grpc.exc.HelloRequest.class, responseType = com.example.grpc.exc.HelloReply.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.example.grpc.exc.HelloRequest, com.example.grpc.exc.HelloReply> getLegacySayHelloMethod() {
        io.grpc.MethodDescriptor<com.example.grpc.exc.HelloRequest, com.example.grpc.exc.HelloReply> getLegacySayHelloMethod;
        if ((getLegacySayHelloMethod = LegacyHelloGrpcGrpc.getLegacySayHelloMethod) == null) {
            synchronized (LegacyHelloGrpcGrpc.class) {
                if ((getLegacySayHelloMethod = LegacyHelloGrpcGrpc.getLegacySayHelloMethod) == null) {
                    LegacyHelloGrpcGrpc.getLegacySayHelloMethod = getLegacySayHelloMethod = io.grpc.MethodDescriptor.<com.example.grpc.exc.HelloRequest, com.example.grpc.exc.HelloReply>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "LegacySayHello")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.grpc.exc.HelloRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.grpc.exc.HelloReply.getDefaultInstance())).setSchemaDescriptor(new LegacyHelloGrpcMethodDescriptorSupplier("LegacySayHello")).build();
                }
            }
        }
        return getLegacySayHelloMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static LegacyHelloGrpcStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<LegacyHelloGrpcStub> factory = new io.grpc.stub.AbstractStub.StubFactory<LegacyHelloGrpcStub>() {

            @java.lang.Override
            public LegacyHelloGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new LegacyHelloGrpcStub(channel, callOptions);
            }
        };
        return LegacyHelloGrpcStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static LegacyHelloGrpcBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<LegacyHelloGrpcBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<LegacyHelloGrpcBlockingStub>() {

            @java.lang.Override
            public LegacyHelloGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new LegacyHelloGrpcBlockingStub(channel, callOptions);
            }
        };
        return LegacyHelloGrpcBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static LegacyHelloGrpcFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<LegacyHelloGrpcFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<LegacyHelloGrpcFutureStub>() {

            @java.lang.Override
            public LegacyHelloGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new LegacyHelloGrpcFutureStub(channel, callOptions);
            }
        };
        return LegacyHelloGrpcFutureStub.newStub(factory, channel);
    }

    /**
     */
    public interface AsyncService {

        /**
         */
        default void legacySayHello(com.example.grpc.exc.HelloRequest request, io.grpc.stub.StreamObserver<com.example.grpc.exc.HelloReply> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLegacySayHelloMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service LegacyHelloGrpc.
     */
    public static abstract class LegacyHelloGrpcImplBase implements io.grpc.BindableService, AsyncService {

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return LegacyHelloGrpcGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service LegacyHelloGrpc.
     */
    public static class LegacyHelloGrpcStub extends io.grpc.stub.AbstractAsyncStub<LegacyHelloGrpcStub> {

        private LegacyHelloGrpcStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected LegacyHelloGrpcStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new LegacyHelloGrpcStub(channel, callOptions);
        }

        /**
         */
        public void legacySayHello(com.example.grpc.exc.HelloRequest request, io.grpc.stub.StreamObserver<com.example.grpc.exc.HelloReply> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getLegacySayHelloMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service LegacyHelloGrpc.
     */
    public static class LegacyHelloGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<LegacyHelloGrpcBlockingStub> {

        private LegacyHelloGrpcBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected LegacyHelloGrpcBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new LegacyHelloGrpcBlockingStub(channel, callOptions);
        }

        /**
         */
        public com.example.grpc.exc.HelloReply legacySayHello(com.example.grpc.exc.HelloRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getLegacySayHelloMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service LegacyHelloGrpc.
     */
    public static class LegacyHelloGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<LegacyHelloGrpcFutureStub> {

        private LegacyHelloGrpcFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected LegacyHelloGrpcFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new LegacyHelloGrpcFutureStub(channel, callOptions);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.exc.HelloReply> legacySayHello(com.example.grpc.exc.HelloRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getLegacySayHelloMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_LEGACY_SAY_HELLO = 0;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final AsyncService serviceImpl;

        private final int methodId;

        MethodHandlers(AsyncService serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_LEGACY_SAY_HELLO:
                    serviceImpl.legacySayHello((com.example.grpc.exc.HelloRequest) request, (io.grpc.stub.StreamObserver<com.example.grpc.exc.HelloReply>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                default:
                    throw new AssertionError();
            }
        }
    }

    public static io.grpc.ServerServiceDefinition bindService(AsyncService service) {
        return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getLegacySayHelloMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.example.grpc.exc.HelloRequest, com.example.grpc.exc.HelloReply>(service, METHODID_LEGACY_SAY_HELLO))).build();
    }

    private static abstract class LegacyHelloGrpcBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        LegacyHelloGrpcBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return com.example.grpc.exc.HelloGrpcProto.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("LegacyHelloGrpc");
        }
    }

    private static final class LegacyHelloGrpcFileDescriptorSupplier extends LegacyHelloGrpcBaseDescriptorSupplier {

        LegacyHelloGrpcFileDescriptorSupplier() {
        }
    }

    private static final class LegacyHelloGrpcMethodDescriptorSupplier extends LegacyHelloGrpcBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final java.lang.String methodName;

        LegacyHelloGrpcMethodDescriptorSupplier(java.lang.String methodName) {
            this.methodName = methodName;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(methodName);
        }
    }

    private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

    public static io.grpc.ServiceDescriptor getServiceDescriptor() {
        io.grpc.ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (LegacyHelloGrpcGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME).setSchemaDescriptor(new LegacyHelloGrpcFileDescriptorSupplier()).addMethod(getLegacySayHelloMethod()).build();
                }
            }
        }
        return result;
    }
}
