package C;

import android.view.DisplayCutout;
import java.util.Objects;
/* renamed from: C.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004e {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayCutout f100a;

    public C0004e(DisplayCutout displayCutout) {
        this.f100a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0004e.class == obj.getClass()) {
            return Objects.equals(this.f100a, ((C0004e) obj).f100a);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f100a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f100a + "}";
    }
}
