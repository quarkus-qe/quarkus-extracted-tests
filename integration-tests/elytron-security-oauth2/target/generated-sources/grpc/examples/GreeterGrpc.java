package examples;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@io.quarkus.Generated(value = "by gRPC proto compiler (version 1.65.1)", comments = "Source: helloworld.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GreeterGrpc {

    private GreeterGrpc() {
    }

    public static final java.lang.String SERVICE_NAME = "helloworld.Greeter";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<examples.HelloRequest, examples.HelloReply> getSayHelloReaderMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "sayHelloReader", requestType = examples.HelloRequest.class, responseType = examples.HelloReply.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<examples.HelloRequest, examples.HelloReply> getSayHelloReaderMethod() {
        io.grpc.MethodDescriptor<examples.HelloRequest, examples.HelloReply> getSayHelloReaderMethod;
        if ((getSayHelloReaderMethod = GreeterGrpc.getSayHelloReaderMethod) == null) {
            synchronized (GreeterGrpc.class) {
                if ((getSayHelloReaderMethod = GreeterGrpc.getSayHelloReaderMethod) == null) {
                    GreeterGrpc.getSayHelloReaderMethod = getSayHelloReaderMethod = io.grpc.MethodDescriptor.<examples.HelloRequest, examples.HelloReply>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "sayHelloReader")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(examples.HelloRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(examples.HelloReply.getDefaultInstance())).setSchemaDescriptor(new GreeterMethodDescriptorSupplier("sayHelloReader")).build();
                }
            }
        }
        return getSayHelloReaderMethod;
    }

    private static volatile io.grpc.MethodDescriptor<examples.HelloRequest, examples.HelloReply> getSayHelloWriterMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "sayHelloWriter", requestType = examples.HelloRequest.class, responseType = examples.HelloReply.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<examples.HelloRequest, examples.HelloReply> getSayHelloWriterMethod() {
        io.grpc.MethodDescriptor<examples.HelloRequest, examples.HelloReply> getSayHelloWriterMethod;
        if ((getSayHelloWriterMethod = GreeterGrpc.getSayHelloWriterMethod) == null) {
            synchronized (GreeterGrpc.class) {
                if ((getSayHelloWriterMethod = GreeterGrpc.getSayHelloWriterMethod) == null) {
                    GreeterGrpc.getSayHelloWriterMethod = getSayHelloWriterMethod = io.grpc.MethodDescriptor.<examples.HelloRequest, examples.HelloReply>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "sayHelloWriter")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(examples.HelloRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(examples.HelloReply.getDefaultInstance())).setSchemaDescriptor(new GreeterMethodDescriptorSupplier("sayHelloWriter")).build();
                }
            }
        }
        return getSayHelloWriterMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static GreeterStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<GreeterStub> factory = new io.grpc.stub.AbstractStub.StubFactory<GreeterStub>() {

            @java.lang.Override
            public GreeterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new GreeterStub(channel, callOptions);
            }
        };
        return GreeterStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static GreeterBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub>() {

            @java.lang.Override
            public GreeterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new GreeterBlockingStub(channel, callOptions);
            }
        };
        return GreeterBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static GreeterFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub>() {

            @java.lang.Override
            public GreeterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new GreeterFutureStub(channel, callOptions);
            }
        };
        return GreeterFutureStub.newStub(factory, channel);
    }

    /**
     * <pre>
     * The greeting service definition.
     * </pre>
     */
    public interface AsyncService {

        /**
         * <pre>
         * Sends a greeting
         * </pre>
         */
        default void sayHelloReader(examples.HelloRequest request, io.grpc.stub.StreamObserver<examples.HelloReply> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloReaderMethod(), responseObserver);
        }

        /**
         */
        default void sayHelloWriter(examples.HelloRequest request, io.grpc.stub.StreamObserver<examples.HelloReply> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloWriterMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service Greeter.
     * <pre>
     * The greeting service definition.
     * </pre>
     */
    public static abstract class GreeterImplBase implements io.grpc.BindableService, AsyncService {

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return GreeterGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service Greeter.
     * <pre>
     * The greeting service definition.
     * </pre>
     */
    public static class GreeterStub extends io.grpc.stub.AbstractAsyncStub<GreeterStub> {

        private GreeterStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected GreeterStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new GreeterStub(channel, callOptions);
        }

        /**
         * <pre>
         * Sends a greeting
         * </pre>
         */
        public void sayHelloReader(examples.HelloRequest request, io.grpc.stub.StreamObserver<examples.HelloReply> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getSayHelloReaderMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void sayHelloWriter(examples.HelloRequest request, io.grpc.stub.StreamObserver<examples.HelloReply> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getSayHelloWriterMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service Greeter.
     * <pre>
     * The greeting service definition.
     * </pre>
     */
    public static class GreeterBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreeterBlockingStub> {

        private GreeterBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected GreeterBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new GreeterBlockingStub(channel, callOptions);
        }

        /**
         * <pre>
         * Sends a greeting
         * </pre>
         */
        public examples.HelloReply sayHelloReader(examples.HelloRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getSayHelloReaderMethod(), getCallOptions(), request);
        }

        /**
         */
        public examples.HelloReply sayHelloWriter(examples.HelloRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getSayHelloWriterMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service Greeter.
     * <pre>
     * The greeting service definition.
     * </pre>
     */
    public static class GreeterFutureStub extends io.grpc.stub.AbstractFutureStub<GreeterFutureStub> {

        private GreeterFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected GreeterFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new GreeterFutureStub(channel, callOptions);
        }

        /**
         * <pre>
         * Sends a greeting
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<examples.HelloReply> sayHelloReader(examples.HelloRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getSayHelloReaderMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<examples.HelloReply> sayHelloWriter(examples.HelloRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getSayHelloWriterMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_SAY_HELLO_READER = 0;

    private static final int METHODID_SAY_HELLO_WRITER = 1;

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
                case METHODID_SAY_HELLO_READER:
                    serviceImpl.sayHelloReader((examples.HelloRequest) request, (io.grpc.stub.StreamObserver<examples.HelloReply>) responseObserver);
                    break;
                case METHODID_SAY_HELLO_WRITER:
                    serviceImpl.sayHelloWriter((examples.HelloRequest) request, (io.grpc.stub.StreamObserver<examples.HelloReply>) responseObserver);
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
        return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getSayHelloReaderMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<examples.HelloRequest, examples.HelloReply>(service, METHODID_SAY_HELLO_READER))).addMethod(getSayHelloWriterMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<examples.HelloRequest, examples.HelloReply>(service, METHODID_SAY_HELLO_WRITER))).build();
    }

    private static abstract class GreeterBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        GreeterBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return examples.HelloWorldProto.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("Greeter");
        }
    }

    private static final class GreeterFileDescriptorSupplier extends GreeterBaseDescriptorSupplier {

        GreeterFileDescriptorSupplier() {
        }
    }

    private static final class GreeterMethodDescriptorSupplier extends GreeterBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final java.lang.String methodName;

        GreeterMethodDescriptorSupplier(java.lang.String methodName) {
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
            synchronized (GreeterGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME).setSchemaDescriptor(new GreeterFileDescriptorSupplier()).addMethod(getSayHelloReaderMethod()).addMethod(getSayHelloWriterMethod()).build();
                }
            }
        }
        return result;
    }
}
