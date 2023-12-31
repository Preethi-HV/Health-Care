// Generated by view binder compiler. Do not edit!
package com.example.medicinedatabase.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.medicinedatabase.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFindDoctorBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CardView cardFDBack;

  @NonNull
  public final CardView cardFDCardiologists;

  @NonNull
  public final CardView cardFDDentist;

  @NonNull
  public final CardView cardFDDietician;

  @NonNull
  public final CardView cardFDFamilyPhysician;

  @NonNull
  public final CardView cardFDSurgeon;

  @NonNull
  public final TextView titleFindDoctor;

  @NonNull
  public final TextView titleFindDoctorTop;

  private ActivityFindDoctorBinding(@NonNull RelativeLayout rootView, @NonNull CardView cardFDBack,
      @NonNull CardView cardFDCardiologists, @NonNull CardView cardFDDentist,
      @NonNull CardView cardFDDietician, @NonNull CardView cardFDFamilyPhysician,
      @NonNull CardView cardFDSurgeon, @NonNull TextView titleFindDoctor,
      @NonNull TextView titleFindDoctorTop) {
    this.rootView = rootView;
    this.cardFDBack = cardFDBack;
    this.cardFDCardiologists = cardFDCardiologists;
    this.cardFDDentist = cardFDDentist;
    this.cardFDDietician = cardFDDietician;
    this.cardFDFamilyPhysician = cardFDFamilyPhysician;
    this.cardFDSurgeon = cardFDSurgeon;
    this.titleFindDoctor = titleFindDoctor;
    this.titleFindDoctorTop = titleFindDoctorTop;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFindDoctorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFindDoctorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_find_doctor, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFindDoctorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardFDBack;
      CardView cardFDBack = ViewBindings.findChildViewById(rootView, id);
      if (cardFDBack == null) {
        break missingId;
      }

      id = R.id.cardFDCardiologists;
      CardView cardFDCardiologists = ViewBindings.findChildViewById(rootView, id);
      if (cardFDCardiologists == null) {
        break missingId;
      }

      id = R.id.cardFDDentist;
      CardView cardFDDentist = ViewBindings.findChildViewById(rootView, id);
      if (cardFDDentist == null) {
        break missingId;
      }

      id = R.id.cardFDDietician;
      CardView cardFDDietician = ViewBindings.findChildViewById(rootView, id);
      if (cardFDDietician == null) {
        break missingId;
      }

      id = R.id.cardFDFamilyPhysician;
      CardView cardFDFamilyPhysician = ViewBindings.findChildViewById(rootView, id);
      if (cardFDFamilyPhysician == null) {
        break missingId;
      }

      id = R.id.cardFDSurgeon;
      CardView cardFDSurgeon = ViewBindings.findChildViewById(rootView, id);
      if (cardFDSurgeon == null) {
        break missingId;
      }

      id = R.id.titleFindDoctor;
      TextView titleFindDoctor = ViewBindings.findChildViewById(rootView, id);
      if (titleFindDoctor == null) {
        break missingId;
      }

      id = R.id.titleFindDoctorTop;
      TextView titleFindDoctorTop = ViewBindings.findChildViewById(rootView, id);
      if (titleFindDoctorTop == null) {
        break missingId;
      }

      return new ActivityFindDoctorBinding((RelativeLayout) rootView, cardFDBack,
          cardFDCardiologists, cardFDDentist, cardFDDietician, cardFDFamilyPhysician, cardFDSurgeon,
          titleFindDoctor, titleFindDoctorTop);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
