package n2;

import K.C0059m;
import U.t;
import Y.InterfaceC0147s;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.LongSparseArray;
import g2.C0276a;
import g2.InterfaceC0278c;
import java.util.ArrayList;
import java.util.Map;
import m2.AbstractC0635d;
import o2.C0709f;
import o2.C0718o;
import w0.G;
/* renamed from: n2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0662e {
    public static void a(G g3, t tVar, int i3) {
        g3.a(tVar, i3, 0);
    }

    public static int b(int i3) {
        int[] c3;
        for (int i4 : N.j.c(4)) {
            if (c(i4) == i3) {
                return i4;
            }
        }
        throw new IllegalArgumentException(D2.h.k("Invalid rotation degrees specified: ", i3));
    }

    public static /* synthetic */ int c(int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        return 270;
                    }
                    throw null;
                }
                return 180;
            }
            return 90;
        }
        return 0;
    }

    public static void d(g2.g gVar, final B1.e eVar) {
        C0660c c0660c = C0660c.f8401d;
        C0059m c0059m = new C0059m(gVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", c0660c, (B1.b) null);
        if (eVar != null) {
            c0059m.o(new InterfaceC0278c() { // from class: n2.d
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    Boolean bool;
                    switch (r2) {
                        case 0:
                            B1.e eVar2 = eVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar2.S((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = AbstractC0664g.y(th);
                            }
                            c0276a.o(arrayList);
                            return;
                        case 1:
                            B1.e eVar3 = eVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0664g.y(th2);
                            }
                            if (((W1.d) eVar3.f58p) != null) {
                                try {
                                    ((W1.d) eVar3.f58p).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", B1.e.X(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                                c0276a.o(arrayList2);
                                return;
                            }
                            throw new C0659b();
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            B1.e eVar4 = eVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, eVar4.q0((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (C0663f) arrayList5.get(2), (C0658a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0664g.y(th3);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            B1.e eVar5 = eVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, eVar5.u0());
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0664g.y(th4);
                            }
                            c0276a.o(arrayList6);
                            return;
                        default:
                            B1.e eVar6 = eVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                eVar6.getClass();
                                ((Context) eVar6.f56n).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = AbstractC0664g.y(th5);
                            }
                            c0276a.o(arrayList7);
                            return;
                    }
                }
            });
        } else {
            c0059m.o(null);
        }
        C0059m c0059m2 = new C0059m(gVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", c0660c, (B1.b) null);
        if (eVar != null) {
            c0059m2.o(new InterfaceC0278c() { // from class: n2.d
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    Boolean bool;
                    switch (r2) {
                        case 0:
                            B1.e eVar2 = eVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar2.S((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = AbstractC0664g.y(th);
                            }
                            c0276a.o(arrayList);
                            return;
                        case 1:
                            B1.e eVar3 = eVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0664g.y(th2);
                            }
                            if (((W1.d) eVar3.f58p) != null) {
                                try {
                                    ((W1.d) eVar3.f58p).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", B1.e.X(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                                c0276a.o(arrayList2);
                                return;
                            }
                            throw new C0659b();
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            B1.e eVar4 = eVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, eVar4.q0((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (C0663f) arrayList5.get(2), (C0658a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0664g.y(th3);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            B1.e eVar5 = eVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, eVar5.u0());
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0664g.y(th4);
                            }
                            c0276a.o(arrayList6);
                            return;
                        default:
                            B1.e eVar6 = eVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                eVar6.getClass();
                                ((Context) eVar6.f56n).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = AbstractC0664g.y(th5);
                            }
                            c0276a.o(arrayList7);
                            return;
                    }
                }
            });
        } else {
            c0059m2.o(null);
        }
        C0059m c0059m3 = new C0059m(gVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", c0660c, (B1.b) null);
        if (eVar != null) {
            c0059m3.o(new InterfaceC0278c() { // from class: n2.d
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    Boolean bool;
                    switch (r2) {
                        case 0:
                            B1.e eVar2 = eVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar2.S((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = AbstractC0664g.y(th);
                            }
                            c0276a.o(arrayList);
                            return;
                        case 1:
                            B1.e eVar3 = eVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0664g.y(th2);
                            }
                            if (((W1.d) eVar3.f58p) != null) {
                                try {
                                    ((W1.d) eVar3.f58p).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", B1.e.X(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                                c0276a.o(arrayList2);
                                return;
                            }
                            throw new C0659b();
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            B1.e eVar4 = eVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, eVar4.q0((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (C0663f) arrayList5.get(2), (C0658a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0664g.y(th3);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            B1.e eVar5 = eVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, eVar5.u0());
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0664g.y(th4);
                            }
                            c0276a.o(arrayList6);
                            return;
                        default:
                            B1.e eVar6 = eVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                eVar6.getClass();
                                ((Context) eVar6.f56n).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = AbstractC0664g.y(th5);
                            }
                            c0276a.o(arrayList7);
                            return;
                    }
                }
            });
        } else {
            c0059m3.o(null);
        }
        C0059m c0059m4 = new C0059m(gVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", c0660c, (B1.b) null);
        if (eVar != null) {
            c0059m4.o(new InterfaceC0278c() { // from class: n2.d
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    Boolean bool;
                    switch (r2) {
                        case 0:
                            B1.e eVar2 = eVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar2.S((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = AbstractC0664g.y(th);
                            }
                            c0276a.o(arrayList);
                            return;
                        case 1:
                            B1.e eVar3 = eVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0664g.y(th2);
                            }
                            if (((W1.d) eVar3.f58p) != null) {
                                try {
                                    ((W1.d) eVar3.f58p).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", B1.e.X(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                                c0276a.o(arrayList2);
                                return;
                            }
                            throw new C0659b();
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            B1.e eVar4 = eVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, eVar4.q0((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (C0663f) arrayList5.get(2), (C0658a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0664g.y(th3);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            B1.e eVar5 = eVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, eVar5.u0());
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0664g.y(th4);
                            }
                            c0276a.o(arrayList6);
                            return;
                        default:
                            B1.e eVar6 = eVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                eVar6.getClass();
                                ((Context) eVar6.f56n).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = AbstractC0664g.y(th5);
                            }
                            c0276a.o(arrayList7);
                            return;
                    }
                }
            });
        } else {
            c0059m4.o(null);
        }
        C0059m c0059m5 = new C0059m(gVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", c0660c, (B1.b) null);
        if (eVar != null) {
            c0059m5.o(new InterfaceC0278c() { // from class: n2.d
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    Boolean bool;
                    switch (r2) {
                        case 0:
                            B1.e eVar2 = eVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar2.S((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = AbstractC0664g.y(th);
                            }
                            c0276a.o(arrayList);
                            return;
                        case 1:
                            B1.e eVar3 = eVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0664g.y(th2);
                            }
                            if (((W1.d) eVar3.f58p) != null) {
                                try {
                                    ((W1.d) eVar3.f58p).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", B1.e.X(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                                c0276a.o(arrayList2);
                                return;
                            }
                            throw new C0659b();
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            B1.e eVar4 = eVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, eVar4.q0((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (C0663f) arrayList5.get(2), (C0658a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0664g.y(th3);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            B1.e eVar5 = eVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, eVar5.u0());
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0664g.y(th4);
                            }
                            c0276a.o(arrayList6);
                            return;
                        default:
                            B1.e eVar6 = eVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                eVar6.getClass();
                                ((Context) eVar6.f56n).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = AbstractC0664g.y(th5);
                            }
                            c0276a.o(arrayList7);
                            return;
                    }
                }
            });
        } else {
            c0059m5.o(null);
        }
    }

    public static void e(g2.g gVar, final C0718o c0718o) {
        C0709f c0709f = C0709f.f8696d;
        C0059m c0059m = new C0059m(gVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.initialize", c0709f, (B1.b) null);
        if (c0718o != null) {
            c0059m.o(new InterfaceC0278c() { // from class: o2.d
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    LongSparseArray longSparseArray;
                    int i3;
                    int i4;
                    switch (r2) {
                        case 0:
                            C0718o c0718o2 = c0718o;
                            ArrayList arrayList = new ArrayList();
                            int i5 = 0;
                            while (true) {
                                try {
                                    longSparseArray = c0718o2.f8710m;
                                } catch (Throwable th) {
                                    arrayList = AbstractC0635d.A(th);
                                }
                                if (i5 < longSparseArray.size()) {
                                    ((AbstractC0715l) longSparseArray.valueAt(i5)).b();
                                    i5++;
                                } else {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c0276a.o(arrayList);
                                    return;
                                }
                            }
                        case 1:
                            C0718o c0718o3 = c0718o;
                            ArrayList arrayList2 = new ArrayList();
                            Long l3 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o3.getClass();
                                C0.e eVar = (C0.e) c0718o3.b(l3.longValue()).f8707c;
                                eVar.getClass();
                                Y.G g3 = (Y.G) eVar;
                                g3.J();
                                g3.J();
                                int d3 = g3.f3079y.d(g3.f3057d0.f3257e, false);
                                if (d3 == -1) {
                                    i3 = 2;
                                } else {
                                    i3 = 1;
                                }
                                g3.G(d3, i3, false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0635d.A(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0718o c0718o4 = c0718o;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                c0718o4.f8712o.f2428a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0635d.A(th3);
                            }
                            c0276a.o(arrayList3);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0718o c0718o5 = c0718o;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c0718o5.a((C0708e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0635d.A(th4);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            C0718o c0718o6 = c0718o;
                            ArrayList arrayList5 = new ArrayList();
                            Long l4 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o6.getClass();
                                c0718o6.b(l4.longValue()).b();
                                c0718o6.f8710m.remove(l4.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0635d.A(th5);
                            }
                            c0276a.o(arrayList5);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            C0718o c0718o7 = c0718o;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                c0718o7.c((Long) arrayList7.get(0), (Boolean) arrayList7.get(1));
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0635d.A(th6);
                            }
                            c0276a.o(arrayList6);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0718o c0718o8 = c0718o;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            try {
                                c0718o8.e((Long) arrayList9.get(0), (Double) arrayList9.get(1));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0635d.A(th7);
                            }
                            c0276a.o(arrayList8);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0718o c0718o9 = c0718o;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                c0718o9.d((Long) arrayList11.get(0), (Double) arrayList11.get(1));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = AbstractC0635d.A(th8);
                            }
                            c0276a.o(arrayList10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0718o c0718o10 = c0718o;
                            ArrayList arrayList12 = new ArrayList();
                            Long l5 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o10.getClass();
                                C0.e eVar2 = (C0.e) c0718o10.b(l5.longValue()).f8707c;
                                eVar2.getClass();
                                Y.G g4 = (Y.G) eVar2;
                                g4.J();
                                g4.J();
                                int d4 = g4.f3079y.d(g4.f3057d0.f3257e, true);
                                if (d4 == -1) {
                                    i4 = 2;
                                } else {
                                    i4 = 1;
                                }
                                g4.G(d4, i4, true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = AbstractC0635d.A(th9);
                            }
                            c0276a.o(arrayList12);
                            return;
                        case 9:
                            C0718o c0718o11 = c0718o;
                            ArrayList arrayList13 = new ArrayList();
                            Long l6 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o11.getClass();
                                AbstractC0715l b3 = c0718o11.b(l6.longValue());
                                InterfaceC0147s interfaceC0147s = b3.f8707c;
                                long p3 = ((Y.G) interfaceC0147s).p();
                                b3.f8705a.a(((Y.G) interfaceC0147s).k());
                                arrayList13.add(0, Long.valueOf(p3));
                            } catch (Throwable th10) {
                                arrayList13 = AbstractC0635d.A(th10);
                            }
                            c0276a.o(arrayList13);
                            return;
                        default:
                            C0718o c0718o12 = c0718o;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l7 = (Long) arrayList15.get(0);
                            Long l8 = (Long) arrayList15.get(1);
                            try {
                                c0718o12.getClass();
                                AbstractC0715l b4 = c0718o12.b(l7.longValue());
                                long intValue = l8.intValue();
                                C0.e eVar3 = (C0.e) b4.f8707c;
                                eVar3.getClass();
                                eVar3.i(intValue, ((Y.G) eVar3).o());
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = AbstractC0635d.A(th11);
                            }
                            c0276a.o(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0059m.o(null);
        }
        C0059m c0059m2 = new C0059m(gVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.create", c0709f, (B1.b) null);
        if (c0718o != null) {
            c0059m2.o(new InterfaceC0278c() { // from class: o2.d
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    LongSparseArray longSparseArray;
                    int i3;
                    int i4;
                    switch (r2) {
                        case 0:
                            C0718o c0718o2 = c0718o;
                            ArrayList arrayList = new ArrayList();
                            int i5 = 0;
                            while (true) {
                                try {
                                    longSparseArray = c0718o2.f8710m;
                                } catch (Throwable th) {
                                    arrayList = AbstractC0635d.A(th);
                                }
                                if (i5 < longSparseArray.size()) {
                                    ((AbstractC0715l) longSparseArray.valueAt(i5)).b();
                                    i5++;
                                } else {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c0276a.o(arrayList);
                                    return;
                                }
                            }
                        case 1:
                            C0718o c0718o3 = c0718o;
                            ArrayList arrayList2 = new ArrayList();
                            Long l3 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o3.getClass();
                                C0.e eVar = (C0.e) c0718o3.b(l3.longValue()).f8707c;
                                eVar.getClass();
                                Y.G g3 = (Y.G) eVar;
                                g3.J();
                                g3.J();
                                int d3 = g3.f3079y.d(g3.f3057d0.f3257e, false);
                                if (d3 == -1) {
                                    i3 = 2;
                                } else {
                                    i3 = 1;
                                }
                                g3.G(d3, i3, false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0635d.A(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0718o c0718o4 = c0718o;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                c0718o4.f8712o.f2428a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0635d.A(th3);
                            }
                            c0276a.o(arrayList3);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0718o c0718o5 = c0718o;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c0718o5.a((C0708e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0635d.A(th4);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            C0718o c0718o6 = c0718o;
                            ArrayList arrayList5 = new ArrayList();
                            Long l4 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o6.getClass();
                                c0718o6.b(l4.longValue()).b();
                                c0718o6.f8710m.remove(l4.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0635d.A(th5);
                            }
                            c0276a.o(arrayList5);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            C0718o c0718o7 = c0718o;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                c0718o7.c((Long) arrayList7.get(0), (Boolean) arrayList7.get(1));
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0635d.A(th6);
                            }
                            c0276a.o(arrayList6);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0718o c0718o8 = c0718o;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            try {
                                c0718o8.e((Long) arrayList9.get(0), (Double) arrayList9.get(1));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0635d.A(th7);
                            }
                            c0276a.o(arrayList8);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0718o c0718o9 = c0718o;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                c0718o9.d((Long) arrayList11.get(0), (Double) arrayList11.get(1));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = AbstractC0635d.A(th8);
                            }
                            c0276a.o(arrayList10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0718o c0718o10 = c0718o;
                            ArrayList arrayList12 = new ArrayList();
                            Long l5 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o10.getClass();
                                C0.e eVar2 = (C0.e) c0718o10.b(l5.longValue()).f8707c;
                                eVar2.getClass();
                                Y.G g4 = (Y.G) eVar2;
                                g4.J();
                                g4.J();
                                int d4 = g4.f3079y.d(g4.f3057d0.f3257e, true);
                                if (d4 == -1) {
                                    i4 = 2;
                                } else {
                                    i4 = 1;
                                }
                                g4.G(d4, i4, true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = AbstractC0635d.A(th9);
                            }
                            c0276a.o(arrayList12);
                            return;
                        case 9:
                            C0718o c0718o11 = c0718o;
                            ArrayList arrayList13 = new ArrayList();
                            Long l6 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o11.getClass();
                                AbstractC0715l b3 = c0718o11.b(l6.longValue());
                                InterfaceC0147s interfaceC0147s = b3.f8707c;
                                long p3 = ((Y.G) interfaceC0147s).p();
                                b3.f8705a.a(((Y.G) interfaceC0147s).k());
                                arrayList13.add(0, Long.valueOf(p3));
                            } catch (Throwable th10) {
                                arrayList13 = AbstractC0635d.A(th10);
                            }
                            c0276a.o(arrayList13);
                            return;
                        default:
                            C0718o c0718o12 = c0718o;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l7 = (Long) arrayList15.get(0);
                            Long l8 = (Long) arrayList15.get(1);
                            try {
                                c0718o12.getClass();
                                AbstractC0715l b4 = c0718o12.b(l7.longValue());
                                long intValue = l8.intValue();
                                C0.e eVar3 = (C0.e) b4.f8707c;
                                eVar3.getClass();
                                eVar3.i(intValue, ((Y.G) eVar3).o());
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = AbstractC0635d.A(th11);
                            }
                            c0276a.o(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0059m2.o(null);
        }
        C0059m c0059m3 = new C0059m(gVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.dispose", c0709f, (B1.b) null);
        if (c0718o != null) {
            c0059m3.o(new InterfaceC0278c() { // from class: o2.d
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    LongSparseArray longSparseArray;
                    int i3;
                    int i4;
                    switch (r2) {
                        case 0:
                            C0718o c0718o2 = c0718o;
                            ArrayList arrayList = new ArrayList();
                            int i5 = 0;
                            while (true) {
                                try {
                                    longSparseArray = c0718o2.f8710m;
                                } catch (Throwable th) {
                                    arrayList = AbstractC0635d.A(th);
                                }
                                if (i5 < longSparseArray.size()) {
                                    ((AbstractC0715l) longSparseArray.valueAt(i5)).b();
                                    i5++;
                                } else {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c0276a.o(arrayList);
                                    return;
                                }
                            }
                        case 1:
                            C0718o c0718o3 = c0718o;
                            ArrayList arrayList2 = new ArrayList();
                            Long l3 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o3.getClass();
                                C0.e eVar = (C0.e) c0718o3.b(l3.longValue()).f8707c;
                                eVar.getClass();
                                Y.G g3 = (Y.G) eVar;
                                g3.J();
                                g3.J();
                                int d3 = g3.f3079y.d(g3.f3057d0.f3257e, false);
                                if (d3 == -1) {
                                    i3 = 2;
                                } else {
                                    i3 = 1;
                                }
                                g3.G(d3, i3, false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0635d.A(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0718o c0718o4 = c0718o;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                c0718o4.f8712o.f2428a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0635d.A(th3);
                            }
                            c0276a.o(arrayList3);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0718o c0718o5 = c0718o;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c0718o5.a((C0708e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0635d.A(th4);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            C0718o c0718o6 = c0718o;
                            ArrayList arrayList5 = new ArrayList();
                            Long l4 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o6.getClass();
                                c0718o6.b(l4.longValue()).b();
                                c0718o6.f8710m.remove(l4.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0635d.A(th5);
                            }
                            c0276a.o(arrayList5);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            C0718o c0718o7 = c0718o;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                c0718o7.c((Long) arrayList7.get(0), (Boolean) arrayList7.get(1));
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0635d.A(th6);
                            }
                            c0276a.o(arrayList6);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0718o c0718o8 = c0718o;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            try {
                                c0718o8.e((Long) arrayList9.get(0), (Double) arrayList9.get(1));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0635d.A(th7);
                            }
                            c0276a.o(arrayList8);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0718o c0718o9 = c0718o;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                c0718o9.d((Long) arrayList11.get(0), (Double) arrayList11.get(1));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = AbstractC0635d.A(th8);
                            }
                            c0276a.o(arrayList10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0718o c0718o10 = c0718o;
                            ArrayList arrayList12 = new ArrayList();
                            Long l5 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o10.getClass();
                                C0.e eVar2 = (C0.e) c0718o10.b(l5.longValue()).f8707c;
                                eVar2.getClass();
                                Y.G g4 = (Y.G) eVar2;
                                g4.J();
                                g4.J();
                                int d4 = g4.f3079y.d(g4.f3057d0.f3257e, true);
                                if (d4 == -1) {
                                    i4 = 2;
                                } else {
                                    i4 = 1;
                                }
                                g4.G(d4, i4, true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = AbstractC0635d.A(th9);
                            }
                            c0276a.o(arrayList12);
                            return;
                        case 9:
                            C0718o c0718o11 = c0718o;
                            ArrayList arrayList13 = new ArrayList();
                            Long l6 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o11.getClass();
                                AbstractC0715l b3 = c0718o11.b(l6.longValue());
                                InterfaceC0147s interfaceC0147s = b3.f8707c;
                                long p3 = ((Y.G) interfaceC0147s).p();
                                b3.f8705a.a(((Y.G) interfaceC0147s).k());
                                arrayList13.add(0, Long.valueOf(p3));
                            } catch (Throwable th10) {
                                arrayList13 = AbstractC0635d.A(th10);
                            }
                            c0276a.o(arrayList13);
                            return;
                        default:
                            C0718o c0718o12 = c0718o;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l7 = (Long) arrayList15.get(0);
                            Long l8 = (Long) arrayList15.get(1);
                            try {
                                c0718o12.getClass();
                                AbstractC0715l b4 = c0718o12.b(l7.longValue());
                                long intValue = l8.intValue();
                                C0.e eVar3 = (C0.e) b4.f8707c;
                                eVar3.getClass();
                                eVar3.i(intValue, ((Y.G) eVar3).o());
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = AbstractC0635d.A(th11);
                            }
                            c0276a.o(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0059m3.o(null);
        }
        C0059m c0059m4 = new C0059m(gVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setLooping", c0709f, (B1.b) null);
        if (c0718o != null) {
            c0059m4.o(new InterfaceC0278c() { // from class: o2.d
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    LongSparseArray longSparseArray;
                    int i3;
                    int i4;
                    switch (r2) {
                        case 0:
                            C0718o c0718o2 = c0718o;
                            ArrayList arrayList = new ArrayList();
                            int i5 = 0;
                            while (true) {
                                try {
                                    longSparseArray = c0718o2.f8710m;
                                } catch (Throwable th) {
                                    arrayList = AbstractC0635d.A(th);
                                }
                                if (i5 < longSparseArray.size()) {
                                    ((AbstractC0715l) longSparseArray.valueAt(i5)).b();
                                    i5++;
                                } else {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c0276a.o(arrayList);
                                    return;
                                }
                            }
                        case 1:
                            C0718o c0718o3 = c0718o;
                            ArrayList arrayList2 = new ArrayList();
                            Long l3 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o3.getClass();
                                C0.e eVar = (C0.e) c0718o3.b(l3.longValue()).f8707c;
                                eVar.getClass();
                                Y.G g3 = (Y.G) eVar;
                                g3.J();
                                g3.J();
                                int d3 = g3.f3079y.d(g3.f3057d0.f3257e, false);
                                if (d3 == -1) {
                                    i3 = 2;
                                } else {
                                    i3 = 1;
                                }
                                g3.G(d3, i3, false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0635d.A(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0718o c0718o4 = c0718o;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                c0718o4.f8712o.f2428a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0635d.A(th3);
                            }
                            c0276a.o(arrayList3);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0718o c0718o5 = c0718o;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c0718o5.a((C0708e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0635d.A(th4);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            C0718o c0718o6 = c0718o;
                            ArrayList arrayList5 = new ArrayList();
                            Long l4 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o6.getClass();
                                c0718o6.b(l4.longValue()).b();
                                c0718o6.f8710m.remove(l4.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0635d.A(th5);
                            }
                            c0276a.o(arrayList5);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            C0718o c0718o7 = c0718o;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                c0718o7.c((Long) arrayList7.get(0), (Boolean) arrayList7.get(1));
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0635d.A(th6);
                            }
                            c0276a.o(arrayList6);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0718o c0718o8 = c0718o;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            try {
                                c0718o8.e((Long) arrayList9.get(0), (Double) arrayList9.get(1));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0635d.A(th7);
                            }
                            c0276a.o(arrayList8);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0718o c0718o9 = c0718o;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                c0718o9.d((Long) arrayList11.get(0), (Double) arrayList11.get(1));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = AbstractC0635d.A(th8);
                            }
                            c0276a.o(arrayList10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0718o c0718o10 = c0718o;
                            ArrayList arrayList12 = new ArrayList();
                            Long l5 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o10.getClass();
                                C0.e eVar2 = (C0.e) c0718o10.b(l5.longValue()).f8707c;
                                eVar2.getClass();
                                Y.G g4 = (Y.G) eVar2;
                                g4.J();
                                g4.J();
                                int d4 = g4.f3079y.d(g4.f3057d0.f3257e, true);
                                if (d4 == -1) {
                                    i4 = 2;
                                } else {
                                    i4 = 1;
                                }
                                g4.G(d4, i4, true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = AbstractC0635d.A(th9);
                            }
                            c0276a.o(arrayList12);
                            return;
                        case 9:
                            C0718o c0718o11 = c0718o;
                            ArrayList arrayList13 = new ArrayList();
                            Long l6 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o11.getClass();
                                AbstractC0715l b3 = c0718o11.b(l6.longValue());
                                InterfaceC0147s interfaceC0147s = b3.f8707c;
                                long p3 = ((Y.G) interfaceC0147s).p();
                                b3.f8705a.a(((Y.G) interfaceC0147s).k());
                                arrayList13.add(0, Long.valueOf(p3));
                            } catch (Throwable th10) {
                                arrayList13 = AbstractC0635d.A(th10);
                            }
                            c0276a.o(arrayList13);
                            return;
                        default:
                            C0718o c0718o12 = c0718o;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l7 = (Long) arrayList15.get(0);
                            Long l8 = (Long) arrayList15.get(1);
                            try {
                                c0718o12.getClass();
                                AbstractC0715l b4 = c0718o12.b(l7.longValue());
                                long intValue = l8.intValue();
                                C0.e eVar3 = (C0.e) b4.f8707c;
                                eVar3.getClass();
                                eVar3.i(intValue, ((Y.G) eVar3).o());
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = AbstractC0635d.A(th11);
                            }
                            c0276a.o(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0059m4.o(null);
        }
        C0059m c0059m5 = new C0059m(gVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setVolume", c0709f, (B1.b) null);
        if (c0718o != null) {
            c0059m5.o(new InterfaceC0278c() { // from class: o2.d
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    LongSparseArray longSparseArray;
                    int i3;
                    int i4;
                    switch (r2) {
                        case 0:
                            C0718o c0718o2 = c0718o;
                            ArrayList arrayList = new ArrayList();
                            int i5 = 0;
                            while (true) {
                                try {
                                    longSparseArray = c0718o2.f8710m;
                                } catch (Throwable th) {
                                    arrayList = AbstractC0635d.A(th);
                                }
                                if (i5 < longSparseArray.size()) {
                                    ((AbstractC0715l) longSparseArray.valueAt(i5)).b();
                                    i5++;
                                } else {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c0276a.o(arrayList);
                                    return;
                                }
                            }
                        case 1:
                            C0718o c0718o3 = c0718o;
                            ArrayList arrayList2 = new ArrayList();
                            Long l3 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o3.getClass();
                                C0.e eVar = (C0.e) c0718o3.b(l3.longValue()).f8707c;
                                eVar.getClass();
                                Y.G g3 = (Y.G) eVar;
                                g3.J();
                                g3.J();
                                int d3 = g3.f3079y.d(g3.f3057d0.f3257e, false);
                                if (d3 == -1) {
                                    i3 = 2;
                                } else {
                                    i3 = 1;
                                }
                                g3.G(d3, i3, false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0635d.A(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0718o c0718o4 = c0718o;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                c0718o4.f8712o.f2428a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0635d.A(th3);
                            }
                            c0276a.o(arrayList3);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0718o c0718o5 = c0718o;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c0718o5.a((C0708e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0635d.A(th4);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            C0718o c0718o6 = c0718o;
                            ArrayList arrayList5 = new ArrayList();
                            Long l4 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o6.getClass();
                                c0718o6.b(l4.longValue()).b();
                                c0718o6.f8710m.remove(l4.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0635d.A(th5);
                            }
                            c0276a.o(arrayList5);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            C0718o c0718o7 = c0718o;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                c0718o7.c((Long) arrayList7.get(0), (Boolean) arrayList7.get(1));
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0635d.A(th6);
                            }
                            c0276a.o(arrayList6);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0718o c0718o8 = c0718o;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            try {
                                c0718o8.e((Long) arrayList9.get(0), (Double) arrayList9.get(1));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0635d.A(th7);
                            }
                            c0276a.o(arrayList8);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0718o c0718o9 = c0718o;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                c0718o9.d((Long) arrayList11.get(0), (Double) arrayList11.get(1));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = AbstractC0635d.A(th8);
                            }
                            c0276a.o(arrayList10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0718o c0718o10 = c0718o;
                            ArrayList arrayList12 = new ArrayList();
                            Long l5 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o10.getClass();
                                C0.e eVar2 = (C0.e) c0718o10.b(l5.longValue()).f8707c;
                                eVar2.getClass();
                                Y.G g4 = (Y.G) eVar2;
                                g4.J();
                                g4.J();
                                int d4 = g4.f3079y.d(g4.f3057d0.f3257e, true);
                                if (d4 == -1) {
                                    i4 = 2;
                                } else {
                                    i4 = 1;
                                }
                                g4.G(d4, i4, true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = AbstractC0635d.A(th9);
                            }
                            c0276a.o(arrayList12);
                            return;
                        case 9:
                            C0718o c0718o11 = c0718o;
                            ArrayList arrayList13 = new ArrayList();
                            Long l6 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o11.getClass();
                                AbstractC0715l b3 = c0718o11.b(l6.longValue());
                                InterfaceC0147s interfaceC0147s = b3.f8707c;
                                long p3 = ((Y.G) interfaceC0147s).p();
                                b3.f8705a.a(((Y.G) interfaceC0147s).k());
                                arrayList13.add(0, Long.valueOf(p3));
                            } catch (Throwable th10) {
                                arrayList13 = AbstractC0635d.A(th10);
                            }
                            c0276a.o(arrayList13);
                            return;
                        default:
                            C0718o c0718o12 = c0718o;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l7 = (Long) arrayList15.get(0);
                            Long l8 = (Long) arrayList15.get(1);
                            try {
                                c0718o12.getClass();
                                AbstractC0715l b4 = c0718o12.b(l7.longValue());
                                long intValue = l8.intValue();
                                C0.e eVar3 = (C0.e) b4.f8707c;
                                eVar3.getClass();
                                eVar3.i(intValue, ((Y.G) eVar3).o());
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = AbstractC0635d.A(th11);
                            }
                            c0276a.o(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0059m5.o(null);
        }
        C0059m c0059m6 = new C0059m(gVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setPlaybackSpeed", c0709f, (B1.b) null);
        if (c0718o != null) {
            c0059m6.o(new InterfaceC0278c() { // from class: o2.d
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    LongSparseArray longSparseArray;
                    int i3;
                    int i4;
                    switch (r2) {
                        case 0:
                            C0718o c0718o2 = c0718o;
                            ArrayList arrayList = new ArrayList();
                            int i5 = 0;
                            while (true) {
                                try {
                                    longSparseArray = c0718o2.f8710m;
                                } catch (Throwable th) {
                                    arrayList = AbstractC0635d.A(th);
                                }
                                if (i5 < longSparseArray.size()) {
                                    ((AbstractC0715l) longSparseArray.valueAt(i5)).b();
                                    i5++;
                                } else {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c0276a.o(arrayList);
                                    return;
                                }
                            }
                        case 1:
                            C0718o c0718o3 = c0718o;
                            ArrayList arrayList2 = new ArrayList();
                            Long l3 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o3.getClass();
                                C0.e eVar = (C0.e) c0718o3.b(l3.longValue()).f8707c;
                                eVar.getClass();
                                Y.G g3 = (Y.G) eVar;
                                g3.J();
                                g3.J();
                                int d3 = g3.f3079y.d(g3.f3057d0.f3257e, false);
                                if (d3 == -1) {
                                    i3 = 2;
                                } else {
                                    i3 = 1;
                                }
                                g3.G(d3, i3, false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0635d.A(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0718o c0718o4 = c0718o;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                c0718o4.f8712o.f2428a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0635d.A(th3);
                            }
                            c0276a.o(arrayList3);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0718o c0718o5 = c0718o;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c0718o5.a((C0708e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0635d.A(th4);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            C0718o c0718o6 = c0718o;
                            ArrayList arrayList5 = new ArrayList();
                            Long l4 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o6.getClass();
                                c0718o6.b(l4.longValue()).b();
                                c0718o6.f8710m.remove(l4.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0635d.A(th5);
                            }
                            c0276a.o(arrayList5);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            C0718o c0718o7 = c0718o;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                c0718o7.c((Long) arrayList7.get(0), (Boolean) arrayList7.get(1));
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0635d.A(th6);
                            }
                            c0276a.o(arrayList6);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0718o c0718o8 = c0718o;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            try {
                                c0718o8.e((Long) arrayList9.get(0), (Double) arrayList9.get(1));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0635d.A(th7);
                            }
                            c0276a.o(arrayList8);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0718o c0718o9 = c0718o;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                c0718o9.d((Long) arrayList11.get(0), (Double) arrayList11.get(1));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = AbstractC0635d.A(th8);
                            }
                            c0276a.o(arrayList10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0718o c0718o10 = c0718o;
                            ArrayList arrayList12 = new ArrayList();
                            Long l5 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o10.getClass();
                                C0.e eVar2 = (C0.e) c0718o10.b(l5.longValue()).f8707c;
                                eVar2.getClass();
                                Y.G g4 = (Y.G) eVar2;
                                g4.J();
                                g4.J();
                                int d4 = g4.f3079y.d(g4.f3057d0.f3257e, true);
                                if (d4 == -1) {
                                    i4 = 2;
                                } else {
                                    i4 = 1;
                                }
                                g4.G(d4, i4, true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = AbstractC0635d.A(th9);
                            }
                            c0276a.o(arrayList12);
                            return;
                        case 9:
                            C0718o c0718o11 = c0718o;
                            ArrayList arrayList13 = new ArrayList();
                            Long l6 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o11.getClass();
                                AbstractC0715l b3 = c0718o11.b(l6.longValue());
                                InterfaceC0147s interfaceC0147s = b3.f8707c;
                                long p3 = ((Y.G) interfaceC0147s).p();
                                b3.f8705a.a(((Y.G) interfaceC0147s).k());
                                arrayList13.add(0, Long.valueOf(p3));
                            } catch (Throwable th10) {
                                arrayList13 = AbstractC0635d.A(th10);
                            }
                            c0276a.o(arrayList13);
                            return;
                        default:
                            C0718o c0718o12 = c0718o;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l7 = (Long) arrayList15.get(0);
                            Long l8 = (Long) arrayList15.get(1);
                            try {
                                c0718o12.getClass();
                                AbstractC0715l b4 = c0718o12.b(l7.longValue());
                                long intValue = l8.intValue();
                                C0.e eVar3 = (C0.e) b4.f8707c;
                                eVar3.getClass();
                                eVar3.i(intValue, ((Y.G) eVar3).o());
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = AbstractC0635d.A(th11);
                            }
                            c0276a.o(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0059m6.o(null);
        }
        C0059m c0059m7 = new C0059m(gVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.play", c0709f, (B1.b) null);
        if (c0718o != null) {
            c0059m7.o(new InterfaceC0278c() { // from class: o2.d
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    LongSparseArray longSparseArray;
                    int i3;
                    int i4;
                    switch (r2) {
                        case 0:
                            C0718o c0718o2 = c0718o;
                            ArrayList arrayList = new ArrayList();
                            int i5 = 0;
                            while (true) {
                                try {
                                    longSparseArray = c0718o2.f8710m;
                                } catch (Throwable th) {
                                    arrayList = AbstractC0635d.A(th);
                                }
                                if (i5 < longSparseArray.size()) {
                                    ((AbstractC0715l) longSparseArray.valueAt(i5)).b();
                                    i5++;
                                } else {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c0276a.o(arrayList);
                                    return;
                                }
                            }
                        case 1:
                            C0718o c0718o3 = c0718o;
                            ArrayList arrayList2 = new ArrayList();
                            Long l3 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o3.getClass();
                                C0.e eVar = (C0.e) c0718o3.b(l3.longValue()).f8707c;
                                eVar.getClass();
                                Y.G g3 = (Y.G) eVar;
                                g3.J();
                                g3.J();
                                int d3 = g3.f3079y.d(g3.f3057d0.f3257e, false);
                                if (d3 == -1) {
                                    i3 = 2;
                                } else {
                                    i3 = 1;
                                }
                                g3.G(d3, i3, false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0635d.A(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0718o c0718o4 = c0718o;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                c0718o4.f8712o.f2428a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0635d.A(th3);
                            }
                            c0276a.o(arrayList3);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0718o c0718o5 = c0718o;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c0718o5.a((C0708e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0635d.A(th4);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            C0718o c0718o6 = c0718o;
                            ArrayList arrayList5 = new ArrayList();
                            Long l4 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o6.getClass();
                                c0718o6.b(l4.longValue()).b();
                                c0718o6.f8710m.remove(l4.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0635d.A(th5);
                            }
                            c0276a.o(arrayList5);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            C0718o c0718o7 = c0718o;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                c0718o7.c((Long) arrayList7.get(0), (Boolean) arrayList7.get(1));
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0635d.A(th6);
                            }
                            c0276a.o(arrayList6);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0718o c0718o8 = c0718o;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            try {
                                c0718o8.e((Long) arrayList9.get(0), (Double) arrayList9.get(1));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0635d.A(th7);
                            }
                            c0276a.o(arrayList8);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0718o c0718o9 = c0718o;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                c0718o9.d((Long) arrayList11.get(0), (Double) arrayList11.get(1));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = AbstractC0635d.A(th8);
                            }
                            c0276a.o(arrayList10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0718o c0718o10 = c0718o;
                            ArrayList arrayList12 = new ArrayList();
                            Long l5 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o10.getClass();
                                C0.e eVar2 = (C0.e) c0718o10.b(l5.longValue()).f8707c;
                                eVar2.getClass();
                                Y.G g4 = (Y.G) eVar2;
                                g4.J();
                                g4.J();
                                int d4 = g4.f3079y.d(g4.f3057d0.f3257e, true);
                                if (d4 == -1) {
                                    i4 = 2;
                                } else {
                                    i4 = 1;
                                }
                                g4.G(d4, i4, true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = AbstractC0635d.A(th9);
                            }
                            c0276a.o(arrayList12);
                            return;
                        case 9:
                            C0718o c0718o11 = c0718o;
                            ArrayList arrayList13 = new ArrayList();
                            Long l6 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o11.getClass();
                                AbstractC0715l b3 = c0718o11.b(l6.longValue());
                                InterfaceC0147s interfaceC0147s = b3.f8707c;
                                long p3 = ((Y.G) interfaceC0147s).p();
                                b3.f8705a.a(((Y.G) interfaceC0147s).k());
                                arrayList13.add(0, Long.valueOf(p3));
                            } catch (Throwable th10) {
                                arrayList13 = AbstractC0635d.A(th10);
                            }
                            c0276a.o(arrayList13);
                            return;
                        default:
                            C0718o c0718o12 = c0718o;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l7 = (Long) arrayList15.get(0);
                            Long l8 = (Long) arrayList15.get(1);
                            try {
                                c0718o12.getClass();
                                AbstractC0715l b4 = c0718o12.b(l7.longValue());
                                long intValue = l8.intValue();
                                C0.e eVar3 = (C0.e) b4.f8707c;
                                eVar3.getClass();
                                eVar3.i(intValue, ((Y.G) eVar3).o());
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = AbstractC0635d.A(th11);
                            }
                            c0276a.o(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0059m7.o(null);
        }
        C0059m c0059m8 = new C0059m(gVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.position", c0709f, (B1.b) null);
        if (c0718o != null) {
            c0059m8.o(new InterfaceC0278c() { // from class: o2.d
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    LongSparseArray longSparseArray;
                    int i3;
                    int i4;
                    switch (r2) {
                        case 0:
                            C0718o c0718o2 = c0718o;
                            ArrayList arrayList = new ArrayList();
                            int i5 = 0;
                            while (true) {
                                try {
                                    longSparseArray = c0718o2.f8710m;
                                } catch (Throwable th) {
                                    arrayList = AbstractC0635d.A(th);
                                }
                                if (i5 < longSparseArray.size()) {
                                    ((AbstractC0715l) longSparseArray.valueAt(i5)).b();
                                    i5++;
                                } else {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c0276a.o(arrayList);
                                    return;
                                }
                            }
                        case 1:
                            C0718o c0718o3 = c0718o;
                            ArrayList arrayList2 = new ArrayList();
                            Long l3 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o3.getClass();
                                C0.e eVar = (C0.e) c0718o3.b(l3.longValue()).f8707c;
                                eVar.getClass();
                                Y.G g3 = (Y.G) eVar;
                                g3.J();
                                g3.J();
                                int d3 = g3.f3079y.d(g3.f3057d0.f3257e, false);
                                if (d3 == -1) {
                                    i3 = 2;
                                } else {
                                    i3 = 1;
                                }
                                g3.G(d3, i3, false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0635d.A(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0718o c0718o4 = c0718o;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                c0718o4.f8712o.f2428a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0635d.A(th3);
                            }
                            c0276a.o(arrayList3);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0718o c0718o5 = c0718o;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c0718o5.a((C0708e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0635d.A(th4);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            C0718o c0718o6 = c0718o;
                            ArrayList arrayList5 = new ArrayList();
                            Long l4 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o6.getClass();
                                c0718o6.b(l4.longValue()).b();
                                c0718o6.f8710m.remove(l4.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0635d.A(th5);
                            }
                            c0276a.o(arrayList5);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            C0718o c0718o7 = c0718o;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                c0718o7.c((Long) arrayList7.get(0), (Boolean) arrayList7.get(1));
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0635d.A(th6);
                            }
                            c0276a.o(arrayList6);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0718o c0718o8 = c0718o;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            try {
                                c0718o8.e((Long) arrayList9.get(0), (Double) arrayList9.get(1));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0635d.A(th7);
                            }
                            c0276a.o(arrayList8);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0718o c0718o9 = c0718o;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                c0718o9.d((Long) arrayList11.get(0), (Double) arrayList11.get(1));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = AbstractC0635d.A(th8);
                            }
                            c0276a.o(arrayList10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0718o c0718o10 = c0718o;
                            ArrayList arrayList12 = new ArrayList();
                            Long l5 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o10.getClass();
                                C0.e eVar2 = (C0.e) c0718o10.b(l5.longValue()).f8707c;
                                eVar2.getClass();
                                Y.G g4 = (Y.G) eVar2;
                                g4.J();
                                g4.J();
                                int d4 = g4.f3079y.d(g4.f3057d0.f3257e, true);
                                if (d4 == -1) {
                                    i4 = 2;
                                } else {
                                    i4 = 1;
                                }
                                g4.G(d4, i4, true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = AbstractC0635d.A(th9);
                            }
                            c0276a.o(arrayList12);
                            return;
                        case 9:
                            C0718o c0718o11 = c0718o;
                            ArrayList arrayList13 = new ArrayList();
                            Long l6 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o11.getClass();
                                AbstractC0715l b3 = c0718o11.b(l6.longValue());
                                InterfaceC0147s interfaceC0147s = b3.f8707c;
                                long p3 = ((Y.G) interfaceC0147s).p();
                                b3.f8705a.a(((Y.G) interfaceC0147s).k());
                                arrayList13.add(0, Long.valueOf(p3));
                            } catch (Throwable th10) {
                                arrayList13 = AbstractC0635d.A(th10);
                            }
                            c0276a.o(arrayList13);
                            return;
                        default:
                            C0718o c0718o12 = c0718o;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l7 = (Long) arrayList15.get(0);
                            Long l8 = (Long) arrayList15.get(1);
                            try {
                                c0718o12.getClass();
                                AbstractC0715l b4 = c0718o12.b(l7.longValue());
                                long intValue = l8.intValue();
                                C0.e eVar3 = (C0.e) b4.f8707c;
                                eVar3.getClass();
                                eVar3.i(intValue, ((Y.G) eVar3).o());
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = AbstractC0635d.A(th11);
                            }
                            c0276a.o(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0059m8.o(null);
        }
        C0059m c0059m9 = new C0059m(gVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.seekTo", c0709f, (B1.b) null);
        if (c0718o != null) {
            c0059m9.o(new InterfaceC0278c() { // from class: o2.d
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    LongSparseArray longSparseArray;
                    int i3;
                    int i4;
                    switch (r2) {
                        case 0:
                            C0718o c0718o2 = c0718o;
                            ArrayList arrayList = new ArrayList();
                            int i5 = 0;
                            while (true) {
                                try {
                                    longSparseArray = c0718o2.f8710m;
                                } catch (Throwable th) {
                                    arrayList = AbstractC0635d.A(th);
                                }
                                if (i5 < longSparseArray.size()) {
                                    ((AbstractC0715l) longSparseArray.valueAt(i5)).b();
                                    i5++;
                                } else {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c0276a.o(arrayList);
                                    return;
                                }
                            }
                        case 1:
                            C0718o c0718o3 = c0718o;
                            ArrayList arrayList2 = new ArrayList();
                            Long l3 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o3.getClass();
                                C0.e eVar = (C0.e) c0718o3.b(l3.longValue()).f8707c;
                                eVar.getClass();
                                Y.G g3 = (Y.G) eVar;
                                g3.J();
                                g3.J();
                                int d3 = g3.f3079y.d(g3.f3057d0.f3257e, false);
                                if (d3 == -1) {
                                    i3 = 2;
                                } else {
                                    i3 = 1;
                                }
                                g3.G(d3, i3, false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0635d.A(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0718o c0718o4 = c0718o;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                c0718o4.f8712o.f2428a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0635d.A(th3);
                            }
                            c0276a.o(arrayList3);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0718o c0718o5 = c0718o;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c0718o5.a((C0708e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0635d.A(th4);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            C0718o c0718o6 = c0718o;
                            ArrayList arrayList5 = new ArrayList();
                            Long l4 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o6.getClass();
                                c0718o6.b(l4.longValue()).b();
                                c0718o6.f8710m.remove(l4.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0635d.A(th5);
                            }
                            c0276a.o(arrayList5);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            C0718o c0718o7 = c0718o;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                c0718o7.c((Long) arrayList7.get(0), (Boolean) arrayList7.get(1));
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0635d.A(th6);
                            }
                            c0276a.o(arrayList6);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0718o c0718o8 = c0718o;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            try {
                                c0718o8.e((Long) arrayList9.get(0), (Double) arrayList9.get(1));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0635d.A(th7);
                            }
                            c0276a.o(arrayList8);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0718o c0718o9 = c0718o;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                c0718o9.d((Long) arrayList11.get(0), (Double) arrayList11.get(1));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = AbstractC0635d.A(th8);
                            }
                            c0276a.o(arrayList10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0718o c0718o10 = c0718o;
                            ArrayList arrayList12 = new ArrayList();
                            Long l5 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o10.getClass();
                                C0.e eVar2 = (C0.e) c0718o10.b(l5.longValue()).f8707c;
                                eVar2.getClass();
                                Y.G g4 = (Y.G) eVar2;
                                g4.J();
                                g4.J();
                                int d4 = g4.f3079y.d(g4.f3057d0.f3257e, true);
                                if (d4 == -1) {
                                    i4 = 2;
                                } else {
                                    i4 = 1;
                                }
                                g4.G(d4, i4, true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = AbstractC0635d.A(th9);
                            }
                            c0276a.o(arrayList12);
                            return;
                        case 9:
                            C0718o c0718o11 = c0718o;
                            ArrayList arrayList13 = new ArrayList();
                            Long l6 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o11.getClass();
                                AbstractC0715l b3 = c0718o11.b(l6.longValue());
                                InterfaceC0147s interfaceC0147s = b3.f8707c;
                                long p3 = ((Y.G) interfaceC0147s).p();
                                b3.f8705a.a(((Y.G) interfaceC0147s).k());
                                arrayList13.add(0, Long.valueOf(p3));
                            } catch (Throwable th10) {
                                arrayList13 = AbstractC0635d.A(th10);
                            }
                            c0276a.o(arrayList13);
                            return;
                        default:
                            C0718o c0718o12 = c0718o;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l7 = (Long) arrayList15.get(0);
                            Long l8 = (Long) arrayList15.get(1);
                            try {
                                c0718o12.getClass();
                                AbstractC0715l b4 = c0718o12.b(l7.longValue());
                                long intValue = l8.intValue();
                                C0.e eVar3 = (C0.e) b4.f8707c;
                                eVar3.getClass();
                                eVar3.i(intValue, ((Y.G) eVar3).o());
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = AbstractC0635d.A(th11);
                            }
                            c0276a.o(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0059m9.o(null);
        }
        C0059m c0059m10 = new C0059m(gVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.pause", c0709f, (B1.b) null);
        if (c0718o != null) {
            c0059m10.o(new InterfaceC0278c() { // from class: o2.d
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    LongSparseArray longSparseArray;
                    int i3;
                    int i4;
                    switch (r2) {
                        case 0:
                            C0718o c0718o2 = c0718o;
                            ArrayList arrayList = new ArrayList();
                            int i5 = 0;
                            while (true) {
                                try {
                                    longSparseArray = c0718o2.f8710m;
                                } catch (Throwable th) {
                                    arrayList = AbstractC0635d.A(th);
                                }
                                if (i5 < longSparseArray.size()) {
                                    ((AbstractC0715l) longSparseArray.valueAt(i5)).b();
                                    i5++;
                                } else {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c0276a.o(arrayList);
                                    return;
                                }
                            }
                        case 1:
                            C0718o c0718o3 = c0718o;
                            ArrayList arrayList2 = new ArrayList();
                            Long l3 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o3.getClass();
                                C0.e eVar = (C0.e) c0718o3.b(l3.longValue()).f8707c;
                                eVar.getClass();
                                Y.G g3 = (Y.G) eVar;
                                g3.J();
                                g3.J();
                                int d3 = g3.f3079y.d(g3.f3057d0.f3257e, false);
                                if (d3 == -1) {
                                    i3 = 2;
                                } else {
                                    i3 = 1;
                                }
                                g3.G(d3, i3, false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0635d.A(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0718o c0718o4 = c0718o;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                c0718o4.f8712o.f2428a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0635d.A(th3);
                            }
                            c0276a.o(arrayList3);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0718o c0718o5 = c0718o;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c0718o5.a((C0708e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0635d.A(th4);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            C0718o c0718o6 = c0718o;
                            ArrayList arrayList5 = new ArrayList();
                            Long l4 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o6.getClass();
                                c0718o6.b(l4.longValue()).b();
                                c0718o6.f8710m.remove(l4.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0635d.A(th5);
                            }
                            c0276a.o(arrayList5);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            C0718o c0718o7 = c0718o;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                c0718o7.c((Long) arrayList7.get(0), (Boolean) arrayList7.get(1));
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0635d.A(th6);
                            }
                            c0276a.o(arrayList6);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0718o c0718o8 = c0718o;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            try {
                                c0718o8.e((Long) arrayList9.get(0), (Double) arrayList9.get(1));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0635d.A(th7);
                            }
                            c0276a.o(arrayList8);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0718o c0718o9 = c0718o;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                c0718o9.d((Long) arrayList11.get(0), (Double) arrayList11.get(1));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = AbstractC0635d.A(th8);
                            }
                            c0276a.o(arrayList10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0718o c0718o10 = c0718o;
                            ArrayList arrayList12 = new ArrayList();
                            Long l5 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o10.getClass();
                                C0.e eVar2 = (C0.e) c0718o10.b(l5.longValue()).f8707c;
                                eVar2.getClass();
                                Y.G g4 = (Y.G) eVar2;
                                g4.J();
                                g4.J();
                                int d4 = g4.f3079y.d(g4.f3057d0.f3257e, true);
                                if (d4 == -1) {
                                    i4 = 2;
                                } else {
                                    i4 = 1;
                                }
                                g4.G(d4, i4, true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = AbstractC0635d.A(th9);
                            }
                            c0276a.o(arrayList12);
                            return;
                        case 9:
                            C0718o c0718o11 = c0718o;
                            ArrayList arrayList13 = new ArrayList();
                            Long l6 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o11.getClass();
                                AbstractC0715l b3 = c0718o11.b(l6.longValue());
                                InterfaceC0147s interfaceC0147s = b3.f8707c;
                                long p3 = ((Y.G) interfaceC0147s).p();
                                b3.f8705a.a(((Y.G) interfaceC0147s).k());
                                arrayList13.add(0, Long.valueOf(p3));
                            } catch (Throwable th10) {
                                arrayList13 = AbstractC0635d.A(th10);
                            }
                            c0276a.o(arrayList13);
                            return;
                        default:
                            C0718o c0718o12 = c0718o;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l7 = (Long) arrayList15.get(0);
                            Long l8 = (Long) arrayList15.get(1);
                            try {
                                c0718o12.getClass();
                                AbstractC0715l b4 = c0718o12.b(l7.longValue());
                                long intValue = l8.intValue();
                                C0.e eVar3 = (C0.e) b4.f8707c;
                                eVar3.getClass();
                                eVar3.i(intValue, ((Y.G) eVar3).o());
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = AbstractC0635d.A(th11);
                            }
                            c0276a.o(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0059m10.o(null);
        }
        C0059m c0059m11 = new C0059m(gVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setMixWithOthers", c0709f, (B1.b) null);
        if (c0718o != null) {
            c0059m11.o(new InterfaceC0278c() { // from class: o2.d
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    LongSparseArray longSparseArray;
                    int i3;
                    int i4;
                    switch (r2) {
                        case 0:
                            C0718o c0718o2 = c0718o;
                            ArrayList arrayList = new ArrayList();
                            int i5 = 0;
                            while (true) {
                                try {
                                    longSparseArray = c0718o2.f8710m;
                                } catch (Throwable th) {
                                    arrayList = AbstractC0635d.A(th);
                                }
                                if (i5 < longSparseArray.size()) {
                                    ((AbstractC0715l) longSparseArray.valueAt(i5)).b();
                                    i5++;
                                } else {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c0276a.o(arrayList);
                                    return;
                                }
                            }
                        case 1:
                            C0718o c0718o3 = c0718o;
                            ArrayList arrayList2 = new ArrayList();
                            Long l3 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o3.getClass();
                                C0.e eVar = (C0.e) c0718o3.b(l3.longValue()).f8707c;
                                eVar.getClass();
                                Y.G g3 = (Y.G) eVar;
                                g3.J();
                                g3.J();
                                int d3 = g3.f3079y.d(g3.f3057d0.f3257e, false);
                                if (d3 == -1) {
                                    i3 = 2;
                                } else {
                                    i3 = 1;
                                }
                                g3.G(d3, i3, false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0635d.A(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0718o c0718o4 = c0718o;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                c0718o4.f8712o.f2428a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0635d.A(th3);
                            }
                            c0276a.o(arrayList3);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0718o c0718o5 = c0718o;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c0718o5.a((C0708e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0635d.A(th4);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            C0718o c0718o6 = c0718o;
                            ArrayList arrayList5 = new ArrayList();
                            Long l4 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o6.getClass();
                                c0718o6.b(l4.longValue()).b();
                                c0718o6.f8710m.remove(l4.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0635d.A(th5);
                            }
                            c0276a.o(arrayList5);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            C0718o c0718o7 = c0718o;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                c0718o7.c((Long) arrayList7.get(0), (Boolean) arrayList7.get(1));
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0635d.A(th6);
                            }
                            c0276a.o(arrayList6);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0718o c0718o8 = c0718o;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            try {
                                c0718o8.e((Long) arrayList9.get(0), (Double) arrayList9.get(1));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0635d.A(th7);
                            }
                            c0276a.o(arrayList8);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0718o c0718o9 = c0718o;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                c0718o9.d((Long) arrayList11.get(0), (Double) arrayList11.get(1));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = AbstractC0635d.A(th8);
                            }
                            c0276a.o(arrayList10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            C0718o c0718o10 = c0718o;
                            ArrayList arrayList12 = new ArrayList();
                            Long l5 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o10.getClass();
                                C0.e eVar2 = (C0.e) c0718o10.b(l5.longValue()).f8707c;
                                eVar2.getClass();
                                Y.G g4 = (Y.G) eVar2;
                                g4.J();
                                g4.J();
                                int d4 = g4.f3079y.d(g4.f3057d0.f3257e, true);
                                if (d4 == -1) {
                                    i4 = 2;
                                } else {
                                    i4 = 1;
                                }
                                g4.G(d4, i4, true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = AbstractC0635d.A(th9);
                            }
                            c0276a.o(arrayList12);
                            return;
                        case 9:
                            C0718o c0718o11 = c0718o;
                            ArrayList arrayList13 = new ArrayList();
                            Long l6 = (Long) ((ArrayList) obj).get(0);
                            try {
                                c0718o11.getClass();
                                AbstractC0715l b3 = c0718o11.b(l6.longValue());
                                InterfaceC0147s interfaceC0147s = b3.f8707c;
                                long p3 = ((Y.G) interfaceC0147s).p();
                                b3.f8705a.a(((Y.G) interfaceC0147s).k());
                                arrayList13.add(0, Long.valueOf(p3));
                            } catch (Throwable th10) {
                                arrayList13 = AbstractC0635d.A(th10);
                            }
                            c0276a.o(arrayList13);
                            return;
                        default:
                            C0718o c0718o12 = c0718o;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l7 = (Long) arrayList15.get(0);
                            Long l8 = (Long) arrayList15.get(1);
                            try {
                                c0718o12.getClass();
                                AbstractC0715l b4 = c0718o12.b(l7.longValue());
                                long intValue = l8.intValue();
                                C0.e eVar3 = (C0.e) b4.f8707c;
                                eVar3.getClass();
                                eVar3.i(intValue, ((Y.G) eVar3).o());
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = AbstractC0635d.A(th11);
                            }
                            c0276a.o(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0059m11.o(null);
        }
    }
}
