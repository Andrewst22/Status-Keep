package o2;

import D1.b0;
import R.C;
import R.C0115s;
import R.C0117u;
import R.C0118v;
import R.C0119w;
import R.C0120x;
import R.C0122z;
import R.r;
import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import o0.C0690n;
import o0.InterfaceC0700y;
/* renamed from: o2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0705b extends C0.e {

    /* renamed from: b  reason: collision with root package name */
    public final int f8685b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f8686c;

    public C0705b(String str, int i3, HashMap hashMap) {
        super(str);
        this.f8685b = i3;
        this.f8686c = hashMap;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [R.s, R.t] */
    @Override // C0.e
    public final C0122z e() {
        Uri parse;
        String str;
        C0119w c0119w;
        r rVar = new r();
        new B1.b();
        List emptyList = Collections.emptyList();
        b0 b0Var = b0.f231q;
        C0117u c0117u = new C0117u();
        C0120x c0120x = C0120x.f2006a;
        String str2 = (String) this.f142a;
        if (str2 == null) {
            parse = null;
        } else {
            parse = Uri.parse(str2);
        }
        int b3 = N.j.b(this.f8685b);
        if (b3 != 1) {
            if (b3 != 2) {
                if (b3 != 3) {
                    str = null;
                } else {
                    str = "application/x-mpegURL";
                }
            } else {
                str = "application/dash+xml";
            }
        } else {
            str = "application/vnd.ms-sstr+xml";
        }
        if (str == null) {
            str = null;
        }
        if (parse != null) {
            c0119w = new C0119w(parse, str, null, emptyList, b0Var, -9223372036854775807L);
        } else {
            c0119w = null;
        }
        return new C0122z("", new C0115s(rVar), c0119w, new C0118v(c0117u), C.f1745y, c0120x);
    }

    @Override // C0.e
    public final InterfaceC0700y f(Context context) {
        R0.e eVar = new R0.e(1);
        String str = "ExoPlayer";
        if (!this.f8686c.isEmpty() && this.f8686c.containsKey("User-Agent")) {
            str = (String) this.f8686c.get("User-Agent");
        }
        HashMap hashMap = this.f8686c;
        eVar.f2034q = str;
        eVar.f2032o = true;
        if (!hashMap.isEmpty()) {
            B1.a aVar = (B1.a) eVar.f2033p;
            synchronized (aVar) {
                aVar.f51o = null;
                ((HashMap) aVar.f50n).clear();
                ((HashMap) aVar.f50n).putAll(hashMap);
            }
        }
        B1.a aVar2 = new B1.a(context, eVar);
        C0690n c0690n = new C0690n(context);
        c0690n.f8620b = aVar2;
        a0.C c3 = c0690n.f8619a;
        if (aVar2 != ((B1.a) c3.f3607e)) {
            c3.f3607e = aVar2;
            ((HashMap) c3.f3605c).clear();
            ((HashMap) c3.f3606d).clear();
        }
        return c0690n;
    }
}
