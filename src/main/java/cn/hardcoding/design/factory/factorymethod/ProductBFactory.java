package cn.hardcoding.design.factory.factorymethod;

import cn.hardcoding.design.factory.base.AbstractProduct;
import cn.hardcoding.design.factory.base.ProductB;

/**
 * 产品B的工厂
 *
 * @author hans
 * @create 2023-09-17 21:20
 */
public class ProductBFactory implements ProductFactory{

    @Override
    public AbstractProduct createProduct(String name, String description) {
        return new ProductB(name, description);
    }
}
