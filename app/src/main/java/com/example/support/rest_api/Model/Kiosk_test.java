package com.example.support.rest_api.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Kiosk_test {

    @SerializedName("API")
    @Expose
    private String aPI;
    @SerializedName("k_ref_transaction")
    @Expose
    private String kRefTransaction;
    @SerializedName("tmx_ref_transaction")
    @Expose
    private String tmxRefTransaction;
    @SerializedName("time_kiosk_id_unique")
    @Expose
    private String timeKioskIdUnique;
    @SerializedName("serial_number")
    @Expose
    private String serialNumber;
    @SerializedName("true_wallet_id")
    @Expose
    private String trueWalletId;
    @SerializedName("time_stamp")
    @Expose
    private String timeStamp;
    @SerializedName("search_value")
    @Expose
    private String searchValue;
    @SerializedName("agent_balance_after_process")
    @Expose
    private String agentBalanceAfterProcess;
    @SerializedName("phone_no")
    @Expose
    private String phoneNo;
    @SerializedName("ref1")
    @Expose
    private String ref1;
    @SerializedName("credit_customer_after_process")
    @Expose
    private String creditCustomerAfterProcess;
    @SerializedName("response_code")
    @Expose
    private String responseCode;
    @SerializedName("response_msg")
    @Expose
    private String responseMsg;
    @SerializedName("response_dev_msg")
    @Expose
    private String responseDevMsg;
    @SerializedName("fw_version")
    @Expose
    private String fwVersion;
    @SerializedName("ip_address")
    @Expose
    private String ipAddress;

    @SerializedName("id")
    @Expose
    private Integer insert_id;

    public String getaPI() {
        return aPI;
    }

    public void setaPI(String aPI) {
        this.aPI = aPI;
    }

    public String getkRefTransaction() {
        return kRefTransaction;
    }

    public void setkRefTransaction(String kRefTransaction) {
        this.kRefTransaction = kRefTransaction;
    }

    public String getTmxRefTransaction() {
        return tmxRefTransaction;
    }

    public void setTmxRefTransaction(String tmxRefTransaction) {
        this.tmxRefTransaction = tmxRefTransaction;
    }

    public String getTimeKioskIdUnique() {
        return timeKioskIdUnique;
    }

    public void setTimeKioskIdUnique(String timeKioskIdUnique) {
        this.timeKioskIdUnique = timeKioskIdUnique;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getTrueWalletId() {
        return trueWalletId;
    }

    public void setTrueWalletId(String trueWalletId) {
        this.trueWalletId = trueWalletId;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    public String getAgentBalanceAfterProcess() {
        return agentBalanceAfterProcess;
    }

    public void setAgentBalanceAfterProcess(String agentBalanceAfterProcess) {
        this.agentBalanceAfterProcess = agentBalanceAfterProcess;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getRef1() {
        return ref1;
    }

    public void setRef1(String ref1) {
        this.ref1 = ref1;
    }

    public String getCreditCustomerAfterProcess() {
        return creditCustomerAfterProcess;
    }

    public void setCreditCustomerAfterProcess(String creditCustomerAfterProcess) {
        this.creditCustomerAfterProcess = creditCustomerAfterProcess;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMsg() {
        return responseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }

    public String getResponseDevMsg() {
        return responseDevMsg;
    }

    public void setResponseDevMsg(String responseDevMsg) {
        this.responseDevMsg = responseDevMsg;
    }

    public String getFwVersion() {
        return fwVersion;
    }

    public void setFwVersion(String fwVersion) {
        this.fwVersion = fwVersion;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Integer getInsert_id() {
        return insert_id;
    }

    public void setInsert_id(Integer insert_id) {
        this.insert_id = insert_id;
    }

    @Override
    public String toString() {
        return "Post Response{" +
                "k_ref_transaction:' " + kRefTransaction + '\'' +
                ", function': " + aPI + '\'' +
                ", response_code: " + responseCode +
                ", response_msg: " + responseMsg +
                ", insert id: " + insert_id +
                '}';
    }
}
