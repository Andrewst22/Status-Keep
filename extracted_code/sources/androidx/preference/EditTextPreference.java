package androidx.preference;

import android.content.res.TypedArray;
/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903179(0x7f03008b, float:1.7413169E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = u.AbstractC0839b.a(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            int[] r1 = f1.AbstractC0267a.f5548c
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r5 = r4.getBoolean(r2, r2)
            boolean r5 = r4.getBoolean(r2, r5)
            if (r5 == 0) goto L2e
            e0.l r5 = e0.l.f5258n
            if (r5 != 0) goto L2a
            e0.l r5 = new e0.l
            r0 = 2
            r5.<init>(r0)
            e0.l.f5258n = r5
        L2a:
            e0.l r5 = e0.l.f5258n
            r3.f4412s = r5
        L2e:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i3) {
        return typedArray.getString(i3);
    }
}
