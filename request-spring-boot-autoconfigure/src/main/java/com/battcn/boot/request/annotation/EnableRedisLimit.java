package com.battcn.boot.request.annotation;

import com.battcn.boot.request.configuration.redis.limit.RedisLimitAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 基于 Redis 实现的分布式锁
 *
 * @author Levin
 * @since 2018-01-15
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({RedisLimitAutoConfiguration.class})
public @interface EnableRedisLimit {

    /**
     * 是否开启 @RedisLimit 的拦截器功能
     *
     * @return true | false
     */
    boolean interceptor() default true;

    /**
     * 是否开启默认的 KeyGenerator
     *
     * @return true | false
     */
    boolean defaultKeyGenerator() default true;

}
