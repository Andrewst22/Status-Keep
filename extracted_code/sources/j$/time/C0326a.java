package j$.time;

import java.io.ObjectInputStream;
import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0326a extends b implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    static final C0326a f6434b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* renamed from: a  reason: collision with root package name */
    private final ZoneId f6435a;

    static {
        System.currentTimeMillis();
        f6434b = new C0326a(y.f6649f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0326a(ZoneId zoneId) {
        this.f6435a = zoneId;
    }

    @Override // j$.time.b
    public final ZoneId a() {
        return this.f6435a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0326a) {
            return this.f6435a.equals(((C0326a) obj).f6435a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6435a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f6435a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }
}
