package com.example.tkmoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button b_rock, b_paper, b_scissors;
ImageView iv_cpu, iv_me;

    String benimSecimim, bilgisayarinSecimi, sonuc;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_cpu = (ImageView) findViewById(R.id.iv_cpu);
        iv_me = (ImageView) findViewById(R.id.iv_me);


        b_rock = (Button) findViewById(R.id.b_rock);
        b_paper = (Button) findViewById(R.id.b_paper);
        b_scissors = (Button) findViewById(R.id.b_scissors);

        r= new Random();

        b_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             benimSecimim = "taş";
             iv_me.setImageResource(R.drawable.tas);
             hesap();
            }
        });
        b_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            benimSecimim = "kağıt";
            iv_me.setImageResource(R.drawable.kagit);
            hesap();
            }
        });
        b_scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            benimSecimim = "makas";
            iv_me.setImageResource(R.drawable.makas);
            hesap();
            }
        });
    }
    public void hesap (){
    int cpu =r.nextInt(3);
    if (cpu == 0){
      bilgisayarinSecimi = "taş";
    iv_cpu.setImageResource(R.drawable.tas);
      } else  if (cpu == 1){
        bilgisayarinSecimi = "kağıt";
        iv_cpu.setImageResource(R.drawable.kagit);
    } else  if (cpu == 2){
        bilgisayarinSecimi = "makas";
        iv_cpu.setImageResource(R.drawable.makas);
      }
    if (benimSecimim.equals("taş") && bilgisayarinSecimi.equals("kağıt")){
    sonuc = "Kaybettiniz";
    } else if (benimSecimim.equals("taş") && bilgisayarinSecimi.equals("makas")){
            sonuc = "Kazandınız!";
        } else if (benimSecimim.equals("kağıt") && bilgisayarinSecimi.equals("taş")){
            sonuc = "Kazandınız!";
        } else if (benimSecimim.equals("kağıt") && bilgisayarinSecimi.equals("makas")){
            sonuc = "Kaybettiniz";
        } else if (benimSecimim.equals("makas") && bilgisayarinSecimi.equals("kağıt")){
            sonuc = "Kazandınız!";
        } else if (benimSecimim.equals("makas") && bilgisayarinSecimi.equals("taş")){
            sonuc = "Kaybettiniz";
        } else if(benimSecimim.equals("makas") && bilgisayarinSecimi.equals("makas")){
            sonuc = "Berabere";
        }
        else if(benimSecimim.equals("taş") && bilgisayarinSecimi.equals("taş")){
            sonuc = "Berabere";
        }
        else if(benimSecimim.equals("kağıt") && bilgisayarinSecimi.equals("kağıt")){
            sonuc = "Berabere";
        }

        Toast.makeText(MainActivity.this, sonuc, Toast.LENGTH_SHORT).show();

     }
   }
