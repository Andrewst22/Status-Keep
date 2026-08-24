package n2;

import g2.v;
import g2.w;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
/* renamed from: n2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0660c extends w {

    /* renamed from: d  reason: collision with root package name */
    public static final C0660c f8401d = new Object();

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, n2.f] */
    /* JADX WARN: Type inference failed for: r4v5, types: [n2.a, java.lang.Object] */
    @Override // g2.w
    public final Object f(byte b3, ByteBuffer byteBuffer) {
        if (b3 != -127) {
            if (b3 != -126) {
                return super.f(b3, byteBuffer);
            }
            ?? obj = new Object();
            Boolean bool = (Boolean) ((ArrayList) e(byteBuffer)).get(0);
            if (bool != null) {
                obj.f8399a = bool;
                return obj;
            }
            throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
        }
        ArrayList arrayList = (ArrayList) e(byteBuffer);
        ?? obj2 = new Object();
        Boolean bool2 = (Boolean) arrayList.get(0);
        if (bool2 != null) {
            obj2.f8404a = bool2;
            Boolean bool3 = (Boolean) arrayList.get(1);
            if (bool3 != null) {
                obj2.f8405b = bool3;
                Map map = (Map) arrayList.get(2);
                if (map != null) {
                    obj2.f8406c = map;
                    return obj2;
                }
                throw new IllegalStateException("Nonnull field \"headers\" is null.");
            }
            throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
        }
        throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
    }

    @Override // g2.w
    public final void k(v vVar, Object obj) {
        if (obj instanceof C0663f) {
            vVar.write(129);
            C0663f c0663f = (C0663f) obj;
            c0663f.getClass();
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(c0663f.f8404a);
            arrayList.add(c0663f.f8405b);
            arrayList.add(c0663f.f8406c);
            k(vVar, arrayList);
        } else if (obj instanceof C0658a) {
            vVar.write(130);
            C0658a c0658a = (C0658a) obj;
            c0658a.getClass();
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(c0658a.f8399a);
            k(vVar, arrayList2);
        } else {
            super.k(vVar, obj);
        }
    }
}
