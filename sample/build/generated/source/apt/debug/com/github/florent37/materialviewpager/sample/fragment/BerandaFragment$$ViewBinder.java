// Generated code from Butter Knife. Do not modify!
package com.github.florent37.materialviewpager.sample.fragment;

import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class BerandaFragment$$ViewBinder<T extends BerandaFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends BerandaFragment> implements Unbinder {
    protected T target;

    protected InnerUnbinder(T target, Finder finder, Object source) {
      this.target = target;

      target.mScrollView = finder.findRequiredViewAsType(source, 2131165294, "field 'mScrollView'", NestedScrollView.class);
      target.mRecyclerView = finder.findRequiredViewAsType(source, 2131165290, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.mScrollView = null;
      target.mRecyclerView = null;

      this.target = null;
    }
  }
}
