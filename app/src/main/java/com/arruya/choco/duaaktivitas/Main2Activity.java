package com.arruya.choco.duaaktivitas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {
    private static final String LOG_TAG = Main2Activity.class.getSimpleName();
    public static final String EXTRA_MESSAGE="kirimkembali";
    TextView penerimapesan;
    EditText kirimpesan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        penerimapesan=findViewById(R.id.terima_pesan);
        kirimpesan=findViewById(R.id.pesankembali);
        Intent intent=getIntent();
        String pesanYangDiterima = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        penerimapesan.setText(pesanYangDiterima);
    }

    public void kirimkembali(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra(EXTRA_MESSAGE,kirimpesan.getText().toString());
        startActivity(intent);
        Log.d("LOG_TAG","End Main2Activity");
        finish();
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
