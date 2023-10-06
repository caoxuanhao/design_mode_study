package cn.hardcoding.design.creator.singleton;

/**
 * @ClassName InnerClass
 * @Author caoxuanhao
 * @Date 2023/10/3 16:29
 * @Description 静态内部类实现的单例类
 */
public class InnerClass {

    private InnerClass() {
    }

    public static InnerClass getInstance() {
        return InnerClassHolder.instance;
    }

    private static class InnerClassHolder {
        private static final InnerClass instance = new InnerClass();
    }
}
