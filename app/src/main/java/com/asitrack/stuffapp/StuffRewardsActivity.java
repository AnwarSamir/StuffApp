package com.asitrack.stuffapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class StuffRewardsActivity extends AppCompatActivity {

    RecyclerView stuffRewardRv;
    StuffRewardAdapter stuffRewardAdapter;
    ArrayList<StuffRewardModel> stuffRewardModelArrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stuff_rewards);
        stuffRewardRv=findViewById(R.id.stuffReward);
        initStuffRv();
    }

    void initStuffRv()
    {
        for (int i = 0; i<3;i++)
            stuffRewardModelArrayList.add(new StuffRewardModel("id",""));

        stuffRewardAdapter=new StuffRewardAdapter(stuffRewardModelArrayList);
        stuffRewardRv.setAdapter(stuffRewardAdapter);
    }
}
