package com.example.madhujeettomar.bankingsystem.db.interfaces;

import com.example.madhujeettomar.bankingsystem.model.CustomerDataBean;
import com.example.madhujeettomar.bankingsystem.model.realm.RealmCustomerData;

import io.realm.RealmResults;

/**
 * Created by Madhujeet.Tomar on 17-03-2018.
 */

public interface CustomerDataRepo extends BaseRepository<CustomerDataBean,String> {
    CustomerDataBean.CustomerData getParameterData(String userId);

    CustomerDataBean getParameterList();

    CustomerDataBean realmToPOJO(RealmResults<RealmCustomerData> parameterList);
}