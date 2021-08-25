package com.tictac.tictactoe3;

import android.content.Context;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class loadingAdds {
    private final  AdView mAdView;

    public loadingAdds(AdView adView, Context context) {
        MobileAds.initialize(context, context.getString(R.string.AddId));
        this.mAdView = adView;


        AdRequest adRequest = new AdRequest.Builder().build();
       // mAdView.loadAd(adRequest);
    }


}
