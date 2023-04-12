package com.au.calldialer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.au.calldialer.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    String number = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "1";
                binding.phoneNumber.setText(number);
            }
        });
        binding.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "2";
                binding.phoneNumber.setText(number);
            }
        });
        binding.btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "3";
                binding.phoneNumber.setText(number);
            }
        });
        binding.btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "4";
                binding.phoneNumber.setText(number);
            }
        });

        binding.btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "5";
                binding.phoneNumber.setText(number);
            }
        });
        binding.btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "6";
                binding.phoneNumber.setText(number);
            }
        });
        binding.btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "7";
                binding.phoneNumber.setText(number);
            }
        });
        binding.btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "8";
                binding.phoneNumber.setText(number);
            }
        });
        binding.btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "9";
                binding.phoneNumber.setText(number);
            }
        });
        binding.btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "0";
                binding.phoneNumber.setText(number);
            }
        });
        binding.btnHash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "#";
                binding.phoneNumber.setText(number);
            }
        });
        binding.btnStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "*";
                binding.phoneNumber.setText(number);
            }
        });
        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number.length() >= 1) {
                    StringBuffer stringBuffer = new StringBuffer(number);
                    stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                    number = stringBuffer.toString();
                    binding.phoneNumber.setText(number);
                }


            }
        });

        binding.btncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.CALL_PHONE},46);
                }
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:"+number));
                startActivity(callIntent);
            }
        });

    }
}
