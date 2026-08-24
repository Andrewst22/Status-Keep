package W;

import U.AbstractC0123a;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public final class m implements h {

    /* renamed from: m  reason: collision with root package name */
    public final Context f2775m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f2776n;

    /* renamed from: o  reason: collision with root package name */
    public final h f2777o;

    /* renamed from: p  reason: collision with root package name */
    public s f2778p;

    /* renamed from: q  reason: collision with root package name */
    public C0125b f2779q;

    /* renamed from: r  reason: collision with root package name */
    public e f2780r;

    /* renamed from: s  reason: collision with root package name */
    public h f2781s;

    /* renamed from: t  reason: collision with root package name */
    public D f2782t;

    /* renamed from: u  reason: collision with root package name */
    public f f2783u;

    /* renamed from: v  reason: collision with root package name */
    public z f2784v;

    /* renamed from: w  reason: collision with root package name */
    public h f2785w;

    public m(Context context, h hVar) {
        this.f2775m = context.getApplicationContext();
        hVar.getClass();
        this.f2777o = hVar;
        this.f2776n = new ArrayList();
    }

    public static void b(h hVar, B b3) {
        if (hVar != null) {
            hVar.y(b3);
        }
    }

    public final void a(h hVar) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f2776n;
            if (i3 < arrayList.size()) {
                hVar.y((B) arrayList.get(i3));
                i3++;
            } else {
                return;
            }
        }
    }

    @Override // W.h
    public final void close() {
        h hVar = this.f2785w;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f2785w = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [W.h, W.c, W.f] */
    /* JADX WARN: Type inference failed for: r0v8, types: [W.h, W.c, W.s] */
    @Override // W.h
    public final long j(l lVar) {
        boolean z3;
        if (this.f2785w == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        String scheme = lVar.f2767a.getScheme();
        int i3 = U.A.f2405a;
        Uri uri = lVar.f2767a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f2775m;
        if (!isEmpty && !"file".equals(scheme2)) {
            if ("asset".equals(scheme)) {
                if (this.f2779q == null) {
                    C0125b c0125b = new C0125b(context);
                    this.f2779q = c0125b;
                    a(c0125b);
                }
                this.f2785w = this.f2779q;
            } else if ("content".equals(scheme)) {
                if (this.f2780r == null) {
                    e eVar = new e(context);
                    this.f2780r = eVar;
                    a(eVar);
                }
                this.f2785w = this.f2780r;
            } else {
                boolean equals = "rtmp".equals(scheme);
                h hVar = this.f2777o;
                if (equals) {
                    if (this.f2781s == null) {
                        try {
                            h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.f2781s = hVar2;
                            a(hVar2);
                        } catch (ClassNotFoundException unused) {
                            AbstractC0123a.A("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e2) {
                            throw new RuntimeException("Error instantiating RTMP extension", e2);
                        }
                        if (this.f2781s == null) {
                            this.f2781s = hVar;
                        }
                    }
                    this.f2785w = this.f2781s;
                } else if ("udp".equals(scheme)) {
                    if (this.f2782t == null) {
                        D d3 = new D(8000);
                        this.f2782t = d3;
                        a(d3);
                    }
                    this.f2785w = this.f2782t;
                } else if ("data".equals(scheme)) {
                    if (this.f2783u == null) {
                        ?? abstractC0126c = new AbstractC0126c(false);
                        this.f2783u = abstractC0126c;
                        a(abstractC0126c);
                    }
                    this.f2785w = this.f2783u;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.f2785w = hVar;
                } else {
                    if (this.f2784v == null) {
                        z zVar = new z(context);
                        this.f2784v = zVar;
                        a(zVar);
                    }
                    this.f2785w = this.f2784v;
                }
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.f2779q == null) {
                    C0125b c0125b2 = new C0125b(context);
                    this.f2779q = c0125b2;
                    a(c0125b2);
                }
                this.f2785w = this.f2779q;
            } else {
                if (this.f2778p == null) {
                    ?? abstractC0126c2 = new AbstractC0126c(false);
                    this.f2778p = abstractC0126c2;
                    a(abstractC0126c2);
                }
                this.f2785w = this.f2778p;
            }
        }
        return this.f2785w.j(lVar);
    }

    @Override // W.h
    public final Uri o() {
        h hVar = this.f2785w;
        if (hVar == null) {
            return null;
        }
        return hVar.o();
    }

    @Override // R.InterfaceC0107j
    public final int read(byte[] bArr, int i3, int i4) {
        h hVar = this.f2785w;
        hVar.getClass();
        return hVar.read(bArr, i3, i4);
    }

    @Override // W.h
    public final Map x() {
        h hVar = this.f2785w;
        if (hVar == null) {
            return Collections.emptyMap();
        }
        return hVar.x();
    }

    @Override // W.h
    public final void y(B b3) {
        b3.getClass();
        this.f2777o.y(b3);
        this.f2776n.add(b3);
        b(this.f2778p, b3);
        b(this.f2779q, b3);
        b(this.f2780r, b3);
        b(this.f2781s, b3);
        b(this.f2782t, b3);
        b(this.f2783u, b3);
        b(this.f2784v, b3);
    }
}
