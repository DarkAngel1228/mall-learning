package com.macro.mall.tiny.service;

/**
 * redis操作Service
 * 对象和数组都以json形式进行存储
 *
 */
public interface RedisService {
    /**
     * 存储数据
     * @param key
     * @param value
     */
    void set(String key, String value);

    /**
     * 获取数据
     * @param key
     * @return
     */
    String get(String key);

    /**
     * 设置操作时间
     * @param key
     * @param expiry
     * @return
     */
    boolean expire(String key, long expiry);

    /**
     * 删除数据
     * @param key
     */
    void remove(String key);

    /**
     * 自增操作
     * @param key
     * @param delta 自增步长
     * @return
     */
    Long increment(String key, long delta);
}
