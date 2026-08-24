package l;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.example.flutter_application_1.R;
import d2.InterfaceC0258b;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class v0 implements InterfaceC0258b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7950a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7951b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f7952c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f7953d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f7954e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f7955f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f7956g;

    public v0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f7953d = layoutParams;
        this.f7954e = new Rect();
        this.f7955f = new int[2];
        this.f7956g = new int[2];
        this.f7950a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f7951b = inflate;
        this.f7952c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(v0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131623940;
        layoutParams.flags = 24;
    }

    public void a(g2.t tVar) {
        ((HashSet) this.f7953d).add(tVar);
    }

    public v0(W1.d dVar, androidx.lifecycle.t tVar) {
        this.f7952c = new HashSet();
        this.f7953d = new HashSet();
        this.f7954e = new HashSet();
        this.f7955f = new HashSet();
        new HashSet();
        this.f7956g = new HashSet();
        this.f7950a = dVar;
        this.f7951b = new HiddenLifecycleReference(tVar);
    }
}
