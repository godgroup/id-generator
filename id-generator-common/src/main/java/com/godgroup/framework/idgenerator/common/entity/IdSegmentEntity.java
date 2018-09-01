package com.godgroup.framework.idgenerator.common.entity;

import lombok.Data;

import java.util.Date;

/**
 * 分布式号码段模型
 *
 * @author holysu
 * @date 2018/9/1
 */
@Data
public class IdSegmentEntity {

    /**
     * 业务标签
     */
    private String bizTag;

    /**
     * 最大Id
     */
    private Long maxId;

    /**
     * 步长
     */
    private Integer step;

    /**
     * 更新时间
     */
    private Date updateTime;
}
