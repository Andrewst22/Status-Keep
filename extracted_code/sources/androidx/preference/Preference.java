package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.example.flutter_application_1.R;
import e0.l;
import f1.AbstractC0267a;
import u.AbstractC0839b;
/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: m  reason: collision with root package name */
    public final Context f4406m;

    /* renamed from: n  reason: collision with root package name */
    public final int f4407n;

    /* renamed from: o  reason: collision with root package name */
    public final CharSequence f4408o;

    /* renamed from: p  reason: collision with root package name */
    public final CharSequence f4409p;

    /* renamed from: q  reason: collision with root package name */
    public final String f4410q;

    /* renamed from: r  reason: collision with root package name */
    public final Object f4411r;

    /* renamed from: s  reason: collision with root package name */
    public l f4412s;

    public Preference(Context context, AttributeSet attributeSet, int i3) {
        this.f4407n = Integer.MAX_VALUE;
        this.f4406m = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0267a.f5551f, i3, 0);
        obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        String string = obtainStyledAttributes.getString(26);
        this.f4410q = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.f4408o = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.f4409p = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f4407n = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        if (obtainStyledAttributes.getString(22) == null) {
            obtainStyledAttributes.getString(13);
        }
        obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        boolean z3 = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        AbstractC0839b.d(obtainStyledAttributes, 19, 10);
        obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z3));
        obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z3));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f4411r = c(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f4411r = c(obtainStyledAttributes, 11);
        }
        obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        if (obtainStyledAttributes.hasValue(32)) {
            obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    public CharSequence a() {
        l lVar = this.f4412s;
        if (lVar != null) {
            return lVar.y(this);
        }
        return this.f4409p;
    }

    public void b() {
    }

    public Object c(TypedArray typedArray, int i3) {
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i3 = preference2.f4407n;
        int i4 = this.f4407n;
        if (i4 != i3) {
            return i4 - i3;
        }
        CharSequence charSequence = preference2.f4408o;
        CharSequence charSequence2 = this.f4408o;
        if (charSequence2 == charSequence) {
            return 0;
        }
        if (charSequence2 == null) {
            return 1;
        }
        if (charSequence == null) {
            return -1;
        }
        return charSequence2.toString().compareToIgnoreCase(charSequence.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f4408o;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence a3 = a();
        if (!TextUtils.isEmpty(a3)) {
            sb.append(a3);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0839b.a(context, R.attr.preferenceStyle, 16842894));
    }
}
