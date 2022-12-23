package com.app.airbookfeatures;

import android.content.Context;
import android.content.Intent;

public class PackageBridge {
    private Context mContext;
    public PackageBridge(Context mContext) {
        this.mContext = mContext;
    }
    public void renderMainPage(){
        Intent myIntent = new Intent(mContext, AirBookMainPage.class);
        //myIntent.putExtra("key", value); //Optional parameters
        mContext.startActivity(myIntent);
    }
}
