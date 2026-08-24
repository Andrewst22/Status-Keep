package x1;

import N.k;
import W1.d;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import f2.g;
import g2.t;
import g2.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m2.AbstractC0635d;
import n2.AbstractC0664g;
import s.S;
/* renamed from: x1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0901b implements t, u {

    /* renamed from: m  reason: collision with root package name */
    public final Context f9693m;

    /* renamed from: n  reason: collision with root package name */
    public g f9694n;

    /* renamed from: o  reason: collision with root package name */
    public d f9695o;

    /* renamed from: p  reason: collision with root package name */
    public int f9696p;

    /* renamed from: q  reason: collision with root package name */
    public HashMap f9697q;

    public C0901b(Context context) {
        this.f9693m = context;
    }

    public final int a(int i3) {
        int i4;
        boolean canScheduleExactAlarms;
        boolean isNotificationPolicyAccessGranted;
        boolean canRequestPackageInstalls;
        boolean canDrawOverlays;
        boolean isExternalStorageManager;
        boolean isIgnoringBatteryOptimizations;
        int checkSelfPermission;
        int i5 = 0;
        Context context = this.f9693m;
        if (i3 == 17) {
            if (Build.VERSION.SDK_INT >= 33) {
                checkSelfPermission = context.checkSelfPermission("android.permission.POST_NOTIFICATIONS");
                if (checkSelfPermission == 0) {
                    return 1;
                }
                return AbstractC0635d.m(this.f9695o, "android.permission.POST_NOTIFICATIONS");
            } else if (new S(context).a()) {
                return 1;
            } else {
                return 0;
            }
        } else if (i3 == 21) {
            ArrayList p3 = AbstractC0635d.p(context, 21);
            if (p3 != null && !p3.isEmpty()) {
                return 1;
            }
            Log.d("permissions_handler", "Bluetooth permission missing in manifest");
            return 0;
        } else {
            int i6 = 31;
            if ((i3 == 30 || i3 == 28 || i3 == 29) && Build.VERSION.SDK_INT < 31) {
                ArrayList p4 = AbstractC0635d.p(context, 21);
                if (p4 != null && !p4.isEmpty()) {
                    return 1;
                }
                Log.d("permissions_handler", "Bluetooth permission missing in manifest");
                return 0;
            } else if ((i3 == 37 || i3 == 0) && !b()) {
                return 0;
            } else {
                ArrayList p5 = AbstractC0635d.p(context, i3);
                if (p5 == null) {
                    Log.d("permissions_handler", "No android specific permissions needed for: " + i3);
                    return 1;
                } else if (p5.size() == 0) {
                    Log.d("permissions_handler", "No permissions found in manifest for: " + p5 + i3);
                    if (i3 == 16 && Build.VERSION.SDK_INT < 23) {
                        return 2;
                    }
                    if (i3 == 22 && Build.VERSION.SDK_INT < 30) {
                        return 2;
                    }
                    if (Build.VERSION.SDK_INT < 23) {
                        return 1;
                    }
                    return 0;
                } else {
                    if (context.getApplicationInfo().targetSdkVersion >= 23) {
                        HashSet hashSet = new HashSet();
                        Iterator it = p5.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (i3 == 16) {
                                String packageName = context.getPackageName();
                                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                                if (powerManager != null) {
                                    isIgnoringBatteryOptimizations = powerManager.isIgnoringBatteryOptimizations(packageName);
                                    if (isIgnoringBatteryOptimizations) {
                                        hashSet.add(1);
                                    }
                                }
                                hashSet.add(Integer.valueOf(i5));
                            } else if (i3 == 22) {
                                if (Build.VERSION.SDK_INT < 30) {
                                    hashSet.add(2);
                                }
                                isExternalStorageManager = Environment.isExternalStorageManager();
                                hashSet.add(Integer.valueOf(isExternalStorageManager ? 1 : 0));
                            } else if (i3 == 23) {
                                canDrawOverlays = Settings.canDrawOverlays(context);
                                hashSet.add(Integer.valueOf(canDrawOverlays ? 1 : 0));
                            } else if (i3 == 24) {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    canRequestPackageInstalls = context.getPackageManager().canRequestPackageInstalls();
                                    hashSet.add(Integer.valueOf(canRequestPackageInstalls ? 1 : 0));
                                }
                            } else if (i3 == 27) {
                                isNotificationPolicyAccessGranted = ((NotificationManager) context.getSystemService("notification")).isNotificationPolicyAccessGranted();
                                hashSet.add(Integer.valueOf(isNotificationPolicyAccessGranted ? 1 : 0));
                            } else if (i3 == 34) {
                                if (Build.VERSION.SDK_INT >= i6) {
                                    canScheduleExactAlarms = ((AlarmManager) context.getSystemService("alarm")).canScheduleExactAlarms();
                                    hashSet.add(Integer.valueOf(canScheduleExactAlarms ? 1 : 0));
                                } else {
                                    hashSet.add(1);
                                }
                            } else if (i3 != 9 && i3 != 32) {
                                if (AbstractC0664g.d(context, str) != 0) {
                                    hashSet.add(Integer.valueOf(AbstractC0635d.m(this.f9695o, str)));
                                }
                            } else {
                                int d3 = AbstractC0664g.d(context, str);
                                if (Build.VERSION.SDK_INT >= 34) {
                                    i4 = AbstractC0664g.d(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
                                } else {
                                    i4 = d3;
                                }
                                if (i4 == 0 && d3 == -1) {
                                    hashSet.add(3);
                                } else if (d3 == 0) {
                                    hashSet.add(1);
                                } else {
                                    hashSet.add(Integer.valueOf(AbstractC0635d.m(this.f9695o, str)));
                                }
                            }
                            i5 = 0;
                            i6 = 31;
                        }
                        if (!hashSet.isEmpty()) {
                            return AbstractC0635d.w(hashSet).intValue();
                        }
                    }
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        boolean z3;
        boolean z4;
        ArrayList p3 = AbstractC0635d.p(this.f9693m, 37);
        if (p3 != null && p3.contains("android.permission.WRITE_CALENDAR")) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (p3 != null && p3.contains("android.permission.READ_CALENDAR")) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 && z4) {
            return true;
        }
        if (!z3) {
            Log.d("permissions_handler", "android.permission.WRITE_CALENDAR missing in manifest");
        }
        if (!z4) {
            Log.d("permissions_handler", "android.permission.READ_CALENDAR missing in manifest");
        }
        return false;
    }

    public final void c(String str, int i3) {
        if (this.f9695o == null) {
            return;
        }
        Intent intent = new Intent(str);
        if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            intent.setData(Uri.parse("package:" + this.f9695o.getPackageName()));
        }
        this.f9695o.startActivityForResult(intent, i3);
        this.f9696p++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g2.t
    public final boolean onActivityResult(int i3, int i4, Intent intent) {
        char c3;
        boolean canScheduleExactAlarms;
        boolean isNotificationPolicyAccessGranted;
        boolean canRequestPackageInstalls;
        boolean canDrawOverlays;
        boolean isExternalStorageManager;
        int i5;
        boolean isIgnoringBatteryOptimizations;
        d dVar = this.f9695o;
        char c4 = 0;
        c4 = 0;
        if (dVar == null) {
            return false;
        }
        if (this.f9697q == null) {
            this.f9696p = 0;
            return false;
        }
        int i6 = 23;
        if (i3 == 209) {
            if (Build.VERSION.SDK_INT >= 23) {
                Context context = this.f9693m;
                String packageName = context.getPackageName();
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager != null) {
                    isIgnoringBatteryOptimizations = powerManager.isIgnoringBatteryOptimizations(packageName);
                    if (isIgnoringBatteryOptimizations) {
                        c4 = 1;
                    }
                }
            } else {
                c4 = 2;
            }
            i6 = 16;
            i5 = c4;
        } else if (i3 == 210) {
            if (Build.VERSION.SDK_INT >= 30) {
                isExternalStorageManager = Environment.isExternalStorageManager();
                i6 = 22;
                i5 = isExternalStorageManager;
            } else {
                return false;
            }
        } else if (i3 == 211) {
            if (Build.VERSION.SDK_INT >= 23) {
                canDrawOverlays = Settings.canDrawOverlays(dVar);
                i5 = canDrawOverlays;
            } else {
                return false;
            }
        } else if (i3 == 212) {
            if (Build.VERSION.SDK_INT >= 26) {
                canRequestPackageInstalls = dVar.getPackageManager().canRequestPackageInstalls();
                i6 = 24;
                i5 = canRequestPackageInstalls;
            } else {
                return false;
            }
        } else if (i3 == 213) {
            if (Build.VERSION.SDK_INT >= 23) {
                isNotificationPolicyAccessGranted = ((NotificationManager) dVar.getSystemService("notification")).isNotificationPolicyAccessGranted();
                i6 = 27;
                i5 = isNotificationPolicyAccessGranted;
            } else {
                return false;
            }
        } else if (i3 != 214) {
            return false;
        } else {
            AlarmManager alarmManager = (AlarmManager) dVar.getSystemService("alarm");
            if (Build.VERSION.SDK_INT >= 31) {
                canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
                c3 = canScheduleExactAlarms;
            } else {
                c3 = 1;
            }
            i6 = 34;
            i5 = c3;
        }
        this.f9697q.put(Integer.valueOf(i6), Integer.valueOf(i5));
        int i7 = this.f9696p - 1;
        this.f9696p = i7;
        g gVar = this.f9694n;
        if (gVar != null && i7 == 0) {
            gVar.f5576a.b(this.f9697q);
        }
        return true;
    }

    @Override // g2.u
    public final boolean onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        int i4;
        int i5 = 14;
        if (i3 != 24) {
            this.f9696p = 0;
            return false;
        } else if (this.f9697q == null) {
            return false;
        } else {
            if (strArr.length == 0 && iArr.length == 0) {
                Log.w("permissions_handler", "onRequestPermissionsResult is called without results. This is probably caused by interfering request codes. If you see this error, please file an issue in flutter-permission-handler, including a list of plugins used by this application: https://github.com/Baseflow/flutter-permission-handler/issues");
                return false;
            }
            List asList = Arrays.asList(strArr);
            int indexOf = asList.indexOf("android.permission.WRITE_CALENDAR");
            if (indexOf >= 0) {
                int x = AbstractC0635d.x(this.f9695o, "android.permission.WRITE_CALENDAR", iArr[indexOf]);
                this.f9697q.put(36, Integer.valueOf(x));
                int indexOf2 = asList.indexOf("android.permission.READ_CALENDAR");
                if (indexOf2 >= 0) {
                    int x3 = AbstractC0635d.x(this.f9695o, "android.permission.READ_CALENDAR", iArr[indexOf2]);
                    Integer valueOf = Integer.valueOf(x);
                    Integer valueOf2 = Integer.valueOf(x3);
                    HashSet hashSet = new HashSet();
                    hashSet.add(valueOf);
                    hashSet.add(valueOf2);
                    Integer w3 = AbstractC0635d.w(hashSet);
                    this.f9697q.put(37, w3);
                    this.f9697q.put(0, w3);
                }
            }
            int i6 = 0;
            while (i6 < strArr.length) {
                String str = strArr[i6];
                if (!str.equals("android.permission.WRITE_CALENDAR") && !str.equals("android.permission.READ_CALENDAR")) {
                    char c3 = 65535;
                    switch (str.hashCode()) {
                        case -2062386608:
                            if (str.equals("android.permission.READ_SMS")) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case -1928411001:
                            if (str.equals("android.permission.READ_CALENDAR")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case -1925850455:
                            if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case -1921431796:
                            if (str.equals("android.permission.READ_CALL_LOG")) {
                                c3 = 3;
                                break;
                            }
                            break;
                        case -1888586689:
                            if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                                c3 = 4;
                                break;
                            }
                            break;
                        case -1813079487:
                            if (str.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                                c3 = 5;
                                break;
                            }
                            break;
                        case -1783097621:
                            if (str.equals("android.permission.ACCESS_NOTIFICATION_POLICY")) {
                                c3 = 6;
                                break;
                            }
                            break;
                        case -1561629405:
                            if (str.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                                c3 = 7;
                                break;
                            }
                            break;
                        case -1479758289:
                            if (str.equals("android.permission.RECEIVE_WAP_PUSH")) {
                                c3 = '\b';
                                break;
                            }
                            break;
                        case -1238066820:
                            if (str.equals("android.permission.BODY_SENSORS")) {
                                c3 = '\t';
                                break;
                            }
                            break;
                        case -1164582768:
                            if (str.equals("android.permission.READ_PHONE_NUMBERS")) {
                                c3 = '\n';
                                break;
                            }
                            break;
                        case -909527021:
                            if (str.equals("android.permission.NEARBY_WIFI_DEVICES")) {
                                c3 = 11;
                                break;
                            }
                            break;
                        case -895679497:
                            if (str.equals("android.permission.RECEIVE_MMS")) {
                                c3 = '\f';
                                break;
                            }
                            break;
                        case -895673731:
                            if (str.equals("android.permission.RECEIVE_SMS")) {
                                c3 = '\r';
                                break;
                            }
                            break;
                        case -798669607:
                            if (str.equals("android.permission.BLUETOOTH_CONNECT")) {
                                c3 = 14;
                                break;
                            }
                            break;
                        case -406040016:
                            if (str.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                                c3 = 15;
                                break;
                            }
                            break;
                        case -63024214:
                            if (str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                                c3 = 16;
                                break;
                            }
                            break;
                        case -5573545:
                            if (str.equals("android.permission.READ_PHONE_STATE")) {
                                c3 = 17;
                                break;
                            }
                            break;
                        case 52602690:
                            if (str.equals("android.permission.SEND_SMS")) {
                                c3 = 18;
                                break;
                            }
                            break;
                        case 112197485:
                            if (str.equals("android.permission.CALL_PHONE")) {
                                c3 = 19;
                                break;
                            }
                            break;
                        case 175802396:
                            if (str.equals("android.permission.READ_MEDIA_IMAGES")) {
                                c3 = 20;
                                break;
                            }
                            break;
                        case 214526995:
                            if (str.equals("android.permission.WRITE_CONTACTS")) {
                                c3 = 21;
                                break;
                            }
                            break;
                        case 361658321:
                            if (str.equals("android.permission.BODY_SENSORS_BACKGROUND")) {
                                c3 = 22;
                                break;
                            }
                            break;
                        case 463403621:
                            if (str.equals("android.permission.CAMERA")) {
                                c3 = 23;
                                break;
                            }
                            break;
                        case 603653886:
                            if (str.equals("android.permission.WRITE_CALENDAR")) {
                                c3 = 24;
                                break;
                            }
                            break;
                        case 610633091:
                            if (str.equals("android.permission.WRITE_CALL_LOG")) {
                                c3 = 25;
                                break;
                            }
                            break;
                        case 691260818:
                            if (str.equals("android.permission.READ_MEDIA_AUDIO")) {
                                c3 = 26;
                                break;
                            }
                            break;
                        case 710297143:
                            if (str.equals("android.permission.READ_MEDIA_VIDEO")) {
                                c3 = 27;
                                break;
                            }
                            break;
                        case 784519842:
                            if (str.equals("android.permission.USE_SIP")) {
                                c3 = 28;
                                break;
                            }
                            break;
                        case 970694249:
                            if (str.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                                c3 = 29;
                                break;
                            }
                            break;
                        case 1166454870:
                            if (str.equals("android.permission.BLUETOOTH_ADVERTISE")) {
                                c3 = 30;
                                break;
                            }
                            break;
                        case 1271781903:
                            if (str.equals("android.permission.GET_ACCOUNTS")) {
                                c3 = 31;
                                break;
                            }
                            break;
                        case 1365911975:
                            if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                c3 = ' ';
                                break;
                            }
                            break;
                        case 1777263169:
                            if (str.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                                c3 = '!';
                                break;
                            }
                            break;
                        case 1780337063:
                            if (str.equals("android.permission.ACTIVITY_RECOGNITION")) {
                                c3 = '\"';
                                break;
                            }
                            break;
                        case 1831139720:
                            if (str.equals("android.permission.RECORD_AUDIO")) {
                                c3 = '#';
                                break;
                            }
                            break;
                        case 1977429404:
                            if (str.equals("android.permission.READ_CONTACTS")) {
                                c3 = '$';
                                break;
                            }
                            break;
                        case 2024715147:
                            if (str.equals("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                                c3 = '%';
                                break;
                            }
                            break;
                        case 2062356686:
                            if (str.equals("android.permission.BLUETOOTH_SCAN")) {
                                c3 = '&';
                                break;
                            }
                            break;
                        case 2114579147:
                            if (str.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
                                c3 = '\'';
                                break;
                            }
                            break;
                        case 2133799037:
                            if (str.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
                                c3 = '(';
                                break;
                            }
                            break;
                    }
                    switch (c3) {
                        case 0:
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                        case '\f':
                        case '\r':
                        case 18:
                            i4 = 13;
                            break;
                        case 1:
                        case 24:
                            i4 = 0;
                            break;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            i4 = 17;
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                        case '\n':
                        case 17:
                        case 19:
                        case 25:
                        case 28:
                        case '(':
                            i4 = 8;
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                        case 16:
                            i4 = 3;
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            i4 = 22;
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            i4 = 27;
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            i4 = 23;
                            break;
                        case '\t':
                            i4 = 12;
                            break;
                        case 11:
                            i4 = 31;
                            break;
                        case 14:
                            i4 = 30;
                            break;
                        case 15:
                        case ' ':
                            i4 = 15;
                            break;
                        case 20:
                            i4 = 9;
                            break;
                        case 21:
                        case 31:
                        case '$':
                            i4 = 2;
                            break;
                        case 22:
                            i4 = 35;
                            break;
                        case 23:
                            i4 = 1;
                            break;
                        case 26:
                            i4 = 33;
                            break;
                        case 27:
                            i4 = 32;
                            break;
                        case 29:
                            i4 = 34;
                            break;
                        case 30:
                            i4 = 29;
                            break;
                        case '!':
                            i4 = 24;
                            break;
                        case '\"':
                            i4 = 19;
                            break;
                        case '#':
                            i4 = 7;
                            break;
                        case '%':
                            i4 = 4;
                            break;
                        case '&':
                            i4 = 28;
                            break;
                        case '\'':
                            i4 = 18;
                            break;
                        default:
                            i4 = 20;
                            break;
                    }
                    if (i4 != 20) {
                        int i7 = iArr[i6];
                        if (i4 == 8) {
                            Integer valueOf3 = Integer.valueOf(AbstractC0635d.x(this.f9695o, str, i7));
                            HashSet hashSet2 = new HashSet();
                            hashSet2.add((Integer) this.f9697q.get(8));
                            hashSet2.add(valueOf3);
                            this.f9697q.put(8, AbstractC0635d.w(hashSet2));
                        } else if (i4 == 7) {
                            if (!this.f9697q.containsKey(7)) {
                                this.f9697q.put(7, Integer.valueOf(AbstractC0635d.x(this.f9695o, str, i7)));
                            }
                            if (!this.f9697q.containsKey(Integer.valueOf(i5))) {
                                this.f9697q.put(Integer.valueOf(i5), Integer.valueOf(AbstractC0635d.x(this.f9695o, str, i7)));
                            }
                        } else if (i4 == 4) {
                            int x4 = AbstractC0635d.x(this.f9695o, str, i7);
                            if (!this.f9697q.containsKey(4)) {
                                this.f9697q.put(4, Integer.valueOf(x4));
                            }
                        } else {
                            if (i4 == 3) {
                                int x5 = AbstractC0635d.x(this.f9695o, str, i7);
                                if (Build.VERSION.SDK_INT < 29 && !this.f9697q.containsKey(4)) {
                                    this.f9697q.put(4, Integer.valueOf(x5));
                                }
                                if (!this.f9697q.containsKey(5)) {
                                    this.f9697q.put(5, Integer.valueOf(x5));
                                }
                                this.f9697q.put(Integer.valueOf(i4), Integer.valueOf(x5));
                            } else if (i4 != 9 && i4 != 32) {
                                if (!this.f9697q.containsKey(Integer.valueOf(i4))) {
                                    this.f9697q.put(Integer.valueOf(i4), Integer.valueOf(AbstractC0635d.x(this.f9695o, str, i7)));
                                }
                            } else {
                                this.f9697q.put(Integer.valueOf(i4), Integer.valueOf(a(i4)));
                            }
                            i6++;
                            i5 = 14;
                        }
                    }
                }
                i6++;
                i5 = 14;
            }
            int length = this.f9696p - iArr.length;
            this.f9696p = length;
            g gVar = this.f9694n;
            if (gVar != null && length == 0) {
                gVar.f5576a.b(this.f9697q);
            }
            return true;
        }
    }
}
