package io.archura.platform.api.publish;

public interface Publisher {

    void publish(String channel, String message);

}
