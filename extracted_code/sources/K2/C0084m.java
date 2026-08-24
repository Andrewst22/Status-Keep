package K2;

import java.util.concurrent.CancellationException;
/* renamed from: K2.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0084m {

    /* renamed from: a  reason: collision with root package name */
    public final Object f839a;

    /* renamed from: b  reason: collision with root package name */
    public final D f840b;

    /* renamed from: c  reason: collision with root package name */
    public final C2.l f841c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f842d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f843e;

    public C0084m(Object obj, D d3, C2.l lVar, Object obj2, Throwable th) {
        this.f839a = obj;
        this.f840b = d3;
        this.f841c = lVar;
        this.f842d = obj2;
        this.f843e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0084m a(C0084m c0084m, D d3, CancellationException cancellationException, int i3) {
        Object obj = c0084m.f839a;
        if ((i3 & 2) != 0) {
            d3 = c0084m.f840b;
        }
        D d4 = d3;
        C2.l lVar = c0084m.f841c;
        Object obj2 = c0084m.f842d;
        CancellationException cancellationException2 = cancellationException;
        if ((i3 & 16) != 0) {
            cancellationException2 = c0084m.f843e;
        }
        c0084m.getClass();
        return new C0084m(obj, d4, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0084m)) {
            return false;
        }
        C0084m c0084m = (C0084m) obj;
        if (D2.i.a(this.f839a, c0084m.f839a) && D2.i.a(this.f840b, c0084m.f840b) && D2.i.a(this.f841c, c0084m.f841c) && D2.i.a(this.f842d, c0084m.f842d) && D2.i.a(this.f843e, c0084m.f843e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i3 = 0;
        Object obj = this.f839a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i4 = hashCode * 31;
        D d3 = this.f840b;
        if (d3 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d3.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        C2.l lVar = this.f841c;
        if (lVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = lVar.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        Object obj2 = this.f842d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        Throwable th = this.f843e;
        if (th != null) {
            i3 = th.hashCode();
        }
        return i7 + i3;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f839a + ", cancelHandler=" + this.f840b + ", onCancellation=" + this.f841c + ", idempotentResume=" + this.f842d + ", cancelCause=" + this.f843e + ')';
    }

    public /* synthetic */ C0084m(Object obj, D d3, C2.l lVar, CancellationException cancellationException, int i3) {
        this(obj, (i3 & 2) != 0 ? null : d3, (i3 & 4) != 0 ? null : lVar, (Object) null, (i3 & 16) != 0 ? null : cancellationException);
    }
}
