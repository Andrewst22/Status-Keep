package s0;

import java.util.ArrayList;
import java.util.Collections;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: h  reason: collision with root package name */
    public static final U0.d f9213h = new U0.d(13);

    /* renamed from: i  reason: collision with root package name */
    public static final U0.d f9214i = new U0.d(14);

    /* renamed from: a  reason: collision with root package name */
    public final int f9215a;

    /* renamed from: e  reason: collision with root package name */
    public int f9219e;

    /* renamed from: f  reason: collision with root package name */
    public int f9220f;

    /* renamed from: g  reason: collision with root package name */
    public int f9221g;

    /* renamed from: c  reason: collision with root package name */
    public final r[] f9217c = new r[5];

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f9216b = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public int f9218d = -1;

    public s(int i3) {
        this.f9215a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(float f3, int i3) {
        r rVar;
        int i4 = this.f9218d;
        ArrayList arrayList = this.f9216b;
        if (i4 != 1) {
            Collections.sort(arrayList, f9213h);
            this.f9218d = 1;
        }
        int i5 = this.f9221g;
        r[] rVarArr = this.f9217c;
        if (i5 > 0) {
            int i6 = i5 - 1;
            this.f9221g = i6;
            rVar = rVarArr[i6];
        } else {
            rVar = new Object();
        }
        int i7 = this.f9219e;
        this.f9219e = i7 + 1;
        rVar.f9210a = i7;
        rVar.f9211b = i3;
        rVar.f9212c = f3;
        arrayList.add(rVar);
        this.f9220f += i3;
        while (true) {
            int i8 = this.f9220f;
            int i9 = this.f9215a;
            if (i8 > i9) {
                int i10 = i8 - i9;
                r rVar2 = (r) arrayList.get(0);
                int i11 = rVar2.f9211b;
                if (i11 <= i10) {
                    this.f9220f -= i11;
                    arrayList.remove(0);
                    int i12 = this.f9221g;
                    if (i12 < 5) {
                        this.f9221g = i12 + 1;
                        rVarArr[i12] = rVar2;
                    }
                } else {
                    rVar2.f9211b = i11 - i10;
                    this.f9220f -= i10;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i3 = this.f9218d;
        ArrayList arrayList = this.f9216b;
        if (i3 != 0) {
            Collections.sort(arrayList, f9214i);
            this.f9218d = 0;
        }
        float f3 = 0.5f * this.f9220f;
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            r rVar = (r) arrayList.get(i5);
            i4 += rVar.f9211b;
            if (i4 >= f3) {
                return rVar.f9212c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((r) arrayList.get(arrayList.size() - 1)).f9212c;
    }
}
