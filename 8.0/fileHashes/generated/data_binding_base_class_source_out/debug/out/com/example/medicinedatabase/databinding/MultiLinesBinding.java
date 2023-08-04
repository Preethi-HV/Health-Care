// Generated by view binder compiler. Do not edit!
package com.example.medicinedatabase.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.medicinedatabase.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MultiLinesBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView lineA;

  @NonNull
  public final TextView lineB;

  @NonNull
  public final TextView lineC;

  @NonNull
  public final TextView lineD;

  @NonNull
  public final TextView lineE;

  private MultiLinesBinding(@NonNull LinearLayout rootView, @NonNull TextView lineA,
      @NonNull TextView lineB, @NonNull TextView lineC, @NonNull TextView lineD,
      @NonNull TextView lineE) {
    this.rootView = rootView;
    this.lineA = lineA;
    this.lineB = lineB;
    this.lineC = lineC;
    this.lineD = lineD;
    this.lineE = lineE;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MultiLinesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MultiLinesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.multi_lines, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MultiLinesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.line_a;
      TextView lineA = ViewBindings.findChildViewById(rootView, id);
      if (lineA == null) {
        break missingId;
      }

      id = R.id.line_b;
      TextView lineB = ViewBindings.findChildViewById(rootView, id);
      if (lineB == null) {
        break missingId;
      }

      id = R.id.line_c;
      TextView lineC = ViewBindings.findChildViewById(rootView, id);
      if (lineC == null) {
        break missingId;
      }

      id = R.id.line_d;
      TextView lineD = ViewBindings.findChildViewById(rootView, id);
      if (lineD == null) {
        break missingId;
      }

      id = R.id.line_e;
      TextView lineE = ViewBindings.findChildViewById(rootView, id);
      if (lineE == null) {
        break missingId;
      }

      return new MultiLinesBinding((LinearLayout) rootView, lineA, lineB, lineC, lineD, lineE);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
