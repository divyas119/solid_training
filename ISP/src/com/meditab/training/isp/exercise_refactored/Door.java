package com.meditab.training.isp.exercise_refactored;

public interface Door {
	void lock();

    void unlock();

    void open();

    void close();

    void timeOutCallback();

    void proximityCallback();
}
