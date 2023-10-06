package cn.hardcoding.design.creator.factory.factorymethod;

import cn.hardcoding.design.creator.factory.base.ProductB;
import cn.hardcoding.design.creator.factory.base.AbstractProduct;

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
