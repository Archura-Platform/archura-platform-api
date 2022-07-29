package io.archura.platform.api.context;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.archura.platform.api.cache.Cache;
import io.archura.platform.api.logger.Logger;
import io.archura.platform.api.stream.Stream;

import java.net.http.HttpClient;
import java.util.Optional;

public interface Context {

    Optional<Cache> getCache();

    Optional<Stream> getStream();

    Logger getLogger();

    HttpClient getHttpClient();

    ObjectMapper getObjectMapper();

}
