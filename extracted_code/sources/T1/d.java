package T1;

import D2.i;
import N.k;
import U.A;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import g2.g;
import io.flutter.embedding.engine.renderer.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import o2.C0717n;
import s2.C0806e;
import t.C0815g;
import t.h;
import t2.AbstractC0827d;
import t2.AbstractC0828e;
/* loaded from: classes.dex */
public final class d implements T0.d {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f2341m = 1;

    /* renamed from: n  reason: collision with root package name */
    public final Object f2342n;

    /* renamed from: o  reason: collision with root package name */
    public Object f2343o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f2344p;

    /* renamed from: q  reason: collision with root package name */
    public final Object f2345q;

    /* renamed from: r  reason: collision with root package name */
    public final Object f2346r;

    public d(Context context, f fVar) {
        i.e(context, "context");
        i.e(fVar, "manager");
        this.f2342n = context;
        this.f2343o = null;
        this.f2344p = fVar;
        this.f2345q = new C0806e(new C2.a() { // from class: T1.b
            @Override // C2.a
            public final Object c() {
                return d.this.a().getPackageName() + ".flutter.share_provider";
            }
        });
        this.f2346r = new C0806e(new c(0));
    }

    public static String b(String str) {
        if (str != null && J2.i.Q(str, "/")) {
            String substring = str.substring(0, J2.i.U(6, str, "/", false));
            i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return "*";
    }

    @Override // T0.d
    public List A(long j3) {
        Z0.a[] aVarArr;
        Z0.c cVar = (Z0.c) this.f2342n;
        ArrayList arrayList = new ArrayList();
        cVar.g(j3, cVar.f3547h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j3, false, cVar.f3547h, treeMap);
        HashMap hashMap = (HashMap) this.f2345q;
        cVar.h(j3, (Map) this.f2344p, hashMap, cVar.f3547h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) ((HashMap) this.f2346r).get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                Z0.f fVar = (Z0.f) hashMap.get(pair.first);
                fVar.getClass();
                arrayList2.add(new T.b(null, null, null, decodeByteArray, fVar.f3567c, 0, fVar.f3569e, fVar.f3566b, 0, Integer.MIN_VALUE, -3.4028235E38f, fVar.f3570f, fVar.f3571g, false, -16777216, fVar.f3574j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Z0.f fVar2 = (Z0.f) hashMap.get(entry.getKey());
            fVar2.getClass();
            T.a aVar = (T.a) entry.getValue();
            CharSequence charSequence = aVar.f2228a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (Z0.a aVar2 : (Z0.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Z0.a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), (CharSequence) "");
            }
            for (int i3 = 0; i3 < spannableStringBuilder.length(); i3++) {
                if (spannableStringBuilder.charAt(i3) == ' ') {
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (i5 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i5) == ' ') {
                        i5++;
                    }
                    int i6 = i5 - i4;
                    if (i6 > 0) {
                        spannableStringBuilder.delete(i3, i6 + i3);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == '\n') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == ' ') {
                        spannableStringBuilder.delete(i8, i7 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i9 = 0; i9 < spannableStringBuilder.length() - 1; i9++) {
                if (spannableStringBuilder.charAt(i9) == ' ') {
                    int i10 = i9 + 1;
                    if (spannableStringBuilder.charAt(i10) == '\n') {
                        spannableStringBuilder.delete(i9, i10);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            aVar.f2232e = fVar2.f3567c;
            aVar.f2233f = fVar2.f3568d;
            aVar.f2234g = fVar2.f3569e;
            aVar.f2235h = fVar2.f3566b;
            aVar.f2239l = fVar2.f3570f;
            aVar.f2238k = fVar2.f3573i;
            aVar.f2237j = fVar2.f3572h;
            aVar.f2243p = fVar2.f3574j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override // T0.d
    public long F(int i3) {
        return ((long[]) this.f2343o)[i3];
    }

    @Override // T0.d
    public int P() {
        return ((long[]) this.f2343o).length;
    }

    public Context a() {
        W1.d dVar = (W1.d) this.f2343o;
        if (dVar == null) {
            return (Context) this.f2342n;
        }
        return dVar;
    }

    public File c() {
        return new File(a().getCacheDir(), "share_plus");
    }

    public void d(String str, String str2, boolean z3) {
        Intent createChooser;
        i.e(str, "text");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        if (str2 != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str2);
        }
        if (z3) {
            Context context = (Context) this.f2342n;
            createChooser = Intent.createChooser(intent, null, PendingIntent.getBroadcast(context, 0, new Intent(context, SharePlusPendingIntent.class), ((Number) ((C0806e) this.f2346r).a()).intValue() | 134217728).getIntentSender());
        } else {
            createChooser = Intent.createChooser(intent, null);
        }
        i.b(createChooser);
        f(createChooser, z3);
    }

    public void e(List list, List list2, String str, String str2, boolean z3) {
        boolean z4;
        Intent createChooser;
        boolean z5;
        boolean z6;
        boolean z7;
        String substring;
        File c3 = c();
        File[] listFiles = c3.listFiles();
        if (c3.exists() && listFiles != null && listFiles.length != 0) {
            for (File file : listFiles) {
                file.delete();
            }
            c3.delete();
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
        Iterator it = list.iterator();
        while (true) {
            Map.Entry entry = null;
            if (it.hasNext()) {
                File file2 = new File((String) it.next());
                try {
                    String canonicalPath = file2.getCanonicalPath();
                    i.b(canonicalPath);
                    String canonicalPath2 = c().getCanonicalPath();
                    i.d(canonicalPath2, "getCanonicalPath(...)");
                    z7 = canonicalPath.startsWith(canonicalPath2);
                } catch (IOException unused) {
                    z7 = false;
                }
                if (!z7) {
                    File c4 = c();
                    if (!c4.exists()) {
                        c4.mkdirs();
                    }
                    File file3 = new File(c4, file2.getName());
                    if (file2.exists()) {
                        if (file3.exists() && !file3.delete()) {
                            throw new A2.b(file2, file3, "Tried to overwrite the destination, but failed to delete it.");
                        }
                        if (file2.isDirectory()) {
                            if (!file3.mkdirs()) {
                                throw new A2.b(file2, file3, "Failed to create target directory.");
                            }
                        } else {
                            File parentFile = file3.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                            FileInputStream fileInputStream = new FileInputStream(file2);
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                byte[] bArr = new byte[8192];
                                for (int read = fileInputStream.read(bArr); read >= 0; read = fileInputStream.read(bArr)) {
                                    fileOutputStream.write(bArr, 0, read);
                                }
                                android.support.v4.media.session.a.j(fileOutputStream, null);
                                android.support.v4.media.session.a.j(fileInputStream, null);
                            } finally {
                            }
                        }
                        C0815g c5 = h.c(a(), (String) ((C0806e) this.f2345q).a());
                        try {
                            String canonicalPath3 = file3.getCanonicalPath();
                            for (Map.Entry entry2 : c5.f9231b.entrySet()) {
                                String path = ((File) entry2.getValue()).getPath();
                                if (C0815g.a(canonicalPath3, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                                    entry = entry2;
                                }
                            }
                            if (entry != null) {
                                String path2 = ((File) entry.getValue()).getPath();
                                if (path2.endsWith("/")) {
                                    substring = canonicalPath3.substring(path2.length());
                                } else {
                                    substring = canonicalPath3.substring(path2.length() + 1);
                                }
                                arrayList.add(new Uri.Builder().scheme("content").authority(c5.f9230a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(substring, "/")).build());
                            } else {
                                throw new IllegalArgumentException(D2.h.l("Failed to find configured root that contains ", canonicalPath3));
                            }
                        } catch (IOException unused2) {
                            throw new IllegalArgumentException("Failed to resolve canonical path for " + file3);
                        }
                    } else {
                        throw new A2.b(file2, null, "The source file doesn't exist.");
                    }
                } else {
                    throw new IOException("Shared file can not be located in '" + c().getCanonicalPath() + '\'');
                }
            } else {
                Intent intent = new Intent();
                if (arrayList.isEmpty()) {
                    if (str != null && !J2.i.W(str)) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (!z6) {
                        d(str, str2, z3);
                        return;
                    }
                }
                String str3 = "*/*";
                if (arrayList.size() == 1) {
                    if (list2 != null && !list2.isEmpty()) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (!z5) {
                        str3 = (String) AbstractC0827d.D(list2);
                    }
                    intent.setAction("android.intent.action.SEND");
                    intent.setType(str3);
                    intent.putExtra("android.intent.extra.STREAM", (Parcelable) AbstractC0827d.D(arrayList));
                } else {
                    intent.setAction("android.intent.action.SEND_MULTIPLE");
                    if (list2 != null) {
                        z4 = list2.isEmpty();
                    } else {
                        z4 = true;
                    }
                    if (!z4) {
                        i.b(list2);
                        if (list2.size() == 1) {
                            str3 = (String) AbstractC0827d.D(list2);
                        } else {
                            String str4 = (String) AbstractC0827d.D(list2);
                            int B3 = AbstractC0828e.B(list2);
                            if (1 <= B3) {
                                int i3 = 1;
                                while (true) {
                                    if (!i.a(str4, list2.get(i3))) {
                                        if (!b(str4).equals(b((String) list2.get(i3)))) {
                                            break;
                                        }
                                        str4 = b((String) list2.get(i3)).concat("/*");
                                    }
                                    if (i3 == B3) {
                                        break;
                                    }
                                    i3++;
                                }
                            }
                            str3 = str4;
                        }
                    }
                    intent.setType(str3);
                    intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                }
                if (str != null) {
                    intent.putExtra("android.intent.extra.TEXT", str);
                }
                if (str2 != null) {
                    intent.putExtra("android.intent.extra.SUBJECT", str2);
                }
                intent.addFlags(1);
                if (z3) {
                    Context context = (Context) this.f2342n;
                    createChooser = Intent.createChooser(intent, null, PendingIntent.getBroadcast(context, 0, new Intent(context, SharePlusPendingIntent.class), ((Number) ((C0806e) this.f2346r).a()).intValue() | 134217728).getIntentSender());
                } else {
                    createChooser = Intent.createChooser(intent, null);
                }
                List<ResolveInfo> queryIntentActivities = a().getPackageManager().queryIntentActivities(createChooser, 65536);
                i.d(queryIntentActivities, "queryIntentActivities(...)");
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    String str5 = resolveInfo.activityInfo.packageName;
                    Iterator<? extends Parcelable> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        a().grantUriPermission(str5, (Uri) it2.next(), 3);
                    }
                }
                i.b(createChooser);
                f(createChooser, z3);
                return;
            }
        }
    }

    public void f(Intent intent, boolean z3) {
        R1.f fVar;
        W1.d dVar = (W1.d) this.f2343o;
        if (dVar != null) {
            if (z3) {
                dVar.startActivityForResult(intent, 22643);
                return;
            } else {
                dVar.startActivity(intent);
                return;
            }
        }
        intent.addFlags(268435456);
        if (z3) {
            f fVar2 = (f) this.f2344p;
            if (fVar2.f2351n.compareAndSet(false, true) && (fVar = fVar2.f2350m) != null) {
                fVar.b("dev.fluttercommunity.plus/share/unavailable");
                fVar2.f2350m = null;
            }
        }
        ((Context) this.f2342n).startActivity(intent);
    }

    @Override // T0.d
    public int g(long j3) {
        long[] jArr = (long[]) this.f2343o;
        int b3 = A.b(jArr, j3, false);
        if (b3 >= jArr.length) {
            return -1;
        }
        return b3;
    }

    public String toString() {
        switch (this.f2341m) {
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f2342n) + ", mProviderPackage: " + ((String) this.f2343o) + ", mQuery: " + ((String) this.f2344p) + ", mCertificates:");
                int i3 = 0;
                while (true) {
                    List list = (List) this.f2345q;
                    if (i3 < list.size()) {
                        sb.append(" [");
                        List list2 = (List) list.get(i3);
                        for (int i4 = 0; i4 < list2.size(); i4++) {
                            sb.append(" \"");
                            sb.append(Base64.encodeToString((byte[]) list2.get(i4), 0));
                            sb.append("\"");
                        }
                        sb.append(" ]");
                        i3++;
                    } else {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                }
            default:
                return super.toString();
        }
    }

    public d(Z0.c cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f2342n = cVar;
        this.f2345q = hashMap2;
        this.f2346r = hashMap3;
        this.f2344p = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i3 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i3] = ((Long) it.next()).longValue();
            i3++;
        }
        this.f2343o = jArr;
    }

    public d(String str, String str2, String str3, List list) {
        this.f2342n = str;
        this.f2343o = str2;
        this.f2344p = str3;
        list.getClass();
        this.f2345q = list;
        this.f2346r = str + "-" + str2 + "-" + str3;
    }

    public d(Context context, g gVar, C0717n c0717n, C0717n c0717n2, l lVar) {
        this.f2342n = context;
        this.f2343o = gVar;
        this.f2344p = c0717n;
        this.f2345q = c0717n2;
        this.f2346r = lVar;
    }
}
