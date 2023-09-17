package cn.hardcoding.design.factory.factorymethod;

import cn.hardcoding.design.factory.base.AbstractProduct;
import cn.hardcoding.design.factory.base.ProductA;

/**
 * 产品A的工厂
 *
 * @author hans
 * @create 2023-09-17 21:20
 */
public class ProductAFactory implements ProductFactory{

    @Override
    public AbstractProduct createProduct(String name, String description) {
        return new ProductA(name, description);
    }
}
