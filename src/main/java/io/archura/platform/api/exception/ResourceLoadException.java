package io.archura.platform.api.exception;

public class ResourceLoadException extends RuntimeException {
    public ResourceLoadException(final Exception exception) {
        super(exception);
    }
}
