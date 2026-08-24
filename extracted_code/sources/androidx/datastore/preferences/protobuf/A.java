package androidx.datastore.preferences.protobuf;
/* loaded from: classes.dex */
public final class A {
    public static void a(long j3, Object obj) {
        AbstractC0179b abstractC0179b = (AbstractC0179b) ((InterfaceC0198v) h0.f4256c.h(j3, obj));
        if (abstractC0179b.f4226m) {
            abstractC0179b.f4226m = false;
        }
    }

    public static InterfaceC0198v b(long j3, Object obj) {
        int i3;
        InterfaceC0198v interfaceC0198v = (InterfaceC0198v) h0.f4256c.h(j3, obj);
        if (!((AbstractC0179b) interfaceC0198v).f4226m) {
            S s3 = (S) interfaceC0198v;
            int i4 = s3.f4203o;
            if (i4 == 0) {
                i3 = 10;
            } else {
                i3 = i4 * 2;
            }
            S c3 = s3.c(i3);
            h0.o(obj, j3, c3);
            return c3;
        }
        return interfaceC0198v;
    }
}
