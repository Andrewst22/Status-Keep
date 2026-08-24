package c1;

import java.util.Arrays;
/* renamed from: c1.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0244k {

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f4922f = {0, 0, 1};

    /* renamed from: a  reason: collision with root package name */
    public boolean f4923a;

    /* renamed from: b  reason: collision with root package name */
    public int f4924b;

    /* renamed from: c  reason: collision with root package name */
    public int f4925c;

    /* renamed from: d  reason: collision with root package name */
    public int f4926d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f4927e;

    public final void a(byte[] bArr, int i3, int i4) {
        if (!this.f4923a) {
            return;
        }
        int i5 = i4 - i3;
        byte[] bArr2 = this.f4927e;
        int length = bArr2.length;
        int i6 = this.f4925c + i5;
        if (length < i6) {
            this.f4927e = Arrays.copyOf(bArr2, i6 * 2);
        }
        System.arraycopy(bArr, i3, this.f4927e, this.f4925c, i5);
        this.f4925c += i5;
    }
}
