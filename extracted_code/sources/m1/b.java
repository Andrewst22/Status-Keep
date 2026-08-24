package m1;

import android.os.Parcel;
import android.util.SparseIntArray;
import p.C0723e;
import p.C0727i;
/* loaded from: classes.dex */
public final class b extends AbstractC0617a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f8185d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f8186e;

    /* renamed from: f  reason: collision with root package name */
    public final int f8187f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8188g;

    /* renamed from: h  reason: collision with root package name */
    public final String f8189h;

    /* renamed from: i  reason: collision with root package name */
    public int f8190i;

    /* renamed from: j  reason: collision with root package name */
    public int f8191j;

    /* renamed from: k  reason: collision with root package name */
    public int f8192k;

    /* JADX WARN: Type inference failed for: r5v0, types: [p.e, p.i] */
    /* JADX WARN: Type inference failed for: r6v0, types: [p.e, p.i] */
    /* JADX WARN: Type inference failed for: r7v0, types: [p.e, p.i] */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0727i(), new C0727i(), new C0727i());
    }

    @Override // m1.AbstractC0617a
    public final b a() {
        Parcel parcel = this.f8186e;
        int dataPosition = parcel.dataPosition();
        int i3 = this.f8191j;
        if (i3 == this.f8187f) {
            i3 = this.f8188g;
        }
        int i4 = i3;
        return new b(parcel, dataPosition, i4, this.f8189h + "  ", this.f8182a, this.f8183b, this.f8184c);
    }

    @Override // m1.AbstractC0617a
    public final boolean e(int i3) {
        while (this.f8191j < this.f8188g) {
            int i4 = this.f8192k;
            if (i4 == i3) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i3)) > 0) {
                return false;
            }
            int i5 = this.f8191j;
            Parcel parcel = this.f8186e;
            parcel.setDataPosition(i5);
            int readInt = parcel.readInt();
            this.f8192k = parcel.readInt();
            this.f8191j += readInt;
        }
        if (this.f8192k != i3) {
            return false;
        }
        return true;
    }

    @Override // m1.AbstractC0617a
    public final void i(int i3) {
        int i4 = this.f8190i;
        SparseIntArray sparseIntArray = this.f8185d;
        Parcel parcel = this.f8186e;
        if (i4 >= 0) {
            int i5 = sparseIntArray.get(i4);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i5);
            parcel.writeInt(dataPosition - i5);
            parcel.setDataPosition(dataPosition);
        }
        this.f8190i = i3;
        sparseIntArray.put(i3, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i3);
    }

    public b(Parcel parcel, int i3, int i4, String str, C0723e c0723e, C0723e c0723e2, C0723e c0723e3) {
        super(c0723e, c0723e2, c0723e3);
        this.f8185d = new SparseIntArray();
        this.f8190i = -1;
        this.f8192k = -1;
        this.f8186e = parcel;
        this.f8187f = i3;
        this.f8188g = i4;
        this.f8191j = i3;
        this.f8189h = str;
    }
}
