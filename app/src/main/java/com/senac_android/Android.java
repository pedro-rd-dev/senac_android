package com.senac_android;

import android.content.Context;
import android.content.Intent;

public class Android {

    private Context context;

    public Android(Context context) {
        this.context = context;
    }

    public void trocarDeActivity(Class<?> activity){
        Intent intent = new Intent(context, activity);

        context.startActivity(intent);
    }

    public void getGps(){

    }
}
