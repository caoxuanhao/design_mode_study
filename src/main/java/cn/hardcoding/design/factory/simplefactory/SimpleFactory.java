package cn.hardcoding.design.factory.simplefactory;

import cn.hardcoding.design.factory.base.AbstractProduct;
import cn.hardcoding.design.factory.base.ProductA;
import cn.hardcoding.design.factory.base.ProductB;

/**
 * 简单工厂
 * 简单工厂适合创建简单的实例对象，对象类型不经常变化。
 * 优点是实现简单。
 * 缺点是不符合开闭原则，当需要新增创建的类型时，需要修改createXXX方法的实现。
 *
 * 可以考虑使用反射+枚举的实现方式来让简单工厂符合开闭原则
 * @see cn.hardcoding.design.factory.simplefactory.SimpleFactoryWithReflect
 *
 * @author hans
 * @create 2023-09-17 17:43
 */
public class SimpleFactory {

    public static final AbstractProduct createProduct(Integer productType, String name, String description) {
        AbstractProduct product = null;
        if(1 == productType) {
            product = new ProductA(name, description);
        } else if (2 == productType) {
            product = new ProductB(name, description);
        }
        return product;
    }

}
