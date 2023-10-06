package cn.hardcoding.design.creator.factory.factorymethod;

import cn.hardcoding.design.creator.factory.base.AbstractProduct;

/**
 * @author hans
 * @description Product类工厂接口
 */
public interface ProductFactory {
    /**
     * 用于创建Product对象
     * @param name
     * @param description
     * @return
     */
    AbstractProduct createProduct(String name, String description);
}
