package io.grpc.testing.integration;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.quarkus.Generated(value = "by gRPC proto compiler (version 1.59.1)", comments = "Source: test.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TestServiceGrpc {

    private TestServiceGrpc() {
    }

    public static final java.lang.String SERVICE_NAME = "grpc.testing.TestService";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<com.google.protobuf.EmptyProtos.Empty, com.google.protobuf.EmptyProtos.Empty> getEmptyCallMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "EmptyCall", requestType = com.google.protobuf.EmptyProtos.Empty.class, responseType = com.google.protobuf.EmptyProtos.Empty.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.google.protobuf.EmptyProtos.Empty, com.google.protobuf.EmptyProtos.Empty> getEmptyCallMethod() {
        io.grpc.MethodDescriptor<com.google.protobuf.EmptyProtos.Empty, com.google.protobuf.EmptyProtos.Empty> getEmptyCallMethod;
        if ((getEmptyCallMethod = TestServiceGrpc.getEmptyCallMethod) == null) {
            synchronized (TestServiceGrpc.class) {
                if ((getEmptyCallMethod = TestServiceGrpc.getEmptyCallMethod) == null) {
                    TestServiceGrpc.getEmptyCallMethod = getEmptyCallMethod = io.grpc.MethodDescriptor.<com.google.protobuf.EmptyProtos.Empty, com.google.protobuf.EmptyProtos.Empty>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "EmptyCall")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.EmptyProtos.Empty.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.EmptyProtos.Empty.getDefaultInstance())).setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("EmptyCall")).build();
                }
            }
        }
        return getEmptyCallMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.grpc.testing.integration.Messages.SimpleRequest, io.grpc.testing.integration.Messages.SimpleResponse> getUnaryCallMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "UnaryCall", requestType = io.grpc.testing.integration.Messages.SimpleRequest.class, responseType = io.grpc.testing.integration.Messages.SimpleResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.grpc.testing.integration.Messages.SimpleRequest, io.grpc.testing.integration.Messages.SimpleResponse> getUnaryCallMethod() {
        io.grpc.MethodDescriptor<io.grpc.testing.integration.Messages.SimpleRequest, io.grpc.testing.integration.Messages.SimpleResponse> getUnaryCallMethod;
        if ((getUnaryCallMethod = TestServiceGrpc.getUnaryCallMethod) == null) {
            synchronized (TestServiceGrpc.class) {
                if ((getUnaryCallMethod = TestServiceGrpc.getUnaryCallMethod) == null) {
                    TestServiceGrpc.getUnaryCallMethod = getUnaryCallMethod = io.grpc.MethodDescriptor.<io.grpc.testing.integration.Messages.SimpleRequest, io.grpc.testing.integration.Messages.SimpleResponse>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnaryCall")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.testing.integration.Messages.SimpleRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.testing.integration.Messages.SimpleResponse.getDefaultInstance())).setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("UnaryCall")).build();
                }
            }
        }
        return getUnaryCallMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.grpc.testing.integration.Messages.StreamingOutputCallRequest, io.grpc.testing.integration.Messages.StreamingOutputCallResponse> getStreamingOutputCallMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "StreamingOutputCall", requestType = io.grpc.testing.integration.Messages.StreamingOutputCallRequest.class, responseType = io.grpc.testing.integration.Messages.StreamingOutputCallResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
    public static io.grpc.MethodDescriptor<io.grpc.testing.integration.Messages.StreamingOutputCallRequest, io.grpc.testing.integration.Messages.StreamingOutputCallResponse> getStreamingOutputCallMethod() {
        io.grpc.MethodDescriptor<io.grpc.testing.integration.Messages.StreamingOutputCallRequest, io.grpc.testing.integration.Messages.StreamingOutputCallResponse> getStreamingOutputCallMethod;
        if ((getStreamingOutputCallMethod = TestServiceGrpc.getStreamingOutputCallMethod) == null) {
            synchronized (TestServiceGrpc.class) {
                if ((getStreamingOutputCallMethod = TestServiceGrpc.getStreamingOutputCallMethod) == null) {
                    TestServiceGrpc.getStreamingOutputCallMethod = getStreamingOutputCallMethod = io.grpc.MethodDescriptor.<io.grpc.testing.integration.Messages.StreamingOutputCallRequest, io.grpc.testing.integration.Messages.StreamingOutputCallResponse>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING).setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamingOutputCall")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.testing.integration.Messages.StreamingOutputCallRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.testing.integration.Messages.StreamingOutputCallResponse.getDefaultInstance())).setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("StreamingOutputCall")).build();
                }
            }
        }
        return getStreamingOutputCallMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static TestServiceStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<TestServiceStub> factory = new io.grpc.stub.AbstractStub.StubFactory<TestServiceStub>() {

            @java.lang.Override
            public TestServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new TestServiceStub(channel, callOptions);
            }
        };
        return TestServiceStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static TestServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<TestServiceBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<TestServiceBlockingStub>() {

            @java.lang.Override
            public TestServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new TestServiceBlockingStub(channel, callOptions);
            }
        };
        return TestServiceBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static TestServiceFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<TestServiceFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<TestServiceFutureStub>() {

            @java.lang.Override
            public TestServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new TestServiceFutureStub(channel, callOptions);
            }
        };
        return TestServiceFutureStub.newStub(factory, channel);
    }

    /**
     */
    public interface AsyncService {

        /**
         * <pre>
         * One empty request followed by one empty response.
         * </pre>
         */
        default void emptyCall(com.google.protobuf.EmptyProtos.Empty request, io.grpc.stub.StreamObserver<com.google.protobuf.EmptyProtos.Empty> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEmptyCallMethod(), responseObserver);
        }

        /**
         * <pre>
         * One request followed by one response.
         * </pre>
         */
        default void unaryCall(io.grpc.testing.integration.Messages.SimpleRequest request, io.grpc.stub.StreamObserver<io.grpc.testing.integration.Messages.SimpleResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnaryCallMethod(), responseObserver);
        }

        /**
         * <pre>
         * One request followed by a sequence of responses (streamed download).
         * The server returns the payload with client desired type and sizes.
         * </pre>
         */
        default void streamingOutputCall(io.grpc.testing.integration.Messages.StreamingOutputCallRequest request, io.grpc.stub.StreamObserver<io.grpc.testing.integration.Messages.StreamingOutputCallResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamingOutputCallMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service TestService.
     */
    public static abstract class TestServiceImplBase implements io.grpc.BindableService, AsyncService {

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return TestServiceGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service TestService.
     */
    public static class TestServiceStub extends io.grpc.stub.AbstractAsyncStub<TestServiceStub> {

        private TestServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected TestServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new TestServiceStub(channel, callOptions);
        }

        /**
         * <pre>
         * One empty request followed by one empty response.
         * </pre>
         */
        public void emptyCall(com.google.protobuf.EmptyProtos.Empty request, io.grpc.stub.StreamObserver<com.google.protobuf.EmptyProtos.Empty> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getEmptyCallMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         * <pre>
         * One request followed by one response.
         * </pre>
         */
        public void unaryCall(io.grpc.testing.integration.Messages.SimpleRequest request, io.grpc.stub.StreamObserver<io.grpc.testing.integration.Messages.SimpleResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getUnaryCallMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         * <pre>
         * One request followed by a sequence of responses (streamed download).
         * The server returns the payload with client desired type and sizes.
         * </pre>
         */
        public void streamingOutputCall(io.grpc.testing.integration.Messages.StreamingOutputCallRequest request, io.grpc.stub.StreamObserver<io.grpc.testing.integration.Messages.StreamingOutputCallResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncServerStreamingCall(getChannel().newCall(getStreamingOutputCallMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service TestService.
     */
    public static class TestServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TestServiceBlockingStub> {

        private TestServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected TestServiceBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new TestServiceBlockingStub(channel, callOptions);
        }

        /**
         * <pre>
         * One empty request followed by one empty response.
         * </pre>
         */
        public com.google.protobuf.EmptyProtos.Empty emptyCall(com.google.protobuf.EmptyProtos.Empty request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getEmptyCallMethod(), getCallOptions(), request);
        }

        /**
         * <pre>
         * One request followed by one response.
         * </pre>
         */
        public io.grpc.testing.integration.Messages.SimpleResponse unaryCall(io.grpc.testing.integration.Messages.SimpleRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getUnaryCallMethod(), getCallOptions(), request);
        }

        /**
         * <pre>
         * One request followed by a sequence of responses (streamed download).
         * The server returns the payload with client desired type and sizes.
         * </pre>
         */
        public java.util.Iterator<io.grpc.testing.integration.Messages.StreamingOutputCallResponse> streamingOutputCall(io.grpc.testing.integration.Messages.StreamingOutputCallRequest request) {
            return io.grpc.stub.ClientCalls.blockingServerStreamingCall(getChannel(), getStreamingOutputCallMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service TestService.
     */
    public static class TestServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TestServiceFutureStub> {

        private TestServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected TestServiceFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new TestServiceFutureStub(channel, callOptions);
        }

        /**
         * <pre>
         * One empty request followed by one empty response.
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.EmptyProtos.Empty> emptyCall(com.google.protobuf.EmptyProtos.Empty request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getEmptyCallMethod(), getCallOptions()), request);
        }

        /**
         * <pre>
         * One request followed by one response.
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<io.grpc.testing.integration.Messages.SimpleResponse> unaryCall(io.grpc.testing.integration.Messages.SimpleRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getUnaryCallMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_EMPTY_CALL = 0;

    private static final int METHODID_UNARY_CALL = 1;

    private static final int METHODID_STREAMING_OUTPUT_CALL = 2;

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
                case METHODID_EMPTY_CALL:
                    serviceImpl.emptyCall((com.google.protobuf.EmptyProtos.Empty) request, (io.grpc.stub.StreamObserver<com.google.protobuf.EmptyProtos.Empty>) responseObserver);
                    break;
                case METHODID_UNARY_CALL:
                    serviceImpl.unaryCall((io.grpc.testing.integration.Messages.SimpleRequest) request, (io.grpc.stub.StreamObserver<io.grpc.testing.integration.Messages.SimpleResponse>) responseObserver);
                    break;
                case METHODID_STREAMING_OUTPUT_CALL:
                    serviceImpl.streamingOutputCall((io.grpc.testing.integration.Messages.StreamingOutputCallRequest) request, (io.grpc.stub.StreamObserver<io.grpc.testing.integration.Messages.StreamingOutputCallResponse>) responseObserver);
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
        return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getEmptyCallMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.google.protobuf.EmptyProtos.Empty, com.google.protobuf.EmptyProtos.Empty>(service, METHODID_EMPTY_CALL))).addMethod(getUnaryCallMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<io.grpc.testing.integration.Messages.SimpleRequest, io.grpc.testing.integration.Messages.SimpleResponse>(service, METHODID_UNARY_CALL))).addMethod(getStreamingOutputCallMethod(), io.grpc.stub.ServerCalls.asyncServerStreamingCall(new MethodHandlers<io.grpc.testing.integration.Messages.StreamingOutputCallRequest, io.grpc.testing.integration.Messages.StreamingOutputCallResponse>(service, METHODID_STREAMING_OUTPUT_CALL))).build();
    }

    private static abstract class TestServiceBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        TestServiceBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return io.grpc.testing.integration.Test.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("TestService");
        }
    }

    private static final class TestServiceFileDescriptorSupplier extends TestServiceBaseDescriptorSupplier {

        TestServiceFileDescriptorSupplier() {
        }
    }

    private static final class TestServiceMethodDescriptorSupplier extends TestServiceBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final java.lang.String methodName;

        TestServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
            synchronized (TestServiceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME).setSchemaDescriptor(new TestServiceFileDescriptorSupplier()).addMethod(getEmptyCallMethod()).addMethod(getUnaryCallMethod()).addMethod(getStreamingOutputCallMethod()).build();
                }
            }
        }
        return result;
    }
}
