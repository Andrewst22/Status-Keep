package n0;

import R.C0112o;
import R.C0113p;
import R.G;
import java.util.ArrayList;
import java.util.Collections;
import org.xmlpull.v1.XmlPullParser;
import w0.AbstractC0892b;
/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: e  reason: collision with root package name */
    public C0113p f8374e;

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0050, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList m(java.lang.String r11) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 != 0) goto L94
            byte[] r11 = U.A.t(r11)
            int r1 = r11.length
            r2 = 4
            if (r1 > r2) goto L14
            goto L20
        L14:
            r1 = 0
            r3 = 0
        L16:
            byte[] r4 = U.AbstractC0123a.f2421a
            if (r3 >= r2) goto L26
            r5 = r11[r3]
            r4 = r4[r3]
            if (r5 == r4) goto L23
        L20:
            r1 = 0
            goto L8b
        L23:
            int r3 = r3 + 1
            goto L16
        L26:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5 = 0
        L2c:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3.add(r6)
            int r5 = r5 + r2
            int r6 = r11.length
            int r6 = r6 - r2
        L36:
            r7 = -1
            if (r5 > r6) goto L4f
            int r8 = r11.length
            int r8 = r8 - r5
            if (r8 > r2) goto L3e
            goto L49
        L3e:
            r8 = 0
        L3f:
            if (r8 >= r2) goto L50
            int r9 = r5 + r8
            r9 = r11[r9]
            r10 = r4[r8]
            if (r9 == r10) goto L4c
        L49:
            int r5 = r5 + 1
            goto L36
        L4c:
            int r8 = r8 + 1
            goto L3f
        L4f:
            r5 = -1
        L50:
            if (r5 != r7) goto L2c
            int r2 = r3.size()
            byte[][] r2 = new byte[r2]
            r4 = 0
        L59:
            int r5 = r3.size()
            if (r4 >= r5) goto L8a
            java.lang.Object r5 = r3.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r6 = r3.size()
            int r6 = r6 + (-1)
            if (r4 >= r6) goto L7e
            int r6 = r4 + 1
            java.lang.Object r6 = r3.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            goto L7f
        L7e:
            int r6 = r11.length
        L7f:
            int r6 = r6 - r5
            byte[] r7 = new byte[r6]
            java.lang.System.arraycopy(r11, r5, r7, r1, r6)
            r2[r4] = r7
            int r4 = r4 + 1
            goto L59
        L8a:
            r1 = r2
        L8b:
            if (r1 != 0) goto L91
            r0.add(r11)
            goto L94
        L91:
            java.util.Collections.addAll(r0, r1)
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.f.m(java.lang.String):java.util.ArrayList");
    }

    @Override // n0.d
    public final Object b() {
        return this.f8374e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    @Override // n0.d
    public final void j(XmlPullParser xmlPullParser) {
        String str;
        int i3;
        C0112o c0112o = new C0112o();
        String attributeValue = xmlPullParser.getAttributeValue(null, "FourCC");
        if (attributeValue != null) {
            if (!attributeValue.equalsIgnoreCase("H264") && !attributeValue.equalsIgnoreCase("X264") && !attributeValue.equalsIgnoreCase("AVC1") && !attributeValue.equalsIgnoreCase("DAVC")) {
                if (attributeValue.equalsIgnoreCase("AAC") || attributeValue.equalsIgnoreCase("AACL") || attributeValue.equalsIgnoreCase("AACH") || attributeValue.equalsIgnoreCase("AACP")) {
                    str = "audio/mp4a-latm";
                } else if (!attributeValue.equalsIgnoreCase("TTML") && !attributeValue.equalsIgnoreCase("DFXP")) {
                    if (!attributeValue.equalsIgnoreCase("ac-3") && !attributeValue.equalsIgnoreCase("dac3")) {
                        if (!attributeValue.equalsIgnoreCase("ec-3") && !attributeValue.equalsIgnoreCase("dec3")) {
                            if (attributeValue.equalsIgnoreCase("dtsc")) {
                                str = "audio/vnd.dts";
                            } else if (!attributeValue.equalsIgnoreCase("dtsh") && !attributeValue.equalsIgnoreCase("dtsl")) {
                                if (attributeValue.equalsIgnoreCase("dtse")) {
                                    str = "audio/vnd.dts.hd;profile=lbr";
                                } else if (attributeValue.equalsIgnoreCase("opus")) {
                                    str = "audio/opus";
                                } else {
                                    str = null;
                                }
                            } else {
                                str = "audio/vnd.dts.hd";
                            }
                        } else {
                            str = "audio/eac3";
                        }
                    } else {
                        str = "audio/ac3";
                    }
                } else {
                    str = "application/ttml+xml";
                }
            } else {
                str = "video/avc";
            }
            int intValue = ((Integer) c("Type")).intValue();
            if (intValue == 2) {
                ArrayList m3 = m(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                c0112o.f1936k = G.l("video/mp4");
                c0112o.f1943r = d.i(xmlPullParser, "MaxWidth");
                c0112o.f1944s = d.i(xmlPullParser, "MaxHeight");
                c0112o.f1940o = m3;
            } else if (intValue == 1) {
                if (str == null) {
                    str = "audio/mp4a-latm";
                }
                int i4 = d.i(xmlPullParser, "Channels");
                int i5 = d.i(xmlPullParser, "SamplingRate");
                ArrayList m4 = m(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                boolean isEmpty = m4.isEmpty();
                ArrayList arrayList = m4;
                if (isEmpty) {
                    arrayList = m4;
                    if ("audio/mp4a-latm".equals(str)) {
                        arrayList = Collections.singletonList(AbstractC0892b.a(i5, i4));
                    }
                }
                c0112o.f1936k = G.l("audio/mp4");
                c0112o.f1950z = i4;
                c0112o.f1917A = i5;
                c0112o.f1940o = arrayList;
            } else if (intValue == 3) {
                String str2 = (String) c("Subtype");
                if (str2 != null) {
                    if (!str2.equals("CAPT")) {
                        if (str2.equals("DESC")) {
                            i3 = 1024;
                        }
                    } else {
                        i3 = 64;
                    }
                    c0112o.f1936k = G.l("application/mp4");
                    c0112o.f1931f = i3;
                }
                i3 = 0;
                c0112o.f1936k = G.l("application/mp4");
                c0112o.f1931f = i3;
            } else {
                c0112o.f1936k = G.l("application/mp4");
            }
            c0112o.f1926a = xmlPullParser.getAttributeValue(null, "Index");
            c0112o.f1927b = (String) c("Name");
            c0112o.f1937l = G.l(str);
            c0112o.f1932g = d.i(xmlPullParser, "Bitrate");
            c0112o.f1929d = (String) c("Language");
            this.f8374e = new C0113p(c0112o);
            return;
        }
        throw new C0.d("FourCC", 1);
    }
}
