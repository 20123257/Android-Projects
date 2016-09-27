package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    public boolean flag1,flag2,flag3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        btn1 = (Button)findViewById(R.id.mybtn1);
        btn2 = (Button)findViewById(R.id.mybtn2);
        btn3 = (Button)findViewById(R.id.mybtn3);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flag1=false;
        flag2=false;
        flag3=false;
    }

    public void OnClick(View v){
        switch(v.getId()){
            case R.id.mybtn1:
                Btn1onclick();
                break;
            case R.id.mybtn2:
                Btn2onclick();
                break;
            case R.id.mybtn3:
                Btn3onclick();
                break;
        }
    }
    public void Btn1onclick() {
        flag2 = false;
        flag3 = false;
        if(flag1==true)
            flag1 =false;
        else
            flag1=true;
    }
    public void Btn2onclick(){
        flag1 = false;
        flag3 = false;
        if(flag2==true)
            flag2 =false;
        else
            flag2=true;
    }
    public void Btn3onclick(){
        flag1 = false;
        flag2 = false;
        if(flag3==true)
            flag3=false;
        else
            flag3=true;
    }
    public void onclickbtn(){
        if(flag1==true){
            btn1.setText("Btn1 On");
        }
        else{
            btn1.setText("Btn1 Off");
        }
        if(flag2==true){
            btn2.setText("Btn2 On");
        }
        else{
            btn2.setText("Btn2 Off");
        }
        if(flag1==true){
            btn3.setText("Btn3 On");
        }
        else{
            btn3.setText("Btn3 Off");
        }
    }
}
