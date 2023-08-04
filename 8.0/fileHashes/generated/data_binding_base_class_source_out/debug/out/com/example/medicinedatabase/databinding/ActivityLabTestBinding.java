// Generated by view binder compiler. Do not edit!
package com.example.medicinedatabase.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.medicinedatabase.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLabTestBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonLTBack;

  @NonNull
  public final Button buttonLTGoToCart;

  @NonNull
  public final ListView listViewLT;

  @NonNull
  public final TextView textViewLTLocation;

  @NonNull
  public final TextView textViewLTName;

  @NonNull
  public final TextView textViewLTTitle;

  private ActivityLabTestBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonLTBack,
      @NonNull Button buttonLTGoToCart, @NonNull ListView listViewLT,
      @NonNull TextView textViewLTLocation, @NonNull TextView textViewLTName,
      @NonNull TextView textViewLTTitle) {
    this.rootView = rootView;
    this.buttonLTBack = buttonLTBack;
    this.buttonLTGoToCart = buttonLTGoToCart;
    this.listViewLT = listViewLT;
    this.textViewLTLocation = textViewLTLocation;
    this.textViewLTName = textViewLTName;
    this.textViewLTTitle = textViewLTTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLabTestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLabTestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_lab_test, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLabTestBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonLTBack;
      Button buttonLTBack = ViewBindings.findChildViewById(rootView, id);
      if (buttonLTBack == null) {
        break missingId;
      }

      id = R.id.buttonLTGoToCart;
      Button buttonLTGoToCart = ViewBindings.findChildViewById(rootView, id);
      if (buttonLTGoToCart == null) {
        break missingId;
      }

      id = R.id.listViewLT;
      ListView listViewLT = ViewBindings.findChildViewById(rootView, id);
      if (listViewLT == null) {
        break missingId;
      }

      id = R.id.textViewLTLocation;
      TextView textViewLTLocation = ViewBindings.findChildViewById(rootView, id);
      if (textViewLTLocation == null) {
        break missingId;
      }

      id = R.id.textViewLTName;
      TextView textViewLTName = ViewBindings.findChildViewById(rootView, id);
      if (textViewLTName == null) {
        break missingId;
      }

      id = R.id.textViewLTTitle;
      TextView textViewLTTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewLTTitle == null) {
        break missingId;
      }

      return new ActivityLabTestBinding((ConstraintLayout) rootView, buttonLTBack, buttonLTGoToCart,
          listViewLT, textViewLTLocation, textViewLTName, textViewLTTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}