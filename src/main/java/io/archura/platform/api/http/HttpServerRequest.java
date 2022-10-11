package io.archura.platform.api.http;

import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;

import static java.util.Objects.nonNull;

public interface HttpServerRequest {

    Map<String, List<String>> getRequestHeaders();

    default String getFirstHeader(String key) {
        if (getRequestHeaders().containsKey(key)
                && nonNull(getRequestHeaders().get(key))
                && !getRequestHeaders().isEmpty()) {
            return getRequestHeaders().get(key).get(0);
        }
        return null;
    }

    URI getRequestURI();

    String getRequestMethod();

    InputStream getRequestStream();

    byte[] getRequestBytes();

    String getRequestBody();

    Map<String, Object> getAttributes();

}
