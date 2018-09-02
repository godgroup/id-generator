package com.godgroup.framework.idgenerator.client.splicer;

/**
 * id 拼接器
 *
 * @author holysu
 * @date 2018/9/2
 */
public interface ISplicer {
    Long splice(Long id, String env, int length);
}
