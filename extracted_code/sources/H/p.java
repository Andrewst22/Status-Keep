package H;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class p implements ActionMode.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final ActionMode.Callback f423a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f424b;

    /* renamed from: c  reason: collision with root package name */
    public Class f425c;

    /* renamed from: d  reason: collision with root package name */
    public Method f426d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f427e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f428f = false;

    public p(ActionMode.Callback callback, TextView textView) {
        this.f423a = callback;
        this.f424b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f423a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f423a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f423a.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Method declaredMethod;
        boolean z3;
        int checkSelfPermission;
        TextView textView = this.f424b;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.f428f) {
            this.f428f = true;
            try {
                Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f425c = cls;
                this.f426d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                this.f427e = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f425c = null;
                this.f426d = null;
                this.f427e = false;
            }
        }
        try {
            if (this.f427e && this.f425c.isInstance(menu)) {
                declaredMethod = this.f426d;
            } else {
                declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
            }
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (str != null) {
                                checkSelfPermission = context.checkSelfPermission(str);
                                if (checkSelfPermission == 0) {
                                }
                            }
                        }
                    }
                    arrayList.add(resolveInfo);
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i3);
                MenuItem add = menu.add(0, 0, i3 + 100, resolveInfo2.loadLabel(packageManager));
                Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
                if ((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Intent putExtra = type.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z3);
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f423a.onPrepareActionMode(actionMode, menu);
    }
}
