package com.example.test;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.quarkus.Generated(value = "by gRPC proto compiler (version 1.69.1)", comments = "Source: test.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TestRawGrpc {

    private TestRawGrpc() {
    }

    public static final java.lang.String SERVICE_NAME = "test.TestRaw";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<com.example.test.TestOuterClass.Item, com.example.test.TestOuterClass.Empty> getAddMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "Add", requestType = com.example.test.TestOuterClass.Item.class, responseType = com.example.test.TestOuterClass.Empty.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.example.test.TestOuterClass.Item, com.example.test.TestOuterClass.Empty> getAddMethod() {
        io.grpc.MethodDescriptor<com.example.test.TestOuterClass.Item, com.example.test.TestOuterClass.Empty> getAddMethod;
        if ((getAddMethod = TestRawGrpc.getAddMethod) == null) {
            synchronized (TestRawGrpc.class) {
                if ((getAddMethod = TestRawGrpc.getAddMethod) == null) {
                    TestRawGrpc.getAddMethod = getAddMethod = io.grpc.MethodDescriptor.<com.example.test.TestOuterClass.Item, com.example.test.TestOuterClass.Empty>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.test.TestOuterClass.Item.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.test.TestOuterClass.Empty.getDefaultInstance())).setSchemaDescriptor(new TestRawMethodDescriptorSupplier("Add")).build();
                }
            }
        }
        return getAddMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.example.test.TestOuterClass.Empty, com.example.test.TestOuterClass.Item> getGetAllMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "getAll", requestType = com.example.test.TestOuterClass.Empty.class, responseType = com.example.test.TestOuterClass.Item.class, methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
    public static io.grpc.MethodDescriptor<com.example.test.TestOuterClass.Empty, com.example.test.TestOuterClass.Item> getGetAllMethod() {
        io.grpc.MethodDescriptor<com.example.test.TestOuterClass.Empty, com.example.test.TestOuterClass.Item> getGetAllMethod;
        if ((getGetAllMethod = TestRawGrpc.getGetAllMethod) == null) {
            synchronized (TestRawGrpc.class) {
                if ((getGetAllMethod = TestRawGrpc.getGetAllMethod) == null) {
                    TestRawGrpc.getGetAllMethod = getGetAllMethod = io.grpc.MethodDescriptor.<com.example.test.TestOuterClass.Empty, com.example.test.TestOuterClass.Item>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING).setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAll")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.test.TestOuterClass.Empty.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.test.TestOuterClass.Item.getDefaultInstance())).setSchemaDescriptor(new TestRawMethodDescriptorSupplier("getAll")).build();
                }
            }
        }
        return getGetAllMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.example.test.TestOuterClass.Empty, com.example.test.TestOuterClass.Empty> getClearMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "clear", requestType = com.example.test.TestOuterClass.Empty.class, responseType = com.example.test.TestOuterClass.Empty.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.example.test.TestOuterClass.Empty, com.example.test.TestOuterClass.Empty> getClearMethod() {
        io.grpc.MethodDescriptor<com.example.test.TestOuterClass.Empty, com.example.test.TestOuterClass.Empty> getClearMethod;
        if ((getClearMethod = TestRawGrpc.getClearMethod) == null) {
            synchronized (TestRawGrpc.class) {
                if ((getClearMethod = TestRawGrpc.getClearMethod) == null) {
                    TestRawGrpc.getClearMethod = getClearMethod = io.grpc.MethodDescriptor.<com.example.test.TestOuterClass.Empty, com.example.test.TestOuterClass.Empty>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "clear")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.test.TestOuterClass.Empty.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.test.TestOuterClass.Empty.getDefaultInstance())).setSchemaDescriptor(new TestRawMethodDescriptorSupplier("clear")).build();
                }
            }
        }
        return getClearMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.example.test.TestOuterClass.Item, com.example.test.TestOuterClass.Item> getBidiMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "bidi", requestType = com.example.test.TestOuterClass.Item.class, responseType = com.example.test.TestOuterClass.Item.class, methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
    public static io.grpc.MethodDescriptor<com.example.test.TestOuterClass.Item, com.example.test.TestOuterClass.Item> getBidiMethod() {
        io.grpc.MethodDescriptor<com.example.test.TestOuterClass.Item, com.example.test.TestOuterClass.Item> getBidiMethod;
        if ((getBidiMethod = TestRawGrpc.getBidiMethod) == null) {
            synchronized (TestRawGrpc.class) {
                if ((getBidiMethod = TestRawGrpc.getBidiMethod) == null) {
                    TestRawGrpc.getBidiMethod = getBidiMethod = io.grpc.MethodDescriptor.<com.example.test.TestOuterClass.Item, com.example.test.TestOuterClass.Item>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING).setFullMethodName(generateFullMethodName(SERVICE_NAME, "bidi")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.test.TestOuterClass.Item.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.test.TestOuterClass.Item.getDefaultInstance())).setSchemaDescriptor(new TestRawMethodDescriptorSupplier("bidi")).build();
                }
            }
        }
        return getBidiMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static TestRawStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<TestRawStub> factory = new io.grpc.stub.AbstractStub.StubFactory<TestRawStub>() {

            @java.lang.Override
            public TestRawStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new TestRawStub(channel, callOptions);
            }
        };
        return TestRawStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static TestRawBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<TestRawBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<TestRawBlockingStub>() {

            @java.lang.Override
            public TestRawBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new TestRawBlockingStub(channel, callOptions);
            }
        };
        return TestRawBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static TestRawFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<TestRawFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<TestRawFutureStub>() {

            @java.lang.Override
            public TestRawFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new TestRawFutureStub(channel, callOptions);
            }
        };
        return TestRawFutureStub.newStub(factory, channel);
    }

    /**
     */
    public interface AsyncService {

        /**
         */
        default void add(com.example.test.TestOuterClass.Item request, io.grpc.stub.StreamObserver<com.example.test.TestOuterClass.Empty> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
        }

        /**
         */
        default void getAll(com.example.test.TestOuterClass.Empty request, io.grpc.stub.StreamObserver<com.example.test.TestOuterClass.Item> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
        }

        /**
         */
        default void clear(com.example.test.TestOuterClass.Empty request, io.grpc.stub.StreamObserver<com.example.test.TestOuterClass.Empty> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearMethod(), responseObserver);
        }

        /**
         */
        default io.grpc.stub.StreamObserver<com.example.test.TestOuterClass.Item> bidi(io.grpc.stub.StreamObserver<com.example.test.TestOuterClass.Item> responseObserver) {
            return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getBidiMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service TestRaw.
     */
    public static abstract class TestRawImplBase implements io.grpc.BindableService, AsyncService {

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return TestRawGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service TestRaw.
     */
    public static class TestRawStub extends io.grpc.stub.AbstractAsyncStub<TestRawStub> {

        private TestRawStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected TestRawStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new TestRawStub(channel, callOptions);
        }

        /**
         */
        public void add(com.example.test.TestOuterClass.Item request, io.grpc.stub.StreamObserver<com.example.test.TestOuterClass.Empty> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getAll(com.example.test.TestOuterClass.Empty request, io.grpc.stub.StreamObserver<com.example.test.TestOuterClass.Item> responseObserver) {
            io.grpc.stub.ClientCalls.asyncServerStreamingCall(getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void clear(com.example.test.TestOuterClass.Empty request, io.grpc.stub.StreamObserver<com.example.test.TestOuterClass.Empty> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getClearMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public io.grpc.stub.StreamObserver<com.example.test.TestOuterClass.Item> bidi(io.grpc.stub.StreamObserver<com.example.test.TestOuterClass.Item> responseObserver) {
            return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(getChannel().newCall(getBidiMethod(), getCallOptions()), responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service TestRaw.
     */
    public static class TestRawBlockingStub extends io.grpc.stub.AbstractBlockingStub<TestRawBlockingStub> {

        private TestRawBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected TestRawBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new TestRawBlockingStub(channel, callOptions);
        }

        /**
         */
        public com.example.test.TestOuterClass.Empty add(com.example.test.TestOuterClass.Item request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getAddMethod(), getCallOptions(), request);
        }

        /**
         */
        public java.util.Iterator<com.example.test.TestOuterClass.Item> getAll(com.example.test.TestOuterClass.Empty request) {
            return io.grpc.stub.ClientCalls.blockingServerStreamingCall(getChannel(), getGetAllMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.example.test.TestOuterClass.Empty clear(com.example.test.TestOuterClass.Empty request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getClearMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service TestRaw.
     */
    public static class TestRawFutureStub extends io.grpc.stub.AbstractFutureStub<TestRawFutureStub> {

        private TestRawFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected TestRawFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new TestRawFutureStub(channel, callOptions);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.example.test.TestOuterClass.Empty> add(com.example.test.TestOuterClass.Item request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getAddMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.example.test.TestOuterClass.Empty> clear(com.example.test.TestOuterClass.Empty request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getClearMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_ADD = 0;

    private static final int METHODID_GET_ALL = 1;

    private static final int METHODID_CLEAR = 2;

    private static final int METHODID_BIDI = 3;

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
                case METHODID_ADD:
                    serviceImpl.add((com.example.test.TestOuterClass.Item) request, (io.grpc.stub.StreamObserver<com.example.test.TestOuterClass.Empty>) responseObserver);
                    break;
                case METHODID_GET_ALL:
                    serviceImpl.getAll((com.example.test.TestOuterClass.Empty) request, (io.grpc.stub.StreamObserver<com.example.test.TestOuterClass.Item>) responseObserver);
                    break;
                case METHODID_CLEAR:
                    serviceImpl.clear((com.example.test.TestOuterClass.Empty) request, (io.grpc.stub.StreamObserver<com.example.test.TestOuterClass.Empty>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_BIDI:
                    return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidi((io.grpc.stub.StreamObserver<com.example.test.TestOuterClass.Item>) responseObserver);
                default:
                    throw new AssertionError();
            }
        }
    }

    public static io.grpc.ServerServiceDefinition bindService(AsyncService service) {
        return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getAddMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.example.test.TestOuterClass.Item, com.example.test.TestOuterClass.Empty>(service, METHODID_ADD))).addMethod(getGetAllMethod(), io.grpc.stub.ServerCalls.asyncServerStreamingCall(new MethodHandlers<com.example.test.TestOuterClass.Empty, com.example.test.TestOuterClass.Item>(service, METHODID_GET_ALL))).addMethod(getClearMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.example.test.TestOuterClass.Empty, com.example.test.TestOuterClass.Empty>(service, METHODID_CLEAR))).addMethod(getBidiMethod(), io.grpc.stub.ServerCalls.asyncBidiStreamingCall(new MethodHandlers<com.example.test.TestOuterClass.Item, com.example.test.TestOuterClass.Item>(service, METHODID_BIDI))).build();
    }

    private static abstract class TestRawBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        TestRawBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return com.example.test.TestOuterClass.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("TestRaw");
        }
    }

    private static final class TestRawFileDescriptorSupplier extends TestRawBaseDescriptorSupplier {

        TestRawFileDescriptorSupplier() {
        }
    }

    private static final class TestRawMethodDescriptorSupplier extends TestRawBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final java.lang.String methodName;

        TestRawMethodDescriptorSupplier(java.lang.String methodName) {
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
            synchronized (TestRawGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME).setSchemaDescriptor(new TestRawFileDescriptorSupplier()).addMethod(getAddMethod()).addMethod(getGetAllMethod()).addMethod(getClearMethod()).addMethod(getBidiMethod()).build();
                }
            }
        }
        return result;
    }
}
