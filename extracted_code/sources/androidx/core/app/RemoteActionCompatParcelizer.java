package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import m1.AbstractC0617a;
import m1.b;
import m1.c;
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0617a abstractC0617a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f4119a;
        boolean z3 = true;
        if (abstractC0617a.e(1)) {
            cVar = abstractC0617a.h();
        }
        remoteActionCompat.f4119a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f4120b;
        if (abstractC0617a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0617a).f8186e);
        }
        remoteActionCompat.f4120b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f4121c;
        if (abstractC0617a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0617a).f8186e);
        }
        remoteActionCompat.f4121c = charSequence2;
        remoteActionCompat.f4122d = (PendingIntent) abstractC0617a.g(remoteActionCompat.f4122d, 4);
        boolean z4 = remoteActionCompat.f4123e;
        if (abstractC0617a.e(5)) {
            if (((b) abstractC0617a).f8186e.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        remoteActionCompat.f4123e = z4;
        boolean z5 = remoteActionCompat.f4124f;
        if (abstractC0617a.e(6)) {
            if (((b) abstractC0617a).f8186e.readInt() == 0) {
                z3 = false;
            }
            z5 = z3;
        }
        remoteActionCompat.f4124f = z5;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0617a abstractC0617a) {
        abstractC0617a.getClass();
        IconCompat iconCompat = remoteActionCompat.f4119a;
        abstractC0617a.i(1);
        abstractC0617a.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f4120b;
        abstractC0617a.i(2);
        Parcel parcel = ((b) abstractC0617a).f8186e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f4121c;
        abstractC0617a.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        abstractC0617a.k(remoteActionCompat.f4122d, 4);
        boolean z3 = remoteActionCompat.f4123e;
        abstractC0617a.i(5);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = remoteActionCompat.f4124f;
        abstractC0617a.i(6);
        parcel.writeInt(z4 ? 1 : 0);
    }
}
