package klogi.com.horizontalverticals;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by klogi on 25/12/15.
 */
public class ListChipsAdapter extends RecyclerView.Adapter {

    private ArrayList<int[]> chipsArray;

    public ListChipsAdapter(ArrayList<int[]> chipsArray) {
        this.chipsArray = chipsArray;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ChipsViewHolder(new RowChipsView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((RowChipsView)holder.itemView).setAdapter(new ChipsAdapter(chipsArray.get(position)));
    }

    @Override
    public int getItemCount() {
        return chipsArray.size();
    }

    private class ChipsViewHolder extends RecyclerView.ViewHolder {

        public ChipsViewHolder(View itemView) {
            super(itemView);
        }
    }
}
