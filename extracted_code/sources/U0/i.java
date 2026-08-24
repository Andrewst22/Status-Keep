package U0;

import C1.j;
import U.A;
import U.AbstractC0123a;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
/* loaded from: classes.dex */
public abstract class i implements T0.e {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque f2573a = new ArrayDeque();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f2574b;

    /* renamed from: c  reason: collision with root package name */
    public final PriorityQueue f2575c;

    /* renamed from: d  reason: collision with root package name */
    public h f2576d;

    /* renamed from: e  reason: collision with root package name */
    public long f2577e;

    /* renamed from: f  reason: collision with root package name */
    public long f2578f;

    /* renamed from: g  reason: collision with root package name */
    public long f2579g;

    public i() {
        for (int i3 = 0; i3 < 10; i3++) {
            this.f2573a.add(new X.f(1));
        }
        this.f2574b = new ArrayDeque();
        for (int i4 = 0; i4 < 2; i4++) {
            ArrayDeque arrayDeque = this.f2574b;
            B0.a aVar = new B0.a(this, 4);
            T0.c cVar = new T0.c();
            cVar.f2307t = aVar;
            arrayDeque.add(cVar);
        }
        this.f2575c = new PriorityQueue();
        this.f2579g = -9223372036854775807L;
    }

    @Override // X.c
    public final void a(T0.i iVar) {
        boolean z3;
        if (iVar == this.f2576d) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        h hVar = (h) iVar;
        long j3 = this.f2579g;
        if (j3 != -9223372036854775807L && hVar.f2936s < j3) {
            hVar.e();
            this.f2573a.add(hVar);
        } else {
            long j4 = this.f2578f;
            this.f2578f = 1 + j4;
            hVar.f2572w = j4;
            this.f2575c.add(hVar);
        }
        this.f2576d = null;
    }

    @Override // T0.e
    public final void b(long j3) {
        this.f2577e = j3;
    }

    @Override // X.c
    public final Object d() {
        boolean z3;
        if (this.f2576d == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        ArrayDeque arrayDeque = this.f2573a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        h hVar = (h) arrayDeque.pollFirst();
        this.f2576d = hVar;
        return hVar;
    }

    @Override // X.c
    public final void e(long j3) {
        this.f2579g = j3;
    }

    public abstract j f();

    @Override // X.c
    public void flush() {
        ArrayDeque arrayDeque;
        this.f2578f = 0L;
        this.f2577e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f2575c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f2573a;
            if (isEmpty) {
                break;
            }
            h hVar = (h) priorityQueue.poll();
            int i3 = A.f2405a;
            hVar.e();
            arrayDeque.add(hVar);
        }
        h hVar2 = this.f2576d;
        if (hVar2 != null) {
            hVar2.e();
            arrayDeque.add(hVar2);
            this.f2576d = null;
        }
    }

    public abstract void g(h hVar);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        return null;
     */
    @Override // X.c
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T0.c c() {
        /*
            r8 = this;
            java.util.ArrayDeque r0 = r8.f2574b
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.PriorityQueue r1 = r8.f2575c
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L6a
            java.lang.Object r3 = r1.peek()
            U0.h r3 = (U0.h) r3
            int r4 = U.A.f2405a
            long r3 = r3.f2936s
            long r5 = r8.f2577e
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L6a
            java.lang.Object r1 = r1.poll()
            U0.h r1 = (U0.h) r1
            r3 = 4
            boolean r4 = r1.c(r3)
            java.util.ArrayDeque r5 = r8.f2573a
            if (r4 == 0) goto L41
            java.lang.Object r0 = r0.pollFirst()
            T0.c r0 = (T0.c) r0
            r0.a(r3)
            r1.e()
            r5.add(r1)
            return r0
        L41:
            r8.g(r1)
            boolean r3 = r8.i()
            if (r3 == 0) goto L63
            C1.j r2 = r8.f()
            java.lang.Object r0 = r0.pollFirst()
            T0.c r0 = (T0.c) r0
            long r3 = r1.f2936s
            r0.f2939o = r3
            r0.f2304q = r2
            r0.f2305r = r3
            r1.e()
            r5.add(r1)
            return r0
        L63:
            r1.e()
            r5.add(r1)
            goto La
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.i.c():T0.c");
    }

    public abstract boolean i();

    @Override // X.c
    public void release() {
    }
}
