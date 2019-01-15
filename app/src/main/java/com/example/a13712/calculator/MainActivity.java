package com.example.a13712.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText edtshow;
    private Button chongxin;
    private Button chu;
    private Button cheng;
    private Button shanchu;
    private Button qi;
    private Button ba;
    private Button jiu;
    private Button jia;
    private Button si;
    private Button wu;
    private Button liu;
    private Button jian;
    private Button yi;
    private Button er;
    private Button san;
    private Button ling;
    private Button dian;
    private Button dengyu;
    private String shuzu="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        edtshow = (EditText) findViewById(R.id.edtshow);
        chongxin = (Button) findViewById(R.id.chongxin);
        chu = (Button) findViewById(R.id.chu);
        cheng = (Button) findViewById(R.id.cheng);
        shanchu = (Button) findViewById(R.id.shanchu);
        qi = (Button) findViewById(R.id.qi);
        ba = (Button) findViewById(R.id.ba);
        jiu = (Button) findViewById(R.id.jiu);
        jia = (Button) findViewById(R.id.jia);
        si = (Button) findViewById(R.id.si);
        wu = (Button) findViewById(R.id.wu);
        liu = (Button) findViewById(R.id.liu);
        jian = (Button) findViewById(R.id.jian);
        yi = (Button) findViewById(R.id.yi);
        er = (Button) findViewById(R.id.er);
        san = (Button) findViewById(R.id.san);
        ling = (Button) findViewById(R.id.ling);
        dian = (Button) findViewById(R.id.dian);
        dengyu = (Button) findViewById(R.id.dengyu);

        chongxin.setOnClickListener(this);
        chu.setOnClickListener(this);
        cheng.setOnClickListener(this);
        shanchu.setOnClickListener(this);
        qi.setOnClickListener(this);
        ba.setOnClickListener(this);
        jiu.setOnClickListener(this);
        jia.setOnClickListener(this);
        si.setOnClickListener(this);
        wu.setOnClickListener(this);
        liu.setOnClickListener(this);
        jian.setOnClickListener(this);
        yi.setOnClickListener(this);
        er.setOnClickListener(this);
        san.setOnClickListener(this);
        ling.setOnClickListener(this);
        dian.setOnClickListener(this);
        dengyu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.chongxin:
                shuzu="";
                edtshow.setText("0");
                break;
            case R.id.chu:
                 GetStirin(chu);
                break;
            case R.id.cheng:
                GetStirin(cheng);
                break;
            case R.id.shanchu:
               if (shuzu.length()>0){
                   String substring=shuzu.substring(0,shuzu.length()-1);
                   shuzu=substring;
                   edtshow.setText(shuzu+"");
               }

                break;
            case R.id.qi:
                GetStirin(qi);
                break;
            case R.id.ba:
                GetStirin(ba);
                break;
            case R.id.jiu:
                GetStirin(jiu);
                break;
            case R.id.jia:
                GetStirin(jia);
                break;
            case R.id.si:
                GetStirin(si);
                break;
            case R.id.wu:
                GetStirin(wu);
                break;
            case R.id.liu:
                GetStirin(liu);
                break;
            case R.id.jian:
                GetStirin(jian);
                break;
            case R.id.yi:
                GetStirin(yi);
                break;
            case R.id.er:
                GetStirin(er);
                break;
            case R.id.san:
                GetStirin(san);
                break;
            case R.id.ling:
                GetStirin(ling);
                break;
            case R.id.dian:
                GetStirin(dian);
                break;
            case R.id.dengyu:
                GetResult();
                break;
        }
    }

    public void GetStirin(Button B ){
        String b=B.getText()+"";
        shuzu=shuzu+b;
        edtshow.setText(shuzu);
    }
    public void GetResult(){
        String[] jia=shuzu.split("\\+");
        String[] jian=shuzu.split("\\-");
        String[] cheng=shuzu.split("\\*");
        String[] chu=shuzu.split("\\÷");
        double result=0.0000;
        if (jia.length==2){
            double a=Double.valueOf(jia[0]);
            double b=Double.valueOf(jia[1]);
            result=a+b;
        }else if (jian.length==2){
            double a=Double.valueOf(jian[0]);
            double b=Double.valueOf(jian[1]);
            result=a-b;
        }else if (cheng.length==2){
            double a=Double.valueOf(cheng[0]);
            double b=Double.valueOf(cheng[1]);
            result=a*b;
        }else if (chu.length==2){
            double a=Double.valueOf(chu[0]);
            double b=Double.valueOf(chu[1]);
            result=a/b;
        }
        shuzu="";
        edtshow.setText(result+"");
    }
}
