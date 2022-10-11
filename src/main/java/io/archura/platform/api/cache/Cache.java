package io.archura.platform.api.cache;

import java.util.List;

public interface Cache {

    boolean set(String key, String value);

    String get(String key);

    long del(String... keys);

    boolean exists(String key);

    List<String> keys();

    List<String> values();

    long length();

}
