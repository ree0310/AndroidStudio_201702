package com.example.sep_13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

// activiy와 intent가 중요한 클래스이다!!
// 메소드안에 파라미터, 매개변수(argument)가 들어있는 경우가 있다.
    // 메소드는 .(온점)으로 시작한다.
    public void NextScene(View v){ // nextScene은 이벤트 핸들러이다.
        Intent i = new Intent(this, Main2Activity.class); // intent는 일종의 메시지 개체이다.
        // nextScene을 실행시키기 위해서는 startActiviy가 꼭 있어야 한다.
        // 안드로이드 미들웨어와 연결시켜주는 역할을 한다.
        startActivity(i); // activity를 실행시키는데 intent를 보고 그것을 따라서 실행을 하겠다는 의미이다.
    }

}
