package cn.hardcoding.design.factory.abstractfactory;

import cn.hardcoding.design.factory.base.AbstractProduct;

/**
 * XML类型的产品B
 *
 * @author hans
 * @create 2023-09-17 22:45
 */
public class XMLProductB extends AbstractProduct {
    public XMLProductB(String a, String b) {
        super(a, b);
    }

    @Override
    public void process() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println(this);
    }
}
