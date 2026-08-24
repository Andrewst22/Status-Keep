package M0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new G0.a(23);

    /* renamed from: m  reason: collision with root package name */
    public final long f1026m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f1027n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f1028o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f1029p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f1030q;

    /* renamed from: r  reason: collision with root package name */
    public final long f1031r;

    /* renamed from: s  reason: collision with root package name */
    public final long f1032s;

    /* renamed from: t  reason: collision with root package name */
    public final List f1033t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f1034u;

    /* renamed from: v  reason: collision with root package name */
    public final long f1035v;

    /* renamed from: w  reason: collision with root package name */
    public final int f1036w;
    public final int x;

    /* renamed from: y  reason: collision with root package name */
    public final int f1037y;

    public e(long j3, boolean z3, boolean z4, boolean z5, boolean z6, long j4, long j5, List list, boolean z7, long j6, int i3, int i4, int i5) {
        this.f1026m = j3;
        this.f1027n = z3;
        this.f1028o = z4;
        this.f1029p = z5;
        this.f1030q = z6;
        this.f1031r = j4;
        this.f1032s = j5;
        this.f1033t = Collections.unmodifiableList(list);
        this.f1034u = z7;
        this.f1035v = j6;
        this.f1036w = i3;
        this.x = i4;
        this.f1037y = i5;
    }

    @Override // M0.b
    public final String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f1031r + ", programSplicePlaybackPositionUs= " + this.f1032s + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(this.f1026m);
        parcel.writeByte(this.f1027n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f1028o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f1029p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f1030q ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f1031r);
        parcel.writeLong(this.f1032s);
        List list = this.f1033t;
        int size = list.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = (d) list.get(i4);
            parcel.writeInt(dVar.f1023a);
            parcel.writeLong(dVar.f1024b);
            parcel.writeLong(dVar.f1025c);
        }
        parcel.writeByte(this.f1034u ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f1035v);
        parcel.writeInt(this.f1036w);
        parcel.writeInt(this.x);
        parcel.writeInt(this.f1037y);
    }

    public e(Parcel parcel) {
        this.f1026m = parcel.readLong();
        this.f1027n = parcel.readByte() == 1;
        this.f1028o = parcel.readByte() == 1;
        this.f1029p = parcel.readByte() == 1;
        this.f1030q = parcel.readByte() == 1;
        this.f1031r = parcel.readLong();
        this.f1032s = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i3 = 0; i3 < readInt; i3++) {
            arrayList.add(new d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f1033t = Collections.unmodifiableList(arrayList);
        this.f1034u = parcel.readByte() == 1;
        this.f1035v = parcel.readLong();
        this.f1036w = parcel.readInt();
        this.x = parcel.readInt();
        this.f1037y = parcel.readInt();
    }
}
