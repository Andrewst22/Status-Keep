package O;

import C2.l;
import D2.j;
import java.util.Map;
/* loaded from: classes.dex */
public final class a extends j implements l {

    /* renamed from: n  reason: collision with root package name */
    public static final a f1183n = new j(1);

    @Override // C2.l
    public final Object b(Object obj) {
        String valueOf;
        Map.Entry entry = (Map.Entry) obj;
        D2.i.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            D2.i.e(bArr, "<this>");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int i3 = 0;
            for (byte b3 : bArr) {
                i3++;
                if (i3 > 1) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) String.valueOf((int) b3));
            }
            sb.append((CharSequence) "]");
            valueOf = sb.toString();
        } else {
            valueOf = String.valueOf(entry.getValue());
        }
        return "  " + ((e) entry.getKey()).f1191a + " = " + valueOf;
    }
}
