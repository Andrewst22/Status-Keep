package m2;

import java.nio.ByteBuffer;
import java.util.List;
import t2.AbstractC0828e;
/* renamed from: m2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0633b extends g2.w {

    /* renamed from: e  reason: collision with root package name */
    public static final C0633b f8241e = new C0633b(0);

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f8242d;

    public /* synthetic */ C0633b(int i3) {
        this.f8242d = i3;
    }

    @Override // g2.w
    public Object f(byte b3, ByteBuffer byteBuffer) {
        List list;
        List list2;
        EnumC0629L[] values;
        switch (this.f8242d) {
            case 1:
                D2.i.e(byteBuffer, "buffer");
                if (b3 == -127) {
                    Long l3 = (Long) e(byteBuffer);
                    if (l3 == null) {
                        return null;
                    }
                    int longValue = (int) l3.longValue();
                    EnumC0629L.f8231n.getClass();
                    for (EnumC0629L enumC0629L : EnumC0629L.values()) {
                        if (enumC0629L.f8236m == longValue) {
                            return enumC0629L;
                        }
                    }
                    return null;
                } else if (b3 == -126) {
                    Object e2 = e(byteBuffer);
                    if (e2 instanceof List) {
                        list2 = (List) e2;
                    } else {
                        list2 = null;
                    }
                    if (list2 == null) {
                        return null;
                    }
                    Object obj = list2.get(1);
                    D2.i.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    return new C0639h((String) list2.get(0), ((Boolean) obj).booleanValue());
                } else if (b3 == -125) {
                    Object e3 = e(byteBuffer);
                    if (e3 instanceof List) {
                        list = (List) e3;
                    } else {
                        list = null;
                    }
                    if (list == null) {
                        return null;
                    }
                    Object obj2 = list.get(1);
                    D2.i.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                    return new C0631N((String) list.get(0), (EnumC0629L) obj2);
                } else {
                    return super.f(b3, byteBuffer);
                }
            default:
                return super.f(b3, byteBuffer);
        }
    }

    @Override // g2.w
    public void k(g2.v vVar, Object obj) {
        switch (this.f8242d) {
            case 1:
                if (obj instanceof EnumC0629L) {
                    vVar.write(129);
                    k(vVar, Integer.valueOf(((EnumC0629L) obj).f8236m));
                    return;
                } else if (obj instanceof C0639h) {
                    vVar.write(130);
                    C0639h c0639h = (C0639h) obj;
                    k(vVar, AbstractC0828e.C(c0639h.f8257a, Boolean.valueOf(c0639h.f8258b)));
                    return;
                } else if (obj instanceof C0631N) {
                    vVar.write(131);
                    C0631N c0631n = (C0631N) obj;
                    k(vVar, AbstractC0828e.C(c0631n.f8237a, c0631n.f8238b));
                    return;
                } else {
                    super.k(vVar, obj);
                    return;
                }
            default:
                super.k(vVar, obj);
                return;
        }
    }
}
