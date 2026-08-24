package Z0;

import C.C0009j;
import N.k;
import T0.l;
import U.A;
import U.AbstractC0123a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* loaded from: classes.dex */
public final class e implements l {

    /* renamed from: n  reason: collision with root package name */
    public static final Pattern f3556n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f3557o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: p  reason: collision with root package name */
    public static final Pattern f3558p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f3559q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: r  reason: collision with root package name */
    public static final Pattern f3560r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: s  reason: collision with root package name */
    public static final Pattern f3561s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: t  reason: collision with root package name */
    public static final Pattern f3562t = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: u  reason: collision with root package name */
    public static final d f3563u = new d(30.0f, 1, 1);

    /* renamed from: m  reason: collision with root package name */
    public final XmlPullParserFactory f3564m;

    public e() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f3564m = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static g a(g gVar) {
        if (gVar == null) {
            return new g();
        }
        return gVar;
    }

    public static boolean c(String str) {
        if (!str.equals("tt") && !str.equals("head") && !str.equals("body") && !str.equals("div") && !str.equals("p") && !str.equals("span") && !str.equals("br") && !str.equals("style") && !str.equals("styling") && !str.equals("layout") && !str.equals("region") && !str.equals("metadata") && !str.equals("image") && !str.equals("data") && !str.equals("information")) {
            return false;
        }
        return true;
    }

    public static int d(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f3562t.matcher(attributeValue);
        if (!matcher.matches()) {
            AbstractC0123a.A("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z3 = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z3 = false;
            }
            AbstractC0123a.d("Invalid cell resolution " + parseInt + " " + parseInt2, z3);
            return parseInt2;
        } catch (NumberFormatException unused) {
            AbstractC0123a.A("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void f(String str, g gVar) {
        Matcher matcher;
        char c3 = 65535;
        int i3 = A.f2405a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = f3558p;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            AbstractC0123a.A("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new Exception("Invalid number of entries for fontSize: " + split.length + ".");
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c3 = 2;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    gVar.f3584j = 3;
                    break;
                case 1:
                    gVar.f3584j = 2;
                    break;
                case k.FLOAT_FIELD_NUMBER /* 2 */:
                    gVar.f3584j = 1;
                    break;
                default:
                    throw new Exception("Invalid unit for fontSize: '" + group + "'.");
            }
            String group2 = matcher.group(1);
            group2.getClass();
            gVar.f3585k = Float.parseFloat(group2);
            return;
        }
        throw new Exception("Invalid expression for fontSize: '" + str + "'.");
    }

    public static d g(XmlPullParser xmlPullParser) {
        int i3;
        float f3;
        int i4;
        boolean z3;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i3 = Integer.parseInt(attributeValue);
        } else {
            i3 = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i5 = A.f2405a;
            String[] split = attributeValue2.split(" ", -1);
            if (split.length == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0123a.d("frameRateMultiplier doesn't have 2 parts", z3);
            f3 = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
        } else {
            f3 = 1.0f;
        }
        d dVar = f3563u;
        int i6 = dVar.f3554b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i6 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i4 = Integer.parseInt(attributeValue4);
        } else {
            i4 = dVar.f3555c;
        }
        return new d(i3 * f3, i6, i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024d A[LOOP:0: B:3:0x000a->B:104:0x024d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, C.C0009j r23, java.util.HashMap r24, java.util.HashMap r25) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.e.h(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, C.j, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static c i(XmlPullParser xmlPullParser, c cVar, HashMap hashMap, d dVar) {
        long j3;
        long j4;
        char c3;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        g j5 = j(xmlPullParser, null);
        String[] strArr = null;
        String str = null;
        String str2 = "";
        long j6 = -9223372036854775807L;
        long j7 = -9223372036854775807L;
        long j8 = -9223372036854775807L;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlPullParser.getAttributeName(i3);
            String attributeValue = xmlPullParser.getAttributeValue(i3);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c3 = 5;
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
                    if (hashMap.containsKey(attributeValue)) {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j8 = l(attributeValue, dVar);
                    break;
                case k.FLOAT_FIELD_NUMBER /* 2 */:
                    j7 = l(attributeValue, dVar);
                    break;
                case k.INTEGER_FIELD_NUMBER /* 3 */:
                    j6 = l(attributeValue, dVar);
                    break;
                case k.LONG_FIELD_NUMBER /* 4 */:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i4 = A.f2405a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case k.STRING_FIELD_NUMBER /* 5 */:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (cVar != null) {
            long j9 = cVar.f3543d;
            j3 = -9223372036854775807L;
            if (j9 != -9223372036854775807L) {
                if (j6 != -9223372036854775807L) {
                    j6 += j9;
                }
                if (j7 != -9223372036854775807L) {
                    j7 += j9;
                }
            }
        } else {
            j3 = -9223372036854775807L;
        }
        if (j7 == j3) {
            if (j8 != j3) {
                j4 = j6 + j8;
            } else if (cVar != null) {
                long j10 = cVar.f3544e;
                if (j10 != j3) {
                    j4 = j10;
                }
            }
            return new c(xmlPullParser.getName(), null, j6, j4, j5, strArr, str2, str, cVar);
        }
        j4 = j7;
        return new c(xmlPullParser.getName(), null, j6, j4, j5, strArr, str2, str, cVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02db  */
    /* JADX WARN: Type inference failed for: r11v84, types: [Z0.b] */
    /* JADX WARN: Type inference failed for: r12v46, types: [Z0.b] */
    /* JADX WARN: Type inference failed for: r12v55, types: [Z0.b] */
    /* JADX WARN: Type inference failed for: r1v50, types: [Z0.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Z0.g j(org.xmlpull.v1.XmlPullParser r19, Z0.g r20) {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.e.j(org.xmlpull.v1.XmlPullParser, Z0.g):Z0.g");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long l(java.lang.String r13, Z0.d r14) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.e.l(java.lang.String, Z0.d):long");
    }

    public static C0009j m(XmlPullParser xmlPullParser) {
        String p3 = AbstractC0123a.p(xmlPullParser, "extent");
        if (p3 == null) {
            return null;
        }
        Matcher matcher = f3561s.matcher(p3);
        if (!matcher.matches()) {
            AbstractC0123a.A("TtmlParser", "Ignoring non-pixel tts extent: ".concat(p3));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new C0009j(parseInt, Integer.parseInt(group2), 4);
        } catch (NumberFormatException unused) {
            AbstractC0123a.A("TtmlParser", "Ignoring malformed tts extent: ".concat(p3));
            return null;
        }
    }

    @Override // T0.l
    public final /* synthetic */ void b() {
    }

    @Override // T0.l
    public final void e(byte[] bArr, int i3, int i4, T0.k kVar, U.d dVar) {
        android.support.v4.media.session.a.Y(r(bArr, i3, i4), kVar, dVar);
    }

    @Override // T0.l
    public final int k() {
        return 1;
    }

    @Override // T0.l
    public final T0.d r(byte[] bArr, int i3, int i4) {
        d dVar;
        try {
            XmlPullParser newPullParser = this.f3564m.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C0009j c0009j = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i3, i4), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            d dVar2 = f3563u;
            int i5 = 15;
            T1.d dVar3 = null;
            int i6 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i6 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            dVar2 = g(newPullParser);
                            i5 = d(newPullParser);
                            c0009j = m(newPullParser);
                        }
                        C0009j c0009j2 = c0009j;
                        d dVar4 = dVar2;
                        int i7 = i5;
                        if (!c(name)) {
                            AbstractC0123a.r("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            i6++;
                            dVar2 = dVar4;
                        } else {
                            if ("head".equals(name)) {
                                dVar = dVar4;
                                h(newPullParser, hashMap, i7, c0009j2, hashMap2, hashMap3);
                            } else {
                                dVar = dVar4;
                                try {
                                    c i8 = i(newPullParser, cVar, hashMap2, dVar);
                                    arrayDeque.push(i8);
                                    if (cVar != null) {
                                        if (cVar.f3552m == null) {
                                            cVar.f3552m = new ArrayList();
                                        }
                                        cVar.f3552m.add(i8);
                                    }
                                } catch (T0.f e2) {
                                    AbstractC0123a.B("TtmlParser", "Suppressing parser error", e2);
                                    i6++;
                                }
                            }
                            dVar2 = dVar;
                        }
                        c0009j = c0009j2;
                        i5 = i7;
                    } else if (eventType == 4) {
                        cVar.getClass();
                        c a3 = c.a(newPullParser.getText());
                        if (cVar.f3552m == null) {
                            cVar.f3552m = new ArrayList();
                        }
                        cVar.f3552m.add(a3);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            c cVar2 = (c) arrayDeque.peek();
                            cVar2.getClass();
                            dVar3 = new T1.d(cVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i6++;
                } else if (eventType == 3) {
                    i6--;
                }
                newPullParser.next();
            }
            dVar3.getClass();
            return dVar3;
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        } catch (XmlPullParserException e4) {
            throw new IllegalStateException("Unable to decode source", e4);
        }
    }
}
