package io.archura.platform.api.mapper;


import java.io.IOException;

public interface Mapper {

    String writeValueAsString(Object object) throws IOException;

    <T> T readValue(byte[] bytes, Class<T> tClass) throws IOException;

    <T> T convertValue(Object fromValue, Class<T> toValueType) throws IllegalArgumentException;

}
