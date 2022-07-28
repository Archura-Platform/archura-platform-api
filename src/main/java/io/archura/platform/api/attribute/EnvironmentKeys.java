package io.archura.platform.api.attribute;

public enum EnvironmentKeys {

    TENANT_NOT_SET("NO_TENT"),
    DEFAULT_TENANT_ID("default"),
    REQUEST_TENANT_ID("ARCHURA_REQUEST_TENANT_ID");

    private final String key;

    EnvironmentKeys(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

}
