package X0;

import D2.h;
import R.C0105h;
import T0.k;
import T0.l;
import U.A;
import U.AbstractC0123a;
import U.t;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: s  reason: collision with root package name */
    public static final Pattern f2942s = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: m  reason: collision with root package name */
    public final boolean f2943m;

    /* renamed from: n  reason: collision with root package name */
    public final C0105h f2944n;

    /* renamed from: p  reason: collision with root package name */
    public LinkedHashMap f2946p;

    /* renamed from: q  reason: collision with root package name */
    public float f2947q = -3.4028235E38f;

    /* renamed from: r  reason: collision with root package name */
    public float f2948r = -3.4028235E38f;

    /* renamed from: o  reason: collision with root package name */
    public final t f2945o = new t();

    public a(List list) {
        if (list != null && !list.isEmpty()) {
            this.f2943m = true;
            String p3 = A.p((byte[]) list.get(0));
            AbstractC0123a.e(p3.startsWith("Format:"));
            C0105h c3 = C0105h.c(p3);
            c3.getClass();
            this.f2944n = c3;
            c(new t((byte[]) list.get(1)), C1.d.f153c);
            return;
        }
        this.f2943m = false;
        this.f2944n = null;
    }

    public static int a(long j3, ArrayList arrayList, ArrayList arrayList2) {
        int i3;
        ArrayList arrayList3;
        int size = arrayList.size() - 1;
        while (true) {
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() == j3) {
                    return size;
                }
                if (((Long) arrayList.get(size)).longValue() < j3) {
                    i3 = size + 1;
                    break;
                }
                size--;
            } else {
                i3 = 0;
                break;
            }
        }
        arrayList.add(i3, Long.valueOf(j3));
        if (i3 == 0) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i3 - 1));
        }
        arrayList2.add(i3, arrayList3);
        return i3;
    }

    public static long d(String str) {
        Matcher matcher = f2942s.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i3 = A.f2405a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    @Override // T0.l
    public final /* synthetic */ void b() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02ac, code lost:
        if (r4 != 3) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(U.t r38, java.nio.charset.Charset r39) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.a.c(U.t, java.nio.charset.Charset):void");
    }

    @Override // T0.l
    public final void e(byte[] bArr, int i3, int i4, k kVar, U.d dVar) {
        C0105h c0105h;
        ArrayList<T0.a> arrayList;
        Charset charset;
        C0105h c0105h2;
        t tVar;
        d dVar2;
        int i5;
        int i6;
        int i7;
        float f3;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i8;
        PointF pointF;
        int i9;
        int i10;
        float f4;
        float f5;
        float f6;
        int i11;
        float f7;
        int i12;
        float f8;
        int i13;
        int i14;
        Integer num;
        int i15;
        int i16;
        a aVar = this;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        t tVar2 = aVar.f2945o;
        tVar2.E(bArr, i3 + i4);
        tVar2.G(i3);
        Charset C3 = tVar2.C();
        if (C3 == null) {
            C3 = C1.d.f153c;
        }
        boolean z3 = aVar.f2943m;
        if (!z3) {
            aVar.c(tVar2, C3);
        }
        if (z3) {
            c0105h = aVar.f2944n;
        } else {
            c0105h = null;
        }
        while (true) {
            String i17 = tVar2.i(C3);
            if (i17 != null) {
                if (i17.startsWith("Format:")) {
                    c0105h = C0105h.c(i17);
                } else {
                    if (i17.startsWith("Dialogue:")) {
                        if (c0105h == null) {
                            AbstractC0123a.A("SsaParser", "Skipping dialogue line before complete format: ".concat(i17));
                        } else {
                            AbstractC0123a.e(i17.startsWith("Dialogue:"));
                            String substring = i17.substring(9);
                            int i18 = c0105h.f1896e;
                            String[] split = substring.split(",", i18);
                            if (split.length != i18) {
                                AbstractC0123a.A("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(i17));
                            } else {
                                t tVar3 = tVar2;
                                long d3 = d(split[c0105h.f1892a]);
                                if (d3 == -9223372036854775807L) {
                                    AbstractC0123a.A("SsaParser", "Skipping invalid timing: ".concat(i17));
                                } else {
                                    long d4 = d(split[c0105h.f1893b]);
                                    if (d4 == -9223372036854775807L) {
                                        AbstractC0123a.A("SsaParser", "Skipping invalid timing: ".concat(i17));
                                    } else {
                                        LinkedHashMap linkedHashMap = aVar.f2946p;
                                        charset = C3;
                                        if (linkedHashMap != null && (i16 = c0105h.f1894c) != -1) {
                                            dVar2 = (d) linkedHashMap.get(split[i16].trim());
                                        } else {
                                            dVar2 = null;
                                        }
                                        String str = split[c0105h.f1895d];
                                        Matcher matcher = c.f2960a.matcher(str);
                                        int i19 = -1;
                                        PointF pointF2 = null;
                                        while (matcher.find()) {
                                            C0105h c0105h3 = c0105h;
                                            String group = matcher.group(1);
                                            group.getClass();
                                            try {
                                                PointF a3 = c.a(group);
                                                if (a3 != null) {
                                                    pointF2 = a3;
                                                }
                                            } catch (RuntimeException unused) {
                                            }
                                            try {
                                                Matcher matcher2 = c.f2963d.matcher(group);
                                                if (matcher2.find()) {
                                                    String group2 = matcher2.group(1);
                                                    group2.getClass();
                                                    i15 = d.a(group2);
                                                } else {
                                                    i15 = -1;
                                                }
                                                if (i15 != -1) {
                                                    i19 = i15;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            c0105h = c0105h3;
                                        }
                                        c0105h2 = c0105h;
                                        String replace = c.f2960a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f9 = aVar.f2947q;
                                        float f10 = aVar.f2948r;
                                        SpannableString spannableString = new SpannableString(replace);
                                        if (dVar2 != null) {
                                            Integer num2 = dVar2.f2966c;
                                            if (num2 != null) {
                                                tVar = tVar3;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                tVar = tVar3;
                                            }
                                            if (dVar2.f2973j == 3 && (num = dVar2.f2967d) != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                            }
                                            float f11 = dVar2.f2968e;
                                            if (f11 != -3.4028235E38f && f10 != -3.4028235E38f) {
                                                f7 = f11 / f10;
                                                i11 = 1;
                                            } else {
                                                i11 = Integer.MIN_VALUE;
                                                f7 = -3.4028235E38f;
                                            }
                                            boolean z4 = dVar2.f2970g;
                                            boolean z5 = dVar2.f2969f;
                                            if (z5 && z4) {
                                                i12 = i11;
                                                f8 = f7;
                                                i13 = 0;
                                                i14 = 33;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                i12 = i11;
                                                f8 = f7;
                                                i13 = 0;
                                                i14 = 33;
                                                if (z5) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z4) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (dVar2.f2971h) {
                                                spannableString.setSpan(new UnderlineSpan(), i13, spannableString.length(), i14);
                                            }
                                            if (dVar2.f2972i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i13, spannableString.length(), i14);
                                            }
                                            i5 = i19;
                                            f3 = f8;
                                            i7 = i12;
                                            i6 = -1;
                                        } else {
                                            tVar = tVar3;
                                            i5 = i19;
                                            i6 = -1;
                                            i7 = Integer.MIN_VALUE;
                                            f3 = -3.4028235E38f;
                                        }
                                        if (i5 != i6) {
                                            i6 = i5;
                                        } else if (dVar2 != null) {
                                            i6 = dVar2.f2965b;
                                        }
                                        switch (i6) {
                                            case 0:
                                            default:
                                                h.n(i6, "Unknown alignment: ", "SsaParser");
                                            case -1:
                                                alignment2 = null;
                                                break;
                                            case 1:
                                            case N.k.LONG_FIELD_NUMBER /* 4 */:
                                            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                alignment2 = alignment;
                                                break;
                                            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                                            case N.k.STRING_FIELD_NUMBER /* 5 */:
                                            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                alignment2 = alignment;
                                                break;
                                            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                                            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                alignment2 = alignment;
                                                break;
                                        }
                                        int i20 = Integer.MIN_VALUE;
                                        switch (i6) {
                                            case 0:
                                            default:
                                                h.n(i6, "Unknown alignment: ", "SsaParser");
                                            case -1:
                                                i8 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case N.k.LONG_FIELD_NUMBER /* 4 */:
                                            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                                i8 = 0;
                                                break;
                                            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                                            case N.k.STRING_FIELD_NUMBER /* 5 */:
                                            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                                                i8 = 1;
                                                break;
                                            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                                            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                            case 9:
                                                i8 = 2;
                                                break;
                                        }
                                        switch (i6) {
                                            case 0:
                                            default:
                                                h.n(i6, "Unknown alignment: ", "SsaParser");
                                            case -1:
                                                pointF = pointF2;
                                                break;
                                            case 1:
                                            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                                            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                                                pointF = pointF2;
                                                i20 = 2;
                                                break;
                                            case N.k.LONG_FIELD_NUMBER /* 4 */:
                                            case N.k.STRING_FIELD_NUMBER /* 5 */:
                                            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                                pointF = pointF2;
                                                i20 = 1;
                                                break;
                                            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                                            case 9:
                                                pointF = pointF2;
                                                i20 = 0;
                                                break;
                                        }
                                        if (pointF != null && f10 != -3.4028235E38f && f9 != -3.4028235E38f) {
                                            f5 = pointF.y / f10;
                                            f6 = pointF.x / f9;
                                        } else {
                                            float f12 = 0.95f;
                                            if (i8 != 0) {
                                                i9 = 1;
                                                if (i8 != 1) {
                                                    i10 = 2;
                                                    if (i8 != 2) {
                                                        f4 = -3.4028235E38f;
                                                    } else {
                                                        f4 = 0.95f;
                                                    }
                                                } else {
                                                    i10 = 2;
                                                    f4 = 0.5f;
                                                }
                                            } else {
                                                i9 = 1;
                                                i10 = 2;
                                                f4 = 0.05f;
                                            }
                                            if (i20 != 0) {
                                                if (i20 != i9) {
                                                    if (i20 != i10) {
                                                        f12 = -3.4028235E38f;
                                                    }
                                                } else {
                                                    f12 = 0.5f;
                                                }
                                            } else {
                                                f12 = 0.05f;
                                            }
                                            f5 = f12;
                                            f6 = f4;
                                        }
                                        T.b bVar = new T.b(spannableString, alignment2, null, null, f5, 0, i20, f6, i8, i7, f3, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                        int a4 = a(d4, arrayList3, arrayList2);
                                        for (int a5 = a(d3, arrayList3, arrayList2); a5 < a4; a5++) {
                                            ((List) arrayList2.get(a5)).add(bVar);
                                        }
                                        aVar = this;
                                        c0105h = c0105h2;
                                        C3 = charset;
                                        tVar2 = tVar;
                                    }
                                }
                                charset = C3;
                                c0105h2 = c0105h;
                                tVar = tVar3;
                                aVar = this;
                                c0105h = c0105h2;
                                C3 = charset;
                                tVar2 = tVar;
                            }
                        }
                    }
                    charset = C3;
                    c0105h2 = c0105h;
                    tVar = tVar2;
                    aVar = this;
                    c0105h = c0105h2;
                    C3 = charset;
                    tVar2 = tVar;
                }
            } else {
                long j3 = kVar.f2323a;
                if (j3 != -9223372036854775807L && kVar.f2324b) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = null;
                }
                for (int i21 = 0; i21 < arrayList2.size(); i21++) {
                    List list = (List) arrayList2.get(i21);
                    if (!list.isEmpty() || i21 == 0) {
                        if (i21 != arrayList2.size() - 1) {
                            long longValue = ((Long) arrayList3.get(i21)).longValue();
                            long longValue2 = ((Long) arrayList3.get(i21 + 1)).longValue() - ((Long) arrayList3.get(i21)).longValue();
                            if (j3 != -9223372036854775807L && longValue < j3) {
                                if (arrayList != null) {
                                    arrayList.add(new T0.a(list, longValue, longValue2));
                                }
                            } else {
                                dVar.accept(new T0.a(list, longValue, longValue2));
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                }
                if (arrayList != null) {
                    for (T0.a aVar2 : arrayList) {
                        dVar.accept(aVar2);
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // T0.l
    public final int k() {
        return 1;
    }

    @Override // T0.l
    public final /* synthetic */ T0.d r(byte[] bArr, int i3, int i4) {
        return h.a(this, bArr, i4);
    }
}
