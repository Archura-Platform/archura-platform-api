package io.archura.platform.api.stream;

import java.util.Map;

public interface LightStream {

    String send(final String topicName, final Map<String, String> message);

}
