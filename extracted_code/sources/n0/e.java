package n0;

import Q0.t;
import Q0.v;
import android.util.Base64;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: e  reason: collision with root package name */
    public boolean f8371e;

    /* renamed from: f  reason: collision with root package name */
    public UUID f8372f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f8373g;

    @Override // n0.d
    public final Object b() {
        UUID uuid = this.f8372f;
        byte[] a3 = t.a(uuid, null, this.f8373g);
        byte[] bArr = this.f8373g;
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < bArr.length; i3 += 2) {
            sb.append((char) bArr[i3]);
        }
        String sb2 = sb.toString();
        byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
        byte b3 = decode[0];
        decode[0] = decode[3];
        decode[3] = b3;
        byte b4 = decode[1];
        decode[1] = decode[2];
        decode[2] = b4;
        byte b5 = decode[4];
        decode[4] = decode[5];
        decode[5] = b5;
        byte b6 = decode[6];
        decode[6] = decode[7];
        decode[7] = b6;
        return new C0656a(uuid, a3, new v[]{new v(true, null, 8, decode, 0, 0, null)});
    }

    @Override // n0.d
    public final boolean d(String str) {
        return "ProtectionHeader".equals(str);
    }

    @Override // n0.d
    public final void f(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f8371e = false;
        }
    }

    @Override // n0.d
    public final void j(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f8371e = true;
            String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
            if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
            }
            this.f8372f = UUID.fromString(attributeValue);
        }
    }

    @Override // n0.d
    public final void k(XmlPullParser xmlPullParser) {
        if (this.f8371e) {
            this.f8373g = Base64.decode(xmlPullParser.getText(), 0);
        }
    }
}
