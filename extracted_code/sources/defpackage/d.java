package defpackage;

import C1.j;
import D2.h;
import D2.i;
import K.C0059m;
import T1.c;
import U1.b;
import W1.d;
import android.support.v4.media.session.a;
import g2.C0276a;
import g2.InterfaceC0278c;
import g2.g;
import g2.n;
import java.util.List;
import m2.AbstractC0635d;
import s2.C0806e;
/* renamed from: d  reason: default package */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ d f5144a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C0806e f5145b = new C0806e(new c(1));

    public static void a(d dVar, g gVar, final b bVar) {
        dVar.getClass();
        i.e(gVar, "binaryMessenger");
        String str = "";
        if ("".length() > 0) {
            str = ".".concat("");
        }
        String l3 = h.l("dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.toggle", str);
        C0806e c0806e = f5145b;
        C0059m c0059m = new C0059m(gVar, l3, (n) c0806e.a(), (B1.b) null);
        if (bVar != null) {
            c0059m.o(new InterfaceC0278c() { // from class: c
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    List b3;
                    List b4;
                    d dVar2;
                    boolean z3;
                    switch (r2) {
                        case 0:
                            b bVar2 = bVar;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            i.c(obj2, "null cannot be cast to non-null type <root>.ToggleMessage");
                            try {
                                bVar2.a((b) obj2);
                                b3 = AbstractC0635d.s(null);
                            } catch (Throwable th) {
                                b3 = a.b(th);
                            }
                            c0276a.o(b3);
                            return;
                        default:
                            try {
                                j jVar = bVar.f2580m;
                                i.b(jVar);
                                dVar2 = (d) jVar.f168n;
                            } catch (Throwable th2) {
                                b4 = a.b(th2);
                            }
                            if (dVar2 != null) {
                                i.b(dVar2);
                                if ((dVar2.getWindow().getAttributes().flags & 128) != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                b4 = AbstractC0635d.s(new a(Boolean.valueOf(z3)));
                                c0276a.o(b4);
                                return;
                            }
                            throw new U1.a();
                    }
                }
            });
        } else {
            c0059m.o(null);
        }
        C0059m c0059m2 = new C0059m(gVar, h.l("dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.isEnabled", str), (n) c0806e.a(), (B1.b) null);
        if (bVar != null) {
            c0059m2.o(new InterfaceC0278c() { // from class: c
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    List b3;
                    List b4;
                    d dVar2;
                    boolean z3;
                    switch (r2) {
                        case 0:
                            b bVar2 = bVar;
                            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            i.c(obj2, "null cannot be cast to non-null type <root>.ToggleMessage");
                            try {
                                bVar2.a((b) obj2);
                                b3 = AbstractC0635d.s(null);
                            } catch (Throwable th) {
                                b3 = a.b(th);
                            }
                            c0276a.o(b3);
                            return;
                        default:
                            try {
                                j jVar = bVar.f2580m;
                                i.b(jVar);
                                dVar2 = (d) jVar.f168n;
                            } catch (Throwable th2) {
                                b4 = a.b(th2);
                            }
                            if (dVar2 != null) {
                                i.b(dVar2);
                                if ((dVar2.getWindow().getAttributes().flags & 128) != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                b4 = AbstractC0635d.s(new a(Boolean.valueOf(z3)));
                                c0276a.o(b4);
                                return;
                            }
                            throw new U1.a();
                    }
                }
            });
        } else {
            c0059m2.o(null);
        }
    }
}
