package io.quarkus.grpc.examples.stork;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import io.smallrye.stork.api.config.ConfigWithType;

/**
 *  Configuration for the {@code DelayedServiceDiscoveryProvider} ServiceDiscovery.
 */
 public class DelayedConfiguration implements io.smallrye.stork.api.config.ConfigWithType{
   private final Map<String, String> parameters;

   /**
    * Creates a new DelayedConfiguration
    *
    * @param params the parameters, must not be {@code null}
    */
   public DelayedConfiguration(Map<String, String> params) {
      parameters = Collections.unmodifiableMap(params);
   }

   /**
    * Creates a new DelayedConfiguration
    */
   public DelayedConfiguration() {
      parameters = Collections.emptyMap();
   }


  /**
   * @return the type
   */
   @Override
   public String type() {
      return "delayed";
   }


   /**
    * @return the parameters
    */
   @Override
   public Map<String, String> parameters() {
      return parameters;
   }

   private DelayedConfiguration extend(String key, String value) {
      Map<String, String> copy = new HashMap<>(parameters);
      copy.put(key, value);
      return new DelayedConfiguration(copy);
   }

   /**
    * comma-separated host:port list served once the delay elapses
    *
    * @return the configured address-list, @{code null} if not set
    */
   public String getAddressList() {
      return parameters.get("address-list");
   }

   /**
    * Set the 'address-list' attribute.
    * 
    * @param value the value for address-list
    * @return the current DelayedConfiguration to chain calls
    */
   public DelayedConfiguration withAddressList(String value) {
      return extend("address-list", value);
   }

   /**
    * milliseconds after the first lookup before instances become available
    *
    * @return the configured available-after-ms, @{code null} if not set
    */
   public String getAvailableAfterMs() {
      return parameters.get("available-after-ms");
   }

   /**
    * Set the 'available-after-ms' attribute.
    * 
    * @param value the value for available-after-ms
    * @return the current DelayedConfiguration to chain calls
    */
   public DelayedConfiguration withAvailableAfterMs(String value) {
      return extend("available-after-ms", value);
   }
}
