package io.archura.platform.api.stream;

import java.util.Optional;

public interface LightStream {

    Optional<String> send(final String topicName, final byte[] value);

}
