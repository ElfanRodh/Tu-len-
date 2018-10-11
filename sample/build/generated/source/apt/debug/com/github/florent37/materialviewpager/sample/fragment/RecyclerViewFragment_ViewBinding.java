// Generated code from Butter Knife. Do not modify!
package com.github.florent37.materialviewpager.sample.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.github.florent37.materialviewpager.sample.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RecyclerViewFragment_ViewBinding<T extends RecyclerViewFragment> implements Unbinder {
  protected T target;

  @UiThread
  public RecyclerViewFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mRecyclerView = null;

    this.target = null;
  }
}
