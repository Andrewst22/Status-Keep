package z;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
/* renamed from: z.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0905a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9742a;

    /* renamed from: b  reason: collision with root package name */
    public final ContentProviderClient f9743b;

    public C0905a(int i3, Context context, Uri uri) {
        this.f9742a = i3;
        switch (i3) {
            case 1:
                this.f9743b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                return;
            default:
                this.f9743b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                return;
        }
    }

    public final void a() {
        switch (this.f9742a) {
            case 0:
                ContentProviderClient contentProviderClient = this.f9743b;
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                    return;
                }
                return;
            default:
                ContentProviderClient contentProviderClient2 = this.f9743b;
                if (contentProviderClient2 != null) {
                    contentProviderClient2.release();
                    return;
                }
                return;
        }
    }
}
