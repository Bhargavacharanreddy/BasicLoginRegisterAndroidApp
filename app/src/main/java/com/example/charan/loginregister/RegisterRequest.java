package com.example.charan.loginregister;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by charan on 17-09-2016.
 */
public class RegisterRequest extends StringRequest
{
        private static final String REGISTER_REQUEST_URL="http://cherry324.comxa.com/register.php";
        private Map<String,String> params;
        public RegisterRequest(String name, String username, String password, String email, Response.Listener<String> listener)
        {
            super(Method.POST,REGISTER_REQUEST_URL,listener,null);
            params=new HashMap<>();
            params.put("name",name);
            params.put("username",username);
            params.put("email",email);
            params.put("password",password);
        }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
