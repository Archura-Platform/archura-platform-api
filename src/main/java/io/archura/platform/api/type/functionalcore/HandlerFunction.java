package io.archura.platform.api.type.functionalcore;

import io.archura.platform.api.http.HttpServerRequest;
import io.archura.platform.api.http.HttpServerResponse;

@FunctionalInterface
public interface HandlerFunction<T extends HttpServerResponse> {

    T handle(HttpServerRequest request);

}