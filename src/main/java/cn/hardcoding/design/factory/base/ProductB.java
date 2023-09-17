package cn.hardcoding.design.factory.base;

/**
 * 产品B
 *
 * @author hans
 * @create 2023-09-17 17:52
 */
public class ProductB extends AbstractProduct{

    public ProductB(String a, String b) {
        super(a, b);
    }

    @Override
    public void process() {
        System.out.println("ProductB process.");
        System.out.println(this);
    }
}
