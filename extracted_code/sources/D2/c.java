package D2;

import java.io.Serializable;
/* loaded from: classes.dex */
public abstract class c implements H2.a, Serializable {

    /* renamed from: m  reason: collision with root package name */
    public transient H2.a f323m;

    /* renamed from: n  reason: collision with root package name */
    public final Object f324n;

    /* renamed from: o  reason: collision with root package name */
    public final Class f325o;

    /* renamed from: p  reason: collision with root package name */
    public final String f326p;

    /* renamed from: q  reason: collision with root package name */
    public final String f327q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f328r;

    public c(Object obj, Class cls, String str, String str2, boolean z3) {
        this.f324n = obj;
        this.f325o = cls;
        this.f326p = str;
        this.f327q = str2;
        this.f328r = z3;
    }

    public abstract H2.a a();

    public final d d() {
        Class cls = this.f325o;
        if (this.f328r) {
            r.f343a.getClass();
            return new k(cls);
        }
        return r.a(cls);
    }
}
