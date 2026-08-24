package R2;

import android.view.KeyCharacterMap;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public int f2134a;

    public i() {
        this.f2134a = 0;
    }

    public Character a(int i3) {
        char c3 = (char) i3;
        if ((Integer.MIN_VALUE & i3) != 0) {
            int i4 = i3 & Integer.MAX_VALUE;
            int i5 = this.f2134a;
            if (i5 != 0) {
                this.f2134a = KeyCharacterMap.getDeadChar(i5, i4);
            } else {
                this.f2134a = i4;
            }
        } else {
            int i6 = this.f2134a;
            if (i6 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i6, i3);
                if (deadChar > 0) {
                    c3 = (char) deadChar;
                }
                this.f2134a = 0;
            }
        }
        return Character.valueOf(c3);
    }

    public i(int i3) {
        this.f2134a = i3;
    }
}
