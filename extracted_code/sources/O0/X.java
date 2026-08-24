package o0;

import java.util.Arrays;
import java.util.Random;
/* loaded from: classes.dex */
public final class X {

    /* renamed from: a  reason: collision with root package name */
    public final Random f8550a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f8551b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f8552c;

    public X() {
        this(new Random());
    }

    public final X a(int i3) {
        Random random;
        int[] iArr;
        int[] iArr2 = new int[i3];
        int[] iArr3 = new int[i3];
        int i4 = 0;
        while (true) {
            random = this.f8550a;
            iArr = this.f8551b;
            if (i4 >= i3) {
                break;
            }
            iArr2[i4] = random.nextInt(iArr.length + 1);
            int i5 = i4 + 1;
            int nextInt = random.nextInt(i5);
            iArr3[i4] = iArr3[nextInt];
            iArr3[nextInt] = i4;
            i4 = i5;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i3];
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < iArr.length + i3; i8++) {
            if (i6 < i3 && i7 == iArr2[i6]) {
                iArr4[i8] = iArr3[i6];
                i6++;
            } else {
                int i9 = i7 + 1;
                int i10 = iArr[i7];
                iArr4[i8] = i10;
                if (i10 >= 0) {
                    iArr4[i8] = i10 + i3;
                }
                i7 = i9;
            }
        }
        return new X(iArr4, new Random(random.nextLong()));
    }

    public X(int[] iArr, Random random) {
        this.f8551b = iArr;
        this.f8550a = random;
        this.f8552c = new int[iArr.length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.f8552c[iArr[i3]] = i3;
        }
    }

    public X(Random random) {
        this(new int[0], random);
    }
}
