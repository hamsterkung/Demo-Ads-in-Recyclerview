package com.siamsport.android.testads;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;

/**
 * Created by patinya on 1/11/2559.
 */

public class AdViewHolder extends RecyclerView.ViewHolder {
    public AdView adView;
    public AdViewHolder(View itemView) {
        super(itemView);

        adView = (AdView) itemView.findViewById(R.id.adView);
    }

    public void setAdView(){
//        PublisherAdRequest.Builder publisherAdRequestBuilder = new PublisherAdRequest.Builder();
        adView.loadAd(new AdRequest.Builder().build());
    }

}
