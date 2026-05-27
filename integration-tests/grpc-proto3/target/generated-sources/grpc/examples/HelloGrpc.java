package examples;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class HelloGrpc {

    private HelloGrpc() {
    }

    public static final java.lang.String SERVICE_NAME = "helloworld.Hello";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<examples.HelloRequest, examples.HelloReply> getSayHelloMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "SayHello", requestType = examples.HelloRequest.class, responseType = examples.HelloReply.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<examples.HelloRequest, examples.HelloReply> getSayHelloMethod() {
        io.grpc.MethodDescriptor<examples.HelloRequest, examples.HelloReply> getSayHelloMethod;
        if ((getSayHelloMethod = HelloGrpc.getSayHelloMethod) == null) {
            synchronized (HelloGrpc.class) {
                if ((getSayHelloMethod = HelloGrpc.getSayHelloMethod) == null) {
                    HelloGrpc.getSayHelloMethod = getSayHelloMethod = io.grpc.MethodDescriptor.<examples.HelloRequest, examples.HelloReply>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(examples.HelloRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(examples.HelloReply.getDefaultInstance())).setSchemaDescriptor(new HelloMethodDescriptorSupplier("SayHello")).build();
                }
            }
        }
        return getSayHelloMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static HelloStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<HelloStub> factory = new io.grpc.stub.AbstractStub.StubFactory<HelloStub>() {

            @java.lang.Override
            public HelloStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new HelloStub(channel, callOptions);
            }
        };
        return HelloStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports all types of calls on the service
     */
    public static HelloBlockingV2Stub newBlockingV2Stub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<HelloBlockingV2Stub> factory = new io.grpc.stub.AbstractStub.StubFactory<HelloBlockingV2Stub>() {

            @java.lang.Override
            public HelloBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new HelloBlockingV2Stub(channel, callOptions);
            }
        };
        return HelloBlockingV2Stub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static HelloBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<HelloBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<HelloBlockingStub>() {

            @java.lang.Override
            public HelloBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new HelloBlockingStub(channel, callOptions);
            }
        };
        return HelloBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static HelloFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<HelloFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<HelloFutureStub>() {

            @java.lang.Override
            public HelloFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new HelloFutureStub(channel, callOptions);
            }
        };
        return HelloFutureStub.newStub(factory, channel);
    }

    /**
     */
    public interface AsyncService {

        /**
         */
        default void sayHello(examples.HelloRequest request, io.grpc.stub.StreamObserver<examples.HelloReply> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service Hello.
     */
    public static abstract class HelloImplBase implements io.grpc.BindableService, AsyncService {

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return HelloGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service Hello.
     */
    public static class HelloStub extends io.grpc.stub.AbstractAsyncStub<HelloStub> {

        private HelloStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected HelloStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new HelloStub(channel, callOptions);
        }

        /**
         */
        public void sayHello(examples.HelloRequest request, io.grpc.stub.StreamObserver<examples.HelloReply> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service Hello.
     */
    public static class HelloBlockingV2Stub extends io.grpc.stub.AbstractBlockingStub<HelloBlockingV2Stub> {

        private HelloBlockingV2Stub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected HelloBlockingV2Stub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new HelloBlockingV2Stub(channel, callOptions);
        }

        /**
         */
        public examples.HelloReply sayHello(examples.HelloRequest request) throws io.grpc.StatusException {
            return io.grpc.stub.ClientCalls.blockingV2UnaryCall(getChannel(), getSayHelloMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do limited synchronous rpc calls to service Hello.
     */
    public static class HelloBlockingStub extends io.grpc.stub.AbstractBlockingStub<HelloBlockingStub> {

        private HelloBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected HelloBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new HelloBlockingStub(channel, callOptions);
        }

        /**
         */
        public examples.HelloReply sayHello(examples.HelloRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getSayHelloMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service Hello.
     */
    public static class HelloFutureStub extends io.grpc.stub.AbstractFutureStub<HelloFutureStub> {

        private HelloFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected HelloFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new HelloFutureStub(channel, callOptions);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<examples.HelloReply> sayHello(examples.HelloRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_SAY_HELLO = 0;

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
                case METHODID_SAY_HELLO:
                    serviceImpl.sayHello((examples.HelloRequest) request, (io.grpc.stub.StreamObserver<examples.HelloReply>) responseObserver);
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
        return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getSayHelloMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<examples.HelloRequest, examples.HelloReply>(service, METHODID_SAY_HELLO))).build();
    }

    private static abstract class HelloBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        HelloBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return examples.HelloWorldProto.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("Hello");
        }
    }

    private static final class HelloFileDescriptorSupplier extends HelloBaseDescriptorSupplier {

        HelloFileDescriptorSupplier() {
        }
    }

    private static final class HelloMethodDescriptorSupplier extends HelloBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final java.lang.String methodName;

        HelloMethodDescriptorSupplier(java.lang.String methodName) {
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
            synchronized (HelloGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME).setSchemaDescriptor(new HelloFileDescriptorSupplier()).addMethod(getSayHelloMethod()).build();
                }
            }
        }
        return result;
    }
}
