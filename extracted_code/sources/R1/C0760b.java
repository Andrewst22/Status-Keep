package r1;

import s1.InterfaceC0801a;
/* renamed from: r1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0760b implements h {

    /* renamed from: o  reason: collision with root package name */
    public static final C0760b f9003o = new C0760b("NONE", 0);

    /* renamed from: p  reason: collision with root package name */
    public static final C0760b f9004p = new C0760b("FULL", 0);

    /* renamed from: q  reason: collision with root package name */
    public static final C0760b f9005q = new C0760b("FLAT", 1);

    /* renamed from: r  reason: collision with root package name */
    public static final C0760b f9006r = new C0760b("HALF_OPENED", 1);

    /* renamed from: s  reason: collision with root package name */
    public static final C0760b f9007s = new C0760b("FOLD", 2);

    /* renamed from: t  reason: collision with root package name */
    public static final C0760b f9008t = new C0760b("HINGE", 2);

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f9009m;

    /* renamed from: n  reason: collision with root package name */
    public final Object f9010n;

    public /* synthetic */ C0760b(String str, int i3) {
        this.f9009m = i3;
        this.f9010n = str;
    }

    public String toString() {
        switch (this.f9009m) {
            case 0:
                return (String) this.f9010n;
            case 1:
                return (String) this.f9010n;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return (String) this.f9010n;
            default:
                return super.toString();
        }
    }

    public C0760b(InterfaceC0801a interfaceC0801a) {
        this.f9009m = 3;
        int i3 = n.f9033b;
        this.f9010n = interfaceC0801a;
    }
}
