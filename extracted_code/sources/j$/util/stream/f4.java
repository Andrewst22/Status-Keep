package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
/* loaded from: classes2.dex */
final class f4 extends g4 implements Consumer {

    /* renamed from: e  reason: collision with root package name */
    final Predicate f7163e;

    /* renamed from: f  reason: collision with root package name */
    Object f7164f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f7165g;

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer h(Consumer consumer) {
        return j$.com.android.tools.r8.a.a(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(Spliterator spliterator, Predicate predicate, int i3) {
        super(spliterator);
        this.f7165g = i3;
        this.f7163e = predicate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(Spliterator spliterator, f4 f4Var, int i3) {
        super(spliterator, f4Var);
        this.f7165g = i3;
        this.f7163e = f4Var.f7163e;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f7174d = (this.f7174d + 1) & 63;
        this.f7164f = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
        if (r0 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
        r6.f7172b.set(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
        r7.accept(r6.f7164f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
        return r2;
     */
    @Override // j$.util.Spliterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(j$.util.function.Consumer r7) {
        /*
            r6 = this;
            int r0 = r6.f7165g
            switch(r0) {
                case 0: goto L35;
                default: goto L5;
            }
        L5:
            boolean r0 = r6.f7173c
            r1 = 1
            if (r0 == 0) goto L28
            boolean r0 = r6.q()
            if (r0 == 0) goto L28
            j$.util.Spliterator r0 = r6.f7171a
            boolean r0 = r0.p(r6)
            if (r0 == 0) goto L28
            j$.util.function.Predicate r0 = r6.f7163e
            java.lang.Object r2 = r6.f7164f
            boolean r0 = r0.g(r2)
            if (r0 == 0) goto L29
            java.lang.Object r0 = r6.f7164f
            r7.accept(r0)
            goto L34
        L28:
            r0 = 1
        L29:
            r7 = 0
            r6.f7173c = r7
            if (r0 != 0) goto L33
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f7172b
            r0.set(r1)
        L33:
            r1 = 0
        L34:
            return r1
        L35:
            boolean r0 = r6.f7173c
            j$.util.Spliterator r1 = r6.f7171a
            if (r0 == 0) goto L66
            r0 = 0
            r6.f7173c = r0
        L3e:
            boolean r2 = r1.p(r6)
            r3 = 1
            if (r2 == 0) goto L57
            boolean r4 = r6.q()
            if (r4 == 0) goto L57
            j$.util.function.Predicate r4 = r6.f7163e
            java.lang.Object r5 = r6.f7164f
            boolean r4 = r4.g(r5)
            if (r4 == 0) goto L57
            r0 = 1
            goto L3e
        L57:
            if (r2 == 0) goto L6a
            if (r0 == 0) goto L60
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f7172b
            r0.set(r3)
        L60:
            java.lang.Object r0 = r6.f7164f
            r7.accept(r0)
            goto L6a
        L66:
            boolean r2 = r1.p(r7)
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.f4.p(j$.util.function.Consumer):boolean");
    }

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public Spliterator trySplit() {
        switch (this.f7165g) {
            case 1:
                if (this.f7172b.get()) {
                    return null;
                }
                return super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.g4
    final Spliterator u(Spliterator spliterator) {
        switch (this.f7165g) {
            case 0:
                return new f4(spliterator, this, 0);
            default:
                return new f4(spliterator, this, 1);
        }
    }
}
