package T2;
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final i f2371a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T2.i] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        ?? r02;
        try {
            Class.forName("java.nio.file.Files");
            r02 = new Object();
        } catch (ClassNotFoundException unused) {
            r02 = new Object();
        }
        f2371a = r02;
        String str = l.f2379n;
        String property = System.getProperty("java.io.tmpdir");
        D2.i.d(property, "getProperty(\"java.io.tmpdir\")");
        B1.b.q(property, false);
        ClassLoader classLoader = U2.d.class.getClassLoader();
        D2.i.d(classLoader, "ResourceFileSystem::class.java.classLoader");
        new U2.d(classLoader);
    }

    public final boolean a(l lVar) {
        D2.i.e(lVar, "path");
        if (b(lVar) != null) {
            return true;
        }
        return false;
    }

    public abstract e b(l lVar);
}
