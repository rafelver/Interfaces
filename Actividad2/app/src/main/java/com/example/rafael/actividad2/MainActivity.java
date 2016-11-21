package com.example.rafael.actividad2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Codigo ToggleButton1
        final ToggleButton toggle = (ToggleButton) findViewById(R.id.toggleButton);
        final View view =(View) findViewById(R.id.view);

        view.setVisibility(View.INVISIBLE);

        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggle.isChecked()){
                    view.setVisibility(View.VISIBLE);
                }else{
                    view.setVisibility(View.INVISIBLE);
                }
            }
        });

        //Codigo del CheckBox
        final CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        checkBox.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (checkBox.isChecked()) {
                    String message = getResources().getString(R.string.Texto2);
                    checkBox.setText(message);
                }else {
                    String message = getResources().getString(R.string.Texto1);
                    checkBox.setText(message);
                }
            }
        });

        //TextView Con RatingBar
        final TextView tv = (TextView) findViewById(R.id.textView3);
        final RatingBar rs = (RatingBar) findViewById(R.id.ratingBar);
        final View v = (View) findViewById(R.id.view);

        rs.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                tv.setText("[" + rating + "]");
                v.setVisibility(View.INVISIBLE);
            }
        });


    }
}
