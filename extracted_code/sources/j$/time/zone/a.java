package j$.time.zone;

import j$.time.y;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.TimeZone;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* renamed from: a  reason: collision with root package name */
    private byte f6657a;

    /* renamed from: b  reason: collision with root package name */
    private Serializable f6658b;

    public a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(byte b3, Serializable serializable) {
        this.f6657a = b3;
        this.f6658b = serializable;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b3 = this.f6657a;
        Serializable serializable = this.f6658b;
        objectOutput.writeByte(b3);
        if (b3 == 1) {
            ((f) serializable).writeExternal(objectOutput);
        } else if (b3 == 2) {
            ((b) serializable).writeExternal(objectOutput);
        } else if (b3 == 3) {
            ((e) serializable).writeExternal(objectOutput);
        } else if (b3 == 100) {
            ((f) serializable).k(objectOutput);
        } else {
            throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Serializable j3;
        byte readByte = objectInput.readByte();
        this.f6657a = readByte;
        if (readByte == 1) {
            j3 = f.j(objectInput);
        } else if (readByte == 2) {
            long a3 = a(objectInput);
            y b3 = b(objectInput);
            y b4 = b(objectInput);
            if (b3.equals(b4)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            j3 = new b(a3, b3, b4);
        } else if (readByte == 3) {
            j3 = e.b(objectInput);
        } else if (readByte != 100) {
            throw new StreamCorruptedException("Unknown serialized type");
        } else {
            j3 = new f(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f6658b = j3;
    }

    private Object readResolve() {
        return this.f6658b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(y yVar, ObjectOutput objectOutput) {
        int T3 = yVar.T();
        int i3 = T3 % 900 == 0 ? T3 / 900 : 127;
        objectOutput.writeByte(i3);
        if (i3 == 127) {
            objectOutput.writeInt(T3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y b(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        return readByte == Byte.MAX_VALUE ? y.W(objectInput.readInt()) : y.W(readByte * 900);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(long j3, ObjectOutput objectOutput) {
        if (j3 >= -4575744000L && j3 < 10413792000L && j3 % 900 == 0) {
            int i3 = (int) ((j3 + 4575744000L) / 900);
            objectOutput.writeByte((i3 >>> 16) & 255);
            objectOutput.writeByte((i3 >>> 8) & 255);
            objectOutput.writeByte(i3 & 255);
            return;
        }
        objectOutput.writeByte(255);
        objectOutput.writeLong(j3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(ObjectInput objectInput) {
        int readByte = objectInput.readByte() & 255;
        if (readByte == 255) {
            return objectInput.readLong();
        }
        return ((((readByte << 16) + ((objectInput.readByte() & 255) << 8)) + (objectInput.readByte() & 255)) * 900) - 4575744000L;
    }
}
