package examples;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class SaluterGrpc {

    private SaluterGrpc() {
    }

    public static final java.lang.String SERVICE_NAME = "saluter.Saluter";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<examples.SaluteRequest, examples.SaluteReply> getBearerMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "bearer", requestType = examples.SaluteRequest.class, responseType = examples.SaluteReply.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<examples.SaluteRequest, examples.SaluteReply> getBearerMethod() {
        io.grpc.MethodDescriptor<examples.SaluteRequest, examples.SaluteReply> getBearerMethod;
        if ((getBearerMethod = SaluterGrpc.getBearerMethod) == null) {
            synchronized (SaluterGrpc.class) {
                if ((getBearerMethod = SaluterGrpc.getBearerMethod) == null) {
                    SaluterGrpc.getBearerMethod = getBearerMethod = io.grpc.MethodDescriptor.<examples.SaluteRequest, examples.SaluteReply>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "bearer")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(examples.SaluteRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(examples.SaluteReply.getDefaultInstance())).setSchemaDescriptor(new SaluterMethodDescriptorSupplier("bearer")).build();
                }
            }
        }
        return getBearerMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static SaluterStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<SaluterStub> factory = new io.grpc.stub.AbstractStub.StubFactory<SaluterStub>() {

            @java.lang.Override
            public SaluterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new SaluterStub(channel, callOptions);
            }
        };
        return SaluterStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports all types of calls on the service
     */
    public static SaluterBlockingV2Stub newBlockingV2Stub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<SaluterBlockingV2Stub> factory = new io.grpc.stub.AbstractStub.StubFactory<SaluterBlockingV2Stub>() {

            @java.lang.Override
            public SaluterBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new SaluterBlockingV2Stub(channel, callOptions);
            }
        };
        return SaluterBlockingV2Stub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static SaluterBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<SaluterBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<SaluterBlockingStub>() {

            @java.lang.Override
            public SaluterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new SaluterBlockingStub(channel, callOptions);
            }
        };
        return SaluterBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static SaluterFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<SaluterFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<SaluterFutureStub>() {

            @java.lang.Override
            public SaluterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new SaluterFutureStub(channel, callOptions);
            }
        };
        return SaluterFutureStub.newStub(factory, channel);
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
         * Name is 'Bearer' in order to match tenant name
         * </pre>
         */
        default void bearer(examples.SaluteRequest request, io.grpc.stub.StreamObserver<examples.SaluteReply> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBearerMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service Saluter.
     * <pre>
     * The greeting service definition.
     * </pre>
     */
    public static abstract class SaluterImplBase implements io.grpc.BindableService, AsyncService {

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return SaluterGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service Saluter.
     * <pre>
     * The greeting service definition.
     * </pre>
     */
    public static class SaluterStub extends io.grpc.stub.AbstractAsyncStub<SaluterStub> {

        private SaluterStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected SaluterStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new SaluterStub(channel, callOptions);
        }

        /**
         * <pre>
         * Sends a greeting
         * Name is 'Bearer' in order to match tenant name
         * </pre>
         */
        public void bearer(examples.SaluteRequest request, io.grpc.stub.StreamObserver<examples.SaluteReply> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getBearerMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service Saluter.
     * <pre>
     * The greeting service definition.
     * </pre>
     */
    public static class SaluterBlockingV2Stub extends io.grpc.stub.AbstractBlockingStub<SaluterBlockingV2Stub> {

        private SaluterBlockingV2Stub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected SaluterBlockingV2Stub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new SaluterBlockingV2Stub(channel, callOptions);
        }

        /**
         * <pre>
         * Sends a greeting
         * Name is 'Bearer' in order to match tenant name
         * </pre>
         */
        public examples.SaluteReply bearer(examples.SaluteRequest request) throws io.grpc.StatusException {
            return io.grpc.stub.ClientCalls.blockingV2UnaryCall(getChannel(), getBearerMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do limited synchronous rpc calls to service Saluter.
     * <pre>
     * The greeting service definition.
     * </pre>
     */
    public static class SaluterBlockingStub extends io.grpc.stub.AbstractBlockingStub<SaluterBlockingStub> {

        private SaluterBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected SaluterBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new SaluterBlockingStub(channel, callOptions);
        }

        /**
         * <pre>
         * Sends a greeting
         * Name is 'Bearer' in order to match tenant name
         * </pre>
         */
        public examples.SaluteReply bearer(examples.SaluteRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getBearerMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service Saluter.
     * <pre>
     * The greeting service definition.
     * </pre>
     */
    public static class SaluterFutureStub extends io.grpc.stub.AbstractFutureStub<SaluterFutureStub> {

        private SaluterFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected SaluterFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new SaluterFutureStub(channel, callOptions);
        }

        /**
         * <pre>
         * Sends a greeting
         * Name is 'Bearer' in order to match tenant name
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<examples.SaluteReply> bearer(examples.SaluteRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getBearerMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_BEARER = 0;

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
                case METHODID_BEARER:
                    serviceImpl.bearer((examples.SaluteRequest) request, (io.grpc.stub.StreamObserver<examples.SaluteReply>) responseObserver);
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
        return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getBearerMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<examples.SaluteRequest, examples.SaluteReply>(service, METHODID_BEARER))).build();
    }

    private static abstract class SaluterBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        SaluterBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return examples.SaluterProto.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("Saluter");
        }
    }

    private static final class SaluterFileDescriptorSupplier extends SaluterBaseDescriptorSupplier {

        SaluterFileDescriptorSupplier() {
        }
    }

    private static final class SaluterMethodDescriptorSupplier extends SaluterBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final java.lang.String methodName;

        SaluterMethodDescriptorSupplier(java.lang.String methodName) {
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
            synchronized (SaluterGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME).setSchemaDescriptor(new SaluterFileDescriptorSupplier()).addMethod(getBearerMethod()).build();
                }
            }
        }
        return result;
    }
}
