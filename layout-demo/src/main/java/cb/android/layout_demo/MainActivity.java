package cb.android.layout_demo;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button liner_btn = findViewById(R.id.main_btn_liner);
        Button table_btn = findViewById(R.id.main_btn_table);
        Button grid_btn = findViewById(R.id.main_btn_grid);
        Button relative_btn = findViewById(R.id.main_btn_relative);
        Button frame_btn = findViewById(R.id.main_btn_frame);

        liner_btn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LinerActivity.class);
            startActivity(intent);
        });
        table_btn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TableActivity.class);
            startActivity(intent);
        });
        grid_btn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, GridActivity.class);
            startActivity(intent);
        });
        relative_btn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RelativeActivity.class);
            startActivity(intent);
        });
        frame_btn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FrameActivity.class);
            startActivity(intent);
        });
    }
}