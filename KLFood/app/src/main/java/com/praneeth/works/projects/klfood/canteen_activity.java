package com.praneeth.works.projects.klfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class canteen_activity extends AppCompatActivity {

    RecyclerView item_in_canteen;
    TextView canteenName,canteenPlace;
    ImageView back_btn,veg_tags;
    RelativeLayout canteen_image;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteen);
        item_in_canteen=findViewById(R.id.activity_canteen_recycler_view);
        canteenName=findViewById(R.id.activity_canteen_text_canteen_name);
        canteenPlace=findViewById(R.id.activity_canteen_text_canteen_place);
        back_btn=findViewById(R.id.activity_canteen_back_image);
        canteen_image=findViewById(R.id.activity_canteen_append_layout1);
        veg_tags=findViewById(R.id.activity_canteen_image_tags);


    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }

    @Override
    protected void onResume() {
        super.onResume();

        View decorView=getWindow().getDecorView();

        int uiOptions=View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                |View.SYSTEM_UI_FLAG_FULLSCREEN
                |View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                |View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                |View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN;

        decorView.setSystemUiVisibility(uiOptions);
    }
}