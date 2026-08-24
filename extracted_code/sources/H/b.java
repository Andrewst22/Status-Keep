package H;

import C.y;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import i1.AbstractC0319r;
import i1.C0303b;
import i1.C0307f;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import k0.C0558m;
import l.A;
import l.C0571i;
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f401m;

    /* renamed from: n  reason: collision with root package name */
    public final Object f402n;

    public /* synthetic */ b(Object obj, int i3) {
        this.f401m = i3;
        this.f402n = obj;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, s0.l] */
    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        C0571i c0571i;
        long j4 = 0;
        ?? r6 = this.f402n;
        switch (this.f401m) {
            case 0:
                g gVar = (g) r6;
                if (gVar.f419o) {
                    boolean z3 = gVar.f417m;
                    a aVar = gVar.f405a;
                    if (z3) {
                        gVar.f417m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f396e = currentAnimationTimeMillis;
                        aVar.f398g = -1L;
                        aVar.f397f = currentAnimationTimeMillis;
                        aVar.f399h = 0.5f;
                    }
                    if ((aVar.f398g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f398g + aVar.f400i) || !gVar.e()) {
                        gVar.f419o = false;
                        return;
                    }
                    boolean z4 = gVar.f418n;
                    ListView listView = gVar.f407c;
                    if (z4) {
                        gVar.f418n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f397f != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float a3 = aVar.a(currentAnimationTimeMillis2);
                        aVar.f397f = currentAnimationTimeMillis2;
                        gVar.f421q.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - aVar.f397f)) * ((a3 * 4.0f) + ((-4.0f) * a3 * a3)) * aVar.f395d));
                        Field field = y.f117a;
                        listView.postOnAnimation(this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                return;
            case 1:
                ((R1.f) ((R1.f) r6).f2093b).c();
                return;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                g.e eVar = (g.e) r6;
                eVar.a(true);
                eVar.invalidateSelf();
                return;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                C0307f c0307f = (C0307f) r6;
                int i3 = c0307f.f6021v;
                ValueAnimator valueAnimator = c0307f.f6020u;
                if (i3 != 1) {
                    if (i3 != 2) {
                        return;
                    }
                } else {
                    valueAnimator.cancel();
                }
                c0307f.f6021v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                AbstractC0319r abstractC0319r = ((RecyclerView) r6).f4446P;
                if (abstractC0319r != null) {
                    C0303b c0303b = (C0303b) abstractC0319r;
                    ArrayList arrayList = c0303b.f5985e;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0303b.f5987g;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0303b.f5988h;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0303b.f5986f;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        if (!it.hasNext()) {
                            arrayList.clear();
                            if (!isEmpty2) {
                                ArrayList arrayList5 = new ArrayList();
                                arrayList5.addAll(arrayList2);
                                ArrayList arrayList6 = c0303b.f5990j;
                                arrayList6.add(arrayList5);
                                arrayList2.clear();
                                if (isEmpty) {
                                    Iterator it2 = arrayList5.iterator();
                                    if (!it2.hasNext()) {
                                        arrayList5.clear();
                                        arrayList6.remove(arrayList5);
                                    } else {
                                        D2.h.q(it2.next());
                                        throw null;
                                    }
                                } else {
                                    D2.h.q(arrayList5.get(0));
                                    throw null;
                                }
                            }
                            if (!isEmpty3) {
                                ArrayList arrayList7 = new ArrayList();
                                arrayList7.addAll(arrayList3);
                                ArrayList arrayList8 = c0303b.f5991k;
                                arrayList8.add(arrayList7);
                                arrayList3.clear();
                                if (isEmpty) {
                                    Iterator it3 = arrayList7.iterator();
                                    if (!it3.hasNext()) {
                                        arrayList7.clear();
                                        arrayList8.remove(arrayList7);
                                    } else {
                                        D2.h.q(it3.next());
                                        throw null;
                                    }
                                } else {
                                    D2.h.q(arrayList7.get(0));
                                    throw null;
                                }
                            }
                            if (!isEmpty4) {
                                ArrayList arrayList9 = new ArrayList();
                                arrayList9.addAll(arrayList4);
                                ArrayList arrayList10 = c0303b.f5989i;
                                arrayList10.add(arrayList9);
                                arrayList4.clear();
                                if (isEmpty && isEmpty2 && isEmpty3) {
                                    Iterator it4 = arrayList9.iterator();
                                    if (!it4.hasNext()) {
                                        arrayList9.clear();
                                        arrayList10.remove(arrayList9);
                                        return;
                                    }
                                    it4.next().getClass();
                                    throw new ClassCastException();
                                }
                                if (!isEmpty2) {
                                    j3 = c0303b.f6048c;
                                } else {
                                    j3 = 0;
                                }
                                if (!isEmpty3) {
                                    j4 = c0303b.f6049d;
                                }
                                Math.max(j3, j4);
                                arrayList9.get(0).getClass();
                                throw new ClassCastException();
                            }
                            return;
                        }
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    return;
                }
                return;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                ((StaggeredGridLayoutManager) r6).J();
                return;
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                A a4 = (A) r6;
                a4.f7712y = null;
                a4.drawableStateChanged();
                return;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                ActionMenuView actionMenuView = ((Toolbar) r6).f4097m;
                if (actionMenuView != null && (c0571i = actionMenuView.f3977E) != null) {
                    c0571i.j();
                    return;
                }
                return;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                r6.k();
                return;
            default:
                Object obj = ((C0558m) r6).f7632n;
                return;
        }
    }

    public b(C0558m c0558m, int i3) {
        this.f401m = 9;
        this.f402n = c0558m;
    }
}
