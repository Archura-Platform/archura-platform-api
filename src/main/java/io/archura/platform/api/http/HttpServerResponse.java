package io.archura.platform.api.http;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class HttpServerResponse {
    private byte[] bytes = new byte[]{};
    private int status = HttpStatusCode.HTTP_OK;
    private Map<String, List<String>> headers = new HashMap<>();

    public void setHeader(final String key, final String value) {
        final List<String> values = headers.getOrDefault(key, new ArrayList<>());
        values.add(value);
        headers.put(key, values);
    }

    public static class HttpServerResponseBuilder {
        private Map<String, List<String>> headers = new HashMap<>();

        public HttpServerResponseBuilder header(final String key, final String value) {
            final List<String> values = headers.getOrDefault(key, new ArrayList<>());
            values.add(value);
            headers.put(key, values);
            return this;
        }
    }

}
