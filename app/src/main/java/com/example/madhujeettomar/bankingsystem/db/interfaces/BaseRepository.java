package com.example.madhujeettomar.bankingsystem.db.interfaces;

/**
 * Created by emb-madhtom on 26/8/16.
 */
public interface BaseRepository<T, I> {

    void clear();

    T readData(I object);

    void storeOrUpdate(T object);
}
