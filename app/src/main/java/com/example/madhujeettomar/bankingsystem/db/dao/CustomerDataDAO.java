package com.example.madhujeettomar.bankingsystem.db.dao;

import com.example.madhujeettomar.bankingsystem.db.interfaces.CustomerDataRepo;
import com.example.madhujeettomar.bankingsystem.model.CustomerDataBean;
import com.example.madhujeettomar.bankingsystem.model.realm.RealmCustomerData;

import java.util.ArrayList;
import java.util.List;

import io.realm.RealmResults;

/**
 * Created by Madhujeet.Tomar on 17-03-2018.
 */

public class CustomerDataDAO extends AbstractDao implements CustomerDataRepo {
    @Override
    public void clear() {

    }

    @Override
    public CustomerDataBean readData(String object) {
        return null;
    }


    @Override
    public void storeOrUpdate(CustomerDataBean customerDatabean) {

        RealmCustomerData realmCustomerData = new RealmCustomerData();

        for (int i = 0; i <customerDatabean.getCustomerData().size() ; i++) {
            CustomerDataBean.CustomerData customerData = customerDatabean.getCustomerData().get(i);

            realmCustomerData.setName(customerData.getName());
            realmCustomerData.setAccountNo(customerData.getAccountNo());
            realmCustomerData.setFatherName(customerData.getFatherName());
            realmCustomerData.setMobileNo(customerData.getFatherName());
            realmCustomerData.setPanNo(customerData.getPanNo());
            realmCustomerData.setUserId(customerData.getUserId());
            realmCustomerData.setPassword(customerData.getPassword());

        }

        mRealm.beginTransaction();
        mRealm.copyToRealmOrUpdate(realmCustomerData);
        mRealm.commitTransaction();


    }

    @Override
    public CustomerDataBean.CustomerData getParameterData(String userId) {
        RealmCustomerData realmCustomerData = null;
        realmCustomerData = mRealm.where(RealmCustomerData.class).equalTo("userId",
                userId).findFirst();
        return realmToPOJOObject(realmCustomerData);    }

    private CustomerDataBean.CustomerData realmToPOJOObject(RealmCustomerData realmCustomerData) {

        CustomerDataBean.CustomerData customerData=new CustomerDataBean.CustomerData();
        customerData.setName(realmCustomerData.getName());
        customerData.setAccountNo(realmCustomerData.getAccountNo());
        customerData.setFatherName(realmCustomerData.getFatherName());
        customerData.setMobileNo(realmCustomerData.getFatherName());
        customerData.setPanNo(realmCustomerData.getPanNo());
        customerData.setUserId(realmCustomerData.getUserId());
        customerData.setPassword(realmCustomerData.getPassword());

   return customerData;
    }


    @Override
    public CustomerDataBean getParameterList() {
        RealmResults<RealmCustomerData> realmCustomerDataRealmResults = null;
        realmCustomerDataRealmResults = mRealm.where(RealmCustomerData.class).findAll();
        if (realmCustomerDataRealmResults != null) {
            return realmToPOJO(realmCustomerDataRealmResults);
        } else {
            return null;
        }
    }

    @Override
    public CustomerDataBean realmToPOJO(RealmResults<RealmCustomerData> parameterList) {

        List<CustomerDataBean.CustomerData> customerDataList=new ArrayList();

        for (int i = 0; i <parameterList.size() ; i++) {
            RealmCustomerData realmCustomerData = parameterList.get(i);
            CustomerDataBean.CustomerData customerData = new CustomerDataBean.CustomerData() ;

            customerData.setName(realmCustomerData.getName());
            customerData.setAccountNo(realmCustomerData.getAccountNo());
            customerData.setFatherName(realmCustomerData.getFatherName());
            customerData.setMobileNo(realmCustomerData.getFatherName());
            customerData.setPanNo(realmCustomerData.getPanNo());
            customerData.setUserId(realmCustomerData.getUserId());
            customerData.setPassword(realmCustomerData.getPassword());

customerDataList.add(customerData);
        }
        CustomerDataBean customerDataBean=new CustomerDataBean();
        customerDataBean.setCustomerData(customerDataList);
        return customerDataBean;
    }

    @Override
    public void closeRealm() {
mRealm.close();
    }
    /**
     * Method to check the user exist in the db if yes return true else false
     */
    public String doCheckUserExist(String userId, String password) {
        RealmCustomerData realmCustomerData = null;
        realmCustomerData = mRealm.where(RealmCustomerData.class).equalTo("userId",
                userId).findFirst();
        if (realmCustomerData != null) {
            if(realmCustomerData.getPassword().equals(password))
            {
                return "Credentials Verified";
            }
            else
            {
                return "Entered wrong Password";
            }

        } else {
            return "User Not Exist";
        }
    }
    }
