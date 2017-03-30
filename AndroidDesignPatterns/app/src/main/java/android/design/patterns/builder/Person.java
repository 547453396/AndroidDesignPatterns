package android.design.patterns.builder;

import android.util.Log;

/**
 * Created by liheng on 17/3/30.
 * 建造者模式 AlertDialog是这种形式
 * 使用场景：对象的参数过多时，避免构造函数传参过多，不便于阅读。
 * 优点：增加可读性及灵活性
 * 缺点：代码量增加及冗余，增加了内部类开销
 */
public class Person {
    private static final String TAG = "Person";
    private String firstName;
    private String midName;
    private String lastName;
    private int sex;
    private String address;

    private Person(String firstName,String midName,String lastName,int sex,String address){
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
        this.sex = sex;
        this.address = address;

        Log.i(TAG, "firstName:" + firstName + " midName:" + midName
                + " lastName:" + lastName + " sex:" + sex + " address:" + address);
    }

    public static class Builder {
        private String firstName;
        private String midName;
        private String lastName;
        private int sex;
        private String address;

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder midName(String midName){
            this.midName = midName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder sex(int sex){
            this.sex = sex;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Person build(){
            return new Person(firstName,midName,lastName,sex,address);
        }

    }
}
