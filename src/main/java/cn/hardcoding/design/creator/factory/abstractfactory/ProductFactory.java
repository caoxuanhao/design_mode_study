package cn.hardcoding.design.creator.factory.abstractfactory;

import cn.hardcoding.design.creator.factory.base.ProductB;
import cn.hardcoding.design.creator.factory.base.AbstractProduct;
import cn.hardcoding.design.creator.factory.base.ProductA;

/**
 * 标准的产品工厂
 *
 * @author hans
 * @create 2023-09-17 22:47
 */
public class ProductFactory implements AbstractFactory {
    @Override
    public AbstractProduct createProductA(String name, String description) {
        return new ProductA(name, description);
    }

    @Override
    public AbstractProduct createProductB(String name, String description) {
        return new ProductB(name, description);
    }
}
