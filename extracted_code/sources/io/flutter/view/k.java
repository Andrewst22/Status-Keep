package io.flutter.view;

import K.C0059m;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class k extends AccessibilityNodeProvider {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f6371z = 0;

    /* renamed from: a  reason: collision with root package name */
    public final View f6372a;

    /* renamed from: b  reason: collision with root package name */
    public final B1.e f6373b;

    /* renamed from: c  reason: collision with root package name */
    public final AccessibilityManager f6374c;

    /* renamed from: d  reason: collision with root package name */
    public final AccessibilityViewEmbedder f6375d;

    /* renamed from: e  reason: collision with root package name */
    public final io.flutter.plugin.platform.h f6376e;

    /* renamed from: f  reason: collision with root package name */
    public final ContentResolver f6377f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f6378g;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f6379h;

    /* renamed from: i  reason: collision with root package name */
    public g f6380i;

    /* renamed from: j  reason: collision with root package name */
    public Integer f6381j;

    /* renamed from: k  reason: collision with root package name */
    public Integer f6382k;

    /* renamed from: l  reason: collision with root package name */
    public int f6383l;

    /* renamed from: m  reason: collision with root package name */
    public g f6384m;

    /* renamed from: n  reason: collision with root package name */
    public g f6385n;

    /* renamed from: o  reason: collision with root package name */
    public g f6386o;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f6387p;

    /* renamed from: q  reason: collision with root package name */
    public int f6388q;

    /* renamed from: r  reason: collision with root package name */
    public Integer f6389r;

    /* renamed from: s  reason: collision with root package name */
    public C1.j f6390s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f6391t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f6392u;

    /* renamed from: v  reason: collision with root package name */
    public final a f6393v;

    /* renamed from: w  reason: collision with root package name */
    public final b f6394w;
    public final c x;

    /* renamed from: y  reason: collision with root package name */
    public final I.a f6395y;

    public k(View view, B1.e eVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.h hVar) {
        int i3;
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, 65536);
        this.f6378g = new HashMap();
        this.f6379h = new HashMap();
        this.f6383l = 0;
        this.f6387p = new ArrayList();
        this.f6388q = 0;
        this.f6389r = 0;
        this.f6391t = false;
        this.f6392u = false;
        this.f6393v = new a(this);
        b bVar = new b(this);
        this.f6394w = bVar;
        I.a aVar = new I.a(this, new Handler(), 2);
        this.f6395y = aVar;
        this.f6372a = view;
        this.f6373b = eVar;
        this.f6374c = accessibilityManager;
        this.f6377f = contentResolver;
        this.f6375d = accessibilityViewEmbedder;
        this.f6376e = hVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        c cVar = new c(this, accessibilityManager);
        this.x = cVar;
        cVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(cVar);
        aVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, aVar);
        if (Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            i3 = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i3 != Integer.MAX_VALUE && i3 >= 300) {
                this.f6383l |= 8;
            } else {
                this.f6383l &= -9;
            }
            ((FlutterJNI) eVar.f57o).setAccessibilityFeatures(this.f6383l);
        }
        hVar.b(this);
    }

    public final boolean a(SurfaceView surfaceView, View view, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f6375d;
        if (!accessibilityViewEmbedder.requestSendAccessibilityEvent(surfaceView, view, accessibilityEvent) || (recordFlutterId = accessibilityViewEmbedder.getRecordFlutterId(surfaceView, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType != 8) {
            if (eventType != 128) {
                if (eventType != 32768) {
                    if (eventType == 65536) {
                        this.f6382k = null;
                        this.f6381j = null;
                        return true;
                    }
                    return true;
                }
                this.f6381j = recordFlutterId;
                this.f6380i = null;
                return true;
            }
            this.f6386o = null;
            return true;
        }
        this.f6382k = recordFlutterId;
        this.f6384m = null;
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, io.flutter.view.e] */
    public final e b(int i3) {
        HashMap hashMap = this.f6379h;
        e eVar = (e) hashMap.get(Integer.valueOf(i3));
        if (eVar == null) {
            ?? obj = new Object();
            obj.f6313c = -1;
            obj.f6312b = i3;
            obj.f6311a = 267386881 + i3;
            hashMap.put(Integer.valueOf(i3), obj);
            return obj;
        }
        return eVar;
    }

    public final g c(int i3) {
        HashMap hashMap = this.f6378g;
        g gVar = (g) hashMap.get(Integer.valueOf(i3));
        if (gVar == null) {
            g gVar2 = new g(this);
            gVar2.f6343b = i3;
            hashMap.put(Integer.valueOf(i3), gVar2);
            return gVar2;
        }
        return gVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        boolean z3;
        String str;
        int i4;
        int i5;
        int length;
        int i6;
        boolean z4;
        boolean z5;
        boolean z6;
        i(true);
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f6375d;
        if (i3 >= 65536) {
            return accessibilityViewEmbedder.createAccessibilityNodeInfo(i3);
        }
        HashMap hashMap = this.f6378g;
        View view = this.f6372a;
        if (i3 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (hashMap.containsKey(0)) {
                obtain.addChild(view, 0);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                obtain.setImportantForAccessibility(false);
            }
            return obtain;
        }
        g gVar = (g) hashMap.get(Integer.valueOf(i3));
        if (gVar == null) {
            return null;
        }
        int i7 = gVar.f6350i;
        io.flutter.plugin.platform.h hVar = this.f6376e;
        if (i7 != -1 && hVar.c(i7)) {
            SurfaceView d3 = hVar.d(gVar.f6350i);
            if (d3 == null) {
                return null;
            }
            return accessibilityViewEmbedder.getRootNode(d3, gVar.f6343b, gVar.f6341Z);
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(view, i3);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 24) {
            if (gVar.i(12) || (g.b(gVar) == null && gVar.f6345d == 0)) {
                z6 = false;
            } else {
                z6 = true;
            }
            obtain2.setImportantForAccessibility(z6);
        }
        CharSequence charSequence = "";
        obtain2.setViewIdResourceName("");
        String str2 = gVar.f6356o;
        if (str2 != null) {
            obtain2.setViewIdResourceName(str2);
        }
        obtain2.setPackageName(view.getContext().getPackageName());
        obtain2.setClassName("android.view.View");
        obtain2.setSource(view, i3);
        obtain2.setFocusable(gVar.k());
        g gVar2 = this.f6384m;
        if (gVar2 != null) {
            if (gVar2.f6343b == i3) {
                z5 = true;
            } else {
                z5 = false;
            }
            obtain2.setFocused(z5);
        }
        g gVar3 = this.f6380i;
        if (gVar3 != null) {
            if (gVar3.f6343b == i3) {
                z4 = true;
            } else {
                z4 = false;
            }
            obtain2.setAccessibilityFocused(z4);
        }
        if (gVar.i(5)) {
            obtain2.setPassword(gVar.i(11));
            if (!gVar.i(21)) {
                obtain2.setClassName("android.widget.EditText");
            }
            obtain2.setEditable(!gVar.i(21));
            int i9 = gVar.f6348g;
            if (i9 != -1 && (i6 = gVar.f6349h) != -1) {
                obtain2.setTextSelection(i9, i6);
            }
            g gVar4 = this.f6380i;
            if (gVar4 != null && gVar4.f6343b == i3) {
                obtain2.setLiveRegion(1);
            }
            if (g.a(gVar, d.f6307w)) {
                obtain2.addAction(256);
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (g.a(gVar, d.x)) {
                obtain2.addAction(512);
                i5 = 1;
            }
            if (g.a(gVar, d.f6294G)) {
                obtain2.addAction(256);
                i5 |= 2;
            }
            if (g.a(gVar, d.f6295H)) {
                obtain2.addAction(512);
                i5 |= 2;
            }
            obtain2.setMovementGranularities(i5);
            if (gVar.f6346e >= 0) {
                String str3 = gVar.f6359r;
                if (str3 == null) {
                    length = 0;
                } else {
                    length = str3.length();
                }
                obtain2.setMaxTextLength((length - gVar.f6347f) + gVar.f6346e);
            }
        }
        if (g.a(gVar, d.f6308y)) {
            obtain2.addAction(131072);
        }
        if (g.a(gVar, d.f6309z)) {
            obtain2.addAction(16384);
        }
        if (g.a(gVar, d.f6288A)) {
            obtain2.addAction(65536);
        }
        if (g.a(gVar, d.f6289B)) {
            obtain2.addAction(32768);
        }
        if (g.a(gVar, d.f6296I)) {
            obtain2.addAction(2097152);
        }
        if (gVar.i(4)) {
            obtain2.setClassName("android.widget.Button");
        }
        if (gVar.i(15)) {
            obtain2.setClassName("android.widget.ImageView");
        }
        if (g.a(gVar, d.f6293F)) {
            obtain2.setDismissable(true);
            obtain2.addAction(1048576);
        }
        g gVar5 = gVar.f6331P;
        if (gVar5 != null) {
            obtain2.setParent(view, gVar5.f6343b);
        } else {
            obtain2.setParent(view);
        }
        int i10 = gVar.f6318B;
        if (i10 != -1 && i8 >= 22) {
            obtain2.setTraversalAfter(view, i10);
        }
        Rect rect = gVar.f6341Z;
        g gVar6 = gVar.f6331P;
        if (gVar6 != null) {
            Rect rect2 = gVar6.f6341Z;
            Rect rect3 = new Rect(rect);
            rect3.offset(-rect2.left, -rect2.top);
            obtain2.setBoundsInParent(rect3);
        } else {
            obtain2.setBoundsInParent(rect);
        }
        Rect rect4 = new Rect(rect);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect4.offset(iArr[0], iArr[1]);
        obtain2.setBoundsInScreen(rect4);
        obtain2.setVisibleToUser(true);
        if (gVar.i(7) && !gVar.i(8)) {
            z3 = false;
        } else {
            z3 = true;
        }
        obtain2.setEnabled(z3);
        if (g.a(gVar, d.f6298n)) {
            if (gVar.f6335T != null) {
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, gVar.f6335T.f6315e));
                obtain2.setClickable(true);
            } else {
                obtain2.addAction(16);
                obtain2.setClickable(true);
            }
        } else if (gVar.i(24)) {
            obtain2.addAction(16);
            obtain2.setClickable(true);
        }
        if (g.a(gVar, d.f6299o)) {
            if (gVar.f6336U != null) {
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, gVar.f6336U.f6315e));
                obtain2.setLongClickable(true);
            } else {
                obtain2.addAction(32);
                obtain2.setLongClickable(true);
            }
        }
        d dVar = d.f6300p;
        boolean a3 = g.a(gVar, dVar);
        d dVar2 = d.f6303s;
        d dVar3 = d.f6302r;
        d dVar4 = d.f6301q;
        if (a3 || g.a(gVar, dVar3) || g.a(gVar, dVar4) || g.a(gVar, dVar2)) {
            obtain2.setScrollable(true);
            if (gVar.i(19)) {
                if (!g.a(gVar, dVar) && !g.a(gVar, dVar4)) {
                    if (j(gVar)) {
                        obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(gVar.f6351j, 0, false));
                    } else {
                        obtain2.setClassName("android.widget.ScrollView");
                    }
                } else if (j(gVar)) {
                    obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, gVar.f6351j, false));
                } else {
                    obtain2.setClassName("android.widget.HorizontalScrollView");
                }
            }
            if (g.a(gVar, dVar) || g.a(gVar, dVar3)) {
                obtain2.addAction(4096);
            }
            if (g.a(gVar, dVar4) || g.a(gVar, dVar2)) {
                obtain2.addAction(8192);
            }
        }
        d dVar5 = d.f6304t;
        boolean a4 = g.a(gVar, dVar5);
        d dVar6 = d.f6305u;
        if (a4 || g.a(gVar, dVar6)) {
            obtain2.setClassName("android.widget.SeekBar");
            if (g.a(gVar, dVar5)) {
                obtain2.addAction(4096);
            }
            if (g.a(gVar, dVar6)) {
                obtain2.addAction(8192);
            }
        }
        if (gVar.i(16)) {
            obtain2.setLiveRegion(1);
        }
        if (gVar.i(5)) {
            obtain2.setText(g.e(gVar.f6359r, gVar.f6360s));
            if (i8 >= 28) {
                CharSequence[] charSequenceArr = {gVar.f(), g.e(gVar.x, gVar.f6365y)};
                int i11 = 0;
                CharSequence charSequence2 = null;
                for (int i12 = 2; i11 < i12; i12 = 2) {
                    CharSequence charSequence3 = charSequenceArr[i11];
                    if (charSequence3 != null && charSequence3.length() > 0) {
                        if (charSequence2 == null || charSequence2.length() == 0) {
                            i4 = 1;
                        } else {
                            i4 = 1;
                            charSequence3 = TextUtils.concat(charSequence2, ", ", charSequence3);
                        }
                        charSequence2 = charSequence3;
                    } else {
                        i4 = 1;
                    }
                    i11 += i4;
                }
                obtain2.setHintText(charSequence2);
            }
        } else if (!gVar.i(12)) {
            CharSequence b3 = g.b(gVar);
            if (i8 < 28 && gVar.f6366z != null) {
                if (b3 != null) {
                    charSequence = b3;
                }
                b3 = ((Object) charSequence) + "\n" + gVar.f6366z;
            }
            if (b3 != null) {
                obtain2.setContentDescription(b3);
            }
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 28 && (str = gVar.f6366z) != null) {
            obtain2.setTooltipText(str);
        }
        boolean z7 = true;
        boolean i14 = gVar.i(1);
        boolean i15 = gVar.i(17);
        if (!i14 && !i15) {
            z7 = false;
        }
        obtain2.setCheckable(z7);
        if (i14) {
            obtain2.setChecked(gVar.i(2));
            if (gVar.i(9)) {
                obtain2.setClassName("android.widget.RadioButton");
            } else {
                obtain2.setClassName("android.widget.CheckBox");
            }
        } else if (i15) {
            obtain2.setChecked(gVar.i(18));
            obtain2.setClassName("android.widget.Switch");
        }
        obtain2.setSelected(gVar.i(3));
        if (i13 >= 28) {
            obtain2.setHeading(gVar.i(10));
        }
        g gVar7 = this.f6380i;
        if (gVar7 != null && gVar7.f6343b == i3) {
            obtain2.addAction(128);
        } else {
            obtain2.addAction(64);
        }
        ArrayList arrayList = gVar.f6334S;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(eVar.f6311a, eVar.f6314d));
            }
        }
        Iterator it2 = gVar.f6332Q.iterator();
        while (it2.hasNext()) {
            g gVar8 = (g) it2.next();
            if (!gVar8.i(14)) {
                int i16 = gVar8.f6350i;
                if (i16 != -1) {
                    SurfaceView d4 = hVar.d(i16);
                    if (!hVar.c(gVar8.f6350i)) {
                        obtain2.addChild(d4);
                    }
                }
                obtain2.addChild(view, gVar8.f6343b);
            }
        }
        return obtain2;
    }

    public final AccessibilityEvent d(int i3, int i4) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i4);
        View view = this.f6372a;
        obtain.setPackageName(view.getContext().getPackageName());
        obtain.setSource(view, i3);
        return obtain;
    }

    public final boolean e(MotionEvent motionEvent, boolean z3) {
        g j3;
        if (!this.f6374c.isTouchExplorationEnabled()) {
            return false;
        }
        HashMap hashMap = this.f6378g;
        if (hashMap.isEmpty()) {
            return false;
        }
        g j4 = ((g) hashMap.get(0)).j(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z3);
        if (j4 != null && j4.f6350i != -1) {
            if (z3) {
                return false;
            }
            return this.f6375d.onAccessibilityHoverEvent(j4.f6343b, motionEvent);
        }
        if (motionEvent.getAction() != 9 && motionEvent.getAction() != 7) {
            if (motionEvent.getAction() == 10) {
                g gVar = this.f6386o;
                if (gVar != null) {
                    g(gVar.f6343b, 256);
                    this.f6386o = null;
                }
            } else {
                motionEvent.toString();
                return false;
            }
        } else {
            float x = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (!hashMap.isEmpty() && (j3 = ((g) hashMap.get(0)).j(new float[]{x, y3, 0.0f, 1.0f}, z3)) != this.f6386o) {
                if (j3 != null) {
                    g(j3.f6343b, 128);
                }
                g gVar2 = this.f6386o;
                if (gVar2 != null) {
                    g(gVar2.f6343b, 256);
                }
                this.f6386o = j3;
            }
        }
        return true;
    }

    public final boolean f(g gVar, int i3, Bundle bundle, boolean z3) {
        int i4;
        int i5 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z4 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i6 = gVar.f6348g;
        int i7 = gVar.f6349h;
        if (i7 >= 0 && i6 >= 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 4) {
                        if (i5 == 8 || i5 == 16) {
                            if (z3) {
                                gVar.f6349h = gVar.f6359r.length();
                            } else {
                                gVar.f6349h = 0;
                            }
                        }
                    } else if (z3 && i7 < gVar.f6359r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(gVar.f6359r.substring(gVar.f6349h));
                        if (matcher.find()) {
                            gVar.f6349h += matcher.start(1);
                        } else {
                            gVar.f6349h = gVar.f6359r.length();
                        }
                    } else if (!z3 && gVar.f6349h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(gVar.f6359r.substring(0, gVar.f6349h));
                        if (matcher2.find()) {
                            gVar.f6349h = matcher2.start(1);
                        } else {
                            gVar.f6349h = 0;
                        }
                    }
                } else if (z3 && i7 < gVar.f6359r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(gVar.f6359r.substring(gVar.f6349h));
                    matcher3.find();
                    if (matcher3.find()) {
                        gVar.f6349h += matcher3.start(1);
                    } else {
                        gVar.f6349h = gVar.f6359r.length();
                    }
                } else if (!z3 && gVar.f6349h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(gVar.f6359r.substring(0, gVar.f6349h));
                    if (matcher4.find()) {
                        gVar.f6349h = matcher4.start(1);
                    }
                }
            } else if (z3 && i7 < gVar.f6359r.length()) {
                gVar.f6349h++;
            } else if (!z3 && (i4 = gVar.f6349h) > 0) {
                gVar.f6349h = i4 - 1;
            }
            if (!z4) {
                gVar.f6348g = gVar.f6349h;
            }
        }
        if (i6 != gVar.f6348g || i7 != gVar.f6349h) {
            String str = gVar.f6359r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent d3 = d(gVar.f6343b, 8192);
            d3.getText().add(str);
            d3.setFromIndex(gVar.f6348g);
            d3.setToIndex(gVar.f6349h);
            d3.setItemCount(str.length());
            h(d3);
        }
        B1.e eVar = this.f6373b;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 4 || i5 == 8 || i5 == 16) {
                    return true;
                }
            } else {
                if (z3) {
                    d dVar = d.f6294G;
                    if (g.a(gVar, dVar)) {
                        eVar.W(i3, dVar, Boolean.valueOf(z4));
                        return true;
                    }
                }
                if (!z3) {
                    d dVar2 = d.f6295H;
                    if (g.a(gVar, dVar2)) {
                        eVar.W(i3, dVar2, Boolean.valueOf(z4));
                        return true;
                    }
                }
            }
        } else {
            if (z3) {
                d dVar3 = d.f6307w;
                if (g.a(gVar, dVar3)) {
                    eVar.W(i3, dVar3, Boolean.valueOf(z4));
                    return true;
                }
            }
            if (!z3) {
                d dVar4 = d.x;
                if (g.a(gVar, dVar4)) {
                    eVar.W(i3, dVar4, Boolean.valueOf(z4));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                return null;
            }
        } else {
            g gVar = this.f6384m;
            if (gVar != null) {
                return createAccessibilityNodeInfo(gVar.f6343b);
            }
            Integer num = this.f6382k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        }
        g gVar2 = this.f6380i;
        if (gVar2 != null) {
            return createAccessibilityNodeInfo(gVar2.f6343b);
        }
        Integer num2 = this.f6381j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public final void g(int i3, int i4) {
        if (!this.f6374c.isEnabled()) {
            return;
        }
        h(d(i3, i4));
    }

    public final void h(AccessibilityEvent accessibilityEvent) {
        if (!this.f6374c.isEnabled()) {
            return;
        }
        View view = this.f6372a;
        view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public final void i(boolean z3) {
        if (this.f6391t == z3) {
            return;
        }
        this.f6391t = z3;
        if (z3) {
            this.f6383l |= 1;
        } else {
            this.f6383l &= -2;
        }
        ((FlutterJNI) this.f6373b.f57o).setAccessibilityFeatures(this.f6383l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0014, code lost:
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(io.flutter.view.g r3) {
        /*
            r2 = this;
            int r0 = r3.f6351j
            if (r0 <= 0) goto L31
            io.flutter.view.g r0 = r2.f6380i
            r1 = 0
            if (r0 == 0) goto L17
            io.flutter.view.g r0 = r0.f6331P
        Lb:
            if (r0 == 0) goto L13
            if (r0 != r3) goto L10
            goto L14
        L10:
            io.flutter.view.g r0 = r0.f6331P
            goto Lb
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L17
            goto L2f
        L17:
            io.flutter.view.g r3 = r2.f6380i
            if (r3 == 0) goto L2f
            io.flutter.view.g r3 = r3.f6331P
        L1d:
            if (r3 == 0) goto L2c
            r0 = 19
            boolean r0 = r3.i(r0)
            if (r0 == 0) goto L29
            r1 = r3
            goto L2c
        L29:
            io.flutter.view.g r3 = r3.f6331P
            goto L1d
        L2c:
            if (r1 == 0) goto L2f
            goto L31
        L2f:
            r3 = 1
            goto L32
        L31:
            r3 = 0
        L32:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.k.j(io.flutter.view.g):boolean");
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i3, int i4, Bundle bundle) {
        String str;
        if (i3 >= 65536) {
            boolean performAction = this.f6375d.performAction(i3, i4, bundle);
            if (performAction && i4 == 128) {
                this.f6381j = null;
            }
            return performAction;
        }
        HashMap hashMap = this.f6378g;
        g gVar = (g) hashMap.get(Integer.valueOf(i3));
        if (gVar == null) {
            return false;
        }
        d dVar = d.f6304t;
        d dVar2 = d.f6305u;
        B1.e eVar = this.f6373b;
        switch (i4) {
            case 16:
                eVar.V(i3, d.f6298n);
                return true;
            case 32:
                eVar.V(i3, d.f6299o);
                return true;
            case 64:
                if (this.f6380i == null) {
                    this.f6372a.invalidate();
                }
                this.f6380i = gVar;
                eVar.V(i3, d.f6290C);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("type", "didGainFocus");
                hashMap2.put("nodeId", Integer.valueOf(gVar.f6343b));
                ((C0059m) eVar.f56n).n(hashMap2, null);
                g(i3, 32768);
                if (g.a(gVar, dVar) || g.a(gVar, dVar2)) {
                    g(i3, 4);
                }
                return true;
            case 128:
                g gVar2 = this.f6380i;
                if (gVar2 != null && gVar2.f6343b == i3) {
                    this.f6380i = null;
                }
                Integer num = this.f6381j;
                if (num != null && num.intValue() == i3) {
                    this.f6381j = null;
                }
                eVar.V(i3, d.f6291D);
                g(i3, 65536);
                return true;
            case 256:
                return f(gVar, i3, bundle, true);
            case 512:
                return f(gVar, i3, bundle, false);
            case 4096:
                d dVar3 = d.f6302r;
                if (g.a(gVar, dVar3)) {
                    eVar.V(i3, dVar3);
                } else {
                    d dVar4 = d.f6300p;
                    if (g.a(gVar, dVar4)) {
                        eVar.V(i3, dVar4);
                    } else if (!g.a(gVar, dVar)) {
                        return false;
                    } else {
                        gVar.f6359r = gVar.f6361t;
                        gVar.f6360s = gVar.f6362u;
                        g(i3, 4);
                        eVar.V(i3, dVar);
                    }
                }
                return true;
            case 8192:
                d dVar5 = d.f6303s;
                if (g.a(gVar, dVar5)) {
                    eVar.V(i3, dVar5);
                } else {
                    d dVar6 = d.f6301q;
                    if (g.a(gVar, dVar6)) {
                        eVar.V(i3, dVar6);
                    } else if (!g.a(gVar, dVar2)) {
                        return false;
                    } else {
                        gVar.f6359r = gVar.f6363v;
                        gVar.f6360s = gVar.f6364w;
                        g(i3, 4);
                        eVar.V(i3, dVar2);
                    }
                }
                return true;
            case 16384:
                eVar.V(i3, d.f6309z);
                return true;
            case 32768:
                eVar.V(i3, d.f6289B);
                return true;
            case 65536:
                eVar.V(i3, d.f6288A);
                return true;
            case 131072:
                HashMap hashMap3 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap3.put("base", Integer.valueOf(gVar.f6349h));
                    hashMap3.put("extent", Integer.valueOf(gVar.f6349h));
                }
                eVar.W(i3, d.f6308y, hashMap3);
                g gVar3 = (g) hashMap.get(Integer.valueOf(i3));
                gVar3.f6348g = ((Integer) hashMap3.get("base")).intValue();
                gVar3.f6349h = ((Integer) hashMap3.get("extent")).intValue();
                return true;
            case 1048576:
                eVar.V(i3, d.f6293F);
                return true;
            case 2097152:
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) {
                    str = bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                } else {
                    str = "";
                }
                eVar.W(i3, d.f6296I, str);
                gVar.f6359r = str;
                gVar.f6360s = null;
                return true;
            case 16908342:
                eVar.V(i3, d.f6306v);
                return true;
            default:
                e eVar2 = (e) this.f6379h.get(Integer.valueOf(i4 - 267386881));
                if (eVar2 == null) {
                    return false;
                }
                eVar.W(i3, d.f6292E, Integer.valueOf(eVar2.f6312b));
                return true;
        }
    }
}
