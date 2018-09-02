package com.godgroup.framework.idgenerator.client;

/**
 * 环境枚举
 *
 * @author holysu
 * @date 2018/9/2
 */
public enum EnvEnum {
    PROD(1), DEV(2), TEST(3), UAT(4);

    private int code;
    EnvEnum(int code){
        this.code = code;
    }

    /**
     * 根据运行环境 profile 字符串获取对应 code
     *
     * @param env
     * @return
     */
    public static int getCode(String env){
        for(EnvEnum e : EnvEnum.values()){
            if(e.toString().toLowerCase().equals(env.toLowerCase())){
                return e.getCode();
            }
        }
        return EnvEnum.DEV.getCode();
    }

    public int getCode(){
        return code;
    }
}
