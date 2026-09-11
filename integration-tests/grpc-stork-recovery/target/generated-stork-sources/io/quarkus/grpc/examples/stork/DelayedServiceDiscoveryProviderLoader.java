package io.quarkus.grpc.examples.stork;

import io.quarkus.grpc.examples.stork.DelayedConfiguration;
import io.quarkus.grpc.examples.stork.DelayedServiceDiscoveryProvider;
import io.smallrye.stork.api.ServiceDiscovery;
import io.smallrye.stork.api.config.ConfigWithType;
import io.smallrye.stork.api.config.ServiceConfig;
import io.smallrye.stork.spi.StorkInfrastructure;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * ServiceDiscoveryLoader for {@link io.quarkus.grpc.examples.stork.DelayedServiceDiscoveryProvider}
 */
 @ApplicationScoped
 public class DelayedServiceDiscoveryProviderLoader implements io.smallrye.stork.spi.internal.ServiceDiscoveryLoader {
   private final io.quarkus.grpc.examples.stork.DelayedServiceDiscoveryProvider provider;
   public DelayedServiceDiscoveryProviderLoader() {
       io.quarkus.grpc.examples.stork.DelayedServiceDiscoveryProvider actual = null;
       try {
          actual = CDI.current().select(io.quarkus.grpc.examples.stork.DelayedServiceDiscoveryProvider.class).get();
       } catch(Exception e) { 
          // Use direct instantiation
          actual = new io.quarkus.grpc.examples.stork.DelayedServiceDiscoveryProvider();
       } 
       this.provider = actual;
   }

   @Override
   public ServiceDiscovery createServiceDiscovery(ConfigWithType config, String serviceName,
              ServiceConfig serviceConfig, StorkInfrastructure storkInfrastructure) {
      io.quarkus.grpc.examples.stork.DelayedConfiguration typedConfig = new io.quarkus.grpc.examples.stork.DelayedConfiguration(config.parameters());
      return provider.createServiceDiscovery(typedConfig, serviceName, serviceConfig, storkInfrastructure);
   }

  /**
   * @return the type
   */
   @Override
   public String type() {
      return "delayed";
   }
}
