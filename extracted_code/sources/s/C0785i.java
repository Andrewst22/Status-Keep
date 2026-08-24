package s;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
/* renamed from: s.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0785i {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f9090a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f9091b;

    /* renamed from: c  reason: collision with root package name */
    public final Y[] f9092c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f9093d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9094e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f9095f;

    /* renamed from: g  reason: collision with root package name */
    public final int f9096g;

    /* renamed from: h  reason: collision with root package name */
    public final CharSequence f9097h;

    /* renamed from: i  reason: collision with root package name */
    public final PendingIntent f9098i;

    public C0785i(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, Y[] yArr, Y[] yArr2, boolean z3, boolean z4, boolean z5) {
        this.f9094e = true;
        this.f9091b = iconCompat;
        if (iconCompat != null && iconCompat.h() == 2) {
            this.f9096g = iconCompat.g();
        }
        this.f9097h = C0791o.a(charSequence);
        this.f9098i = pendingIntent;
        this.f9090a = bundle == null ? new Bundle() : bundle;
        this.f9092c = yArr;
        this.f9093d = z3;
        this.f9094e = z4;
        this.f9095f = z5;
    }

    public final IconCompat a() {
        int i3;
        if (this.f9091b == null && (i3 = this.f9096g) != 0) {
            this.f9091b = IconCompat.e(null, "", i3);
        }
        return this.f9091b;
    }
}
