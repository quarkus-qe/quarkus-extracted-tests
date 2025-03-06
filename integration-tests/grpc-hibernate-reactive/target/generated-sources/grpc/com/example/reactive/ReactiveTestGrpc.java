package com.example.reactive;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.quarkus.Generated(value = "by gRPC proto compiler (version 1.65.1)", comments = "Source: test.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ReactiveTestGrpc {

    private ReactiveTestGrpc() {
    }

    public static final java.lang.String SERVICE_NAME = "example.ReactiveTest";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<com.example.reactive.Test.Empty, com.example.reactive.Test.Item> getWatchMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "watch", requestType = com.example.reactive.Test.Empty.class, responseType = com.example.reactive.Test.Item.class, methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
    public static io.grpc.MethodDescriptor<com.example.reactive.Test.Empty, com.example.reactive.Test.Item> getWatchMethod() {
        io.grpc.MethodDescriptor<com.example.reactive.Test.Empty, com.example.reactive.Test.Item> getWatchMethod;
        if ((getWatchMethod = ReactiveTestGrpc.getWatchMethod) == null) {
            synchronized (ReactiveTestGrpc.class) {
                if ((getWatchMethod = ReactiveTestGrpc.getWatchMethod) == null) {
                    ReactiveTestGrpc.getWatchMethod = getWatchMethod = io.grpc.MethodDescriptor.<com.example.reactive.Test.Empty, com.example.reactive.Test.Item>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING).setFullMethodName(generateFullMethodName(SERVICE_NAME, "watch")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.reactive.Test.Empty.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.reactive.Test.Item.getDefaultInstance())).setSchemaDescriptor(new ReactiveTestMethodDescriptorSupplier("watch")).build();
                }
            }
        }
        return getWatchMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.example.reactive.Test.Item, com.example.reactive.Test.Empty> getAddMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "add", requestType = com.example.reactive.Test.Item.class, responseType = com.example.reactive.Test.Empty.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.example.reactive.Test.Item, com.example.reactive.Test.Empty> getAddMethod() {
        io.grpc.MethodDescriptor<com.example.reactive.Test.Item, com.example.reactive.Test.Empty> getAddMethod;
        if ((getAddMethod = ReactiveTestGrpc.getAddMethod) == null) {
            synchronized (ReactiveTestGrpc.class) {
                if ((getAddMethod = ReactiveTestGrpc.getAddMethod) == null) {
                    ReactiveTestGrpc.getAddMethod = getAddMethod = io.grpc.MethodDescriptor.<com.example.reactive.Test.Item, com.example.reactive.Test.Empty>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "add")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.reactive.Test.Item.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.example.reactive.Test.Empty.getDefaultInstance())).setSchemaDescriptor(new ReactiveTestMethodDescriptorSupplier("add")).build();
                }
            }
        }
        return getAddMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static ReactiveTestStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<ReactiveTestStub> factory = new io.grpc.stub.AbstractStub.StubFactory<ReactiveTestStub>() {

            @java.lang.Override
            public ReactiveTestStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new ReactiveTestStub(channel, callOptions);
            }
        };
        return ReactiveTestStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static ReactiveTestBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<ReactiveTestBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<ReactiveTestBlockingStub>() {

            @java.lang.Override
            public ReactiveTestBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new ReactiveTestBlockingStub(channel, callOptions);
            }
        };
        return ReactiveTestBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static ReactiveTestFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<ReactiveTestFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<ReactiveTestFutureStub>() {

            @java.lang.Override
            public ReactiveTestFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new ReactiveTestFutureStub(channel, callOptions);
            }
        };
        return ReactiveTestFutureStub.newStub(factory, channel);
    }

    /**
     */
    public interface AsyncService {

        /**
         */
        default void watch(com.example.reactive.Test.Empty request, io.grpc.stub.StreamObserver<com.example.reactive.Test.Item> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWatchMethod(), responseObserver);
        }

        /**
         */
        default void add(com.example.reactive.Test.Item request, io.grpc.stub.StreamObserver<com.example.reactive.Test.Empty> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service ReactiveTest.
     */
    public static abstract class ReactiveTestImplBase implements io.grpc.BindableService, AsyncService {

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return ReactiveTestGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service ReactiveTest.
     */
    public static class ReactiveTestStub extends io.grpc.stub.AbstractAsyncStub<ReactiveTestStub> {

        private ReactiveTestStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected ReactiveTestStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ReactiveTestStub(channel, callOptions);
        }

        /**
         */
        public void watch(com.example.reactive.Test.Empty request, io.grpc.stub.StreamObserver<com.example.reactive.Test.Item> responseObserver) {
            io.grpc.stub.ClientCalls.asyncServerStreamingCall(getChannel().newCall(getWatchMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void add(com.example.reactive.Test.Item request, io.grpc.stub.StreamObserver<com.example.reactive.Test.Empty> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service ReactiveTest.
     */
    public static class ReactiveTestBlockingStub extends io.grpc.stub.AbstractBlockingStub<ReactiveTestBlockingStub> {

        private ReactiveTestBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected ReactiveTestBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ReactiveTestBlockingStub(channel, callOptions);
        }

        /**
         */
        public java.util.Iterator<com.example.reactive.Test.Item> watch(com.example.reactive.Test.Empty request) {
            return io.grpc.stub.ClientCalls.blockingServerStreamingCall(getChannel(), getWatchMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.example.reactive.Test.Empty add(com.example.reactive.Test.Item request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getAddMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service ReactiveTest.
     */
    public static class ReactiveTestFutureStub extends io.grpc.stub.AbstractFutureStub<ReactiveTestFutureStub> {

        private ReactiveTestFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected ReactiveTestFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ReactiveTestFutureStub(channel, callOptions);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.example.reactive.Test.Empty> add(com.example.reactive.Test.Item request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getAddMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_WATCH = 0;

    private static final int METHODID_ADD = 1;

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
                case METHODID_WATCH:
                    serviceImpl.watch((com.example.reactive.Test.Empty) request, (io.grpc.stub.StreamObserver<com.example.reactive.Test.Item>) responseObserver);
                    break;
                case METHODID_ADD:
                    serviceImpl.add((com.example.reactive.Test.Item) request, (io.grpc.stub.StreamObserver<com.example.reactive.Test.Empty>) responseObserver);
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
        return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getWatchMethod(), io.grpc.stub.ServerCalls.asyncServerStreamingCall(new MethodHandlers<com.example.reactive.Test.Empty, com.example.reactive.Test.Item>(service, METHODID_WATCH))).addMethod(getAddMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.example.reactive.Test.Item, com.example.reactive.Test.Empty>(service, METHODID_ADD))).build();
    }

    private static abstract class ReactiveTestBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        ReactiveTestBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return com.example.reactive.Test.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("ReactiveTest");
        }
    }

    private static final class ReactiveTestFileDescriptorSupplier extends ReactiveTestBaseDescriptorSupplier {

        ReactiveTestFileDescriptorSupplier() {
        }
    }

    private static final class ReactiveTestMethodDescriptorSupplier extends ReactiveTestBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final java.lang.String methodName;

        ReactiveTestMethodDescriptorSupplier(java.lang.String methodName) {
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
            synchronized (ReactiveTestGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME).setSchemaDescriptor(new ReactiveTestFileDescriptorSupplier()).addMethod(getWatchMethod()).addMethod(getAddMethod()).build();
                }
            }
        }
        return result;
    }
}
