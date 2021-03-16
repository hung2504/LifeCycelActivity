package com.example.lifecycelactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends Activity {
    Button btnmot, btnhai, btnba, btnbon, btnnam, btnsau, btnbay, btntam, btnchin,
        btnkhong, btnbang, btncong, btntru, btnnhan, btnchia, btnxoa;
    String chuoi = "", ketQuaShow, clear = "";
    int numberOne, numberTwo, ketQua;
    int phepTinh = 0, save = 0, save2 = 0;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        AnhXa();
        btnkhong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chuoi += "0";
                textView.setText(chuoi);
            }
        });
        btnmot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chuoi += "1";
                textView.setText(chuoi);
            }
        });btnhai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chuoi += "2";
                textView.setText(chuoi);
            }
        });btnba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chuoi += "3";
                textView.setText(chuoi);
            }
        });btnbon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chuoi += "4";
                textView.setText(chuoi);
            }
        });btnnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chuoi += "5";
                textView.setText(chuoi);
            }
        });btnsau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chuoi += "6";
                textView.setText(chuoi);
            }
        });btnbay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chuoi += "7";
                textView.setText(chuoi);
            }
        });btntam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chuoi += "8";
                textView.setText(chuoi);
            }
        });btnchin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chuoi += "9";
                textView.setText(chuoi);
            }
        });btnbang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberTwo = Integer.parseInt(textView.getText().toString());
                if (phepTinh == 1){
                    ketQua = numberOne + numberTwo;
                }else if(phepTinh == 2){
                    ketQua = numberOne - numberTwo;
                }else if(phepTinh == 3){
                    ketQua = numberOne * numberTwo;
                }else if(phepTinh == 4){
                    ketQua = numberOne / numberTwo;
                }
                textView.setText(ketQua+"");
            }
        });btncong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberOne = Integer.parseInt(textView.getText().toString().trim());
                chuoi = "";
                phepTinh = 1;
                textView.setText("0");
            }
        });btntru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberOne = Integer.parseInt(textView.getText().toString().trim());
                chuoi = "";
                phepTinh = 2;
                textView.setText("0");
            }
        });btnnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberOne = Integer.parseInt(textView.getText().toString().trim());
                chuoi = "";
                phepTinh = 3;
                textView.setText("0");
            }
        });btnchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberOne = Integer.parseInt(textView.getText().toString().trim());
                chuoi = "";
                phepTinh = 4;
                textView.setText("0");
            }
        });btnxoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chuoi = "";
                phepTinh = 0;
                textView.setText("0");
            }
        });
    }

    private void AnhXa() {
        btnkhong = (Button) findViewById(R.id.btn0);
        btnmot = (Button) findViewById(R.id.btn1);
        btnhai = (Button) findViewById(R.id.btn2);
        btnba = (Button) findViewById(R.id.btn3);
        btnbon = (Button) findViewById(R.id.btn4);
        btnnam = (Button) findViewById(R.id.btn5);
        btnsau = (Button) findViewById(R.id.btn6);
        btnbay = (Button) findViewById(R.id.btn7);
        btntam = (Button) findViewById(R.id.btn8);
        btnchin = (Button) findViewById(R.id.btn9);
        btncong = (Button) findViewById(R.id.btnc);
        btntru = (Button) findViewById(R.id.btnt);
        btnnhan = (Button) findViewById(R.id.btnn);
        btnchia = (Button) findViewById(R.id.btnch);
        btnbang = (Button) findViewById(R.id.btnb);
        btnxoa = (Button) findViewById(R.id.btnac);
        textView = (TextView) findViewById(R.id.txtkq);
    }
}