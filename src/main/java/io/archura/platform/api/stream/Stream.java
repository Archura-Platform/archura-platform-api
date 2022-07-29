package io.archura.platform.api.stream;

import lombok.Builder;
import lombok.Value;

import java.util.Optional;

public interface Stream {

    Optional<String> send(final String topicName, final Record streamRecord);

    @Value
    @Builder
    class Record {
        byte[] key;
        byte[] value;
    }
}
