package com.example.singingcoach;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onButton1Clicked(View v) {
        Toast.makeText(getApplicationContext(), "좋아요를 눌렀습니다!! ", Toast.LENGTH_LONG).show();
    }
    public void onButton2Clicked(View v) {
        Toast.makeText(getApplicationContext(), "싫어요를 눌렀습니다!! 힝...", Toast.LENGTH_LONG).show();
    }
    public void onButton3Clicked(View v) {
        Toast.makeText(getApplicationContext(), "좋아요를 눌렀습니다!! ", Toast.LENGTH_LONG).show();
    }
    public void onButton4Clicked(View v) {
        Toast.makeText(getApplicationContext(), "싫어요를 눌렀습니다!!", Toast.LENGTH_LONG).show();
    }
    public void onButton5Clicked(View v) {
        Toast.makeText(getApplicationContext(), "좋아요를 눌렀습니다!!", Toast.LENGTH_LONG).show();
    }
    public void onButton6Clicked(View v) {
        Toast.makeText(getApplicationContext(), "싫어요를 눌렀습니다!!", Toast.LENGTH_LONG).show();
    }
    public void onButton7Clicked(View v) {
        Toast.makeText(getApplicationContext(), "좋아요를 눌렀습니다!!", Toast.LENGTH_LONG).show();
    }
    public void onButton8Clicked(View v) {
        Toast.makeText(getApplicationContext(), "싫어요를 눌렀습니다!!", Toast.LENGTH_LONG).show();
    }
    public void onButton9Clicked(View v) {
        Toast.makeText(getApplicationContext(), "좋아요를 눌렀습니다!!", Toast.LENGTH_LONG).show();
    }
    public void onButton10Clicked(View v) {
        Toast.makeText(getApplicationContext(), "싫어요를 눌렀습니다!!", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
