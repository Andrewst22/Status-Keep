package c1;

import java.util.Arrays;
/* renamed from: c1.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0242i {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f4900e = {0, 0, 1};

    /* renamed from: a  reason: collision with root package name */
    public boolean f4901a;

    /* renamed from: b  reason: collision with root package name */
    public int f4902b;

    /* renamed from: c  reason: collision with root package name */
    public int f4903c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f4904d;

    public final void a(byte[] bArr, int i3, int i4) {
        if (!this.f4901a) {
            return;
        }
        int i5 = i4 - i3;
        byte[] bArr2 = this.f4904d;
        int length = bArr2.length;
        int i6 = this.f4902b + i5;
        if (length < i6) {
            this.f4904d = Arrays.copyOf(bArr2, i6 * 2);
        }
        System.arraycopy(bArr, i3, this.f4904d, this.f4902b, i5);
        this.f4902b += i5;
    }
}
