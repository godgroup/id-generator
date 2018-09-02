package com.godgroup.framework.idgenerator.client.splicer;

import com.godgroup.framework.idgenerator.client.EnvEnum;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 默认 id 拼接器
 *
 * {env} + {yyMM} + {id}
 *
 * @author holysu
 * @date 2018/9/2
 */
public class DefaultIdSplicer implements ISplicer {

    @Override
    public Long splice(Long id, String env, int length) {
        String today =  new SimpleDateFormat("yyMM").format(new Date());
        // 补0
        String pad = String.format("%0" + (length - 5) + "d", id);

        return Long.valueOf(EnvEnum.getCode(env) + today + pad);
    }
}
