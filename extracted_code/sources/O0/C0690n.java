package o0;

import R.C0112o;
import R.C0113p;
import R.C0115s;
import R.C0116t;
import R.C0117u;
import R.C0118v;
import R.C0119w;
import R.C0120x;
import R.C0121y;
import R.C0122z;
import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: o0.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0690n implements InterfaceC0700y {

    /* renamed from: a  reason: collision with root package name */
    public final a0.C f8619a;

    /* renamed from: b  reason: collision with root package name */
    public B1.a f8620b;

    /* renamed from: c  reason: collision with root package name */
    public final long f8621c;

    /* renamed from: d  reason: collision with root package name */
    public final long f8622d;

    /* renamed from: e  reason: collision with root package name */
    public final long f8623e;

    /* renamed from: f  reason: collision with root package name */
    public final float f8624f;

    /* renamed from: g  reason: collision with root package name */
    public final float f8625g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8626h;

    public C0690n(Context context) {
        this(new B1.a(context, 8), new w0.m());
    }

    public static InterfaceC0700y d(Class cls, B1.a aVar) {
        try {
            return (InterfaceC0700y) cls.getConstructor(W.g.class).newInstance(aVar);
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // o0.InterfaceC0700y
    public final InterfaceC0700y a(boolean z3) {
        this.f8626h = z3;
        a0.C c3 = this.f8619a;
        c3.f3603a = z3;
        w0.m mVar = (w0.m) c3.f3604b;
        synchronized (mVar) {
            mVar.f9616b = z3;
        }
        for (InterfaceC0700y interfaceC0700y : ((HashMap) c3.f3606d).values()) {
            interfaceC0700y.a(z3);
        }
        return this;
    }

    @Override // o0.InterfaceC0700y
    public final InterfaceC0700y b(B1.b bVar) {
        a0.C c3 = this.f8619a;
        c3.f3608f = bVar;
        w0.m mVar = (w0.m) c3.f3604b;
        synchronized (mVar) {
            mVar.f9617c = bVar;
        }
        for (InterfaceC0700y interfaceC0700y : ((HashMap) c3.f3606d).values()) {
            interfaceC0700y.b(bVar);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [R.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [R.s, R.t] */
    /* JADX WARN: Type inference failed for: r7v1, types: [D1.I] */
    @Override // o0.InterfaceC0700y
    public final AbstractC0677a c(C0122z c0122z) {
        List list;
        Uri uri;
        String str;
        D1.b0 b0Var;
        long j3;
        C0119w c0119w;
        C0122z c0122z2 = c0122z;
        c0122z2.f2008b.getClass();
        String scheme = c0122z2.f2008b.f2001a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(c0122z2.f2008b.f2002b, "application/x-image-uri")) {
            C0119w c0119w2 = c0122z2.f2008b;
            int G3 = U.A.G(c0119w2.f2001a, c0119w2.f2002b);
            if (c0122z2.f2008b.f2005e != -9223372036854775807L) {
                w0.m mVar = (w0.m) this.f8619a.f3604b;
                synchronized (mVar) {
                    mVar.f9618d = 1;
                }
            }
            try {
                a0.C c3 = this.f8619a;
                HashMap hashMap = (HashMap) c3.f3606d;
                InterfaceC0700y interfaceC0700y = (InterfaceC0700y) hashMap.get(Integer.valueOf(G3));
                if (interfaceC0700y == null) {
                    interfaceC0700y = (InterfaceC0700y) c3.a(G3).get();
                    interfaceC0700y.b((B1.b) c3.f3608f);
                    interfaceC0700y.a(c3.f3603a);
                    hashMap.put(Integer.valueOf(G3), interfaceC0700y);
                }
                C0117u a3 = c0122z2.f2009c.a();
                C0118v c0118v = c0122z2.f2009c;
                if (c0118v.f1996a == -9223372036854775807L) {
                    a3.f1991a = this.f8621c;
                }
                if (c0118v.f1999d == -3.4028235E38f) {
                    a3.f1994d = this.f8624f;
                }
                if (c0118v.f2000e == -3.4028235E38f) {
                    a3.f1995e = this.f8625g;
                }
                if (c0118v.f1997b == -9223372036854775807L) {
                    a3.f1992b = this.f8622d;
                }
                if (c0118v.f1998c == -9223372036854775807L) {
                    a3.f1993c = this.f8623e;
                }
                C0118v c0118v2 = new C0118v(a3);
                if (!c0118v2.equals(c0122z2.f2009c)) {
                    new B1.b();
                    List emptyList = Collections.emptyList();
                    D1.b0 b0Var2 = D1.b0.f231q;
                    C0120x c0120x = C0120x.f2006a;
                    C0116t c0116t = c0122z2.f2011e;
                    ?? obj = new Object();
                    obj.f1989a = c0116t.f1990a;
                    String str2 = c0122z2.f2007a;
                    R.C c4 = c0122z2.f2010d;
                    c0122z2.f2009c.a();
                    C0120x c0120x2 = c0122z2.f2012f;
                    C0119w c0119w3 = c0122z2.f2008b;
                    if (c0119w3 != null) {
                        String str3 = c0119w3.f2002b;
                        Uri uri2 = c0119w3.f2001a;
                        List list2 = c0119w3.f2003c;
                        ?? r7 = c0119w3.f2004d;
                        D1.G g3 = D1.I.f197n;
                        D1.b0 b0Var3 = D1.b0.f231q;
                        str = str3;
                        uri = uri2;
                        list = list2;
                        b0Var = r7;
                        j3 = c0119w3.f2005e;
                    } else {
                        list = emptyList;
                        uri = null;
                        str = null;
                        b0Var = b0Var2;
                        j3 = -9223372036854775807L;
                    }
                    C0117u a4 = c0118v2.a();
                    if (uri != null) {
                        c0119w = new C0119w(uri, str, null, list, b0Var, j3);
                    } else {
                        c0119w = null;
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str4 = str2;
                    ?? c0115s = new C0115s(obj);
                    C0118v c0118v3 = new C0118v(a4);
                    if (c4 == null) {
                        c4 = R.C.f1745y;
                    }
                    c0122z2 = new C0122z(str4, c0115s, c0119w, c0118v3, c4, c0120x2);
                }
                AbstractC0677a c5 = interfaceC0700y.c(c0122z2);
                D1.I i3 = c0122z2.f2008b.f2004d;
                if (!i3.isEmpty()) {
                    AbstractC0677a[] abstractC0677aArr = new AbstractC0677a[i3.size() + 1];
                    abstractC0677aArr[0] = c5;
                    if (i3.size() > 0) {
                        if (this.f8626h) {
                            C0112o c0112o = new C0112o();
                            ((C0121y) i3.get(0)).getClass();
                            ArrayList arrayList = R.G.f1772a;
                            c0112o.f1937l = null;
                            ((C0121y) i3.get(0)).getClass();
                            c0112o.f1929d = null;
                            ((C0121y) i3.get(0)).getClass();
                            c0112o.f1930e = 0;
                            ((C0121y) i3.get(0)).getClass();
                            c0112o.f1931f = 0;
                            ((C0121y) i3.get(0)).getClass();
                            c0112o.f1927b = null;
                            ((C0121y) i3.get(0)).getClass();
                            c0112o.f1926a = null;
                            new C0113p(c0112o);
                            ((C0121y) i3.get(0)).getClass();
                            throw null;
                        }
                        this.f8620b.getClass();
                        new ArrayList(1);
                        new HashSet(1);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        D1.G g4 = D1.I.f197n;
                        D1.b0 b0Var4 = D1.b0.f231q;
                        Collections.emptyList();
                        D1.b0 b0Var5 = D1.b0.f231q;
                        C0120x c0120x3 = C0120x.f2006a;
                        Uri uri3 = Uri.EMPTY;
                        ((C0121y) i3.get(0)).getClass();
                        throw null;
                    }
                    c5 = new G(abstractC0677aArr);
                }
                long j4 = c0122z2.f2011e.f1990a;
                C0683g c0683g = c5;
                if (j4 != Long.MIN_VALUE) {
                    c0683g = new C0683g(c5, j4, true);
                }
                c0122z2.f2008b.getClass();
                c0122z2.f2008b.getClass();
                return c0683g;
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException(e2);
            }
        }
        long j5 = c0122z2.f2008b.f2005e;
        int i4 = U.A.f2405a;
        throw null;
    }

    public C0690n(B1.a aVar, w0.m mVar) {
        this.f8620b = aVar;
        a0.C c3 = new a0.C(mVar, new B1.b(18));
        this.f8619a = c3;
        if (aVar != ((B1.a) c3.f3607e)) {
            c3.f3607e = aVar;
            ((HashMap) c3.f3605c).clear();
            ((HashMap) c3.f3606d).clear();
        }
        this.f8621c = -9223372036854775807L;
        this.f8622d = -9223372036854775807L;
        this.f8623e = -9223372036854775807L;
        this.f8624f = -3.4028235E38f;
        this.f8625g = -3.4028235E38f;
        this.f8626h = true;
    }
}
