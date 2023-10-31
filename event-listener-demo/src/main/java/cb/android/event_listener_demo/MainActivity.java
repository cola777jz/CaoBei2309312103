package cb.android.event_listener_demo;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button v1 = findViewById(R.id.main_btn_eventV1);
        Button v2 = findViewById(R.id.main_btn_eventV2);
        Button v3 = findViewById(R.id.main_btn_eventV3);
        Button v4 = findViewById(R.id.main_btn_eventV4);

        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "匿名内部类 V1", Toast.LENGTH_SHORT).show();

            }
        });

        v2.setOnClickListener(new InnerCustomListener());

        v3.setOnClickListener(new OuterCustomListener(MainActivity.this));

        v4.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Lambda 方式 | 匿名内部类 V4", Toast.LENGTH_SHORT).show();

        });
    }

    /**
     * 内部类
     */
    class InnerCustomListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "内部类 V2", Toast.LENGTH_SHORT).show();

        }
    }

    /**
     * 直接绑定到标签
     * @param view view
     */
    public void v5(View view) {
        Toast.makeText(MainActivity.this, "直接绑定到标签 V5", Toast.LENGTH_SHORT).show();
    }
}