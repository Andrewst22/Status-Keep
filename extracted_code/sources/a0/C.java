package a0;

import Y.C0143n;
import android.content.Context;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory;
import java.util.HashMap;
import o0.InterfaceC0700y;
/* loaded from: classes.dex */
public final class C {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3603a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3604b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3605c;

    /* renamed from: d  reason: collision with root package name */
    public Object f3606d;

    /* renamed from: e  reason: collision with root package name */
    public Object f3607e;

    /* renamed from: f  reason: collision with root package name */
    public Object f3608f;

    public C(Context context, u0.o oVar) {
        this.f3604b = context.getApplicationContext();
        this.f3605c = oVar;
        this.f3608f = U.v.f2483a;
    }

    public C1.k a(int i3) {
        C1.k kVar;
        C1.k kVar2;
        HashMap hashMap = (HashMap) this.f3605c;
        C1.k kVar3 = (C1.k) hashMap.get(Integer.valueOf(i3));
        if (kVar3 != null) {
            return kVar3;
        }
        final B1.a aVar = (B1.a) this.f3607e;
        aVar.getClass();
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            kVar2 = new C1.k() { // from class: o0.m
                                @Override // C1.k
                                public final Object get() {
                                    switch (r3) {
                                        case 0:
                                            return C0690n.d((Class) this, aVar);
                                        case 1:
                                            return C0690n.d((Class) this, aVar);
                                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                                            return C0690n.d((Class) this, aVar);
                                        default:
                                            return new N(aVar, (w0.m) ((a0.C) this).f3604b);
                                    }
                                }
                            };
                        } else {
                            throw new IllegalArgumentException(D2.h.k("Unrecognized contentType: ", i3));
                        }
                    } else {
                        kVar2 = new C0143n(RtspMediaSource$Factory.class.asSubclass(InterfaceC0700y.class), 2);
                    }
                    hashMap.put(Integer.valueOf(i3), kVar2);
                    return kVar2;
                }
                final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(InterfaceC0700y.class);
                kVar = new C1.k() { // from class: o0.m
                    @Override // C1.k
                    public final Object get() {
                        switch (r3) {
                            case 0:
                                return C0690n.d((Class) asSubclass, aVar);
                            case 1:
                                return C0690n.d((Class) asSubclass, aVar);
                            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                                return C0690n.d((Class) asSubclass, aVar);
                            default:
                                return new N(aVar, (w0.m) ((a0.C) asSubclass).f3604b);
                        }
                    }
                };
            } else {
                final Class asSubclass2 = SsMediaSource$Factory.class.asSubclass(InterfaceC0700y.class);
                kVar = new C1.k() { // from class: o0.m
                    @Override // C1.k
                    public final Object get() {
                        switch (r3) {
                            case 0:
                                return C0690n.d((Class) asSubclass2, aVar);
                            case 1:
                                return C0690n.d((Class) asSubclass2, aVar);
                            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                                return C0690n.d((Class) asSubclass2, aVar);
                            default:
                                return new N(aVar, (w0.m) ((a0.C) asSubclass2).f3604b);
                        }
                    }
                };
            }
        } else {
            final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(InterfaceC0700y.class);
            kVar = new C1.k() { // from class: o0.m
                @Override // C1.k
                public final Object get() {
                    switch (r3) {
                        case 0:
                            return C0690n.d((Class) asSubclass3, aVar);
                        case 1:
                            return C0690n.d((Class) asSubclass3, aVar);
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            return C0690n.d((Class) asSubclass3, aVar);
                        default:
                            return new N(aVar, (w0.m) ((a0.C) asSubclass3).f3604b);
                    }
                }
            };
        }
        kVar2 = kVar;
        hashMap.put(Integer.valueOf(i3), kVar2);
        return kVar2;
    }

    public C(Context context) {
        this.f3604b = context;
        this.f3605c = C0161e.f3742c;
        this.f3607e = M.f3698a;
    }

    public C(w0.m mVar, B1.b bVar) {
        this.f3604b = mVar;
        this.f3608f = bVar;
        this.f3605c = new HashMap();
        this.f3606d = new HashMap();
        this.f3603a = true;
    }
}
