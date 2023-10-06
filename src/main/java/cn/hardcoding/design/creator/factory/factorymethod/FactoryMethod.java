package cn.hardcoding.design.creator.factory.factorymethod;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂方法实现
 * 工厂方法需要创建接口与多个工厂类，同时还需要实现类型与工厂的映射（如本类的功能）
 *
 * 该模式适用于创建复杂对象的情况（对象的创建以来与复杂的流程，而不是简单的new一个实例）
 * 新增类型的方式:
 * 1. 新增一个工厂接口的实现类
 * 2. 增加一个类型与工厂类的映射关系
 *
 * @author hans
 * @create 2023-09-17 18:20
 */
public class FactoryMethod {

    private static final Map<Integer, ProductFactory> cachedFactories = new HashMap();

    static {
        cachedFactories.put(1, new ProductAFactory());
        cachedFactories.put(2, new ProductBFactory());
    }

    /**
     * 根据factory类型获取创建实例的工厂类
     * @param factoryType
     * @return
     */
    public static ProductFactory getProductFactory(Integer factoryType) {
        if (factoryType == null || !cachedFactories.containsKey(factoryType)) {
            throw new IllegalArgumentException("no factory matched by type is " + factoryType);
        }
        return cachedFactories.get(factoryType);
    }
}
