package luolin.xyz.pixdroid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

import luolin.xyz.pixdroid.model.Picture;

/**
 * Created by wuyuanwei on 2015/3/30.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private List<Picture> pics;
    private Context mContext;

    public CustomAdapter(Context con, List<Picture> p) {
        this.mContext = con;
        this.pics = p;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Picture p = pics.get(i);
        viewHolder.mImageView.setImageResource(p.getImageResourceId(mContext));
    }

    @Override
    public int getItemCount() {
        return pics == null ? 0 : pics.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;

        public ViewHolder(View v) {
            super(v);
            mImageView = (ImageView) v.findViewById(R.id.picture);
        }
    }
}