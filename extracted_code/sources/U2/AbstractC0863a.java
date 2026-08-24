package u2;

import C2.p;
import n2.AbstractC0664g;
/* renamed from: u2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0863a implements InterfaceC0869g {

    /* renamed from: m  reason: collision with root package name */
    public final h f9456m;

    public AbstractC0863a(h hVar) {
        this.f9456m = hVar;
    }

    @Override // u2.i
    public final Object c(Object obj, p pVar) {
        return pVar.i(obj, this);
    }

    @Override // u2.i
    public InterfaceC0869g d(h hVar) {
        return AbstractC0664g.m(this, hVar);
    }

    @Override // u2.i
    public i f(h hVar) {
        return AbstractC0664g.r(this, hVar);
    }

    @Override // u2.InterfaceC0869g
    public final h getKey() {
        return this.f9456m;
    }

    @Override // u2.i
    public final i n(i iVar) {
        D2.i.e(iVar, "context");
        if (iVar == j.f9461m) {
            return this;
        }
        return (i) iVar.c(this, new C0864b(1));
    }
}
