package org.white.wrpc.common.model;

/**
 * <p></p >
 *
 * @author white
 * @version $Id: Span.java, v 0.1 2018年10月25日 16:12:00 white Exp$
 */
public class Span {
    /**
     * 全局唯一id
     */
    String traceId;
    /**
     * 操作名--此处取方法名
     */
    String operationName;
    /**
     * 当前spanId
     */
    String spanId;
    /**
     * 调用方spanId
     */
    String parentSpanId;
    /**
     * appCode
     */
    String appCode;
    /**
     * 当前机器ip
     */
    String localIp;
    /**
     * 目标机器ip
     */
    String remoteIp;
    /**
     * 时间戳
     */
    long   timestamp;

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public String getParentSpanId() {
        return parentSpanId;
    }

    public void setParentSpanId(String parentSpanId) {
        this.parentSpanId = parentSpanId;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getLocalIp() {
        return localIp;
    }

    public void setLocalIp(String localIp) {
        this.localIp = localIp;
    }

    public String getRemoteIp() {
        return remoteIp;
    }

    public void setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
