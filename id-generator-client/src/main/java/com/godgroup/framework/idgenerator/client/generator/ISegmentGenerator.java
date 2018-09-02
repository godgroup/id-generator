package com.godgroup.framework.idgenerator.client.generator;

/**
 * @author holysu
 * @date 2018/9/2
 */
public interface ISegmentGenerator {

    /**
     * 获取原始 Id
     *
     * @param bizTag
     * @return
     */
    Long getId(String bizTag);
}
