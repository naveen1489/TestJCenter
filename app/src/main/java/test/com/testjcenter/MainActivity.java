package test.com.testjcenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.MyClass;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView greetText = (TextView)findViewById(R.id.greetView);
        greetText.setText(MyClass.greet("Naveen"));

    }
}
