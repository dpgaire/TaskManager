package com.ggi.taskmanager.Strickmode;

public class Strickmode {

    public static void Strickmodea(){
        android.os.StrictMode.ThreadPolicy policy=new android.os.StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        android.os.StrictMode.setThreadPolicy(policy);
    }
}
