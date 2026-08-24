package j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class z extends U {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ SortedSet f7321f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(SortedSet sortedSet, Collection collection) {
        super(collection, 21);
        this.f7321f = sortedSet;
    }

    @Override // j$.util.U, j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f7321f.comparator();
    }
}
