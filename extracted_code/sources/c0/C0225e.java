package c0;

import R.H;
import U.A;
import U.AbstractC0123a;
import a.AbstractC0155a;
import android.net.Uri;
import android.text.TextUtils;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* renamed from: c0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0225e extends DefaultHandler implements s0.p {

    /* renamed from: n  reason: collision with root package name */
    public static final Pattern f4733n = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f4734o = Pattern.compile("CC([1-4])=.*");

    /* renamed from: p  reason: collision with root package name */
    public static final Pattern f4735p = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f4736q = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: m  reason: collision with root package name */
    public final XmlPullParserFactory f4737m;

    public C0225e() {
        try {
            this.f4737m = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static long a(ArrayList arrayList, long j3, long j4, int i3, long j5) {
        int i4;
        if (i3 >= 0) {
            i4 = i3 + 1;
        } else {
            int i5 = A.f2405a;
            i4 = (int) ((((j5 - j3) + j4) - 1) / j4);
        }
        for (int i6 = 0; i6 < i4; i6++) {
            arrayList.add(new q(j3, j4));
            j3 += j4;
        }
        return j3;
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (!AbstractC0123a.t(xmlPullParser)) {
            return;
        }
        int i3 = 1;
        while (i3 != 0) {
            xmlPullParser.next();
            if (AbstractC0123a.t(xmlPullParser)) {
                i3++;
            } else if (xmlPullParser.getEventType() == 3) {
                i3--;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
        if (r0 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b4, code lost:
        if (r8.equals("fa01") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00fd, code lost:
        if (r0 < 33) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(org.xmlpull.v1.XmlPullParser r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.C0225e.c(org.xmlpull.v1.XmlPullParser):int");
    }

    public static long d(XmlPullParser xmlPullParser, long j3) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j3;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return Float.parseFloat(attributeValue) * 1000000.0f;
    }

    public static ArrayList e(XmlPullParser xmlPullParser, List list, boolean z3) {
        int i3;
        int i4;
        String str;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i3 = Integer.parseInt(attributeValue);
        } else if (z3) {
            i3 = 1;
        } else {
            i3 = Integer.MIN_VALUE;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        if (attributeValue2 != null) {
            i4 = Integer.parseInt(attributeValue2);
        } else {
            i4 = 1;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC0123a.s(xmlPullParser, "BaseURL"));
        if (str2 != null && AbstractC0123a.q(str2)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str2;
            }
            return D1.r.p(new C0222b(i3, i4, str2, attributeValue3));
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < list.size(); i5++) {
            C0222b c0222b = (C0222b) list.get(i5);
            String x = AbstractC0123a.x(c0222b.f4709a, str2);
            if (attributeValue3 == null) {
                str = x;
            } else {
                str = attributeValue3;
            }
            if (z3) {
                i3 = c0222b.f4711c;
                i4 = c0222b.f4712d;
                str = c0222b.f4710b;
            }
            arrayList.add(new C0222b(i3, i4, x, str));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair f(org.xmlpull.v1.XmlPullParser r14) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.C0225e.f(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        if (!"image".equals(attributeValue)) {
            return -1;
        }
        return 4;
    }

    public static C0226f h(XmlPullParser xmlPullParser, String str) {
        String str2 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        if (attributeValue3 != null) {
            str2 = attributeValue3;
        }
        do {
            xmlPullParser.next();
        } while (!AbstractC0123a.s(xmlPullParser, str));
        return new C0226f(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j3) {
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j3;
        }
        Matcher matcher = A.f2413i.matcher(attributeValue);
        if (matcher.matches()) {
            boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
            String group = matcher.group(3);
            double d8 = 0.0d;
            if (group != null) {
                d3 = Double.parseDouble(group) * 3.1556908E7d;
            } else {
                d3 = 0.0d;
            }
            String group2 = matcher.group(5);
            if (group2 != null) {
                d4 = Double.parseDouble(group2) * 2629739.0d;
            } else {
                d4 = 0.0d;
            }
            double d9 = d3 + d4;
            String group3 = matcher.group(7);
            if (group3 != null) {
                d5 = Double.parseDouble(group3) * 86400.0d;
            } else {
                d5 = 0.0d;
            }
            double d10 = d9 + d5;
            String group4 = matcher.group(10);
            if (group4 != null) {
                d6 = Double.parseDouble(group4) * 3600.0d;
            } else {
                d6 = 0.0d;
            }
            double d11 = d10 + d6;
            String group5 = matcher.group(12);
            if (group5 != null) {
                d7 = Double.parseDouble(group5) * 60.0d;
            } else {
                d7 = 0.0d;
            }
            double d12 = d11 + d7;
            String group6 = matcher.group(14);
            if (group6 != null) {
                d8 = Double.parseDouble(group6);
            }
            long j4 = (long) ((d12 + d8) * 1000.0d);
            if (!isEmpty) {
                return -j4;
            }
            return j4;
        }
        return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
    }

    public static float j(XmlPullParser xmlPullParser, float f3) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f4733n.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                String group = matcher.group(2);
                if (!TextUtils.isEmpty(group)) {
                    return parseInt / Integer.parseInt(group);
                }
                return parseInt;
            }
            return f3;
        }
        return f3;
    }

    public static int l(XmlPullParser xmlPullParser, String str, int i3) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return Integer.parseInt(attributeValue);
        }
        return i3;
    }

    public static long m(XmlPullParser xmlPullParser, String str, long j3) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return Long.parseLong(attributeValue);
        }
        return j3;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: SSATransform
        java.lang.IndexOutOfBoundsException: bitIndex < 0: -124
        	at java.base/java.util.BitSet.get(BitSet.java:624)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.fillBasicBlockInfo(LiveVarAnalysis.java:65)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.runAnalysis(LiveVarAnalysis.java:36)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:55)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
        */
    public static c0.C0223c n(org.xmlpull.v1.XmlPullParser r155, android.net.Uri r156) {
        /*
            Method dump skipped, instructions count: 5186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.C0225e.n(org.xmlpull.v1.XmlPullParser, android.net.Uri):c0.c");
    }

    public static j o(XmlPullParser xmlPullParser, String str, String str2) {
        long j3;
        long j4;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j3 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j4 = (Long.parseLong(split[1]) - j3) + 1;
                return new j(j3, j4, attributeValue);
            }
        } else {
            j3 = 0;
        }
        j4 = -1;
        return new j(j3, j4, attributeValue);
    }

    public static int p(String str) {
        if (str == null) {
            return 0;
        }
        char c3 = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c3 = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c3 = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c3 = 2;
                    break;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    c3 = 3;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c3 = 4;
                    break;
                }
                break;
            case -1396432756:
                if (str.equals("forced-subtitle")) {
                    c3 = 5;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c3 = 6;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c3 = 7;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c3 = '\b';
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c3 = '\t';
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c3 = '\n';
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c3 = 11;
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c3 = '\f';
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                return 128;
            case 1:
                return 512;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return 2048;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                return 2;
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return 16;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return 1;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                return 256;
            case '\t':
                return 64;
            case '\n':
                return 8;
            case 11:
                return 32;
            case '\f':
                return 4;
            default:
                return 0;
        }
    }

    public static int q(ArrayList arrayList) {
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            if (AbstractC0155a.x("http://dashif.org/guidelines/trickmode", ((C0226f) arrayList.get(i4)).f4738a)) {
                i3 = 16384;
            }
        }
        return i3;
    }

    public static r r(XmlPullParser xmlPullParser, r rVar) {
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if (rVar != null) {
            j3 = rVar.f4781b;
        } else {
            j3 = 1;
        }
        long m3 = m(xmlPullParser, "timescale", j3);
        long j8 = 0;
        if (rVar != null) {
            j4 = rVar.f4782c;
        } else {
            j4 = 0;
        }
        long m4 = m(xmlPullParser, "presentationTimeOffset", j4);
        if (rVar != null) {
            j5 = rVar.f4778d;
        } else {
            j5 = 0;
        }
        if (rVar != null) {
            j8 = rVar.f4779e;
        }
        j jVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j6 = (Long.parseLong(split[1]) - parseLong) + 1;
            j7 = parseLong;
        } else {
            j6 = j8;
            j7 = j5;
        }
        if (rVar != null) {
            jVar = rVar.f4780a;
        }
        do {
            xmlPullParser.next();
            if (AbstractC0123a.u(xmlPullParser, "Initialization")) {
                jVar = o(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC0123a.s(xmlPullParser, "SegmentBase"));
        return new r(jVar, m3, m4, j7, j6);
    }

    public static o s(XmlPullParser xmlPullParser, o oVar, long j3, long j4, long j5, long j6, long j7) {
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13 = 1;
        if (oVar != null) {
            j8 = oVar.f4781b;
        } else {
            j8 = 1;
        }
        long m3 = m(xmlPullParser, "timescale", j8);
        if (oVar != null) {
            j9 = oVar.f4782c;
        } else {
            j9 = 0;
        }
        long m4 = m(xmlPullParser, "presentationTimeOffset", j9);
        if (oVar != null) {
            j10 = oVar.f4767e;
        } else {
            j10 = -9223372036854775807L;
        }
        long m5 = m(xmlPullParser, "duration", j10);
        if (oVar != null) {
            j13 = oVar.f4766d;
        }
        long m6 = m(xmlPullParser, "startNumber", j13);
        if (j6 == -9223372036854775807L) {
            j11 = j5;
        } else {
            j11 = j6;
        }
        if (j11 == Long.MAX_VALUE) {
            j12 = -9223372036854775807L;
        } else {
            j12 = j11;
        }
        List list = null;
        j jVar = null;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (AbstractC0123a.u(xmlPullParser, "Initialization")) {
                jVar = o(xmlPullParser, "sourceURL", "range");
            } else if (AbstractC0123a.u(xmlPullParser, "SegmentTimeline")) {
                list2 = u(xmlPullParser, m3, j4);
            } else if (AbstractC0123a.u(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(o(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC0123a.s(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVar == null) {
                jVar = oVar.f4780a;
            }
            if (list2 == null) {
                list2 = oVar.f4768f;
            }
            if (list == null) {
                list = oVar.f4772j;
            }
        }
        return new o(jVar, m3, m4, m6, m5, list2, j12, list, A.M(j7), A.M(j3));
    }

    public static p t(XmlPullParser xmlPullParser, p pVar, List list, long j3, long j4, long j5, long j6, long j7) {
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        B1.e eVar;
        B1.e eVar2;
        long j14 = 1;
        if (pVar != null) {
            j8 = pVar.f4781b;
        } else {
            j8 = 1;
        }
        long m3 = m(xmlPullParser, "timescale", j8);
        if (pVar != null) {
            j9 = pVar.f4782c;
        } else {
            j9 = 0;
        }
        long m4 = m(xmlPullParser, "presentationTimeOffset", j9);
        if (pVar != null) {
            j10 = pVar.f4767e;
        } else {
            j10 = -9223372036854775807L;
        }
        long m5 = m(xmlPullParser, "duration", j10);
        if (pVar != null) {
            j14 = pVar.f4766d;
        }
        long m6 = m(xmlPullParser, "startNumber", j14);
        int i3 = 0;
        while (true) {
            if (i3 < list.size()) {
                C0226f c0226f = (C0226f) list.get(i3);
                if (AbstractC0155a.x("http://dashif.org/guidelines/last-segment-number", c0226f.f4738a)) {
                    j11 = Long.parseLong(c0226f.f4739b);
                    break;
                }
                i3++;
            } else {
                j11 = -1;
                break;
            }
        }
        long j15 = j11;
        if (j6 == -9223372036854775807L) {
            j12 = j5;
        } else {
            j12 = j6;
        }
        if (j12 == Long.MAX_VALUE) {
            j13 = -9223372036854775807L;
        } else {
            j13 = j12;
        }
        j jVar = null;
        if (pVar != null) {
            eVar = pVar.f4774k;
        } else {
            eVar = null;
        }
        B1.e v3 = v(xmlPullParser, "media", eVar);
        if (pVar != null) {
            eVar2 = pVar.f4773j;
        } else {
            eVar2 = null;
        }
        B1.e v4 = v(xmlPullParser, "initialization", eVar2);
        List list2 = null;
        do {
            xmlPullParser.next();
            if (AbstractC0123a.u(xmlPullParser, "Initialization")) {
                jVar = o(xmlPullParser, "sourceURL", "range");
            } else if (AbstractC0123a.u(xmlPullParser, "SegmentTimeline")) {
                list2 = u(xmlPullParser, m3, j4);
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC0123a.s(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVar == null) {
                jVar = pVar.f4780a;
            }
            if (list2 == null) {
                list2 = pVar.f4768f;
            }
        }
        return new p(jVar, m3, m4, m6, j15, m5, list2, j13, v4, v3, A.M(j7), A.M(j3));
    }

    public static ArrayList u(XmlPullParser xmlPullParser, long j3, long j4) {
        ArrayList arrayList = new ArrayList();
        long j5 = 0;
        long j6 = -9223372036854775807L;
        boolean z3 = false;
        int i3 = 0;
        do {
            xmlPullParser.next();
            if (AbstractC0123a.u(xmlPullParser, "S")) {
                long m3 = m(xmlPullParser, "t", -9223372036854775807L);
                if (z3) {
                    j5 = a(arrayList, j5, j6, i3, m3);
                }
                if (m3 == -9223372036854775807L) {
                    m3 = j5;
                }
                j6 = m(xmlPullParser, "d", -9223372036854775807L);
                i3 = l(xmlPullParser, "r", 0);
                j5 = m3;
                z3 = true;
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC0123a.s(xmlPullParser, "SegmentTimeline"));
        if (z3) {
            int i4 = A.f2405a;
            a(arrayList, j5, j6, i3, A.U(j4, j3, 1000L, RoundingMode.FLOOR));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static B1.e v(XmlPullParser xmlPullParser, String str, B1.e eVar) {
        String str2;
        char c3;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList.add("");
            int i3 = 0;
            while (i3 < attributeValue.length()) {
                int indexOf = attributeValue.indexOf("$", i3);
                if (indexOf == -1) {
                    int size = arrayList2.size();
                    arrayList.set(size, ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i3));
                    i3 = attributeValue.length();
                } else if (indexOf != i3) {
                    int size2 = arrayList2.size();
                    arrayList.set(size2, ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i3, indexOf));
                    i3 = indexOf;
                } else if (attributeValue.startsWith("$$", i3)) {
                    int size3 = arrayList2.size();
                    arrayList.set(size3, ((String) arrayList.get(arrayList2.size())) + "$");
                    i3 += 2;
                } else {
                    arrayList3.add("");
                    int i4 = i3 + 1;
                    int indexOf2 = attributeValue.indexOf("$", i4);
                    String substring = attributeValue.substring(i4, indexOf2);
                    if (substring.equals("RepresentationID")) {
                        arrayList2.add(1);
                    } else {
                        int indexOf3 = substring.indexOf("%0");
                        if (indexOf3 != -1) {
                            str2 = substring.substring(indexOf3);
                            if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                                str2 = str2.concat("d");
                            }
                            substring = substring.substring(0, indexOf3);
                        } else {
                            str2 = "%01d";
                        }
                        substring.getClass();
                        switch (substring.hashCode()) {
                            case -1950496919:
                                if (substring.equals("Number")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2606829:
                                if (substring.equals("Time")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 38199441:
                                if (substring.equals("Bandwidth")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                                arrayList2.add(2);
                                break;
                            case 1:
                                arrayList2.add(4);
                                break;
                            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                                arrayList2.add(3);
                                break;
                            default:
                                throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                        }
                        arrayList3.set(arrayList2.size() - 1, str2);
                    }
                    arrayList.add("");
                    i3 = indexOf2 + 1;
                }
            }
            return new B1.e(arrayList, arrayList2, arrayList3, 7);
        }
        return eVar;
    }

    @Override // s0.p
    public final Object k(Uri uri, W.j jVar) {
        try {
            XmlPullParser newPullParser = this.f4737m.newPullParser();
            newPullParser.setInput(jVar, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return n(newPullParser, uri);
            }
            throw H.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e2) {
            throw H.b(null, e2);
        }
    }
}
