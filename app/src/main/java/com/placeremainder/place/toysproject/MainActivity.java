package com.placeremainder.place.toysproject;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mToysListTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToysListTextView=(TextView)findViewById(R.id.toys);

        String []toyNames=ToyBox.getToyNames();

        for(String toyName: toyNames)
            mToysListTextView.append(toyName+"\n\n");
    }
}
