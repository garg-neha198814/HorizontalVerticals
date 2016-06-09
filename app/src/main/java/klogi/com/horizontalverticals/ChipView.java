package klogi.com.horizontalverticals;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by klogi on 25/12/15.
 */
public class ChipView extends FrameLayout {

    public ChipView(Context context) {
        super(context);
        initializeView(context);
    }

    private void initializeView(Context context) {
        LayoutInflater.from(context).inflate(R.layout.chip_view, this);
    }

    public void displayItem(int text) {
        ((ImageView)findViewById(R.id.chipTextView)).setImageResource(text);
    }
}
