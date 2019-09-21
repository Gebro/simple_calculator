package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView TV_result;
    String temp="";
    String sub="";
    int intValue=0;
    int result=0;
    char c='+';
    Button b1;
    Button b2;
    Button b3;
    Button b_div;
    Button b4;
    Button b5;
    Button b6;
    Button b_mult;
    Button b7;
    Button b8;
    Button b9;
    Button b_add;
    Button b0;
    Button b_eq;
    Button b_sub;
    Button b_clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn_1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TV_result=findViewById(R.id.txt_result);
                TV_result.setText(TV_result.getText().toString()+"1");
                casting((Button) view);


            }
        });
        b_add=findViewById(R.id.btn_add);
        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TV_result=findViewById(R.id.txt_result);
                TV_result.setText(TV_result.getText().toString()+"+");
                op((Button)view);

            }
        });
        b_sub=findViewById(R.id.btn_sub);
        b_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TV_result=findViewById(R.id.txt_result);
                TV_result.setText(TV_result.getText().toString()+"-");
                op((Button)view);

            }
        });
        b_mult=findViewById(R.id.btn_mult);
        b_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TV_result=findViewById(R.id.txt_result);
                TV_result.setText(TV_result.getText().toString()+"*");
                op((Button)view);

            }
        });
        b_div=findViewById(R.id.btn_div);
        b_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TV_result=findViewById(R.id.txt_result);
                TV_result.setText(TV_result.getText().toString()+"/");
                op((Button)view);

            }
        });

        b2=findViewById(R.id.btn_2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TV_result=findViewById(R.id.txt_result);
                TV_result.setText(TV_result.getText().toString()+"2");
                casting((Button) view);


            }
        });
        b3=findViewById(R.id.btn_3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TV_result=findViewById(R.id.txt_result);
                TV_result.setText(TV_result.getText().toString()+"3");
                casting((Button) view);


            }
        });
        b4=findViewById(R.id.btn_4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TV_result=findViewById(R.id.txt_result);
                TV_result.setText(TV_result.getText().toString()+"4");
                casting((Button) view);


            }
        });
        b5=findViewById(R.id.btn_5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TV_result=findViewById(R.id.txt_result);
                TV_result.setText(TV_result.getText().toString()+"5");
                casting((Button) view);


            }
        });
        b6=findViewById(R.id.btn_6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TV_result=findViewById(R.id.txt_result);
                TV_result.setText(TV_result.getText().toString()+"6");
                casting((Button) view);


            }
        });
        b7=findViewById(R.id.btn_7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TV_result=findViewById(R.id.txt_result);
                TV_result.setText(TV_result.getText().toString()+"7");
                casting((Button) view);


            }
        });
        b8=findViewById(R.id.btn_8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TV_result=findViewById(R.id.txt_result);
                TV_result.setText(TV_result.getText().toString()+"8");
                casting((Button) view);


            }
        });
        b9=findViewById(R.id.btn_9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TV_result=findViewById(R.id.txt_result);
                TV_result.setText(TV_result.getText().toString()+"9");
                casting((Button) view);


            }
        });
        b0=findViewById(R.id.btn_0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TV_result=findViewById(R.id.txt_result);
                TV_result.setText(TV_result.getText().toString()+"0");
                casting((Button) view);


            }
        });


        b_eq=findViewById(R.id.btn_eq);
        b_eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = TV_result.getText().toString();
                temp+=((Button)view).getText().toString();

                intValue = Integer.valueOf(sub);
                TV_result.setText(temp);

                if (c == '+') {
                    result+=intValue;
                }
                else if(c=='-'){
                    result-=intValue;
                }
                else if(c =='*'){
                    result*=intValue;
                }
                else if(c=='/'){
                    result/=intValue;
                }
                sub = "";
                TV_result.setText(String.valueOf(result));
            }
        });
        b_clear=findViewById(R.id.btn_clear);
        b_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TV_result=findViewById(R.id.txt_result);
                TV_result.setText("");
                temp="";
                sub="";
                intValue=0;
                result=0;
                c='+';

            }
        });


    }
    public void casting(Button view){
        temp = TV_result.getText().toString();
        TV_result.setText(temp);
        sub += ((Button)view).getText().toString();

    }
    public void op (Button view){
        temp = TV_result.getText().toString();

        intValue = Integer.valueOf(sub);
        TV_result.setText(temp);

        if (c == '+') {
            result+=intValue;
        }
        else if(c=='-'){
            result-=intValue;
        }
        else if(c =='*'){
            result*=intValue;
        }
        else if(c=='/'){
            result/=intValue;
        }
        sub="";
        c = ((Button)view).getText().charAt(0);


    }


}
