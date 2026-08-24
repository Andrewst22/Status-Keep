package j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class h extends AbstractC0342a implements Iterator, Enumeration {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f6774k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(l[] lVarArr, int i3, int i4, ConcurrentHashMap concurrentHashMap, int i5) {
        super(lVarArr, i3, i4, concurrentHashMap);
        this.f6774k = i5;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6774k) {
            case 0:
                l lVar = this.f6789b;
                if (lVar == null) {
                    throw new NoSuchElementException();
                }
                this.f6769j = lVar;
                a();
                return lVar.f6781b;
            default:
                l lVar2 = this.f6789b;
                if (lVar2 == null) {
                    throw new NoSuchElementException();
                }
                Object obj = lVar2.f6782c;
                this.f6769j = lVar2;
                a();
                return obj;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f6774k) {
            case 0:
                return next();
            default:
                return next();
        }
    }
}
