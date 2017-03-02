package com.github.fcannizzaro.materialstepper.interfaces;

import android.content.Context;

/**
 * @author Francesco Cannizzaro (fcannizzaro).
 */
public interface Nextable {

    boolean nextIf();

    boolean isOptional();

    void onStepVisible(Context applicationContext);

    void onNext();

    void onPrevious();

    String optional();

    String error();

}
