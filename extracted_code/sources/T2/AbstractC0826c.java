package t2;

import java.util.NoSuchElementException;
import n2.AbstractC0664g;
/* renamed from: t2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0826c extends AbstractC0664g {
    public static final void A(int i3, int i4, int i5, Object[] objArr, Object[] objArr2) {
        D2.i.e(objArr, "<this>");
        D2.i.e(objArr2, "destination");
        System.arraycopy(objArr, i4, objArr2, i3, i5 - i4);
    }

    public static Object B(Object[] objArr) {
        D2.i.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static void z(int i3, int i4, int i5, byte[] bArr, byte[] bArr2) {
        D2.i.e(bArr, "<this>");
        D2.i.e(bArr2, "destination");
        System.arraycopy(bArr, i4, bArr2, i3, i5 - i4);
    }
}
