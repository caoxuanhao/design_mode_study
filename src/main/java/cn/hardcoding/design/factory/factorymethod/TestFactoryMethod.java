package cn.hardcoding.design.factory.factorymethod;

import cn.hardcoding.design.factory.base.AbstractProduct;
import org.junit.Test;

/**
 * 测试工厂方法
 *
 * @author hans
 * @create 2023-09-17 21:31
 */
public class TestFactoryMethod {

    @Test
    public void testFactoryMethod() {
        AbstractProduct product = FactoryMethod.getProductFactory(1).createProduct("产品A", "产品A的描述");
        product.process();
    }
}
