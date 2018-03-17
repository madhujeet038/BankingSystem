package com.example.madhujeettomar.bankingsystem.model.login;

/**
 * Created by Madhujeet.Tomar on 16-03-2018.
 */

public interface ILogin {

    String getUsername();
    String getPassword();
    String validateLogin(String userName, String password);
}
