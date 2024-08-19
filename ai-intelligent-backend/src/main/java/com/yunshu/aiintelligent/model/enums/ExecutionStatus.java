package com.yunshu.aiintelligent.model.enums;

import io.swagger.models.auth.In;

public enum ExecutionStatus {
    /**
     * 等待
     */
    WAIT("wait",0),
    /**
     * 正在运行
     */
    RUNNING("running",1),
    /**
     * 成功
     */
    SUCCEED("succeed",2),
    /**
     * 失败
     */
    FAILED("failed",3);

    private final String text;

    private final Integer value;
    ExecutionStatus(String text, Integer value) {
        this.text = text;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public Integer getValue() {
        return value;
    }
}
