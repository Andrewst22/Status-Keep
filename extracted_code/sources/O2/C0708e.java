package o2;

import java.util.Map;
import java.util.Objects;
/* renamed from: o2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0708e {

    /* renamed from: a  reason: collision with root package name */
    public String f8690a;

    /* renamed from: b  reason: collision with root package name */
    public String f8691b;

    /* renamed from: c  reason: collision with root package name */
    public String f8692c;

    /* renamed from: d  reason: collision with root package name */
    public String f8693d;

    /* renamed from: e  reason: collision with root package name */
    public Map f8694e;

    /* renamed from: f  reason: collision with root package name */
    public EnumC0711h f8695f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0708e.class != obj.getClass()) {
            return false;
        }
        C0708e c0708e = (C0708e) obj;
        if (Objects.equals(this.f8690a, c0708e.f8690a) && Objects.equals(this.f8691b, c0708e.f8691b) && Objects.equals(this.f8692c, c0708e.f8692c) && Objects.equals(this.f8693d, c0708e.f8693d) && this.f8694e.equals(c0708e.f8694e) && Objects.equals(this.f8695f, c0708e.f8695f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f8690a, this.f8691b, this.f8692c, this.f8693d, this.f8694e, this.f8695f);
    }
}
