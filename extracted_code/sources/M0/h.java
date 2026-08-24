package M0;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final long f1040a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1041b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1042c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1043d;

    /* renamed from: e  reason: collision with root package name */
    public final long f1044e;

    /* renamed from: f  reason: collision with root package name */
    public final List f1045f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1046g;

    /* renamed from: h  reason: collision with root package name */
    public final long f1047h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1048i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1049j;

    /* renamed from: k  reason: collision with root package name */
    public final int f1050k;

    public h(long j3, boolean z3, boolean z4, boolean z5, ArrayList arrayList, long j4, boolean z6, long j5, int i3, int i4, int i5) {
        this.f1040a = j3;
        this.f1041b = z3;
        this.f1042c = z4;
        this.f1043d = z5;
        this.f1045f = Collections.unmodifiableList(arrayList);
        this.f1044e = j4;
        this.f1046g = z6;
        this.f1047h = j5;
        this.f1048i = i3;
        this.f1049j = i4;
        this.f1050k = i5;
    }

    public h(Parcel parcel) {
        this.f1040a = parcel.readLong();
        this.f1041b = parcel.readByte() == 1;
        this.f1042c = parcel.readByte() == 1;
        this.f1043d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i3 = 0; i3 < readInt; i3++) {
            arrayList.add(new g(parcel.readLong(), parcel.readInt()));
        }
        this.f1045f = Collections.unmodifiableList(arrayList);
        this.f1044e = parcel.readLong();
        this.f1046g = parcel.readByte() == 1;
        this.f1047h = parcel.readLong();
        this.f1048i = parcel.readInt();
        this.f1049j = parcel.readInt();
        this.f1050k = parcel.readInt();
    }
}
