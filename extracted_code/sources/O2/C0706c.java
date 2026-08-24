package o2;

import B1.b;
import D1.b0;
import R.C;
import R.C0115s;
import R.C0117u;
import R.C0118v;
import R.C0119w;
import R.C0120x;
import R.C0122z;
import R.r;
import android.content.Context;
import android.net.Uri;
import e0.l;
import java.util.Collections;
import java.util.List;
import javax.net.SocketFactory;
import k0.u;
import o0.AbstractC0677a;
import o0.C0690n;
import o0.InterfaceC0700y;
/* renamed from: o2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0706c extends C0.e {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8687b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0706c(String str, int i3) {
        super(str);
        this.f8687b = i3;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [R.s, R.t] */
    /* JADX WARN: Type inference failed for: r10v2, types: [R.s, R.t] */
    @Override // C0.e
    public final C0122z e() {
        Uri parse;
        C0119w c0119w;
        Uri parse2;
        C0119w c0119w2;
        switch (this.f8687b) {
            case 0:
                r rVar = new r();
                new B1.b();
                List emptyList = Collections.emptyList();
                b0 b0Var = b0.f231q;
                C0117u c0117u = new C0117u();
                C0120x c0120x = C0120x.f2006a;
                String str = (String) this.f142a;
                if (str == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(str);
                }
                Uri uri = parse;
                if (uri != null) {
                    c0119w = new C0119w(uri, null, null, emptyList, b0Var, -9223372036854775807L);
                } else {
                    c0119w = null;
                }
                return new C0122z("", new C0115s(rVar), c0119w, new C0118v(c0117u), C.f1745y, c0120x);
            default:
                r rVar2 = new r();
                new B1.b();
                List emptyList2 = Collections.emptyList();
                b0 b0Var2 = b0.f231q;
                C0117u c0117u2 = new C0117u();
                C0120x c0120x2 = C0120x.f2006a;
                String str2 = (String) this.f142a;
                if (str2 == null) {
                    parse2 = null;
                } else {
                    parse2 = Uri.parse(str2);
                }
                Uri uri2 = parse2;
                if (uri2 != null) {
                    c0119w2 = new C0119w(uri2, null, null, emptyList2, b0Var2, -9223372036854775807L);
                } else {
                    c0119w2 = null;
                }
                return new C0122z("", new C0115s(rVar2), c0119w2, new C0118v(c0117u2), C.f1745y, c0120x2);
        }
    }

    @Override // C0.e
    public final InterfaceC0700y f(Context context) {
        switch (this.f8687b) {
            case 0:
                return new C0690n(context);
            default:
                return new InterfaceC0700y() { // from class: androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory

                    /* renamed from: a  reason: collision with root package name */
                    public final SocketFactory f4396a = SocketFactory.getDefault();

                    @Override // o0.InterfaceC0700y
                    public final InterfaceC0700y a(boolean z3) {
                        return this;
                    }

                    @Override // o0.InterfaceC0700y
                    public final InterfaceC0700y b(b bVar) {
                        return this;
                    }

                    @Override // o0.InterfaceC0700y
                    public final AbstractC0677a c(C0122z c0122z) {
                        c0122z.f2008b.getClass();
                        return new u(c0122z, new l(20), this.f4396a);
                    }
                };
        }
    }
}
