package s;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;
/* loaded from: classes.dex */
public final class U {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f9071a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f9072b;

    /* renamed from: c  reason: collision with root package name */
    public String f9073c;

    /* renamed from: d  reason: collision with root package name */
    public String f9074d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9075e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9076f;

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, s.U] */
    public static U a(Bundle bundle) {
        IconCompat iconCompat;
        Bundle bundle2 = bundle.getBundle("icon");
        CharSequence charSequence = bundle.getCharSequence("name");
        if (bundle2 != null) {
            iconCompat = IconCompat.a(bundle2);
        } else {
            iconCompat = null;
        }
        String string = bundle.getString("uri");
        String string2 = bundle.getString("key");
        boolean z3 = bundle.getBoolean("isBot");
        boolean z4 = bundle.getBoolean("isImportant");
        ?? obj = new Object();
        obj.f9071a = charSequence;
        obj.f9072b = iconCompat;
        obj.f9073c = string;
        obj.f9074d = string2;
        obj.f9075e = z3;
        obj.f9076f = z4;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f9071a);
        IconCompat iconCompat = this.f9072b;
        if (iconCompat != null) {
            bundle = iconCompat.j();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f9073c);
        bundle2.putString("key", this.f9074d);
        bundle2.putBoolean("isBot", this.f9075e);
        bundle2.putBoolean("isImportant", this.f9076f);
        return bundle2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof U)) {
            return false;
        }
        U u3 = (U) obj;
        String str = this.f9074d;
        String str2 = u3.f9074d;
        if (str == null && str2 == null) {
            if (!Objects.equals(Objects.toString(this.f9071a), Objects.toString(u3.f9071a)) || !Objects.equals(this.f9073c, u3.f9073c) || !Boolean.valueOf(this.f9075e).equals(Boolean.valueOf(u3.f9075e)) || !Boolean.valueOf(this.f9076f).equals(Boolean.valueOf(u3.f9076f))) {
                return false;
            }
            return true;
        }
        return Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.f9074d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.f9071a, this.f9073c, Boolean.valueOf(this.f9075e), Boolean.valueOf(this.f9076f));
    }
}
