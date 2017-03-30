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

    public static synchronized SingletonLazy getInstance(){
        if (mInstance == null){
            mInstance = new SingletonLazy();
        }
        return mInstance;
    }
}
