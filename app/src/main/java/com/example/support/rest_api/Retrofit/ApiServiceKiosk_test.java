package com.example.support.rest_api.Retrofit;

import com.example.support.rest_api.Model.Kiosk_test;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiServiceKiosk_test {

    @POST("/API-KIOSK-TRANSACTION/")
    @FormUrlEncoded
    Call<Kiosk_test> saveKiosk(@Field("API") String aPI,
                               @Field("k_ref_transaction") String kRefTransaction,
                               @Field("tmx_ref_transaction") String tmxRefTransaction,
                               @Field("time_kiosk_id_unique") String timeKioskIdUnique,
                               @Field("serial_number") String serialNumber,
                               @Field("true_wallet_id") String trueWalletId,
                               @Field("time_stamp") String timeStamp,
                               @Field("search_value") String searchValue,
                               @Field("agent_balance_after_process") String agentBalanceAfterProcess,
                               @Field("phone_no") String phoneNo,
                               @Field("ref1") String ref1,
                               @Field("credit_customer_after_process") String creditCustomerAfterProcess,
                               @Field("response_code") String responseCode,
                               @Field("response_msg") String responseMsg,
                               @Field("response_dev_msg") String responseDevMsg,
                               @Field("fw_version") String fwVersion,
                               @Field("ip_address") String ipAddress);
}
