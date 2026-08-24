package i1;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import y.AbstractC0903b;
/* renamed from: i1.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0310i implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public static final ThreadLocal f6031q = new ThreadLocal();

    /* renamed from: r  reason: collision with root package name */
    public static final K1.i f6032r = new K1.i(2);

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f6033m;

    /* renamed from: n  reason: collision with root package name */
    public long f6034n;

    /* renamed from: o  reason: collision with root package name */
    public long f6035o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f6036p;

    public final void a(RecyclerView recyclerView, int i3, int i4) {
        if (recyclerView.f4484y && this.f6034n == 0) {
            this.f6034n = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0308g c0308g = recyclerView.f4462i0;
        c0308g.f6023a = i3;
        c0308g.f6024b = i4;
    }

    public final void b(long j3) {
        C0309h c0309h;
        RecyclerView recyclerView;
        ArrayList arrayList = this.f6033m;
        int size = arrayList.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0308g c0308g = recyclerView2.f4462i0;
                c0308g.f6025c = 0;
                i3 += c0308g.f6025c;
            }
        }
        ArrayList arrayList2 = this.f6036p;
        arrayList2.ensureCapacity(i3);
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i5);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0308g c0308g2 = recyclerView3.f4462i0;
                Math.abs(c0308g2.f6023a);
                Math.abs(c0308g2.f6024b);
                if (c0308g2.f6025c * 2 > 0) {
                    if (arrayList2.size() <= 0) {
                        arrayList2.add(new Object());
                    } else {
                        C0309h c0309h2 = (C0309h) arrayList2.get(0);
                    }
                    throw null;
                }
            }
        }
        Collections.sort(arrayList2, f6032r);
        if (arrayList2.size() > 0 && (recyclerView = (c0309h = (C0309h) arrayList2.get(0)).f6029d) != null) {
            int i6 = c0309h.f6030e;
            if (recyclerView.f4472p.e0() <= 0) {
                z zVar = recyclerView.f4466m;
                try {
                    recyclerView.f4440I++;
                    zVar.d(i6);
                    throw null;
                } catch (Throwable th) {
                    int i7 = recyclerView.f4440I - 1;
                    recyclerView.f4440I = i7;
                    if (i7 < 1) {
                        recyclerView.f4440I = 0;
                    }
                    throw th;
                }
            }
            RecyclerView.j(recyclerView.f4472p.d0(0));
            throw null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i3 = AbstractC0903b.f9700a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f6033m;
            if (arrayList.isEmpty()) {
                this.f6034n = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i4);
                if (recyclerView.getWindowVisibility() == 0) {
                    j3 = Math.max(recyclerView.getDrawingTime(), j3);
                }
            }
            if (j3 == 0) {
                this.f6034n = 0L;
                Trace.endSection();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j3) + this.f6035o);
            this.f6034n = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f6034n = 0L;
            int i5 = AbstractC0903b.f9700a;
            Trace.endSection();
            throw th;
        }
    }
}
