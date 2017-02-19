package com.hackingbuzz.library1wheelview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.weigan.loopview.LoopView;
import com.weigan.loopview.OnItemSelectedListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList list = new ArrayList();

        for(int i=0 ; i<15 ; i++) {
            list.add("item "+i);
        }

        LoopView loopView = (LoopView) findViewById(R.id.loopView);
        loopView.setItems(list);


        loopView.setListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(int index) {
             Toast toast =   Toast.makeText(getApplicationContext(), "This is item " +index, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
