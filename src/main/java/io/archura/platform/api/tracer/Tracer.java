package io.archura.platform.api.tracer;

import java.util.Map;

public interface Tracer {

    /**
     * Traces the request and response data.
     *
     * @param attributes Key value pairs to be traced.
     */
    void trace(Map<String, Object> attributes);

}
