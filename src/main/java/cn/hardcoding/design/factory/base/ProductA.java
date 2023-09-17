package cn.hardcoding.design.factory.base;

/**
 * 产品A
 *
 * @author hans
 * @create 2023-09-17 17:51
 */
public class ProductA extends AbstractProduct{

    public ProductA(String a, String b) {
        super(a, b);
    }

    @Override
    public void process() {
        System.out.println("ProductA process.");
        System.out.println(this);
    }
}
