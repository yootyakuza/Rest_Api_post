package com.example.support.rest_api;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.support.rest_api.Model.Post;
import com.example.support.rest_api.Retrofit.APISERVICE;
import com.example.support.rest_api.Retrofit.ApiUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    EditText titleEt,bodyEt,apiEt;
    Button submitbtn,go2;
    private TextView tvResponse;
    private APISERVICE apiservice;
    private static final String TAG = "Anunda";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleEt = findViewById(R.id.et_title);
        bodyEt = findViewById(R.id.et_body);
        submitbtn = findViewById(R.id.btn_submit);
        go2 = findViewById(R.id.btn_go2);
        tvResponse = findViewById(R.id.tv_response);
        apiEt = findViewById(R.id.et_api);

        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = titleEt.getText().toString().trim();
                String body = bodyEt.getText().toString().trim();
                String api = apiEt.getText().toString().trim();
                if(!TextUtils.isEmpty(title) && !TextUtils.isEmpty(body) && !TextUtils.isEmpty(api)){
                    apiservice = ApiUtils.getAPISERVICE(api);
                    sendPost(title,body,apiservice);
                }
            }
        });
        go2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
            }
        });
    }

    private void sendPost(String title, String body,APISERVICE apiservice) {
        apiservice.savePost(title,body,1).enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
                if(response.isSuccessful()){
                    showResponse(response.body().toString());
                    Log.i(TAG,"post submitted to API. " + response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {
                Log.e(TAG,"Unable to submit post to API.");
            }
        });

    }

    private void showResponse(String response) {
        if(tvResponse.getVisibility() == View.GONE){
            tvResponse.setVisibility(View.VISIBLE);
        }
        tvResponse.setText(response);
    }
}

