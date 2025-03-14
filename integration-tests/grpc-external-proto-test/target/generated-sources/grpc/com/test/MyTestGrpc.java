package com.test;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.quarkus.Generated(value = "by gRPC proto compiler (version 1.69.1)", comments = "Source: dir/my-proto.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MyTestGrpc {

    private MyTestGrpc() {
    }

    public static final java.lang.String SERVICE_NAME = "com.test.MyTest";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<com.test.MyProto.TextContainer, com.test.MyProto.TextContainer> getDoTestMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "DoTest", requestType = com.test.MyProto.TextContainer.class, responseType = com.test.MyProto.TextContainer.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.test.MyProto.TextContainer, com.test.MyProto.TextContainer> getDoTestMethod() {
        io.grpc.MethodDescriptor<com.test.MyProto.TextContainer, com.test.MyProto.TextContainer> getDoTestMethod;
        if ((getDoTestMethod = MyTestGrpc.getDoTestMethod) == null) {
            synchronized (MyTestGrpc.class) {
                if ((getDoTestMethod = MyTestGrpc.getDoTestMethod) == null) {
                    MyTestGrpc.getDoTestMethod = getDoTestMethod = io.grpc.MethodDescriptor.<com.test.MyProto.TextContainer, com.test.MyProto.TextContainer>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "DoTest")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.test.MyProto.TextContainer.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.test.MyProto.TextContainer.getDefaultInstance())).setSchemaDescriptor(new MyTestMethodDescriptorSupplier("DoTest")).build();
                }
            }
        }
        return getDoTestMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static MyTestStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MyTestStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MyTestStub>() {

            @java.lang.Override
            public MyTestStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new MyTestStub(channel, callOptions);
            }
        };
        return MyTestStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static MyTestBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MyTestBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MyTestBlockingStub>() {

            @java.lang.Override
            public MyTestBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new MyTestBlockingStub(channel, callOptions);
            }
        };
        return MyTestBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static MyTestFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MyTestFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MyTestFutureStub>() {

            @java.lang.Override
            public MyTestFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new MyTestFutureStub(channel, callOptions);
            }
        };
        return MyTestFutureStub.newStub(factory, channel);
    }

    /**
     */
    public interface AsyncService {

        /**
         */
        default void doTest(com.test.MyProto.TextContainer request, io.grpc.stub.StreamObserver<com.test.MyProto.TextContainer> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoTestMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service MyTest.
     */
    public static abstract class MyTestImplBase implements io.grpc.BindableService, AsyncService {

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return MyTestGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service MyTest.
     */
    public static class MyTestStub extends io.grpc.stub.AbstractAsyncStub<MyTestStub> {

        private MyTestStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MyTestStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MyTestStub(channel, callOptions);
        }

        /**
         */
        public void doTest(com.test.MyProto.TextContainer request, io.grpc.stub.StreamObserver<com.test.MyProto.TextContainer> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getDoTestMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service MyTest.
     */
    public static class MyTestBlockingStub extends io.grpc.stub.AbstractBlockingStub<MyTestBlockingStub> {

        private MyTestBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MyTestBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MyTestBlockingStub(channel, callOptions);
        }

        /**
         */
        public com.test.MyProto.TextContainer doTest(com.test.MyProto.TextContainer request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getDoTestMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service MyTest.
     */
    public static class MyTestFutureStub extends io.grpc.stub.AbstractFutureStub<MyTestFutureStub> {

        private MyTestFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MyTestFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MyTestFutureStub(channel, callOptions);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.test.MyProto.TextContainer> doTest(com.test.MyProto.TextContainer request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getDoTestMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_DO_TEST = 0;

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
                case METHODID_DO_TEST:
                    serviceImpl.doTest((com.test.MyProto.TextContainer) request, (io.grpc.stub.StreamObserver<com.test.MyProto.TextContainer>) responseObserver);
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
        return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getDoTestMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.test.MyProto.TextContainer, com.test.MyProto.TextContainer>(service, METHODID_DO_TEST))).build();
    }

    private static abstract class MyTestBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        MyTestBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return com.test.MyProto.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("MyTest");
        }
    }

    private static final class MyTestFileDescriptorSupplier extends MyTestBaseDescriptorSupplier {

        MyTestFileDescriptorSupplier() {
        }
    }

    private static final class MyTestMethodDescriptorSupplier extends MyTestBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final java.lang.String methodName;

        MyTestMethodDescriptorSupplier(java.lang.String methodName) {
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
            synchronized (MyTestGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME).setSchemaDescriptor(new MyTestFileDescriptorSupplier()).addMethod(getDoTestMethod()).build();
                }
            }
        }
        return result;
    }
}
