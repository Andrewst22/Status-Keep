package c0;

import D1.I;
import R.C0113p;
import U.A;
import U.AbstractC0123a;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: m  reason: collision with root package name */
    public final C0113p f4761m;

    /* renamed from: n  reason: collision with root package name */
    public final I f4762n;

    /* renamed from: o  reason: collision with root package name */
    public final long f4763o;

    /* renamed from: p  reason: collision with root package name */
    public final List f4764p;

    /* renamed from: q  reason: collision with root package name */
    public final j f4765q;

    public m(C0113p c0113p, I i3, s sVar, ArrayList arrayList) {
        List unmodifiableList;
        AbstractC0123a.e(!i3.isEmpty());
        this.f4761m = c0113p;
        this.f4762n = I.j(i3);
        if (arrayList == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f4764p = unmodifiableList;
        this.f4765q = sVar.a(this);
        int i4 = A.f2405a;
        this.f4763o = A.U(sVar.f4782c, 1000000L, sVar.f4781b, RoundingMode.FLOOR);
    }

    public abstract String c();

    public abstract b0.h d();

    public abstract j f();
}
