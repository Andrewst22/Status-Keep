package m;

import a.AbstractC0155a;
import java.util.concurrent.Executors;
/* renamed from: m.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0612a extends AbstractC0155a {

    /* renamed from: v  reason: collision with root package name */
    public static volatile C0612a f8141v;

    /* renamed from: u  reason: collision with root package name */
    public final Object f8142u;

    public C0612a(int i3) {
        switch (i3) {
            case 1:
                this.f8142u = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC0613b());
                return;
            default:
                this.f8142u = new C0612a(1);
                return;
        }
    }
}
