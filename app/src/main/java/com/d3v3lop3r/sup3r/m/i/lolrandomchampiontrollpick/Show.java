package com.d3v3lop3r.sup3r.m.i.lolrandomchampiontrollpick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Show extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);}
    int info = 0;
    public void showInfoButton (View v) {
        TextView textView1 = (TextView) findViewById(R.id.showInfo);
        TextView textView2 = (TextView) findViewById(R.id.showInfoPerson);
        info++;
        switch (info) {
            case 1:
                textView1.setText("제작자");
                textView2.setText("Local");
                break;
            case 2:
                textView1.setText("제작팀");
                textView2.setText("Team Vector");
                break;
            case 3:
                textView1.setText("아이디어");
                textView2.setText("송제혁");
                break;
            case 4:
                textView1.setText("제작기간");
                textView2.setText("약 하루");
                break;
            case 5:
                textView1.setText("별점테러");
                textView2.setText("Woo yong Lee");
                break;
            case 6:
                textView1.setText("사용된 소스의 줄 수");
                textView2.setText("2,146줄");
                break;
        }
        if(info==6){
            info = 0;
        }
    }
    public void logo(View v){
        int hello;
        hello = ((int) (Math.random() * 7));
        hello++;
        switch (hello) {
            case 1:
                Toast.makeText(getApplicationContext(), "안녕하시오!", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(getApplicationContext(), "반갑소이다!", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(getApplicationContext(), "자네 갈길은 자네가 찾으시란 말이오!", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(getApplicationContext(), "....심심하당", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Toast.makeText(getApplicationContext(), "....배고프당", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                Toast.makeText(getApplicationContext(), "이 앱의 소스는 2,146줄입니다!", Toast.LENGTH_SHORT).show();
                break;
            case 7:
                Toast.makeText(getApplicationContext(), "냥냥", Toast.LENGTH_SHORT).show();
                break;
        }

//        Intent intent = getIntent();
//        int pick = intent.getIntExtra("ID");

    }


        
    }


