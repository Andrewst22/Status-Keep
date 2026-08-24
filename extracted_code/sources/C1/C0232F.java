package c1;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import i1.C0297H;
import java.io.Serializable;
import java.util.ArrayList;
/* renamed from: c1.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232F {

    /* renamed from: a  reason: collision with root package name */
    public int f4817a;

    /* renamed from: b  reason: collision with root package name */
    public int f4818b;

    /* renamed from: c  reason: collision with root package name */
    public int f4819c;

    /* renamed from: d  reason: collision with root package name */
    public final Serializable f4820d;

    /* renamed from: e  reason: collision with root package name */
    public Object f4821e;

    public C0232F(int i3, int i4) {
        this(Integer.MIN_VALUE, i3, i4);
    }

    public void a() {
        int i3;
        int i4 = this.f4819c;
        if (i4 == Integer.MIN_VALUE) {
            i3 = this.f4817a;
        } else {
            i3 = i4 + this.f4818b;
        }
        this.f4819c = i3;
        this.f4821e = ((String) this.f4820d) + this.f4819c;
    }

    public int b(int i3) {
        int i4 = this.f4818b;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (((ArrayList) this.f4820d).size() == 0) {
            return i3;
        }
        ArrayList arrayList = (ArrayList) this.f4820d;
        View view = (View) arrayList.get(arrayList.size() - 1);
        this.f4818b = ((StaggeredGridLayoutManager) this.f4821e).f4488j.b(view);
        ((C0297H) view.getLayoutParams()).getClass();
        return this.f4818b;
    }

    public void c() {
        if (this.f4819c != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public C0232F(int i3, int i4, int i5) {
        String str;
        if (i3 != Integer.MIN_VALUE) {
            str = i3 + "/";
        } else {
            str = "";
        }
        this.f4820d = str;
        this.f4817a = i4;
        this.f4818b = i5;
        this.f4819c = Integer.MIN_VALUE;
        this.f4821e = "";
    }

    public C0232F(StaggeredGridLayoutManager staggeredGridLayoutManager, int i3) {
        this.f4821e = staggeredGridLayoutManager;
        this.f4820d = new ArrayList();
        this.f4817a = Integer.MIN_VALUE;
        this.f4818b = Integer.MIN_VALUE;
        this.f4819c = i3;
    }
}
