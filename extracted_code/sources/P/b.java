package P;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* renamed from: q  reason: collision with root package name */
    public static final ByteOrder f1368q = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: r  reason: collision with root package name */
    public static final ByteOrder f1369r = ByteOrder.BIG_ENDIAN;

    /* renamed from: m  reason: collision with root package name */
    public final DataInputStream f1370m;

    /* renamed from: n  reason: collision with root package name */
    public ByteOrder f1371n;

    /* renamed from: o  reason: collision with root package name */
    public int f1372o;

    /* renamed from: p  reason: collision with root package name */
    public byte[] f1373p;

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }

    public final void a(int i3) {
        int i4 = 0;
        while (i4 < i3) {
            DataInputStream dataInputStream = this.f1370m;
            int i5 = i3 - i4;
            int skip = (int) dataInputStream.skip(i5);
            if (skip <= 0) {
                if (this.f1373p == null) {
                    this.f1373p = new byte[8192];
                }
                skip = dataInputStream.read(this.f1373p, 0, Math.min(8192, i5));
                if (skip == -1) {
                    throw new EOFException("Reached EOF while skipping " + i3 + " bytes.");
                }
            }
            i4 += skip;
        }
        this.f1372o += i4;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f1370m.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i3) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f1372o++;
        return this.f1370m.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f1372o++;
        return this.f1370m.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f1372o++;
        int read = this.f1370m.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f1372o += 2;
        return this.f1370m.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i3, int i4) {
        this.f1372o += i4;
        this.f1370m.readFully(bArr, i3, i4);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f1372o += 4;
        DataInputStream dataInputStream = this.f1370m;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.f1371n;
            if (byteOrder == f1368q) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f1369r) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f1371n);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.f1372o += 8;
        DataInputStream dataInputStream = this.f1370m;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.f1371n;
            if (byteOrder == f1368q) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f1369r) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f1371n);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f1372o += 2;
        DataInputStream dataInputStream = this.f1370m;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f1371n;
            if (byteOrder == f1368q) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == f1369r) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f1371n);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f1372o += 2;
        return this.f1370m.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f1372o++;
        return this.f1370m.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f1372o += 2;
        DataInputStream dataInputStream = this.f1370m;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f1371n;
            if (byteOrder == f1368q) {
                return (read2 << 8) + read;
            }
            if (byteOrder == f1369r) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f1371n);
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i3) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        this.f1371n = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f1370m = dataInputStream;
        dataInputStream.mark(0);
        this.f1372o = 0;
        this.f1371n = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i3, int i4) {
        int read = this.f1370m.read(bArr, i3, i4);
        this.f1372o += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f1372o += bArr.length;
        this.f1370m.readFully(bArr);
    }
}
