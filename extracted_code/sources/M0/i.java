package M0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class i extends b {
    public static final Parcelable.Creator<i> CREATOR = new G0.a(25);

    /* renamed from: m  reason: collision with root package name */
    public final List f1051m;

    public i(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i3 = 0; i3 < readInt; i3++) {
            arrayList.add(new h(parcel));
        }
        this.f1051m = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        List list = this.f1051m;
        int size = list.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            h hVar = (h) list.get(i4);
            parcel.writeLong(hVar.f1040a);
            parcel.writeByte(hVar.f1041b ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f1042c ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f1043d ? (byte) 1 : (byte) 0);
            List list2 = hVar.f1045f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i5 = 0; i5 < size2; i5++) {
                g gVar = (g) list2.get(i5);
                parcel.writeInt(gVar.f1038a);
                parcel.writeLong(gVar.f1039b);
            }
            parcel.writeLong(hVar.f1044e);
            parcel.writeByte(hVar.f1046g ? (byte) 1 : (byte) 0);
            parcel.writeLong(hVar.f1047h);
            parcel.writeInt(hVar.f1048i);
            parcel.writeInt(hVar.f1049j);
            parcel.writeInt(hVar.f1050k);
        }
    }

    public i(ArrayList arrayList) {
        this.f1051m = Collections.unmodifiableList(arrayList);
    }
}
