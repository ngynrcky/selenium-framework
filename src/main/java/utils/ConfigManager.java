package utils;

public class ConfigManager {

    /**
     * Unified way to resolve config values.
     * Priority:
     * 1. System property (-Dkey=value)
     * 2. Environment variable (KEY=value)
     * 3. config.properties file
     * 4. defaultValue
     */
    public static String get(String key) {
        String systemProp = System.getProperty(key);
        if (systemProp != null) return systemProp;

        // Convert camelCase to SCREAMING_SNAKE_CASE for env lookup
        String envKey = key.replaceAll("([a-z])([A-Z]+)", "$1_$2").toUpperCase();
        String envVar = System.getenv(envKey);
        if (envVar != null) return envVar;

        String propFile = ConfigReader.get(key); // falls back to config.properties
        if (propFile != null) return propFile;

        throw new IllegalStateException(String.format(
                "Configuration value for '%s' not found. " + "Please set it via: system property (-D%s), "
                        + "environment variable (%s), or config.properties",
                key, key, envKey));
    }
}
