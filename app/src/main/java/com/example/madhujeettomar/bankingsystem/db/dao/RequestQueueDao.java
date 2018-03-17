package com.example.madhujeettomar.bankingsystem.db.dao;



/**
 * Created by Jeevan Vijay on 14/12/16.
 */

public class RequestQueueDao extends AbstractDao {

    private static final String TAG = RequestQueueDao.class.getSimpleName();

    public RequestQueueDao() {
        super();
    }

    @Override
    public void closeRealm() {
        mRealm.close();
    }
}
