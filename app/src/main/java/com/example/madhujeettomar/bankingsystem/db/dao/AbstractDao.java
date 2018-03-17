package com.example.madhujeettomar.bankingsystem.db.dao;

import io.realm.Realm;

/**
 * Created by emb-krisbha on 11/9/16.
 */
public abstract class AbstractDao {

    protected Realm mRealm;

    public AbstractDao() {
        mRealm = Realm.getDefaultInstance();
       // mRealm.setAutoRefresh(true);
    }

    abstract public void closeRealm();


}
