package r1;

import D2.r;
import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import s1.InterfaceC0801a;
import s2.C0806e;
/* renamed from: r1.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0765g {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ C0765g f9020a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C0806e f9021b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0759a f9022c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, r1.g] */
    static {
        r.a(h.class).b();
        f9021b = new C0806e(C0764f.f9019n);
        f9022c = C0759a.f9001a;
    }

    public static C0760b a(Context context) {
        D2.i.e(context, "context");
        InterfaceC0801a interfaceC0801a = (InterfaceC0801a) f9021b.a();
        if (interfaceC0801a == null) {
            u1.j jVar = u1.j.f9452c;
            if (u1.j.f9452c == null) {
                ReentrantLock reentrantLock = u1.j.f9453d;
                reentrantLock.lock();
                try {
                    if (u1.j.f9452c == null) {
                        u1.h hVar = null;
                        try {
                            o1.i c3 = u1.g.c();
                            if (c3 != null) {
                                o1.i iVar = o1.i.f8675r;
                                D2.i.e(iVar, "other");
                                Object a3 = c3.f8680q.a();
                                D2.i.d(a3, "<get-bigInteger>(...)");
                                Object a4 = iVar.f8680q.a();
                                D2.i.d(a4, "<get-bigInteger>(...)");
                                if (((BigInteger) a3).compareTo((BigInteger) a4) >= 0) {
                                    u1.h hVar2 = new u1.h(context);
                                    if (hVar2.i()) {
                                        hVar = hVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        u1.j.f9452c = new u1.j(hVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            interfaceC0801a = u1.j.f9452c;
            D2.i.b(interfaceC0801a);
        }
        int i3 = n.f9033b;
        C0760b c0760b = new C0760b(interfaceC0801a);
        f9022c.getClass();
        return c0760b;
    }
}
