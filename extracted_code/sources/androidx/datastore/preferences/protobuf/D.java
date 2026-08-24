package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final class D {

    /* renamed from: b  reason: collision with root package name */
    public static final r f4167b = new r(1);

    /* renamed from: a  reason: collision with root package name */
    public final Object f4168a;

    public D(C0188k c0188k) {
        AbstractC0199w.a(c0188k, "output");
        this.f4168a = c0188k;
        c0188k.f4274b = this;
    }

    public void a(int i3, boolean z3) {
        ((C0188k) this.f4168a).H0(i3, z3);
    }

    public void b(int i3, C0184g c0184g) {
        ((C0188k) this.f4168a).I0(i3, c0184g);
    }

    public void c(int i3, double d3) {
        C0188k c0188k = (C0188k) this.f4168a;
        c0188k.getClass();
        c0188k.M0(Double.doubleToRawLongBits(d3), i3);
    }

    public void d(int i3, int i4) {
        ((C0188k) this.f4168a).O0(i3, i4);
    }

    public void e(int i3, int i4) {
        ((C0188k) this.f4168a).K0(i3, i4);
    }

    public void f(long j3, int i3) {
        ((C0188k) this.f4168a).M0(j3, i3);
    }

    public void g(float f3, int i3) {
        C0188k c0188k = (C0188k) this.f4168a;
        c0188k.getClass();
        c0188k.K0(i3, Float.floatToRawIntBits(f3));
    }

    public void h(int i3, Object obj, U u3) {
        C0188k c0188k = (C0188k) this.f4168a;
        c0188k.S0(i3, 3);
        u3.c((AbstractC0178a) obj, c0188k.f4274b);
        c0188k.S0(i3, 4);
    }

    public void i(int i3, int i4) {
        ((C0188k) this.f4168a).O0(i3, i4);
    }

    public void j(long j3, int i3) {
        ((C0188k) this.f4168a).V0(j3, i3);
    }

    public void k(int i3, Object obj, U u3) {
        C0188k c0188k = (C0188k) this.f4168a;
        AbstractC0178a abstractC0178a = (AbstractC0178a) obj;
        c0188k.S0(i3, 2);
        c0188k.U0(abstractC0178a.a(u3));
        u3.c(abstractC0178a, c0188k.f4274b);
    }

    public void l(int i3, int i4) {
        ((C0188k) this.f4168a).K0(i3, i4);
    }

    public void m(long j3, int i3) {
        ((C0188k) this.f4168a).M0(j3, i3);
    }

    public void n(int i3, int i4) {
        ((C0188k) this.f4168a).T0(i3, (i4 >> 31) ^ (i4 << 1));
    }

    public void o(long j3, int i3) {
        ((C0188k) this.f4168a).V0((j3 >> 63) ^ (j3 << 1), i3);
    }

    public void p(int i3, int i4) {
        ((C0188k) this.f4168a).T0(i3, i4);
    }

    public void q(long j3, int i3) {
        ((C0188k) this.f4168a).V0(j3, i3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.datastore.preferences.protobuf.C] */
    public D() {
        Q q3 = Q.f4198c;
        Object obj = f4167b;
        try {
            obj = (J) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
        }
        J[] jArr = {r.f4309b, obj};
        ?? obj2 = new Object();
        obj2.f4166a = jArr;
        Charset charset = AbstractC0199w.f4313a;
        this.f4168a = obj2;
    }
}
