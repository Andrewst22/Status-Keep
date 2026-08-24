package n0;

import R.C0113p;
import R.H;
import U.A;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: e  reason: collision with root package name */
    public final String f8384e;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedList f8385f;

    /* renamed from: g  reason: collision with root package name */
    public int f8386g;

    /* renamed from: h  reason: collision with root package name */
    public String f8387h;

    /* renamed from: i  reason: collision with root package name */
    public long f8388i;

    /* renamed from: j  reason: collision with root package name */
    public String f8389j;

    /* renamed from: k  reason: collision with root package name */
    public String f8390k;

    /* renamed from: l  reason: collision with root package name */
    public int f8391l;

    /* renamed from: m  reason: collision with root package name */
    public int f8392m;

    /* renamed from: n  reason: collision with root package name */
    public int f8393n;

    /* renamed from: o  reason: collision with root package name */
    public int f8394o;

    /* renamed from: p  reason: collision with root package name */
    public String f8395p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f8396q;

    /* renamed from: r  reason: collision with root package name */
    public long f8397r;

    public h(d dVar, String str) {
        super(dVar, str, "StreamIndex");
        this.f8384e = str;
        this.f8385f = new LinkedList();
    }

    @Override // n0.d
    public final void a(Object obj) {
        if (obj instanceof C0113p) {
            this.f8385f.add((C0113p) obj);
        }
    }

    @Override // n0.d
    public final Object b() {
        int i3;
        int i4;
        int i5;
        ArrayList arrayList;
        ArrayList arrayList2;
        RoundingMode roundingMode;
        int i6;
        long[] jArr;
        int i7;
        ArrayList arrayList3;
        long[] jArr2;
        LinkedList linkedList = this.f8385f;
        C0113p[] c0113pArr = new C0113p[linkedList.size()];
        linkedList.toArray(c0113pArr);
        String str = this.f8390k;
        int i8 = this.f8386g;
        String str2 = this.f8387h;
        long j3 = this.f8388i;
        String str3 = this.f8389j;
        int i9 = this.f8391l;
        int i10 = this.f8392m;
        int i11 = this.f8393n;
        int i12 = this.f8394o;
        String str4 = this.f8395p;
        ArrayList arrayList4 = this.f8396q;
        long j4 = this.f8397r;
        int i13 = A.f2405a;
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        int size = arrayList4.size();
        long[] jArr3 = new long[size];
        int i14 = (j3 > 1000000L ? 1 : (j3 == 1000000L ? 0 : -1));
        if (i14 >= 0 && j3 % 1000000 == 0) {
            i3 = i10;
            long q3 = android.support.v4.media.session.a.q(j3, 1000000L, RoundingMode.UNNECESSARY);
            int i15 = 0;
            while (i15 < size) {
                jArr3[i15] = android.support.v4.media.session.a.q(((Long) arrayList4.get(i15)).longValue(), q3, roundingMode2);
                i15++;
                i9 = i9;
                i11 = i11;
            }
            arrayList3 = arrayList4;
            jArr2 = jArr3;
            i4 = i11;
            i5 = i9;
        } else {
            i3 = i10;
            i4 = i11;
            i5 = i9;
            if (i14 < 0 && 1000000 % j3 == 0) {
                long q4 = android.support.v4.media.session.a.q(1000000L, j3, RoundingMode.UNNECESSARY);
                for (int i16 = 0; i16 < size; i16++) {
                    jArr3[i16] = android.support.v4.media.session.a.N(((Long) arrayList4.get(i16)).longValue(), q4);
                }
            } else {
                int i17 = 0;
                while (i17 < size) {
                    long longValue = ((Long) arrayList4.get(i17)).longValue();
                    if (longValue == 0) {
                        arrayList2 = arrayList4;
                        roundingMode = roundingMode2;
                        i6 = size;
                        jArr = jArr3;
                        i7 = i17;
                    } else {
                        int i18 = (j3 > longValue ? 1 : (j3 == longValue ? 0 : -1));
                        if (i18 >= 0 && j3 % longValue == 0) {
                            arrayList = arrayList4;
                            jArr3[i17] = android.support.v4.media.session.a.q(1000000L, android.support.v4.media.session.a.q(j3, longValue, RoundingMode.UNNECESSARY), roundingMode2);
                        } else {
                            arrayList = arrayList4;
                            if (i18 < 0 && longValue % j3 == 0) {
                                jArr3[i17] = android.support.v4.media.session.a.N(1000000L, android.support.v4.media.session.a.q(longValue, j3, RoundingMode.UNNECESSARY));
                            } else {
                                arrayList2 = arrayList;
                                roundingMode = roundingMode2;
                                i6 = size;
                                jArr = jArr3;
                                i7 = i17;
                                jArr[i7] = A.V(longValue, 1000000L, j3, roundingMode);
                            }
                        }
                        i6 = size;
                        jArr = jArr3;
                        i7 = i17;
                        arrayList2 = arrayList;
                        roundingMode = roundingMode2;
                    }
                    i17 = i7 + 1;
                    arrayList4 = arrayList2;
                    roundingMode2 = roundingMode;
                    size = i6;
                    jArr3 = jArr;
                }
            }
            arrayList3 = arrayList4;
            jArr2 = jArr3;
        }
        return new b(this.f8384e, str, i8, str2, j3, str3, i5, i3, i4, i12, str4, c0113pArr, arrayList3, jArr2, A.U(j4, 1000000L, j3, RoundingMode.FLOOR));
    }

    @Override // n0.d
    public final boolean d(String str) {
        return "c".equals(str);
    }

    @Override // n0.d
    public final void j(XmlPullParser xmlPullParser) {
        int i3 = 1;
        if ("c".equals(xmlPullParser.getName())) {
            int size = this.f8396q.size();
            long h3 = d.h(xmlPullParser, "t", -9223372036854775807L);
            if (h3 == -9223372036854775807L) {
                if (size == 0) {
                    h3 = 0;
                } else if (this.f8397r != -1) {
                    h3 = this.f8397r + ((Long) this.f8396q.get(size - 1)).longValue();
                } else {
                    throw H.b("Unable to infer start time", null);
                }
            }
            this.f8396q.add(Long.valueOf(h3));
            this.f8397r = d.h(xmlPullParser, "d", -9223372036854775807L);
            long h4 = d.h(xmlPullParser, "r", 1L);
            if (h4 > 1 && this.f8397r == -9223372036854775807L) {
                throw H.b("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j3 = i3;
                if (j3 < h4) {
                    this.f8396q.add(Long.valueOf((this.f8397r * j3) + h3));
                    i3++;
                } else {
                    return;
                }
            }
        } else {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue != null) {
                if (!"audio".equalsIgnoreCase(attributeValue)) {
                    if ("video".equalsIgnoreCase(attributeValue)) {
                        i3 = 2;
                    } else if ("text".equalsIgnoreCase(attributeValue)) {
                        i3 = 3;
                    } else {
                        throw H.b("Invalid key value[" + attributeValue + "]", null);
                    }
                }
                this.f8386g = i3;
                l(Integer.valueOf(i3), "Type");
                if (this.f8386g == 3) {
                    String attributeValue2 = xmlPullParser.getAttributeValue(null, "Subtype");
                    if (attributeValue2 != null) {
                        this.f8387h = attributeValue2;
                    } else {
                        throw new C0.d("Subtype", 1);
                    }
                } else {
                    this.f8387h = xmlPullParser.getAttributeValue(null, "Subtype");
                }
                l(this.f8387h, "Subtype");
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "Name");
                this.f8389j = attributeValue3;
                l(attributeValue3, "Name");
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "Url");
                if (attributeValue4 != null) {
                    this.f8390k = attributeValue4;
                    this.f8391l = d.g(xmlPullParser, "MaxWidth");
                    this.f8392m = d.g(xmlPullParser, "MaxHeight");
                    this.f8393n = d.g(xmlPullParser, "DisplayWidth");
                    this.f8394o = d.g(xmlPullParser, "DisplayHeight");
                    String attributeValue5 = xmlPullParser.getAttributeValue(null, "Language");
                    this.f8395p = attributeValue5;
                    l(attributeValue5, "Language");
                    long g3 = d.g(xmlPullParser, "TimeScale");
                    this.f8388i = g3;
                    if (g3 == -1) {
                        this.f8388i = ((Long) c("TimeScale")).longValue();
                    }
                    this.f8396q = new ArrayList();
                    return;
                }
                throw new C0.d("Url", 1);
            }
            throw new C0.d("Type", 1);
        }
    }
}
