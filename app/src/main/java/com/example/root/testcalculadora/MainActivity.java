package com.example.root.testcalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btsuma,btigual,btBorrar;
    EditText EditTexto;
    public String aux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.button1);
        bt2 = findViewById(R.id.button2);
        bt3 = findViewById(R.id.button3);
        bt4 = findViewById(R.id.button4);
        bt5 = findViewById(R.id.button5);
        bt6 = findViewById(R.id.button6);
        bt7 = findViewById(R.id.button7);
        bt8 = findViewById(R.id.button8);
        bt9 = findViewById(R.id.button9);
        bt0 = findViewById(R.id.button0);
        btsuma = findViewById(R.id.buttonSuma);
        btigual = findViewById(R.id.buttonIgual);
        btBorrar = findViewById(R.id.buttonBorrar);

        EditTexto = findViewById(R.id.EditText1);


        btBorrar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    EditTexto.setText("0");

                }
            }
        );

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditTexto.getText().toString().compareTo("0")==0){
                    EditTexto.setText("1");

                }
                else {
                    EditTexto.setText(EditTexto.getText() + "1");
                }
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditTexto.getText().toString().compareTo("0")==0){
                    EditTexto.setText("2");

                }
                else {
                    EditTexto.setText(EditTexto.getText() + "2");
                }
            }
        });

        //Boton 3

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditTexto.getText().toString().compareTo("0")==0){
                    EditTexto.setText("3");

                }
                else {
                    EditTexto.setText(EditTexto.getText() + "3");
                }
            }
        });

        //Boton 4
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditTexto.getText().toString().compareTo("0")==0){
                    EditTexto.setText("4");

                }
                else {
                    EditTexto.setText(EditTexto.getText() + "4");
                }
            }
        });

        //Boton 5

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditTexto.getText().toString().compareTo("0")==0){
                    EditTexto.setText("5");

                }
                else {
                    EditTexto.setText(EditTexto.getText() + "5");
                }
            }
        });

        //Boton 6
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditTexto.getText().toString().compareTo("0")==0){
                    EditTexto.setText("6");

                }
                else {
                    EditTexto.setText(EditTexto.getText() + "6");
                }
            }
        });

        //Boton 7
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditTexto.getText().toString().compareTo("0")==0){
                    EditTexto.setText("7");

                }
                else {
                    EditTexto.setText(EditTexto.getText() + "7");
                }
            }
        });

        //Boton 8

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditTexto.getText().toString().compareTo("0")==0){
                    EditTexto.setText("8");

                }
                else {
                    EditTexto.setText(EditTexto.getText() + "8");
                }
            }
        });

        //Boton 9

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditTexto.getText().toString().compareTo("0")==0){
                    EditTexto.setText("9");

                }
                else {
                    EditTexto.setText(EditTexto.getText() + "9");
                }
            }
        });

        //Boton 0

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditTexto.getText().toString().compareTo("0")==0){
                    EditTexto.setText("0");

                }
                else {
                    EditTexto.setText(EditTexto.getText() + "0");
                }
            }
        });
        btsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                aux = EditTexto.getText().toString();
                EditTexto.setText("0");

            }
        });

        btigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = EditTexto.getText().toString();

                int num1 = Integer.parseInt(aux);
                int num2 = Integer.parseInt(num);
                int suma = num1 + num2;

                String sum = Integer.toString(suma);
                EditTexto.setText(sum);
            }
        });


    }
}
