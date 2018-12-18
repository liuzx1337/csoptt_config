package com.csoptt.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池相关配置，可用在常用线程池上
 *
 * @author liuzixi
 * @date 2018-12-18
 */
@Component
@ConfigurationProperties(prefix = "csoptt.thread-pool")
public class ThreadPoolExecutorProperties {

    /**
     * 核心线程数
     */
    private int corePoolSize = 1;

    /**
     * 最大线程数
     */
    private int maxPoolSize = 2147483647;

    /**
     * 活跃时间
     */
    private int keepAliveSeconds = 60;

    /**
     * 队列大小
     */
    private int queueCapacity = 2147483647;

    /**
     * 是否允许核心线程超时
     */
    private boolean allowCoreThreadTimeOut = false;

    /**
     * 池中线程的名称前缀
     */
    private String threadNamePrefix = "csoptt-";

    /**
     * 时间单位
     */
    private TimeUnit timeUnit = TimeUnit.SECONDS;

    /**
     * 拒绝策略（默认删除新线程并抛出异常）
     */
    private RejectedExecutionHandler rejectedExecutionHandler = new ThreadPoolExecutor.AbortPolicy();

    /**
     * Gets the value of corePoolSize.
     *
     * @return the value of corePoolSize
     */
    public int getCorePoolSize() {
        return corePoolSize;
    }

    /**
     * Sets the corePoolSize
     * <p>You can use getCorePoolSize() to get the value of corePoolSize</p>
     *
     * @param corePoolSize corePoolSize
     */
    public void setCorePoolSize(int corePoolSize) {
        this.corePoolSize = corePoolSize;
    }

    /**
     * Gets the value of maxPoolSize.
     *
     * @return the value of maxPoolSize
     */
    public int getMaxPoolSize() {
        return maxPoolSize;
    }

    /**
     * Sets the maxPoolSize
     * <p>You can use getMaxPoolSize() to get the value of maxPoolSize</p>
     *
     * @param maxPoolSize maxPoolSize
     */
    public void setMaxPoolSize(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    /**
     * Gets the value of keepAliveSeconds.
     *
     * @return the value of keepAliveSeconds
     */
    public int getKeepAliveSeconds() {
        return keepAliveSeconds;
    }

    /**
     * Sets the keepAliveSeconds
     * <p>You can use getKeepAliveSeconds() to get the value of keepAliveSeconds</p>
     *
     * @param keepAliveSeconds keepAliveSeconds
     */
    public void setKeepAliveSeconds(int keepAliveSeconds) {
        this.keepAliveSeconds = keepAliveSeconds;
    }

    /**
     * Gets the value of queueCapacity.
     *
     * @return the value of queueCapacity
     */
    public int getQueueCapacity() {
        return queueCapacity;
    }

    /**
     * Sets the queueCapacity
     * <p>You can use getQueueCapacity() to get the value of queueCapacity</p>
     *
     * @param queueCapacity queueCapacity
     */
    public void setQueueCapacity(int queueCapacity) {
        this.queueCapacity = queueCapacity;
    }

    /**
     * Gets the value of allowCoreThreadTimeOut.
     *
     * @return the value of allowCoreThreadTimeOut
     */
    public boolean isAllowCoreThreadTimeOut() {
        return allowCoreThreadTimeOut;
    }

    /**
     * Sets the allowCoreThreadTimeOut
     * <p>You can use getAllowCoreThreadTimeOut() to get the value of allowCoreThreadTimeOut</p>
     *
     * @param allowCoreThreadTimeOut allowCoreThreadTimeOut
     */
    public void setAllowCoreThreadTimeOut(boolean allowCoreThreadTimeOut) {
        this.allowCoreThreadTimeOut = allowCoreThreadTimeOut;
    }

    /**
     * Gets the value of threadNamePrefix.
     *
     * @return the value of threadNamePrefix
     */
    public String getThreadNamePrefix() {
        return threadNamePrefix;
    }

    /**
     * Sets the threadNamePrefix
     * <p>You can use getThreadNamePrefix() to get the value of threadNamePrefix</p>
     *
     * @param threadNamePrefix threadNamePrefix
     */
    public void setThreadNamePrefix(String threadNamePrefix) {
        this.threadNamePrefix = threadNamePrefix;
    }

    /**
     * Gets the value of timeUnit.
     *
     * @return the value of timeUnit
     */
    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    /**
     * Sets the timeUnit
     * <p>You can use getTimeUnit() to get the value of timeUnit</p>
     *
     * @param timeUnit timeUnit
     */
    public void setTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    /**
     * Gets the value of rejectedExecutionHandler.
     *
     * @return the value of rejectedExecutionHandler
     */
    public RejectedExecutionHandler getRejectedExecutionHandler() {
        return rejectedExecutionHandler;
    }

    /**
     * Sets the rejectedExecutionHandler
     * <p>You can use getRejectedExecutionHandler() to get the value of rejectedExecutionHandler</p>
     *
     * @param rejectedExecutionHandler rejectedExecutionHandler
     */
    public void setRejectedExecutionHandler(RejectedExecutionHandler rejectedExecutionHandler) {
        this.rejectedExecutionHandler = rejectedExecutionHandler;
    }
}
