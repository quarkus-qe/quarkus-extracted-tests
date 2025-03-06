package io.quarkus.extest.deployment;
@io.quarkus.Generated("Quarkus annotation processor")
public final class TestProcessor$$accessor {
    private TestProcessor$$accessor() {}
    @SuppressWarnings("unchecked")
    public static Object get_configRoot(Object __instance) {
        return ((TestProcessor)__instance).configRoot;
    }
    @SuppressWarnings("unchecked")
    public static void set_configRoot(Object __instance, Object configRoot) {
        ((TestProcessor)__instance).configRoot = (io.quarkus.extest.runtime.config.TestConfigRoot)configRoot;
    }
    @SuppressWarnings("unchecked")
    public static Object get_buildTimeConfig(Object __instance) {
        return ((TestProcessor)__instance).buildTimeConfig;
    }
    @SuppressWarnings("unchecked")
    public static void set_buildTimeConfig(Object __instance, Object buildTimeConfig) {
        ((TestProcessor)__instance).buildTimeConfig = (io.quarkus.extest.runtime.config.TestBuildTimeConfig)buildTimeConfig;
    }
    @SuppressWarnings("unchecked")
    public static Object get_buildAndRunTimeConfig(Object __instance) {
        return ((TestProcessor)__instance).buildAndRunTimeConfig;
    }
    @SuppressWarnings("unchecked")
    public static void set_buildAndRunTimeConfig(Object __instance, Object buildAndRunTimeConfig) {
        ((TestProcessor)__instance).buildAndRunTimeConfig = (io.quarkus.extest.runtime.config.TestBuildAndRunTimeConfig)buildAndRunTimeConfig;
    }
}
