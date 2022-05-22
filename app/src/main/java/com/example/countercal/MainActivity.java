package com.example.countercal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.countercal.databinding.ActivityMainBinding;
import com.example.countercal.presenter.CounterPresenter;
import com.example.countercal.view.Contracts;


public class MainActivity extends AppCompatActivity implements Contracts.CounterView{
    ActivityMainBinding binding;
    CounterPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenter = Injector.getCounter();
        presenter.attachCounterView(this);
        initClickers();
    }

    private void initClickers() {
        binding.incrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.increment();
                if (presenter == 10) {
                    Toast.makeText(MainActivity.this, "Congrats", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void updateText(int count) {
        binding.counterTv.setText(String.valueOf(count));
    }
}
