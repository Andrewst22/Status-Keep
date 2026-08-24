package Y0;

import D1.I;
import D2.h;
import T.b;
import T0.k;
import T0.l;
import U.AbstractC0123a;
import U.d;
import U.t;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: p  reason: collision with root package name */
    public static final Pattern f3410p = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f3411q = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: m  reason: collision with root package name */
    public final StringBuilder f3412m = new StringBuilder();

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f3413n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public final t f3414o = new t();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b a(Spanned spanned, String str) {
        char c3;
        int i3;
        char c4;
        int i4;
        float f3;
        if (str == null) {
            return new b(spanned, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        if (c3 != 0 && c3 != 1 && c3 != 2) {
            if (c3 != 3 && c3 != 4 && c3 != 5) {
                i3 = 1;
            } else {
                i3 = 2;
            }
        } else {
            i3 = 0;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        if (c4 != 0 && c4 != 1 && c4 != 2) {
            if (c4 != 3 && c4 != 4 && c4 != 5) {
                i4 = 1;
            } else {
                i4 = 0;
            }
        } else {
            i4 = 2;
        }
        float f4 = 0.92f;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f3 = 0.92f;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                f3 = 0.5f;
            }
        } else {
            f3 = 0.08f;
        }
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalArgumentException();
                }
            } else {
                f4 = 0.5f;
            }
        } else {
            f4 = 0.08f;
        }
        return new b(spanned, null, null, null, f4, 0, i4, f3, i3, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public static long c(Matcher matcher, int i3) {
        long j3;
        String group = matcher.group(i3 + 1);
        if (group != null) {
            j3 = Long.parseLong(group) * 3600000;
        } else {
            j3 = 0;
        }
        String group2 = matcher.group(i3 + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * 60000) + j3;
        String group3 = matcher.group(i3 + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i3 + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    @Override // T0.l
    public final /* synthetic */ void b() {
    }

    @Override // T0.l
    public final void e(byte[] bArr, int i3, int i4, k kVar, d dVar) {
        ArrayList<T0.a> arrayList;
        long j3;
        String str;
        String i5;
        String str2;
        d dVar2;
        a aVar = this;
        d dVar3 = dVar;
        String str3 = "SubripParser";
        t tVar = aVar.f3414o;
        tVar.E(bArr, i3 + i4);
        tVar.G(i3);
        Charset C3 = tVar.C();
        if (C3 == null) {
            C3 = C1.d.f153c;
        }
        long j4 = kVar.f2323a;
        long j5 = -9223372036854775807L;
        if (j4 != -9223372036854775807L && kVar.f2324b) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        while (true) {
            String i6 = tVar.i(C3);
            if (i6 == null) {
                break;
            } else if (i6.length() != 0) {
                try {
                    Integer.parseInt(i6);
                    i5 = tVar.i(C3);
                } catch (NumberFormatException unused) {
                    j3 = j5;
                    str = str3;
                    AbstractC0123a.A(str, "Skipping invalid index: ".concat(i6));
                    dVar3 = dVar3;
                    aVar = this;
                }
                if (i5 == null) {
                    AbstractC0123a.A(str3, "Unexpected end");
                    break;
                }
                Matcher matcher = f3410p.matcher(i5);
                if (matcher.matches()) {
                    long c3 = c(matcher, 1);
                    long c4 = c(matcher, 6);
                    StringBuilder sb = aVar.f3412m;
                    sb.setLength(0);
                    ArrayList arrayList2 = aVar.f3413n;
                    arrayList2.clear();
                    String i7 = tVar.i(C3);
                    while (!TextUtils.isEmpty(i7)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String trim = i7.trim();
                        StringBuilder sb2 = new StringBuilder(trim);
                        Matcher matcher2 = f3411q.matcher(trim);
                        int i8 = 0;
                        while (matcher2.find()) {
                            String group = matcher2.group();
                            arrayList2.add(group);
                            Matcher matcher3 = matcher2;
                            int start = matcher2.start() - i8;
                            int length = group.length();
                            sb2.replace(start, start + length, "");
                            i8 += length;
                            matcher2 = matcher3;
                            str3 = str3;
                        }
                        sb.append(sb2.toString());
                        i7 = tVar.i(C3);
                        str3 = str3;
                    }
                    String str4 = str3;
                    Spanned fromHtml = Html.fromHtml(sb.toString());
                    int i9 = 0;
                    while (true) {
                        if (i9 < arrayList2.size()) {
                            str2 = (String) arrayList2.get(i9);
                            if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i9++;
                        } else {
                            str2 = null;
                            break;
                        }
                    }
                    if (j4 != -9223372036854775807L && c3 < j4) {
                        if (arrayList != null) {
                            arrayList.add(new T0.a(I.o(a(fromHtml, str2)), c3, c4 - c3));
                        }
                        dVar2 = dVar;
                    } else {
                        dVar2 = dVar;
                        dVar2.accept(new T0.a(I.o(a(fromHtml, str2)), c3, c4 - c3));
                    }
                    dVar3 = dVar2;
                    j5 = -9223372036854775807L;
                    str3 = str4;
                    aVar = this;
                } else {
                    String str5 = str3;
                    long j6 = j5;
                    str = str5;
                    AbstractC0123a.A(str, "Skipping invalid timing: ".concat(i5));
                    dVar3 = dVar3;
                    aVar = this;
                    j3 = j6;
                    str3 = str;
                    j5 = j3;
                }
            }
        }
        d dVar4 = dVar3;
        if (arrayList != null) {
            for (T0.a aVar2 : arrayList) {
                dVar4.accept(aVar2);
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
