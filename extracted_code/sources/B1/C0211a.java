package b1;

import C.C0002c;
import R.F;
import T0.k;
import T0.l;
import U.A;
import U.AbstractC0123a;
import U.t;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
/* renamed from: b1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211a implements l {

    /* renamed from: m  reason: collision with root package name */
    public final t f4635m;

    public C0211a(int i3) {
        switch (i3) {
            case 1:
                this.f4635m = new t(10);
                return;
            default:
                this.f4635m = new t();
                return;
        }
    }

    public F a(w0.l lVar, C0002c c0002c) {
        t tVar = this.f4635m;
        F f3 = null;
        int i3 = 0;
        while (true) {
            try {
                lVar.p(tVar.f2477a, 0, 10, false);
                tVar.G(0);
                if (tVar.x() != 4801587) {
                    break;
                }
                tVar.H(3);
                int t3 = tVar.t();
                int i4 = t3 + 10;
                if (f3 == null) {
                    byte[] bArr = new byte[i4];
                    System.arraycopy(tVar.f2477a, 0, bArr, 0, 10);
                    lVar.p(bArr, 10, t3, false);
                    f3 = new K0.h(c0002c).d0(bArr, i4);
                } else {
                    lVar.a(t3, false);
                }
                i3 += i4;
            } catch (EOFException unused) {
            }
        }
        lVar.f9610r = 0;
        lVar.a(i3, false);
        return f3;
    }

    @Override // T0.l
    public /* synthetic */ void b() {
    }

    @Override // T0.l
    public void e(byte[] bArr, int i3, int i4, k kVar, U.d dVar) {
        boolean z3;
        T.b a3;
        boolean z4;
        t tVar = this.f4635m;
        tVar.E(bArr, i3 + i4);
        tVar.G(i3);
        ArrayList arrayList = new ArrayList();
        while (tVar.a() > 0) {
            if (tVar.a() >= 8) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0123a.d("Incomplete Mp4Webvtt Top Level box header found.", z3);
            int h3 = tVar.h();
            if (tVar.h() == 1987343459) {
                int i5 = h3 - 8;
                CharSequence charSequence = null;
                T.a aVar = null;
                while (i5 > 0) {
                    if (i5 >= 8) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    AbstractC0123a.d("Incomplete vtt cue box header found.", z4);
                    int h4 = tVar.h();
                    int h5 = tVar.h();
                    int i6 = h4 - 8;
                    byte[] bArr2 = tVar.f2477a;
                    int i7 = tVar.f2478b;
                    int i8 = A.f2405a;
                    String str = new String(bArr2, i7, i6, C1.d.f153c);
                    tVar.H(i6);
                    i5 = (i5 - 8) - i6;
                    if (h5 == 1937011815) {
                        h hVar = new h();
                        i.e(str, hVar);
                        aVar = hVar.a();
                    } else if (h5 == 1885436268) {
                        charSequence = i.f(null, str.trim(), Collections.emptyList());
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.f2228a = charSequence;
                    a3 = aVar.a();
                } else {
                    Pattern pattern = i.f4679a;
                    h hVar2 = new h();
                    hVar2.f4670c = charSequence;
                    a3 = hVar2.a().a();
                }
                arrayList.add(a3);
            } else {
                tVar.H(h3 - 8);
            }
        }
        dVar.accept(new T0.a(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // T0.l
    public int k() {
        return 2;
    }

    @Override // T0.l
    public /* synthetic */ T0.d r(byte[] bArr, int i3, int i4) {
        return D2.h.a(this, bArr, i4);
    }
}
