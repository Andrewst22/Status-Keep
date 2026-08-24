package z1;

import java.io.Serializable;
import java.util.List;
/* renamed from: z1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0915a implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    public final List f9767m;

    /* renamed from: n  reason: collision with root package name */
    public final Boolean f9768n;

    /* renamed from: o  reason: collision with root package name */
    public final String f9769o;

    /* renamed from: p  reason: collision with root package name */
    public final List f9770p;

    public C0915a(List list, Boolean bool, String str, List list2) {
        this.f9767m = list;
        this.f9768n = bool;
        this.f9769o = str;
        this.f9770p = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0915a.class != obj.getClass()) {
            return false;
        }
        C0915a c0915a = (C0915a) obj;
        List list = c0915a.f9767m;
        List list2 = this.f9767m;
        if (list2 == null ? list != null : !list2.equals(list)) {
            return false;
        }
        Boolean bool = c0915a.f9768n;
        Boolean bool2 = this.f9768n;
        if (bool2 == null ? bool != null : !bool2.equals(bool)) {
            return false;
        }
        String str = c0915a.f9769o;
        String str2 = this.f9769o;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list3 = c0915a.f9770p;
        List list4 = this.f9770p;
        if (list4 != null) {
            return list4.equals(list3);
        }
        if (list3 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        List list = this.f9767m;
        if (list != null) {
            i3 = list.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = i3 * 31;
        Boolean bool = this.f9768n;
        if (bool != null) {
            i4 = bool.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 31;
        String str = this.f9769o;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int i9 = (i8 + i5) * 31;
        List list2 = this.f9770p;
        if (list2 != null) {
            i6 = list2.hashCode();
        }
        return i9 + i6;
    }
}
