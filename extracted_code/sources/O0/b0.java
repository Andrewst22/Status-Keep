package o0;

import U.AbstractC0123a;
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: d  reason: collision with root package name */
    public static final b0 f8578d = new b0(new R.U[0]);

    /* renamed from: a  reason: collision with root package name */
    public final int f8579a;

    /* renamed from: b  reason: collision with root package name */
    public final D1.b0 f8580b;

    /* renamed from: c  reason: collision with root package name */
    public int f8581c;

    static {
        U.A.H(0);
    }

    public b0(R.U... uArr) {
        this.f8580b = D1.I.k(uArr);
        this.f8579a = uArr.length;
        int i3 = 0;
        while (true) {
            D1.b0 b0Var = this.f8580b;
            if (i3 < b0Var.size()) {
                int i4 = i3 + 1;
                for (int i5 = i4; i5 < b0Var.size(); i5++) {
                    if (((R.U) b0Var.get(i3)).equals(b0Var.get(i5))) {
                        AbstractC0123a.o("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                }
                i3 = i4;
            } else {
                return;
            }
        }
    }

    public final R.U a(int i3) {
        return (R.U) this.f8580b.get(i3);
    }

    public final int b(R.U u3) {
        int indexOf = this.f8580b.indexOf(u3);
        if (indexOf < 0) {
            return -1;
        }
        return indexOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f8579a == b0Var.f8579a && this.f8580b.equals(b0Var.f8580b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8581c == 0) {
            this.f8581c = this.f8580b.hashCode();
        }
        return this.f8581c;
    }
}
