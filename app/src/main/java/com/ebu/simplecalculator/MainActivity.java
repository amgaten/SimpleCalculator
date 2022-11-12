package com.ebu.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.txt_num1);
        et2=(EditText)findViewById(R.id.txt_num2);
        tv1=(TextView)findViewById(R.id.txt_resultado);
    }

    //Realiza la suma
    public void Sumar(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();

        int num1=Integer.parseInt(valor1);
        int num2=Integer.parseInt(valor2);
        int suma=num1+num2;
        String result= String.valueOf(suma);
        tv1.setText("El resultado es " + result);
    }

    public void Multiplicar(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();

        int num1=Integer.parseInt(valor1);
        int num2=Integer.parseInt(valor2);
        int multiplicar=num1*num2;
        String result= String.valueOf(multiplicar);
        tv1.setText("El resultado es " + result);
    }

    public void Promedio(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();

        int num1=Integer.parseInt(valor1);
        int num2=Integer.parseInt(valor2);
        int promedio=(num1+num2)/2;
        String result= String.valueOf(promedio);
        tv1.setText("El resultado es " + result);
    }

    public void Restar(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();

        int num1=Integer.parseInt(valor1);
        int num2=Integer.parseInt(valor2);
        int restar=(num1-num2);
        String result= String.valueOf(restar);
        tv1.setText("El resultado es " + result);
    }

    public void Dividir(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();

        float num1=Integer.parseInt(valor1);
        float num2=Integer.parseInt(valor2);
        float dividir = 0;
        if(num2 == 0){
            tv1.setText("No se puede dividir por cero");
        }
        else {
            dividir = (num1 / num2);
            String result= String.valueOf(dividir);
            tv1.setText("El resultado es " + result);
                }

    }



}