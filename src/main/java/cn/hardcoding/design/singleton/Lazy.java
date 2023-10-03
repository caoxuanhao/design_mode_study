package cn.hardcoding.design.singleton;

/**
 * @ClassName Lazy
 * @Author caoxuanhao
 * @Date 2023/10/3 16:17
 * @Description 懒汉模式的单例对象实现
 */
public class Lazy {
    private static Lazy instance;

    private Lazy() {
    }

    public static synchronized Lazy getInstance() {
        if (instance == null) {
            instance = new Lazy();
        }
        return instance;
    }
}
