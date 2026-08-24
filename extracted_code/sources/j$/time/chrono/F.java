package j$.time.chrono;

import j$.time.ZoneId;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
/* loaded from: classes2.dex */
final class F implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* renamed from: a  reason: collision with root package name */
    private byte f6441a;

    /* renamed from: b  reason: collision with root package name */
    private Object f6442b;

    public F() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public F(byte b3, Object obj) {
        this.f6441a = b3;
        this.f6442b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b3 = this.f6441a;
        Object obj = this.f6442b;
        objectOutput.writeByte(b3);
        switch (b3) {
            case 1:
                objectOutput.writeUTF(((AbstractC0327a) obj).l());
                return;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                ((C0333g) obj).writeExternal(objectOutput);
                return;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                ((l) obj).writeExternal(objectOutput);
                return;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                y yVar = (y) obj;
                yVar.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(yVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(yVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(yVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                ((z) obj).G(objectOutput);
                return;
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((r) obj).writeExternal(objectOutput);
                return;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                D d3 = (D) obj;
                d3.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(d3, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(d3, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(d3, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                J j3 = (J) obj;
                j3.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(j3, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(j3, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(j3, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                ((C0334h) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object q3;
        byte readByte = objectInput.readByte();
        this.f6441a = readByte;
        switch (readByte) {
            case 1:
                int i3 = AbstractC0327a.f6450c;
                q3 = AbstractC0327a.q(objectInput.readUTF());
                break;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                q3 = ((InterfaceC0328b) objectInput.readObject()).y((j$.time.k) objectInput.readObject());
                break;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                q3 = ((InterfaceC0331e) objectInput.readObject()).n((j$.time.y) objectInput.readObject()).i((ZoneId) objectInput.readObject());
                break;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                j$.time.g gVar = y.f6489d;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                w.f6487d.getClass();
                q3 = new y(j$.time.g.a0(readInt, readByte2, readByte3));
                break;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                z zVar = z.f6493d;
                q3 = z.s(objectInput.readByte());
                break;
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                p pVar = (p) objectInput.readObject();
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                pVar.getClass();
                q3 = r.U(pVar, readInt2, readByte4, readByte5);
                break;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                B.f6437d.getClass();
                q3 = new D(j$.time.g.a0(readInt3 + 1911, readByte6, readByte7));
                break;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                H.f6444d.getClass();
                q3 = new J(j$.time.g.a0(readInt4 - 543, readByte8, readByte9));
                break;
            case 9:
                int i4 = C0334h.f6455e;
                q3 = new C0334h(AbstractC0327a.q(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f6442b = q3;
    }

    private Object readResolve() {
        return this.f6442b;
    }
}
