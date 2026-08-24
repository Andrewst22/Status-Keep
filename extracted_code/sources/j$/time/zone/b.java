package j$.time.zone;

import j$.time.Duration;
import j$.time.LocalDateTime;
import j$.time.chrono.AbstractC0335i;
import j$.time.y;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: a  reason: collision with root package name */
    private final long f6659a;

    /* renamed from: b  reason: collision with root package name */
    private final LocalDateTime f6660b;

    /* renamed from: c  reason: collision with root package name */
    private final y f6661c;

    /* renamed from: d  reason: collision with root package name */
    private final y f6662d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return j$.com.android.tools.r8.a.c(this.f6659a, ((b) obj).f6659a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(LocalDateTime localDateTime, y yVar, y yVar2) {
        localDateTime.getClass();
        this.f6659a = AbstractC0335i.o(localDateTime, yVar);
        this.f6660b = localDateTime;
        this.f6661c = yVar;
        this.f6662d = yVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(long j3, y yVar, y yVar2) {
        this.f6659a = j3;
        this.f6660b = LocalDateTime.c0(j3, 0, yVar);
        this.f6661c = yVar;
        this.f6662d = yVar2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        a.c(this.f6659a, objectOutput);
        a.d(this.f6661c, objectOutput);
        a.d(this.f6662d, objectOutput);
    }

    public final long M() {
        return this.f6659a;
    }

    public final LocalDateTime o() {
        return this.f6660b;
    }

    public final y v() {
        return this.f6661c;
    }

    public final y r() {
        return this.f6662d;
    }

    public final LocalDateTime m() {
        return this.f6660b.e0(this.f6662d.T() - this.f6661c.T());
    }

    public final Duration q() {
        return Duration.v(this.f6662d.T() - this.f6661c.T());
    }

    public final boolean A() {
        return this.f6662d.T() > this.f6661c.T();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List z() {
        return A() ? Collections.emptyList() : j$.com.android.tools.r8.a.e(new Object[]{this.f6661c, this.f6662d});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f6659a == bVar.f6659a && this.f6661c.equals(bVar.f6661c) && this.f6662d.equals(bVar.f6662d);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f6660b.hashCode() ^ this.f6661c.hashCode()) ^ Integer.rotateLeft(this.f6662d.hashCode(), 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(A() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f6660b);
        sb.append(this.f6661c);
        sb.append(" to ");
        sb.append(this.f6662d);
        sb.append(']');
        return sb.toString();
    }
}
