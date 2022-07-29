package io.archura.platform.api.exception;

public class FunctionIsNotAStreamConsumerException extends RuntimeException {
    public FunctionIsNotAStreamConsumerException(String message) {
        super(message);
    }
}
