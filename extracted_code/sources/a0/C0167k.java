package a0;
/* renamed from: a0.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167k {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3762a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3763b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3764c;

    public final C0168l a() {
        if (!this.f3762a && (this.f3763b || this.f3764c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new C0168l(this);
    }
}
