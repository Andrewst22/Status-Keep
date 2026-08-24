package R0;

import C.W;
import U.A;
import U.r;
import U.s;
import U.t;
import U.y;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Window;
import androidx.core.graphics.drawable.IconCompat;
import c1.C0230D;
import c1.C0231E;
import c1.C0232F;
import c1.InterfaceC0227A;
import c1.InterfaceC0233G;
import com.example.flutter_application_1.R;
import io.flutter.plugin.platform.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k0.C0558m;
import p.AbstractC0725g;
import s.AbstractC0771C;
import s.AbstractC0772D;
import s.AbstractC0773E;
import s.AbstractC0774F;
import s.AbstractC0775G;
import s.AbstractC0776H;
import s.C0785i;
import s.C0791o;
import s.C0795t;
import s.I;
import s.J;
import s.K;
import s.T;
import s.U;
import s.Y;
import w0.q;
/* loaded from: classes.dex */
public final class j implements InterfaceC0227A {

    /* renamed from: m  reason: collision with root package name */
    public int f2058m;

    /* renamed from: n  reason: collision with root package name */
    public final Object f2059n;

    /* renamed from: o  reason: collision with root package name */
    public final Object f2060o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f2061p;

    /* renamed from: q  reason: collision with root package name */
    public Object f2062q;

    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.Collection, p.f, java.lang.Object] */
    public j(C0791o c0791o) {
        String str;
        Notification notification;
        ArrayList arrayList;
        CharSequence charSequence;
        Bundle bundle;
        Bundle[] bundleArr;
        Notification notification2;
        ArrayList arrayList2;
        String str2;
        ArrayList arrayList3;
        CharSequence charSequence2;
        C0785i h3;
        C0785i h4;
        int i3;
        j jVar = this;
        new ArrayList();
        jVar.f2062q = new Bundle();
        jVar.f2061p = c0791o;
        Context context = c0791o.f9113a;
        jVar.f2059n = context;
        int i4 = Build.VERSION.SDK_INT;
        String str3 = c0791o.f9105A;
        if (i4 >= 26) {
            jVar.f2060o = AbstractC0776H.a(context, str3);
        } else {
            jVar.f2060o = new Notification.Builder(c0791o.f9113a);
        }
        Notification notification3 = c0791o.f9110F;
        ((Notification.Builder) jVar.f2060o).setWhen(notification3.when).setSmallIcon(notification3.icon, notification3.iconLevel).setContent(notification3.contentView).setTicker(notification3.tickerText, null).setVibrate(notification3.vibrate).setLights(notification3.ledARGB, notification3.ledOnMS, notification3.ledOffMS).setOngoing((notification3.flags & 2) != 0).setOnlyAlertOnce((notification3.flags & 8) != 0).setAutoCancel((notification3.flags & 16) != 0).setDefaults(notification3.defaults).setContentTitle(c0791o.f9117e).setContentText(c0791o.f9118f).setContentInfo(null).setContentIntent(c0791o.f9119g).setDeleteIntent(notification3.deleteIntent).setFullScreenIntent(c0791o.f9120h, (notification3.flags & 128) != 0).setNumber(c0791o.f9122j).setProgress(c0791o.f9128p, c0791o.f9129q, c0791o.f9130r);
        if (i4 < 23) {
            Notification.Builder builder = (Notification.Builder) jVar.f2060o;
            IconCompat iconCompat = c0791o.f9121i;
            builder.setLargeIcon(iconCompat == null ? null : iconCompat.f());
        } else {
            Notification.Builder builder2 = (Notification.Builder) jVar.f2060o;
            IconCompat iconCompat2 = c0791o.f9121i;
            AbstractC0774F.b(builder2, iconCompat2 == null ? null : iconCompat2.k(context));
        }
        ((Notification.Builder) jVar.f2060o).setSubText(c0791o.f9127o).setUsesChronometer(c0791o.f9125m).setPriority(c0791o.f9123k);
        AbstractC0771C abstractC0771C = c0791o.f9126n;
        if (abstractC0771C instanceof C0795t) {
            C0795t c0795t = (C0795t) abstractC0771C;
            PendingIntent pendingIntent = c0795t.f9141h;
            if (pendingIntent == null) {
                h3 = c0795t.h(R.drawable.ic_call_decline, R.string.call_notification_hang_up_action, c0795t.f9145l, R.color.call_notification_decline_color, c0795t.f9142i);
            } else {
                h3 = c0795t.h(R.drawable.ic_call_decline, R.string.call_notification_decline_action, c0795t.f9145l, R.color.call_notification_decline_color, pendingIntent);
            }
            PendingIntent pendingIntent2 = c0795t.f9140g;
            if (pendingIntent2 == null) {
                h4 = null;
            } else {
                boolean z3 = c0795t.f9143j;
                h4 = c0795t.h(z3 ? R.drawable.ic_call_answer_video : R.drawable.ic_call_answer, z3 ? R.string.call_notification_answer_video_action : R.string.call_notification_answer_action, c0795t.f9144k, R.color.call_notification_answer_color, pendingIntent2);
            }
            ArrayList arrayList4 = new ArrayList(3);
            arrayList4.add(h3);
            ArrayList arrayList5 = c0795t.f9045a.f9114b;
            if (arrayList5 != null) {
                Iterator it = arrayList5.iterator();
                i3 = 2;
                while (it.hasNext()) {
                    C0785i c0785i = (C0785i) it.next();
                    if (c0785i.f9095f) {
                        arrayList4.add(c0785i);
                    } else if (!c0785i.f9090a.getBoolean("key_action_priority") && i3 > 1) {
                        arrayList4.add(c0785i);
                        i3--;
                    }
                    if (h4 != null && i3 == 1) {
                        arrayList4.add(h4);
                        i3--;
                    }
                }
            } else {
                i3 = 2;
            }
            if (h4 != null && i3 >= 1) {
                arrayList4.add(h4);
            }
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                jVar.a((C0785i) it2.next());
            }
        } else {
            Iterator it3 = c0791o.f9114b.iterator();
            while (it3.hasNext()) {
                jVar.a((C0785i) it3.next());
            }
        }
        Bundle bundle2 = c0791o.x;
        if (bundle2 != null) {
            ((Bundle) jVar.f2062q).putAll(bundle2);
        }
        int i5 = Build.VERSION.SDK_INT;
        ((Notification.Builder) jVar.f2060o).setShowWhen(c0791o.f9124l);
        AbstractC0772D.i((Notification.Builder) jVar.f2060o, false);
        AbstractC0772D.g((Notification.Builder) jVar.f2060o, c0791o.f9131s);
        AbstractC0772D.j((Notification.Builder) jVar.f2060o, null);
        AbstractC0772D.h((Notification.Builder) jVar.f2060o, c0791o.f9132t);
        jVar.f2058m = c0791o.f9108D;
        AbstractC0773E.b((Notification.Builder) jVar.f2060o, c0791o.f9135w);
        AbstractC0773E.c((Notification.Builder) jVar.f2060o, c0791o.f9136y);
        AbstractC0773E.f((Notification.Builder) jVar.f2060o, c0791o.f9137z);
        AbstractC0773E.d((Notification.Builder) jVar.f2060o, null);
        AbstractC0773E.e((Notification.Builder) jVar.f2060o, notification3.sound, notification3.audioAttributes);
        ArrayList<String> arrayList6 = c0791o.f9112H;
        ArrayList arrayList7 = c0791o.f9115c;
        if (i5 < 28) {
            if (arrayList7 == null) {
                arrayList3 = null;
            } else {
                arrayList3 = new ArrayList(arrayList7.size());
                Iterator it4 = arrayList7.iterator();
                while (it4.hasNext()) {
                    U u3 = (U) it4.next();
                    String str4 = u3.f9073c;
                    if (str4 == null) {
                        str4 = u3.f9071a != null ? "name:" + ((Object) charSequence2) : "";
                    }
                    arrayList3.add(str4);
                }
            }
            if (arrayList3 != null) {
                if (arrayList6 == null) {
                    arrayList6 = arrayList3;
                } else {
                    int size = arrayList6.size() + arrayList3.size();
                    ?? obj = new Object();
                    if (size == 0) {
                        obj.f8734m = AbstractC0725g.f8737a;
                        obj.f8735n = AbstractC0725g.f8738b;
                    } else {
                        obj.a(size);
                    }
                    obj.f8736o = 0;
                    obj.addAll(arrayList3);
                    obj.addAll(arrayList6);
                    arrayList6 = new ArrayList((Collection) obj);
                }
            }
        }
        if (arrayList6 != null && !arrayList6.isEmpty()) {
            for (String str5 : arrayList6) {
                AbstractC0773E.a((Notification.Builder) jVar.f2060o, str5);
            }
        }
        ArrayList arrayList8 = c0791o.f9116d;
        if (arrayList8.size() > 0) {
            if (c0791o.x == null) {
                c0791o.x = new Bundle();
            }
            Bundle bundle3 = c0791o.x.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i6 = 0;
            while (i6 < arrayList8.size()) {
                String num = Integer.toString(i6);
                C0785i c0785i2 = (C0785i) arrayList8.get(i6);
                Bundle bundle6 = new Bundle();
                IconCompat a3 = c0785i2.a();
                bundle6.putInt("icon", a3 != null ? a3.g() : 0);
                bundle6.putCharSequence("title", c0785i2.f9097h);
                bundle6.putParcelable("actionIntent", c0785i2.f9098i);
                Bundle bundle7 = c0785i2.f9090a;
                if (bundle7 != null) {
                    bundle = new Bundle(bundle7);
                } else {
                    bundle = new Bundle();
                }
                ArrayList arrayList9 = arrayList8;
                bundle.putBoolean("android.support.allowGeneratedReplies", c0785i2.f9093d);
                bundle6.putBundle("extras", bundle);
                Y[] yArr = c0785i2.f9092c;
                if (yArr == null) {
                    str2 = str3;
                    notification2 = notification3;
                    arrayList2 = arrayList7;
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[yArr.length];
                    notification2 = notification3;
                    arrayList2 = arrayList7;
                    int i7 = 0;
                    while (i7 < yArr.length) {
                        Y y3 = yArr[i7];
                        Y[] yArr2 = yArr;
                        Bundle bundle8 = new Bundle();
                        y3.getClass();
                        String str6 = str3;
                        bundle8.putString("resultKey", "FlutterLocalNotificationsPluginInputResult");
                        bundle8.putCharSequence("label", y3.f9077a);
                        bundle8.putCharSequenceArray("choices", y3.f9078b);
                        bundle8.putBoolean("allowFreeFormInput", y3.f9079c);
                        bundle8.putBundle("extras", y3.f9080d);
                        HashSet hashSet = y3.f9081e;
                        if (!hashSet.isEmpty()) {
                            ArrayList<String> arrayList10 = new ArrayList<>(hashSet.size());
                            Iterator it5 = hashSet.iterator();
                            while (it5.hasNext()) {
                                arrayList10.add((String) it5.next());
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList10);
                        }
                        bundleArr[i7] = bundle8;
                        i7++;
                        yArr = yArr2;
                        str3 = str6;
                    }
                    str2 = str3;
                }
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", c0785i2.f9094e);
                bundle6.putInt("semanticAction", 0);
                bundle5.putBundle(num, bundle6);
                i6++;
                arrayList8 = arrayList9;
                notification3 = notification2;
                arrayList7 = arrayList2;
                str3 = str2;
            }
            str = str3;
            notification = notification3;
            arrayList = arrayList7;
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (c0791o.x == null) {
                c0791o.x = new Bundle();
            }
            c0791o.x.putBundle("android.car.EXTENSIONS", bundle3);
            jVar = this;
            ((Bundle) jVar.f2062q).putBundle("android.car.EXTENSIONS", bundle4);
        } else {
            str = str3;
            notification = notification3;
            arrayList = arrayList7;
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 24) {
            ((Notification.Builder) jVar.f2060o).setExtras(c0791o.x);
            charSequence = null;
            AbstractC0775G.e((Notification.Builder) jVar.f2060o, null);
        } else {
            charSequence = null;
        }
        if (i8 >= 26) {
            AbstractC0776H.b((Notification.Builder) jVar.f2060o, 0);
            AbstractC0776H.e((Notification.Builder) jVar.f2060o, charSequence);
            AbstractC0776H.f((Notification.Builder) jVar.f2060o, c0791o.f9106B);
            AbstractC0776H.g((Notification.Builder) jVar.f2060o, c0791o.f9107C);
            AbstractC0776H.d((Notification.Builder) jVar.f2060o, c0791o.f9108D);
            if (c0791o.f9134v) {
                AbstractC0776H.c((Notification.Builder) jVar.f2060o, c0791o.f9133u);
            }
            if (!TextUtils.isEmpty(str)) {
                ((Notification.Builder) jVar.f2060o).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i8 >= 28) {
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                U u4 = (U) it6.next();
                u4.getClass();
                I.a((Notification.Builder) jVar.f2060o, T.b(u4));
            }
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29) {
            J.a((Notification.Builder) jVar.f2060o, c0791o.f9109E);
            J.b((Notification.Builder) jVar.f2060o, null);
        }
        if (c0791o.f9111G) {
            if (((C0791o) jVar.f2061p).f9132t) {
                jVar.f2058m = 2;
            } else {
                jVar.f2058m = 1;
            }
            ((Notification.Builder) jVar.f2060o).setVibrate(null);
            ((Notification.Builder) jVar.f2060o).setSound(null);
            Notification notification4 = notification;
            int i10 = notification4.defaults & (-4);
            notification4.defaults = i10;
            ((Notification.Builder) jVar.f2060o).setDefaults(i10);
            if (i9 >= 26) {
                if (TextUtils.isEmpty(((C0791o) jVar.f2061p).f9131s)) {
                    AbstractC0772D.g((Notification.Builder) jVar.f2060o, "silent");
                }
                AbstractC0776H.d((Notification.Builder) jVar.f2060o, jVar.f2058m);
            }
        }
    }

    public static void b(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    public void a(C0785i c0785i) {
        int i3;
        Notification.Action.Builder e2;
        Bundle bundle;
        int i4 = Build.VERSION.SDK_INT;
        IconCompat a3 = c0785i.a();
        PendingIntent pendingIntent = c0785i.f9098i;
        CharSequence charSequence = c0785i.f9097h;
        if (i4 >= 23) {
            Icon icon = null;
            if (a3 != null) {
                icon = a3.k(null);
            }
            e2 = AbstractC0774F.a(icon, charSequence, pendingIntent);
        } else {
            if (a3 != null) {
                i3 = a3.g();
            } else {
                i3 = 0;
            }
            e2 = AbstractC0772D.e(i3, charSequence, pendingIntent);
        }
        Y[] yArr = c0785i.f9092c;
        if (yArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[yArr.length];
            for (int i5 = 0; i5 < yArr.length; i5++) {
                remoteInputArr[i5] = Y.a(yArr[i5]);
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                AbstractC0772D.c(e2, remoteInput);
            }
        }
        Bundle bundle2 = c0785i.f9090a;
        if (bundle2 != null) {
            bundle = new Bundle(bundle2);
        } else {
            bundle = new Bundle();
        }
        boolean z3 = c0785i.f9093d;
        bundle.putBoolean("android.support.allowGeneratedReplies", z3);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 24) {
            AbstractC0775G.a(e2, z3);
        }
        bundle.putInt("android.support.action.semanticAction", 0);
        if (i6 >= 28) {
            I.b(e2, 0);
        }
        if (i6 >= 29) {
            J.c(e2, c0785i.f9095f);
        }
        if (i6 >= 31) {
            K.a(e2, false);
        }
        bundle.putBoolean("android.support.action.showsUserInterface", c0785i.f9094e);
        AbstractC0772D.b(e2, bundle);
        AbstractC0772D.a((Notification.Builder) this.f2060o, AbstractC0772D.d(e2));
    }

    @Override // c1.InterfaceC0227A
    public void d(t tVar) {
        y yVar;
        SparseBooleanArray sparseBooleanArray;
        SparseArray sparseArray;
        int i3;
        y yVar2;
        int i4;
        int i5;
        InterfaceC0233G e2;
        int i6;
        SparseArray sparseArray2;
        int i7;
        int i8;
        if (tVar.u() != 2) {
            return;
        }
        C0230D c0230d = (C0230D) this.f2062q;
        int i9 = c0230d.f4795a;
        int i10 = 0;
        List list = c0230d.f4797c;
        if (i9 != 1 && i9 != 2 && c0230d.f4808n != 1) {
            yVar = new y(((y) list.get(0)).d());
            list.add(yVar);
        } else {
            yVar = (y) list.get(0);
        }
        if ((tVar.u() & 128) == 0) {
            return;
        }
        tVar.H(1);
        int A3 = tVar.A();
        int i11 = 3;
        tVar.H(3);
        s sVar = (s) this.f2059n;
        tVar.f(sVar.f2472d, 0, 2);
        sVar.q(0);
        sVar.t(3);
        c0230d.f4814t = sVar.i(13);
        tVar.f(sVar.f2472d, 0, 2);
        sVar.q(0);
        sVar.t(4);
        tVar.H(sVar.i(12));
        B.b bVar = c0230d.f4800f;
        int i12 = c0230d.f4795a;
        if (i12 == 2 && c0230d.f4812r == null) {
            InterfaceC0233G e3 = bVar.e(21, new r(21, null, 0, null, A.f2410f));
            c0230d.f4812r = e3;
            if (e3 != null) {
                e3.c(yVar, c0230d.f4807m, new C0232F(A3, 21, 8192));
            }
        }
        SparseArray sparseArray3 = (SparseArray) this.f2060o;
        sparseArray3.clear();
        SparseIntArray sparseIntArray = (SparseIntArray) this.f2061p;
        sparseIntArray.clear();
        int a3 = tVar.a();
        while (true) {
            sparseBooleanArray = c0230d.f4803i;
            if (a3 <= 0) {
                break;
            }
            tVar.f(sVar.f2472d, i10, 5);
            sVar.q(i10);
            int i13 = sVar.i(8);
            sVar.t(i11);
            int i14 = sVar.i(13);
            sVar.t(4);
            int i15 = sVar.i(12);
            int i16 = tVar.f2478b;
            int i17 = i16 + i15;
            int i18 = -1;
            String str = null;
            ArrayList arrayList = null;
            int i19 = 0;
            s sVar2 = sVar;
            while (tVar.f2478b < i17) {
                int u3 = tVar.u();
                int u4 = tVar.f2478b + tVar.u();
                if (u4 > i17) {
                    break;
                }
                y yVar3 = yVar;
                if (u3 == 5) {
                    long w3 = tVar.w();
                    if (w3 == 1094921523) {
                        i18 = 129;
                    } else if (w3 == 1161904947) {
                        i18 = 135;
                    } else {
                        if (w3 != 1094921524) {
                            if (w3 == 1212503619) {
                                i18 = 36;
                            }
                        }
                        i18 = 172;
                    }
                    sparseArray2 = sparseArray3;
                    i7 = A3;
                    i8 = i14;
                } else if (u3 == 106) {
                    sparseArray2 = sparseArray3;
                    i7 = A3;
                    i8 = i14;
                    i18 = 129;
                } else if (u3 == 122) {
                    sparseArray2 = sparseArray3;
                    i7 = A3;
                    i8 = i14;
                    i18 = 135;
                } else if (u3 == 127) {
                    int u5 = tVar.u();
                    if (u5 != 21) {
                        if (u5 == 14) {
                            i18 = 136;
                        } else if (u5 == 33) {
                            i18 = 139;
                        }
                        sparseArray2 = sparseArray3;
                        i7 = A3;
                        i8 = i14;
                    }
                    i18 = 172;
                    sparseArray2 = sparseArray3;
                    i7 = A3;
                    i8 = i14;
                } else if (u3 == 123) {
                    sparseArray2 = sparseArray3;
                    i7 = A3;
                    i8 = i14;
                    i18 = 138;
                } else if (u3 == 10) {
                    String trim = tVar.s(3, C1.d.f153c).trim();
                    i19 = tVar.u();
                    sparseArray2 = sparseArray3;
                    str = trim;
                    i7 = A3;
                    i8 = i14;
                } else if (u3 == 89) {
                    ArrayList arrayList2 = new ArrayList();
                    while (tVar.f2478b < u4) {
                        String trim2 = tVar.s(3, C1.d.f153c).trim();
                        tVar.u();
                        SparseArray sparseArray4 = sparseArray3;
                        byte[] bArr = new byte[4];
                        tVar.f(bArr, 0, 4);
                        arrayList2.add(new C0231E(trim2, bArr));
                        sparseArray3 = sparseArray4;
                        A3 = A3;
                        i14 = i14;
                    }
                    sparseArray2 = sparseArray3;
                    i7 = A3;
                    i8 = i14;
                    arrayList = arrayList2;
                    i18 = 89;
                } else {
                    sparseArray2 = sparseArray3;
                    i7 = A3;
                    i8 = i14;
                    if (u3 == 111) {
                        i18 = 257;
                    }
                }
                tVar.H(u4 - tVar.f2478b);
                sparseArray3 = sparseArray2;
                yVar = yVar3;
                A3 = i7;
                i14 = i8;
            }
            SparseArray sparseArray5 = sparseArray3;
            y yVar4 = yVar;
            int i20 = A3;
            int i21 = i14;
            tVar.G(i17);
            r rVar = new r(i18, str, i19, arrayList, Arrays.copyOfRange(tVar.f2477a, i16, i17));
            if (i13 == 6 || i13 == 5) {
                i13 = i18;
            }
            a3 -= i15 + 5;
            if (i12 == 2) {
                i5 = i13;
            } else {
                i5 = i21;
            }
            if (sparseBooleanArray.get(i5)) {
                sparseArray3 = sparseArray5;
            } else {
                if (i12 == 2 && i13 == 21) {
                    e2 = c0230d.f4812r;
                } else {
                    e2 = bVar.e(i13, rVar);
                }
                if (i12 == 2) {
                    i6 = i21;
                    if (i6 >= sparseIntArray.get(i5, 8192)) {
                        sparseArray3 = sparseArray5;
                    }
                } else {
                    i6 = i21;
                }
                sparseIntArray.put(i5, i6);
                sparseArray3 = sparseArray5;
                sparseArray3.put(i5, e2);
            }
            sVar = sVar2;
            yVar = yVar4;
            A3 = i20;
            i10 = 0;
            i11 = 3;
        }
        y yVar5 = yVar;
        int i22 = A3;
        int size = sparseIntArray.size();
        int i23 = 0;
        while (true) {
            sparseArray = c0230d.f4802h;
            if (i23 >= size) {
                break;
            }
            int keyAt = sparseIntArray.keyAt(i23);
            int valueAt = sparseIntArray.valueAt(i23);
            sparseBooleanArray.put(keyAt, true);
            c0230d.f4804j.put(valueAt, true);
            InterfaceC0233G interfaceC0233G = (InterfaceC0233G) sparseArray3.valueAt(i23);
            if (interfaceC0233G != null) {
                if (interfaceC0233G != c0230d.f4812r) {
                    q qVar = c0230d.f4807m;
                    i4 = i22;
                    C0232F c0232f = new C0232F(i4, keyAt, 8192);
                    yVar2 = yVar5;
                    interfaceC0233G.c(yVar2, qVar, c0232f);
                } else {
                    yVar2 = yVar5;
                    i4 = i22;
                }
                sparseArray.put(valueAt, interfaceC0233G);
            } else {
                yVar2 = yVar5;
                i4 = i22;
            }
            i23++;
            yVar5 = yVar2;
            i22 = i4;
        }
        if (i12 == 2) {
            if (!c0230d.f4809o) {
                c0230d.f4807m.s();
                c0230d.f4808n = 0;
                c0230d.f4809o = true;
            }
            return;
        }
        sparseArray.remove(this.f2058m);
        if (i12 == 1) {
            i3 = 0;
        } else {
            i3 = c0230d.f4808n - 1;
        }
        c0230d.f4808n = i3;
        if (i3 == 0) {
            c0230d.f4807m.s();
            c0230d.f4809o = true;
        }
    }

    public void e(f2.e eVar) {
        android.support.v4.media.session.a t3;
        Window window = ((W1.d) this.f2059n).getWindow();
        window.getDecorView();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            t3 = new W(window);
        } else if (i3 >= 26) {
            t3 = new C.T(window);
        } else if (i3 >= 23) {
            t3 = new C.T(window);
        } else {
            t3 = new C.T(window);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        if (i4 >= 23) {
            int i5 = eVar.f5566b;
            if (i5 != 0) {
                int b3 = N.j.b(i5);
                if (b3 != 0) {
                    if (b3 == 1) {
                        t3.P(true);
                    }
                } else {
                    t3.P(false);
                }
            }
            Integer num = eVar.f5565a;
            if (num != null) {
                window.setStatusBarColor(num.intValue());
            }
        }
        Boolean bool = eVar.f5567c;
        if (bool != null && i4 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i4 >= 26) {
            int i6 = eVar.f5569e;
            if (i6 != 0) {
                int b4 = N.j.b(i6);
                if (b4 != 0) {
                    if (b4 == 1) {
                        t3.O(true);
                    }
                } else {
                    t3.O(false);
                }
            }
            Integer num2 = eVar.f5568d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = eVar.f5570f;
        if (num3 != null && i4 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = eVar.f5571g;
        if (bool2 != null && i4 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f2062q = eVar;
    }

    public void f() {
        ((W1.d) this.f2059n).getWindow().getDecorView().setSystemUiVisibility(this.f2058m);
        f2.e eVar = (f2.e) this.f2062q;
        if (eVar != null) {
            e(eVar);
        }
    }

    public j(W1.d dVar, B1.a aVar, W1.d dVar2) {
        l lVar = new l(this, 1);
        this.f2059n = dVar;
        this.f2060o = aVar;
        aVar.f51o = lVar;
        this.f2061p = dVar2;
        this.f2058m = 1280;
    }

    public j(w0.y yVar, C0558m c0558m, byte[] bArr, U.c[] cVarArr, int i3) {
        this.f2059n = yVar;
        this.f2060o = c0558m;
        this.f2061p = bArr;
        this.f2062q = cVarArr;
        this.f2058m = i3;
    }

    public j(C0230D c0230d, int i3) {
        this.f2062q = c0230d;
        this.f2059n = new s(new byte[5], 5);
        this.f2060o = new SparseArray();
        this.f2061p = new SparseIntArray();
        this.f2058m = i3;
    }

    @Override // c1.InterfaceC0227A
    public void c(y yVar, q qVar, C0232F c0232f) {
    }
}
