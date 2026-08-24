package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import u1.f;
/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b  reason: collision with root package name */
    public SidecarDeviceState f4500b;

    /* renamed from: d  reason: collision with root package name */
    public final f f4502d;

    /* renamed from: e  reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f4503e;

    /* renamed from: a  reason: collision with root package name */
    public final Object f4499a = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final WeakHashMap f4501c = new WeakHashMap();

    public DistinctElementSidecarCallback(f fVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f4502d = fVar;
        this.f4503e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f4499a) {
            try {
                f fVar = this.f4502d;
                SidecarDeviceState sidecarDeviceState2 = this.f4500b;
                fVar.getClass();
                if (f.a(sidecarDeviceState2, sidecarDeviceState)) {
                    return;
                }
                this.f4500b = sidecarDeviceState;
                this.f4503e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f4499a) {
            try {
                this.f4502d.getClass();
                if (f.d((SidecarWindowLayoutInfo) this.f4501c.get(iBinder), sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f4501c.put(iBinder, sidecarWindowLayoutInfo);
                this.f4503e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
