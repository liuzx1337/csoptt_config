package com.csoptt.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Redis相关配置
 *
 * @author qishao
 * @date 2018-11-28
 */
@Component
@ConfigurationProperties(prefix = "csoptt.redis")
public class RedisProperties {

    /**
     * 数据库选择
     */
    private int database = 0;

    /**
     * url
     */
    private String url;

    /**
     * 主机名，默认localhost
     */
    private String host = "localhost";

    /**
     * 连接密码
     */
    private String password;

    /**
     * 端口，默认6379
     */
    private int port = 6379;

    /**
     * 是否ssl
     */
    private boolean ssl;

    /**
     * Gets the value of database.
     *
     * @return the value of database
     */
    public int getDatabase() {
        return database;
    }

    /**
     * Sets the database.
     * <p>
     * <p>You can use getDatabase() to get the value of database</p>
     *
     * @param database database
     */
    public void setDatabase(int database) {
        this.database = database;
    }

    /**
     * Gets the value of url.
     *
     * @return the value of url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the url.
     * <p>
     * <p>You can use getUrl() to get the value of url</p>
     *
     * @param url url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Gets the value of host.
     *
     * @return the value of host
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the host.
     * <p>
     * <p>You can use getHost() to get the value of host</p>
     *
     * @param host host
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Gets the value of password.
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     * <p>
     * <p>You can use getPassword() to get the value of password</p>
     *
     * @param password password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the value of port.
     *
     * @return the value of port
     */
    public int getPort() {
        return port;
    }

    /**
     * Sets the port.
     * <p>
     * <p>You can use getPort() to get the value of port</p>
     *
     * @param port port
     */
    public void setPort(int port) {
        this.port = port;
    }

    /**
     * Gets the value of ssl.
     *
     * @return the value of ssl
     */
    public boolean isSsl() {
        return ssl;
    }

    /**
     * Sets the ssl.
     * <p>
     * <p>You can use getSsl() to get the value of ssl</p>
     *
     * @param ssl ssl
     */
    public void setSsl(boolean ssl) {
        this.ssl = ssl;
    }
}
