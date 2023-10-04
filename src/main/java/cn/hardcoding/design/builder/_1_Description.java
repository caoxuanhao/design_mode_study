package cn.hardcoding.design.builder;

/**
 * @ClassName _1_Description
 * @Author hans
 * @Date 2023-10-04 23:14
 * @Description 建造者模式概述
 *
 * 1. 构建者模式应对的问题场景
 *      1）对象对应的属性很多
 *      2）有些属性是必填项，有些是非必填项
 *      3）属性见存在一些逻辑关系，如：大小关系，非负，非空等校验
 *      4）当属性赋值不完全时，对象处于无效状态，如：长方形只设置了一条变长
 * 2. 建造者模式的实现 {@link TargetObject} 使用案例参考测试类 {@link TargetObjectTest}
 *      输出结果如下：TargetObject{name='名字', maxTotal=8, maxIdle=6, minIdle=2}
 */
public class _1_Description {
}
