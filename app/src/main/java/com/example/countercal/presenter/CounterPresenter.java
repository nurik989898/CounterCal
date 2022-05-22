package com.example.countercal.presenter;

import android.renderscript.ScriptGroup;
import android.widget.Toast;

import com.example.countercal.R;
import com.example.countercal.model.Model;
import com.example.countercal.view.Contracts;

public class CounterPresenter implements Contracts.CounterPresenter {

    Model counterModel = new Model();
    Contracts.CounterView counterView;

    @Override
    public void increment() {
        counterModel.increment();
        counterView.updateText(counterModel.getCount());

        seeToast();
        color();
    }


    @Override
    public void decrement() {
    counterModel.decrement();
    counterView.updateText(counterModel.getCount());
    seeToast();
    color();
    }

    @Override
    public void seeToast() {
        if (counterModel.getCount() == 10)
            counterView.showToast(counterModel.getToast());
    }

    @Override
    public void color() {
        if (counterModel.getCount() == 15)
            counterView.setColor(counterModel.getGreen());
        else
            counterView.setColor(counterModel.getBlack());

    }

    @Override
    public void attachCounterView(Contracts.CounterView view) {
       counterView = view;
    }
}
