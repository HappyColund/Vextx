package com.svocloud.plcmedge.utils;

import java.util.Map;
import com.alibaba.fastjson.JSON;
import com.svocloud.plcmedge.constants.Constants;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtil {
	private static JedisPoolConfig jedisPoolConfig = null;
	private static JedisPool jedisPool = null;
	static {
		jedisPoolConfig = new JedisPoolConfig();
		jedisPoolConfig.setMaxIdle(20);
		jedisPoolConfig.setMaxTotal(50);
		jedisPool = new JedisPool(jedisPoolConfig,
				PropertiesUtil.getPropertie(Constants.REDIS_HOST, Constants.REDIS_HOST_DEF),
				PropertiesUtil.getIntPropertie(Constants.REDIS_PORT, Constants.REDIS_PORT_DEF));
	}

	private RedisUtil() {
		super();
	}

	private static Jedis getJedis() {
		return jedisPool.getResource();
	}

	public static Jedis getJedis(Integer dbIndex) {
		Jedis jedis = getJedis();
		jedis.select(dbIndex);
		return jedis;

	}

	public static Long del(Integer dbIndex, String... redisKey) {
		try (Jedis jedis = getJedis(dbIndex)) {
			return jedis.del(Constants.REDIS_KEY_BASE + redisKey);
		}
	}

	public static Long del(String... redisKey) {
		return del(PropertiesUtil.getIntPropertie("redis_db", Constants.REDIS_DB_DEF),
				redisKey);
	}

	public static Long expire(Integer dbIndex, String redisKey, Integer seconds) {
		try (Jedis jedis = getJedis(dbIndex)) {
			return jedis.expire(Constants.REDIS_KEY_BASE + redisKey, seconds);
		}
	}

	public static Long expire(String redisKey, Integer seconds) {
		return expire(PropertiesUtil.getIntPropertie("redis_db", Constants.REDIS_DB_DEF),
				redisKey, seconds);
	}

	public static String get(Integer dbIndex, String redisKey) {
		try (Jedis jedis = getJedis(dbIndex)) {
			return jedis.get(Constants.REDIS_KEY_BASE + redisKey);
		}
	}

	public static String get(String redisKey) {
		return get(PropertiesUtil.getIntPropertie("redis_db", Constants.REDIS_DB_DEF),
				redisKey);
	}

	public static Long hdel(Integer dbIndex, String redisKey, String... hkey) {
		try (Jedis jedis = getJedis(dbIndex)) {
			return jedis.hdel(Constants.REDIS_KEY_BASE + redisKey, hkey);
		}
	}

	public static Long hdel(String redisKey, String... hkey) {
		return hdel(PropertiesUtil.getIntPropertie("redis_db", Constants.REDIS_DB_DEF),
				redisKey, hkey);
	}

	public static String hget(Integer dbIndex, String redisKey, String hkey) {
		try (Jedis jedis = getJedis(dbIndex)) {
			return jedis.hget(Constants.REDIS_KEY_BASE + redisKey, hkey);
		}
	}

	public static String hget(String redisKey, String hkey) {
		return hget(PropertiesUtil.getIntPropertie("redis_db", Constants.REDIS_DB_DEF),
				redisKey, hkey);
	}

	public static Long hset(Integer dbIndex, String redisKey, String hkey, Object value) {
		try (Jedis jedis = getJedis(dbIndex)) {
			return jedis.hset(Constants.REDIS_KEY_BASE + redisKey, hkey,
					value.getClass().equals(String.class) ? String.valueOf(value) : JSON.toJSONString(value));
		}
	}

	public static Long hset(String redisKey, String hkey, Object value) {
		return hset(PropertiesUtil.getIntPropertie("redis_db", Constants.REDIS_DB_DEF),
				redisKey, hkey,
				value.getClass().equals(String.class) ? String.valueOf(value) : JSON.toJSONString(value));
	}

	public static String set(Integer dbIndex, String redisKey, Object value) {
		try (Jedis jedis = getJedis(dbIndex)) {
			return jedis.set(Constants.REDIS_KEY_BASE + redisKey,
					value.getClass().equals(String.class) ? String.valueOf(value) : JSON.toJSONString(value));
		}
	}

	public static String set(String redisKey, Object value) {
		return set(PropertiesUtil.getIntPropertie("redis_db", Constants.REDIS_DB_DEF),
				redisKey,
				value.getClass().equals(String.class) ? String.valueOf(value) : JSON.toJSONString(value));
	}

	public static Map<String, String> hgetAll(Integer dbIndex, String redisKey) {
		try (Jedis jedis = getJedis(dbIndex)) {
			return jedis.hgetAll(Constants.REDIS_KEY_BASE + redisKey);
		}
	}

	public static Map<String, String> hgetAll(String redisKey) {
		return hgetAll(PropertiesUtil.getIntPropertie("redis_db", Constants.REDIS_DB_DEF), redisKey);
	}

	public static long ttl(Integer dbIndex, String redisKey) {
		try (Jedis jedis = getJedis(dbIndex)) {
			return jedis.ttl(Constants.REDIS_KEY_BASE + redisKey);
		}
	}

	public static long ttl(String redisKey) {
		return ttl(PropertiesUtil.getIntPropertie("redis_db", Constants.REDIS_DB_DEF), redisKey);
	}
}
