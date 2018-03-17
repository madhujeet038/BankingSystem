package com.example.madhujeettomar.bankingsystem.view.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.madhujeettomar.bankingsystem.R;

/**
 * Created by Madhujeet.Tomar on 16-03-2018.
 */

public class LoginFragment extends Fragment {


    private EditText etUserName;
    private EditText etpassword;
    private Button btnSubmit;



    public static LoginFragment newInstance() {
        Bundle args = new Bundle();
        LoginFragment fragment = new LoginFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container);
initUI(view);
return view;
    }

    private void initUI(View view) {
        etpassword=(EditText)view.findViewById(R.id.et_password);
        etUserName=(EditText)view.findViewById(R.id.et_username);
        btnSubmit=(Button)view.findViewById(R.id.btn_submit);

    }
}