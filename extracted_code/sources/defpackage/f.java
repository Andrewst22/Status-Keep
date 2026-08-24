package defpackage;

import D2.i;
import g2.v;
import g2.w;
import java.nio.ByteBuffer;
import java.util.List;
import m2.AbstractC0635d;
/* renamed from: f  reason: default package */
/* loaded from: classes.dex */
public final class f extends w {
    @Override // g2.w
    public final Object f(byte b3, ByteBuffer byteBuffer) {
        List list;
        List list2;
        i.e(byteBuffer, "buffer");
        if (b3 == -127) {
            Object e2 = e(byteBuffer);
            if (e2 instanceof List) {
                list2 = (List) e2;
            } else {
                list2 = null;
            }
            if (list2 == null) {
                return null;
            }
            return new b((Boolean) list2.get(0));
        } else if (b3 == -126) {
            Object e3 = e(byteBuffer);
            if (e3 instanceof List) {
                list = (List) e3;
            } else {
                list = null;
            }
            if (list == null) {
                return null;
            }
            return new a((Boolean) list.get(0));
        } else {
            return super.f(b3, byteBuffer);
        }
    }

    @Override // g2.w
    public final void k(v vVar, Object obj) {
        if (obj instanceof b) {
            vVar.write(129);
            k(vVar, AbstractC0635d.s(((b) obj).f4505a));
        } else if (obj instanceof a) {
            vVar.write(130);
            k(vVar, AbstractC0635d.s(((a) obj).f3594a));
        } else {
            super.k(vVar, obj);
        }
    }
}
