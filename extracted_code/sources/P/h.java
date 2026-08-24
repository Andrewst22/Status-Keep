package P;

import android.system.Os;
import java.io.FileDescriptor;
/* loaded from: classes.dex */
public abstract class h {
    public static void a(FileDescriptor fileDescriptor) {
        Os.close(fileDescriptor);
    }

    public static FileDescriptor b(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    public static long c(FileDescriptor fileDescriptor, long j3, int i3) {
        return Os.lseek(fileDescriptor, j3, i3);
    }
}
