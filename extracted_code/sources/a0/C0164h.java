package a0;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
/* renamed from: a0.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0164h extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final ContentResolver f3748a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f3749b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0165i f3750c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0164h(C0165i c0165i, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f3750c = c0165i;
        this.f3748a = contentResolver;
        this.f3749b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        C0165i c0165i = this.f3750c;
        c0165i.a(C0161e.b(c0165i.f3751a, c0165i.f3759i, c0165i.f3758h));
    }
}
