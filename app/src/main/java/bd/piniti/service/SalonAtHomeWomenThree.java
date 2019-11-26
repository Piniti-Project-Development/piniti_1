package bd.piniti.service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import at.grabner.circleprogress.CircleProgressView;

public class SalonAtHomeWomenThree extends AppCompatActivity {

    TextView title,number,number1;
    ImageView back_img,search;

    LinearLayout linear_add,linear_add1,linear_count1,linear_count,bottom_linear;
    ImageView add,add1,minus,minus1;

    CardView CardViewOffer;
    Button ContinueButton;

    int count=1,adult=1;

    CircleProgressView circleProgressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salon_at_home_women_three);

        circleProgressView = findViewById(R.id.circleView);
        circleProgressView.setVisibility(View.VISIBLE);
        circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
        circleProgressView.setTextSize(20);
        circleProgressView.setBarColor(getResources().getColor(R.color.blue));
        circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
        circleProgressView.setValue(Float.parseFloat("40"));

        ContinueButton = findViewById(R.id.ContinueButton);
        ContinueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SalonAtHomeWomenThree.this,SelectAddressActivity.class);
                intent.putExtra("layout",1);
                startActivity(intent);
            }
        });

        CardViewOffer = findViewById(R.id.CardViewOffer);
        CardViewOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SalonAtHomeWomenThree.this,OffersActivity.class);
                startActivity(intent);
            }
        });


        linear_add = findViewById(R.id.linear_add);
        linear_count = findViewById(R.id.linear_count);
        add = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        number = findViewById(R.id.number);
//
//        linear_add.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                linear_add.setVisibility(View.GONE);
//                linear_count.setVisibility(View.VISIBLE);
//            }
//        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                number.setText(String.valueOf(count));
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count!=1){
                    count--;
                    number.setText(String.valueOf(count));
                }
            }

        });




//        linear_add1 = findViewById(R.id.linear_add1);
//        linear_count1 = findViewById(R.id.linear_count1);
        add1 = findViewById(R.id.plus1);
        minus1 = findViewById(R.id.minus1);
        number1 = findViewById(R.id.number1);
//
//        linear_add1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                linear_add1.setVisibility(View.GONE);
//                linear_count1.setVisibility(View.VISIBLE);
//            }
//        });

        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                number1.setText(String.valueOf(count));
            }
        });
        minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count!=1){
                    count--;
                    number.setText(String.valueOf(count));
                }
            }

        });

        title = findViewById(R.id.title);
        title.setText("Salon at home for Women");

        search = findViewById(R.id.search);
        search.setVisibility(View.GONE);

        back_img = findViewById(R.id.back_img);
        back_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}
