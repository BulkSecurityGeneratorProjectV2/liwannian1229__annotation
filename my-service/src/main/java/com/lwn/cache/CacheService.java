package com.lwn.cache;

public interface CacheService {

    void set(String key, Object value, long expire);

    void set(String key, Object value);

    <T> T get(String key, Class<T> clazz);

    <T> T get(String key, Class<T> clazz, long expire);

    void delete(String key);

    void deleteKeys(String key);

    boolean exists(String key);

}