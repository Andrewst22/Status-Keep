package Z0;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f3540a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3541b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3542c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3543d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3544e;

    /* renamed from: f  reason: collision with root package name */
    public final g f3545f;

    /* renamed from: g  reason: collision with root package name */
    public final String[] f3546g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3547h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3548i;

    /* renamed from: j  reason: collision with root package name */
    public final c f3549j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap f3550k;

    /* renamed from: l  reason: collision with root package name */
    public final HashMap f3551l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f3552m;

    public c(String str, String str2, long j3, long j4, g gVar, String[] strArr, String str3, String str4, c cVar) {
        boolean z3;
        this.f3540a = str;
        this.f3541b = str2;
        this.f3548i = str4;
        this.f3545f = gVar;
        this.f3546g = strArr;
        if (str2 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f3542c = z3;
        this.f3543d = j3;
        this.f3544e = j4;
        str3.getClass();
        this.f3547h = str3;
        this.f3549j = cVar;
        this.f3550k = new HashMap();
        this.f3551l = new HashMap();
    }

    public static c a(String str) {
        return new c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            T.a aVar = new T.a();
            aVar.f2228a = new SpannableStringBuilder();
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((T.a) treeMap.get(str)).f2228a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final c b(int i3) {
        ArrayList arrayList = this.f3552m;
        if (arrayList != null) {
            return (c) arrayList.get(i3);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f3552m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z3) {
        boolean z4;
        String str = this.f3540a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z3 || equals || (equals2 && this.f3548i != null)) {
            long j3 = this.f3543d;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
            long j4 = this.f3544e;
            if (j4 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j4));
            }
        }
        if (this.f3552m == null) {
            return;
        }
        for (int i3 = 0; i3 < this.f3552m.size(); i3++) {
            c cVar = (c) this.f3552m.get(i3);
            if (!z3 && !equals) {
                z4 = false;
            } else {
                z4 = true;
            }
            cVar.d(treeSet, z4);
        }
    }

    public final boolean f(long j3) {
        long j4 = this.f3544e;
        long j5 = this.f3543d;
        if ((j5 == -9223372036854775807L && j4 == -9223372036854775807L) || ((j5 <= j3 && j4 == -9223372036854775807L) || ((j5 == -9223372036854775807L && j3 < j4) || (j5 <= j3 && j3 < j4)))) {
            return true;
        }
        return false;
    }

    public final void g(long j3, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f3547h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j3) && "div".equals(this.f3540a) && (str2 = this.f3548i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i3 = 0; i3 < c(); i3++) {
            b(i3).g(j3, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02c5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r20, java.util.Map r22, java.util.HashMap r23, java.lang.String r24, java.util.TreeMap r25) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.c.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j3, boolean z3, String str, TreeMap treeMap) {
        String str2;
        boolean z4;
        HashMap hashMap = this.f3550k;
        hashMap.clear();
        HashMap hashMap2 = this.f3551l;
        hashMap2.clear();
        String str3 = this.f3540a;
        if ("metadata".equals(str3)) {
            return;
        }
        String str4 = this.f3547h;
        if ("".equals(str4)) {
            str2 = str;
        } else {
            str2 = str4;
        }
        if (this.f3542c && z3) {
            SpannableStringBuilder e2 = e(str2, treeMap);
            String str5 = this.f3541b;
            str5.getClass();
            e2.append((CharSequence) str5);
        } else if ("br".equals(str3) && z3) {
            e(str2, treeMap).append('\n');
        } else if (f(j3)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                CharSequence charSequence = ((T.a) entry.getValue()).f2228a;
                charSequence.getClass();
                hashMap.put((String) entry.getKey(), Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str3);
            for (int i3 = 0; i3 < c(); i3++) {
                c b3 = b(i3);
                if (!z3 && !equals) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                b3.i(j3, z4, str2, treeMap);
            }
            if (equals) {
                SpannableStringBuilder e3 = e(str2, treeMap);
                int length = e3.length() - 1;
                while (length >= 0 && e3.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && e3.charAt(length) != '\n') {
                    e3.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                CharSequence charSequence2 = ((T.a) entry2.getValue()).f2228a;
                charSequence2.getClass();
                hashMap2.put((String) entry2.getKey(), Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
