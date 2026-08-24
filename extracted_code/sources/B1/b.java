package B1;

import C.C0002c;
import D1.G;
import D1.I;
import D1.b0;
import D2.h;
import J2.i;
import K.C0059m;
import K1.m;
import K1.n;
import N.k;
import R.C0113p;
import R0.g;
import T0.j;
import T2.l;
import U.A;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import b1.C0211a;
import d0.f;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import s0.p;
import w0.InterfaceC0890A;
import w0.s;
/* loaded from: classes.dex */
public final class b implements n, g, j, p, d0.g {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f52m;

    public /* synthetic */ b(int i3) {
        this.f52m = i3;
    }

    public static final boolean m(l lVar) {
        l lVar2 = U2.d.f2589c;
        return !i.R(lVar.b(), ".class", true);
    }

    public static void n(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] o(I i3, long j3) {
        C0002c c0002c = new C0002c(6);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i3.size());
        for (Object obj : i3) {
            arrayList.add((Bundle) c0002c.apply(obj));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j3);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static a p(Context context, String[] strArr, String str, e eVar) {
        String[] t3 = t(context);
        int length = t3.length;
        int i3 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i3 >= length) {
                return null;
            }
            String str2 = t3[i3];
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i4 = i5;
                }
            }
            if (zipFile != null) {
                int i6 = 0;
                while (true) {
                    int i7 = i6 + 1;
                    if (i6 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c3 = File.separatorChar;
                            sb.append(c3);
                            sb.append(str3);
                            sb.append(c3);
                            sb.append(str);
                            String sb2 = sb.toString();
                            eVar.getClass();
                            e.l0("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                a aVar = new a(0, false);
                                aVar.f50n = zipFile;
                                aVar.f51o = entry;
                                return aVar;
                            }
                        }
                        i6 = i7;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i3++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T2.a, java.lang.Object] */
    public static l q(String str, boolean z3) {
        D2.i.e(str, "<this>");
        T2.b bVar = U2.b.f2582a;
        ?? obj = new Object();
        obj.p(str);
        return U2.b.d(obj, z3);
    }

    public static l r(File file) {
        String str = l.f2379n;
        String file2 = file.toString();
        D2.i.d(file2, "toString()");
        return q(file2, false);
    }

    public static String[] s(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c3 = File.separatorChar;
        sb.append(c3);
        sb.append("([^\\");
        sb.append(c3);
        sb.append("]*)");
        sb.append(c3);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : t(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static String[] t(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null && strArr.length != 0) {
            String[] strArr2 = new String[strArr.length + 1];
            strArr2[0] = applicationInfo.sourceDir;
            System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
            return strArr2;
        }
        return new String[]{applicationInfo.sourceDir};
    }

    @Override // K1.n
    public Object K() {
        switch (this.f52m) {
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return new ConcurrentHashMap();
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return new TreeMap();
            case k.LONG_FIELD_NUMBER /* 4 */:
                return new LinkedHashMap();
            case k.STRING_FIELD_NUMBER /* 5 */:
                return new m();
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new TreeSet();
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                return new LinkedHashSet();
            case k.BYTES_FIELD_NUMBER /* 8 */:
                return new ArrayDeque();
            case 9:
                return new ArrayList();
            default:
                return new ConcurrentSkipListMap();
        }
    }

    @Override // d0.g
    public /* synthetic */ f a(d0.d dVar, C0113p c0113p) {
        return f.f5151a;
    }

    @Override // R0.g
    public long b(w0.l lVar) {
        return -1L;
    }

    @Override // d0.g
    public int c(C0113p c0113p) {
        if (c0113p.f1978q != null) {
            return 1;
        }
        return 0;
    }

    @Override // T0.j
    public int e(C0113p c0113p) {
        switch (this.f52m) {
            case 18:
                String str = c0113p.f1974m;
                if (str != null) {
                    char c3 = 65535;
                    switch (str.hashCode()) {
                        case -1351681404:
                            if (str.equals("application/dvbsubs")) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case -1248334819:
                            if (str.equals("application/pgs")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case -1026075066:
                            if (str.equals("application/x-mp4-vtt")) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case -1004728940:
                            if (str.equals("text/vtt")) {
                                c3 = 3;
                                break;
                            }
                            break;
                        case 691401887:
                            if (str.equals("application/x-quicktime-tx3g")) {
                                c3 = 4;
                                break;
                            }
                            break;
                        case 822864842:
                            if (str.equals("text/x-ssa")) {
                                c3 = 5;
                                break;
                            }
                            break;
                        case 1668750253:
                            if (str.equals("application/x-subrip")) {
                                c3 = 6;
                                break;
                            }
                            break;
                        case 1693976202:
                            if (str.equals("application/ttml+xml")) {
                                c3 = 7;
                                break;
                            }
                            break;
                    }
                    switch (c3) {
                        case 0:
                        case 1:
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            return 2;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                        case k.STRING_FIELD_NUMBER /* 5 */:
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            return 1;
                    }
                }
                throw new IllegalArgumentException(h.l("Unsupported MIME type: ", str));
            default:
                return 1;
        }
    }

    @Override // R0.g
    public InterfaceC0890A f() {
        return new s(-9223372036854775807L);
    }

    @Override // T0.j
    public boolean g(C0113p c0113p) {
        switch (this.f52m) {
            case 18:
                String str = c0113p.f1974m;
                if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    @Override // d0.g
    public C1.j h(d0.d dVar, C0113p c0113p) {
        if (c0113p.f1978q == null) {
            return null;
        }
        return new C1.j(new d0.b(new Exception(), 6001), 29);
    }

    @Override // d0.g
    public /* synthetic */ void i() {
    }

    @Override // s0.p
    public Object k(Uri uri, W.j jVar) {
        return Long.valueOf(A.P(new BufferedReader(new InputStreamReader(jVar)).readLine()));
    }

    @Override // T0.j
    public T0.l l(C0113p c0113p) {
        T0.l hVar;
        switch (this.f52m) {
            case 18:
                String str = c0113p.f1974m;
                if (str != null) {
                    List list = c0113p.f1977p;
                    char c3 = 65535;
                    switch (str.hashCode()) {
                        case -1351681404:
                            if (str.equals("application/dvbsubs")) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case -1248334819:
                            if (str.equals("application/pgs")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case -1026075066:
                            if (str.equals("application/x-mp4-vtt")) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case -1004728940:
                            if (str.equals("text/vtt")) {
                                c3 = 3;
                                break;
                            }
                            break;
                        case 691401887:
                            if (str.equals("application/x-quicktime-tx3g")) {
                                c3 = 4;
                                break;
                            }
                            break;
                        case 822864842:
                            if (str.equals("text/x-ssa")) {
                                c3 = 5;
                                break;
                            }
                            break;
                        case 1668750253:
                            if (str.equals("application/x-subrip")) {
                                c3 = 6;
                                break;
                            }
                            break;
                        case 1693976202:
                            if (str.equals("application/ttml+xml")) {
                                c3 = 7;
                                break;
                            }
                            break;
                    }
                    switch (c3) {
                        case 0:
                            hVar = new V0.h(list);
                            return hVar;
                        case 1:
                            return new C0059m(2);
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            return new C0211a(0);
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            return new a(17);
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            hVar = new a1.a(list);
                            return hVar;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            hVar = new X0.a(list);
                            return hVar;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            return new Y0.a();
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            return new Z0.e();
                    }
                }
                throw new IllegalArgumentException(h.l("Unsupported MIME type: ", str));
            default:
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
        }
    }

    @Override // d0.g
    public /* synthetic */ void release() {
    }

    public b(Context context) {
        this.f52m = 24;
        context.getApplicationContext();
    }

    public b() {
        this.f52m = 13;
        G g3 = I.f197n;
        b0 b0Var = b0.f231q;
    }

    @Override // R0.g
    public void j(long j3) {
    }

    @Override // d0.g
    public void d(Looper looper, Z.m mVar) {
    }
}
