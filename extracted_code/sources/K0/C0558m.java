package k0;

import D1.C0042v;
import D1.I;
import D1.b0;
import K.C0065t;
import U.AbstractC0123a;
import a0.C0171o;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import b0.C0210d;
import d1.C0255e;
import g2.C0276a;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k.InterfaceC0532n;
import k.MenuC0527i;
import k.SubMenuC0537s;
import l.C0571i;
import l.InterfaceC0574l;
import o0.S;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import q0.InterfaceC0745c;
import s2.C0808g;
import t0.AbstractC0817b;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* renamed from: k0.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0558m implements s0.i, S, InterfaceC0532n, InterfaceC0574l, N2.d, s0.p, InterfaceC0745c, u0.v {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f7631m;

    /* renamed from: n  reason: collision with root package name */
    public Object f7632n;

    public /* synthetic */ C0558m(Object obj, int i3) {
        this.f7631m = i3;
        this.f7632n = obj;
    }

    @Override // o0.S
    public void a() {
        r rVar = (r) this.f7632n;
        rVar.f7655n.post(new RunnableC0560o(rVar, 1));
    }

    @Override // k.InterfaceC0532n
    public void b(MenuC0527i menuC0527i, boolean z3) {
        if (menuC0527i instanceof SubMenuC0537s) {
            ((SubMenuC0537s) menuC0527i).f7495v.j().c(false);
        }
        InterfaceC0532n interfaceC0532n = ((C0571i) this.f7632n).f7843q;
        if (interfaceC0532n != null) {
            interfaceC0532n.b(menuC0527i, z3);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.IOException, A2.b] */
    @Override // s0.i
    public C0255e c(s0.k kVar, long j3, long j4, IOException iOException, int i3) {
        switch (this.f7631m) {
            case 1:
                C0550e c0550e = (C0550e) kVar;
                r rVar = (r) this.f7632n;
                if (!rVar.f7650E) {
                    rVar.f7664w = iOException;
                } else if (iOException.getCause() instanceof BindException) {
                    int i4 = rVar.f7652G;
                    rVar.f7652G = i4 + 1;
                    if (i4 < 3) {
                        return s0.n.f9198p;
                    }
                } else {
                    rVar.x = new IOException(c0550e.f7566n.f7677b.toString(), iOException);
                }
                return s0.n.f9199q;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
            default:
                ((C0210d) this.f7632n).f4544n.z(iOException);
                return s0.n.f9199q;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                w wVar = (w) kVar;
                if (!((y) this.f7632n).f7692r) {
                    C0276a c0276a = ((y) this.f7632n).f7687m;
                }
                return s0.n.f9199q;
        }
    }

    @Override // u0.v
    public void d() {
        u0.l lVar = (u0.l) this.f7632n;
        AbstractC0123a.k(lVar.f9362d1);
        Surface surface = lVar.f9362d1;
        C0171o c0171o = lVar.S0;
        Handler handler = c0171o.f3774b;
        if (handler != null) {
            handler.post(new u0.u(c0171o, surface, SystemClock.elapsedRealtime()));
        }
        lVar.f9364g1 = true;
    }

    @Override // s0.i
    public void e(s0.k kVar, long j3, long j4, boolean z3) {
        switch (this.f7631m) {
            case 1:
                C0550e c0550e = (C0550e) kVar;
                return;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
            default:
                return;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                w wVar = (w) kVar;
                return;
        }
    }

    @Override // u0.v
    public void f() {
        ((u0.l) this.f7632n).G0(0, 1);
    }

    public void g(String str, String str2) {
        String b3 = C0559n.b(str.trim());
        String trim = str2.trim();
        C1.j jVar = (C1.j) this.f7632n;
        jVar.getClass();
        D1.r.d(b3, trim);
        C0042v c0042v = (C0042v) jVar.f168n;
        Collection collection = (Collection) c0042v.get(b3);
        if (collection == null) {
            collection = new ArrayList();
            c0042v.put(b3, collection);
        }
        collection.add(trim);
    }

    public void h(List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            int i4 = U.A.f2405a;
            String[] split = ((String) list.get(i3)).split(":\\s?", 2);
            if (split.length == 2) {
                g(split[0], split[1]);
            }
        }
    }

    public C0559n i() {
        return new C0559n(this);
    }

    @Override // s0.i
    public void j(s0.k kVar, long j3, long j4) {
        boolean z3;
        switch (this.f7631m) {
            case 1:
                C0550e c0550e = (C0550e) kVar;
                r rVar = (r) this.f7632n;
                if (rVar.m() == 0) {
                    if (!rVar.f7653H) {
                        r.y(rVar);
                        return;
                    }
                    return;
                }
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = rVar.f7658q;
                    if (i3 < arrayList.size()) {
                        q qVar = (q) arrayList.get(i3);
                        if (qVar.f7640a.f7637b == c0550e) {
                            qVar.a();
                        } else {
                            i3++;
                        }
                    }
                }
                rVar.f7657p.f7613A = 1;
                return;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
            default:
                C0210d c0210d = (C0210d) this.f7632n;
                synchronized (AbstractC0817b.f9240b) {
                    z3 = AbstractC0817b.f9241c;
                }
                if (!z3) {
                    c0210d.f4544n.z(new IOException(new ConcurrentModificationException()));
                    return;
                }
                c0210d.b();
                return;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                w wVar = (w) kVar;
                return;
        }
    }

    @Override // s0.p
    public Object k(Uri uri, W.j jVar) {
        try {
            XmlPullParser newPullParser = ((XmlPullParserFactory) this.f7632n).newPullParser();
            newPullParser.setInput(jVar, null);
            return (n0.c) new n0.g(uri.toString()).e(newPullParser);
        } catch (XmlPullParserException e2) {
            throw R.H.b(null, e2);
        }
    }

    public void m(A2.b bVar) {
        boolean z3 = bVar instanceof t;
        r rVar = (r) this.f7632n;
        if (z3 && !rVar.f7653H) {
            r.y(rVar);
        } else {
            rVar.x = bVar;
        }
    }

    @Override // k.InterfaceC0532n
    public boolean n(SubMenuC0537s subMenuC0537s) {
        if (subMenuC0537s == null) {
            return false;
        }
        subMenuC0537s.f7496w.getClass();
        C0571i c0571i = (C0571i) this.f7632n;
        c0571i.getClass();
        InterfaceC0532n interfaceC0532n = c0571i.f7843q;
        if (interfaceC0532n == null) {
            return false;
        }
        return interfaceC0532n.n(subMenuC0537s);
    }

    public void o(String str, IOException iOException) {
        IOException iOException2;
        if (iOException == null) {
            iOException2 = new IOException(str);
        } else {
            iOException2 = new IOException(str, iOException);
        }
        ((r) this.f7632n).f7664w = iOException2;
    }

    @Override // N2.d
    public Object x(N2.e eVar, InterfaceC0866d interfaceC0866d) {
        Object x = ((N2.d) this.f7632n).x(new C0065t(eVar, 1), interfaceC0866d);
        if (x == EnumC0879a.f9494m) {
            return x;
        }
        return C0808g.f9229a;
    }

    public C0558m(b0 b0Var) {
        this.f7631m = 4;
        this.f7632n = I.j(b0Var);
    }

    public C0558m(int i3) {
        this.f7631m = i3;
        switch (i3) {
            case 10:
                try {
                    this.f7632n = XmlPullParserFactory.newInstance();
                    return;
                } catch (XmlPullParserException e2) {
                    throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
                }
            case 11:
                this.f7632n = new B1.b(18);
                return;
            case 12:
                this.f7632n = new CopyOnWriteArrayList();
                return;
            case 17:
                return;
            default:
                this.f7632n = new C1.j(2);
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0558m(int i3, String str, String str2) {
        this(0);
        this.f7631m = 0;
        g("User-Agent", str);
        g("CSeq", String.valueOf(i3));
        if (str2 != null) {
            g("Session", str2);
        }
    }

    private final void l(s0.k kVar, long j3, long j4, boolean z3) {
    }
}
