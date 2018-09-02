package com.godgroup.framework.idgenerator.client.test;

import com.godgroup.framework.idgenerator.client.splicer.DefaultIdSplicer;
import com.godgroup.framework.idgenerator.client.splicer.ISplicer;
import org.junit.Test;

/**
 * @author holysu
 * @date 2018/9/2
 */
public class SplicerTest {

    @Test
    public void splicerTest(){
        ISplicer splicer = new DefaultIdSplicer();

        System.out.println(splicer.splice(10L, "dev", 16));
    }
}
