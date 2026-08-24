package c1;
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5096a;

    /* renamed from: b  reason: collision with root package name */
    public final U.y f5097b;

    /* renamed from: c  reason: collision with root package name */
    public final U.t f5098c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5099d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5100e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5101f;

    /* renamed from: g  reason: collision with root package name */
    public long f5102g;

    /* renamed from: h  reason: collision with root package name */
    public long f5103h;

    /* renamed from: i  reason: collision with root package name */
    public long f5104i;

    public x(int i3) {
        this.f5096a = i3;
        switch (i3) {
            case 1:
                this.f5097b = new U.y(0L);
                this.f5102g = -9223372036854775807L;
                this.f5103h = -9223372036854775807L;
                this.f5104i = -9223372036854775807L;
                this.f5098c = new U.t();
                return;
            default:
                this.f5097b = new U.y(0L);
                this.f5102g = -9223372036854775807L;
                this.f5103h = -9223372036854775807L;
                this.f5104i = -9223372036854775807L;
                this.f5098c = new U.t();
                return;
        }
    }

    public static int b(byte[] bArr, int i3) {
        return (bArr[i3 + 3] & 255) | ((bArr[i3] & 255) << 24) | ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3 + 2] & 255) << 8);
    }

    public static long c(U.t tVar) {
        int i3 = tVar.f2478b;
        if (tVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        tVar.f(bArr, 0, 9);
        tVar.G(i3);
        byte b3 = bArr[0];
        if ((b3 & 196) == 68) {
            byte b4 = bArr[2];
            if ((b4 & 4) == 4) {
                byte b5 = bArr[4];
                if ((b5 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j3 = b3;
                    long j4 = b4;
                    return ((j4 & 3) << 13) | ((j3 & 3) << 28) | (((56 & j3) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j4 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b5 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(w0.l lVar) {
        switch (this.f5096a) {
            case 0:
                byte[] bArr = U.A.f2410f;
                U.t tVar = this.f5098c;
                tVar.getClass();
                tVar.E(bArr, bArr.length);
                this.f5099d = true;
                lVar.f9610r = 0;
                return;
            default:
                byte[] bArr2 = U.A.f2410f;
                U.t tVar2 = this.f5098c;
                tVar2.getClass();
                tVar2.E(bArr2, bArr2.length);
                this.f5099d = true;
                lVar.f9610r = 0;
                return;
        }
    }
}
