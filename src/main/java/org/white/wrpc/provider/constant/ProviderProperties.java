package org.white.wrpc.provider.constant;

/**
 * <p>配置文件内容,此处直接通过常量代替</p >
 *
 * @author white
 * @version $Id: ProviderProperties.java, v 0.1 2018年10月15日 09:49:00 white Exp$
 */
public interface ProviderProperties {
    /**
     * zookeeper连接串
     */
    String ZK_CONNECTION_STRING = "127.0.0.1:2181";
    /**
     * zookeeper超时时间
     */
    int    ZK_SESSION_TIME_OUT  = 5000000;
    /**
     * 服务唯一编码
     */
    String APP_CODE             = "100000";
}
