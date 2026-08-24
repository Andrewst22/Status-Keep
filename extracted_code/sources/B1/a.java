package B1;

import D2.h;
import K1.n;
import N.k;
import T0.l;
import U.A;
import U.s;
import U.t;
import U.y;
import W.g;
import W.m;
import W1.B;
import W1.w;
import Y.Y;
import Y.Z;
import Y.a0;
import Y.c0;
import Y.d0;
import Y.j0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.media.MediaCodec;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import b1.C0212b;
import c1.C0228B;
import c1.C0230D;
import c1.C0232F;
import c1.InterfaceC0227A;
import c1.x;
import e0.C0262c;
import f0.o;
import f2.f;
import g2.C0276a;
import g2.j;
import g2.p;
import io.flutter.view.FlutterCallbackInformation;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import o0.C0701z;
import o0.InterfaceC0675D;
import o0.r;
import org.json.JSONArray;
import org.json.JSONObject;
import w0.C0898h;
import w0.i;
import w0.q;
/* loaded from: classes.dex */
public final class a implements N2.d, p, g, w, InterfaceC0675D, d0.e, l, i, InterfaceC0227A, j, f0.p, g2.d {

    /* renamed from: p  reason: collision with root package name */
    public static a f48p;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f49m;

    /* renamed from: n  reason: collision with root package name */
    public Object f50n;

    /* renamed from: o  reason: collision with root package name */
    public Object f51o;

    public /* synthetic */ a(int i3, Object obj, Object obj2) {
        this.f49m = i3;
        this.f50n = obj;
        this.f51o = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int t(B1.a r11, org.json.JSONArray r12) {
        /*
            r11.getClass()
            r11 = 0
            r0 = 0
            r1 = 0
            r2 = 0
        L7:
            int r3 = r12.length()
            r4 = 2
            r5 = 4
            r6 = 1
            if (r0 >= r3) goto L6b
            java.lang.String r3 = r12.getString(r0)
            int[] r5 = N.j.c(r5)
            int r7 = r5.length
            r8 = 0
        L1a:
            if (r8 >= r7) goto L5f
            r9 = r5[r8]
            r10 = 1
            if (r9 == r10) goto L35
            r10 = 2
            if (r9 == r10) goto L32
            r10 = 3
            if (r9 == r10) goto L2f
            r10 = 4
            if (r9 != r10) goto L2d
            java.lang.String r10 = "DeviceOrientation.landscapeRight"
            goto L37
        L2d:
            r11 = 0
            throw r11
        L2f:
            java.lang.String r10 = "DeviceOrientation.landscapeLeft"
            goto L37
        L32:
            java.lang.String r10 = "DeviceOrientation.portraitDown"
            goto L37
        L35:
            java.lang.String r10 = "DeviceOrientation.portraitUp"
        L37:
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L5c
            int r3 = N.j.b(r9)
            if (r3 == 0) goto L54
            if (r3 == r6) goto L51
            if (r3 == r4) goto L4e
            r4 = 3
            if (r3 == r4) goto L4b
            goto L56
        L4b:
            r1 = r1 | 8
            goto L56
        L4e:
            r1 = r1 | 2
            goto L56
        L51:
            r1 = r1 | 4
            goto L56
        L54:
            r1 = r1 | 1
        L56:
            if (r2 != 0) goto L59
            r2 = r1
        L59:
            int r0 = r0 + 1
            goto L7
        L5c:
            int r8 = r8 + 1
            goto L1a
        L5f:
            java.lang.NoSuchFieldException r11 = new java.lang.NoSuchFieldException
            java.lang.String r12 = "No such DeviceOrientation: "
            java.lang.String r12 = D2.h.l(r12, r3)
            r11.<init>(r12)
            throw r11
        L6b:
            if (r1 == 0) goto L8e
            r12 = 8
            r0 = 9
            switch(r1) {
                case 2: goto L8f;
                case 3: goto L86;
                case 4: goto L83;
                case 5: goto L80;
                case 6: goto L86;
                case 7: goto L86;
                case 8: goto L7d;
                case 9: goto L86;
                case 10: goto L7a;
                case 11: goto L78;
                case 12: goto L86;
                case 13: goto L86;
                case 14: goto L86;
                case 15: goto L75;
                default: goto L74;
            }
        L74:
            goto L8c
        L75:
            r11 = 13
            goto L8f
        L78:
            r11 = 2
            goto L8f
        L7a:
            r11 = 11
            goto L8f
        L7d:
            r11 = 8
            goto L8f
        L80:
            r11 = 12
            goto L8f
        L83:
            r11 = 9
            goto L8f
        L86:
            if (r2 == r4) goto L8f
            if (r2 == r5) goto L83
            if (r2 == r12) goto L7d
        L8c:
            r11 = 1
            goto L8f
        L8e:
            r11 = -1
        L8f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.a.t(B1.a, org.json.JSONArray):int");
    }

    public static ArrayList u(a aVar, JSONArray jSONArray) {
        f[] values;
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            String string = jSONArray.getString(i3);
            for (f fVar : f.values()) {
                if (fVar.f5575m.equals(string)) {
                    int ordinal = fVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            arrayList.add(f.f5573o);
                        }
                    } else {
                        arrayList.add(f.f5572n);
                    }
                }
            }
            throw new NoSuchFieldException(h.l("No such SystemUiOverlay: ", string));
        }
        return arrayList;
    }

    public static int v(a aVar, String str) {
        int[] c3;
        String str2;
        aVar.getClass();
        for (int i3 : N.j.c(4)) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            str2 = "SystemUiMode.edgeToEdge";
                        } else {
                            throw null;
                        }
                    } else {
                        str2 = "SystemUiMode.immersiveSticky";
                    }
                } else {
                    str2 = "SystemUiMode.immersive";
                }
            } else {
                str2 = "SystemUiMode.leanBack";
            }
            if (str2.equals(str)) {
                int b3 = N.j.b(i3);
                if (b3 != 0) {
                    if (b3 != 1) {
                        if (b3 != 2) {
                            return 4;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
        }
        throw new NoSuchFieldException(h.l("No such SystemUiMode: ", str));
    }

    public static f2.e w(a aVar, JSONObject jSONObject) {
        Integer num;
        int i3;
        Boolean bool;
        Integer num2;
        int i4;
        Integer num3;
        aVar.getClass();
        Boolean bool2 = null;
        if (!jSONObject.isNull("statusBarColor")) {
            num = Integer.valueOf(jSONObject.getInt("statusBarColor"));
        } else {
            num = null;
        }
        if (!jSONObject.isNull("statusBarIconBrightness")) {
            i3 = h.b(jSONObject.getString("statusBarIconBrightness"));
        } else {
            i3 = 0;
        }
        if (!jSONObject.isNull("systemStatusBarContrastEnforced")) {
            bool = Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced"));
        } else {
            bool = null;
        }
        if (!jSONObject.isNull("systemNavigationBarColor")) {
            num2 = Integer.valueOf(jSONObject.getInt("systemNavigationBarColor"));
        } else {
            num2 = null;
        }
        if (!jSONObject.isNull("systemNavigationBarIconBrightness")) {
            i4 = h.b(jSONObject.getString("systemNavigationBarIconBrightness"));
        } else {
            i4 = 0;
        }
        if (!jSONObject.isNull("systemNavigationBarDividerColor")) {
            num3 = Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor"));
        } else {
            num3 = null;
        }
        if (!jSONObject.isNull("systemNavigationBarContrastEnforced")) {
            bool2 = Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced"));
        }
        return new f2.e(num, i3, bool, num2, i4, num3, bool2);
    }

    public static HashMap z(String str, int i3, int i4, int i5, int i6) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        h.o(i3, hashMap, "selectionBase", i4, "selectionExtent");
        h.o(i5, hashMap, "composingBase", i6, "composingExtent");
        return hashMap;
    }

    public byte[] A(H0.a aVar) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f50n;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.f51o;
        try {
            dataOutputStream.writeBytes(aVar.f431m);
            dataOutputStream.writeByte(0);
            String str = aVar.f432n;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f433o);
            dataOutputStream.writeLong(aVar.f434p);
            dataOutputStream.write(aVar.f435q);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // o0.InterfaceC0675D
    public void B(int i3, C0701z c0701z, r rVar, l0.g gVar) {
        Pair E3 = E(i3, c0701z);
        if (E3 != null) {
            ((d0) this.f51o).f3240i.c(new Z(this, E3, rVar, gVar, 1));
        }
    }

    @Override // o0.InterfaceC0675D
    public void C(int i3, C0701z c0701z, r rVar, l0.g gVar) {
        Pair E3 = E(i3, c0701z);
        if (E3 != null) {
            ((d0) this.f51o).f3240i.c(new Z(this, E3, rVar, gVar, 2));
        }
    }

    public n D(P1.a aVar) {
        C1.j jVar;
        HashMap hashMap = (HashMap) this.f50n;
        Type type = aVar.f1466b;
        if (hashMap.get(type) == null) {
            Class cls = aVar.f1465a;
            if (hashMap.get(cls) == null) {
                n nVar = null;
                try {
                    Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                    if (!declaredConstructor.isAccessible()) {
                        ((N1.b) this.f51o).a(declaredConstructor);
                    }
                    jVar = new C1.j(declaredConstructor, 8);
                } catch (NoSuchMethodException unused) {
                    jVar = null;
                }
                if (jVar != null) {
                    return jVar;
                }
                if (Collection.class.isAssignableFrom(cls)) {
                    if (SortedSet.class.isAssignableFrom(cls)) {
                        nVar = new b(6);
                    } else if (EnumSet.class.isAssignableFrom(cls)) {
                        nVar = new C1.j(type, 9);
                    } else if (Set.class.isAssignableFrom(cls)) {
                        nVar = new b(7);
                    } else if (Queue.class.isAssignableFrom(cls)) {
                        nVar = new b(8);
                    } else {
                        nVar = new b(9);
                    }
                } else if (Map.class.isAssignableFrom(cls)) {
                    if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                        nVar = new b(10);
                    } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                        nVar = new b(2);
                    } else if (SortedMap.class.isAssignableFrom(cls)) {
                        nVar = new b(3);
                    } else {
                        if (type instanceof ParameterizedType) {
                            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                            type2.getClass();
                            Type b3 = K1.d.b(type2);
                            Class h3 = K1.d.h(b3);
                            b3.hashCode();
                            if (!String.class.isAssignableFrom(h3)) {
                                nVar = new b(4);
                            }
                        }
                        nVar = new b(5);
                    }
                }
                if (nVar != null) {
                    return nVar;
                }
                return new e(cls, type);
            }
            throw new ClassCastException();
        }
        throw new ClassCastException();
    }

    public Pair E(int i3, C0701z c0701z) {
        C0701z c0701z2;
        c0 c0Var = (c0) this.f50n;
        C0701z c0701z3 = null;
        if (c0701z != null) {
            int i4 = 0;
            while (true) {
                if (i4 < c0Var.f3227c.size()) {
                    if (((C0701z) c0Var.f3227c.get(i4)).f8656d == c0701z.f8656d) {
                        Object obj = c0Var.f3226b;
                        int i5 = j0.f3333k;
                        c0701z2 = c0701z.a(Pair.create(obj, c0701z.f8653a));
                        break;
                    }
                    i4++;
                } else {
                    c0701z2 = null;
                    break;
                }
            }
            if (c0701z2 == null) {
                return null;
            }
            c0701z3 = c0701z2;
        }
        return Pair.create(Integer.valueOf(i3 + c0Var.f3228d), c0701z3);
    }

    public synchronized Map F() {
        try {
            if (((Map) this.f51o) == null) {
                this.f51o = Collections.unmodifiableMap(new HashMap((HashMap) this.f50n));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f51o;
    }

    public MotionEvent G(B b3) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long j3;
        while (true) {
            priorityQueue = (PriorityQueue) this.f51o;
            boolean isEmpty = priorityQueue.isEmpty();
            longSparseArray = (LongSparseArray) this.f50n;
            j3 = b3.f2826a;
            if (isEmpty || ((Long) priorityQueue.peek()).longValue() >= j3) {
                break;
            }
            longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j3) {
            priorityQueue.poll();
        }
        MotionEvent motionEvent = (MotionEvent) longSparseArray.get(j3);
        longSparseArray.remove(j3);
        return motionEvent;
    }

    @Override // W.g
    public W.h a() {
        return new m((Context) this.f50n, ((R0.e) this.f51o).a());
    }

    @Override // T0.l
    public /* synthetic */ void b() {
    }

    @Override // c1.InterfaceC0227A
    public void d(t tVar) {
        C0230D c0230d;
        if (tVar.u() != 0 || (tVar.u() & 128) == 0) {
            return;
        }
        tVar.H(6);
        int a3 = tVar.a() / 4;
        int i3 = 0;
        while (true) {
            c0230d = (C0230D) this.f51o;
            if (i3 >= a3) {
                break;
            }
            s sVar = (s) this.f50n;
            tVar.f(sVar.f2472d, 0, 4);
            sVar.q(0);
            int i4 = sVar.i(16);
            sVar.t(3);
            if (i4 == 0) {
                sVar.t(13);
            } else {
                int i5 = sVar.i(13);
                if (c0230d.f4802h.get(i5) == null) {
                    c0230d.f4802h.put(i5, new C0228B(new R0.j(c0230d, i5)));
                    c0230d.f4808n++;
                }
            }
            i3++;
        }
        if (c0230d.f4795a != 2) {
            c0230d.f4802h.remove(0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03a5, code lost:
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0114, code lost:
        if (")".equals(b1.C0212b.b(r8, r11)) == false) goto L48;
     */
    /* JADX WARN: Type inference failed for: r10v16, types: [b1.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // T0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(byte[] r20, int r21, int r22, T0.k r23, U.d r24) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.a.e(byte[], int, int, T0.k, U.d):void");
    }

    @Override // f0.p
    public s0.p f(f0.l lVar, f0.i iVar) {
        ((e0.l) this.f50n).getClass();
        return new C0276a((Object) new o(lVar, iVar), (Object) ((List) this.f51o), 7, false);
    }

    @Override // o0.InterfaceC0675D
    public void g(int i3, C0701z c0701z, l0.g gVar) {
        Pair E3 = E(i3, c0701z);
        if (E3 != null) {
            ((d0) this.f51o).f3240i.c(new Y(this, E3, gVar, 0));
        }
    }

    @Override // o0.InterfaceC0675D
    public void h(int i3, C0701z c0701z, r rVar, l0.g gVar) {
        Pair E3 = E(i3, c0701z);
        if (E3 != null) {
            ((d0) this.f51o).f3240i.c(new Z(this, E3, rVar, gVar, 0));
        }
    }

    @Override // o0.InterfaceC0675D
    public void i(int i3, C0701z c0701z, l0.g gVar) {
        Pair E3 = E(i3, c0701z);
        if (E3 != null) {
            ((d0) this.f51o).f3240i.c(new Y(this, E3, gVar, 1));
        }
    }

    @Override // W1.w
    public void j(KeyEvent keyEvent, A.i iVar) {
        String str;
        int action = keyEvent.getAction();
        boolean z3 = true;
        if (action != 0 && action != 1) {
            iVar.e(false);
            return;
        }
        Character a3 = ((R2.i) this.f51o).a(keyEvent.getUnicodeChar());
        if (action == 0) {
            z3 = false;
        }
        B0.a aVar = new B0.a(iVar, 5);
        f2.b bVar = (f2.b) this.f50n;
        HashMap hashMap = new HashMap();
        if (z3) {
            str = "keyup";
        } else {
            str = "keydown";
        }
        hashMap.put("type", str);
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(keyEvent.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        hashMap.put("character", a3.toString());
        hashMap.put("source", Integer.valueOf(keyEvent.getSource()));
        hashMap.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        bVar.f5558a.n(hashMap, new B0.a(aVar, 18));
    }

    @Override // T0.l
    public int k() {
        return 1;
    }

    @Override // f0.p
    public s0.p l() {
        return new C0276a((Object) ((e0.l) this.f50n).l(), (Object) ((List) this.f51o), 7, false);
    }

    @Override // w0.i
    public void m() {
        byte[] bArr = A.f2410f;
        t tVar = (t) this.f51o;
        tVar.getClass();
        tVar.E(bArr, bArr.length);
    }

    @Override // w0.i
    public C0898h n(w0.l lVar, long j3) {
        int a3;
        C0898h c0898h;
        long j4 = lVar.f9608p;
        int min = (int) Math.min(20000L, lVar.f9607o - j4);
        t tVar = (t) this.f51o;
        tVar.D(min);
        lVar.p(tVar.f2477a, 0, min, false);
        int i3 = -1;
        long j5 = -9223372036854775807L;
        int i4 = -1;
        while (tVar.a() >= 4) {
            if (B0.c.a(tVar.f2477a, tVar.f2478b) != 442) {
                tVar.H(1);
            } else {
                tVar.H(4);
                long c3 = x.c(tVar);
                if (c3 != -9223372036854775807L) {
                    long b3 = ((y) this.f50n).b(c3);
                    if (b3 > j3) {
                        if (j5 == -9223372036854775807L) {
                            return new C0898h(-1, b3, j4);
                        }
                        c0898h = new C0898h(0, -9223372036854775807L, j4 + i4);
                    } else if (100000 + b3 > j3) {
                        c0898h = new C0898h(0, -9223372036854775807L, j4 + tVar.f2478b);
                    } else {
                        i4 = tVar.f2478b;
                        j5 = b3;
                    }
                    return c0898h;
                }
                int i5 = tVar.f2479c;
                if (tVar.a() < 10) {
                    tVar.G(i5);
                } else {
                    tVar.H(9);
                    int u3 = tVar.u() & 7;
                    if (tVar.a() < u3) {
                        tVar.G(i5);
                    } else {
                        tVar.H(u3);
                        if (tVar.a() < 4) {
                            tVar.G(i5);
                        } else {
                            if (B0.c.a(tVar.f2477a, tVar.f2478b) == 443) {
                                tVar.H(4);
                                int A3 = tVar.A();
                                if (tVar.a() < A3) {
                                    tVar.G(i5);
                                } else {
                                    tVar.H(A3);
                                }
                            }
                            while (true) {
                                if (tVar.a() < 4 || (a3 = B0.c.a(tVar.f2477a, tVar.f2478b)) == 442 || a3 == 441 || (a3 >>> 8) != 1) {
                                    break;
                                }
                                tVar.H(4);
                                if (tVar.a() < 2) {
                                    tVar.G(i5);
                                    break;
                                }
                                tVar.G(Math.min(tVar.f2479c, tVar.f2478b + tVar.A()));
                            }
                        }
                    }
                }
                i3 = tVar.f2478b;
            }
        }
        if (j5 != -9223372036854775807L) {
            return new C0898h(-2, j5, j4 + i3);
        }
        return C0898h.f9588d;
    }

    @Override // g2.d
    public void o(Object obj) {
        e eVar = (e) this.f51o;
        f2.l lVar = (f2.l) this.f50n;
        ((ConcurrentLinkedQueue) eVar.f56n).remove(lVar);
        if (!((ConcurrentLinkedQueue) eVar.f56n).isEmpty()) {
            Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(lVar.f5612a));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
        if (r4.equals("share") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00dc, code lost:
        if (r4.equals("shareFilesWithResult") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e5, code lost:
        if (r4.equals("shareWithResult") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ea, code lost:
        if ((r10 instanceof java.util.Map) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ec, code lost:
        if (r6 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f6, code lost:
        if (r14.a((R1.f) r18) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fa, code lost:
        r3 = r17.a("text");
        D2.i.c(r3, "null cannot be cast to non-null type kotlin.String");
        r8.d((java.lang.String) r3, (java.lang.String) r17.a("subject"), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010c, code lost:
        if (r6 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010e, code lost:
        if (r5 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0110, code lost:
        ((R1.f) r18).b("dev.fluttercommunity.plus/share/unavailable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0119, code lost:
        ((R1.f) r18).b(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0127, code lost:
        throw new java.lang.IllegalArgumentException("Map arguments expected");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012e, code lost:
        if (r4.equals("shareFiles") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013a, code lost:
        if ((r10 instanceof java.util.Map) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013c, code lost:
        if (r6 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
        if (r14.a((R1.f) r18) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0149, code lost:
        r3 = r17.a("paths");
        D2.i.b(r3);
        r8.e((java.util.List) r3, (java.util.List) r17.a("mimeTypes"), (java.lang.String) r17.a("text"), (java.lang.String) r17.a("subject"), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0171, code lost:
        if (r6 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0173, code lost:
        if (r5 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0175, code lost:
        ((R1.f) r18).b("dev.fluttercommunity.plus/share/unavailable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017d, code lost:
        ((R1.f) r18).b(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0185, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0186, code lost:
        ((R1.f) r18).a("Share failed", r0.getMessage(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0199, code lost:
        throw new java.lang.IllegalArgumentException("Map arguments expected");
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
        return;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0186 -> B:77:0x0193). Please submit an issue!!! */
    @Override // g2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMethodCall(g2.o r17, g2.q r18) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.a.onMethodCall(g2.o, g2.q):void");
    }

    @Override // g2.j
    public void p() {
        this.f51o = null;
    }

    @Override // o0.InterfaceC0675D
    public void q(int i3, C0701z c0701z, r rVar, l0.g gVar, IOException iOException, boolean z3) {
        Pair E3 = E(i3, c0701z);
        if (E3 != null) {
            ((d0) this.f51o).f3240i.c(new a0(this, E3, rVar, gVar, iOException, z3, 0));
        }
    }

    @Override // T0.l
    public /* synthetic */ T0.d r(byte[] bArr, int i3, int i4) {
        return h.a(this, bArr, i4);
    }

    @Override // g2.j
    public void s(g2.i iVar) {
        ArrayList arrayList = (ArrayList) this.f50n;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iVar.a((Map) it.next());
        }
        arrayList.clear();
        this.f51o = iVar;
    }

    public String toString() {
        switch (this.f49m) {
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return ((HashMap) this.f50n).toString();
            case 15:
                StringBuilder sb = new StringBuilder("DartCallback( bundle path: ");
                sb.append((String) this.f50n);
                sb.append(", library path: ");
                FlutterCallbackInformation flutterCallbackInformation = (FlutterCallbackInformation) this.f51o;
                sb.append(flutterCallbackInformation.callbackLibraryPath);
                sb.append(", function: ");
                sb.append(flutterCallbackInformation.callbackName);
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bb  */
    /* JADX WARN: Type inference failed for: r0v6, types: [D2.n, java.lang.Object] */
    @Override // N2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(N2.e r7, u2.InterfaceC0866d r8) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.a.x(N2.e, u2.d):java.lang.Object");
    }

    public void y() {
        this.f50n = null;
        this.f51o = null;
    }

    public /* synthetic */ a(int i3, boolean z3) {
        this.f49m = i3;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i3, boolean z3) {
        this.f49m = i3;
        this.f51o = obj;
        this.f50n = obj2;
    }

    public a(T1.d dVar, T1.f fVar) {
        this.f49m = 7;
        D2.i.e(fVar, "manager");
        this.f50n = dVar;
        this.f51o = fVar;
    }

    public a(f2.b bVar) {
        this.f49m = 10;
        this.f51o = new R2.i();
        this.f50n = bVar;
    }

    public a(C0262c c0262c) {
        this.f49m = 22;
        this.f51o = c0262c;
        this.f50n = new HashMap();
    }

    public a(int i3) {
        this.f49m = i3;
        switch (i3) {
            case 9:
                this.f50n = new HashMap();
                return;
            case 11:
                this.f50n = new LongSparseArray();
                this.f51o = new PriorityQueue();
                return;
            case 17:
                this.f50n = new t();
                this.f51o = new C0212b();
                return;
            case 20:
                this.f50n = new ArrayList();
                return;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f50n = byteArrayOutputStream;
                this.f51o = new DataOutputStream(byteArrayOutputStream);
                return;
        }
    }

    public a(HashMap hashMap) {
        this.f49m = 2;
        this.f51o = N1.b.f1111a;
        this.f50n = hashMap;
    }

    public a(Y1.b bVar, int i3) {
        this.f49m = i3;
        switch (i3) {
            case 24:
                C0262c c0262c = new C0262c(this, 10);
                g2.r rVar = new g2.r(bVar, "flutter/platform", g2.m.f5787a);
                this.f50n = rVar;
                rVar.b(c0262c);
                return;
            case 25:
                C0262c c0262c2 = new C0262c(this, 12);
                g2.r rVar2 = new g2.r(bVar, "flutter/platform_views_2", g2.x.f5796a);
                this.f50n = rVar2;
                rVar2.b(c0262c2);
                return;
            case 26:
                C0262c c0262c3 = new C0262c(this, 11);
                g2.r rVar3 = new g2.r(bVar, "flutter/platform_views", g2.x.f5796a);
                this.f50n = rVar3;
                rVar3.b(c0262c3);
                return;
            case 27:
            case 28:
            default:
                C0262c c0262c4 = new C0262c(this, 7);
                g2.r rVar4 = new g2.r(bVar, "flutter/localization", g2.m.f5787a);
                this.f50n = rVar4;
                rVar4.b(c0262c4);
                return;
            case 29:
                C0262c c0262c5 = new C0262c(this, 19);
                g2.r rVar5 = new g2.r(bVar, "flutter/textinput", g2.m.f5787a);
                this.f50n = rVar5;
                rVar5.b(c0262c5);
                return;
        }
    }

    public a(y yVar) {
        this.f49m = 18;
        this.f50n = yVar;
        this.f51o = new t();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, int i3) {
        this(context, new R0.e(1));
        this.f49m = i3;
        switch (i3) {
            case 16:
                this.f50n = context;
                return;
            default:
                return;
        }
    }

    public a(Y1.b bVar, PackageManager packageManager) {
        this.f49m = 27;
        C0262c c0262c = new C0262c(this, 13);
        this.f50n = packageManager;
        new g2.r(bVar, "flutter/processtext", g2.x.f5796a).b(c0262c);
    }

    public a(Context context, R0.e eVar) {
        this.f49m = 8;
        this.f50n = context.getApplicationContext();
        this.f51o = eVar;
    }

    public a(MediaCodec.CryptoInfo cryptoInfo) {
        this.f49m = 12;
        this.f50n = cryptoInfo;
        this.f51o = A.c.g();
    }

    public a(AssetManager assetManager, String str, FlutterCallbackInformation flutterCallbackInformation) {
        this.f49m = 15;
        this.f50n = str;
        this.f51o = flutterCallbackInformation;
    }

    public a(C0230D c0230d) {
        this.f49m = 19;
        this.f51o = c0230d;
        this.f50n = new s(new byte[4], 4);
    }

    @Override // c1.InterfaceC0227A
    public void c(y yVar, q qVar, C0232F c0232f) {
    }
}
