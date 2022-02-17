package gst.trainingcourse_ex11_thaonx4.java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView name;
    Integer age;
    Button click;

    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        age = 18;
        user = new User("xuan thao", "t3h", 11, 1.6);
        initView();

        String text = user.name + user.age + user.nameClass + user.point.toString();

        name.setText(text);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "click", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initView() {
        name = findViewById(R.id.tv);
        click = findViewById(R.id.click);
    }

    private String getString() {
        return age.toString();
    }
}
