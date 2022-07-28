package io.archura.platform.api.attribute;

public enum GlobalKeys {

    ENVIRONMENT_NOT_SET("NO_ENVI"),
    DEFAULT_ENVIRONMENT("default"),
    REQUEST_ENVIRONMENT("ARCHURA_REQUEST_ENVIRONMENT"),
    DEFAULT_LOG_LEVEL("info"),
    REQUEST_LOG_LEVEL("ARCHURA_REQUEST_LOG_LEVEL"),
    REQUEST_LOG_TEMPLATE("ARCHURA_REQUEST_LOG_TEMPLATE");


    private final String key;

    GlobalKeys(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

}
