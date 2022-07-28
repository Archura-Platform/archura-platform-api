package io.archura.platform.api.type.functionalcore;

import io.archura.platform.api.context.Context;

import java.util.function.Consumer;

@FunctionalInterface
public interface ContextConsumer extends Consumer<Context> {
}
