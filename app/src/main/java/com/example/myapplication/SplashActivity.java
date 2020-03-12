package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SplashActivity extends AppCompatActivity {
    String textmsg="hello";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
       // ImageView img= findViewById(R.id.img1);
        //TextView txt=findViewById(R.id.text1);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i= new Intent(SplashActivity.this,Navigation.class);
               // File file=new File(getFilesDir());

                //WriteBtn();
//             boolean val=   ReadBtn();
//                if(val==true) {
                    startActivity(i);
                    finish();
//                }
//                else{
//                    finish();
//                }
            }
        },3000);

    }
//    public void WriteBtn() {
//        // add-write text into file
//
//        try {
//            FileOutputStream fileout=openFileOutput("mytextfile.txt", MODE_PRIVATE);
//            OutputStreamWriter outputWriter=new OutputStreamWriter(fileout);
//            outputWriter.write(textmsg.toString());
//            outputWriter.close();
//
//            //display file saved message
//            //Toast.makeText(getBaseContext(), "File saved successfully!",
//                  //  Toast.LENGTH_LONG).show();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    public boolean ReadBtn() {
//        //reading text from file
//        try {
//            FileInputStream fileIn=openFileInput("mytextfile.txt");
//            InputStreamReader InputRead= new InputStreamReader(fileIn);
//
//            char[] inputBuffer= new char[20];
//            String s="";
//            int charRead;
//
//            while ((charRead=InputRead.read(inputBuffer))>0) {
//                // char to string conversion
//                String readstring=String.copyValueOf(inputBuffer,0,charRead);
//                s +=readstring;
//            }
//            InputRead.close();
//            //Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
//
//            //textmsg.setText(s);
//            return true;
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
    }

