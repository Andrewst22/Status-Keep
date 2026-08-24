package s;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: s.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0784h {

    /* renamed from: a  reason: collision with root package name */
    public final IconCompat f9082a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f9083b;

    /* renamed from: c  reason: collision with root package name */
    public final PendingIntent f9084c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9085d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f9086e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f9087f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9088g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f9089h;

    public C0784h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        this.f9085d = true;
        this.f9088g = true;
        this.f9082a = iconCompat;
        this.f9083b = C0791o.a(charSequence);
        this.f9084c = pendingIntent;
        this.f9086e = bundle;
        this.f9087f = null;
        this.f9085d = true;
        this.f9088g = true;
        this.f9089h = false;
    }

    public final C0785i a() {
        Y[] yArr;
        CharSequence[] charSequenceArr;
        if (!this.f9089h || this.f9084c != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = this.f9087f;
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    Y y3 = (Y) it.next();
                    if (!y3.f9079c && (((charSequenceArr = y3.f9078b) == null || charSequenceArr.length == 0) && !y3.f9081e.isEmpty())) {
                        arrayList.add(y3);
                    } else {
                        arrayList2.add(y3);
                    }
                }
            }
            Y[] yArr2 = null;
            if (arrayList.isEmpty()) {
                yArr = null;
            } else {
                yArr = (Y[]) arrayList.toArray(new Y[arrayList.size()]);
            }
            if (!arrayList2.isEmpty()) {
                yArr2 = (Y[]) arrayList2.toArray(new Y[arrayList2.size()]);
            }
            return new C0785i(this.f9082a, this.f9083b, this.f9084c, this.f9086e, yArr2, yArr, this.f9085d, this.f9088g, this.f9089h);
        }
        throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
    }
}
