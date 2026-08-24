package j$.util.stream;

import java.util.EnumMap;
/* loaded from: classes2.dex */
final class X2 {

    /* renamed from: a  reason: collision with root package name */
    final EnumMap f7061a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X2(EnumMap enumMap) {
        this.f7061a = enumMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Y2 y22) {
        this.f7061a.put((EnumMap) y22, (Y2) 1);
    }
}
