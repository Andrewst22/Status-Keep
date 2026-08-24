package E0;

import D1.F;
import D1.I;
import D1.b0;
import U.AbstractC0123a;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f362a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f363b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f364c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r8 == (-1)) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static E0.c a(java.lang.String r21) {
        /*
            r0 = 0
            r1 = 1
            org.xmlpull.v1.XmlPullParserFactory r2 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r2 = r2.newPullParser()
            java.io.StringReader r3 = new java.io.StringReader
            r4 = r21
            r3.<init>(r4)
            r2.setInput(r3)
            r2.next()
            java.lang.String r3 = "x:xmpmeta"
            boolean r4 = U.AbstractC0123a.u(r2, r3)
            r5 = 0
            if (r4 == 0) goto Lcf
            D1.G r4 = D1.I.f197n
            D1.b0 r4 = D1.b0.f231q
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r6
        L2a:
            r2.next()
            java.lang.String r10 = "rdf:Description"
            boolean r10 = U.AbstractC0123a.u(r2, r10)
            if (r10 == 0) goto L9b
            java.lang.String[] r4 = E0.e.f362a
            r8 = 0
        L38:
            r9 = 4
            if (r8 >= r9) goto L9a
            r10 = r4[r8]
            java.lang.String r10 = U.AbstractC0123a.p(r2, r10)
            if (r10 == 0) goto L98
            int r4 = java.lang.Integer.parseInt(r10)
            if (r4 != r1) goto L9a
            java.lang.String[] r4 = E0.e.f363b
            r8 = 0
        L4c:
            if (r8 >= r9) goto L63
            r10 = r4[r8]
            java.lang.String r10 = U.AbstractC0123a.p(r2, r10)
            if (r10 == 0) goto L61
            long r8 = java.lang.Long.parseLong(r10)
            r10 = -1
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 != 0) goto L64
            goto L63
        L61:
            int r8 = r8 + r1
            goto L4c
        L63:
            r8 = r6
        L64:
            java.lang.String[] r4 = E0.e.f364c
            r10 = 0
        L67:
            r11 = 2
            if (r10 >= r11) goto L93
            r11 = r4[r10]
            java.lang.String r11 = U.AbstractC0123a.p(r2, r11)
            if (r11 == 0) goto L91
            long r13 = java.lang.Long.parseLong(r11)
            E0.b r4 = new E0.b
            r16 = 0
            r18 = 0
            java.lang.String r20 = "image/jpeg"
            r15 = r4
            r15.<init>(r16, r18, r20)
            E0.b r10 = new E0.b
            r15 = 0
            java.lang.String r17 = "video/mp4"
            r12 = r10
            r12.<init>(r13, r15, r17)
            D1.b0 r4 = D1.I.p(r4, r10)
            goto Lbc
        L91:
            int r10 = r10 + r1
            goto L67
        L93:
            D1.G r4 = D1.I.f197n
            D1.b0 r4 = D1.b0.f231q
            goto Lbc
        L98:
            int r8 = r8 + r1
            goto L38
        L9a:
            return r5
        L9b:
            java.lang.String r10 = "Container:Directory"
            boolean r10 = U.AbstractC0123a.u(r2, r10)
            if (r10 == 0) goto Lac
            java.lang.String r4 = "Container"
            java.lang.String r10 = "Item"
            D1.b0 r4 = b(r2, r4, r10)
            goto Lbc
        Lac:
            java.lang.String r10 = "GContainer:Directory"
            boolean r10 = U.AbstractC0123a.u(r2, r10)
            if (r10 == 0) goto Lbc
            java.lang.String r4 = "GContainer"
            java.lang.String r10 = "GContainerItem"
            D1.b0 r4 = b(r2, r4, r10)
        Lbc:
            boolean r10 = U.AbstractC0123a.s(r2, r3)
            if (r10 == 0) goto L2a
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto Lc9
            return r5
        Lc9:
            E0.c r1 = new E0.c
            r1.<init>(r8, r4, r0)
            return r1
        Lcf:
            java.lang.String r0 = "Couldn't find xmp metadata"
            R.H r0 = R.H.a(r5, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.e.a(java.lang.String):E0.c");
    }

    public static b0 b(XmlPullParser xmlPullParser, String str, String str2) {
        long j3;
        long j4;
        F i3 = I.i();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (AbstractC0123a.u(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String p3 = AbstractC0123a.p(xmlPullParser, concat3);
                String p4 = AbstractC0123a.p(xmlPullParser, concat4);
                String p5 = AbstractC0123a.p(xmlPullParser, concat5);
                String p6 = AbstractC0123a.p(xmlPullParser, concat6);
                if (p3 != null && p4 != null) {
                    if (p5 != null) {
                        j3 = Long.parseLong(p5);
                    } else {
                        j3 = 0;
                    }
                    if (p6 != null) {
                        j4 = Long.parseLong(p6);
                    } else {
                        j4 = 0;
                    }
                    i3.a(new b(j3, j4, p3));
                } else {
                    return b0.f231q;
                }
            }
        } while (!AbstractC0123a.s(xmlPullParser, concat2));
        return i3.g();
    }
}
