package io.archura.platform.api.type.functionalcore;

import io.archura.platform.api.context.Context;

import java.util.Map;

public interface StreamProducer {
    Map.Entry<byte[], byte[]> produce(Context context);
}
