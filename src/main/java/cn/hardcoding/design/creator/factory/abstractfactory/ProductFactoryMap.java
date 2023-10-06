package cn.hardcoding.design.creator.factory.abstractfactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 抽象工厂的映射
 *
 * @author hans
 * @create 2023-09-17 22:49
 */
public class ProductFactoryMap {

    private static final Map<String, AbstractFactory> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("base", new ProductFactory());
        cachedFactories.put("xml", new XMLProductFactory());
    }

    public static AbstractFactory getFactory(String type) {
        if (type == null || !cachedFactories.containsKey(type)) {
            throw new IllegalArgumentException("no factory matched by type = " + type);
        }
        return cachedFactories.get(type);
    }
}
