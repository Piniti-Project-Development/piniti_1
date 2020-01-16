package Adapter;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import ModelClass.HomeCategoryModelClass;
import bd.piniti.service.R;
import bd.piniti.service.location.TermsCondition;


public class ProfileRecycleAdapter extends RecyclerView.Adapter<ProfileRecycleAdapter.MyViewHolder> {

    Context context;


    private List<HomeCategoryModelClass> OfferList;


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        final HomeCategoryModelClass lists = OfferList.get(position);
        holder.image.setImageResource(lists.getImage());
        holder.title.setText(lists.getTitle());

        if (position == 4) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    holder.itemView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            try{
                                context.startActivity(new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("market://details?id=bd.piniti.service")));
                            }catch (ActivityNotFoundException e){
                                context.startActivity(new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://play.google.com/store/apps/details?id=bd.piniti.service")));
                            }
                        }
                    });
                }
            });
        }
        if (position == 7) {

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent1 = new Intent(context, TermsCondition.class);
                    context.startActivity(intent1);
                }
            });
            holder.linear.setVisibility(View.GONE);
        } else {

            holder.linear.setVisibility(View.VISIBLE);
        }

    }


    public ProfileRecycleAdapter(Context context, List<HomeCategoryModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public ProfileRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_profile_list, parent, false);


        return new ProfileRecycleAdapter.MyViewHolder(itemView);


    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView image;
        TextView title;
        LinearLayout linear;


        public MyViewHolder(View view) {
            super(view);

            image = view.findViewById(R.id.image);
            title = view.findViewById(R.id.title);
            linear = view.findViewById(R.id.linear);


        }

    }

    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


