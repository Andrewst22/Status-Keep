package f0;

import j0.InterfaceC0515a;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class m implements InterfaceC0515a {

    /* renamed from: a  reason: collision with root package name */
    public final String f5491a;

    /* renamed from: b  reason: collision with root package name */
    public final List f5492b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5493c;

    public m(String str, List list, boolean z3) {
        this.f5491a = str;
        this.f5492b = Collections.unmodifiableList(list);
        this.f5493c = z3;
    }
}
