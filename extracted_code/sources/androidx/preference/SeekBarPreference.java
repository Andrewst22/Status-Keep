package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.example.flutter_application_1.R;
import f1.AbstractC0267a;
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: t  reason: collision with root package name */
    public final int f4413t;

    /* renamed from: u  reason: collision with root package name */
    public final int f4414u;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0267a.f5554i, R.attr.seekBarPreferenceStyle, 0);
        int i3 = obtainStyledAttributes.getInt(3, 0);
        int i4 = obtainStyledAttributes.getInt(1, 100);
        i4 = i4 < i3 ? i3 : i4;
        if (i4 != this.f4413t) {
            this.f4413t = i4;
        }
        int i5 = obtainStyledAttributes.getInt(4, 0);
        if (i5 != this.f4414u) {
            this.f4414u = Math.min(this.f4413t - i3, Math.abs(i5));
        }
        obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i3) {
        return Integer.valueOf(typedArray.getInt(i3, 0));
    }
}
