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
import java.util.Set;

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
        final Set<String> headerKeys = getRequestHeaders().keySet();
        for (String headerKey : headerKeys) {
            if (headerKey.equalsIgnoreCase(key)) {
                return getRequestHeaders().get(headerKey).get(0);
            }
        }
        return null;
    }

}
