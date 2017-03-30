package android.design.patterns.singleton;

/**
 * Created by liheng on 17/3/30.
 * 单例模式：确保一个类只有一个实例，减少对象的频发创建和销毁
 * 本模式是饿汉模式，通过类加载避免线程安全
 */
public class Singleton {

    private static Singleton mInstance = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return mInstance;
    }
}
