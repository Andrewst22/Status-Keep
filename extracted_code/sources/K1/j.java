package K1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class j implements Iterator {

    /* renamed from: m  reason: collision with root package name */
    public l f756m;

    /* renamed from: n  reason: collision with root package name */
    public l f757n = null;

    /* renamed from: o  reason: collision with root package name */
    public int f758o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ m f759p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f760q;

    public j(m mVar, int i3) {
        this.f760q = i3;
        this.f759p = mVar;
        this.f756m = mVar.f776q.f766p;
        this.f758o = mVar.f775p;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f756m;
        m mVar = this.f759p;
        if (lVar != mVar.f776q) {
            if (mVar.f775p == this.f758o) {
                this.f756m = lVar.f766p;
                this.f757n = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f756m != this.f759p.f776q) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f760q) {
            case 1:
                return b().f768r;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        l lVar = this.f757n;
        if (lVar != null) {
            m mVar = this.f759p;
            mVar.c(lVar, true);
            this.f757n = null;
            this.f758o = mVar.f775p;
            return;
        }
        throw new IllegalStateException();
    }
}
