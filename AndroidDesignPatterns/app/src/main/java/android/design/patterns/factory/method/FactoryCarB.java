package android.design.patterns.factory.method;

/**
 * Created by liheng on 17/3/31.
 */
public class FactoryCarB implements FactoryCar{
    @Override
    public Car createCar() {
        return new CarB();
    }
}
