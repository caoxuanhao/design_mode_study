package cn.hardcoding.design.factory.simplefactory;

import cn.hardcoding.design.factory.base.AbstractProduct;
import cn.hardcoding.design.factory.base.ProductA;
import cn.hardcoding.design.factory.base.ProductB;

import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射配合枚举实现的简单工厂
 * 1. 使用枚举类，保存需要创建的类型信息与Class之间的映射关系。
 * 2. 通过Class获取对应的构造器方法（适合要创建的对象具有相同参数列表构造函数的情况）
 * 当需要新增创建的类型时，只需要增加枚举类中的映射关系即可
 *
 * @author hans
 * @create 2023-09-17 18:08
 */
public class SimpleFactoryWithReflect {
    public static final AbstractProduct createProduct(Integer productType, String name, String description) {
        try {
            return (AbstractProduct) ProductEnum.getInstance(productType)
                    .getProductClass()
                    .getDeclaredConstructor(name.getClass(), description.getClass())
                    .newInstance(name, description);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    private enum ProductEnum {

        PRODUCT_A(1, ProductA.class),
        PRODUCT_B(2, ProductB.class);

        ProductEnum(Integer type, Class productClass) {
            this.type = type;
            ProductClass = productClass;
        }

        private Integer type;
        private Class ProductClass;

        public Class getProductClass() {
            return ProductClass;
        }

        public static ProductEnum getInstance(Integer productType) {
            ProductEnum[] values = ProductEnum.values();
            for (ProductEnum value : values) {
                if (value.type.equals(productType)) {
                    return value;
                }
            }
            throw new IllegalArgumentException("not match instance by productType = " + productType);
        }
    }
}
