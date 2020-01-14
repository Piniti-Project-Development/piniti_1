package fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

import Adapter.CustomAdapter;
import ModelClass.Team;
import bd.piniti.service.MehndiActivity;
import bd.piniti.service.R;


public class BuySellFragment extends Fragment {


    private View view;

    LinearLayout linear_constructionsupply;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_buy_sell, container, false);


        linear_constructionsupply = view.findViewById(R.id.linear_constructionsupply);
        linear_constructionsupply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), MehndiActivity.class);
                startActivity(intent);
            }
        });


        //THE EXPANDABLE
        ExpandableListView elv=(ExpandableListView) view.findViewById(R.id.expandblelistview);
        elv.setBackgroundColor(Color.WHITE);
        ExpandableListView elv2 = view.findViewById(R.id.expandblelistview2);
        elv2.setBackgroundColor(Color.WHITE);



        final ArrayList<Team> team=getData();

        //CREATE AND BIND TO ADAPTER
        CustomAdapter adapter=new CustomAdapter(getActivity(), team);
        elv.setAdapter(adapter);
        elv2.setAdapter(adapter);
        elv.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                setListViewHeight(parent, groupPosition);
                return false;
            }
        });

        //SET ONCLICK LISTENER
        elv.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPos,
                                        int childPos, long id) {

                Toast.makeText(getActivity().getApplicationContext(), team.get(groupPos).players.get(childPos), Toast.LENGTH_SHORT).show();

                return false;
            }
        });





        return  view;
    }

    private void setListViewHeight(ExpandableListView listView, int groupPosition) {
        ExpandableListAdapter listAdapter = (ExpandableListAdapter) listView.getExpandableListAdapter();
        int totalHeight = 0;
        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(),
                View.MeasureSpec.EXACTLY);
        for (int i = 0; i < listAdapter.getGroupCount(); i++) {
            View groupItem = listAdapter.getGroupView(i, false, null, listView);
            groupItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);

            totalHeight += groupItem.getMeasuredHeight();

            if (((listView.isGroupExpanded(i)) && (i != groupPosition))
                    || ((!listView.isGroupExpanded(i)) && (i == groupPosition))) {
                for (int j = 0; j < listAdapter.getChildrenCount(i); j++) {
                    View listItem = listAdapter.getChildView(i, j, false, null,
                            listView);
                    listItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);

                    totalHeight += listItem.getMeasuredHeight();

                }
            }
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        int height = totalHeight
                + (listView.getDividerHeight() * (listAdapter.getGroupCount() - 1));
        if (height < 10)
            height = 200;
        params.height = height;
        listView.setLayoutParams(params);
        listView.requestLayout();
    }

    //ADD AND GET DATA

    private ArrayList<Team> getData()
    {

        Team t1=new Team("Vehicles");
        t1.players.add("Bike");
        t1.players.add("Rickshaw");
        t1.players.add("Motor Bike");
        t1.players.add("Auto");
        t1.players.add("Car");
        t1.players.add("Bus");
        t1.players.add("Truck");
        t1.players.add("Ambulance");

        Team t2=new Team("Wholesale");
        t2.players.add("Garments");
        t2.players.add("Electronics");
        t2.players.add("Farms Products");
        t2.players.add("Agriculture Products");

        //  Team t3=new Team("Mehendi Artists");
//        t3.players.add("Regular Waxing");
//        t3.players.add("Facial");
//        t3.players.add("Pedicure & Manicure");
//        t3.players.add("Hair");
//        t3.players.add("Threading");

        ArrayList<Team> allTeams=new ArrayList<Team>();
        allTeams.add(t1);
        allTeams.add(t2);


        return allTeams;

    }
    public boolean onChildClick(ExpandableListView parent, View v,
                                int groupPosition, int childPosition, long id) {

        v.setBackgroundColor(Color.BLUE);

        return false;
    }

}
