package s0;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f9184a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9185b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9186c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9187d;

    public h(int i3, int i4, int i5, int i6) {
        this.f9184a = i3;
        this.f9185b = i4;
        this.f9186c = i5;
        this.f9187d = i6;
    }

    public final boolean a(int i3) {
        if (i3 == 1) {
            if (this.f9184a - this.f9185b <= 1) {
                return false;
            }
        } else if (this.f9186c - this.f9187d <= 1) {
            return false;
        }
        return true;
    }
}
