package io.grpc.examples.streaming;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@io.quarkus.Generated(value = "by gRPC proto compiler (version 1.65.1)", comments = "Source: streaming.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StreamingGrpc {

    private StreamingGrpc() {
    }

    public static final java.lang.String SERVICE_NAME = "streaming.Streaming";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<io.grpc.examples.streaming.Empty, io.grpc.examples.streaming.Item> getSourceMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "Source", requestType = io.grpc.examples.streaming.Empty.class, responseType = io.grpc.examples.streaming.Item.class, methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
    public static io.grpc.MethodDescriptor<io.grpc.examples.streaming.Empty, io.grpc.examples.streaming.Item> getSourceMethod() {
        io.grpc.MethodDescriptor<io.grpc.examples.streaming.Empty, io.grpc.examples.streaming.Item> getSourceMethod;
        if ((getSourceMethod = StreamingGrpc.getSourceMethod) == null) {
            synchronized (StreamingGrpc.class) {
                if ((getSourceMethod = StreamingGrpc.getSourceMethod) == null) {
                    StreamingGrpc.getSourceMethod = getSourceMethod = io.grpc.MethodDescriptor.<io.grpc.examples.streaming.Empty, io.grpc.examples.streaming.Item>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING).setFullMethodName(generateFullMethodName(SERVICE_NAME, "Source")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.streaming.Empty.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.streaming.Item.getDefaultInstance())).setSchemaDescriptor(new StreamingMethodDescriptorSupplier("Source")).build();
                }
            }
        }
        return getSourceMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.grpc.examples.streaming.Item, io.grpc.examples.streaming.Empty> getSinkMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "Sink", requestType = io.grpc.examples.streaming.Item.class, responseType = io.grpc.examples.streaming.Empty.class, methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
    public static io.grpc.MethodDescriptor<io.grpc.examples.streaming.Item, io.grpc.examples.streaming.Empty> getSinkMethod() {
        io.grpc.MethodDescriptor<io.grpc.examples.streaming.Item, io.grpc.examples.streaming.Empty> getSinkMethod;
        if ((getSinkMethod = StreamingGrpc.getSinkMethod) == null) {
            synchronized (StreamingGrpc.class) {
                if ((getSinkMethod = StreamingGrpc.getSinkMethod) == null) {
                    StreamingGrpc.getSinkMethod = getSinkMethod = io.grpc.MethodDescriptor.<io.grpc.examples.streaming.Item, io.grpc.examples.streaming.Empty>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING).setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sink")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.streaming.Item.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.streaming.Empty.getDefaultInstance())).setSchemaDescriptor(new StreamingMethodDescriptorSupplier("Sink")).build();
                }
            }
        }
        return getSinkMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.grpc.examples.streaming.Item, io.grpc.examples.streaming.Item> getPipeMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "Pipe", requestType = io.grpc.examples.streaming.Item.class, responseType = io.grpc.examples.streaming.Item.class, methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
    public static io.grpc.MethodDescriptor<io.grpc.examples.streaming.Item, io.grpc.examples.streaming.Item> getPipeMethod() {
        io.grpc.MethodDescriptor<io.grpc.examples.streaming.Item, io.grpc.examples.streaming.Item> getPipeMethod;
        if ((getPipeMethod = StreamingGrpc.getPipeMethod) == null) {
            synchronized (StreamingGrpc.class) {
                if ((getPipeMethod = StreamingGrpc.getPipeMethod) == null) {
                    StreamingGrpc.getPipeMethod = getPipeMethod = io.grpc.MethodDescriptor.<io.grpc.examples.streaming.Item, io.grpc.examples.streaming.Item>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING).setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pipe")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.streaming.Item.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.streaming.Item.getDefaultInstance())).setSchemaDescriptor(new StreamingMethodDescriptorSupplier("Pipe")).build();
                }
            }
        }
        return getPipeMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply> getQuickStringStreamMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "QuickStringStream", requestType = io.grpc.examples.streaming.StringRequest.class, responseType = io.grpc.examples.streaming.StringReply.class, methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
    public static io.grpc.MethodDescriptor<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply> getQuickStringStreamMethod() {
        io.grpc.MethodDescriptor<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply> getQuickStringStreamMethod;
        if ((getQuickStringStreamMethod = StreamingGrpc.getQuickStringStreamMethod) == null) {
            synchronized (StreamingGrpc.class) {
                if ((getQuickStringStreamMethod = StreamingGrpc.getQuickStringStreamMethod) == null) {
                    StreamingGrpc.getQuickStringStreamMethod = getQuickStringStreamMethod = io.grpc.MethodDescriptor.<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING).setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuickStringStream")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.streaming.StringRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.streaming.StringReply.getDefaultInstance())).setSchemaDescriptor(new StreamingMethodDescriptorSupplier("QuickStringStream")).build();
                }
            }
        }
        return getQuickStringStreamMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply> getMidStringStreamMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "MidStringStream", requestType = io.grpc.examples.streaming.StringRequest.class, responseType = io.grpc.examples.streaming.StringReply.class, methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
    public static io.grpc.MethodDescriptor<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply> getMidStringStreamMethod() {
        io.grpc.MethodDescriptor<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply> getMidStringStreamMethod;
        if ((getMidStringStreamMethod = StreamingGrpc.getMidStringStreamMethod) == null) {
            synchronized (StreamingGrpc.class) {
                if ((getMidStringStreamMethod = StreamingGrpc.getMidStringStreamMethod) == null) {
                    StreamingGrpc.getMidStringStreamMethod = getMidStringStreamMethod = io.grpc.MethodDescriptor.<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING).setFullMethodName(generateFullMethodName(SERVICE_NAME, "MidStringStream")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.streaming.StringRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.streaming.StringReply.getDefaultInstance())).setSchemaDescriptor(new StreamingMethodDescriptorSupplier("MidStringStream")).build();
                }
            }
        }
        return getMidStringStreamMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply> getQuickStringBiDiStreamMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "QuickStringBiDiStream", requestType = io.grpc.examples.streaming.StringRequest.class, responseType = io.grpc.examples.streaming.StringReply.class, methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
    public static io.grpc.MethodDescriptor<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply> getQuickStringBiDiStreamMethod() {
        io.grpc.MethodDescriptor<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply> getQuickStringBiDiStreamMethod;
        if ((getQuickStringBiDiStreamMethod = StreamingGrpc.getQuickStringBiDiStreamMethod) == null) {
            synchronized (StreamingGrpc.class) {
                if ((getQuickStringBiDiStreamMethod = StreamingGrpc.getQuickStringBiDiStreamMethod) == null) {
                    StreamingGrpc.getQuickStringBiDiStreamMethod = getQuickStringBiDiStreamMethod = io.grpc.MethodDescriptor.<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING).setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuickStringBiDiStream")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.streaming.StringRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.streaming.StringReply.getDefaultInstance())).setSchemaDescriptor(new StreamingMethodDescriptorSupplier("QuickStringBiDiStream")).build();
                }
            }
        }
        return getQuickStringBiDiStreamMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply> getMidStringBiDiStreamMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "MidStringBiDiStream", requestType = io.grpc.examples.streaming.StringRequest.class, responseType = io.grpc.examples.streaming.StringReply.class, methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
    public static io.grpc.MethodDescriptor<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply> getMidStringBiDiStreamMethod() {
        io.grpc.MethodDescriptor<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply> getMidStringBiDiStreamMethod;
        if ((getMidStringBiDiStreamMethod = StreamingGrpc.getMidStringBiDiStreamMethod) == null) {
            synchronized (StreamingGrpc.class) {
                if ((getMidStringBiDiStreamMethod = StreamingGrpc.getMidStringBiDiStreamMethod) == null) {
                    StreamingGrpc.getMidStringBiDiStreamMethod = getMidStringBiDiStreamMethod = io.grpc.MethodDescriptor.<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING).setFullMethodName(generateFullMethodName(SERVICE_NAME, "MidStringBiDiStream")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.streaming.StringRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.streaming.StringReply.getDefaultInstance())).setSchemaDescriptor(new StreamingMethodDescriptorSupplier("MidStringBiDiStream")).build();
                }
            }
        }
        return getMidStringBiDiStreamMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static StreamingStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<StreamingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<StreamingStub>() {

            @java.lang.Override
            public StreamingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new StreamingStub(channel, callOptions);
            }
        };
        return StreamingStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static StreamingBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<StreamingBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<StreamingBlockingStub>() {

            @java.lang.Override
            public StreamingBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new StreamingBlockingStub(channel, callOptions);
            }
        };
        return StreamingBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static StreamingFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<StreamingFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<StreamingFutureStub>() {

            @java.lang.Override
            public StreamingFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new StreamingFutureStub(channel, callOptions);
            }
        };
        return StreamingFutureStub.newStub(factory, channel);
    }

    /**
     * <pre>
     * Interface exported by the server.
     * </pre>
     */
    public interface AsyncService {

        /**
         */
        default void source(io.grpc.examples.streaming.Empty request, io.grpc.stub.StreamObserver<io.grpc.examples.streaming.Item> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSourceMethod(), responseObserver);
        }

        /**
         */
        default io.grpc.stub.StreamObserver<io.grpc.examples.streaming.Item> sink(io.grpc.stub.StreamObserver<io.grpc.examples.streaming.Empty> responseObserver) {
            return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSinkMethod(), responseObserver);
        }

        /**
         */
        default io.grpc.stub.StreamObserver<io.grpc.examples.streaming.Item> pipe(io.grpc.stub.StreamObserver<io.grpc.examples.streaming.Item> responseObserver) {
            return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getPipeMethod(), responseObserver);
        }

        /**
         */
        default io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringRequest> quickStringStream(io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringReply> responseObserver) {
            return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getQuickStringStreamMethod(), responseObserver);
        }

        /**
         */
        default io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringRequest> midStringStream(io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringReply> responseObserver) {
            return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getMidStringStreamMethod(), responseObserver);
        }

        /**
         */
        default io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringRequest> quickStringBiDiStream(io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringReply> responseObserver) {
            return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getQuickStringBiDiStreamMethod(), responseObserver);
        }

        /**
         */
        default io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringRequest> midStringBiDiStream(io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringReply> responseObserver) {
            return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getMidStringBiDiStreamMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service Streaming.
     * <pre>
     * Interface exported by the server.
     * </pre>
     */
    public static abstract class StreamingImplBase implements io.grpc.BindableService, AsyncService {

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return StreamingGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service Streaming.
     * <pre>
     * Interface exported by the server.
     * </pre>
     */
    public static class StreamingStub extends io.grpc.stub.AbstractAsyncStub<StreamingStub> {

        private StreamingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected StreamingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new StreamingStub(channel, callOptions);
        }

        /**
         */
        public void source(io.grpc.examples.streaming.Empty request, io.grpc.stub.StreamObserver<io.grpc.examples.streaming.Item> responseObserver) {
            io.grpc.stub.ClientCalls.asyncServerStreamingCall(getChannel().newCall(getSourceMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public io.grpc.stub.StreamObserver<io.grpc.examples.streaming.Item> sink(io.grpc.stub.StreamObserver<io.grpc.examples.streaming.Empty> responseObserver) {
            return io.grpc.stub.ClientCalls.asyncClientStreamingCall(getChannel().newCall(getSinkMethod(), getCallOptions()), responseObserver);
        }

        /**
         */
        public io.grpc.stub.StreamObserver<io.grpc.examples.streaming.Item> pipe(io.grpc.stub.StreamObserver<io.grpc.examples.streaming.Item> responseObserver) {
            return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(getChannel().newCall(getPipeMethod(), getCallOptions()), responseObserver);
        }

        /**
         */
        public io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringRequest> quickStringStream(io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringReply> responseObserver) {
            return io.grpc.stub.ClientCalls.asyncClientStreamingCall(getChannel().newCall(getQuickStringStreamMethod(), getCallOptions()), responseObserver);
        }

        /**
         */
        public io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringRequest> midStringStream(io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringReply> responseObserver) {
            return io.grpc.stub.ClientCalls.asyncClientStreamingCall(getChannel().newCall(getMidStringStreamMethod(), getCallOptions()), responseObserver);
        }

        /**
         */
        public io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringRequest> quickStringBiDiStream(io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringReply> responseObserver) {
            return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(getChannel().newCall(getQuickStringBiDiStreamMethod(), getCallOptions()), responseObserver);
        }

        /**
         */
        public io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringRequest> midStringBiDiStream(io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringReply> responseObserver) {
            return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(getChannel().newCall(getMidStringBiDiStreamMethod(), getCallOptions()), responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service Streaming.
     * <pre>
     * Interface exported by the server.
     * </pre>
     */
    public static class StreamingBlockingStub extends io.grpc.stub.AbstractBlockingStub<StreamingBlockingStub> {

        private StreamingBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected StreamingBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new StreamingBlockingStub(channel, callOptions);
        }

        /**
         */
        public java.util.Iterator<io.grpc.examples.streaming.Item> source(io.grpc.examples.streaming.Empty request) {
            return io.grpc.stub.ClientCalls.blockingServerStreamingCall(getChannel(), getSourceMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service Streaming.
     * <pre>
     * Interface exported by the server.
     * </pre>
     */
    public static class StreamingFutureStub extends io.grpc.stub.AbstractFutureStub<StreamingFutureStub> {

        private StreamingFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected StreamingFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new StreamingFutureStub(channel, callOptions);
        }
    }

    private static final int METHODID_SOURCE = 0;

    private static final int METHODID_SINK = 1;

    private static final int METHODID_PIPE = 2;

    private static final int METHODID_QUICK_STRING_STREAM = 3;

    private static final int METHODID_MID_STRING_STREAM = 4;

    private static final int METHODID_QUICK_STRING_BI_DI_STREAM = 5;

    private static final int METHODID_MID_STRING_BI_DI_STREAM = 6;

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
                case METHODID_SOURCE:
                    serviceImpl.source((io.grpc.examples.streaming.Empty) request, (io.grpc.stub.StreamObserver<io.grpc.examples.streaming.Item>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_SINK:
                    return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sink((io.grpc.stub.StreamObserver<io.grpc.examples.streaming.Empty>) responseObserver);
                case METHODID_PIPE:
                    return (io.grpc.stub.StreamObserver<Req>) serviceImpl.pipe((io.grpc.stub.StreamObserver<io.grpc.examples.streaming.Item>) responseObserver);
                case METHODID_QUICK_STRING_STREAM:
                    return (io.grpc.stub.StreamObserver<Req>) serviceImpl.quickStringStream((io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringReply>) responseObserver);
                case METHODID_MID_STRING_STREAM:
                    return (io.grpc.stub.StreamObserver<Req>) serviceImpl.midStringStream((io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringReply>) responseObserver);
                case METHODID_QUICK_STRING_BI_DI_STREAM:
                    return (io.grpc.stub.StreamObserver<Req>) serviceImpl.quickStringBiDiStream((io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringReply>) responseObserver);
                case METHODID_MID_STRING_BI_DI_STREAM:
                    return (io.grpc.stub.StreamObserver<Req>) serviceImpl.midStringBiDiStream((io.grpc.stub.StreamObserver<io.grpc.examples.streaming.StringReply>) responseObserver);
                default:
                    throw new AssertionError();
            }
        }
    }

    public static io.grpc.ServerServiceDefinition bindService(AsyncService service) {
        return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getSourceMethod(), io.grpc.stub.ServerCalls.asyncServerStreamingCall(new MethodHandlers<io.grpc.examples.streaming.Empty, io.grpc.examples.streaming.Item>(service, METHODID_SOURCE))).addMethod(getSinkMethod(), io.grpc.stub.ServerCalls.asyncClientStreamingCall(new MethodHandlers<io.grpc.examples.streaming.Item, io.grpc.examples.streaming.Empty>(service, METHODID_SINK))).addMethod(getPipeMethod(), io.grpc.stub.ServerCalls.asyncBidiStreamingCall(new MethodHandlers<io.grpc.examples.streaming.Item, io.grpc.examples.streaming.Item>(service, METHODID_PIPE))).addMethod(getQuickStringStreamMethod(), io.grpc.stub.ServerCalls.asyncClientStreamingCall(new MethodHandlers<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply>(service, METHODID_QUICK_STRING_STREAM))).addMethod(getMidStringStreamMethod(), io.grpc.stub.ServerCalls.asyncClientStreamingCall(new MethodHandlers<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply>(service, METHODID_MID_STRING_STREAM))).addMethod(getQuickStringBiDiStreamMethod(), io.grpc.stub.ServerCalls.asyncBidiStreamingCall(new MethodHandlers<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply>(service, METHODID_QUICK_STRING_BI_DI_STREAM))).addMethod(getMidStringBiDiStreamMethod(), io.grpc.stub.ServerCalls.asyncBidiStreamingCall(new MethodHandlers<io.grpc.examples.streaming.StringRequest, io.grpc.examples.streaming.StringReply>(service, METHODID_MID_STRING_BI_DI_STREAM))).build();
    }

    private static abstract class StreamingBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        StreamingBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return io.grpc.examples.streaming.StreamingProto.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("Streaming");
        }
    }

    private static final class StreamingFileDescriptorSupplier extends StreamingBaseDescriptorSupplier {

        StreamingFileDescriptorSupplier() {
        }
    }

    private static final class StreamingMethodDescriptorSupplier extends StreamingBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final java.lang.String methodName;

        StreamingMethodDescriptorSupplier(java.lang.String methodName) {
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
            synchronized (StreamingGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME).setSchemaDescriptor(new StreamingFileDescriptorSupplier()).addMethod(getSourceMethod()).addMethod(getSinkMethod()).addMethod(getPipeMethod()).addMethod(getQuickStringStreamMethod()).addMethod(getMidStringStreamMethod()).addMethod(getQuickStringBiDiStreamMethod()).addMethod(getMidStringBiDiStreamMethod()).build();
                }
            }
        }
        return result;
    }
}
