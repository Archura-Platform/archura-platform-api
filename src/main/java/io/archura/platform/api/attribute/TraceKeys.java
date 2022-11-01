package io.archura.platform.api.attribute;

public enum TraceKeys {
    TRACE_HEADER_NAME("X-A-Trace-ID"),
    SPAN_HEADER_NAME("X-A-Span-ID"),
    SPAN_REQUEST_URL("X-A-Span-RequestUrl"),
    SPAN_HTTP_METHOD("X-A-Span-HttpMethod"),
    SPAN_HEADERS("X-A-Span-Headers");

    private final String key;

    TraceKeys(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

}
