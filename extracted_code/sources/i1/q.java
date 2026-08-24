package I1;

import java.io.Serializable;
import java.math.BigInteger;
/* loaded from: classes.dex */
public final class q extends m {

    /* renamed from: m  reason: collision with root package name */
    public final Serializable f477m;

    public q(Boolean bool) {
        bool.getClass();
        this.f477m = bool;
    }

    public static boolean e(q qVar) {
        Serializable serializable = qVar.f477m;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        if (!(number instanceof BigInteger) && !(number instanceof Long) && !(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            return false;
        }
        return true;
    }

    @Override // I1.m
    public final boolean a() {
        Serializable serializable = this.f477m;
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).booleanValue();
        }
        return Boolean.parseBoolean(c());
    }

    @Override // I1.m
    public final String c() {
        Serializable serializable = this.f477m;
        if (serializable instanceof Number) {
            return d().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        return (String) serializable;
    }

    public final Number d() {
        Serializable serializable = this.f477m;
        if (serializable instanceof String) {
            return new K1.h((String) serializable);
        }
        return (Number) serializable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        Serializable serializable = this.f477m;
        Serializable serializable2 = qVar.f477m;
        if (serializable == null) {
            if (serializable2 == null) {
                return true;
            }
            return false;
        } else if (e(this) && e(qVar)) {
            if (d().longValue() == qVar.d().longValue()) {
                return true;
            }
            return false;
        } else if ((serializable instanceof Number) && (serializable2 instanceof Number)) {
            double doubleValue = d().doubleValue();
            double doubleValue2 = qVar.d().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2)) {
                return true;
            }
            return false;
        } else {
            return serializable.equals(serializable2);
        }
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f477m;
        if (serializable == null) {
            return 31;
        }
        if (e(this)) {
            doubleToLongBits = d().longValue();
        } else if (serializable instanceof Number) {
            doubleToLongBits = Double.doubleToLongBits(d().doubleValue());
        } else {
            return serializable.hashCode();
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public q(Number number) {
        number.getClass();
        this.f477m = number;
    }

    public q(String str) {
        str.getClass();
        this.f477m = str;
    }
}
