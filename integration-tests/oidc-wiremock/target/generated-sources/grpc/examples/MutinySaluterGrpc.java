package examples;

import static examples.SaluterGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: saluter.proto")
public final class MutinySaluterGrpc implements io.quarkus.grpc.MutinyGrpc {

    private MutinySaluterGrpc() {
    }

    public static MutinySaluterStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinySaluterStub(channel);
    }

    /**
     * <pre>
     *  The greeting service definition.
     * </pre>
     */
    public static class MutinySaluterStub extends io.grpc.stub.AbstractStub<MutinySaluterStub> implements io.quarkus.grpc.MutinyStub {

        private SaluterGrpc.SaluterStub delegateStub;

        private MutinySaluterStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = SaluterGrpc.newStub(channel);
        }

        private MutinySaluterStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = SaluterGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinySaluterStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinySaluterStub(channel, callOptions);
        }

        /**
         * <pre>
         *  Sends a greeting
         *  Name is &#39;Bearer&#39; in order to match tenant name
         * </pre>
         */
        public io.smallrye.mutiny.Uni<examples.SaluteReply> bearer(examples.SaluteRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::bearer);
        }
    }

    /**
     * <pre>
     *  The greeting service definition.
     * </pre>
     */
    public static abstract class SaluterImplBase implements io.grpc.BindableService {

        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public SaluterImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        /**
         * <pre>
         *  Sends a greeting
         *  Name is &#39;Bearer&#39; in order to match tenant name
         * </pre>
         */
        public io.smallrye.mutiny.Uni<examples.SaluteReply> bearer(examples.SaluteRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(examples.SaluterGrpc.getBearerMethod(), asyncUnaryCall(new MethodHandlers<examples.SaluteRequest, examples.SaluteReply>(this, METHODID_BEARER, compression))).build();
        }
    }

    private static final int METHODID_BEARER = 0;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final SaluterImplBase serviceImpl;

        private final int methodId;

        private final String compression;

        MethodHandlers(SaluterImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_BEARER:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((examples.SaluteRequest) request, (io.grpc.stub.StreamObserver<examples.SaluteReply>) responseObserver, compression, serviceImpl::bearer);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }
}
