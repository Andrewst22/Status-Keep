package io.flutter.view;

import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: A  reason: collision with root package name */
    public String f6317A;

    /* renamed from: D  reason: collision with root package name */
    public int f6320D;

    /* renamed from: E  reason: collision with root package name */
    public int f6321E;

    /* renamed from: F  reason: collision with root package name */
    public int f6322F;

    /* renamed from: G  reason: collision with root package name */
    public int f6323G;

    /* renamed from: H  reason: collision with root package name */
    public float f6324H;

    /* renamed from: I  reason: collision with root package name */
    public String f6325I;

    /* renamed from: J  reason: collision with root package name */
    public String f6326J;

    /* renamed from: K  reason: collision with root package name */
    public float f6327K;
    public float L;

    /* renamed from: M  reason: collision with root package name */
    public float f6328M;

    /* renamed from: N  reason: collision with root package name */
    public float f6329N;

    /* renamed from: O  reason: collision with root package name */
    public float[] f6330O;

    /* renamed from: P  reason: collision with root package name */
    public g f6331P;

    /* renamed from: S  reason: collision with root package name */
    public ArrayList f6334S;

    /* renamed from: T  reason: collision with root package name */
    public e f6335T;

    /* renamed from: U  reason: collision with root package name */
    public e f6336U;

    /* renamed from: W  reason: collision with root package name */
    public float[] f6338W;

    /* renamed from: Y  reason: collision with root package name */
    public float[] f6340Y;

    /* renamed from: Z  reason: collision with root package name */
    public Rect f6341Z;

    /* renamed from: a  reason: collision with root package name */
    public final k f6342a;

    /* renamed from: c  reason: collision with root package name */
    public int f6344c;

    /* renamed from: d  reason: collision with root package name */
    public int f6345d;

    /* renamed from: e  reason: collision with root package name */
    public int f6346e;

    /* renamed from: f  reason: collision with root package name */
    public int f6347f;

    /* renamed from: g  reason: collision with root package name */
    public int f6348g;

    /* renamed from: h  reason: collision with root package name */
    public int f6349h;

    /* renamed from: i  reason: collision with root package name */
    public int f6350i;

    /* renamed from: j  reason: collision with root package name */
    public int f6351j;

    /* renamed from: k  reason: collision with root package name */
    public int f6352k;

    /* renamed from: l  reason: collision with root package name */
    public float f6353l;

    /* renamed from: m  reason: collision with root package name */
    public float f6354m;

    /* renamed from: n  reason: collision with root package name */
    public float f6355n;

    /* renamed from: o  reason: collision with root package name */
    public String f6356o;

    /* renamed from: p  reason: collision with root package name */
    public String f6357p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f6358q;

    /* renamed from: r  reason: collision with root package name */
    public String f6359r;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList f6360s;

    /* renamed from: t  reason: collision with root package name */
    public String f6361t;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f6362u;

    /* renamed from: v  reason: collision with root package name */
    public String f6363v;

    /* renamed from: w  reason: collision with root package name */
    public ArrayList f6364w;
    public String x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList f6365y;

    /* renamed from: z  reason: collision with root package name */
    public String f6366z;

    /* renamed from: b  reason: collision with root package name */
    public int f6343b = -1;

    /* renamed from: B  reason: collision with root package name */
    public int f6318B = -1;

    /* renamed from: C  reason: collision with root package name */
    public boolean f6319C = false;

    /* renamed from: Q  reason: collision with root package name */
    public final ArrayList f6332Q = new ArrayList();

    /* renamed from: R  reason: collision with root package name */
    public final ArrayList f6333R = new ArrayList();

    /* renamed from: V  reason: collision with root package name */
    public boolean f6337V = true;

    /* renamed from: X  reason: collision with root package name */
    public boolean f6339X = true;

    public g(k kVar) {
        this.f6342a = kVar;
    }

    public static boolean a(g gVar, d dVar) {
        if ((gVar.f6345d & dVar.f6310m) != 0) {
            return true;
        }
        return false;
    }

    public static CharSequence b(g gVar) {
        CharSequence[] charSequenceArr = {e(gVar.f6359r, gVar.f6360s), gVar.f(), e(gVar.x, gVar.f6365y)};
        CharSequence charSequence = null;
        for (int i3 = 0; i3 < 3; i3++) {
            CharSequence charSequence2 = charSequenceArr[i3];
            if (charSequence2 != null && charSequence2.length() > 0) {
                if (charSequence != null && charSequence.length() != 0) {
                    charSequence = TextUtils.concat(charSequence, ", ", charSequence2);
                } else {
                    charSequence = charSequence2;
                }
            }
        }
        return charSequence;
    }

    public static boolean c(g gVar, d dVar) {
        if ((gVar.f6321E & dVar.f6310m) != 0) {
            return true;
        }
        return false;
    }

    public static SpannableString e(String str, ArrayList arrayList) {
        if (str == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(str);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                int b3 = N.j.b(iVar.f6369c);
                if (b3 != 0) {
                    if (b3 != 1) {
                        if (b3 == 2) {
                            spannableString.setSpan(new URLSpan(((j) iVar).f6370d), iVar.f6367a, iVar.f6368b, 0);
                        }
                    } else {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((f) iVar).f6316d)), iVar.f6367a, iVar.f6368b, 0);
                    }
                } else {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), iVar.f6367a, iVar.f6368b, 0);
                }
            }
        }
        return spannableString;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [io.flutter.view.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [io.flutter.view.i, java.lang.Object, io.flutter.view.f] */
    public static ArrayList h(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i3 = byteBuffer.getInt();
        if (i3 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = byteBuffer.getInt();
            int i6 = byteBuffer.getInt();
            int i7 = N.j.c(3)[byteBuffer.getInt()];
            int b3 = N.j.b(i7);
            if (b3 != 0) {
                if (b3 == 1) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    ?? obj = new Object();
                    obj.f6367a = i5;
                    obj.f6368b = i6;
                    obj.f6369c = i7;
                    obj.f6316d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(obj);
                }
            } else {
                byteBuffer.getInt();
                ?? obj2 = new Object();
                obj2.f6367a = i5;
                obj2.f6368b = i6;
                obj2.f6369c = i7;
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static void l(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f3 = fArr[3];
        fArr[0] = fArr[0] / f3;
        fArr[1] = fArr[1] / f3;
        fArr[2] = fArr[2] / f3;
        fArr[3] = 0.0f;
    }

    public final void d(ArrayList arrayList) {
        if (i(12)) {
            arrayList.add(this);
        }
        Iterator it = this.f6332Q.iterator();
        while (it.hasNext()) {
            ((g) it.next()).d(arrayList);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [io.flutter.view.j, io.flutter.view.i, java.lang.Object] */
    public final SpannableString f() {
        ArrayList arrayList = this.f6358q;
        String str = this.f6317A;
        if (str != null && str.length() > 0) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList(arrayList);
            }
            ?? obj = new Object();
            obj.f6367a = 0;
            obj.f6368b = this.f6357p.length();
            obj.f6370d = this.f6317A;
            obj.f6369c = 3;
            arrayList.add(obj);
        }
        return e(this.f6357p, arrayList);
    }

    public final String g() {
        String str;
        if (i(13) && (str = this.f6357p) != null && !str.isEmpty()) {
            return this.f6357p;
        }
        Iterator it = this.f6332Q.iterator();
        while (it.hasNext()) {
            String g3 = ((g) it.next()).g();
            if (g3 != null && !g3.isEmpty()) {
                return g3;
            }
        }
        return null;
    }

    public final boolean i(int i3) {
        if ((D2.h.h(i3) & this.f6344c) != 0) {
            return true;
        }
        return false;
    }

    public final g j(float[] fArr, boolean z3) {
        float f3 = fArr[3];
        boolean z4 = false;
        float f4 = fArr[0] / f3;
        float f5 = fArr[1] / f3;
        if (f4 < this.f6327K || f4 >= this.f6328M || f5 < this.L || f5 >= this.f6329N) {
            return null;
        }
        float[] fArr2 = new float[4];
        Iterator it = this.f6333R.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (!gVar.i(14)) {
                if (gVar.f6337V) {
                    gVar.f6337V = false;
                    if (gVar.f6338W == null) {
                        gVar.f6338W = new float[16];
                    }
                    if (!Matrix.invertM(gVar.f6338W, 0, gVar.f6330O, 0)) {
                        Arrays.fill(gVar.f6338W, 0.0f);
                    }
                }
                Matrix.multiplyMV(fArr2, 0, gVar.f6338W, 0, fArr, 0);
                g j3 = gVar.j(fArr2, z3);
                if (j3 != null) {
                    return j3;
                }
            }
        }
        if (z3 && this.f6350i != -1) {
            z4 = true;
        }
        if (!k() && !z4) {
            return null;
        }
        return this;
    }

    public final boolean k() {
        String str;
        String str2;
        String str3;
        if (i(12)) {
            return false;
        }
        if (i(22)) {
            return true;
        }
        int i3 = this.f6345d;
        int i4 = k.f6371z;
        if ((i3 & (-61)) == 0 && (this.f6344c & 10682871) == 0 && (((str = this.f6357p) == null || str.isEmpty()) && (((str2 = this.f6359r) == null || str2.isEmpty()) && ((str3 = this.x) == null || str3.isEmpty())))) {
            return false;
        }
        return true;
    }

    public final void m(float[] fArr, HashSet hashSet, boolean z3) {
        hashSet.add(this);
        if (this.f6339X) {
            z3 = true;
        }
        if (z3) {
            if (this.f6340Y == null) {
                this.f6340Y = new float[16];
            }
            if (this.f6330O == null) {
                this.f6330O = new float[16];
            }
            Matrix.multiplyMM(this.f6340Y, 0, fArr, 0, this.f6330O, 0);
            float[] fArr2 = {this.f6327K, this.L, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            l(fArr3, this.f6340Y, fArr2);
            fArr2[0] = this.f6328M;
            fArr2[1] = this.L;
            l(fArr4, this.f6340Y, fArr2);
            fArr2[0] = this.f6328M;
            fArr2[1] = this.f6329N;
            l(fArr5, this.f6340Y, fArr2);
            fArr2[0] = this.f6327K;
            fArr2[1] = this.f6329N;
            l(fArr6, this.f6340Y, fArr2);
            if (this.f6341Z == null) {
                this.f6341Z = new Rect();
            }
            this.f6341Z.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f6339X = false;
        }
        Iterator it = this.f6332Q.iterator();
        int i3 = -1;
        while (it.hasNext()) {
            g gVar = (g) it.next();
            gVar.f6318B = i3;
            i3 = gVar.f6343b;
            gVar.m(this.f6340Y, hashSet, z3);
        }
    }
}
