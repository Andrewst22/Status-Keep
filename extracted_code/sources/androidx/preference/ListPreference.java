package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.example.flutter_application_1.R;
import e0.l;
import f1.AbstractC0267a;
import u.AbstractC0839b;
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: t  reason: collision with root package name */
    public final CharSequence[] f4404t;

    /* renamed from: u  reason: collision with root package name */
    public final String f4405u;

    public ListPreference(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0267a.f5549d, i3, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f4404t = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (l.f5259o == null) {
                l.f5259o = new l(3);
            }
            this.f4412s = l.f5259o;
            b();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0267a.f5551f, i3, 0);
        this.f4405u = AbstractC0839b.d(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        l lVar = this.f4412s;
        if (lVar != null) {
            return lVar.y(this);
        }
        CharSequence a3 = super.a();
        String str = this.f4405u;
        if (str == null) {
            return a3;
        }
        String format = String.format(str, "");
        if (TextUtils.equals(format, a3)) {
            return a3;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i3) {
        return typedArray.getString(i3);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0839b.a(context, R.attr.dialogPreferenceStyle, 16842897));
    }
}
