package com.godgroup.framework.idgenerator.client.generator;

import com.godgroup.framework.idgenerator.client.GenerateModeEnum;

/**
 * @author holysu
 * @date 2018/9/2
 */
public class SegmentStrategy {


    /**
     * 根据生成方式获取响应的实现类
     *
     * @param generateMode
     * @return
     */
    public static synchronized ISegmentGenerator getSegmentGenerator(GenerateModeEnum generateMode, String env, String bizTag) {
        if (generateMode == GenerateModeEnum.REDIS) {
            return new RedisSegmentGenerator(env, bizTag);
        } else if (generateMode == GenerateModeEnum.SERVICE) {
            return new ServiceSegmentGenerator(env, bizTag);
        }

        return new RedisSegmentGenerator(env, bizTag);
    }
}
