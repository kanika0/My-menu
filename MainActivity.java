package rcew.mymenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1,cb2,cb3,cb4,cb5;
    Button   b1,b2,b3,b4,b5,sumb;
    TextView t1,t2,t3,t4,t5,tt1,tt2,tt3;
    static String s1,s2,s3,s4,s5,ss1,ss2,ss3,ss4,ss5;
    static String a,b,c,d,e,f;
    int total = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1 = (CheckBox)findViewById(R.id.checkBox);
        cb2 = (CheckBox)findViewById(R.id.checkBox1);
        cb3 = (CheckBox)findViewById(R.id.checkBox2);
        cb4 = (CheckBox)findViewById(R.id.checkBox3);
        cb5 = (CheckBox)findViewById(R.id.checkBox4);

        tt1=(TextView)findViewById(R.id.textView7);
        tt1=(TextView)findViewById(R.id.textView8);
        tt1=(TextView)findViewById(R.id.textView9);

        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button1);
        b3 = (Button)findViewById(R.id.button2);
        b4 = (Button)findViewById(R.id.button3);
        b5 = (Button)findViewById(R.id.button4);
        sumb =(Button)findViewById(R.id.button5);

        b1.setOnClickListener(

                new View.OnClickListener() {
                    int count = 0,price;
                    String s1;
                    @Override
                    public void onClick(View v) {
                        if(cb1.isChecked()==true)
                        {
                            count = count+1;
                            s1=String.valueOf(count);
                            b1.setText(s1);
                            Toast.makeText(MainActivity.this,""+s1,Toast.LENGTH_LONG).show();
                        }
                        price = count *40;
                        ss1 = String.valueOf(price);
                        total = total +price;

                    }
                }
        );
        b2.setOnClickListener(

                new View.OnClickListener() {
                    int count = 0,price;
                    String s1;
                    @Override
                    public void onClick(View v) {
                        if(cb2.isChecked()==true)
                        {
                            count = count+1;
                            s1=String.valueOf(count);
                            b2.setText(s1);
                            Toast.makeText(MainActivity.this,""+s1,Toast.LENGTH_LONG).show();
                        }
                        price = count *20;
                        ss2 = String.valueOf(price);
                        total = total +price;


                    }
                }
        );
        b3.setOnClickListener(

                new View.OnClickListener() {
                    int count = 0,price;
                    String s1;
                    @Override
                    public void onClick(View v) {
                        if(cb3.isChecked()==true)
                        {
                            count = count+1;
                            s1=String.valueOf(count);
                            b3.setText(s1);
                            Toast.makeText(MainActivity.this,""+s1,Toast.LENGTH_LONG).show();
                        }
                        price = count *10;
                        ss3 = String.valueOf(price);
                        total = total +price;


                    }
                }
        );

        b4.setOnClickListener(

                new View.OnClickListener() {
                    int count = 0,price;
                    String s1;
                    @Override
                    public void onClick(View v) {
                        if(cb4.isChecked()==true)
                        {
                            count = count+1;
                            s1=String.valueOf(count);
                            b4.setText(s1);
                            Toast.makeText(MainActivity.this,""+s1,Toast.LENGTH_LONG).show();
                        }price = count *30;
                        ss4 = String.valueOf(price);
                        total = total +price;


                    }
                }
        );
        b5.setOnClickListener(

                new View.OnClickListener() {
                    int count = 0,price;
                    String s1;
                    @Override
                    public void onClick(View v) {
                        if(cb5.isChecked()==true)
                        {
                            count = count+1;
                            s1=String.valueOf(count);
                            b5.setText(s1);
                            Toast.makeText(MainActivity.this,""+s1,Toast.LENGTH_LONG).show();
                        }
                        price = count *35;
                        ss5 = String.valueOf(price);
                        total = total +price;

                    }
                }
        );

        sumb.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        a = b1.getText().toString();
                        b = b2.getText().toString();
                        c = b3.getText().toString();
                        d= b4.getText().toString();
                        e = b5.getText().toString();
                        Intent obj = new Intent(MainActivity.this,Viewbill.class);
                        startActivity(obj);


                    }
                }

        );





    }
}
