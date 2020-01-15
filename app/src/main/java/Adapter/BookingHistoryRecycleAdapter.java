package Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ModelClass.BookingModelClass;
import bd.piniti.service.R;


public class BookingHistoryRecycleAdapter extends RecyclerView.Adapter<BookingHistoryRecycleAdapter.MyViewHolder> {

    Context context;

    boolean showingfirst = true;
    int myPos = 0;

    private List<BookingModelClass> OfferList;


    public BookingHistoryRecycleAdapter(Context context, List<BookingModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public BookingHistoryRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_history_booking_list, parent, false);

        return new BookingHistoryRecycleAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        final BookingModelClass lists = OfferList.get(position);

        holder.accpt.setText(lists.getAccpt());
        holder.title.setText(lists.getTitle());
        holder.action.setText(lists.getAction());
        holder.rate.setText(lists.getRate());
        holder.feedback.setText(lists.getFeedback());
        holder.image.setImageResource(lists.getImage());
        if(position==1){
            holder.accpt.setTextColor(ContextCompat.getColor(context, R.color.red_color));
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPos = position;
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return OfferList.size();

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView accpt;
        TextView title;
        TextView action;
        TextView rate;
        TextView feedback;
        ImageView image;


        public MyViewHolder(View view) {
            super(view);
            accpt = view.findViewById(R.id.accept);
            title = view.findViewById(R.id.title);
            action = view.findViewById(R.id.action_by);
            rate = view.findViewById(R.id.rate);
            feedback = view.findViewById(R.id.feedback);
            image = view.findViewById(R.id.image);


        }

    }

}


