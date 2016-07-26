package com.wangban.yzbbanban.test_sharedpreferances;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tv_content);
        editText = (EditText) findViewById(R.id.et_content);

    }

    public void saveData(View view) {
        String hello = editText.getText().toString().trim();
        SharedPreferences sp = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("hello", hello);
        editor.commit();
    }

    public void getData(View view) {
        SharedPreferences sp = getPreferences(Context.MODE_PRIVATE);
        String he=sp.getString("hello","ok");
        textView.setText(he);
    }

}
