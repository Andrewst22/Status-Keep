package l2;

import D2.h;
import N.k;
import android.content.Context;
import android.util.Log;
import c2.C0247a;
import c2.InterfaceC0248b;
import java.io.File;
import java.util.ArrayList;
/* renamed from: l2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0611d implements InterfaceC0248b {

    /* renamed from: m  reason: collision with root package name */
    public Context f8140m;

    public final ArrayList a(EnumC0610c enumC0610c) {
        String str;
        File[] externalFilesDirs;
        ArrayList arrayList = new ArrayList();
        Context context = this.f8140m;
        switch (enumC0610c.ordinal()) {
            case 0:
                str = null;
                break;
            case 1:
                str = "music";
                break;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                str = "podcasts";
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "ringtones";
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                str = "alarms";
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                str = "notifications";
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "pictures";
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "movies";
                break;
            case k.BYTES_FIELD_NUMBER /* 8 */:
                str = "downloads";
                break;
            case 9:
                str = "dcim";
                break;
            case 10:
                str = "documents";
                break;
            default:
                throw new RuntimeException("Unrecognized directory: " + enumC0610c);
        }
        for (File file : context.getExternalFilesDirs(str)) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    @Override // c2.InterfaceC0248b
    public final void onAttachedToEngine(C0247a c0247a) {
        try {
            h.t(c0247a.f5124b, this);
        } catch (Exception e2) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e2);
        }
        this.f8140m = c0247a.f5123a;
    }

    @Override // c2.InterfaceC0248b
    public final void onDetachedFromEngine(C0247a c0247a) {
        h.t(c0247a.f5124b, null);
    }
}
