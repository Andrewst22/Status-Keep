package e0;

import C.C0009j;
import K.C0059m;
import R.U;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.PointerIcon;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import g0.C0271b;
import g1.InterfaceC0275c;
import g2.C0276a;
import g2.InterfaceC0278c;
import g2.x;
import h2.C0286a;
import i2.InterfaceC0321a;
import io.flutter.embedding.engine.FlutterJNI;
import j$.util.Map;
import j2.C0518a;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import k.C0523e;
import k.MenuC0527i;
import k.MenuItemC0528j;
import k.View$OnKeyListenerC0524f;
import l.L;
import o0.V;
import o0.W;
import o0.b0;
import o2.AbstractC0715l;
import o2.C0710g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C0737a;
import p2.C0738b;
/* renamed from: e0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262c implements V, InterfaceC0278c, g2.p, g0.d, InterfaceC0275c, h0.m, L {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f5224m;

    /* renamed from: n  reason: collision with root package name */
    public Object f5225n;

    public /* synthetic */ C0262c(Object obj, int i3) {
        this.f5224m = i3;
        this.f5225n = obj;
    }

    public static int n(int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            i5++;
            if (i5 == i4) {
                i6++;
                i5 = 0;
            } else if (i5 > i4) {
                i6++;
                i5 = 1;
            }
        }
        if (i5 + 1 > i4) {
            return i6 + 1;
        }
        return i6;
    }

    public static boolean p(int i3) {
        if ((48 > i3 || i3 > 57) && i3 != 35 && i3 != 42) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x018a A[Catch: JSONException -> 0x002b, TryCatch #8 {JSONException -> 0x002b, blocks: (B:6:0x0012, B:7:0x001b, B:59:0x00cf, B:60:0x00d7, B:61:0x010b, B:68:0x0131, B:64:0x0124, B:67:0x012b, B:69:0x0143, B:70:0x016c, B:72:0x0170, B:76:0x0180, B:78:0x018a, B:79:0x019a, B:74:0x0175, B:80:0x01a2, B:81:0x01bb, B:83:0x01cf, B:84:0x01d2, B:92:0x0202, B:93:0x0215, B:140:0x031a, B:145:0x033a, B:147:0x034a, B:149:0x035d, B:148:0x035a, B:91:0x01f6, B:112:0x0273, B:119:0x0297, B:131:0x02e3, B:138:0x030f, B:143:0x032f, B:152:0x0365, B:9:0x0020, B:14:0x002e, B:17:0x0039, B:20:0x0045, B:23:0x0051, B:26:0x005c, B:29:0x0067, B:32:0x0071, B:35:0x007b, B:38:0x0085, B:41:0x008f, B:44:0x0099, B:47:0x00a4, B:50:0x00af, B:53:0x00ba, B:121:0x02a3, B:123:0x02ad, B:124:0x02b0, B:126:0x02c8, B:128:0x02da, B:127:0x02d1), top: B:162:0x0012, inners: #0, #1, #3, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019a A[Catch: JSONException -> 0x002b, TryCatch #8 {JSONException -> 0x002b, blocks: (B:6:0x0012, B:7:0x001b, B:59:0x00cf, B:60:0x00d7, B:61:0x010b, B:68:0x0131, B:64:0x0124, B:67:0x012b, B:69:0x0143, B:70:0x016c, B:72:0x0170, B:76:0x0180, B:78:0x018a, B:79:0x019a, B:74:0x0175, B:80:0x01a2, B:81:0x01bb, B:83:0x01cf, B:84:0x01d2, B:92:0x0202, B:93:0x0215, B:140:0x031a, B:145:0x033a, B:147:0x034a, B:149:0x035d, B:148:0x035a, B:91:0x01f6, B:112:0x0273, B:119:0x0297, B:131:0x02e3, B:138:0x030f, B:143:0x032f, B:152:0x0365, B:9:0x0020, B:14:0x002e, B:17:0x0039, B:20:0x0045, B:23:0x0051, B:26:0x005c, B:29:0x0067, B:32:0x0071, B:35:0x007b, B:38:0x0085, B:41:0x008f, B:44:0x0099, B:47:0x00a4, B:50:0x00af, B:53:0x00ba, B:121:0x02a3, B:123:0x02ad, B:124:0x02b0, B:126:0x02c8, B:128:0x02da, B:127:0x02d1), top: B:162:0x0012, inners: #0, #1, #3, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void q(g2.o r13, g2.q r14) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.C0262c.q(g2.o, g2.q):void");
    }

    private final void r(g2.o oVar, g2.q qVar) {
        ByteBuffer byteBuffer;
        Object obj;
        boolean z3 = false;
        B1.a aVar = (B1.a) this.f5225n;
        if (((io.flutter.plugin.platform.l) aVar.f51o) == null) {
            return;
        }
        String str = oVar.f5788a;
        str.getClass();
        Object obj2 = oVar.f5789b;
        char c3 = 65535;
        switch (str.hashCode()) {
            case -1352294148:
                if (str.equals("create")) {
                    c3 = 0;
                    break;
                }
                break;
            case -756050293:
                if (str.equals("clearFocus")) {
                    c3 = 1;
                    break;
                }
                break;
            case 110550847:
                if (str.equals("touch")) {
                    c3 = 2;
                    break;
                }
                break;
            case 576796989:
                if (str.equals("setDirection")) {
                    c3 = 3;
                    break;
                }
                break;
            case 751366695:
                if (str.equals("isSurfaceControlEnabled")) {
                    c3 = 4;
                    break;
                }
                break;
            case 1671767583:
                if (str.equals("dispose")) {
                    c3 = 5;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                Map map = (Map) obj2;
                if (map.containsKey("params")) {
                    byteBuffer = ByteBuffer.wrap((byte[]) map.get("params"));
                } else {
                    byteBuffer = null;
                }
                try {
                    int intValue = ((Integer) map.get("id")).intValue();
                    String str2 = (String) map.get("viewType");
                    int intValue2 = ((Integer) map.get("direction")).intValue();
                    io.flutter.plugin.platform.m mVar = (io.flutter.plugin.platform.m) ((io.flutter.plugin.platform.l) aVar.f51o).f6219b;
                    C0738b c0738b = (C0738b) ((HashMap) mVar.f6220a.f6219b).get(str2);
                    if (c0738b != null) {
                        if (byteBuffer != null) {
                            obj = c0738b.f8833a.a(byteBuffer);
                        } else {
                            obj = null;
                        }
                        Activity activity = mVar.f6222c;
                        C0710g c0710g = (C0710g) obj;
                        Objects.requireNonNull(c0710g);
                        C0737a c0737a = new C0737a(activity, ((AbstractC0715l) ((LongSparseArray) c0738b.f8834b.f25n).get(c0710g.f8697a.longValue())).f8707c);
                        SurfaceView surfaceView = c0737a.f8832a;
                        if (surfaceView != null) {
                            surfaceView.setLayoutDirection(intValue2);
                            mVar.f6228i.put(intValue, c0737a);
                            ((R1.f) qVar).b(null);
                            return;
                        }
                        throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
                    }
                    throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str2);
                } catch (IllegalStateException e2) {
                    ((R1.f) qVar).a("error", Log.getStackTraceString(e2), null);
                    return;
                }
            case 1:
                try {
                    ((io.flutter.plugin.platform.l) aVar.f51o).c(((Integer) obj2).intValue());
                    ((R1.f) qVar).b(null);
                    return;
                } catch (IllegalStateException e3) {
                    ((R1.f) qVar).a("error", Log.getStackTraceString(e3), null);
                    return;
                }
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                List list = (List) obj2;
                try {
                    ((io.flutter.plugin.platform.l) aVar.f51o).i(new f2.j(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                    ((R1.f) qVar).b(null);
                    return;
                } catch (IllegalStateException e4) {
                    ((R1.f) qVar).a("error", Log.getStackTraceString(e4), null);
                    return;
                }
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                Map map2 = (Map) obj2;
                try {
                    ((io.flutter.plugin.platform.l) aVar.f51o).k(((Integer) map2.get("id")).intValue(), ((Integer) map2.get("direction")).intValue());
                    ((R1.f) qVar).b(null);
                    return;
                } catch (IllegalStateException e5) {
                    ((R1.f) qVar).a("error", Log.getStackTraceString(e5), null);
                    return;
                }
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                FlutterJNI flutterJNI = ((io.flutter.plugin.platform.m) ((io.flutter.plugin.platform.l) aVar.f51o).f6219b).f6224e;
                if (flutterJNI != null) {
                    z3 = flutterJNI.IsSurfaceControlEnabled();
                }
                ((R1.f) qVar).b(Boolean.valueOf(z3));
                return;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                try {
                    ((io.flutter.plugin.platform.l) aVar.f51o).e(((Integer) ((Map) obj2).get("id")).intValue());
                    ((R1.f) qVar).b(null);
                    return;
                } catch (IllegalStateException e6) {
                    ((R1.f) qVar).a("error", Log.getStackTraceString(e6), null);
                    return;
                }
            default:
                ((R1.f) qVar).c();
                return;
        }
    }

    @Override // h0.m
    public void a(Bundle bundle) {
        ((MediaCodec) this.f5225n).setParameters(bundle);
    }

    @Override // h0.m
    public void b(int i3, X.b bVar, long j3, int i4) {
        ((MediaCodec) this.f5225n).queueSecureInputBuffer(i3, 0, bVar.f2930i, j3, i4);
    }

    @Override // l.L
    public void c(MenuC0527i menuC0527i, MenuItemC0528j menuItemC0528j) {
        View$OnKeyListenerC0524f view$OnKeyListenerC0524f = (View$OnKeyListenerC0524f) this.f5225n;
        C0523e c0523e = null;
        view$OnKeyListenerC0524f.f7402r.removeCallbacksAndMessages(null);
        ArrayList arrayList = view$OnKeyListenerC0524f.f7404t;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                if (menuC0527i == ((C0523e) arrayList.get(i3)).f7385b) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 == -1) {
            return;
        }
        int i4 = i3 + 1;
        if (i4 < arrayList.size()) {
            c0523e = (C0523e) arrayList.get(i4);
        }
        view$OnKeyListenerC0524f.f7402r.postAtTime(new R1.e(this, c0523e, menuItemC0528j, menuC0527i, 1), menuC0527i, SystemClock.uptimeMillis() + 200);
    }

    @Override // g2.InterfaceC0278c
    public void d(Object obj, C0276a c0276a) {
        B1.e eVar = (B1.e) this.f5225n;
        if (((io.flutter.view.a) eVar.f58p) == null) {
            c0276a.o(null);
            return;
        }
        HashMap hashMap = (HashMap) obj;
        String str = (String) hashMap.get("type");
        HashMap hashMap2 = (HashMap) hashMap.get("data");
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case -1140076541:
                if (str.equals("tooltip")) {
                    c3 = 0;
                    break;
                }
                break;
            case -649620375:
                if (str.equals("announce")) {
                    c3 = 1;
                    break;
                }
                break;
            case 114595:
                if (str.equals("tap")) {
                    c3 = 2;
                    break;
                }
                break;
            case 97604824:
                if (str.equals("focus")) {
                    c3 = 3;
                    break;
                }
                break;
            case 114203431:
                if (str.equals("longPress")) {
                    c3 = 4;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                String str2 = (String) hashMap2.get("message");
                if (str2 != null) {
                    io.flutter.view.a aVar = (io.flutter.view.a) eVar.f58p;
                    if (Build.VERSION.SDK_INT >= 28) {
                        aVar.getClass();
                        break;
                    } else {
                        io.flutter.view.k kVar = (io.flutter.view.k) aVar.f6284a;
                        AccessibilityEvent d3 = kVar.d(0, 32);
                        d3.getText().add(str2);
                        kVar.h(d3);
                        break;
                    }
                }
                break;
            case 1:
                String str3 = (String) hashMap2.get("message");
                if (str3 != null) {
                    io.flutter.view.a aVar2 = (io.flutter.view.a) eVar.f58p;
                    if (Build.VERSION.SDK_INT >= 36) {
                        aVar2.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.k) aVar2.f6284a).f6372a.announceForAccessibility(str3);
                    break;
                }
                break;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    ((io.flutter.view.k) ((io.flutter.view.a) eVar.f58p).f6284a).g(num.intValue(), 1);
                    break;
                }
                break;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    ((io.flutter.view.k) ((io.flutter.view.a) eVar.f58p).f6284a).g(num2.intValue(), 8);
                    break;
                }
                break;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    ((io.flutter.view.k) ((io.flutter.view.a) eVar.f58p).f6284a).g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        c0276a.o(null);
    }

    @Override // h0.m
    public void e(int i3, int i4, long j3, int i5) {
        ((MediaCodec) this.f5225n).queueInputBuffer(i3, 0, i4, j3, i5);
    }

    @Override // o0.V
    public void f(W w3) {
        t tVar = (t) w3;
        n nVar = (n) this.f5225n;
        nVar.f5289C.f(nVar);
    }

    @Override // g1.InterfaceC0275c
    public void h(int i3, Serializable serializable) {
        String str;
        switch (i3) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i3 != 6 && i3 != 7 && i3 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        }
        ((ProfileInstallReceiver) this.f5225n).setResultCode(i3);
    }

    @Override // g1.InterfaceC0275c
    public void i() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // l.L
    public void l(MenuC0527i menuC0527i, MenuItemC0528j menuItemC0528j) {
        ((View$OnKeyListenerC0524f) this.f5225n).f7402r.removeCallbacksAndMessages(menuC0527i);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.AbstractMap, java.util.HashMap, W1.y] */
    public void m(String str) {
        PointerIcon systemIcon;
        C0276a c0276a = (C0276a) this.f5225n;
        InterfaceC0321a interfaceC0321a = (InterfaceC0321a) c0276a.f5777n;
        if (C0276a.f5775p == null) {
            ?? hashMap = new HashMap();
            hashMap.put("alias", 1010);
            hashMap.put("allScroll", 1013);
            hashMap.put("basic", 1000);
            hashMap.put("cell", 1006);
            hashMap.put("click", 1002);
            hashMap.put("contextMenu", 1001);
            hashMap.put("copy", 1011);
            hashMap.put("forbidden", 1012);
            hashMap.put("grab", 1020);
            hashMap.put("grabbing", 1021);
            hashMap.put("help", 1003);
            hashMap.put("move", 1013);
            hashMap.put("none", 0);
            hashMap.put("noDrop", 1012);
            hashMap.put("precise", 1007);
            hashMap.put("text", 1008);
            hashMap.put("resizeColumn", 1014);
            hashMap.put("resizeDown", 1015);
            hashMap.put("resizeUpLeft", 1016);
            hashMap.put("resizeDownRight", 1017);
            hashMap.put("resizeLeft", 1014);
            hashMap.put("resizeLeftRight", 1014);
            hashMap.put("resizeRight", 1014);
            hashMap.put("resizeRow", 1015);
            hashMap.put("resizeUp", 1015);
            hashMap.put("resizeUpDown", 1015);
            hashMap.put("resizeUpLeft", 1017);
            hashMap.put("resizeUpRight", 1016);
            hashMap.put("resizeUpLeftDownRight", 1017);
            hashMap.put("resizeUpRightDownLeft", 1016);
            hashMap.put("verticalText", 1009);
            hashMap.put("wait", 1004);
            hashMap.put("zoomIn", 1018);
            hashMap.put("zoomOut", 1019);
            C0276a.f5775p = hashMap;
        }
        systemIcon = PointerIcon.getSystemIcon(((W1.o) ((InterfaceC0321a) c0276a.f5777n)).getContext(), ((Integer) Map.EL.getOrDefault(C0276a.f5775p, str, 1000)).intValue());
        interfaceC0321a.setPointerIcon(systemIcon);
    }

    public String o(String str, String str2) {
        C0286a c0286a = (C0286a) this.f5225n;
        Context context = c0286a.f5942b;
        if (str2 != null) {
            Locale a3 = C0286a.a(str2);
            Configuration configuration = new Configuration(c0286a.f5942b.getResources().getConfiguration());
            configuration.setLocale(a3);
            context = c0286a.f5942b.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", c0286a.f5942b.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // g2.p
    public void onMethodCall(g2.o oVar, g2.q qVar) {
        String str;
        char c3;
        boolean z3;
        ByteBuffer byteBuffer;
        int i3;
        double d3;
        double d4;
        char c4;
        boolean isStylusHandwritingAvailable;
        boolean isStylusHandwritingAvailable2;
        char c5;
        Bundle bundle;
        char c6 = 0;
        r15 = false;
        boolean z4 = false;
        c6 = 0;
        switch (this.f5224m) {
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                ((l) this.f5225n).getClass();
                return;
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
            case 9:
            case 16:
            default:
                B1.a aVar = (B1.a) this.f5225n;
                if (((C0262c) aVar.f51o) != null) {
                    String str2 = oVar.f5788a;
                    str2.getClass();
                    Object obj = oVar.f5789b;
                    switch (str2.hashCode()) {
                        case -1779068172:
                            if (str2.equals("TextInput.setPlatformViewClient")) {
                                c5 = 0;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -1015421462:
                            if (str2.equals("TextInput.setEditingState")) {
                                c5 = 1;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -37561188:
                            if (str2.equals("TextInput.setClient")) {
                                c5 = 2;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 270476819:
                            if (str2.equals("TextInput.hide")) {
                                c5 = 3;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 270803918:
                            if (str2.equals("TextInput.show")) {
                                c5 = 4;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 649192816:
                            if (str2.equals("TextInput.sendAppPrivateCommand")) {
                                c5 = 5;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1204752139:
                            if (str2.equals("TextInput.setEditableSizeAndTransform")) {
                                c5 = 6;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1727570905:
                            if (str2.equals("TextInput.finishAutofillContext")) {
                                c5 = 7;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1904427655:
                            if (str2.equals("TextInput.clearClient")) {
                                c5 = '\b';
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 2113369584:
                            if (str2.equals("TextInput.requestAutofill")) {
                                c5 = '\t';
                                break;
                            }
                            c5 = 65535;
                            break;
                        default:
                            c5 = 65535;
                            break;
                    }
                    switch (c5) {
                        case 0:
                            try {
                                JSONObject jSONObject = (JSONObject) obj;
                                int i4 = jSONObject.getInt("platformViewId");
                                boolean optBoolean = jSONObject.optBoolean("usesVirtualDisplay", false);
                                io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) ((C0262c) aVar.f51o).f5225n;
                                if (optBoolean) {
                                    View view = iVar.f6164a;
                                    view.requestFocus();
                                    iVar.f6168e = new C0009j(3, i4, 6);
                                    iVar.f6165b.restartInput(view);
                                    iVar.f6172i = false;
                                } else {
                                    iVar.getClass();
                                    iVar.f6168e = new C0009j(4, i4, 6);
                                    iVar.f6173j = null;
                                }
                                ((R1.f) qVar).b(null);
                                return;
                            } catch (JSONException e2) {
                                ((R1.f) qVar).a("error", e2.getMessage(), null);
                                return;
                            }
                        case 1:
                            try {
                                ((C0262c) aVar.f51o).v(f2.p.a((JSONObject) obj));
                                ((R1.f) qVar).b(null);
                                return;
                            } catch (JSONException e3) {
                                ((R1.f) qVar).a("error", e3.getMessage(), null);
                                return;
                            }
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            try {
                                JSONArray jSONArray = (JSONArray) obj;
                                ((C0262c) aVar.f51o).t(jSONArray.getInt(0), f2.n.a(jSONArray.getJSONObject(1)));
                                ((R1.f) qVar).b(null);
                                return;
                            } catch (NoSuchFieldException | JSONException e4) {
                                ((R1.f) qVar).a("error", e4.getMessage(), null);
                                return;
                            }
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            io.flutter.plugin.editing.i iVar2 = (io.flutter.plugin.editing.i) ((C0262c) aVar.f51o).f5225n;
                            if (iVar2.f6168e.f107b == 4) {
                                iVar2.d();
                            } else {
                                iVar2.d();
                                iVar2.f6165b.hideSoftInputFromWindow(iVar2.f6164a.getApplicationWindowToken(), 0);
                            }
                            ((R1.f) qVar).b(null);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            io.flutter.plugin.editing.i iVar3 = (io.flutter.plugin.editing.i) ((C0262c) aVar.f51o).f5225n;
                            View view2 = iVar3.f6164a;
                            f2.n nVar = iVar3.f6169f;
                            InputMethodManager inputMethodManager = iVar3.f6165b;
                            if (nVar != null && nVar.f5622g.f5628a == 11) {
                                iVar3.d();
                                inputMethodManager.hideSoftInputFromWindow(view2.getApplicationWindowToken(), 0);
                            } else {
                                view2.requestFocus();
                                inputMethodManager.showSoftInput(view2, 0);
                            }
                            ((R1.f) qVar).b(null);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            try {
                                JSONObject jSONObject2 = (JSONObject) obj;
                                String string = jSONObject2.getString("action");
                                String string2 = jSONObject2.getString("data");
                                if (string2 != null && !string2.isEmpty()) {
                                    bundle = new Bundle();
                                    bundle.putString("data", string2);
                                } else {
                                    bundle = null;
                                }
                                io.flutter.plugin.editing.i iVar4 = (io.flutter.plugin.editing.i) ((C0262c) aVar.f51o).f5225n;
                                iVar4.f6165b.sendAppPrivateCommand(iVar4.f6164a, string, bundle);
                                ((R1.f) qVar).b(null);
                                return;
                            } catch (JSONException e5) {
                                ((R1.f) qVar).a("error", e5.getMessage(), null);
                                return;
                            }
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            try {
                                JSONObject jSONObject3 = (JSONObject) obj;
                                double d5 = jSONObject3.getDouble("width");
                                double d6 = jSONObject3.getDouble("height");
                                JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                                double[] dArr = new double[16];
                                for (int i5 = 0; i5 < 16; i5++) {
                                    dArr[i5] = jSONArray2.getDouble(i5);
                                }
                                ((C0262c) aVar.f51o).u(d5, d6, dArr);
                                ((R1.f) qVar).b(null);
                                return;
                            } catch (JSONException e6) {
                                ((R1.f) qVar).a("error", e6.getMessage(), null);
                                return;
                            }
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0262c c0262c = (C0262c) aVar.f51o;
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            if (Build.VERSION.SDK_INT >= 26) {
                                AutofillManager autofillManager = ((io.flutter.plugin.editing.i) c0262c.f5225n).f6166c;
                                if (autofillManager != null) {
                                    if (booleanValue) {
                                        autofillManager.commit();
                                    } else {
                                        autofillManager.cancel();
                                    }
                                }
                            } else {
                                c0262c.getClass();
                            }
                            ((R1.f) qVar).b(null);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            io.flutter.plugin.editing.i iVar5 = (io.flutter.plugin.editing.i) ((C0262c) aVar.f51o).f5225n;
                            if (iVar5.f6168e.f107b != 3) {
                                iVar5.f6171h.e(iVar5);
                                iVar5.d();
                                iVar5.f6169f = null;
                                iVar5.e(null);
                                iVar5.f6168e = new C0009j(1, 0, 6);
                                iVar5.f6176m = null;
                            }
                            ((R1.f) qVar).b(null);
                            return;
                        case '\t':
                            int i6 = Build.VERSION.SDK_INT;
                            io.flutter.plugin.editing.i iVar6 = (io.flutter.plugin.editing.i) ((C0262c) aVar.f51o).f5225n;
                            if (i6 >= 26) {
                                if (iVar6.f6166c != null && iVar6.f6170g != null) {
                                    int[] iArr = new int[2];
                                    View view3 = iVar6.f6164a;
                                    view3.getLocationOnScreen(iArr);
                                    Rect rect = new Rect(iVar6.f6176m);
                                    rect.offset(iArr[0], iArr[1]);
                                    iVar6.f6166c.notifyViewEntered(view3, ((String) iVar6.f6169f.f5625j.f650m).hashCode(), rect);
                                }
                            } else {
                                iVar6.getClass();
                            }
                            ((R1.f) qVar).b(null);
                            return;
                        default:
                            ((R1.f) qVar).c();
                            return;
                    }
                }
                return;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                B1.a aVar2 = (B1.a) this.f5225n;
                if (((C0262c) aVar2.f51o) != null) {
                    String str3 = oVar.f5788a;
                    str3.getClass();
                    if (!str3.equals("Localization.getStringResource")) {
                        ((R1.f) qVar).c();
                        return;
                    }
                    JSONObject jSONObject4 = (JSONObject) oVar.f5789b;
                    try {
                        String string3 = jSONObject4.getString("key");
                        if (jSONObject4.has("locale")) {
                            str = jSONObject4.getString("locale");
                        } else {
                            str = null;
                        }
                        ((R1.f) qVar).b(((C0262c) aVar2.f51o).o(string3, str));
                        return;
                    } catch (JSONException e7) {
                        ((R1.f) qVar).a("error", e7.getMessage(), null);
                        return;
                    }
                }
                return;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                C0262c c0262c2 = (C0262c) this.f5225n;
                if (((C0262c) c0262c2.f5225n) != null) {
                    String str4 = oVar.f5788a;
                    try {
                        if (str4.hashCode() == -1307105544 && str4.equals("activateSystemCursor")) {
                            try {
                                ((C0262c) c0262c2.f5225n).m((String) ((HashMap) oVar.f5789b).get("kind"));
                                ((R1.f) qVar).b(Boolean.TRUE);
                            } catch (Exception e8) {
                                ((R1.f) qVar).a("error", "Error when setting cursors: " + e8.getMessage(), null);
                            }
                        }
                        return;
                    } catch (Exception e9) {
                        ((R1.f) qVar).a("error", "Unhandled error: " + e9.getMessage(), null);
                        return;
                    }
                }
                return;
            case 10:
                q(oVar, qVar);
                return;
            case 11:
                B1.a aVar3 = (B1.a) this.f5225n;
                if (((io.flutter.plugin.platform.l) aVar3.f51o) != null) {
                    String str5 = oVar.f5788a;
                    str5.getClass();
                    Object obj2 = oVar.f5789b;
                    switch (str5.hashCode()) {
                        case -1352294148:
                            if (str5.equals("create")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1019779949:
                            if (str5.equals("offset")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -934437708:
                            if (str5.equals("resize")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -756050293:
                            if (str5.equals("clearFocus")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -308988850:
                            if (str5.equals("synchronizeToNativeViewHierarchy")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 110550847:
                            if (str5.equals("touch")) {
                                c3 = 5;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 576796989:
                            if (str5.equals("setDirection")) {
                                c3 = 6;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1671767583:
                            if (str5.equals("dispose")) {
                                c3 = 7;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                            java.util.Map map = (java.util.Map) obj2;
                            if (map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (map.containsKey("params")) {
                                byteBuffer = ByteBuffer.wrap((byte[]) map.get("params"));
                            } else {
                                byteBuffer = null;
                            }
                            try {
                                if (z3) {
                                    f2.h hVar = new f2.h(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 3, byteBuffer);
                                    io.flutter.plugin.platform.n nVar2 = (io.flutter.plugin.platform.n) ((io.flutter.plugin.platform.l) aVar3.f51o).f6219b;
                                    nVar2.getClass();
                                    io.flutter.plugin.platform.n.h(19);
                                    io.flutter.plugin.platform.n.e(nVar2, hVar);
                                    nVar2.f(hVar, false);
                                    io.flutter.plugin.platform.n.h(19);
                                    ((R1.f) qVar).b(null);
                                    return;
                                }
                                if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                                    c6 = 1;
                                }
                                if (c6 != 0) {
                                    i3 = 2;
                                } else {
                                    i3 = 1;
                                }
                                int intValue = ((Integer) map.get("id")).intValue();
                                String str6 = (String) map.get("viewType");
                                if (map.containsKey("top")) {
                                    d3 = ((Double) map.get("top")).doubleValue();
                                } else {
                                    d3 = 0.0d;
                                }
                                if (map.containsKey("left")) {
                                    d4 = ((Double) map.get("left")).doubleValue();
                                } else {
                                    d4 = 0.0d;
                                }
                                long d7 = ((io.flutter.plugin.platform.l) aVar3.f51o).d(new f2.h(intValue, str6, d3, d4, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), i3, byteBuffer));
                                if (d7 == -2) {
                                    if (c6 != 0) {
                                        ((R1.f) qVar).b(null);
                                        return;
                                    }
                                    throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                                }
                                ((R1.f) qVar).b(Long.valueOf(d7));
                                return;
                            } catch (IllegalStateException e10) {
                                ((R1.f) qVar).a("error", Log.getStackTraceString(e10), null);
                                return;
                            }
                        case 1:
                            java.util.Map map2 = (java.util.Map) obj2;
                            try {
                                ((io.flutter.plugin.platform.l) aVar3.f51o).g(((Integer) map2.get("id")).intValue(), ((Double) map2.get("top")).doubleValue(), ((Double) map2.get("left")).doubleValue());
                                ((R1.f) qVar).b(null);
                                return;
                            } catch (IllegalStateException e11) {
                                ((R1.f) qVar).a("error", Log.getStackTraceString(e11), null);
                                return;
                            }
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            java.util.Map map3 = (java.util.Map) obj2;
                            try {
                                ((io.flutter.plugin.platform.l) aVar3.f51o).j(new f2.i(((Integer) map3.get("id")).intValue(), ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue()), new f2.g((R1.f) qVar));
                                return;
                            } catch (IllegalStateException e12) {
                                ((R1.f) qVar).a("error", Log.getStackTraceString(e12), null);
                                return;
                            }
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            try {
                                ((io.flutter.plugin.platform.l) aVar3.f51o).c(((Integer) obj2).intValue());
                                ((R1.f) qVar).b(null);
                                return;
                            } catch (IllegalStateException e13) {
                                ((R1.f) qVar).a("error", Log.getStackTraceString(e13), null);
                                return;
                            }
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            try {
                                ((io.flutter.plugin.platform.n) ((io.flutter.plugin.platform.l) aVar3.f51o).f6219b).f6253q = ((Boolean) obj2).booleanValue();
                                ((R1.f) qVar).b(null);
                                return;
                            } catch (IllegalStateException e14) {
                                ((R1.f) qVar).a("error", Log.getStackTraceString(e14), null);
                                return;
                            }
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            List list = (List) obj2;
                            try {
                                ((io.flutter.plugin.platform.l) aVar3.f51o).h(new f2.j(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                                ((R1.f) qVar).b(null);
                                return;
                            } catch (IllegalStateException e15) {
                                ((R1.f) qVar).a("error", Log.getStackTraceString(e15), null);
                                return;
                            }
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            java.util.Map map4 = (java.util.Map) obj2;
                            try {
                                ((io.flutter.plugin.platform.l) aVar3.f51o).k(((Integer) map4.get("id")).intValue(), ((Integer) map4.get("direction")).intValue());
                                ((R1.f) qVar).b(null);
                                return;
                            } catch (IllegalStateException e16) {
                                ((R1.f) qVar).a("error", Log.getStackTraceString(e16), null);
                                return;
                            }
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            try {
                                ((io.flutter.plugin.platform.l) aVar3.f51o).e(((Integer) ((java.util.Map) obj2).get("id")).intValue());
                                ((R1.f) qVar).b(null);
                                return;
                            } catch (IllegalStateException e17) {
                                ((R1.f) qVar).a("error", Log.getStackTraceString(e17), null);
                                return;
                            }
                        default:
                            ((R1.f) qVar).c();
                            return;
                    }
                }
                return;
            case 12:
                r(oVar, qVar);
                return;
            case 13:
                B1.a aVar4 = (B1.a) this.f5225n;
                if (((C0518a) aVar4.f51o) != null) {
                    String str7 = oVar.f5788a;
                    Object obj3 = oVar.f5789b;
                    str7.getClass();
                    if (!str7.equals("ProcessText.processTextAction")) {
                        if (!str7.equals("ProcessText.queryTextActions")) {
                            ((R1.f) qVar).c();
                            return;
                        }
                        try {
                            ((R1.f) qVar).b(((C0518a) aVar4.f51o).b());
                            return;
                        } catch (IllegalStateException e18) {
                            ((R1.f) qVar).a("error", e18.getMessage(), null);
                            return;
                        }
                    }
                    try {
                        ArrayList arrayList = (ArrayList) obj3;
                        ((C0518a) aVar4.f51o).a((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), (R1.f) qVar);
                        return;
                    } catch (IllegalStateException e19) {
                        ((R1.f) qVar).a("error", e19.getMessage(), null);
                        return;
                    }
                }
                return;
            case 14:
                String str8 = oVar.f5788a;
                str8.getClass();
                f2.k kVar = (f2.k) this.f5225n;
                if (!str8.equals("get")) {
                    if (!str8.equals("put")) {
                        ((R1.f) qVar).c();
                        return;
                    }
                    kVar.f5606b = (byte[]) oVar.f5789b;
                    ((R1.f) qVar).b(null);
                    return;
                }
                kVar.f5610f = true;
                if (!kVar.f5609e && kVar.f5605a) {
                    kVar.f5608d = (R1.f) qVar;
                    return;
                }
                ((R1.f) qVar).b(f2.k.a(kVar.f5606b));
                return;
            case 15:
                C0262c c0262c3 = (C0262c) this.f5225n;
                if (((C0276a) c0262c3.f5225n) != null) {
                    String str9 = oVar.f5788a;
                    str9.getClass();
                    switch (str9.hashCode()) {
                        case -705821951:
                            if (str9.equals("Scribe.isFeatureAvailable")) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1759284829:
                            if (str9.equals("Scribe.startStylusHandwriting")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 2119738044:
                            if (str9.equals("Scribe.isStylusHandwritingAvailable")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
                        case 0:
                            try {
                                C0276a c0276a = (C0276a) c0262c3.f5225n;
                                if (Build.VERSION.SDK_INT >= 34) {
                                    isStylusHandwritingAvailable = ((InputMethodManager) c0276a.f5777n).isStylusHandwritingAvailable();
                                    if (isStylusHandwritingAvailable) {
                                        z4 = true;
                                    }
                                } else {
                                    c0276a.getClass();
                                }
                                ((R1.f) qVar).b(Boolean.valueOf(z4));
                                return;
                            } catch (IllegalStateException e20) {
                                ((R1.f) qVar).a("error", e20.getMessage(), null);
                                return;
                            }
                        case 1:
                            if (Build.VERSION.SDK_INT < 33) {
                                ((R1.f) qVar).a("error", "Requires API level 33 or higher.", null);
                                return;
                            }
                            try {
                                C0276a c0276a2 = (C0276a) c0262c3.f5225n;
                                ((InputMethodManager) c0276a2.f5777n).startStylusHandwriting((View) c0276a2.f5778o);
                                ((R1.f) qVar).b(null);
                                return;
                            } catch (IllegalStateException e21) {
                                ((R1.f) qVar).a("error", e21.getMessage(), null);
                                return;
                            }
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            if (Build.VERSION.SDK_INT >= 34) {
                                try {
                                    isStylusHandwritingAvailable2 = ((InputMethodManager) ((C0276a) c0262c3.f5225n).f5777n).isStylusHandwritingAvailable();
                                    ((R1.f) qVar).b(Boolean.valueOf(isStylusHandwritingAvailable2));
                                    return;
                                } catch (IllegalStateException e22) {
                                    ((R1.f) qVar).a("error", e22.getMessage(), null);
                                    return;
                                }
                            }
                            ((R1.f) qVar).a("error", "Requires API level 34 or higher.", null);
                            return;
                        default:
                            ((R1.f) qVar).c();
                            return;
                    }
                }
                return;
            case 17:
                C0262c c0262c4 = (C0262c) this.f5225n;
                if (((io.flutter.plugin.editing.f) c0262c4.f5225n) != null) {
                    String str10 = oVar.f5788a;
                    Object obj4 = oVar.f5789b;
                    str10.getClass();
                    if (!str10.equals("SpellCheck.initiateSpellCheck")) {
                        ((R1.f) qVar).c();
                        return;
                    }
                    try {
                        ArrayList arrayList2 = (ArrayList) obj4;
                        ((io.flutter.plugin.editing.f) c0262c4.f5225n).a((String) arrayList2.get(0), (String) arrayList2.get(1), (R1.f) qVar);
                        return;
                    } catch (IllegalStateException e23) {
                        ((R1.f) qVar).a("error", e23.getMessage(), null);
                        return;
                    }
                }
                return;
        }
    }

    public void s() {
        t[] tVarArr;
        t[] tVarArr2;
        n nVar = (n) this.f5225n;
        int i3 = nVar.f5290D - 1;
        nVar.f5290D = i3;
        if (i3 > 0) {
            return;
        }
        int i4 = 0;
        for (t tVar : nVar.f5292F) {
            tVar.f();
            i4 += tVar.f5354U.f8579a;
        }
        U[] uArr = new U[i4];
        int i5 = 0;
        for (t tVar2 : nVar.f5292F) {
            tVar2.f();
            int i6 = tVar2.f5354U.f8579a;
            int i7 = 0;
            while (i7 < i6) {
                tVar2.f();
                uArr[i5] = tVar2.f5354U.a(i7);
                i7++;
                i5++;
            }
        }
        nVar.f5291E = new b0(uArr);
        nVar.f5289C.j(nVar);
    }

    public void t(int i3, f2.n nVar) {
        f2.p pVar;
        io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) this.f5225n;
        iVar.d();
        iVar.f6169f = nVar;
        iVar.f6168e = new C0009j(2, i3, 6);
        iVar.f6171h.e(iVar);
        C0059m c0059m = nVar.f5625j;
        if (c0059m != null) {
            pVar = (f2.p) c0059m.f652o;
        } else {
            pVar = null;
        }
        iVar.f6171h = new io.flutter.plugin.editing.e(pVar, iVar.f6164a);
        iVar.e(nVar);
        iVar.f6172i = true;
        if (iVar.f6168e.f107b == 3) {
            iVar.f6179p = false;
        }
        iVar.f6176m = null;
        iVar.f6171h.a(iVar);
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, Y.b] */
    public void u(double d3, double d4, double[] dArr) {
        boolean z3;
        io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) this.f5225n;
        iVar.getClass();
        double[] dArr2 = new double[4];
        if (dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d) {
            z3 = true;
        } else {
            z3 = false;
        }
        double d5 = dArr[12];
        double d6 = dArr[15];
        double d7 = d5 / d6;
        dArr2[1] = d7;
        dArr2[0] = d7;
        double d8 = dArr[13] / d6;
        dArr2[3] = d8;
        dArr2[2] = d8;
        ?? obj = new Object();
        obj.f3216a = z3;
        obj.f3217b = dArr;
        obj.f3218c = dArr2;
        obj.a(d3, 0.0d);
        obj.a(d3, d4);
        obj.a(0.0d, d4);
        double d9 = iVar.f6164a.getContext().getResources().getDisplayMetrics().density;
        iVar.f6176m = new Rect((int) (dArr2[0] * d9), (int) (dArr2[2] * d9), (int) Math.ceil(dArr2[1] * d9), (int) Math.ceil(dArr2[3] * d9));
    }

    public void v(f2.p pVar) {
        f2.p pVar2;
        int i3;
        int i4;
        io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) this.f5225n;
        View view = iVar.f6164a;
        if (!iVar.f6172i && (pVar2 = iVar.f6178o) != null && (i3 = pVar2.f5634d) >= 0 && (i4 = pVar2.f5635e) > i3) {
            int i5 = i4 - i3;
            int i6 = pVar.f5635e;
            int i7 = pVar.f5634d;
            boolean z3 = true;
            if (i5 == i6 - i7) {
                int i8 = 0;
                while (true) {
                    if (i8 < i5) {
                        if (pVar2.f5631a.charAt(i8 + i3) != pVar.f5631a.charAt(i8 + i7)) {
                            break;
                        }
                        i8++;
                    } else {
                        z3 = false;
                        break;
                    }
                }
            }
            iVar.f6172i = z3;
        }
        iVar.f6178o = pVar;
        iVar.f6171h.f(pVar);
        if (iVar.f6172i) {
            iVar.f6165b.restartInput(view);
            iVar.f6172i = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
        if (r2 >= 26) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0078, code lost:
        if (r2 >= 34) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int w(R.C0113p r7) {
        /*
            r6 = this;
            r0 = 4
            r1 = 1
            java.lang.String r2 = r7.f1974m
            r3 = 0
            if (r2 == 0) goto L84
            boolean r2 = R.G.i(r2)
            if (r2 != 0) goto Lf
            goto L84
        Lf:
            int r2 = U.A.f2405a
            java.lang.String r7 = r7.f1974m
            r7.getClass()
            int r2 = U.A.f2405a
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1487656890: goto L63;
                case -1487464693: goto L58;
                case -1487464690: goto L4d;
                case -1487394660: goto L42;
                case -1487018032: goto L37;
                case -879272239: goto L2c;
                case -879258763: goto L21;
                default: goto L20;
            }
        L20:
            goto L6d
        L21:
            java.lang.String r5 = "image/png"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L2a
            goto L6d
        L2a:
            r4 = 6
            goto L6d
        L2c:
            java.lang.String r5 = "image/bmp"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L35
            goto L6d
        L35:
            r4 = 5
            goto L6d
        L37:
            java.lang.String r5 = "image/webp"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L40
            goto L6d
        L40:
            r4 = 4
            goto L6d
        L42:
            java.lang.String r5 = "image/jpeg"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L4b
            goto L6d
        L4b:
            r4 = 3
            goto L6d
        L4d:
            java.lang.String r5 = "image/heif"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L56
            goto L6d
        L56:
            r4 = 2
            goto L6d
        L58:
            java.lang.String r5 = "image/heic"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L61
            goto L6d
        L61:
            r4 = 1
            goto L6d
        L63:
            java.lang.String r5 = "image/avif"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L6c
            goto L6d
        L6c:
            r4 = 0
        L6d:
            switch(r4) {
                case 0: goto L76;
                case 1: goto L71;
                case 2: goto L71;
                case 3: goto L7a;
                case 4: goto L7a;
                case 5: goto L7a;
                case 6: goto L7a;
                default: goto L70;
            }
        L70:
            goto L7f
        L71:
            r7 = 26
            if (r2 < r7) goto L7f
            goto L7a
        L76:
            r7 = 34
            if (r2 < r7) goto L7f
        L7a:
            int r7 = D2.h.e(r0, r3, r3, r3)
            goto L83
        L7f:
            int r7 = D2.h.e(r1, r3, r3, r3)
        L83:
            return r7
        L84:
            int r7 = D2.h.e(r3, r3, r3, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.C0262c.w(R.p):int");
    }

    public C0262c(Y1.b bVar, int i3) {
        this.f5224m = i3;
        switch (i3) {
            case 16:
                new g2.r(bVar, "flutter/scribe", g2.m.f5787a).b(new C0262c(this, 15));
                return;
            case 17:
            default:
                new g2.r(bVar, "flutter/mousecursor", x.f5796a).b(new C0262c(this, 8));
                return;
            case 18:
                new g2.r(bVar, "flutter/spellcheck", x.f5796a).b(new C0262c(this, 17));
                return;
        }
    }

    public C0262c(int i3) {
        this.f5224m = i3;
        switch (i3) {
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                this.f5225n = new SparseArray();
                return;
            case 20:
                this.f5225n = new C0271b(0);
                return;
            case 24:
                this.f5225n = new SparseIntArray();
                return;
            default:
                this.f5225n = new LinkedHashMap(5, 1.0f, false);
                return;
        }
    }

    public C0262c(g2.g gVar) {
        this.f5224m = 6;
        new g2.r(gVar, "flutter/keyboard", x.f5796a).b(new B1.a(this));
    }

    @Override // h0.m
    public void flush() {
    }

    @Override // h0.m
    public void g() {
    }

    @Override // h0.m
    public void k() {
    }

    @Override // h0.m
    public void start() {
    }
}
