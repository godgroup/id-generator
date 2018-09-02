package com.godgroup.framework.idgenerator.client.generator;

/**
 * 通过 redis 获取号码段
 *
 * @author holysu
 * @date 2018/9/2
 */
public class RedisSegmentGenerator implements ISegmentGenerator {

    private String env;

    private String bizTag;
    public RedisSegmentGenerator(String env, String bizTag){
        this.env = env;
        this.bizTag = bizTag;
    }

    @Override
    public Long getId(String bizTag) {
        return null;
    }
}
