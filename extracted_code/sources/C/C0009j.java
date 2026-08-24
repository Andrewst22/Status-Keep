package C;
/* renamed from: C.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f106a;

    /* renamed from: b  reason: collision with root package name */
    public int f107b;

    /* renamed from: c  reason: collision with root package name */
    public int f108c;

    public int a() {
        int i3 = this.f108c;
        if (i3 != 2) {
            if (i3 != 5) {
                if (i3 != 29) {
                    if (i3 != 42) {
                        if (i3 != 22) {
                            if (i3 != 23) {
                                return 0;
                            }
                            return 15;
                        }
                        return 1073741824;
                    }
                    return 16;
                }
                return 12;
            }
            return 11;
        }
        return 10;
    }

    public String toString() {
        switch (this.f106a) {
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                return "LayoutState{mAvailable=0, mCurrentPosition=0, mItemDirection=0, mLayoutDirection=0, mStartLine=" + this.f107b + ", mEndLine=" + this.f108c + '}';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0009j(int i3, int i4, int i5) {
        this.f106a = i5;
        this.f107b = i3;
        this.f108c = i4;
    }
}
