package io.ashdavies.commons.view;

import android.content.Context;

public interface BaseView {
  Context getContext();

  void showProgress();

  void hideProgress();

  void onError(Throwable throwable);
}
