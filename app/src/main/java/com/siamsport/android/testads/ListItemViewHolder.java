package com.siamsport.android.testads;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by patinya on 1/11/2559.
 */

public class ListItemViewHolder extends RecyclerView.ViewHolder {
    public TextView tvTitle, tvGenre, tvYear;
    public ListItemViewHolder(View itemView) {
        super(itemView);

        tvTitle = (TextView) itemView.findViewById(R.id.title);
        tvGenre = (TextView) itemView.findViewById(R.id.genre);
        tvYear = (TextView) itemView.findViewById(R.id.year);
    }

    public void setTitle(String title) {
        this.tvTitle.setText(title);
    }

    public void setGenre(String genre) {
        this.tvGenre.setText(genre);
    }

    public void setYear(String year) {
        this.tvYear.setText(year);
    }
}
