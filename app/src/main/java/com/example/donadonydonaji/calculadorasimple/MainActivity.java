package com.example.donadonydonaji.calculadorasimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txtRes;
    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnMas;
    Button btnMenos;
    Button btnDiv;
    Button btnMul;
    Button btnIgual;
    Button btnPunto;
    Button btnC;
    String cad="";
    Double ant;
    int operation;
    double total = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtRes=(TextView) findViewById(R.id.txtNumero);
        btn0=(Button) findViewById(R.id.btn0);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        btn5=(Button) findViewById(R.id.btn5);
        btn6=(Button) findViewById(R.id.btn6);
        btn7=(Button) findViewById(R.id.btn7);
        btn8=(Button) findViewById(R.id.btn8);
        btn9=(Button) findViewById(R.id.btn9);
        btnMas=(Button) findViewById(R.id.btnMas);
        btnMenos=(Button) findViewById(R.id.btnMenos);
        btnDiv=(Button) findViewById(R.id.btnDivision);
        btnMul=(Button) findViewById(R.id.btnMultiplicacion);
        btnIgual=(Button) findViewById(R.id.btnIgual);
        btnPunto=(Button) findViewById(R.id.btnPunto);
        btnC=(Button) findViewById(R.id.btnC);


        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnMas.setOnClickListener(this);
        btnMenos.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnIgual.setOnClickListener(this);
        btnPunto.setOnClickListener(this);
        btnC.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btn0:
                cad+="0";
                txtRes.setText(cad);
                break;
            case R.id.btn1:
                cad+="1";
                txtRes.setText(cad);
                break;
            case R.id.btn2:
                cad+="2";
                txtRes.setText(cad);
                break;
            case R.id.btn3:
                cad+="3";
                txtRes.setText(cad);
                break;
            case R.id.btn4:
                cad+="4";
                txtRes.setText(cad);
                break;
            case R.id.btn5:
                cad+="5";
                txtRes.setText(cad);
                break;
            case R.id.btn6:
                cad+="6";
                txtRes.setText(cad);
                break;
            case R.id.btn7:
                cad+="7";
                txtRes.setText(cad);
                break;
            case R.id.btn8:
                cad+="8";
                txtRes.setText(cad);
                break;
            case R.id.btn9:
                cad+="9";
                txtRes.setText(cad);
                break;
            case R.id.btnMas:
                ant=Double.parseDouble(cad);
                txtRes.setText("");
                operation=1;
                cad="";
                break;
            case R.id.btnMenos:
                ant=Double.parseDouble(cad);
                txtRes.setText("");
                operation=2;
                cad="";
                break;
            case R.id.btnDivision:
                ant=Double.parseDouble(cad);
                txtRes.setText("");
                operation=3;
                cad="";

                break;
            case R.id.btnMultiplicacion:
                ant=Double.parseDouble(cad);
                txtRes.setText("");
                operation=4;
                cad="";
                break;
            case R.id.btnPunto:
                cad="-"+cad;
                txtRes.setText(cad);
                break;
            case R.id.btnC:{
                txtRes.setText("");
                ant=0.0;
                cad="";

                break;

            }
            case R.id.btnIgual:
                switch (operation){
                    case 1:
                    {
                        total=Double.parseDouble(cad)+ant;
                        txtRes.setText(total+"");
                        break;
                    }

                    case 2:
                    {
                        total=ant-Double.parseDouble(cad);
                        txtRes.setText(total+"");
                        break;
                    }
                    case 3:
                    {
                        total=ant/Double.parseDouble(cad);
                        txtRes.setText(total+"");
                        break;
                    }
                    case 4:
                    {
                        total=Double.parseDouble(cad)*ant;
                        txtRes.setText(total+"");
                        break;
                    }
                }

                break;
        }
    }
}
