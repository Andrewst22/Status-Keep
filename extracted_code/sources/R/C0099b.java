package R;

import java.util.Arrays;
/* renamed from: R.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0099b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0099b f1875c = new C0099b(new C0098a[0]);

    /* renamed from: d  reason: collision with root package name */
    public static final C0098a f1876d;

    /* renamed from: a  reason: collision with root package name */
    public final int f1877a;

    /* renamed from: b  reason: collision with root package name */
    public final C0098a[] f1878b;

    static {
        C0098a c0098a = new C0098a(-1, -1, new int[0], new C0122z[0], new long[0]);
        int[] iArr = c0098a.f1872e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = c0098a.f1873f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        f1876d = new C0098a(0, c0098a.f1869b, copyOf, (C0122z[]) Arrays.copyOf(c0098a.f1871d, 0), copyOf2);
        U.A.H(1);
        U.A.H(2);
        U.A.H(3);
        U.A.H(4);
    }

    public C0099b(C0098a[] c0098aArr) {
        this.f1877a = c0098aArr.length;
        this.f1878b = c0098aArr;
    }

    public final C0098a a(int i3) {
        if (i3 < 0) {
            return f1876d;
        }
        return this.f1878b[i3];
    }

    public final boolean b(int i3) {
        if (i3 == this.f1877a - 1) {
            a(i3).getClass();
            return false;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0099b.class != obj.getClass()) {
            return false;
        }
        C0099b c0099b = (C0099b) obj;
        if (U.A.a(null, null) && this.f1877a == c0099b.f1877a && Arrays.equals(this.f1878b, c0099b.f1878b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1878b) + (((((this.f1877a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i3 = 0;
        while (true) {
            C0098a[] c0098aArr = this.f1878b;
            if (i3 < c0098aArr.length) {
                sb.append("adGroup(timeUs=0, ads=[");
                c0098aArr[i3].getClass();
                for (int i4 = 0; i4 < c0098aArr[i3].f1872e.length; i4++) {
                    sb.append("ad(state=");
                    int i5 = c0098aArr[i3].f1872e[i4];
                    if (i5 != 0) {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 != 3) {
                                    if (i5 != 4) {
                                        sb.append('?');
                                    } else {
                                        sb.append('!');
                                    }
                                } else {
                                    sb.append('P');
                                }
                            } else {
                                sb.append('S');
                            }
                        } else {
                            sb.append('R');
                        }
                    } else {
                        sb.append('_');
                    }
                    sb.append(", durationUs=");
                    sb.append(c0098aArr[i3].f1873f[i4]);
                    sb.append(')');
                    if (i4 < c0098aArr[i3].f1872e.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                if (i3 < c0098aArr.length - 1) {
                    sb.append(", ");
                }
                i3++;
            } else {
                sb.append("])");
                return sb.toString();
            }
        }
    }
}
