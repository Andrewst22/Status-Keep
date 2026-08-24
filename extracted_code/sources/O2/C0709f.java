package o2;

import g2.v;
import g2.w;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
/* renamed from: o2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0709f extends w {

    /* renamed from: d  reason: collision with root package name */
    public static final C0709f f8696d = new Object();

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, o2.g] */
    /* JADX WARN: Type inference failed for: r3v4, types: [o2.e, java.lang.Object] */
    @Override // g2.w
    public final Object f(byte b3, ByteBuffer byteBuffer) {
        switch (b3) {
            case -127:
                Object e2 = e(byteBuffer);
                if (e2 == null) {
                    return null;
                }
                return EnumC0711h.values()[((Long) e2).intValue()];
            case -126:
                ?? obj = new Object();
                Long l3 = (Long) ((ArrayList) e(byteBuffer)).get(0);
                if (l3 != null) {
                    obj.f8697a = l3;
                    return obj;
                }
                throw new IllegalStateException("Nonnull field \"playerId\" is null.");
            case -125:
                ArrayList arrayList = (ArrayList) e(byteBuffer);
                ?? obj2 = new Object();
                obj2.f8690a = (String) arrayList.get(0);
                obj2.f8691b = (String) arrayList.get(1);
                obj2.f8692c = (String) arrayList.get(2);
                obj2.f8693d = (String) arrayList.get(3);
                Map map = (Map) arrayList.get(4);
                if (map != null) {
                    obj2.f8694e = map;
                    obj2.f8695f = (EnumC0711h) arrayList.get(5);
                    return obj2;
                }
                throw new IllegalStateException("Nonnull field \"httpHeaders\" is null.");
            default:
                return super.f(b3, byteBuffer);
        }
    }

    @Override // g2.w
    public final void k(v vVar, Object obj) {
        Object valueOf;
        if (obj instanceof EnumC0711h) {
            vVar.write(129);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(((EnumC0711h) obj).f8700m);
            }
            k(vVar, valueOf);
        } else if (obj instanceof C0710g) {
            vVar.write(130);
            C0710g c0710g = (C0710g) obj;
            c0710g.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(c0710g.f8697a);
            k(vVar, arrayList);
        } else if (obj instanceof C0708e) {
            vVar.write(131);
            C0708e c0708e = (C0708e) obj;
            c0708e.getClass();
            ArrayList arrayList2 = new ArrayList(6);
            arrayList2.add(c0708e.f8690a);
            arrayList2.add(c0708e.f8691b);
            arrayList2.add(c0708e.f8692c);
            arrayList2.add(c0708e.f8693d);
            arrayList2.add(c0708e.f8694e);
            arrayList2.add(c0708e.f8695f);
            k(vVar, arrayList2);
        } else {
            super.k(vVar, obj);
        }
    }
}
