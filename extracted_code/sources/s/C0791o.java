package s;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
/* renamed from: s.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0791o {

    /* renamed from: A  reason: collision with root package name */
    public String f9105A;

    /* renamed from: B  reason: collision with root package name */
    public String f9106B;

    /* renamed from: C  reason: collision with root package name */
    public long f9107C;

    /* renamed from: D  reason: collision with root package name */
    public int f9108D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f9109E;

    /* renamed from: F  reason: collision with root package name */
    public Notification f9110F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f9111G;

    /* renamed from: H  reason: collision with root package name */
    public ArrayList f9112H;

    /* renamed from: a  reason: collision with root package name */
    public Context f9113a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f9114b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f9115c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f9116d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f9117e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f9118f;

    /* renamed from: g  reason: collision with root package name */
    public PendingIntent f9119g;

    /* renamed from: h  reason: collision with root package name */
    public PendingIntent f9120h;

    /* renamed from: i  reason: collision with root package name */
    public IconCompat f9121i;

    /* renamed from: j  reason: collision with root package name */
    public int f9122j;

    /* renamed from: k  reason: collision with root package name */
    public int f9123k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f9124l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f9125m;

    /* renamed from: n  reason: collision with root package name */
    public AbstractC0771C f9126n;

    /* renamed from: o  reason: collision with root package name */
    public CharSequence f9127o;

    /* renamed from: p  reason: collision with root package name */
    public int f9128p;

    /* renamed from: q  reason: collision with root package name */
    public int f9129q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f9130r;

    /* renamed from: s  reason: collision with root package name */
    public String f9131s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f9132t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f9133u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f9134v;

    /* renamed from: w  reason: collision with root package name */
    public String f9135w;
    public Bundle x;

    /* renamed from: y  reason: collision with root package name */
    public int f9136y;

    /* renamed from: z  reason: collision with root package name */
    public int f9137z;

    public static CharSequence a(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public final void b(int i3, boolean z3) {
        Notification notification = this.f9110F;
        if (z3) {
            notification.flags = i3 | notification.flags;
            return;
        }
        notification.flags = (~i3) & notification.flags;
    }

    public final void c(AbstractC0771C abstractC0771C) {
        if (this.f9126n != abstractC0771C) {
            this.f9126n = abstractC0771C;
            if (abstractC0771C != null && abstractC0771C.f9045a != this) {
                abstractC0771C.f9045a = this;
                c(abstractC0771C);
            }
        }
    }
}
