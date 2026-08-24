package t0;

import D2.h;
import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
/* renamed from: t0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0817b {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f9239a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f9240b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static boolean f9241c;

    /* renamed from: d  reason: collision with root package name */
    public static long f9242d;

    public static long a() {
        DatagramSocket datagramSocket;
        long j3;
        synchronized (f9240b) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                j3 = currentTimeMillis;
                datagramSocket = datagramSocket2;
            } else {
                long j4 = currentTimeMillis / 1000;
                Long.signum(j4);
                long j5 = currentTimeMillis - (j4 * 1000);
                long j6 = j4 + 2208988800L;
                j3 = currentTimeMillis;
                bArr[40] = (byte) (j6 >> 24);
                bArr[41] = (byte) (j6 >> 16);
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) (j6 >> 8);
                    bArr[43] = (byte) j6;
                    long j7 = (j5 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j7 >> 24);
                    bArr[45] = (byte) (j7 >> 16);
                    bArr[46] = (byte) (j7 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        datagramSocket.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j8 = (elapsedRealtime2 - elapsedRealtime) + j3;
            byte b3 = bArr[0];
            long d3 = d(bArr, 24);
            long d4 = d(bArr, 32);
            long d5 = d(bArr, 40);
            b((byte) ((b3 >> 6) & 3), (byte) (b3 & 7), bArr[1] & 255, d5);
            long j9 = (j8 + (((d5 - j8) + (d4 - d3)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j9;
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
        }
    }

    public static void b(byte b3, byte b4, int i3, long j3) {
        if (b3 != 3) {
            if (b4 != 4 && b4 != 5) {
                throw new IOException(h.k("SNTP: Untrusted mode: ", b4));
            }
            if (i3 != 0 && i3 <= 15) {
                if (j3 != 0) {
                    return;
                }
                throw new IOException("SNTP: Zero transmitTime");
            }
            throw new IOException(h.k("SNTP: Untrusted stratum: ", i3));
        }
        throw new IOException("SNTP: Unsynchronized server");
    }

    public static long c(byte[] bArr, int i3) {
        int i4 = bArr[i3];
        int i5 = bArr[i3 + 1];
        int i6 = bArr[i3 + 2];
        int i7 = bArr[i3 + 3];
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        if ((i6 & 128) == 128) {
            i6 = (i6 & 127) + 128;
        }
        if ((i7 & 128) == 128) {
            i7 = (i7 & 127) + 128;
        }
        return (i4 << 24) + (i5 << 16) + (i6 << 8) + i7;
    }

    public static long d(byte[] bArr, int i3) {
        long c3 = c(bArr, i3);
        long c4 = c(bArr, i3 + 4);
        if (c3 == 0 && c4 == 0) {
            return 0L;
        }
        return ((c4 * 1000) / 4294967296L) + ((c3 - 2208988800L) * 1000);
    }
}
