package l2;

import g2.v;
import g2.w;
import java.nio.ByteBuffer;
/* renamed from: l2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0609b extends w {

    /* renamed from: d  reason: collision with root package name */
    public static final C0609b f8137d = new Object();

    @Override // g2.w
    public final Object f(byte b3, ByteBuffer byteBuffer) {
        if (b3 != -127) {
            return super.f(b3, byteBuffer);
        }
        Object e2 = e(byteBuffer);
        if (e2 == null) {
            return null;
        }
        return EnumC0610c.values()[((Long) e2).intValue()];
    }

    @Override // g2.w
    public final void k(v vVar, Object obj) {
        Integer valueOf;
        if (obj instanceof EnumC0610c) {
            vVar.write(129);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(((EnumC0610c) obj).f8139m);
            }
            k(vVar, valueOf);
            return;
        }
        super.k(vVar, obj);
    }
}
