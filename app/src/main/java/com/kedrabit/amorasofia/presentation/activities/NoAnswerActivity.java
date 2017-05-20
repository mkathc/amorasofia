package com.kedrabit.amorasofia.presentation.activities;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.kedrabit.amorasofia.R;
import com.kedrabit.amorasofia.core.BaseActivity;
import com.kedrabit.amorasofia.presentation.fragments.AddQuestionFragment;
import com.kedrabit.amorasofia.presentation.fragments.NoAnswerFragment;
import com.kedrabit.amorasofia.utils.ActivityUtils;

/**
 * Created by katherine on 20/05/17.
 */

public class NoAnswerActivity extends BaseActivity {
    private Toolbar toolbar;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Preguntas no respondidas");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        NoAnswerFragment fragment = (NoAnswerFragment) getSupportFragmentManager()
                .findFragmentById(R.id.body);

        if (fragment == null) {
            fragment = NoAnswerFragment.newInstance();

            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    fragment, R.id.body);
        }

        // Create the presenter
        //new ListMenuPresenter(fragment,this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
