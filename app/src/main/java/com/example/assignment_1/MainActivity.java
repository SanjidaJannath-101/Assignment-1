package com.example.assignment_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;
    private Button button;

    private int[] images = {R.drawable.image1, R.drawable.image2, R.drawable.image3};
    private String[] descriptions = {"Hello There!!!","First Image", "Second Image"};

    private int currentImageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentImageIndex = (currentImageIndex + 1) % images.length;
                imageView.setImageResource(images[currentImageIndex]);
                textView.setText(descriptions[currentImageIndex]);
                
                Toast.makeText(MainActivity.this, "Image changed to: " + descriptions[currentImageIndex], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
