package W1;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class u implements w {

    /* renamed from: m  reason: collision with root package name */
    public final g2.g f2913m;

    /* renamed from: n  reason: collision with root package name */
    public final HashMap f2914n = new HashMap();

    /* renamed from: o  reason: collision with root package name */
    public final HashMap f2915o;

    /* renamed from: p  reason: collision with root package name */
    public final R2.i f2916p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, W1.z] */
    public u(g2.g gVar) {
        HashMap hashMap = new HashMap();
        this.f2915o = hashMap;
        this.f2916p = new R2.i();
        this.f2913m = gVar;
        y yVar = A.f2822a;
        ?? obj = new Object();
        obj.f2921a = false;
        Object[] objArr = new z[]{obj}[0];
        objArr.getClass();
        hashMap.put(4294967556L, objArr);
    }

    public final void a(r rVar, final A.i iVar) {
        g2.f fVar;
        int length;
        long j3;
        long j4;
        long j5;
        byte[] bArr = null;
        if (iVar == null) {
            fVar = null;
        } else {
            fVar = new g2.f() { // from class: W1.s
                @Override // g2.f
                public final void a(ByteBuffer byteBuffer) {
                    boolean z3;
                    Boolean bool = Boolean.FALSE;
                    if (byteBuffer != null) {
                        byteBuffer.rewind();
                        if (byteBuffer.capacity() != 0) {
                            if (byteBuffer.get() != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            bool = Boolean.valueOf(z3);
                        }
                    } else {
                        Log.w("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
                    }
                    A.i.this.e(bool.booleanValue());
                }
            };
        }
        try {
            String str = rVar.f2906g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            if (bArr == null) {
                length = 0;
            } else {
                length = bArr.length;
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(rVar.f2900a);
            int i3 = rVar.f2901b;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        j3 = 2;
                    } else {
                        throw null;
                    }
                } else {
                    j3 = 1;
                }
            } else {
                j3 = 0;
            }
            allocateDirect.putLong(j3);
            allocateDirect.putLong(rVar.f2902c);
            allocateDirect.putLong(rVar.f2903d);
            if (rVar.f2904e) {
                j4 = 1;
            } else {
                j4 = 0;
            }
            allocateDirect.putLong(j4);
            int i4 = rVar.f2905f;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 == 5) {
                                j5 = 4;
                            } else {
                                throw null;
                            }
                        } else {
                            j5 = 3;
                        }
                    } else {
                        j5 = 2;
                    }
                } else {
                    j5 = 1;
                }
            } else {
                j5 = 0;
            }
            allocateDirect.putLong(j5);
            if (bArr != null) {
                allocateDirect.put(bArr);
            }
            this.f2913m.c("flutter/keydata", allocateDirect, fVar);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [W1.r, java.lang.Object] */
    public final void b(boolean z3, Long l3, Long l4, long j3) {
        int i3;
        ?? obj = new Object();
        obj.f2900a = j3;
        if (z3) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        obj.f2901b = i3;
        obj.f2903d = l3.longValue();
        obj.f2902c = l4.longValue();
        obj.f2906g = null;
        obj.f2904e = true;
        obj.f2905f = 1;
        if (l4.longValue() != 0 && l3.longValue() != 0) {
            if (!z3) {
                l3 = null;
            }
            c(l4, l3);
        }
        a(obj, null);
    }

    public final void c(Long l3, Long l4) {
        HashMap hashMap = this.f2914n;
        if (l4 != null) {
            if (((Long) hashMap.put(l3, l4)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) hashMap.remove(l3)) != null) {
        } else {
            throw new AssertionError("The key was empty");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ed  */
    /* JADX WARN: Type inference failed for: r0v27, types: [W1.r, java.lang.Object] */
    @Override // W1.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(final android.view.KeyEvent r30, A.i r31) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.u.j(android.view.KeyEvent, A.i):void");
    }
}
