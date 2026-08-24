package androidx.core.graphics.drawable;

import N.k;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import m1.AbstractC0617a;
import m1.b;
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC0617a abstractC0617a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f4126a = abstractC0617a.f(iconCompat.f4126a, 1);
        byte[] bArr = iconCompat.f4128c;
        if (abstractC0617a.e(2)) {
            Parcel parcel = ((b) abstractC0617a).f8186e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f4128c = bArr;
        iconCompat.f4129d = abstractC0617a.g(iconCompat.f4129d, 3);
        iconCompat.f4130e = abstractC0617a.f(iconCompat.f4130e, 4);
        iconCompat.f4131f = abstractC0617a.f(iconCompat.f4131f, 5);
        iconCompat.f4132g = (ColorStateList) abstractC0617a.g(iconCompat.f4132g, 6);
        String str = iconCompat.f4134i;
        if (abstractC0617a.e(7)) {
            str = ((b) abstractC0617a).f8186e.readString();
        }
        iconCompat.f4134i = str;
        String str2 = iconCompat.f4135j;
        if (abstractC0617a.e(8)) {
            str2 = ((b) abstractC0617a).f8186e.readString();
        }
        iconCompat.f4135j = str2;
        iconCompat.f4133h = PorterDuff.Mode.valueOf(iconCompat.f4134i);
        switch (iconCompat.f4126a) {
            case -1:
                Parcelable parcelable = iconCompat.f4129d;
                if (parcelable != null) {
                    iconCompat.f4127b = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = iconCompat.f4129d;
                if (parcelable2 != null) {
                    iconCompat.f4127b = parcelable2;
                    break;
                } else {
                    byte[] bArr3 = iconCompat.f4128c;
                    iconCompat.f4127b = bArr3;
                    iconCompat.f4126a = 3;
                    iconCompat.f4130e = 0;
                    iconCompat.f4131f = bArr3.length;
                    break;
                }
            case k.FLOAT_FIELD_NUMBER /* 2 */:
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                String str3 = new String(iconCompat.f4128c, Charset.forName("UTF-16"));
                iconCompat.f4127b = str3;
                if (iconCompat.f4126a == 2 && iconCompat.f4135j == null) {
                    iconCompat.f4135j = str3.split(":", -1)[0];
                    break;
                }
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f4127b = iconCompat.f4128c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC0617a abstractC0617a) {
        abstractC0617a.getClass();
        iconCompat.f4134i = iconCompat.f4133h.name();
        switch (iconCompat.f4126a) {
            case -1:
                iconCompat.f4129d = (Parcelable) iconCompat.f4127b;
                break;
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.f4129d = (Parcelable) iconCompat.f4127b;
                break;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                iconCompat.f4128c = ((String) iconCompat.f4127b).getBytes(Charset.forName("UTF-16"));
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f4128c = (byte[]) iconCompat.f4127b;
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.f4128c = iconCompat.f4127b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i3 = iconCompat.f4126a;
        if (-1 != i3) {
            abstractC0617a.j(i3, 1);
        }
        byte[] bArr = iconCompat.f4128c;
        if (bArr != null) {
            abstractC0617a.i(2);
            int length = bArr.length;
            Parcel parcel = ((b) abstractC0617a).f8186e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f4129d;
        if (parcelable != null) {
            abstractC0617a.k(parcelable, 3);
        }
        int i4 = iconCompat.f4130e;
        if (i4 != 0) {
            abstractC0617a.j(i4, 4);
        }
        int i5 = iconCompat.f4131f;
        if (i5 != 0) {
            abstractC0617a.j(i5, 5);
        }
        ColorStateList colorStateList = iconCompat.f4132g;
        if (colorStateList != null) {
            abstractC0617a.k(colorStateList, 6);
        }
        String str = iconCompat.f4134i;
        if (str != null) {
            abstractC0617a.i(7);
            ((b) abstractC0617a).f8186e.writeString(str);
        }
        String str2 = iconCompat.f4135j;
        if (str2 != null) {
            abstractC0617a.i(8);
            ((b) abstractC0617a).f8186e.writeString(str2);
        }
    }
}
