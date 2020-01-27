package CreationModel.singleton.inner;

/**
 * 单例模式（内部类）
 *      IoDH Initialization on Demand Holder
 *      通过使用 IoDH 既可以使用延迟加载，又可以保证线程安全
 *      不影响系统性能。
 * @author Atom
 * @version 1.0
 * @date 2020/1/27 - 14:33
 */
public class InnerClassSingleton {
    public InnerClassSingleton() {

    }

    // 静态内部类
    public static class HoldClass{
        private final static InnerClassSingleton instance = new InnerClassSingleton();
    }

    public static  InnerClassSingleton getInstance(){
        return HoldClass.instance;
    }


}
