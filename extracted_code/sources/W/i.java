package W;

import java.io.IOException;
/* loaded from: classes.dex */
public class i extends IOException {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f2752n = 0;

    /* renamed from: m  reason: collision with root package name */
    public final int f2753m;

    public i(int i3) {
        this.f2753m = i3;
    }

    public i(Exception exc, int i3) {
        super(exc);
        this.f2753m = i3;
    }

    public i(String str, int i3) {
        super(str);
        this.f2753m = i3;
    }

    public i(String str, Exception exc, int i3) {
        super(str, exc);
        this.f2753m = i3;
    }
}
