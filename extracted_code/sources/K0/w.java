package k0;

import D1.I;
import U.AbstractC0123a;
import android.os.Handler;
import g2.C0276a;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class w implements s0.k {

    /* renamed from: m  reason: collision with root package name */
    public final DataInputStream f7678m;

    /* renamed from: n  reason: collision with root package name */
    public final g0.h f7679n;

    /* renamed from: o  reason: collision with root package name */
    public volatile boolean f7680o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ y f7681p;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, g0.h] */
    public w(y yVar, InputStream inputStream) {
        this.f7681p = yVar;
        this.f7678m = new DataInputStream(inputStream);
        ?? obj = new Object();
        obj.f5724c = new ArrayList();
        obj.f5722a = 1;
        this.f7679n = obj;
    }

    @Override // s0.k
    public final void b() {
        boolean z3;
        boolean z4;
        String str;
        while (!this.f7680o) {
            byte readByte = this.f7678m.readByte();
            if (readByte == 36) {
                int readUnsignedByte = this.f7678m.readUnsignedByte();
                int readUnsignedShort = this.f7678m.readUnsignedShort();
                byte[] bArr = new byte[readUnsignedShort];
                this.f7678m.readFully(bArr, 0, readUnsignedShort);
                C0544G c0544g = (C0544G) this.f7681p.f7689o.get(Integer.valueOf(readUnsignedByte));
                if (c0544g != null && !this.f7681p.f7692r) {
                    c0544g.f7536q.add(bArr);
                }
            } else if (this.f7681p.f7692r) {
                continue;
            } else {
                C0276a c0276a = this.f7681p.f7687m;
                g0.h hVar = this.f7679n;
                DataInputStream dataInputStream = this.f7678m;
                hVar.getClass();
                I a3 = hVar.a(g0.h.b(readByte, dataInputStream));
                while (a3 == null) {
                    if (hVar.f5722a == 3) {
                        long j3 = hVar.f5723b;
                        if (j3 > 0) {
                            int i3 = android.support.v4.media.session.a.i(j3);
                            if (i3 != -1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            AbstractC0123a.j(z3);
                            byte[] bArr2 = new byte[i3];
                            dataInputStream.readFully(bArr2, 0, i3);
                            if (hVar.f5722a == 3) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            AbstractC0123a.j(z4);
                            if (i3 > 0) {
                                int i4 = i3 - 1;
                                if (bArr2[i4] == 10) {
                                    if (i3 > 1) {
                                        int i5 = i3 - 2;
                                        if (bArr2[i5] == 13) {
                                            str = new String(bArr2, 0, i5, y.f7686s);
                                            ArrayList arrayList = (ArrayList) hVar.f5724c;
                                            arrayList.add(str);
                                            a3 = I.j(arrayList);
                                            ((ArrayList) hVar.f5724c).clear();
                                            hVar.f5722a = 1;
                                            hVar.f5723b = 0L;
                                        }
                                    }
                                    str = new String(bArr2, 0, i4, y.f7686s);
                                    ArrayList arrayList2 = (ArrayList) hVar.f5724c;
                                    arrayList2.add(str);
                                    a3 = I.j(arrayList2);
                                    ((ArrayList) hVar.f5724c).clear();
                                    hVar.f5722a = 1;
                                    hVar.f5723b = 0L;
                                }
                            }
                            throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
                        }
                        throw new IllegalStateException("Expects a greater than zero Content-Length.");
                    }
                    a3 = hVar.a(g0.h.b(dataInputStream.readByte(), dataInputStream));
                }
                ((Handler) c0276a.f5777n).post(new U.n(8, c0276a, a3));
            }
        }
    }

    @Override // s0.k
    public final void c() {
        this.f7680o = true;
    }
}
