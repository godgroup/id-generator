package com.godgroup.framework.idgenerator.common.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 分布式号码段模型
 *
 * @author holysu
 * @date 2018/9/1
 */
@Data
public class IdSegmentEntity implements Serializable {

    /**
     * 业务标签
     */
    @JsonProperty("biz_tag")
    private String bizTag;

    /**
     * 最大Id
     */
    @JsonProperty("max_id")
    private Long maxId;

    /**
     * 步长
     */
    @JsonProperty("step")
    private Integer step;

    /**
     * 需要预先获取的阈值，保证每次获取id的时候都是直接从本地内存拿，不阻塞
     *
     * 根据一定比例计算得出
     * 如 prefetchThreshold = maxId - step * rate;
     */
    @JsonProperty("prefetch_threshold")
    private Long prefetchThreshold;

    /**
     * 更新时间
     */
    @JsonProperty("update_time")
    private Date updateTime;
}
