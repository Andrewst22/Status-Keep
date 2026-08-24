package androidx.datastore.preferences.protobuf;
/* renamed from: androidx.datastore.preferences.protobuf.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183f extends C0184g {

    /* renamed from: q  reason: collision with root package name */
    public final int f4240q;

    /* renamed from: r  reason: collision with root package name */
    public final int f4241r;

    public C0183f(byte[] bArr, int i3, int i4) {
        super(bArr);
        C0184g.b(i3, i3 + i4, bArr.length);
        this.f4240q = i3;
        this.f4241r = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.C0184g
    public final byte a(int i3) {
        int i4 = this.f4241r;
        if (((i4 - (i3 + 1)) | i3) < 0) {
            if (i3 < 0) {
                throw new ArrayIndexOutOfBoundsException(D2.h.k("Index < 0: ", i3));
            }
            throw new ArrayIndexOutOfBoundsException(D2.h.j(i3, i4, "Index > length: ", ", "));
        }
        return this.f4245n[this.f4240q + i3];
    }

    @Override // androidx.datastore.preferences.protobuf.C0184g
    public final void d(byte[] bArr, int i3) {
        System.arraycopy(this.f4245n, this.f4240q, bArr, 0, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.C0184g
    public final int e() {
        return this.f4240q;
    }

    @Override // androidx.datastore.preferences.protobuf.C0184g
    public final byte f(int i3) {
        return this.f4245n[this.f4240q + i3];
    }

    @Override // androidx.datastore.preferences.protobuf.C0184g
    public final int size() {
        return this.f4241r;
    }
}
