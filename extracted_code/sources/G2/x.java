package g2;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public final class x implements s {

    /* renamed from: a  reason: collision with root package name */
    public static final x f5796a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, g2.x] */
    static {
        w wVar = w.f5793a;
        f5796a = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.ByteArrayOutputStream, g2.v] */
    @Override // g2.s
    public final ByteBuffer a(o oVar) {
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        w wVar = w.f5793a;
        wVar.k(byteArrayOutputStream, oVar.f5788a);
        wVar.k(byteArrayOutputStream, oVar.f5789b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, g2.v] */
    @Override // g2.s
    public final ByteBuffer b(Object obj) {
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        w.f5793a.k(byteArrayOutputStream, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    @Override // g2.s
    public final o c(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        w wVar = w.f5793a;
        Object e2 = wVar.e(byteBuffer);
        Object e3 = wVar.e(byteBuffer);
        if ((e2 instanceof String) && !byteBuffer.hasRemaining()) {
            return new o(e3, (String) e2);
        }
        throw new IllegalArgumentException("Method call corrupted");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 == 1) goto L8;
     */
    @Override // g2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L11
            r1 = 1
            if (r0 != r1) goto L46
            goto L1e
        L11:
            g2.w r0 = g2.w.f5793a
            java.lang.Object r0 = r0.e(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L1e
            return r0
        L1e:
            g2.w r0 = g2.w.f5793a
            java.lang.Object r1 = r0.e(r5)
            java.lang.Object r2 = r0.e(r5)
            java.lang.Object r0 = r0.e(r5)
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L46
            if (r2 == 0) goto L36
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L46
        L36:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L46
            g2.k r5 = new g2.k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = (java.lang.String) r2
            r5.<init>(r1, r2, r0)
            throw r5
        L46:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.x.d(java.nio.ByteBuffer):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, g2.v] */
    @Override // g2.s
    public final ByteBuffer e(String str, String str2) {
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        w wVar = w.f5793a;
        wVar.k(byteArrayOutputStream, "error");
        wVar.k(byteArrayOutputStream, str);
        byteArrayOutputStream.write(0);
        wVar.k(byteArrayOutputStream, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, g2.v] */
    @Override // g2.s
    public final ByteBuffer f(String str, String str2, Object obj) {
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        w wVar = w.f5793a;
        wVar.k(byteArrayOutputStream, str);
        wVar.k(byteArrayOutputStream, str2);
        if (obj instanceof Throwable) {
            wVar.k(byteArrayOutputStream, Log.getStackTraceString((Throwable) obj));
        } else {
            wVar.k(byteArrayOutputStream, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }
}
