package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
/* renamed from: j$.util.stream.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0422j {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f7187a = 0;

    static {
        EnumC0412h enumC0412h = EnumC0412h.CONCURRENT;
        EnumC0412h enumC0412h2 = EnumC0412h.UNORDERED;
        EnumC0412h enumC0412h3 = EnumC0412h.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC0412h, enumC0412h2, enumC0412h3));
        Collections.unmodifiableSet(EnumSet.of(enumC0412h, enumC0412h2));
        Collections.unmodifiableSet(EnumSet.of(enumC0412h3));
        Collections.unmodifiableSet(EnumSet.of(enumC0412h2, enumC0412h3));
        Collections.emptySet();
        Collections.unmodifiableSet(EnumSet.of(enumC0412h2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(double[] dArr, double d3) {
        double d4 = d3 - dArr[1];
        double d5 = dArr[0];
        double d6 = d5 + d4;
        dArr[1] = (d6 - d5) - d4;
        dArr[0] = d6;
    }
}
