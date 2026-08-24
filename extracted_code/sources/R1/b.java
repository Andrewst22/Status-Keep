package R1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* loaded from: classes.dex */
public final class b extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f2073a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f2074b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Looper looper, boolean z3) {
        super(looper);
        this.f2074b = cVar;
        this.f2073a = z3;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f2074b.f2084u.a(Boolean.valueOf(this.f2073a));
    }
}
