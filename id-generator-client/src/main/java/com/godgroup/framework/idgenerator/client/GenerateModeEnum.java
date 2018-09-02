package com.godgroup.framework.idgenerator.client;

/**
 * 号码段生成方式
 *
 * @author holysu
 * @date 2018/9/2
 */
public enum GenerateModeEnum {

    /**
     * 基于 redis
     */
    REDIS(0),

    /**
     * 通过服务端获取（服务端目前是居于mysql生成）
     */
    SERVICE(1);

    private int code;
    GenerateModeEnum(int code){
        this.code = code;
    }

}
