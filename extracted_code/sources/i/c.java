package I;

import D2.h;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import l.h0;
/* loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable {

    /* renamed from: m  reason: collision with root package name */
    public boolean f443m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f444n;

    /* renamed from: o  reason: collision with root package name */
    public Cursor f445o;

    /* renamed from: p  reason: collision with root package name */
    public Context f446p;

    /* renamed from: q  reason: collision with root package name */
    public int f447q;

    /* renamed from: r  reason: collision with root package name */
    public a f448r;

    /* renamed from: s  reason: collision with root package name */
    public b f449s;

    /* renamed from: t  reason: collision with root package name */
    public d f450t;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f445o;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f448r;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f449s;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f445o = cursor;
            if (cursor != null) {
                a aVar2 = this.f448r;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f449s;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f447q = cursor.getColumnIndexOrThrow("_id");
                this.f443m = true;
                notifyDataSetChanged();
            } else {
                this.f447q = -1;
                this.f443m = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (this.f443m && (cursor = this.f445o) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        if (this.f443m) {
            this.f445o.moveToPosition(i3);
            if (view == null) {
                h0 h0Var = (h0) this;
                view = h0Var.f7828w.inflate(h0Var.f7827v, viewGroup, false);
            }
            a(view, this.f445o);
            return view;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.Filter, I.d] */
    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f450t == null) {
            ?? filter = new Filter();
            filter.f451a = this;
            this.f450t = filter;
        }
        return this.f450t;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i3) {
        Cursor cursor;
        if (this.f443m && (cursor = this.f445o) != null) {
            cursor.moveToPosition(i3);
            return this.f445o;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        Cursor cursor;
        if (!this.f443m || (cursor = this.f445o) == null || !cursor.moveToPosition(i3)) {
            return 0L;
        }
        return this.f445o.getLong(this.f447q);
    }

    @Override // android.widget.Adapter
    public View getView(int i3, View view, ViewGroup viewGroup) {
        if (this.f443m) {
            if (this.f445o.moveToPosition(i3)) {
                if (view == null) {
                    view = d(viewGroup);
                }
                a(view, this.f445o);
                return view;
            }
            throw new IllegalStateException(h.k("couldn't move cursor to position ", i3));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
