package examples;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: saluter.proto")
public interface Saluter extends MutinyService {

    /**
     * <pre>
     *  Sends a greeting
     *  Name is &#39;Bearer&#39; in order to match tenant name
     * </pre>
     */
    io.smallrye.mutiny.Uni<examples.SaluteReply> bearer(examples.SaluteRequest request);
}
