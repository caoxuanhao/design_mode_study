package cn.hardcoding.design.creator.factory.abstractfactory;

import cn.hardcoding.design.creator.factory.base.AbstractProduct;

/**
 * XML类型的产品A
 *
 * @author hans
 * @create 2023-09-17 22:45
 */
public class XMLProductA extends AbstractProduct {
    public XMLProductA(String a, String b) {
        super(a, b);
    }

    @Override
    public void process() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println(this);
    }
}
