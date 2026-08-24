package r0;

import R.U;
import U.AbstractC0123a;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final U f8992a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f8993b;

    public r(U u3, int[] iArr) {
        if (iArr.length == 0) {
            AbstractC0123a.o("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f8992a = u3;
        this.f8993b = iArr;
    }
}
