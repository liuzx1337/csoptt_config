package com.csoptt.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 连接池属性
 *
 * @author qishao
 * @date 2018-11-24
 */
@Component
@ConfigurationProperties(prefix = "spring.datasource.druid")
public class DruidPoolProperties {

    /**
     * 初始连接数
     */
    private int initialSize;

    /**
     * 最少不活跃连接数
     */
    private int minIdle;

    /**
     * 最大活跃连接数
     */
    private int maxActive;

    /**
     * 最长等待时间（ms）
     */
    private int maxWait;

    /**
     * 空闲连接回收器运行间隔（ms）
     */
    private int timeBetweenEvictionRunsMillis;

    /**
     * 空闲连接被回收超时时间（ms）
     */
    private int minEvictableIdleTimeMillis;

    /**
     * 验证连接是否可用的SQL语句
     */
    private String validationQuery;

    /**
     * 定时取出连接时是否测试
     * true为是
     */
    private boolean testWhileIdle;

    /**
     * 借出连接时是否测试
     */
    private boolean testOnBorrow;

    /**
     * 返回连接时是否测试
     */
    private boolean testOnReturn;

    /**
     * 是否缓存statement
     */
    private boolean poolPreparedStatements;

    /**
     * 每个连接上的statement缓存空间
     */
    private int maxPoolPreparedStatementPerConnectionSize;

    /**
     * 配置监控统计拦截的filters
     */
    private String filters;

    /**
     * 连接属性。
     * 通过connectProperties属性来打开mergeSql功能；慢SQL记录
     */
    private String connectionProperties;

    /**
     * Gets the value of initialSize.
     *
     * @return the value of initialSize
     */
    public int getInitialSize() {
        return initialSize;
    }

    /**
     * Sets the initialSize
     * <p>You can use getInitialSize() to get the value of initialSize</p>
     *
     * @param initialSize initialSize
     */
    public void setInitialSize(int initialSize) {
        this.initialSize = initialSize;
    }

    /**
     * Gets the value of minIdle.
     *
     * @return the value of minIdle
     */
    public int getMinIdle() {
        return minIdle;
    }

    /**
     * Sets the minIdle
     * <p>You can use getMinIdle() to get the value of minIdle</p>
     *
     * @param minIdle minIdle
     */
    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    /**
     * Gets the value of maxActive.
     *
     * @return the value of maxActive
     */
    public int getMaxActive() {
        return maxActive;
    }

    /**
     * Sets the maxActive
     * <p>You can use getMaxActive() to get the value of maxActive</p>
     *
     * @param maxActive maxActive
     */
    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    /**
     * Gets the value of maxWait.
     *
     * @return the value of maxWait
     */
    public int getMaxWait() {
        return maxWait;
    }

    /**
     * Sets the maxWait
     * <p>You can use getMaxWait() to get the value of maxWait</p>
     *
     * @param maxWait maxWait
     */
    public void setMaxWait(int maxWait) {
        this.maxWait = maxWait;
    }

    /**
     * Gets the value of timeBetweenEvictionRunsMillis.
     *
     * @return the value of timeBetweenEvictionRunsMillis
     */
    public int getTimeBetweenEvictionRunsMillis() {
        return timeBetweenEvictionRunsMillis;
    }

    /**
     * Sets the timeBetweenEvictionRunsMillis
     * <p>You can use getTimeBetweenEvictionRunsMillis() to get the value of timeBetweenEvictionRunsMillis</p>
     *
     * @param timeBetweenEvictionRunsMillis timeBetweenEvictionRunsMillis
     */
    public void setTimeBetweenEvictionRunsMillis(int timeBetweenEvictionRunsMillis) {
        this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
    }

    /**
     * Gets the value of minEvictableIdleTimeMillis.
     *
     * @return the value of minEvictableIdleTimeMillis
     */
    public int getMinEvictableIdleTimeMillis() {
        return minEvictableIdleTimeMillis;
    }

    /**
     * Sets the minEvictableIdleTimeMillis
     * <p>You can use getMinEvictableIdleTimeMillis() to get the value of minEvictableIdleTimeMillis</p>
     *
     * @param minEvictableIdleTimeMillis minEvictableIdleTimeMillis
     */
    public void setMinEvictableIdleTimeMillis(int minEvictableIdleTimeMillis) {
        this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
    }

    /**
     * Gets the value of validationQuery.
     *
     * @return the value of validationQuery
     */
    public String getValidationQuery() {
        return validationQuery;
    }

    /**
     * Sets the validationQuery
     * <p>You can use getValidationQuery() to get the value of validationQuery</p>
     *
     * @param validationQuery validationQuery
     */
    public void setValidationQuery(String validationQuery) {
        this.validationQuery = validationQuery;
    }

    /**
     * Gets the value of testWhileIdle.
     *
     * @return the value of testWhileIdle
     */
    public boolean isTestWhileIdle() {
        return testWhileIdle;
    }

    /**
     * Sets the testWhileIdle
     * <p>You can use getTestWhileIdle() to get the value of testWhileIdle</p>
     *
     * @param testWhileIdle testWhileIdle
     */
    public void setTestWhileIdle(boolean testWhileIdle) {
        this.testWhileIdle = testWhileIdle;
    }

    /**
     * Gets the value of testOnBorrow.
     *
     * @return the value of testOnBorrow
     */
    public boolean isTestOnBorrow() {
        return testOnBorrow;
    }

    /**
     * Sets the testOnBorrow
     * <p>You can use getTestOnBorrow() to get the value of testOnBorrow</p>
     *
     * @param testOnBorrow testOnBorrow
     */
    public void setTestOnBorrow(boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    /**
     * Gets the value of testOnReturn.
     *
     * @return the value of testOnReturn
     */
    public boolean isTestOnReturn() {
        return testOnReturn;
    }

    /**
     * Sets the testOnReturn
     * <p>You can use getTestOnReturn() to get the value of testOnReturn</p>
     *
     * @param testOnReturn testOnReturn
     */
    public void setTestOnReturn(boolean testOnReturn) {
        this.testOnReturn = testOnReturn;
    }

    /**
     * Gets the value of poolPreparedStatements.
     *
     * @return the value of poolPreparedStatements
     */
    public boolean isPoolPreparedStatements() {
        return poolPreparedStatements;
    }

    /**
     * Sets the poolPreparedStatements
     * <p>You can use getPoolPreparedStatements() to get the value of poolPreparedStatements</p>
     *
     * @param poolPreparedStatements poolPreparedStatements
     */
    public void setPoolPreparedStatements(boolean poolPreparedStatements) {
        this.poolPreparedStatements = poolPreparedStatements;
    }

    /**
     * Gets the value of maxPoolPreparedStatementPerConnectionSize.
     *
     * @return the value of maxPoolPreparedStatementPerConnectionSize
     */
    public int getMaxPoolPreparedStatementPerConnectionSize() {
        return maxPoolPreparedStatementPerConnectionSize;
    }

    /**
     * Sets the maxPoolPreparedStatementPerConnectionSize
     * <p>You can use getMaxPoolPreparedStatementPerConnectionSize() to get the value of maxPoolPreparedStatementPerConnectionSize</p>
     *
     * @param maxPoolPreparedStatementPerConnectionSize maxPoolPreparedStatementPerConnectionSize
     */
    public void setMaxPoolPreparedStatementPerConnectionSize(int maxPoolPreparedStatementPerConnectionSize) {
        this.maxPoolPreparedStatementPerConnectionSize = maxPoolPreparedStatementPerConnectionSize;
    }

    /**
     * Gets the value of filters.
     *
     * @return the value of filters
     */
    public String getFilters() {
        return filters;
    }

    /**
     * Sets the filters
     * <p>You can use getFilters() to get the value of filters</p>
     *
     * @param filters filters
     */
    public void setFilters(String filters) {
        this.filters = filters;
    }

    /**
     * Gets the value of connectionProperties.
     *
     * @return the value of connectionProperties
     */
    public String getConnectionProperties() {
        return connectionProperties;
    }

    /**
     * Sets the connectionProperties
     * <p>You can use getConnectionProperties() to get the value of connectionProperties</p>
     *
     * @param connectionProperties connectionProperties
     */
    public void setConnectionProperties(String connectionProperties) {
        this.connectionProperties = connectionProperties;
    }
}
