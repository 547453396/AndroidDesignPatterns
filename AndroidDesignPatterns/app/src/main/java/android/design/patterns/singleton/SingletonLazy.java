package android.design.patterns.singleton;

/**
 * Created by liheng on 17/3/30.
 * 单例模式：确保一个类只有一个实例
 * 本模式是懒汉模式，synchronized字段是为了保证线程安全
 */
public class SingletonLazy {

    private static SingletonLazy mInstance = null;

    private SingletonLazy(){

    }

    /**
     * synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下降，
     * 因为每次调用getInstance()，都要对对象上锁，
     * 事实上，只有在第一次创建对象的时候需要加锁，之后就不需要了
     * @return
     */
//    public static synchronized SingletonLazy getInstance(){
//        if (mInstance == null){
//            mInstance = new SingletonLazy();
//        }
//        return mInstance;
//    }

    public static SingletonLazy getInstance(){
        if (mInstance == null){
            synchronized (SingletonLazy.class) {
                if (mInstance == null) {
                    mInstance = new SingletonLazy();
                }
            }
        }
        return mInstance;
    }
}
