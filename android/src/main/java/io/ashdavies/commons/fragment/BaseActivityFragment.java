package io.ashdavies.commons.fragment;

import android.content.Context;

import io.ashdavies.commons.activity.BaseActivity;

public abstract class BaseActivityFragment<Activity extends BaseActivity> extends BaseFragment {
  private Activity activity;

  @Override
  public void onAttach(Context context) {
    super.onAttach(context);

    //noinspection unchecked
    activity = (Activity) getActivity();
  }

  protected Activity getParentActivity() {
    return activity;
  }
}
