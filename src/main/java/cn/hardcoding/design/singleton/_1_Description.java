package cn.hardcoding.design.singleton;

/**
 * @ClassName Test
 * @Author caoxuanhao
 * @Date 2023/10/3 15:48
 * @Description 用于描述单例设计模式的基本信息
 * 1. 什么是单例模式
 *      即该类只允许创建一个实例对象。
 * 2. 为什么需要单例模式
 *      1）解决资源竞争问题（Logger案例）
 *      2）全局唯一类（IdGenerator案例）
 * 3. 如何实现一个单例类（实现要点）
 *      1）私有构造函数
 *      2）考虑对象创建时的线程安全
 *      3）考虑是否延迟加载
 *      4）考虑性能问题 getInstance()是否需要加锁
 * 4. 实现方式
 *      1）饿汉模式 {@link Hungry}
 *          该模式，在类加载时即会创建对象，不支持延迟加载。
 *          针对需要占用大量资源的对象或创建时间较长的对象，能够有效将资源不足的问题提前暴露。
 *      2）懒汉模式 {@link Lazy}
 *          该模式需要给getInstance()方法加锁，并发性能低。
 *      3）双重检测锁 {@link DoubleCheck}
 *          该模式需要给instance变量添加volatile关键字来避免JVM对getInstance()进行指令重排，导致返回的实例并没有经过初始化的问题。
 *      4）静态内部类 {@link InnerClass}
 *          支持延迟加载，并发问题由JVM的类加载机制来保证。
 *      5）枚举 {@link EnumSingleton}
 *          利用Java枚举的单例特性实现。
 *
 */
public class _1_Description {
}
