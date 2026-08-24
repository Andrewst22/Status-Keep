package e0;

import D1.I;
import D1.b0;
import R.C0112o;
import R.H;
import U.y;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w0.G;
/* loaded from: classes.dex */
public final class w implements w0.o {

    /* renamed from: i  reason: collision with root package name */
    public static final Pattern f5392i = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f5393j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a  reason: collision with root package name */
    public final String f5394a;

    /* renamed from: b  reason: collision with root package name */
    public final y f5395b;

    /* renamed from: d  reason: collision with root package name */
    public final B1.b f5397d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5398e;

    /* renamed from: f  reason: collision with root package name */
    public w0.q f5399f;

    /* renamed from: h  reason: collision with root package name */
    public int f5401h;

    /* renamed from: c  reason: collision with root package name */
    public final U.t f5396c = new U.t();

    /* renamed from: g  reason: collision with root package name */
    public byte[] f5400g = new byte[1024];

    public w(String str, y yVar, B1.b bVar, boolean z3) {
        this.f5394a = str;
        this.f5395b = yVar;
        this.f5397d = bVar;
        this.f5398e = z3;
    }

    public final G a(long j3) {
        G w3 = this.f5399f.w(0, 3);
        C0112o c0112o = new C0112o();
        c0112o.f1937l = R.G.l("text/vtt");
        c0112o.f1929d = this.f5394a;
        c0112o.f1942q = j3;
        D2.h.p(c0112o, w3);
        this.f5399f.s();
        return w3;
    }

    @Override // w0.o
    public final void b(long j3, long j4) {
        throw new IllegalStateException();
    }

    @Override // w0.o
    public final w0.o d() {
        return this;
    }

    @Override // w0.o
    public final boolean e(w0.p pVar) {
        w0.l lVar = (w0.l) pVar;
        lVar.p(this.f5400g, 0, 6, false);
        byte[] bArr = this.f5400g;
        U.t tVar = this.f5396c;
        tVar.E(bArr, 6);
        if (b1.j.a(tVar)) {
            return true;
        }
        lVar.p(this.f5400g, 6, 3, false);
        tVar.E(this.f5400g, 9);
        return b1.j.a(tVar);
    }

    @Override // w0.o
    public final int f(w0.p pVar, R.r rVar) {
        String i3;
        int length;
        this.f5399f.getClass();
        int i4 = (int) ((w0.l) pVar).f9607o;
        int i5 = this.f5401h;
        byte[] bArr = this.f5400g;
        if (i5 == bArr.length) {
            if (i4 != -1) {
                length = i4;
            } else {
                length = bArr.length;
            }
            this.f5400g = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.f5400g;
        int i6 = this.f5401h;
        int read = ((w0.l) pVar).read(bArr2, i6, bArr2.length - i6);
        if (read != -1) {
            int i7 = this.f5401h + read;
            this.f5401h = i7;
            if (i4 == -1 || i7 != i4) {
                return 0;
            }
        }
        U.t tVar = new U.t(this.f5400g);
        b1.j.d(tVar);
        String i8 = tVar.i(C1.d.f153c);
        long j3 = 0;
        long j4 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(i8)) {
                if (i8.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f5392i.matcher(i8);
                    if (matcher2.find()) {
                        Matcher matcher3 = f5393j.matcher(i8);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j4 = b1.j.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            j3 = (Long.parseLong(group2) * 1000000) / 90000;
                        } else {
                            throw H.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(i8));
                        }
                    } else {
                        throw H.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(i8));
                    }
                }
                i8 = tVar.i(C1.d.f153c);
            } else {
                while (true) {
                    String i9 = tVar.i(C1.d.f153c);
                    if (i9 == null) {
                        break;
                    } else if (b1.j.f4683a.matcher(i9).matches()) {
                        do {
                            i3 = tVar.i(C1.d.f153c);
                            if (i3 != null) {
                            }
                        } while (!i3.isEmpty());
                    } else {
                        Matcher matcher4 = b1.i.f4679a.matcher(i9);
                        if (matcher4.matches()) {
                            matcher = matcher4;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    a(0L);
                    return -1;
                }
                String group3 = matcher.group(1);
                group3.getClass();
                long c3 = b1.j.c(group3);
                long b3 = this.f5395b.b(((((j3 + c3) - j4) * 90000) / 1000000) % 8589934592L);
                G a3 = a(b3 - c3);
                byte[] bArr3 = this.f5400g;
                int i10 = this.f5401h;
                U.t tVar2 = this.f5396c;
                tVar2.E(bArr3, i10);
                a3.f(this.f5401h, tVar2);
                a3.b(b3, 1, this.f5401h, 0, null);
                return -1;
            }
        }
    }

    @Override // w0.o
    public final void h(w0.q qVar) {
        w0.q qVar2;
        if (this.f5398e) {
            qVar2 = new B1.e(qVar, this.f5397d);
        } else {
            qVar2 = qVar;
        }
        this.f5399f = qVar2;
        qVar.n(new w0.s(-9223372036854775807L));
    }

    @Override // w0.o
    public final List l() {
        D1.G g3 = I.f197n;
        return b0.f231q;
    }

    @Override // w0.o
    public final void release() {
    }
}
