package android.design.patterns.factory.method;

/**
 * Created by liheng on 17/3/31.
 */
public class FactoryCarA implements FactoryCar{
    @Override
    public Car createCar() {
        return new CarA();
    }
}
