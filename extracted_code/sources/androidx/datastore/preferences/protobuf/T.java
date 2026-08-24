package androidx.datastore.preferences.protobuf;
/* loaded from: classes.dex */
public final class T {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0197u f4204a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4205b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f4206c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4207d;

    public T(AbstractC0197u abstractC0197u, String str, Object[] objArr) {
        this.f4204a = abstractC0197u;
        this.f4205b = str;
        this.f4206c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f4207d = charAt;
            return;
        }
        int i3 = charAt & 8191;
        int i4 = 1;
        int i5 = 13;
        while (true) {
            int i6 = i4 + 1;
            char charAt2 = str.charAt(i4);
            if (charAt2 >= 55296) {
                i3 |= (charAt2 & 8191) << i5;
                i5 += 13;
                i4 = i6;
            } else {
                this.f4207d = i3 | (charAt2 << i5);
                return;
            }
        }
    }

    public final AbstractC0178a a() {
        return this.f4204a;
    }

    public final Object[] b() {
        return this.f4206c;
    }

    public final String c() {
        return this.f4205b;
    }

    public final int d() {
        int i3 = this.f4207d;
        if ((i3 & 1) != 0) {
            return 1;
        }
        if ((i3 & 4) == 4) {
            return 3;
        }
        return 2;
    }
}
