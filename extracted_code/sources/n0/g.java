package n0;

import R.C0109l;
import R.C0110m;
import R.C0112o;
import R.C0113p;
import R.H;
import U.A;
import U.AbstractC0123a;
import java.math.RoundingMode;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public final class g extends d {

    /* renamed from: e  reason: collision with root package name */
    public final LinkedList f8375e;

    /* renamed from: f  reason: collision with root package name */
    public int f8376f;

    /* renamed from: g  reason: collision with root package name */
    public int f8377g;

    /* renamed from: h  reason: collision with root package name */
    public long f8378h;

    /* renamed from: i  reason: collision with root package name */
    public long f8379i;

    /* renamed from: j  reason: collision with root package name */
    public long f8380j;

    /* renamed from: k  reason: collision with root package name */
    public int f8381k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f8382l;

    /* renamed from: m  reason: collision with root package name */
    public C0656a f8383m;

    public g(String str) {
        super(null, str, "SmoothStreamingMedia");
        this.f8381k = -1;
        this.f8383m = null;
        this.f8375e = new LinkedList();
    }

    @Override // n0.d
    public final void a(Object obj) {
        boolean z3;
        if (obj instanceof b) {
            this.f8375e.add((b) obj);
        } else if (obj instanceof C0656a) {
            if (this.f8383m == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0123a.j(z3);
            this.f8383m = (C0656a) obj;
        }
    }

    @Override // n0.d
    public final Object b() {
        boolean z3;
        C0656a c0656a;
        int i3;
        long U3;
        long U4;
        LinkedList linkedList = this.f8375e;
        int size = linkedList.size();
        b[] bVarArr = new b[size];
        linkedList.toArray(bVarArr);
        C0656a c0656a2 = this.f8383m;
        if (c0656a2 != null) {
            C0110m c0110m = new C0110m(new C0109l(c0656a2.f8340a, null, "video/mp4", c0656a2.f8341b));
            for (int i4 = 0; i4 < size; i4++) {
                b bVar = bVarArr[i4];
                int i5 = bVar.f8343a;
                if (i5 == 2 || i5 == 1) {
                    int i6 = 0;
                    while (true) {
                        C0113p[] c0113pArr = bVar.f8352j;
                        if (i6 < c0113pArr.length) {
                            C0112o a3 = c0113pArr[i6].a();
                            a3.f1941p = c0110m;
                            c0113pArr[i6] = new C0113p(a3);
                            i6++;
                        }
                    }
                }
            }
        }
        int i7 = this.f8376f;
        int i8 = this.f8377g;
        long j3 = this.f8378h;
        long j4 = this.f8379i;
        long j5 = this.f8380j;
        int i9 = this.f8381k;
        boolean z4 = this.f8382l;
        C0656a c0656a3 = this.f8383m;
        if (j4 == 0) {
            z3 = z4;
            c0656a = c0656a3;
            i3 = i9;
            U3 = -9223372036854775807L;
        } else {
            int i10 = A.f2405a;
            z3 = z4;
            c0656a = c0656a3;
            i3 = i9;
            U3 = A.U(j4, 1000000L, j3, RoundingMode.FLOOR);
        }
        if (j5 == 0) {
            U4 = -9223372036854775807L;
        } else {
            int i11 = A.f2405a;
            U4 = A.U(j5, 1000000L, j3, RoundingMode.FLOOR);
        }
        return new c(i7, i8, U3, U4, i3, z3, c0656a, bVarArr);
    }

    @Override // n0.d
    public final void j(XmlPullParser xmlPullParser) {
        boolean z3;
        this.f8376f = d.i(xmlPullParser, "MajorVersion");
        this.f8377g = d.i(xmlPullParser, "MinorVersion");
        this.f8378h = d.h(xmlPullParser, "TimeScale", 10000000L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
        if (attributeValue != null) {
            try {
                this.f8379i = Long.parseLong(attributeValue);
                this.f8380j = d.h(xmlPullParser, "DVRWindowLength", 0L);
                this.f8381k = d.g(xmlPullParser, "LookaheadCount");
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
                if (attributeValue2 != null) {
                    z3 = Boolean.parseBoolean(attributeValue2);
                } else {
                    z3 = false;
                }
                this.f8382l = z3;
                l(Long.valueOf(this.f8378h), "TimeScale");
                return;
            } catch (NumberFormatException e2) {
                throw H.b(null, e2);
            }
        }
        throw new C0.d("Duration", 1);
    }
}
