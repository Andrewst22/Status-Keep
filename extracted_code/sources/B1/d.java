package B1;

import java.io.File;
import java.io.FilenameFilter;
/* loaded from: classes.dex */
public final class d implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f53a;

    public d(String str) {
        this.f53a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f53a);
    }
}
