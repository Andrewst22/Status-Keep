package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.example.flutter_application_1.R;
import f1.AbstractC0267a;
import u.AbstractC0839b;
/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public DialogPreference(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0267a.f5547b, i3, 0);
        AbstractC0839b.d(obtainStyledAttributes, 9, 0);
        AbstractC0839b.d(obtainStyledAttributes, 8, 1);
        if (obtainStyledAttributes.getDrawable(6) == null) {
            obtainStyledAttributes.getDrawable(2);
        }
        AbstractC0839b.d(obtainStyledAttributes, 11, 3);
        AbstractC0839b.d(obtainStyledAttributes, 10, 4);
        obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0839b.a(context, R.attr.dialogPreferenceStyle, 16842897));
    }
}
