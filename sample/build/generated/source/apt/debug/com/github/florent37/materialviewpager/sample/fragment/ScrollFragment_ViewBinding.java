// Generated code from Butter Knife. Do not modify!
package com.github.florent37.materialviewpager.sample.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.github.florent37.materialviewpager.sample.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ScrollFragment_ViewBinding<T extends ScrollFragment> implements Unbinder {
  protected T target;

  @UiThread
  public ScrollFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.mScrollView = Utils.findRequiredViewAsType(source, R.id.scrollView, "field 'mScrollView'", NestedScrollView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mScrollView = null;

    this.target = null;
  }
}
