package cn.hardcoding.design.factory.abstractfactory;

import cn.hardcoding.design.factory.base.AbstractProduct;
import org.junit.Test;

/**
 * @author hans
 * @create 2023-09-17 22:53
 */
public class TestAbstractFactory {
    @Test
    public void testAbstractFactory () {
        AbstractFactory factory = ProductFactoryMap.getFactory("xml");
        AbstractProduct productA = factory.createProductA("xml产品A", "xml产品A描述");
        AbstractProduct productB = factory.createProductB("xml产品B", "无描述");

        productA.process();
        productB.process();
    }
}
