package s;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
/* renamed from: s.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0769A {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f9034a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9035b;

    /* renamed from: c  reason: collision with root package name */
    public final U f9036c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f9037d = new Bundle();

    /* renamed from: e  reason: collision with root package name */
    public String f9038e;

    /* renamed from: f  reason: collision with root package name */
    public Uri f9039f;

    public C0769A(CharSequence charSequence, long j3, U u3) {
        this.f9034a = charSequence;
        this.f9035b = j3;
        this.f9036c = u3;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0769A c0769a = (C0769A) arrayList.get(i3);
            c0769a.getClass();
            Bundle bundle = new Bundle();
            CharSequence charSequence = c0769a.f9034a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", c0769a.f9035b);
            U u3 = c0769a.f9036c;
            if (u3 != null) {
                bundle.putCharSequence("sender", u3.f9071a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", z.a(T.b(u3)));
                } else {
                    bundle.putBundle("person", u3.b());
                }
            }
            String str = c0769a.f9038e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = c0769a.f9039f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = c0769a.f9037d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i3] = bundle;
        }
        return bundleArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
        r0.add(r12);
     */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, s.U] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList b(android.os.Parcelable[] r14) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r14.length
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L8:
            int r3 = r14.length
            if (r2 >= r3) goto Lba
            r3 = r14[r2]
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto Lb6
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r4 = "extras"
            java.lang.String r5 = "uri"
            java.lang.String r6 = "type"
            java.lang.String r7 = "sender"
            java.lang.String r8 = "sender_person"
            java.lang.String r9 = "person"
            java.lang.String r10 = "time"
            java.lang.String r11 = "text"
            r12 = 0
            boolean r13 = r3.containsKey(r11)     // Catch: java.lang.ClassCastException -> L77
            if (r13 == 0) goto Lb1
            boolean r13 = r3.containsKey(r10)     // Catch: java.lang.ClassCastException -> L77
            if (r13 != 0) goto L32
            goto Lb1
        L32:
            boolean r13 = r3.containsKey(r9)     // Catch: java.lang.ClassCastException -> L77
            if (r13 == 0) goto L41
            android.os.Bundle r7 = r3.getBundle(r9)     // Catch: java.lang.ClassCastException -> L77
            s.U r7 = s.U.a(r7)     // Catch: java.lang.ClassCastException -> L77
            goto L7a
        L41:
            boolean r9 = r3.containsKey(r8)     // Catch: java.lang.ClassCastException -> L77
            if (r9 == 0) goto L5a
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.ClassCastException -> L77
            r13 = 28
            if (r9 < r13) goto L5a
            android.os.Parcelable r7 = r3.getParcelable(r8)     // Catch: java.lang.ClassCastException -> L77
            android.app.Person r7 = X1.i.d(r7)     // Catch: java.lang.ClassCastException -> L77
            s.U r7 = s.T.a(r7)     // Catch: java.lang.ClassCastException -> L77
            goto L7a
        L5a:
            boolean r8 = r3.containsKey(r7)     // Catch: java.lang.ClassCastException -> L77
            if (r8 == 0) goto L79
            java.lang.CharSequence r7 = r3.getCharSequence(r7)     // Catch: java.lang.ClassCastException -> L77
            s.U r8 = new s.U     // Catch: java.lang.ClassCastException -> L77
            r8.<init>()     // Catch: java.lang.ClassCastException -> L77
            r8.f9071a = r7     // Catch: java.lang.ClassCastException -> L77
            r8.f9072b = r12     // Catch: java.lang.ClassCastException -> L77
            r8.f9073c = r12     // Catch: java.lang.ClassCastException -> L77
            r8.f9074d = r12     // Catch: java.lang.ClassCastException -> L77
            r8.f9075e = r1     // Catch: java.lang.ClassCastException -> L77
            r8.f9076f = r1     // Catch: java.lang.ClassCastException -> L77
            r7 = r8
            goto L7a
        L77:
            goto Lb1
        L79:
            r7 = r12
        L7a:
            s.A r8 = new s.A     // Catch: java.lang.ClassCastException -> L77
            java.lang.CharSequence r9 = r3.getCharSequence(r11)     // Catch: java.lang.ClassCastException -> L77
            long r10 = r3.getLong(r10)     // Catch: java.lang.ClassCastException -> L77
            r8.<init>(r9, r10, r7)     // Catch: java.lang.ClassCastException -> L77
            boolean r7 = r3.containsKey(r6)     // Catch: java.lang.ClassCastException -> L77
            if (r7 == 0) goto La1
            boolean r7 = r3.containsKey(r5)     // Catch: java.lang.ClassCastException -> L77
            if (r7 == 0) goto La1
            java.lang.String r6 = r3.getString(r6)     // Catch: java.lang.ClassCastException -> L77
            android.os.Parcelable r5 = r3.getParcelable(r5)     // Catch: java.lang.ClassCastException -> L77
            android.net.Uri r5 = (android.net.Uri) r5     // Catch: java.lang.ClassCastException -> L77
            r8.f9038e = r6     // Catch: java.lang.ClassCastException -> L77
            r8.f9039f = r5     // Catch: java.lang.ClassCastException -> L77
        La1:
            boolean r5 = r3.containsKey(r4)     // Catch: java.lang.ClassCastException -> L77
            if (r5 == 0) goto Lb0
            android.os.Bundle r5 = r8.f9037d     // Catch: java.lang.ClassCastException -> L77
            android.os.Bundle r3 = r3.getBundle(r4)     // Catch: java.lang.ClassCastException -> L77
            r5.putAll(r3)     // Catch: java.lang.ClassCastException -> L77
        Lb0:
            r12 = r8
        Lb1:
            if (r12 == 0) goto Lb6
            r0.add(r12)
        Lb6:
            int r2 = r2 + 1
            goto L8
        Lba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C0769A.b(android.os.Parcelable[]):java.util.ArrayList");
    }

    public final Notification.MessagingStyle.Message c() {
        Notification.MessagingStyle.Message a3;
        int i3 = Build.VERSION.SDK_INT;
        CharSequence charSequence = null;
        Person person = null;
        long j3 = this.f9035b;
        CharSequence charSequence2 = this.f9034a;
        U u3 = this.f9036c;
        if (i3 >= 28) {
            if (u3 != null) {
                person = T.b(u3);
            }
            a3 = z.b(charSequence2, j3, person);
        } else {
            if (u3 != null) {
                charSequence = u3.f9071a;
            }
            a3 = AbstractC0800y.a(charSequence2, j3, charSequence);
        }
        String str = this.f9038e;
        if (str != null) {
            AbstractC0800y.b(a3, str, this.f9039f);
        }
        return a3;
    }
}
