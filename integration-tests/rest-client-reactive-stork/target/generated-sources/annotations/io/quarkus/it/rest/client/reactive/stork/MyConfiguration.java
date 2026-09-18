package io.quarkus.it.rest.client.reactive.stork;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import io.smallrye.stork.api.config.ConfigWithType;

/**
 *  Configuration for the {@code MyServiceDiscoveryProvider} ServiceDiscovery.
 */
 public class MyConfiguration implements io.smallrye.stork.api.config.ConfigWithType{
   private final Map<String, String> parameters;

   /**
    * Creates a new MyConfiguration
    *
    * @param params the parameters, must not be {@code null}
    */
   public MyConfiguration(Map<String, String> params) {
      parameters = Collections.unmodifiableMap(params);
   }

   /**
    * Creates a new MyConfiguration
    */
   public MyConfiguration() {
      parameters = Collections.emptyMap();
   }


  /**
   * @return the type
   */
   @Override
   public String type() {
      return "my";
   }


   /**
    * @return the parameters
    */
   @Override
   public Map<String, String> parameters() {
      return parameters;
   }

   private MyConfiguration extend(String key, String value) {
      Map<String, String> copy = new HashMap<>(parameters);
      copy.put(key, value);
      return new MyConfiguration(copy);
   }

   /**
    * https
    *
    * @return the configured secure, @{code null} if not set
    */
   public String getSecure() {
      return parameters.get("secure");
   }

   /**
    * Set the 'secure' attribute.
    * 
    * @param value the value for secure
    * @return the current MyConfiguration to chain calls
    */
   public MyConfiguration withSecure(String value) {
      return extend("secure", value);
   }

   /**
    * a comma-separated list of addresses
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
    * @return the current MyConfiguration to chain calls
    */
   public MyConfiguration withAddressList(String value) {
      return extend("address-list", value);
   }
}
