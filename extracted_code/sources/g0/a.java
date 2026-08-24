package G0;

import D1.I;
import K0.d;
import K0.e;
import K0.f;
import K0.l;
import K0.m;
import K0.n;
import K0.o;
import M0.i;
import M0.j;
import N.k;
import R.C0109l;
import R.C0110m;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f374a;

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View$BaseSavedState, H.k, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f374a) {
            case 0:
                String readString = parcel.readString();
                readString.getClass();
                return new b(readString, parcel.readInt());
            case 1:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f422m = parcel.readInt();
                return baseSavedState;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return new H0.a(parcel);
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return new I0.a(parcel);
            case k.LONG_FIELD_NUMBER /* 4 */:
                return new I0.b(parcel);
            case k.STRING_FIELD_NUMBER /* 5 */:
                return new J0.b(parcel);
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new J0.c(parcel);
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                return new K0.a(parcel);
            case k.BYTES_FIELD_NUMBER /* 8 */:
                return new K0.b(parcel);
            case 9:
                return new K0.c(parcel);
            case 10:
                return new d(parcel);
            case 11:
                return new e(parcel);
            case 12:
                return new f(parcel);
            case 13:
                return new K0.k(parcel);
            case 14:
                return new l(parcel);
            case 15:
                return new m(parcel);
            case 16:
                String readString2 = parcel.readString();
                readString2.getClass();
                String readString3 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new n(readString2, readString3, I.k(createStringArray));
            case 17:
                return new o(parcel);
            case 18:
                return new L0.a(parcel);
            case 19:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, L0.b.class.getClassLoader());
                return new L0.c(arrayList);
            case 20:
                return new L0.b(parcel.readInt(), parcel.readLong(), parcel.readLong());
            case 21:
                return new L0.d(parcel);
            case 22:
                return new M0.a(parcel);
            case 23:
                return new M0.e(parcel);
            case 24:
                return new Object();
            case 25:
                return new i(parcel);
            case 26:
                return new j(parcel.readLong(), parcel.readLong());
            case 27:
                return new I0.b(parcel);
            case 28:
                return new C0110m(parcel);
            default:
                return new C0109l(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f374a) {
            case 0:
                return new b[i3];
            case 1:
                return new H.k[i3];
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return new H0.a[i3];
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return new I0.a[i3];
            case k.LONG_FIELD_NUMBER /* 4 */:
                return new I0.b[i3];
            case k.STRING_FIELD_NUMBER /* 5 */:
                return new J0.b[i3];
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new J0.c[i3];
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                return new K0.a[i3];
            case k.BYTES_FIELD_NUMBER /* 8 */:
                return new K0.b[i3];
            case 9:
                return new K0.c[i3];
            case 10:
                return new d[i3];
            case 11:
                return new e[i3];
            case 12:
                return new f[i3];
            case 13:
                return new K0.k[i3];
            case 14:
                return new l[i3];
            case 15:
                return new m[i3];
            case 16:
                return new n[i3];
            case 17:
                return new o[i3];
            case 18:
                return new L0.a[i3];
            case 19:
                return new L0.c[i3];
            case 20:
                return new L0.b[i3];
            case 21:
                return new L0.d[i3];
            case 22:
                return new M0.a[i3];
            case 23:
                return new M0.e[i3];
            case 24:
                return new M0.f[i3];
            case 25:
                return new i[i3];
            case 26:
                return new j[i3];
            case 27:
                return new N0.a[i3];
            case 28:
                return new C0110m[i3];
            default:
                return new C0109l[i3];
        }
    }
}
