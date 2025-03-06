package com.test;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.quarkus.Generated(value = "by gRPC proto compiler (version 1.59.1)", comments = "Source: proto-with-java_generic_services.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MyJavaGenericServicesTestGrpc {

    private MyJavaGenericServicesTestGrpc() {
    }

    public static final java.lang.String SERVICE_NAME = "com.test.MyJavaGenericServicesTest";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<com.test.ProtoWithJavaGenericServices.JavaGenericServices, com.test.ProtoWithJavaGenericServices.JavaGenericServices> getDoTestMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "DoTest", requestType = com.test.ProtoWithJavaGenericServices.JavaGenericServices.class, responseType = com.test.ProtoWithJavaGenericServices.JavaGenericServices.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.test.ProtoWithJavaGenericServices.JavaGenericServices, com.test.ProtoWithJavaGenericServices.JavaGenericServices> getDoTestMethod() {
        io.grpc.MethodDescriptor<com.test.ProtoWithJavaGenericServices.JavaGenericServices, com.test.ProtoWithJavaGenericServices.JavaGenericServices> getDoTestMethod;
        if ((getDoTestMethod = MyJavaGenericServicesTestGrpc.getDoTestMethod) == null) {
            synchronized (MyJavaGenericServicesTestGrpc.class) {
                if ((getDoTestMethod = MyJavaGenericServicesTestGrpc.getDoTestMethod) == null) {
                    MyJavaGenericServicesTestGrpc.getDoTestMethod = getDoTestMethod = io.grpc.MethodDescriptor.<com.test.ProtoWithJavaGenericServices.JavaGenericServices, com.test.ProtoWithJavaGenericServices.JavaGenericServices>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "DoTest")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.test.ProtoWithJavaGenericServices.JavaGenericServices.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.test.ProtoWithJavaGenericServices.JavaGenericServices.getDefaultInstance())).setSchemaDescriptor(new MyJavaGenericServicesTestMethodDescriptorSupplier("DoTest")).build();
                }
            }
        }
        return getDoTestMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static MyJavaGenericServicesTestStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MyJavaGenericServicesTestStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MyJavaGenericServicesTestStub>() {

            @java.lang.Override
            public MyJavaGenericServicesTestStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new MyJavaGenericServicesTestStub(channel, callOptions);
            }
        };
        return MyJavaGenericServicesTestStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static MyJavaGenericServicesTestBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MyJavaGenericServicesTestBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MyJavaGenericServicesTestBlockingStub>() {

            @java.lang.Override
            public MyJavaGenericServicesTestBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new MyJavaGenericServicesTestBlockingStub(channel, callOptions);
            }
        };
        return MyJavaGenericServicesTestBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static MyJavaGenericServicesTestFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MyJavaGenericServicesTestFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MyJavaGenericServicesTestFutureStub>() {

            @java.lang.Override
            public MyJavaGenericServicesTestFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new MyJavaGenericServicesTestFutureStub(channel, callOptions);
            }
        };
        return MyJavaGenericServicesTestFutureStub.newStub(factory, channel);
    }

    /**
     */
    public interface AsyncService {

        /**
         */
        default void doTest(com.test.ProtoWithJavaGenericServices.JavaGenericServices request, io.grpc.stub.StreamObserver<com.test.ProtoWithJavaGenericServices.JavaGenericServices> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoTestMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service MyJavaGenericServicesTest.
     */
    public static abstract class MyJavaGenericServicesTestImplBase implements io.grpc.BindableService, AsyncService {

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return MyJavaGenericServicesTestGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service MyJavaGenericServicesTest.
     */
    public static class MyJavaGenericServicesTestStub extends io.grpc.stub.AbstractAsyncStub<MyJavaGenericServicesTestStub> {

        private MyJavaGenericServicesTestStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MyJavaGenericServicesTestStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MyJavaGenericServicesTestStub(channel, callOptions);
        }

        /**
         */
        public void doTest(com.test.ProtoWithJavaGenericServices.JavaGenericServices request, io.grpc.stub.StreamObserver<com.test.ProtoWithJavaGenericServices.JavaGenericServices> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getDoTestMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service MyJavaGenericServicesTest.
     */
    public static class MyJavaGenericServicesTestBlockingStub extends io.grpc.stub.AbstractBlockingStub<MyJavaGenericServicesTestBlockingStub> {

        private MyJavaGenericServicesTestBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MyJavaGenericServicesTestBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MyJavaGenericServicesTestBlockingStub(channel, callOptions);
        }

        /**
         */
        public com.test.ProtoWithJavaGenericServices.JavaGenericServices doTest(com.test.ProtoWithJavaGenericServices.JavaGenericServices request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getDoTestMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service MyJavaGenericServicesTest.
     */
    public static class MyJavaGenericServicesTestFutureStub extends io.grpc.stub.AbstractFutureStub<MyJavaGenericServicesTestFutureStub> {

        private MyJavaGenericServicesTestFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MyJavaGenericServicesTestFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MyJavaGenericServicesTestFutureStub(channel, callOptions);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.test.ProtoWithJavaGenericServices.JavaGenericServices> doTest(com.test.ProtoWithJavaGenericServices.JavaGenericServices request) {
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
                    serviceImpl.doTest((com.test.ProtoWithJavaGenericServices.JavaGenericServices) request, (io.grpc.stub.StreamObserver<com.test.ProtoWithJavaGenericServices.JavaGenericServices>) responseObserver);
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
        return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getDoTestMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.test.ProtoWithJavaGenericServices.JavaGenericServices, com.test.ProtoWithJavaGenericServices.JavaGenericServices>(service, METHODID_DO_TEST))).build();
    }

    private static abstract class MyJavaGenericServicesTestBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        MyJavaGenericServicesTestBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return com.test.ProtoWithJavaGenericServices.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("MyJavaGenericServicesTest");
        }
    }

    private static final class MyJavaGenericServicesTestFileDescriptorSupplier extends MyJavaGenericServicesTestBaseDescriptorSupplier {

        MyJavaGenericServicesTestFileDescriptorSupplier() {
        }
    }

    private static final class MyJavaGenericServicesTestMethodDescriptorSupplier extends MyJavaGenericServicesTestBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final java.lang.String methodName;

        MyJavaGenericServicesTestMethodDescriptorSupplier(java.lang.String methodName) {
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
            synchronized (MyJavaGenericServicesTestGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME).setSchemaDescriptor(new MyJavaGenericServicesTestFileDescriptorSupplier()).addMethod(getDoTestMethod()).build();
                }
            }
        }
        return result;
    }
}
