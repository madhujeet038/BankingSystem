package com.example.madhujeettomar.bankingsystem;

import android.app.Application;
import android.content.Context;
import android.media.VolumeShaper;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatDelegate;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by Madhujeet.Tomar on 16-03-2018.
 */

public class BankingSystemApplication extends Application {

    private static Context mContext;

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    public static BankingSystemApplication getAppContext(Context context) {
        return (BankingSystemApplication) context.getApplicationContext();
    }


    public static Context getAppContext() {
        return mContext;
    }


    //For SDK <22
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        // MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mContext=this;
        /**
         * Fabric initialization
         */

        Realm.init(this);
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder().name(
               "BankingRealm").schemaVersion(
                0).deleteRealmIfMigrationNeeded().build();
        Realm.setDefaultConfiguration(realmConfiguration);

    }



}
