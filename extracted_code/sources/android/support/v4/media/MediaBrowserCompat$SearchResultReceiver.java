package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import c.C0220d;
import java.util.ArrayList;
/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends C0220d {
    @Override // c.C0220d
    public final void d(int i3, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(a.class.getClassLoader());
        }
        if (i3 == 0 && bundle != null && bundle.containsKey("search_results")) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            if (parcelableArray != null) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
                }
            }
            throw null;
        }
        throw null;
    }
}
