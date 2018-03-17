package com.example.madhujeettomar.bankingsystem.model;

import java.util.List;

/**
 * Created by Madhujeet.Tomar on 16-03-2018.
 */

public class CustomerDataBean {


private List<CustomerData> customerData;

    public List<CustomerData> getCustomerData() {
        return customerData;
    }

    public void setCustomerData(List<CustomerData> customerData) {
        this.customerData = customerData;
    }

    public static class CustomerData {
        private String name;
        private String fatherName;
        private String mobileNo;
        private String accountNo;
        private String totalAmount;
        private String panNo;
        private String userId;
        private String password;




        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFatherName() {
            return fatherName;
        }

        public void setFatherName(String fatherName) {
            this.fatherName = fatherName;
        }

        public String getMobileNo() {
            return mobileNo;
        }

        public void setMobileNo(String mobileNo) {
            this.mobileNo = mobileNo;
        }

        public String getAccountNo() {
            return accountNo;
        }

        public void setAccountNo(String accountNo) {
            this.accountNo = accountNo;
        }

        public String getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
        }

        public String getPanNo() {
            return panNo;
        }

        public void setPanNo(String panNo) {
            this.panNo = panNo;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }



    }
}
