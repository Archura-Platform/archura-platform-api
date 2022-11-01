package io.archura.platform.api.context;

import io.archura.platform.api.cache.Cache;
import io.archura.platform.api.logger.Logger;
import io.archura.platform.api.mapper.Mapper;
import io.archura.platform.api.publish.Publisher;
import io.archura.platform.api.stream.LightStream;
import io.archura.platform.api.tracer.Tracer;

import java.net.http.HttpClient;
import java.util.Optional;

public interface Context {

    Optional<Cache> getCache();

    Optional<LightStream> getLightStream();

    Optional<Publisher> getPublisher();

    Optional<Tracer> getTracer();

    Logger getLogger();

    HttpClient getHttpClient();

    Mapper getMapper();

}
