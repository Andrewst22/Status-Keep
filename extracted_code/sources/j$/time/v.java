package j$.time;

import j$.time.chrono.AbstractC0335i;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
/* loaded from: classes2.dex */
public final class v implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f6641b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* renamed from: a  reason: collision with root package name */
    private final int f6642a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f6642a - ((v) obj).f6642a;
    }

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.l(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.z.EXCEEDS_PAD);
        pVar.t();
    }

    public static v N(int i3) {
        j$.time.temporal.a.YEAR.O(i3);
        return new v(i3);
    }

    private v(int i3) {
        this.f6642a = i3;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.s sVar) {
        return sVar instanceof j$.time.temporal.a ? sVar == j$.time.temporal.a.YEAR || sVar == j$.time.temporal.a.YEAR_OF_ERA || sVar == j$.time.temporal.a.ERA : sVar != null && sVar.r(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w r(j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.w.j(1L, this.f6642a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.n.d(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int o(j$.time.temporal.s sVar) {
        return r(sVar).a(v(sVar), sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            int i3 = u.f6639a[((j$.time.temporal.a) sVar).ordinal()];
            int i4 = this.f6642a;
            if (i3 == 1) {
                if (i4 < 1) {
                    i4 = 1 - i4;
                }
                return i4;
            } else if (i3 != 2) {
                if (i3 == 3) {
                    return i4 < 1 ? 0 : 1;
                }
                throw new RuntimeException(d.a("Unsupported field: ", sVar));
            } else {
                return i4;
            }
        }
        return sVar.q(this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: Q */
    public final v d(long j3, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
            aVar.O(j3);
            int i3 = u.f6639a[aVar.ordinal()];
            int i4 = this.f6642a;
            if (i3 == 1) {
                if (i4 < 1) {
                    j3 = 1 - j3;
                }
                return N((int) j3);
            } else if (i3 != 2) {
                if (i3 == 3) {
                    return v(j$.time.temporal.a.ERA) == j3 ? this : N(1 - i4);
                }
                throw new RuntimeException(d.a("Unsupported field: ", sVar));
            } else {
                return N((int) j3);
            }
        }
        return (v) sVar.v(this, j3);
    }

    @Override // j$.time.temporal.m
    /* renamed from: O */
    public final v e(long j3, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            int i3 = u.f6640b[((j$.time.temporal.b) uVar).ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 == 5) {
                                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                                return d(j$.com.android.tools.r8.a.h(v(aVar), j3), aVar);
                            }
                            throw new RuntimeException("Unsupported unit: " + uVar);
                        }
                        return P(j$.com.android.tools.r8.a.g(j3, 1000));
                    }
                    return P(j$.com.android.tools.r8.a.g(j3, 100));
                }
                return P(j$.com.android.tools.r8.a.g(j3, 10));
            }
            return P(j3);
        }
        return (v) uVar.m(this, j3);
    }

    public final v P(long j3) {
        return j3 == 0 ? this : N(j$.time.temporal.a.YEAR.N(this.f6642a + j3));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(long j3, j$.time.temporal.b bVar) {
        return j3 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j3, bVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.e()) {
            return j$.time.chrono.t.f6484d;
        }
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.YEARS;
        }
        return j$.time.temporal.n.c(this, tVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        if (!AbstractC0335i.q(mVar).equals(j$.time.chrono.t.f6484d)) {
            throw new RuntimeException("Adjustment only supported on ISO date-time");
        }
        return mVar.d(this.f6642a, j$.time.temporal.a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.f6642a == ((v) obj).f6642a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6642a;
    }

    public final String toString() {
        return Integer.toString(this.f6642a);
    }

    private Object writeReplace() {
        return new t((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void R(DataOutput dataOutput) {
        dataOutput.writeInt(this.f6642a);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m q(g gVar) {
        return (v) AbstractC0335i.a(gVar, this);
    }
}
