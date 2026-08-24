package i1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* renamed from: i1.K  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300K implements Parcelable {
    public static final Parcelable.Creator<C0300K> CREATOR = new R.D(19);

    /* renamed from: m  reason: collision with root package name */
    public int f5974m;

    /* renamed from: n  reason: collision with root package name */
    public int f5975n;

    /* renamed from: o  reason: collision with root package name */
    public int f5976o;

    /* renamed from: p  reason: collision with root package name */
    public int[] f5977p;

    /* renamed from: q  reason: collision with root package name */
    public int f5978q;

    /* renamed from: r  reason: collision with root package name */
    public int[] f5979r;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList f5980s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f5981t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5982u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f5983v;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f5974m);
        parcel.writeInt(this.f5975n);
        parcel.writeInt(this.f5976o);
        if (this.f5976o > 0) {
            parcel.writeIntArray(this.f5977p);
        }
        parcel.writeInt(this.f5978q);
        if (this.f5978q > 0) {
            parcel.writeIntArray(this.f5979r);
        }
        parcel.writeInt(this.f5981t ? 1 : 0);
        parcel.writeInt(this.f5982u ? 1 : 0);
        parcel.writeInt(this.f5983v ? 1 : 0);
        parcel.writeList(this.f5980s);
    }
}
