package w2;

import K2.C0077f;
import P2.AbstractC0097a;
import P2.h;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l.a0;
import n2.AbstractC0664g;
import u2.C0867e;
import u2.InterfaceC0866d;
import u2.InterfaceC0868f;
import u2.InterfaceC0869g;
import u2.i;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public abstract class b implements InterfaceC0866d, c, Serializable {

    /* renamed from: m  reason: collision with root package name */
    public final InterfaceC0866d f9664m;

    /* renamed from: n  reason: collision with root package name */
    public final i f9665n;

    /* renamed from: o  reason: collision with root package name */
    public transient InterfaceC0866d f9666o;

    public b(InterfaceC0866d interfaceC0866d, i iVar) {
        this.f9664m = interfaceC0866d;
        this.f9665n = iVar;
    }

    public InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public c e() {
        InterfaceC0866d interfaceC0866d = this.f9664m;
        if (interfaceC0866d instanceof c) {
            return (c) interfaceC0866d;
        }
        return null;
    }

    @Override // u2.InterfaceC0866d
    public i h() {
        i iVar = this.f9665n;
        D2.i.b(iVar);
        return iVar;
    }

    public StackTraceElement j() {
        int i3;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int i4;
        d dVar = (d) getClass().getAnnotation(d.class);
        String str2 = null;
        if (dVar == null) {
            return null;
        }
        int v3 = dVar.v();
        if (v3 <= 1) {
            int i5 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(this);
                if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                } else {
                    num = null;
                }
                if (num != null) {
                    i4 = num.intValue();
                } else {
                    i4 = 0;
                }
                i3 = i4 - 1;
            } catch (Exception unused) {
                i3 = -1;
            }
            if (i3 >= 0) {
                i5 = dVar.l()[i3];
            }
            a0 a0Var = e.f9668b;
            a0 a0Var2 = e.f9667a;
            if (a0Var == null) {
                try {
                    a0 a0Var3 = new a0(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    e.f9668b = a0Var3;
                    a0Var = a0Var3;
                } catch (Exception unused2) {
                    e.f9668b = a0Var2;
                    a0Var = a0Var2;
                }
            }
            if (a0Var != a0Var2 && (method = a0Var.f7793a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = a0Var.f7794b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = a0Var.f7795c;
                if (method3 != null) {
                    obj = method3.invoke(invoke2, null);
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str2 = obj;
                }
            }
            if (str2 == null) {
                str = dVar.c();
            } else {
                str = str2 + '/' + dVar.c();
            }
            return new StackTraceElement(str, dVar.m(), dVar.f(), i5);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v3 + ". Please update the Kotlin standard library.").toString());
    }

    @Override // u2.InterfaceC0866d
    public final void k(Object obj) {
        InterfaceC0866d interfaceC0866d = this;
        while (true) {
            b bVar = (b) interfaceC0866d;
            InterfaceC0866d interfaceC0866d2 = bVar.f9664m;
            D2.i.b(interfaceC0866d2);
            try {
                obj = bVar.n(obj);
                if (obj == EnumC0879a.f9494m) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC0664g.f(th);
            }
            bVar.o();
            if (interfaceC0866d2 instanceof b) {
                interfaceC0866d = interfaceC0866d2;
            } else {
                interfaceC0866d2.k(obj);
                return;
            }
        }
    }

    public abstract Object n(Object obj);

    public void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0077f c0077f;
        InterfaceC0866d interfaceC0866d = this.f9666o;
        if (interfaceC0866d != null && interfaceC0866d != this) {
            InterfaceC0869g d3 = h().d(C0867e.f9460m);
            D2.i.b(d3);
            InterfaceC0868f interfaceC0868f = (InterfaceC0868f) d3;
            h hVar = (h) interfaceC0866d;
            do {
                atomicReferenceFieldUpdater = h.f1483t;
            } while (atomicReferenceFieldUpdater.get(hVar) == AbstractC0097a.f1473d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            if (obj instanceof C0077f) {
                c0077f = (C0077f) obj;
            } else {
                c0077f = null;
            }
            if (c0077f != null) {
                c0077f.r();
            }
        }
        this.f9666o = a.f9663m;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object j3 = j();
        if (j3 == null) {
            j3 = getClass().getName();
        }
        sb.append(j3);
        return sb.toString();
    }

    public b(InterfaceC0866d interfaceC0866d) {
        this(interfaceC0866d, interfaceC0866d != null ? interfaceC0866d.h() : null);
    }
}
