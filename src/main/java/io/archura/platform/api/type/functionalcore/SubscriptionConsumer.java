package io.archura.platform.api.type.functionalcore;

import io.archura.platform.api.context.Context;

@FunctionalInterface
public interface SubscriptionConsumer {

    void consume(Context context, String channel, String message);

}
