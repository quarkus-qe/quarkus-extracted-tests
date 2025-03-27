package examples;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.quarkus.Generated(value = "by gRPC proto compiler (version 1.69.1)", comments = "Source: helloworld.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CopycatGrpc {

    private CopycatGrpc() {
    }

    public static final java.lang.String SERVICE_NAME = "helloworld.Copycat";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<examples.HelloRequest, examples.HelloReply> getSayCatMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "SayCat", requestType = examples.HelloRequest.class, responseType = examples.HelloReply.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<examples.HelloRequest, examples.HelloReply> getSayCatMethod() {
        io.grpc.MethodDescriptor<examples.HelloRequest, examples.HelloReply> getSayCatMethod;
        if ((getSayCatMethod = CopycatGrpc.getSayCatMethod) == null) {
            synchronized (CopycatGrpc.class) {
                if ((getSayCatMethod = CopycatGrpc.getSayCatMethod) == null) {
                    CopycatGrpc.getSayCatMethod = getSayCatMethod = io.grpc.MethodDescriptor.<examples.HelloRequest, examples.HelloReply>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayCat")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(examples.HelloRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(examples.HelloReply.getDefaultInstance())).setSchemaDescriptor(new CopycatMethodDescriptorSupplier("SayCat")).build();
                }
            }
        }
        return getSayCatMethod;
    }

    private static volatile io.grpc.MethodDescriptor<examples.HelloRequest, examples.HelloReply> getMultiCatMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "MultiCat", requestType = examples.HelloRequest.class, responseType = examples.HelloReply.class, methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
    public static io.grpc.MethodDescriptor<examples.HelloRequest, examples.HelloReply> getMultiCatMethod() {
        io.grpc.MethodDescriptor<examples.HelloRequest, examples.HelloReply> getMultiCatMethod;
        if ((getMultiCatMethod = CopycatGrpc.getMultiCatMethod) == null) {
            synchronized (CopycatGrpc.class) {
                if ((getMultiCatMethod = CopycatGrpc.getMultiCatMethod) == null) {
                    CopycatGrpc.getMultiCatMethod = getMultiCatMethod = io.grpc.MethodDescriptor.<examples.HelloRequest, examples.HelloReply>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING).setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiCat")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(examples.HelloRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(examples.HelloReply.getDefaultInstance())).setSchemaDescriptor(new CopycatMethodDescriptorSupplier("MultiCat")).build();
                }
            }
        }
        return getMultiCatMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static CopycatStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<CopycatStub> factory = new io.grpc.stub.AbstractStub.StubFactory<CopycatStub>() {

            @java.lang.Override
            public CopycatStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new CopycatStub(channel, callOptions);
            }
        };
        return CopycatStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static CopycatBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<CopycatBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<CopycatBlockingStub>() {

            @java.lang.Override
            public CopycatBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new CopycatBlockingStub(channel, callOptions);
            }
        };
        return CopycatBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static CopycatFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<CopycatFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<CopycatFutureStub>() {

            @java.lang.Override
            public CopycatFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new CopycatFutureStub(channel, callOptions);
            }
        };
        return CopycatFutureStub.newStub(factory, channel);
    }

    /**
     */
    public interface AsyncService {

        /**
         * <pre>
         * Sends a greeting
         * </pre>
         */
        default void sayCat(examples.HelloRequest request, io.grpc.stub.StreamObserver<examples.HelloReply> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayCatMethod(), responseObserver);
        }

        /**
         */
        default io.grpc.stub.StreamObserver<examples.HelloRequest> multiCat(io.grpc.stub.StreamObserver<examples.HelloReply> responseObserver) {
            return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getMultiCatMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service Copycat.
     */
    public static abstract class CopycatImplBase implements io.grpc.BindableService, AsyncService {

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return CopycatGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service Copycat.
     */
    public static class CopycatStub extends io.grpc.stub.AbstractAsyncStub<CopycatStub> {

        private CopycatStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected CopycatStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CopycatStub(channel, callOptions);
        }

        /**
         * <pre>
         * Sends a greeting
         * </pre>
         */
        public void sayCat(examples.HelloRequest request, io.grpc.stub.StreamObserver<examples.HelloReply> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getSayCatMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public io.grpc.stub.StreamObserver<examples.HelloRequest> multiCat(io.grpc.stub.StreamObserver<examples.HelloReply> responseObserver) {
            return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(getChannel().newCall(getMultiCatMethod(), getCallOptions()), responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service Copycat.
     */
    public static class CopycatBlockingStub extends io.grpc.stub.AbstractBlockingStub<CopycatBlockingStub> {

        private CopycatBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected CopycatBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CopycatBlockingStub(channel, callOptions);
        }

        /**
         * <pre>
         * Sends a greeting
         * </pre>
         */
        public examples.HelloReply sayCat(examples.HelloRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getSayCatMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service Copycat.
     */
    public static class CopycatFutureStub extends io.grpc.stub.AbstractFutureStub<CopycatFutureStub> {

        private CopycatFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected CopycatFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CopycatFutureStub(channel, callOptions);
        }

        /**
         * <pre>
         * Sends a greeting
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<examples.HelloReply> sayCat(examples.HelloRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getSayCatMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_SAY_CAT = 0;

    private static final int METHODID_MULTI_CAT = 1;

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
                case METHODID_SAY_CAT:
                    serviceImpl.sayCat((examples.HelloRequest) request, (io.grpc.stub.StreamObserver<examples.HelloReply>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_MULTI_CAT:
                    return (io.grpc.stub.StreamObserver<Req>) serviceImpl.multiCat((io.grpc.stub.StreamObserver<examples.HelloReply>) responseObserver);
                default:
                    throw new AssertionError();
            }
        }
    }

    public static io.grpc.ServerServiceDefinition bindService(AsyncService service) {
        return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getSayCatMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<examples.HelloRequest, examples.HelloReply>(service, METHODID_SAY_CAT))).addMethod(getMultiCatMethod(), io.grpc.stub.ServerCalls.asyncBidiStreamingCall(new MethodHandlers<examples.HelloRequest, examples.HelloReply>(service, METHODID_MULTI_CAT))).build();
    }

    private static abstract class CopycatBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        CopycatBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return examples.HelloWorldProto.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("Copycat");
        }
    }

    private static final class CopycatFileDescriptorSupplier extends CopycatBaseDescriptorSupplier {

        CopycatFileDescriptorSupplier() {
        }
    }

    private static final class CopycatMethodDescriptorSupplier extends CopycatBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final java.lang.String methodName;

        CopycatMethodDescriptorSupplier(java.lang.String methodName) {
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
            synchronized (CopycatGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME).setSchemaDescriptor(new CopycatFileDescriptorSupplier()).addMethod(getSayCatMethod()).addMethod(getMultiCatMethod()).build();
                }
            }
        }
        return result;
    }
}
