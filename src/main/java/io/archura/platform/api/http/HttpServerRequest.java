package io.archura.platform.api.http;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.List;
import java.util.Map;

import static java.util.Objects.nonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class HttpServerRequest {

    URI requestURI;
    String requestMethod;
    Map<String, List<String>> requestHeaders;
    InputStream requestBody;
    Map<String, Object> attributes;
    InetSocketAddress remoteAddress;

    public String getFirstHeader(String key) {
        if (getRequestHeaders().containsKey(key)
                && nonNull(getRequestHeaders().get(key))
                && !getRequestHeaders().isEmpty()) {
            return getRequestHeaders().get(key).get(0);
        }
        return null;
    }

}
