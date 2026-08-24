package s2;

import D2.i;
import java.io.Serializable;
/* renamed from: s2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0806e implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    public C2.a f9225m;

    /* renamed from: n  reason: collision with root package name */
    public volatile Object f9226n = C0807f.f9228a;

    /* renamed from: o  reason: collision with root package name */
    public final Object f9227o = this;

    public C0806e(C2.a aVar) {
        this.f9225m = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f9226n;
        C0807f c0807f = C0807f.f9228a;
        if (obj2 != c0807f) {
            return obj2;
        }
        synchronized (this.f9227o) {
            obj = this.f9226n;
            if (obj == c0807f) {
                C2.a aVar = this.f9225m;
                i.b(aVar);
                obj = aVar.c();
                this.f9226n = obj;
                this.f9225m = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f9226n != C0807f.f9228a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
