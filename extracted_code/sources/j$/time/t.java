package j$.time;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class t implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* renamed from: a  reason: collision with root package name */
    private byte f6605a;

    /* renamed from: b  reason: collision with root package name */
    private Object f6606b;

    public t() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(byte b3, Object obj) {
        this.f6605a = b3;
        this.f6606b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b3 = this.f6605a;
        Object obj = this.f6606b;
        objectOutput.writeByte(b3);
        switch (b3) {
            case 1:
                ((Duration) obj).writeExternal(objectOutput);
                return;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                ((Instant) obj).V(objectOutput);
                return;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                ((g) obj).o0(objectOutput);
                return;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                ((k) obj).j0(objectOutput);
                return;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                ((LocalDateTime) obj).k0(objectOutput);
                return;
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((ZonedDateTime) obj).S(objectOutput);
                return;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                ((z) obj).T(objectOutput);
                return;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                ((y) obj).Z(objectOutput);
                return;
            case 9:
                ((r) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((q) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((v) obj).R(objectOutput);
                return;
            case 12:
                ((x) obj).U(objectOutput);
                return;
            case 13:
                ((o) obj).O(objectOutput);
                return;
            case 14:
                ((s) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.f6605a = readByte;
        this.f6606b = b(readByte, objectInput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Serializable a(ObjectInput objectInput) {
        return b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte b3, ObjectInput objectInput) {
        switch (b3) {
            case 1:
                Duration duration = Duration.f6420c;
                return Duration.z(objectInput.readLong(), objectInput.readInt());
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                Instant instant = Instant.f6423c;
                return Instant.S(objectInput.readLong(), objectInput.readInt());
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                g gVar = g.f6574d;
                return g.a0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                return k.e0(objectInput);
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                LocalDateTime localDateTime = LocalDateTime.f6426c;
                g gVar2 = g.f6574d;
                return LocalDateTime.b0(g.a0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.e0(objectInput));
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return ZonedDateTime.Q(objectInput);
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                int i3 = z.f6654d;
                return ZoneId.O(objectInput.readUTF(), false);
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                return y.Y(objectInput);
            case 9:
                return r.P(objectInput);
            case 10:
                return q.P(objectInput);
            case 11:
                int i4 = v.f6641b;
                return v.N(objectInput.readInt());
            case 12:
                return x.R(objectInput);
            case 13:
                return o.N(objectInput);
            case 14:
                return s.c(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f6606b;
    }
}
