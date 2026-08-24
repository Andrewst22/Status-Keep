package j$.util.concurrent;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0342a extends p {

    /* renamed from: i  reason: collision with root package name */
    final ConcurrentHashMap f6768i;

    /* renamed from: j  reason: collision with root package name */
    l f6769j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0342a(l[] lVarArr, int i3, int i4, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i3, 0, i4);
        this.f6768i = concurrentHashMap;
        a();
    }

    public final boolean hasNext() {
        return this.f6789b != null;
    }

    public final boolean hasMoreElements() {
        return this.f6789b != null;
    }

    public final void remove() {
        l lVar = this.f6769j;
        if (lVar == null) {
            throw new IllegalStateException();
        }
        this.f6769j = null;
        this.f6768i.g(lVar.f6781b, null, null);
    }
}
