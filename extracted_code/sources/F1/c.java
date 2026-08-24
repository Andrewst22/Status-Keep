package F1;
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f371a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d3) {
        boolean z3;
        long j3;
        if (Math.getExponent(d3) > 1023) {
            return false;
        }
        if (d3 != 0.0d) {
            if (Math.getExponent(d3) <= 1023) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                int exponent = Math.getExponent(d3);
                long doubleToRawLongBits = Double.doubleToRawLongBits(d3) & 4503599627370495L;
                if (exponent == -1023) {
                    j3 = doubleToRawLongBits << 1;
                } else {
                    j3 = doubleToRawLongBits | 4503599627370496L;
                }
                if (52 - Long.numberOfTrailingZeros(j3) > Math.getExponent(d3)) {
                    return false;
                }
            } else {
                throw new IllegalArgumentException("not a normal value");
            }
        }
        return true;
    }
}
