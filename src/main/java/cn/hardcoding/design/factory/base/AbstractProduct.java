package cn.hardcoding.design.factory.base;

/**
 * 抽象产品，用于定义一个通用的接口
 *
 * @author hans
 * @create 2023-09-17 17:46
 */
public abstract class AbstractProduct {

    private String name;
    private String description;

    public AbstractProduct(String a, String b) {
        this.name = a;
        this.description = b;
    }

    public abstract void process();

    @Override
    public String toString() {
        return "AbstractProduct{" +
                "name ='" + name + '\'' +
                ",  description ='" + description + '\'' +
                '}';
    }
}
