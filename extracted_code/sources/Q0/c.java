package Q0;
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f1528m = 1;

    /* renamed from: n  reason: collision with root package name */
    public int f1529n;

    public /* synthetic */ c() {
    }

    public static String b(int i3) {
        return "" + ((char) ((i3 >> 24) & 255)) + ((char) ((i3 >> 16) & 255)) + ((char) ((i3 >> 8) & 255)) + ((char) (i3 & 255));
    }

    public static int d(int i3) {
        return (i3 >> 24) & 255;
    }

    public void a(int i3) {
        this.f1529n = i3 | this.f1529n;
    }

    public boolean c(int i3) {
        if ((this.f1529n & i3) == i3) {
            return true;
        }
        return false;
    }

    public String toString() {
        switch (this.f1528m) {
            case 0:
                return b(this.f1529n);
            default:
                return super.toString();
        }
    }

    public c(int i3) {
        this.f1529n = i3;
    }
}
