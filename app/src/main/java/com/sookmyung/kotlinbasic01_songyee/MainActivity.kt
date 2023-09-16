package com.sookmyung.kotlinbasic01_songyee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // 코틀린이 activity_main과 함께 동작한다는 뜻

        clickBtn.setOnClickListener {

            Log.d("메인화면로그", "클릭용 버튼 눌림") // 개발자들만 볼 수 있게 짠 코드. 로그캣에서 확인 가능.
            // 이 버튼을 눌렀을 때 이 함수가 잘 실행이 될 지 미리 보기 위함.
            // d는 debug의 d이다.
            Log.e("메인화면로그", "에러 관련 로그")
            // 얘는 로그캣에서 빨간 글씨로 뜬다.
            //로그의 종류는 여러 가지가 있는데 웬만하면 d,e,i(info) 선에서 해결하는 게 좋다

        }

        smallBtn.setOnClickListener {

            Toast.makeText(this, "작은 버튼 눌림", Toast.LENGTH_SHORT).show()
            // this는 여기 main activity에서 띄우겠다는 뜻.
        }



    }
}