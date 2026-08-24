package l1;

import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.InflateException;
import m2.AbstractC0635d;
import v.C0873d;
/* renamed from: l1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0592a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f8050a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f8051b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f8052c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f8053d = {16842755, 16843781, 16844062};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f8054e = {16843161};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f8055f = {16842755, 16843213};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f8056g = {16843073, 16843160, 16843198, 16843199, 16843200, 16843486, 16843487, 16843488};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f8057h = {16843490};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f8058i = {16843486, 16843487, 16843488, 16843489};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f8059j = {16842788, 16843073, 16843488, 16843992};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f8060k = {16843489, 16843781, 16843892, 16843893};

    /* JADX WARN: Code restructure failed: missing block: B:200:0x039c, code lost:
        if (r31 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x039e, code lost:
        if (r13 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03a0, code lost:
        r1 = new android.animation.Animator[r13.size()];
        r3 = r13.iterator();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03af, code lost:
        if (r3.hasNext() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03b1, code lost:
        r1[r14] = (android.animation.Animator) r3.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03bd, code lost:
        if (r32 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03bf, code lost:
        r31.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03c3, code lost:
        r31.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03c6, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator a(android.content.Context r26, android.content.res.Resources r27, android.content.res.Resources.Theme r28, android.content.res.XmlResourceParser r29, android.util.AttributeSet r30, android.animation.AnimatorSet r31, int r32) {
        /*
            Method dump skipped, instructions count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.AbstractC0592a.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    /* JADX WARN: Type inference failed for: r11v26, types: [android.animation.TypeEvaluator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.animation.TypeEvaluator, java.lang.Object] */
    public static PropertyValuesHolder b(TypedArray typedArray, int i3, int i4, int i5, String str) {
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        C0597f c0597f;
        int i8;
        int i9;
        int i10;
        float f3;
        PropertyValuesHolder ofFloat;
        float f4;
        float f5;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i4);
        if (peekValue != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            i6 = peekValue.type;
        } else {
            i6 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i5);
        if (peekValue2 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i7 = peekValue2.type;
        } else {
            i7 = 0;
        }
        if (i3 == 4) {
            if ((z3 && c(i6)) || (z4 && c(i7))) {
                i3 = 3;
            } else {
                i3 = 0;
            }
        }
        if (i3 == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i3 == 2) {
            String string = typedArray.getString(i4);
            String string2 = typedArray.getString(i5);
            C0873d[] j3 = AbstractC0635d.j(string);
            C0873d[] j4 = AbstractC0635d.j(string2);
            if (j3 == null && j4 == null) {
                return null;
            }
            if (j3 != null) {
                ?? obj = new Object();
                if (j4 != null) {
                    if (AbstractC0635d.d(j3, j4)) {
                        ofObject = PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, j3, j4);
                    } else {
                        throw new InflateException(" Can't morph from " + string + " to " + string2);
                    }
                } else {
                    ofObject = PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, j3);
                }
                return ofObject;
            } else if (j4 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, (TypeEvaluator) new Object(), j4);
            }
        }
        if (i3 == 3) {
            c0597f = C0597f.f8070a;
        } else {
            c0597f = null;
        }
        if (z5) {
            if (z3) {
                if (i6 == 5) {
                    f4 = typedArray.getDimension(i4, 0.0f);
                } else {
                    f4 = typedArray.getFloat(i4, 0.0f);
                }
                if (z4) {
                    if (i7 == 5) {
                        f5 = typedArray.getDimension(i5, 0.0f);
                    } else {
                        f5 = typedArray.getFloat(i5, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f4, f5);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f4);
                }
            } else {
                if (i7 == 5) {
                    f3 = typedArray.getDimension(i5, 0.0f);
                } else {
                    f3 = typedArray.getFloat(i5, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f3);
            }
            propertyValuesHolder = ofFloat;
        } else if (z3) {
            if (i6 == 5) {
                i9 = (int) typedArray.getDimension(i4, 0.0f);
            } else if (c(i6)) {
                i9 = typedArray.getColor(i4, 0);
            } else {
                i9 = typedArray.getInt(i4, 0);
            }
            if (z4) {
                if (i7 == 5) {
                    i10 = (int) typedArray.getDimension(i5, 0.0f);
                } else if (c(i7)) {
                    i10 = typedArray.getColor(i5, 0);
                } else {
                    i10 = typedArray.getInt(i5, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i9, i10);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i9);
            }
        } else if (z4) {
            if (i7 == 5) {
                i8 = (int) typedArray.getDimension(i5, 0.0f);
            } else if (c(i7)) {
                i8 = typedArray.getColor(i5, 0);
            } else {
                i8 = typedArray.getInt(i5, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i8);
        }
        if (propertyValuesHolder != null && c0597f != null) {
            propertyValuesHolder.setEvaluator(c0597f);
            return propertyValuesHolder;
        }
        return propertyValuesHolder;
    }

    public static boolean c(int i3) {
        if (i3 >= 28 && i3 <= 31) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.ValueAnimator d(android.content.Context r20, android.content.res.Resources r21, android.content.res.Resources.Theme r22, android.util.AttributeSet r23, android.animation.ObjectAnimator r24, android.content.res.XmlResourceParser r25) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.AbstractC0592a.d(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, android.animation.ObjectAnimator, android.content.res.XmlResourceParser):android.animation.ValueAnimator");
    }
}
