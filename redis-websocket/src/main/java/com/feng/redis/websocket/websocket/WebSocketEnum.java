package com.feng.redis.websocket.websocket;

/**
 * WebSocket枚举类型，推送以下类别的数据
 */
public enum WebSocketEnum {
    /**
     * 用户相关数量统计（设备、人员）
     */
    STATISTICS_USER("statistics_user"),
    /**
     * 事件相关数量统计（周期统计、周期列表）
     */
    STATISTICS_EVENTS("statistics_events"),

    /**
     * 广播消息
     */
    BROADCAST("broadcast"),

    /**
     * 点对点(发送消息)
     */
    PEER_TO_PEER("peertopeer");

    WebSocketEnum(String value){
        this.value = value;
    }

    private String value = "";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
