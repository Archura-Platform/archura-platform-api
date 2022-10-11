package io.archura.platform.api.type.functionalcore;

import io.archura.platform.api.context.Context;

import java.util.Map;

@FunctionalInterface
public interface StreamConsumer {

    void consume(Context context, String key, Map<String, String> value);

}
