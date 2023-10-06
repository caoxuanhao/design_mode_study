package cn.hardcoding.design.creator.factory.abstractfactory;

import cn.hardcoding.design.creator.factory.base.AbstractProduct;

/**
 * @author hans
 * @description 抽象工厂接口
 * 用于减少由于不同维度组合的工厂类的数量
 */
public interface AbstractFactory {

    AbstractProduct createProductA(String name, String description);

    AbstractProduct createProductB(String name, String description);
}
