package com.godgroup.framework.idgenerator.client;

import com.godgroup.framework.idgenerator.client.generator.ISegmentGenerator;
import com.godgroup.framework.idgenerator.client.generator.SegmentStrategy;
import com.godgroup.framework.idgenerator.client.splicer.ISplicer;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 分布式id生成器客户端
 *
 * @author holysu
 * @date 2018/9/2
 */
public class IdGeneratorClient {

    /**
     * 默认位数
     */
    private static final int DEFAULT_LENGTH = 16;

    /**
     * 环境 dev|test|prod
     */
    private String env;

    /**
     * 号码段生成方式
     */
    private GenerateModeEnum generateMode;

    /**
     * 自定义拼接器
     */
    private ISplicer splicer;

    /**
     * 默认 id 拼接器
     */
    private ISplicer defaultSplicer;

    private Map<String, ISegmentGenerator> segmentGeneratorMap = new ConcurrentHashMap<>();

    public IdGeneratorClient(GenerateModeEnum generateMode){
        this.generateMode =  generateMode;
    }

    /**
     * 获取最终序号
     *
     * @param bizTag
     * @return
     */
    public Long getSerialNo(String bizTag){
        ISplicer effectiveSplicer = splicer == null ? defaultSplicer : splicer;
        Long id = getSegmentGenerator(bizTag).getId(bizTag);
        return effectiveSplicer.splice(id, env, DEFAULT_LENGTH);
    }

    private ISegmentGenerator getSegmentGenerator(String bizTag){
        if(segmentGeneratorMap.containsKey(bizTag)){
            return segmentGeneratorMap.get(bizTag);
        }

        ISegmentGenerator segmentGenerator = SegmentStrategy.getSegmentGenerator(generateMode, env, bizTag);
        segmentGeneratorMap.putIfAbsent(bizTag, segmentGenerator);
        return segmentGenerator;
    }
}
