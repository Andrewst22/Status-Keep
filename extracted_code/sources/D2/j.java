package D2;

import java.io.Serializable;
/* loaded from: classes.dex */
public abstract class j implements f, Serializable {

    /* renamed from: m  reason: collision with root package name */
    public final int f336m;

    public j(int i3) {
        this.f336m = i3;
    }

    @Override // D2.f
    public final int f() {
        return this.f336m;
    }

    public final String toString() {
        r.f343a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        i.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
