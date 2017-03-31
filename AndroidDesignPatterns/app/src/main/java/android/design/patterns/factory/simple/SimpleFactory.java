package android.design.patterns.factory.simple;

/**
 * Created by liheng on 17/3/31.
 */
public class SimpleFactory {

    public Car createCar(int type){
        switch (type){
            case 1:
                return new CarA();
            case 2:
                return new CarB();
        }
        return null;
    }
}
