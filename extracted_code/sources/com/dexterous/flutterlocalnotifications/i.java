package com.dexterous.flutterlocalnotifications;

import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import java.io.Serializable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class i implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    public final NotificationDetails f5141m;

    /* renamed from: n  reason: collision with root package name */
    public final int f5142n;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f5143o;

    public i(NotificationDetails notificationDetails, int i3, ArrayList arrayList) {
        this.f5141m = notificationDetails;
        this.f5142n = i3;
        this.f5143o = arrayList;
    }

    public final String toString() {
        return "ForegroundServiceStartParameter{notificationData=" + this.f5141m + ", startMode=" + this.f5142n + ", foregroundServiceTypes=" + this.f5143o + '}';
    }
}
