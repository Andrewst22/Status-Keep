package j$.time.format;

import j$.time.ZoneId;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class n implements f {

    /* renamed from: c  reason: collision with root package name */
    private static volatile AbstractMap.SimpleImmutableEntry f6536c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile AbstractMap.SimpleImmutableEntry f6537d;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6538a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f6539b;

    public /* synthetic */ n(int i3, Object obj) {
        this.f6538a = i3;
        this.f6539b = obj;
    }

    @Override // j$.time.format.f
    public final boolean m(t tVar, StringBuilder sb) {
        switch (this.f6538a) {
            case 0:
                sb.append((String) this.f6539b);
                return true;
            default:
                ZoneId zoneId = (ZoneId) tVar.f((C0338a) this.f6539b);
                if (zoneId == null) {
                    return false;
                }
                sb.append(zoneId.l());
                return true;
        }
    }

    @Override // j$.time.format.f
    public final int o(q qVar, CharSequence charSequence, int i3) {
        int i4;
        switch (this.f6538a) {
            case 0:
                if (i3 > charSequence.length() || i3 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                String str = (String) this.f6539b;
                return !qVar.r(charSequence, i3, str, 0, str.length()) ? ~i3 : str.length() + i3;
            default:
                int length = charSequence.length();
                if (i3 <= length) {
                    if (i3 != length) {
                        char charAt = charSequence.charAt(i3);
                        if (charAt != '+' && charAt != '-') {
                            int i5 = i3 + 2;
                            if (length >= i5) {
                                char charAt2 = charSequence.charAt(i3 + 1);
                                if (qVar.a(charAt, 'U') && qVar.a(charAt2, 'T')) {
                                    int i6 = i3 + 3;
                                    if (length >= i6 && qVar.a(charSequence.charAt(i5), 'C')) {
                                        return a(qVar, charSequence, i3, i6, j.f6526f);
                                    }
                                    return a(qVar, charSequence, i3, i5, j.f6526f);
                                } else if (qVar.a(charAt, 'G') && length >= (i4 = i3 + 3) && qVar.a(charAt2, 'M') && qVar.a(charSequence.charAt(i5), 'T')) {
                                    int i7 = i3 + 4;
                                    if (length >= i7 && qVar.a(charSequence.charAt(i4), '0')) {
                                        qVar.m(ZoneId.of("GMT0"));
                                        return i7;
                                    }
                                    return a(qVar, charSequence, i3, i4, j.f6526f);
                                }
                            }
                            Set a3 = j$.time.zone.j.a();
                            int size = a3.size();
                            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = qVar.j() ? f6536c : f6537d;
                            if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                                synchronized (this) {
                                    try {
                                        simpleImmutableEntry = qVar.j() ? f6536c : f6537d;
                                        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                                            simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), l.e(a3, qVar));
                                            if (qVar.j()) {
                                                f6536c = simpleImmutableEntry;
                                            } else {
                                                f6537d = simpleImmutableEntry;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                            ParsePosition parsePosition = new ParsePosition(i3);
                            String c3 = ((l) simpleImmutableEntry.getValue()).c(charSequence, parsePosition);
                            if (c3 == null) {
                                if (qVar.a(charAt, 'Z')) {
                                    qVar.m(j$.time.y.f6649f);
                                    return i3 + 1;
                                }
                            } else {
                                qVar.m(ZoneId.of(c3));
                                return parsePosition.getIndex();
                            }
                        } else {
                            return a(qVar, charSequence, i3, i3, j.f6525e);
                        }
                    }
                    return ~i3;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    private static int a(q qVar, CharSequence charSequence, int i3, int i4, j jVar) {
        String upperCase = charSequence.subSequence(i3, i4).toString().toUpperCase();
        if (i4 >= charSequence.length()) {
            qVar.m(ZoneId.of(upperCase));
            return i4;
        } else if (charSequence.charAt(i4) == '0' || qVar.a(charSequence.charAt(i4), 'Z')) {
            qVar.m(ZoneId.of(upperCase));
            return i4;
        } else {
            q c3 = qVar.c();
            int o3 = jVar.o(c3, charSequence, i4);
            try {
                if (o3 < 0) {
                    if (jVar == j.f6525e) {
                        return ~i3;
                    }
                    qVar.m(ZoneId.of(upperCase));
                    return i4;
                }
                qVar.m(ZoneId.P(upperCase, j$.time.y.W((int) c3.i(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
                return o3;
            } catch (j$.time.c unused) {
                return ~i3;
            }
        }
    }

    public final String toString() {
        switch (this.f6538a) {
            case 0:
                String replace = ((String) this.f6539b).replace("'", "''");
                return "'" + replace + "'";
            default:
                return "ZoneRegionId()";
        }
    }
}
