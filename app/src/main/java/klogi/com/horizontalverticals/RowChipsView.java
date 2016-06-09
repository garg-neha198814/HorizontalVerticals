package klogi.com.horizontalverticals;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

/**
 * Created by klogi on 25/12/15.
 */
public class RowChipsView extends FrameLayout {

    public RowChipsView(Context context) {
        super(context);
        initializeView(context);
    }

    private void initializeView(Context context) {
        LayoutInflater.from(context).inflate(R.layout.single_row, this);
        ((RecyclerView)findViewById(R.id.recyclerViewHorizontal)).setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
    }

    public void setAdapter(ChipsAdapter adapter) {
        ((RecyclerView)findViewById(R.id.recyclerViewHorizontal)).setAdapter(adapter);
    }
}
