package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.LocalDateTime;
import j$.time.chrono.t;
import j$.time.k;
import j$.time.m;
import j$.time.temporal.p;
import j$.time.y;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* renamed from: a  reason: collision with root package name */
    private final m f6665a;

    /* renamed from: b  reason: collision with root package name */
    private final byte f6666b;

    /* renamed from: c  reason: collision with root package name */
    private final DayOfWeek f6667c;

    /* renamed from: d  reason: collision with root package name */
    private final k f6668d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f6669e;

    /* renamed from: f  reason: collision with root package name */
    private final d f6670f;

    /* renamed from: g  reason: collision with root package name */
    private final y f6671g;

    /* renamed from: h  reason: collision with root package name */
    private final y f6672h;

    /* renamed from: i  reason: collision with root package name */
    private final y f6673i;

    e(m mVar, int i3, DayOfWeek dayOfWeek, k kVar, boolean z3, d dVar, y yVar, y yVar2, y yVar3) {
        this.f6665a = mVar;
        this.f6666b = (byte) i3;
        this.f6667c = dayOfWeek;
        this.f6668d = kVar;
        this.f6669e = z3;
        this.f6670f = dVar;
        this.f6671g = yVar;
        this.f6672h = yVar2;
        this.f6673i = yVar3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        k kVar = this.f6668d;
        boolean z3 = this.f6669e;
        int g02 = z3 ? 86400 : kVar.g0();
        int T3 = this.f6671g.T();
        y yVar = this.f6672h;
        int T4 = yVar.T() - T3;
        y yVar2 = this.f6673i;
        int T5 = yVar2.T() - T3;
        int R3 = g02 % 3600 == 0 ? z3 ? 24 : kVar.R() : 31;
        int i3 = T3 % 900 == 0 ? (T3 / 900) + 128 : 255;
        int i4 = (T4 == 0 || T4 == 1800 || T4 == 3600) ? T4 / 1800 : 3;
        int i5 = (T5 == 0 || T5 == 1800 || T5 == 3600) ? T5 / 1800 : 3;
        DayOfWeek dayOfWeek = this.f6667c;
        objectOutput.writeInt((this.f6665a.getValue() << 28) + ((this.f6666b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (R3 << 14) + (this.f6670f.ordinal() << 12) + (i3 << 4) + (i4 << 2) + i5);
        if (R3 == 31) {
            objectOutput.writeInt(g02);
        }
        if (i3 == 255) {
            objectOutput.writeInt(T3);
        }
        if (i4 == 3) {
            objectOutput.writeInt(yVar.T());
        }
        if (i5 == 3) {
            objectOutput.writeInt(yVar2.T());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e b(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        m Q2 = m.Q(readInt >>> 28);
        int i3 = ((264241152 & readInt) >>> 22) - 32;
        int i4 = (3670016 & readInt) >>> 19;
        DayOfWeek N3 = i4 == 0 ? null : DayOfWeek.N(i4);
        int i5 = (507904 & readInt) >>> 14;
        d dVar = d.values()[(readInt & 12288) >>> 12];
        int i6 = (readInt & 4080) >>> 4;
        int i7 = (readInt & 12) >>> 2;
        int i8 = readInt & 3;
        k Y2 = i5 == 31 ? k.Y(objectInput.readInt()) : k.V(i5 % 24);
        y W2 = y.W(i6 == 255 ? objectInput.readInt() : (i6 - 128) * 900);
        y W3 = i7 == 3 ? y.W(objectInput.readInt()) : y.W((i7 * 1800) + W2.T());
        y W4 = i8 == 3 ? y.W(objectInput.readInt()) : y.W((i8 * 1800) + W2.T());
        boolean z3 = i5 == 24;
        Objects.requireNonNull(Q2, "month");
        Objects.requireNonNull(Y2, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        if (i3 < -28 || i3 > 31 || i3 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z3 && !Y2.equals(k.f6584g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (Y2.T() != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(Q2, i3, N3, Y2, z3, dVar, W2, W3, W4);
    }

    public final b a(int i3) {
        j$.time.g b02;
        m mVar = this.f6665a;
        DayOfWeek dayOfWeek = this.f6667c;
        byte b3 = this.f6666b;
        if (b3 < 0) {
            t.f6484d.getClass();
            b02 = j$.time.g.b0(i3, mVar, mVar.O(t.O(i3)) + 1 + b3);
            if (dayOfWeek != null) {
                b02 = b02.q(new p(dayOfWeek.getValue(), 1));
            }
        } else {
            b02 = j$.time.g.b0(i3, mVar, b3);
            if (dayOfWeek != null) {
                b02 = b02.q(new p(dayOfWeek.getValue(), 0));
            }
        }
        if (this.f6669e) {
            b02 = b02.f0(1L);
        }
        LocalDateTime b03 = LocalDateTime.b0(b02, this.f6668d);
        int i4 = c.f6663a[this.f6670f.ordinal()];
        y yVar = this.f6672h;
        if (i4 == 1) {
            b03 = b03.e0(yVar.T() - y.f6649f.T());
        } else if (i4 == 2) {
            b03 = b03.e0(yVar.T() - this.f6671g.T());
        }
        return new b(b03, yVar, this.f6673i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f6665a == eVar.f6665a && this.f6666b == eVar.f6666b && this.f6667c == eVar.f6667c && this.f6670f == eVar.f6670f && this.f6668d.equals(eVar.f6668d) && this.f6669e == eVar.f6669e && this.f6671g.equals(eVar.f6671g) && this.f6672h.equals(eVar.f6672h) && this.f6673i.equals(eVar.f6673i);
        }
        return false;
    }

    public final int hashCode() {
        int g02 = ((this.f6668d.g0() + (this.f6669e ? 1 : 0)) << 15) + (this.f6665a.ordinal() << 11) + ((this.f6666b + 32) << 5);
        DayOfWeek dayOfWeek = this.f6667c;
        return ((this.f6671g.hashCode() ^ (this.f6670f.ordinal() + (g02 + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.f6672h.hashCode()) ^ this.f6673i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        y yVar = this.f6672h;
        y yVar2 = this.f6673i;
        sb.append(yVar.compareTo(yVar2) > 0 ? "Gap " : "Overlap ");
        sb.append(yVar);
        sb.append(" to ");
        sb.append(yVar2);
        sb.append(", ");
        m mVar = this.f6665a;
        byte b3 = this.f6666b;
        DayOfWeek dayOfWeek = this.f6667c;
        if (dayOfWeek == null) {
            sb.append(mVar.name());
            sb.append(' ');
            sb.append((int) b3);
        } else if (b3 == -1) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day of ");
            sb.append(mVar.name());
        } else if (b3 < 0) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day minus ");
            sb.append((-b3) - 1);
            sb.append(" of ");
            sb.append(mVar.name());
        } else {
            sb.append(dayOfWeek.name());
            sb.append(" on or after ");
            sb.append(mVar.name());
            sb.append(' ');
            sb.append((int) b3);
        }
        sb.append(" at ");
        sb.append(this.f6669e ? "24:00" : this.f6668d.toString());
        sb.append(" ");
        sb.append(this.f6670f);
        sb.append(", standard offset ");
        sb.append(this.f6671g);
        sb.append(']');
        return sb.toString();
    }
}
