package com.example.countercal;

import com.example.counter.presenter.CounterPresenter;
import com.example.countercal.presenter.CounterPresenter;
import com.example.countercal.view.Contracts;

public class Injector {
    public static Contracts.CounterPresenter getCounter(){
        return new CounterPresenter();
    }

}
