package p;
/* renamed from: p.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0725g {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f8737a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    public static final Object[] f8738b = new Object[0];

    public static int a(int i3, int i4, int[] iArr) {
        int i5 = i3 - 1;
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) >>> 1;
            int i8 = iArr[i7];
            if (i8 < i4) {
                i6 = i7 + 1;
            } else if (i8 > i4) {
                i5 = i7 - 1;
            } else {
                return i7;
            }
        }
        return ~i6;
    }

    public static int b(long[] jArr, int i3, long j3) {
        int i4 = i3 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = (jArr[i6] > j3 ? 1 : (jArr[i6] == j3 ? 0 : -1));
            if (i7 < 0) {
                i5 = i6 + 1;
            } else if (i7 > 0) {
                i4 = i6 - 1;
            } else {
                return i6;
            }
        }
        return ~i5;
    }
}
