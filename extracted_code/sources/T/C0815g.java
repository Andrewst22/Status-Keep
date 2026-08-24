package t;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
/* renamed from: t.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0815g {

    /* renamed from: a  reason: collision with root package name */
    public final String f9230a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f9231b = new HashMap();

    public C0815g(String str) {
        this.f9230a = str;
    }

    public static boolean a(String str, String str2) {
        String a3 = h.a(str);
        String a4 = h.a(str2);
        if (!a3.equals(a4)) {
            if (!a3.startsWith(a4 + '/')) {
                return false;
            }
        }
        return true;
    }

    public final File b(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.f9231b.get(decode);
        if (file != null) {
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (a(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }
        throw new IllegalArgumentException("Unable to find configured root for " + uri);
    }
}
