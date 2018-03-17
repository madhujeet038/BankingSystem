package com.example.madhujeettomar.bankingsystem.model.login;

import com.example.madhujeettomar.bankingsystem.db.dao.CustomerDataDAO;
import com.example.madhujeettomar.bankingsystem.utils.Constants;

/**
 * Created by Madhujeet.Tomar on 16-03-2018.
 */

public class Login implements ILogin {
    private String userName;
    private String password;
    private CustomerDataDAO customerDataDAO;


    public Login(String userName,String password)
    {
        this.userName=userName;
        this.password=password;
    }
    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String validateLogin(String userName, String password) {
        customerDataDAO=new CustomerDataDAO();
        String doCheckUserExist = customerDataDAO.doCheckUserExist(userName, password);

        if((userName!=null && !userName.isEmpty()) || (password!=null && !password.isEmpty()))
{
return "";
}
else
if(doCheckUserExist.equals(Constants.USER_NOT_EXIST))
    {
        return Constants.USER_NOT_EXIST;
    }
    else if(doCheckUserExist.equals(Constants.WRONG_PWD))
    {
        return Constants.WRONG_PWD;
    }
    else if(doCheckUserExist.equals(Constants.CREDENTIAL_VERIfIED)) {

    return Constants.CREDENTIAL_VERIfIED;

}
    return "";
    }

    private boolean checkExistingUserInDB(String userName) {


return true ;

    }
}
