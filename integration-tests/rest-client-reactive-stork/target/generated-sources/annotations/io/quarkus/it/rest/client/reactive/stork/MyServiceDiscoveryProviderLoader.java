package io.quarkus.it.rest.client.reactive.stork;

import io.quarkus.it.rest.client.reactive.stork.MyConfiguration;
import io.quarkus.it.rest.client.reactive.stork.MyServiceDiscoveryProvider;
import io.smallrye.stork.api.ServiceDiscovery;
import io.smallrye.stork.api.config.ConfigWithType;
import io.smallrye.stork.api.config.ServiceConfig;
import io.smallrye.stork.spi.StorkInfrastructure;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * ServiceDiscoveryLoader for {@link io.quarkus.it.rest.client.reactive.stork.MyServiceDiscoveryProvider}
 */
 @ApplicationScoped
 public class MyServiceDiscoveryProviderLoader implements io.smallrye.stork.spi.internal.ServiceDiscoveryLoader {
   private final io.quarkus.it.rest.client.reactive.stork.MyServiceDiscoveryProvider provider;
   public MyServiceDiscoveryProviderLoader() {
       io.quarkus.it.rest.client.reactive.stork.MyServiceDiscoveryProvider actual = null;
       try {
          actual = CDI.current().select(io.quarkus.it.rest.client.reactive.stork.MyServiceDiscoveryProvider.class).get();
       } catch(Exception e) { 
          // Use direct instantiation
          actual = new io.quarkus.it.rest.client.reactive.stork.MyServiceDiscoveryProvider();
       } 
       this.provider = actual;
   }

   @Override
   public ServiceDiscovery createServiceDiscovery(ConfigWithType config, String serviceName,
              ServiceConfig serviceConfig, StorkInfrastructure storkInfrastructure) {
      io.quarkus.it.rest.client.reactive.stork.MyConfiguration typedConfig = new io.quarkus.it.rest.client.reactive.stork.MyConfiguration(config.parameters());
      return provider.createServiceDiscovery(typedConfig, serviceName, serviceConfig, storkInfrastructure);
   }

  /**
   * @return the type
   */
   @Override
   public String type() {
      return "my";
   }
}
