package banhaxe.io.javadevs;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.List;
import java.util.Locale;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Masebinu Benjamin Oluwaseun
 * Planet Nest & Techatreek
 * haxeboom@gmail.com
 * on 8/26/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
    private List<Users> usersList;

    public MyAdapter(Context context, List<Users> usersList) {
        this.context = context;
        this.usersList = usersList;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.developers_list, parent, false);
        return new ViewHolder(v);
    }
    @Override
    public int getItemCount() {
        return usersList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CircleImageView github_proflile_image;
        private TextView github_username;
        private TextView mUrl;

        public ViewHolder (View v){
            super(v);
            github_proflile_image = (CircleImageView)  itemView.findViewById(R.id.github_progile_image);
            github_username = (TextView) itemView.findViewById(R.id.github_username);
            mUrl = (TextView) itemView.findViewById(R.id.url_link);
        }
    }
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final Users eachUser = usersList.get(position);

        holder.github_username.setText(eachUser.login);
        Picasso.with(context).load(eachUser.avatar_url).fit().placeholder(R.drawable.person_dummy).into(holder.github_proflile_image);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, PersonalDetails.class);
                String username = usersList.get(holder.getAdapterPosition()).login;
                String avatar = usersList.get(holder.getAdapterPosition()).avatar_url;
                String url = usersList.get(holder.getAdapterPosition()).html_url;

                intent.putExtra("username", username);
                intent.putExtra("avatar", avatar);
                intent.putExtra("url", url);
                context.startActivity(intent);
            }
        });
    }
}