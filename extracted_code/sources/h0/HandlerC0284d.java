package h0;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: h0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC0284d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f5815a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0284d(f fVar, Looper looper) {
        super(looper);
        this.f5815a = fVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        f fVar = this.f5815a;
        fVar.getClass();
        int i3 = message.what;
        e eVar = null;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        AtomicReference atomicReference = fVar.f5826p;
                        IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                        while (!atomicReference.compareAndSet(null, illegalStateException) && atomicReference.get() == null) {
                        }
                    } else {
                        try {
                            fVar.f5823m.setParameters((Bundle) message.obj);
                        } catch (RuntimeException e2) {
                            AtomicReference atomicReference2 = fVar.f5826p;
                            while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                            }
                        }
                    }
                } else {
                    fVar.f5827q.b();
                }
            } else {
                e eVar2 = (e) message.obj;
                int i4 = eVar2.f5816a;
                MediaCodec.CryptoInfo cryptoInfo = eVar2.f5818c;
                long j3 = eVar2.f5819d;
                int i5 = eVar2.f5820e;
                try {
                    synchronized (f.f5822t) {
                        fVar.f5823m.queueSecureInputBuffer(i4, 0, cryptoInfo, j3, i5);
                    }
                } catch (RuntimeException e3) {
                    AtomicReference atomicReference3 = fVar.f5826p;
                    while (!atomicReference3.compareAndSet(null, e3) && atomicReference3.get() == null) {
                    }
                }
                eVar = eVar2;
            }
        } else {
            e eVar3 = (e) message.obj;
            try {
                fVar.f5823m.queueInputBuffer(eVar3.f5816a, 0, eVar3.f5817b, eVar3.f5819d, eVar3.f5820e);
            } catch (RuntimeException e4) {
                AtomicReference atomicReference4 = fVar.f5826p;
                while (!atomicReference4.compareAndSet(null, e4) && atomicReference4.get() == null) {
                }
            }
            eVar = eVar3;
        }
        if (eVar != null) {
            f.d(eVar);
        }
    }
}
