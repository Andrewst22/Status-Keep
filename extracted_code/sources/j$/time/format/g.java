package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class g extends i {

    /* renamed from: g  reason: collision with root package name */
    private final boolean f6517g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(j$.time.temporal.s sVar, int i3, int i4, boolean z3, int i5) {
        super(sVar, i3, i4, z.NOT_NEGATIVE, i5);
        this.f6517g = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, j$.time.temporal.s] */
    @Override // j$.time.format.i
    public final i c() {
        if (this.f6523e == -1) {
            return this;
        }
        return new g(this.f6519a, this.f6520b, this.f6521c, this.f6517g, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, j$.time.temporal.s] */
    @Override // j$.time.format.i
    public final i d(int i3) {
        return new g(this.f6519a, this.f6520b, this.f6521c, this.f6517g, this.f6523e + i3);
    }

    @Override // j$.time.format.i
    final boolean b(q qVar) {
        return qVar.k() && this.f6520b == this.f6521c && !this.f6517g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j$.time.temporal.s] */
    @Override // j$.time.format.i, j$.time.format.f
    public final boolean m(t tVar, StringBuilder sb) {
        ?? r02 = this.f6519a;
        Long e2 = tVar.e(r02);
        if (e2 == null) {
            return false;
        }
        w b3 = tVar.b();
        long longValue = e2.longValue();
        j$.time.temporal.w m3 = r02.m();
        m3.b(longValue, r02);
        BigDecimal valueOf = BigDecimal.valueOf(m3.e());
        BigDecimal add = BigDecimal.valueOf(m3.d()).subtract(valueOf).add(BigDecimal.ONE);
        BigDecimal subtract = BigDecimal.valueOf(longValue).subtract(valueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal divide = subtract.divide(add, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (divide.compareTo(bigDecimal) != 0) {
            bigDecimal = divide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : divide.stripTrailingZeros();
        }
        int scale = bigDecimal.scale();
        boolean z3 = this.f6517g;
        int i3 = this.f6520b;
        if (scale != 0) {
            String substring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i3), this.f6521c), roundingMode).toPlainString().substring(2);
            b3.getClass();
            if (z3) {
                sb.append('.');
            }
            sb.append(substring);
            return true;
        } else if (i3 > 0) {
            if (z3) {
                b3.getClass();
                sb.append('.');
            }
            for (int i4 = 0; i4 < i3; i4++) {
                b3.getClass();
                sb.append('0');
            }
            return true;
        } else {
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, j$.time.temporal.s] */
    @Override // j$.time.format.i, j$.time.format.f
    public final int o(q qVar, CharSequence charSequence, int i3) {
        int i4 = (qVar.k() || b(qVar)) ? this.f6520b : 0;
        int i5 = (qVar.k() || b(qVar)) ? this.f6521c : 9;
        int length = charSequence.length();
        if (i3 == length) {
            return i4 > 0 ? ~i3 : i3;
        }
        if (this.f6517g) {
            char charAt = charSequence.charAt(i3);
            qVar.f().getClass();
            if (charAt != '.') {
                return i4 > 0 ? ~i3 : i3;
            }
            i3++;
        }
        int i6 = i3;
        int i7 = i4 + i6;
        if (i7 > length) {
            return ~i6;
        }
        int min = Math.min(i5 + i6, length);
        int i8 = i6;
        int i9 = 0;
        while (true) {
            if (i8 >= min) {
                break;
            }
            int i10 = i8 + 1;
            int a3 = qVar.f().a(charSequence.charAt(i8));
            if (a3 >= 0) {
                i9 = (i9 * 10) + a3;
                i8 = i10;
            } else if (i10 < i7) {
                return ~i6;
            }
        }
        BigDecimal movePointLeft = new BigDecimal(i9).movePointLeft(i8 - i6);
        ?? r5 = this.f6519a;
        j$.time.temporal.w m3 = r5.m();
        BigDecimal valueOf = BigDecimal.valueOf(m3.e());
        return qVar.n(r5, movePointLeft.multiply(BigDecimal.valueOf(m3.d()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact(), i6, i8);
    }

    @Override // j$.time.format.i
    public final String toString() {
        String str = this.f6517g ? ",DecimalPoint" : "";
        return "Fraction(" + this.f6519a + "," + this.f6520b + "," + this.f6521c + str + ")";
    }
}
