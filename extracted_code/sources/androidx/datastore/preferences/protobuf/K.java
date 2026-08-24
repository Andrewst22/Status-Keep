package androidx.datastore.preferences.protobuf;

import a.AbstractC0155a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f4177a;

    static {
        char[] cArr = new char[80];
        f4177a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i3, StringBuilder sb) {
        while (i3 > 0) {
            int i4 = 80;
            if (i3 <= 80) {
                i4 = i3;
            }
            sb.append(f4177a, 0, i4);
            i3 -= i4;
        }
    }

    public static void b(StringBuilder sb, int i3, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                b(sb, i3, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                b(sb, i3, str, entry);
            }
        } else {
            sb.append('\n');
            a(i3, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i4 = 1; i4 < str.length(); i4++) {
                    char charAt = str.charAt(i4);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                C0184g c0184g = C0184g.f4242o;
                sb.append(AbstractC0155a.y(new C0184g(((String) obj).getBytes(AbstractC0199w.f4313a))));
                sb.append('\"');
            } else if (obj instanceof C0184g) {
                sb.append(": \"");
                sb.append(AbstractC0155a.y((C0184g) obj));
                sb.append('\"');
            } else if (obj instanceof AbstractC0197u) {
                sb.append(" {");
                c((AbstractC0197u) obj, sb, i3 + 2);
                sb.append("\n");
                a(i3, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i5 = i3 + 2;
                b(sb, i5, "key", entry2.getKey());
                b(sb, i5, "value", entry2.getValue());
                sb.append("\n");
                a(i3, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0195, code lost:
        if (((java.lang.Integer) r7).intValue() == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0197, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a8, code lost:
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01be, code lost:
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(androidx.datastore.preferences.protobuf.AbstractC0197u r20, java.lang.StringBuilder r21, int r22) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.K.c(androidx.datastore.preferences.protobuf.u, java.lang.StringBuilder, int):void");
    }
}
