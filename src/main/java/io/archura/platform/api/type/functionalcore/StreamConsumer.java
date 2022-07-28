package io.archura.platform.api.type.functionalcore;

import io.archura.platform.api.context.Context;

@FunctionalInterface
public interface StreamConsumer {

    void consume(Context context, byte[] key, byte[] value);

}
