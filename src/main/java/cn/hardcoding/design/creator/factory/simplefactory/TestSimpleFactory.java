package cn.hardcoding.design.creator.factory.simplefactory;

import cn.hardcoding.design.creator.factory.base.AbstractProduct;
import org.junit.Test;

/**
 * 测试简单工厂
 *
 * @author hans
 * @create 2023-09-17 18:02
 */
public class TestSimpleFactory {
    @Test
    public void testSimpleFactory() {
        AbstractProduct product = SimpleFactory.createProduct(1, "产品A", "产品A的描述信息");

        product.process();
    }

    @Test
    public void testSimpleFactoryWithReflect() {
        AbstractProduct product = SimpleFactoryWithReflect.createProduct(2, "产品B", "产品B的描述信息");
        product.process();
    }

}
