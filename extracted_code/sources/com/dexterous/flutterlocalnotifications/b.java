package com.dexterous.flutterlocalnotifications;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import java.util.Locale;
/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ void C() {
    }

    public static /* bridge */ /* synthetic */ NotificationChannel c(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ NotificationChannel d(String str, CharSequence charSequence, int i3) {
        return new NotificationChannel(str, charSequence, i3);
    }

    public static /* synthetic */ NotificationChannelGroup e(String str, String str2) {
        return new NotificationChannelGroup(str, str2);
    }

    public static /* bridge */ /* synthetic */ AutofillManager h(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillValue i(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* bridge */ /* synthetic */ Class l() {
        return AutofillManager.class;
    }

    public static /* synthetic */ Locale.LanguageRange n(String str) {
        return new Locale.LanguageRange(str);
    }

    public static /* synthetic */ void p() {
    }

    public static /* synthetic */ void z() {
    }
}
