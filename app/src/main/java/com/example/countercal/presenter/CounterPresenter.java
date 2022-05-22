package com.example.countercal.presenter;

import com.example.counter.model.Model;
import com.example.counter.view.Contracts;
import com.example.countercal.model.Model;
import com.example.countercal.view.Contracts;

public class CounterPresenter implements Contracts.CounterPresenter {
    Model counterModel = new Model();
    Contracts.CounterView counterView;
    @Override
    public void increment() {
        counterModel.increment();
        counterView.updateText(counterModel.getCount());
    }

    @Override
    public void decrement() {
    counterModel.decrement();
    counterView.updateText(counterModel.getCount());
    }

    @Override
    public void attachCounterView(Contracts.CounterView view) {
       counterView = view;
    }
}
