package com.example.countercal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.countercal.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    CounterPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenter =Injector.getCounter();
        presenter.attachCounterView(this);
        initClickers();
    }

    private void initClickers() {
        binding.incrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.increment();
                if (presenter.increment() == co) {
                    Toast.makeText(MainActivity.this, "Congrats", Toast.LENGTH_SHORT).show();
                }else{
                    presenter.increment();
                }
            }
        });
    }

    @Override
    public void updateText(int count) {
        binding.counterTv.setText(String.valueOf(count));
    }
}
    }
}