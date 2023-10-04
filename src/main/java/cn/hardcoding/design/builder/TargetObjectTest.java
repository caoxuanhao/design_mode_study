package cn.hardcoding.design.builder;

import org.junit.Test;

/**
 * @ClassName TargetObjectTest
 * @Author caoxuanhao
 * @Date 2023/10/4 23:38
 * @Description 建造者模式测试
 */
public class TargetObjectTest {
    @Test
    public void testBuilder () {
        TargetObject targetObject = new TargetObject.Builder()
                .setName("名字")
                .setMaxIdle(6)
                .setMinIdle(2)
                .build();
        System.out.println(targetObject);
    }
}
