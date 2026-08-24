package g1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final int f5765a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5766b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5767c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5768d;

    public j(int i3, int i4, long j3, long j4) {
        this.f5765a = i3;
        this.f5766b = i4;
        this.f5767c = j3;
        this.f5768d = j4;
    }

    public static j a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            j jVar = new j(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return jVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f5765a);
            dataOutputStream.writeInt(this.f5766b);
            dataOutputStream.writeLong(this.f5767c);
            dataOutputStream.writeLong(this.f5768d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f5766b == jVar.f5766b && this.f5767c == jVar.f5767c && this.f5765a == jVar.f5765a && this.f5768d == jVar.f5768d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f5766b), Long.valueOf(this.f5767c), Integer.valueOf(this.f5765a), Long.valueOf(this.f5768d));
    }
}
