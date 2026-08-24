package C;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;
/* loaded from: classes.dex */
public class M extends L {
    public M(S s3, WindowInsets windowInsets) {
        super(s3, windowInsets);
    }

    @Override // C.Q
    public S a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f76c.consumeDisplayCutout();
        return S.a(consumeDisplayCutout, null);
    }

    @Override // C.Q
    public C0004e e() {
        DisplayCutout displayCutout;
        displayCutout = this.f76c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0004e(displayCutout);
    }

    @Override // C.K, C.Q
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m3 = (M) obj;
        if (Objects.equals(this.f76c, m3.f76c) && Objects.equals(this.f78e, m3.f78e)) {
            return true;
        }
        return false;
    }

    @Override // C.Q
    public int hashCode() {
        return this.f76c.hashCode();
    }
}
