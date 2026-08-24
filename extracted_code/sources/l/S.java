package l;
/* loaded from: classes.dex */
public final class S {

    /* renamed from: a  reason: collision with root package name */
    public int f7777a;

    /* renamed from: b  reason: collision with root package name */
    public int f7778b;

    /* renamed from: c  reason: collision with root package name */
    public int f7779c;

    /* renamed from: d  reason: collision with root package name */
    public int f7780d;

    /* renamed from: e  reason: collision with root package name */
    public int f7781e;

    /* renamed from: f  reason: collision with root package name */
    public int f7782f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7783g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7784h;

    public final void a(int i3, int i4) {
        this.f7779c = i3;
        this.f7780d = i4;
        this.f7784h = true;
        if (this.f7783g) {
            if (i4 != Integer.MIN_VALUE) {
                this.f7777a = i4;
            }
            if (i3 != Integer.MIN_VALUE) {
                this.f7778b = i3;
                return;
            }
            return;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f7777a = i3;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f7778b = i4;
        }
    }
}
