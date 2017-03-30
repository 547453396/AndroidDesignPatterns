package android.design.patterns;

import android.design.patterns.builder.Person;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void bulider(){
        Person person = new Person.Builder().firstName("").build();
    }
}
