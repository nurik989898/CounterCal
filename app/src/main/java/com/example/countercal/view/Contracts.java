package com.example.countercal.view;

public class Contracts {

    public interface CounterView{
        void updateText(int count);

    }
    public interface CounterPresenter{
        void increment();
        void decrement();
        void attachCounterView(CounterView view);
    }
}
