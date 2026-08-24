package K1;

import java.math.BigDecimal;
/* loaded from: classes.dex */
public final class h extends Number {

    /* renamed from: m  reason: collision with root package name */
    public final String f754m;

    public h(String str) {
        this.f754m = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f754m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        String str = ((h) obj).f754m;
        String str2 = this.f754m;
        if (str2 == str || str2.equals(str)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f754m);
    }

    public final int hashCode() {
        return this.f754m.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f754m;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f754m;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f754m;
    }
}
