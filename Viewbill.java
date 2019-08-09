package rcew.mymenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Viewbill extends AppCompatActivity {
     TextView p,q,r,s,t,u,v,w,x,y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewbill);
        p = (TextView)findViewById(R.id.textView15);
        q =  (TextView)findViewById(R.id.textView18);
        r = (TextView)findViewById(R.id.textView21);
        s = (TextView)findViewById(R.id.textView24);
        t = (TextView)findViewById(R.id.textView27);

        u =(TextView)findViewById(R.id.textView16);
        v =(TextView)findViewById(R.id.textView19);
        w =(TextView)findViewById(R.id.textView22);
        x =(TextView)findViewById(R.id.textView25);
        y =(TextView)findViewById(R.id.textView28);


        p.setText(MainActivity.a);
        q.setText(MainActivity.b);
        r.setText(MainActivity.c);
        s.setText(MainActivity.d);
        t.setText(MainActivity.e);

        u.setText(MainActivity.ss1);
        v.setText(MainActivity.ss2);
        w.setText(MainActivity.ss3);
        x.setText(MainActivity.ss4);
        y.setText(MainActivity.ss5);



    }
}
