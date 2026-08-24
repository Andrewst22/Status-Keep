package l;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.example.flutter_application_1.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class h0 extends I.c implements View.OnClickListener {

    /* renamed from: K  reason: collision with root package name */
    public static final /* synthetic */ int f7815K = 0;

    /* renamed from: A  reason: collision with root package name */
    public final WeakHashMap f7816A;

    /* renamed from: B  reason: collision with root package name */
    public final int f7817B;

    /* renamed from: C  reason: collision with root package name */
    public int f7818C;

    /* renamed from: D  reason: collision with root package name */
    public ColorStateList f7819D;

    /* renamed from: E  reason: collision with root package name */
    public int f7820E;

    /* renamed from: F  reason: collision with root package name */
    public int f7821F;

    /* renamed from: G  reason: collision with root package name */
    public int f7822G;

    /* renamed from: H  reason: collision with root package name */
    public int f7823H;

    /* renamed from: I  reason: collision with root package name */
    public int f7824I;

    /* renamed from: J  reason: collision with root package name */
    public int f7825J;

    /* renamed from: u  reason: collision with root package name */
    public final int f7826u;

    /* renamed from: v  reason: collision with root package name */
    public final int f7827v;

    /* renamed from: w  reason: collision with root package name */
    public final LayoutInflater f7828w;
    public final SearchView x;

    /* renamed from: y  reason: collision with root package name */
    public final SearchableInfo f7829y;

    /* renamed from: z  reason: collision with root package name */
    public final Context f7830z;

    public h0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f444n = true;
        this.f445o = null;
        this.f443m = false;
        this.f446p = context;
        this.f447q = -1;
        this.f448r = new I.a(this);
        this.f449s = new I.b(this, 0);
        this.f7827v = suggestionRowLayout;
        this.f7826u = suggestionRowLayout;
        this.f7828w = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f7818C = 1;
        this.f7820E = -1;
        this.f7821F = -1;
        this.f7822G = -1;
        this.f7823H = -1;
        this.f7824I = -1;
        this.f7825J = -1;
        SearchManager searchManager = (SearchManager) this.f446p.getSystemService("search");
        this.x = searchView;
        this.f7829y = searchableInfo;
        this.f7817B = searchView.getSuggestionCommitIconResId();
        this.f7830z = context;
        this.f7816A = weakHashMap;
    }

    public static String h(Cursor cursor, int i3) {
        if (i3 == -1) {
            return null;
        }
        try {
            return cursor.getString(i3);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014b  */
    @Override // I.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r22, android.database.Cursor r23) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.h0.a(android.view.View, android.database.Cursor):void");
    }

    @Override // I.c
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f7820E = cursor.getColumnIndex("suggest_text_1");
                this.f7821F = cursor.getColumnIndex("suggest_text_2");
                this.f7822G = cursor.getColumnIndex("suggest_text_2_url");
                this.f7823H = cursor.getColumnIndex("suggest_icon_1");
                this.f7824I = cursor.getColumnIndex("suggest_icon_2");
                this.f7825J = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // I.c
    public final String c(Cursor cursor) {
        String h3;
        String h4;
        if (cursor == null) {
            return null;
        }
        String h5 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h5 != null) {
            return h5;
        }
        SearchableInfo searchableInfo = this.f7829y;
        if (searchableInfo.shouldRewriteQueryFromData() && (h4 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h4;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h3 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h3;
    }

    @Override // I.c
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f7828w.inflate(this.f7826u, viewGroup, false);
        inflate.setTag(new g0(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f7817B);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f446p.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.h0.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f446p.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // I.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i3, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View inflate = this.f7828w.inflate(this.f7827v, viewGroup, false);
            if (inflate != null) {
                ((g0) inflate.getTag()).f7809a.setText(e2.toString());
            }
            return inflate;
        }
    }

    @Override // I.c, android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i3, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View d3 = d(viewGroup);
            ((g0) d3.getTag()).f7809a.setText(e2.toString());
            return d3;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f445o;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f445o;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.x.n((CharSequence) tag);
        }
    }
}
