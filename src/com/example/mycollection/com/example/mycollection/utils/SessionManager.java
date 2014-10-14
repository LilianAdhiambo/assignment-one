package com.example.mycollection.com.example.mycollection.utils;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.example.mycollection.Logins;

import java.util.HashMap;

/**
 * Created by lilian on 10/10/14.
 */
public class SessionManager {


    SharedPreferences prefs;
    Context _context;
    SharedPreferences.Editor editor;
    Constants myconstants;
    public static final String IS_LOGIN = "IsLoggedIn";

    public SessionManager(Context _context){
        this._context= _context;
        prefs =_context.getSharedPreferences(myconstants.PREF_NAME,0);
        editor= prefs.edit();

    }

    public void createUser(String username, String password,String email,String fullname){
        editor.putString(myconstants.KEY_USERNAME,username);
        editor.putString(myconstants.KEY_PASSWORD,password);
        editor.putString(myconstants.KEY_fullName,fullname);
        editor.putString(myconstants.KEY_Email,email);
        editor.commit();

    }

    public HashMap<String,String> getUserDetails(){
        HashMap<String,String> user= new HashMap<String, String>();
        user.put(myconstants.KEY_USERNAME,prefs.getString(myconstants.KEY_USERNAME,null));
        user.put(myconstants.KEY_PASSWORD,prefs.getString(myconstants.KEY_PASSWORD,null));
        return user;
    }

    public void checkLogin(){
        if(!this.IS_LOGIN()){
            Intent i= new Intent(_context, Logins.class);
            _context.startActivity(i);

        }


    public void LogoutUser(){
        editor.clear();
        editor.commit();
    }
}

