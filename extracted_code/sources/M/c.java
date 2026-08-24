package M;

import K.InterfaceC0047a;
import T2.l;
/* loaded from: classes.dex */
public class c implements InterfaceC0047a {

    /* renamed from: a  reason: collision with root package name */
    public final T2.i f980a;

    /* renamed from: b  reason: collision with root package name */
    public final l f981b;

    /* renamed from: c  reason: collision with root package name */
    public final a f982c;

    public c(T2.i iVar, l lVar) {
        D2.i.e(iVar, "fileSystem");
        D2.i.e(lVar, "path");
        this.f980a = iVar;
        this.f981b = lVar;
        this.f982c = new a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:(4:11|12|(2:20|21)|(2:15|16)(1:18))(2:24|25))(3:26|27|28))(2:46|(5:50|51|53|54|(1:56)(1:57))(2:48|49))|(2:35|36)|30|(2:32|33)(1:34)))|78|6|7|(0)(0)|(0)|30|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
        if (r8 != 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c7, code lost:
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cb, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00cc, code lost:
        m2.AbstractC0635d.b(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cf, code lost:
        r6 = r9;
        r9 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096 A[Catch: FileNotFoundException -> 0x008f, TryCatch #2 {FileNotFoundException -> 0x008f, blocks: (B:48:0x0096, B:49:0x009a, B:41:0x0086), top: B:77:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a A[Catch: FileNotFoundException -> 0x008f, TRY_LEAVE, TryCatch #2 {FileNotFoundException -> 0x008f, blocks: (B:48:0x0096, B:49:0x009a, B:41:0x0086), top: B:77:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0, types: [M.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(M.c r8, w2.b r9) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M.c.a(M.c, w2.b):java.lang.Object");
    }

    @Override // K.InterfaceC0047a
    public final void close() {
        this.f982c.f974a.set(true);
    }
}
