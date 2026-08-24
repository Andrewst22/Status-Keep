package i1;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
/* renamed from: i1.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0294E implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public int f5960m;

    /* renamed from: n  reason: collision with root package name */
    public int f5961n;

    /* renamed from: o  reason: collision with root package name */
    public OverScroller f5962o;

    /* renamed from: p  reason: collision with root package name */
    public Interpolator f5963p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5964q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5965r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f5966s;

    public RunnableC0294E(RecyclerView recyclerView) {
        this.f5966s = recyclerView;
        animation.InterpolatorC0315n animation_interpolatorc0315n = RecyclerView.f4431x0;
        this.f5963p = animation_interpolatorc0315n;
        this.f5964q = false;
        this.f5965r = false;
        this.f5962o = new OverScroller(recyclerView.getContext(), animation_interpolatorc0315n);
    }

    public final void a() {
        if (this.f5964q) {
            this.f5965r = true;
            return;
        }
        RecyclerView recyclerView = this.f5966s;
        recyclerView.removeCallbacks(this);
        Field field = C.y.f117a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean awakenScrollBars;
        boolean z3;
        boolean z4;
        boolean z5;
        RecyclerView recyclerView = this.f5966s;
        if (recyclerView.f4481u == null) {
            recyclerView.removeCallbacks(this);
            this.f5962o.abortAnimation();
            return;
        }
        this.f5965r = false;
        this.f5964q = true;
        recyclerView.d();
        OverScroller overScroller = this.f5962o;
        recyclerView.f4481u.getClass();
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i3 = currX - this.f5960m;
            int i4 = currY - this.f5961n;
            this.f5960m = currX;
            this.f5961n = currY;
            RecyclerView recyclerView2 = this.f5966s;
            int[] iArr = recyclerView.f4473p0;
            if (recyclerView2.f(i3, i4, 1, iArr, null)) {
                i3 -= iArr[0];
                i4 -= iArr[1];
            }
            if (!recyclerView.f4482v.isEmpty()) {
                recyclerView.invalidate();
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.c(i3, i4);
            }
            recyclerView.g(null, 1);
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (i4 != 0 && recyclerView.f4481u.c() && i4 == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i3 != 0 && recyclerView.f4481u.b() && i3 == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i3 != 0 || i4 != 0) && !z4 && !z3) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!overScroller.isFinished() && (z5 || recyclerView.k())) {
                a();
                RunnableC0310i runnableC0310i = recyclerView.f4461h0;
                if (runnableC0310i != null) {
                    runnableC0310i.a(recyclerView, i3, i4);
                }
            } else {
                recyclerView.setScrollState(0);
                if (RecyclerView.f4429v0) {
                    C0308g c0308g = recyclerView.f4462i0;
                    c0308g.getClass();
                    c0308g.f6025c = 0;
                }
                recyclerView.s(1);
            }
        }
        this.f5964q = false;
        if (this.f5965r) {
            a();
        }
    }
}
