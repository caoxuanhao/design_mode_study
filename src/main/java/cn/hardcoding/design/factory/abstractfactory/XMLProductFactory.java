package cn.hardcoding.design.factory.abstractfactory;

import cn.hardcoding.design.factory.base.AbstractProduct;

/**
 * XML类型的Product工厂
 *
 * @author hans
 * @create 2023-09-17 22:46
 */
public class XMLProductFactory implements AbstractFactory {

    @Override
    public AbstractProduct createProductA(String name, String description) {
        return new XMLProductA(name, description);
    }

    @Override
    public AbstractProduct createProductB(String name, String description) {
        return new XMLProductB(name, description);
    }
}
