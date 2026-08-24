package W;

import java.util.Map;
/* loaded from: classes.dex */
public final /* synthetic */ class n implements C1.g {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f2786m;

    @Override // C1.g
    public final boolean apply(Object obj) {
        switch (this.f2786m) {
            case 0:
                if (((Map.Entry) obj).getKey() != null) {
                    return true;
                }
                return false;
            default:
                if (((String) obj) != null) {
                    return true;
                }
                return false;
        }
    }
}
