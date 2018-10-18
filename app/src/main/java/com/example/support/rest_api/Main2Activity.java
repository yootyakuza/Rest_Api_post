package com.example.support.rest_api;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.support.rest_api.Model.Kiosk_test;
import com.example.support.rest_api.Retrofit.ApiKioskUtils;
import com.example.support.rest_api.Retrofit.ApiServiceKiosk_test;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Main2Activity extends AppCompatActivity {

    EditText url,api, k_ref,tmx_ref,time_id,serial,true_id,time_stamp,search_value,agent_bance,phone_no,ref1,credit,response_code,responsemsg,response_dev_msg,fw,ip_address;
    Button btSubmit;
    TextView tvResponse;
    private ApiServiceKiosk_test apiServiceKioskTest;
    private static final String TAG = "Anunda";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        url = findViewById(R.id.url);
        api = findViewById(R.id.api);
        k_ref = findViewById(R.id.ref_transaction);
        tmx_ref = findViewById(R.id.tmx_ref_transaction);
        time_id = findViewById(R.id.time_kiosk);
        serial = findViewById(R.id.serial_number);
        true_id = findViewById(R.id.true_wallet_id);
        time_stamp = findViewById(R.id.time_stamp);
        search_value = findViewById(R.id.search_value);
        agent_bance = findViewById(R.id.agent_balance_after_process);
        phone_no = findViewById(R.id.phone_no);
        ref1 = findViewById(R.id.ref1);
        credit = findViewById(R.id.credit_customer_after_process);
        response_code = findViewById(R.id.response_code);
        responsemsg = findViewById(R.id.response_msg);
        response_dev_msg = findViewById(R.id.response_dev_msg);
        fw = findViewById(R.id.fw_version);
        ip_address = findViewById(R.id.ip_address);
        btSubmit = findViewById(R.id.submit);
        tvResponse = findViewById(R.id.tv_res);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String _url = url.getText().toString();
                String _api = api.getText().toString();
                String ref_tran = k_ref.getText().toString();
                String tmx = tmx_ref.getText().toString();
                String time_id_unique = time_id.getText().toString();
                String _serial = serial.getText().toString();
                String _true = true_id.getText().toString();
                String time_s = time_stamp.getText().toString();
                String search = search_value.getText().toString();
                String agent = agent_bance.getText().toString();
                String phone = phone_no.getText().toString();
                String _ref1 = ref1.getText().toString();
                String _credit = credit.getText().toString();
                String resC = response_code.getText().toString();
                String resMsg = responsemsg.getText().toString();
                String resDev = response_dev_msg.getText().toString();
                String _fw = fw.getText().toString();
                String ip = ip_address.getText().toString();

                if(!TextUtils.isEmpty(_url) && !TextUtils.isEmpty(_api) && !TextUtils.isEmpty(ref_tran) && !TextUtils.isEmpty(tmx) && !TextUtils.isEmpty(time_id_unique) && !TextUtils.isEmpty(_serial) && !TextUtils.isEmpty(_true) && !TextUtils.isEmpty(time_s) && !TextUtils.isEmpty(search) && !TextUtils.isEmpty(agent) && !TextUtils.isEmpty(phone) && !TextUtils.isEmpty(_ref1) && !TextUtils.isEmpty(_credit) && !TextUtils.isEmpty(resC) && !TextUtils.isEmpty(resMsg) && !TextUtils.isEmpty(resDev) && !TextUtils.isEmpty(_fw) && !TextUtils.isEmpty(ip)){
                    apiServiceKioskTest = ApiKioskUtils.getApiServiceKiosk(_url);
                    sendKiosk(_api,ref_tran,tmx,time_id_unique,_serial,_true,time_s,search,agent,phone,_ref1,_credit,resC,resMsg,resDev,_fw,ip,apiServiceKioskTest);
                }
            }
        });
    }

    private void sendKiosk(String api, String ref_tran, String tmx, String time_id_unique,String _serial, String aTrue, String time_s, String search, String agent, String phone, String ref1, String credit, String resC, String resMsg, String resDev, String fw, String ip, ApiServiceKiosk_test apiServiceKioskTest) {

        apiServiceKioskTest.saveKiosk(api,ref_tran,tmx,time_id_unique,_serial,aTrue,time_s,search,agent,phone,ref1,credit,resC,resMsg,resDev,fw,ip).enqueue(new Callback<Kiosk_test>() {
            @Override
            public void onResponse(Call<Kiosk_test> call, Response<Kiosk_test> response) {
                if(response.isSuccessful()){
                    showResponse(response.body().toString());
                    Log.i(TAG,"post submitted to API. " + response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<Kiosk_test> call, Throwable t) {
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


