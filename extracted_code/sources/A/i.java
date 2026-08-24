package A;

import R.C0111n;
import U.AbstractC0123a;
import W1.v;
import android.util.SparseBooleanArray;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public boolean f15a;

    /* renamed from: b  reason: collision with root package name */
    public Object f16b;

    public i() {
        this.f16b = new SparseBooleanArray();
    }

    public void a(int i3) {
        AbstractC0123a.j(!this.f15a);
        ((SparseBooleanArray) this.f16b).append(i3, true);
    }

    public C0111n b() {
        AbstractC0123a.j(!this.f15a);
        this.f15a = true;
        return new C0111n((SparseBooleanArray) this.f16b);
    }

    public boolean c() {
        return this.f15a;
    }

    public boolean d(CharSequence charSequence, int i3) {
        if (charSequence != null && i3 >= 0 && charSequence.length() - i3 >= 0) {
            if (((h) this.f16b) == null) {
                return c();
            }
            char c3 = 2;
            for (int i4 = 0; i4 < i3 && c3 == 2; i4++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i4));
                i iVar = j.f17a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                c3 = 2;
                                break;
                        }
                    }
                    c3 = 0;
                }
                c3 = 1;
            }
            if (c3 == 0) {
                return true;
            }
            if (c3 != 1) {
                return c();
            }
            return false;
        }
        throw new IllegalArgumentException();
    }

    public void e(boolean z3) {
        if (!this.f15a) {
            this.f15a = true;
            v vVar = (v) this.f16b;
            int i3 = vVar.f2918b - 1;
            vVar.f2918b = i3;
            boolean z4 = z3 | vVar.f2919c;
            vVar.f2919c = z4;
            if (i3 == 0 && !z4) {
                vVar.f2920d.o0(vVar.f2917a);
                return;
            }
            return;
        }
        throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
    }

    public i(h hVar, boolean z3) {
        this.f16b = hVar;
        this.f15a = z3;
    }
}
