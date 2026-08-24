package C1;

import U.t;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f157a;

    /* renamed from: b  reason: collision with root package name */
    public final String f158b;

    public /* synthetic */ f(String str, int i3) {
        this.f157a = i3;
        this.f158b = str;
    }

    public static f c(t tVar) {
        String str;
        tVar.H(2);
        int u3 = tVar.u();
        int i3 = u3 >> 1;
        int u4 = ((tVar.u() >> 3) & 31) | ((u3 & 1) << 5);
        if (i3 != 4 && i3 != 5 && i3 != 7) {
            if (i3 == 8) {
                str = "hev1";
            } else if (i3 == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(".0");
        sb.append(i3);
        if (u4 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(u4);
        return new f(sb.toString(), 2);
    }

    public void a(StringBuilder sb, Iterator it) {
        CharSequence obj;
        CharSequence obj2;
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    obj = (CharSequence) next;
                } else {
                    obj = next.toString();
                }
                sb.append(obj);
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f158b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        obj2 = (CharSequence) next2;
                    } else {
                        obj2 = next2.toString();
                    }
                    sb.append(obj2);
                }
            }
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public String b(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }

    public String toString() {
        switch (this.f157a) {
            case 1:
                return "<" + this.f158b + '>';
            default:
                return super.toString();
        }
    }

    public f(String str) {
        this.f157a = 0;
        str.getClass();
        this.f158b = str;
    }
}
