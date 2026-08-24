package K0;

import D1.I;
import D1.b0;
import R.B;
import U.A;
import U.AbstractC0123a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new G0.a(16);

    /* renamed from: n  reason: collision with root package name */
    public final String f733n;

    /* renamed from: o  reason: collision with root package name */
    public final I f734o;

    public n(String str, String str2, b0 b0Var) {
        super(str);
        AbstractC0123a.e(!b0Var.isEmpty());
        this.f733n = str2;
        I j3 = I.j(b0Var);
        this.f734o = j3;
        String str3 = (String) j3.get(0);
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // K0.i, R.E
    public final void a(B b3) {
        char c3;
        Integer num;
        int i3;
        byte b4;
        Long valueOf;
        byte b5;
        Integer num2;
        byte b6 = 10;
        String str = this.f721m;
        str.getClass();
        I i4 = this.f734o;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c3 = '\n';
                    break;
                }
                c3 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c3 = 11;
                    break;
                }
                c3 = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c3 = '\f';
                    break;
                }
                c3 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c3 = '\r';
                    break;
                }
                c3 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c3 = 14;
                    break;
                }
                c3 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c3 = 15;
                    break;
                }
                c3 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c3 = 16;
                    break;
                }
                c3 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c3 = 17;
                    break;
                }
                c3 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c3 = 18;
                    break;
                }
                c3 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c3 = 19;
                    break;
                }
                c3 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c3 = 20;
                    break;
                }
                c3 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c3 = 21;
                    break;
                }
                c3 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c3 = 22;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        try {
            switch (c3) {
                case 0:
                case '\n':
                    b3.f1724c = (CharSequence) i4.get(0);
                    return;
                case 1:
                case 11:
                    b3.f1740s = (CharSequence) i4.get(0);
                    return;
                case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                case '\r':
                    String str2 = (String) i4.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    b3.d(Integer.valueOf(parseInt));
                    b3.c(Integer.valueOf(parseInt2));
                    return;
                case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                case 18:
                    b3.f1723b = (CharSequence) i4.get(0);
                    return;
                case N.k.LONG_FIELD_NUMBER /* 4 */:
                case 19:
                    b3.f1725d = (CharSequence) i4.get(0);
                    return;
                case N.k.STRING_FIELD_NUMBER /* 5 */:
                case 20:
                    b3.f1741t = (CharSequence) i4.get(0);
                    return;
                case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                case 21:
                    String[] W2 = A.W((String) i4.get(0), "/");
                    int parseInt3 = Integer.parseInt(W2[0]);
                    if (W2.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(W2[1]));
                    } else {
                        num = null;
                    }
                    b3.f1729h = Integer.valueOf(parseInt3);
                    b3.f1730i = num;
                    return;
                case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                case 17:
                    b3.f1722a = (CharSequence) i4.get(0);
                    return;
                case N.k.BYTES_FIELD_NUMBER /* 8 */:
                case 16:
                    b3.f1739r = (CharSequence) i4.get(0);
                    return;
                case '\t':
                case 22:
                    b3.e(Integer.valueOf(Integer.parseInt((String) i4.get(0))));
                    return;
                case '\f':
                    String str3 = (String) i4.get(0);
                    str3.getClass();
                    if (!str3.isEmpty()) {
                        if (str3.charAt(0) == '-') {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        if (i3 != str3.length()) {
                            int i5 = i3 + 1;
                            char charAt = str3.charAt(i3);
                            if (charAt < 128) {
                                b4 = G1.c.f384a[charAt];
                            } else {
                                byte[] bArr = G1.c.f384a;
                                b4 = -1;
                            }
                            if (b4 >= 0 && b4 < 10) {
                                long j3 = -b4;
                                long j4 = 10;
                                long j5 = Long.MIN_VALUE / j4;
                                while (true) {
                                    if (i5 < str3.length()) {
                                        int i6 = i5 + 1;
                                        char charAt2 = str3.charAt(i5);
                                        if (charAt2 < 128) {
                                            b5 = G1.c.f384a[charAt2];
                                        } else {
                                            byte[] bArr2 = G1.c.f384a;
                                            b5 = -1;
                                        }
                                        if (b5 >= 0 && b5 < b6 && j3 >= j5) {
                                            long j6 = j3 * j4;
                                            long j7 = b5;
                                            if (j6 >= j7 - Long.MIN_VALUE) {
                                                j3 = j6 - j7;
                                                i5 = i6;
                                                b6 = 10;
                                            }
                                        }
                                    } else if (i3 != 0) {
                                        valueOf = Long.valueOf(j3);
                                    } else if (j3 != Long.MIN_VALUE) {
                                        valueOf = Long.valueOf(-j3);
                                    }
                                }
                            }
                        }
                    }
                    valueOf = null;
                    if (valueOf != null && valueOf.longValue() == valueOf.intValue()) {
                        num2 = Integer.valueOf(valueOf.intValue());
                    } else {
                        num2 = null;
                    }
                    if (num2 == null) {
                        b3.b((CharSequence) i4.get(0));
                        return;
                    }
                    String a3 = j.a(num2.intValue());
                    if (a3 != null) {
                        b3.b(a3);
                        return;
                    }
                    return;
                case 14:
                    ArrayList d3 = d((String) i4.get(0));
                    int size = d3.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                b3.c((Integer) d3.get(2));
                            } else {
                                return;
                            }
                        }
                        b3.d((Integer) d3.get(1));
                    }
                    b3.e((Integer) d3.get(0));
                    return;
                case 15:
                    ArrayList d4 = d((String) i4.get(0));
                    int size2 = d4.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                b3.f1738q = (Integer) d4.get(2);
                            } else {
                                return;
                            }
                        }
                        b3.f1737p = (Integer) d4.get(1);
                    }
                    b3.f1736o = (Integer) d4.get(0);
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (A.a(this.f721m, nVar.f721m) && A.a(this.f733n, nVar.f733n) && this.f734o.equals(nVar.f734o)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int hashCode = (this.f721m.hashCode() + 527) * 31;
        String str = this.f733n;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        return this.f734o.hashCode() + ((hashCode + i3) * 31);
    }

    @Override // K0.i
    public final String toString() {
        return this.f721m + ": description=" + this.f733n + ": values=" + this.f734o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f721m);
        parcel.writeString(this.f733n);
        parcel.writeStringArray((String[]) this.f734o.toArray(new String[0]));
    }
}
