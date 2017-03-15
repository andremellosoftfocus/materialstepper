package com.github.fcannizzaro.materialstepper.interfaces;

import android.content.Context;

/**
 * @author Francesco Cannizzaro (fcannizzaro).
 */
public interface Stepable {

    void onPrevious();

    void onNext();

    void onError();

    void onUpdate();

}
