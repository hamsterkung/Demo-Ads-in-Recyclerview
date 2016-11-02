package com.siamsport.android.testads;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.doubleclick.PublisherAdRequest;

import java.util.List;

/**
 * Created by patinya on 1/11/2559.
 */

public class MovieAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int TYPE_AD = 0;
    private static final int TYPE_LIST = 1;

    private List<Movie> moviesList;

    public MovieAdapter(List<Movie> moviesList) {
        this.moviesList = moviesList;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_AD){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_ad_item, parent, false);
            return new AdViewHolder(view);
        } else if (viewType == TYPE_LIST){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_row, parent, false);
            return new ListItemViewHolder(view);
        }
        throw new NullPointerException("View Type " + viewType + " doesn't match with any existing order detail type");
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Movie list = moviesList.get(position);

        if (holder instanceof AdViewHolder){
            /*
            UserDetailViewHolder userDetailViewHolder = (UserDetailViewHolder) holder;
            UserDetailItem userDetailItem = (UserDetailItem) orderDetailItem;
            setupUserDetail(userDetailViewHolder, userDetailItem);
            */
            AdViewHolder adViewHolder = (AdViewHolder) holder;
            adViewHolder.setAdView();
        } else {
            ListItemViewHolder listItemViewHolder = (ListItemViewHolder) holder;
            listItemViewHolder.setTitle(list.getTitle());
            listItemViewHolder.setGenre(list.getGenre());
            listItemViewHolder.setYear(list.getYear());
        }
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 3)
            return TYPE_AD;
        return TYPE_LIST;
    }
}
