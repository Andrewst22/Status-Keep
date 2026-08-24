package U;

import android.os.Message;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public Message f2484a;

    public final void a() {
        this.f2484a = null;
        ArrayList arrayList = x.f2485b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.f2484a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
