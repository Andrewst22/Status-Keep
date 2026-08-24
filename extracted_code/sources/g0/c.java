package G0;

import C1.d;
import R.F;
import U.s;
import U.t;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class c extends android.support.v4.media.session.a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f377b;

    public static H0.a d0(t tVar) {
        String p3 = tVar.p();
        p3.getClass();
        String p4 = tVar.p();
        p4.getClass();
        return new H0.a(p3, p4, tVar.o(), tVar.o(), Arrays.copyOfRange(tVar.f2477a, tVar.f2478b, tVar.f2479c));
    }

    @Override // android.support.v4.media.session.a
    public final F n(F0.a aVar, ByteBuffer byteBuffer) {
        switch (this.f377b) {
            case 0:
                if (byteBuffer.get() == 116) {
                    s sVar = new s(byteBuffer.array(), byteBuffer.limit());
                    int i3 = 12;
                    sVar.t(12);
                    int f3 = (sVar.f() + sVar.i(12)) - 4;
                    sVar.t(44);
                    sVar.u(sVar.i(12));
                    sVar.t(16);
                    ArrayList arrayList = new ArrayList();
                    while (sVar.f() < f3) {
                        sVar.t(48);
                        int i4 = sVar.i(8);
                        sVar.t(4);
                        int f4 = sVar.f() + sVar.i(i3);
                        String str = null;
                        String str2 = null;
                        while (sVar.f() < f4) {
                            int i5 = sVar.i(8);
                            int i6 = sVar.i(8);
                            int f5 = sVar.f() + i6;
                            if (i5 == 2) {
                                int i7 = sVar.i(16);
                                sVar.t(8);
                                if (i7 == 3) {
                                    while (sVar.f() < f5) {
                                        int i8 = sVar.i(8);
                                        Charset charset = d.f151a;
                                        byte[] bArr = new byte[i8];
                                        sVar.l(bArr, i8);
                                        String str3 = new String(bArr, charset);
                                        int i9 = sVar.i(8);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            sVar.u(sVar.i(8));
                                        }
                                        str = str3;
                                    }
                                }
                            } else if (i5 == 21) {
                                Charset charset2 = d.f151a;
                                byte[] bArr2 = new byte[i6];
                                sVar.l(bArr2, i6);
                                str2 = new String(bArr2, charset2);
                            }
                            sVar.q(f5 * 8);
                        }
                        sVar.q(f4 * 8);
                        if (str != null && str2 != null) {
                            arrayList.add(new b(str.concat(str2), i4));
                        }
                        i3 = 12;
                    }
                    if (!arrayList.isEmpty()) {
                        return new F(arrayList);
                    }
                }
                return null;
            default:
                return new F(d0(new t(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
