package n;

import androidx.lifecycle.q;
import androidx.lifecycle.s;
import java.util.Map;
/* renamed from: n.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0653c implements Map.Entry {

    /* renamed from: m  reason: collision with root package name */
    public final q f8333m;

    /* renamed from: n  reason: collision with root package name */
    public final s f8334n;

    /* renamed from: o  reason: collision with root package name */
    public C0653c f8335o;

    /* renamed from: p  reason: collision with root package name */
    public C0653c f8336p;

    public C0653c(q qVar, s sVar) {
        this.f8333m = qVar;
        this.f8334n = sVar;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0653c)) {
            return false;
        }
        C0653c c0653c = (C0653c) obj;
        if (this.f8333m.equals(c0653c.f8333m) && this.f8334n.equals(c0653c.f8334n)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8333m;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8334n;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f8333m.hashCode() ^ this.f8334n.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f8333m + "=" + this.f8334n;
    }
}
