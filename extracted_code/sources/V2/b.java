package V2;

import R1.f;
import android.os.Handler;
import android.os.Looper;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ String f2704m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Map f2705n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ String f2706o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ HashMap f2707p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f2708q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f2709r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f2710s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ int f2711t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f2712u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ f f2713v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ d f2714w;

    public b(d dVar, String str, Map map, String str2, HashMap hashMap, int i3, int i4, int i5, int i6, int i7, f fVar) {
        this.f2714w = dVar;
        this.f2704m = str;
        this.f2705n = map;
        this.f2706o = str2;
        this.f2707p = hashMap;
        this.f2708q = i3;
        this.f2709r = i4;
        this.f2710s = i5;
        this.f2711t = i6;
        this.f2712u = i7;
        this.f2713v = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        d dVar = this.f2714w;
        String str3 = this.f2704m;
        Serializable serializable = null;
        boolean z3 = false;
        try {
        } catch (Exception e2) {
            e = e2;
        }
        if (str3.equals("file")) {
            str2 = d.a(this.f2714w, this.f2706o, this.f2707p, (String) this.f2705n.get("path"), this.f2708q, this.f2709r, this.f2710s, this.f2711t, this.f2712u);
        } else if (str3.equals("data")) {
            String str4 = this.f2706o;
            HashMap hashMap = this.f2707p;
            int i3 = this.f2708q;
            int i4 = this.f2709r;
            int i5 = this.f2710s;
            int i6 = this.f2711t;
            int i7 = this.f2712u;
            dVar.getClass();
            str2 = d.b(str4, hashMap, i3, i4, i5, i6, i7);
        } else {
            str = null;
            serializable = str;
            e = null;
            dVar.getClass();
            new Handler(Looper.getMainLooper()).post(new c(z3, this.f2713v, e, serializable));
        }
        z3 = true;
        str = str2;
        serializable = str;
        e = null;
        dVar.getClass();
        new Handler(Looper.getMainLooper()).post(new c(z3, this.f2713v, e, serializable));
    }
}
