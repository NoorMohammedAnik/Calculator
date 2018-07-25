package com.anik.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtDisplay,txtTopDisplay,txtZero,txtDoubleZero,txtAC,txtOne,txtTwo,txtThree,txtFour,txtFive,txtSix,txtSeven,txtEight,txtNine;
    ImageView imgPlus,imgSub,imgDivision,imgMulti,imgPercent,imgEqual;

    String value="",value1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDisplay=(TextView)findViewById(R.id.txt_display);
        txtTopDisplay=(TextView)findViewById(R.id.txt_top_display);

        txtZero=(TextView)findViewById(R.id.txt_zero);
        txtDoubleZero=(TextView)findViewById(R.id.txt_double_zero);
        txtAC=(TextView)findViewById(R.id.txt_ac);

        txtOne=(TextView)findViewById(R.id.txt_one);
        txtTwo=(TextView)findViewById(R.id.txt_two);
        txtThree=(TextView)findViewById(R.id.txt_three);
        txtFour=(TextView)findViewById(R.id.txt_four);
        txtFive=(TextView)findViewById(R.id.txt_five);
        txtSix=(TextView)findViewById(R.id.txt_six);
        txtSeven=(TextView)findViewById(R.id.txt_seven);
        txtEight=(TextView)findViewById(R.id.txt_eight);
        txtNine=(TextView)findViewById(R.id.txt_nine);

        imgPlus=(ImageView)findViewById(R.id.img_plus);
        imgSub=(ImageView)findViewById(R.id.img_sub);
        imgMulti=(ImageView)findViewById(R.id.img_multi);
        imgDivision=(ImageView)findViewById(R.id.img_division);
        imgPercent=(ImageView)findViewById(R.id.img_percent);
        imgEqual=(ImageView)findViewById(R.id.img_equal);

        txtZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value+="0";
                txtDisplay.setText(value);

            }
        });


        txtOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value+="1";
                txtDisplay.setText(value);

            }
        });

        txtTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value+="2";
                txtDisplay.setText(value);

            }
        });

        txtThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value+="3";
                txtDisplay.setText(value);

            }
        });

        txtFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value+="4";
                txtDisplay.setText(value);

            }
        });

        txtFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value+="5";
                txtDisplay.setText(value);

            }
        });

        txtSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value+="6";
                txtDisplay.setText(value);

            }
        });

        txtSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value+="7";
                txtDisplay.setText(value);

            }
        });

        txtEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value+="8";
                txtDisplay.setText(value);

            }
        });

        txtNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value+="9";
                txtDisplay.setText(value);


            }
        });



        txtDoubleZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value+="00";
                txtDisplay.setText(value);


            }
        });


        txtAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtDisplay.setText("0");
                txtTopDisplay.setText("0");
                value="";
                value1="";

            }
        });


        imgPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtTopDisplay.setText(value);
                txtDisplay.setText("0");
                value1=value;
                value="";
            }
        });

        imgEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int n1=Integer.parseInt(value1);
                int n2=Integer.parseInt(value);
                int result=n1+n2;
                txtDisplay.setText(String.valueOf(result));
                value="";
            }
        });

    }
}
