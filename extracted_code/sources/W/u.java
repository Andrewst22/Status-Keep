package W;

import a.AbstractC0155a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
/* loaded from: classes.dex */
public class u extends i {

    /* renamed from: o  reason: collision with root package name */
    public final int f2803o;

    public u() {
        super(2008);
        this.f2803o = 1;
    }

    public static int a(int i3, int i4) {
        if (i3 == 2000 && i4 == 1) {
            return 2001;
        }
        return i3;
    }

    public static u b(IOException iOException, int i3) {
        int i4;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i4 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i4 = 1004;
        } else if (message != null && AbstractC0155a.L(message).matches("cleartext.*not permitted.*")) {
            i4 = 2007;
        } else {
            i4 = 2001;
        }
        if (i4 == 2007) {
            return new u("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007);
        }
        return new u(iOException, i4, i3);
    }

    public u(String str, int i3) {
        super(str, a(i3, 1));
        this.f2803o = 1;
    }

    public u(IOException iOException, int i3, int i4) {
        super(iOException, a(i3, i4));
        this.f2803o = i4;
    }

    public u(String str, IOException iOException, int i3) {
        super(str, iOException, a(i3, 1));
        this.f2803o = 1;
    }
}
