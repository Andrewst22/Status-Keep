package J0;

import C1.d;
import R.F;
import a.AbstractC0155a;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class a extends android.support.v4.media.session.a {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f483d = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: b  reason: collision with root package name */
    public final CharsetDecoder f484b = d.f153c.newDecoder();

    /* renamed from: c  reason: collision with root package name */
    public final CharsetDecoder f485c = d.f152b.newDecoder();

    @Override // android.support.v4.media.session.a
    public final F n(F0.a aVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f485c;
        CharsetDecoder charsetDecoder2 = this.f484b;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new F(new c(null, null, bArr));
        }
        Matcher matcher = f483d.matcher(str);
        String str3 = null;
        for (int i3 = 0; matcher.find(i3); i3 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String L = AbstractC0155a.L(group);
                L.getClass();
                if (!L.equals("streamurl")) {
                    if (L.equals("streamtitle")) {
                        str2 = group2;
                    }
                } else {
                    str3 = group2;
                }
            }
        }
        return new F(new c(str2, str3, bArr));
    }
}
