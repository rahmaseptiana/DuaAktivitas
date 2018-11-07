package com.arruya.choco.duaaktivitas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="pesan";
    EditText mpesan;
    TextView mpesankembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mpesan = findViewById(R.id.pesan);
        mpesankembali = findViewById(R.id.terima_pesan_kembali);
        Intent intent = getIntent();
        mpesankembali.setText(intent.getStringExtra(Main2Activity.EXTRA_MESSAGE));
        Log.d("LOG_TAG","onCreate");

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
// If the heading is visible, we have a message that needs to be saved.
// Otherwise we're still using default layout.
        if (mpesankembali.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text", mpesankembali.getText().toString());
        }
    }


    public void kirim(View view) {
        Intent intent=new Intent(this,Main2Activity.class);
        intent.putExtra(EXTRA_MESSAGE,mpesan.getText().toString());
        startActivity(intent);
    }


    @Override
    public void onStart(){
        super.onStart();
        Log.d("LOG_TAG", "onStart");
    }
    @Override
    public void onRestart() {
        super.onRestart();
        Log.d("LOG_TAG", "onRestart");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d("LOG_TAG", "onResume");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d("LOG_TAG", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("LOG_TAG", "onStop");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("LOG_TAG", "onDestroy");
    }




}
