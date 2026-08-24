package z;

import android.content.Context;
import java.util.concurrent.Callable;
/* renamed from: z.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0907c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9745a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f9746b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f9747c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ T1.d f9748d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f9749e;

    public /* synthetic */ CallableC0907c(String str, Context context, T1.d dVar, int i3, int i4) {
        this.f9745a = i4;
        this.f9746b = str;
        this.f9747c = context;
        this.f9748d = dVar;
        this.f9749e = i3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f9745a) {
            case 0:
                return AbstractC0910f.a(this.f9746b, this.f9747c, this.f9748d, this.f9749e);
            default:
                try {
                    return AbstractC0910f.a(this.f9746b, this.f9747c, this.f9748d, this.f9749e);
                } catch (Throwable unused) {
                    return new C0909e(-3);
                }
        }
    }
}
