package com.example.image;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    Button myButton;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //anh xa
        myButton = findViewById(R.id.testButton);
        imageView = findViewById(R.id.imageView);

        //eventClick
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.get().load("https://thuthuatphanmem.vn/uploads/2018/09/11/hinh-anh-dep-11_044127919.jpg?fbclid=IwZXh0bgNhZW0CMTEAAR3gtoDUBHL_-NEnypP4J8aTSib6gK0t9UZZs28HqujthWNtjpOv8D2c9bw_aem_j3dpi3talPc_V_s8h3H5Jg").into(imageView);
            }
        });
    }
}