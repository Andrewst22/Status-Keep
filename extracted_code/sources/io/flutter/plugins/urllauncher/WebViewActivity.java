package io.flutter.plugins.urllauncher;

import U.q;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import n2.C0666i;
import n2.C0668k;
import t.AbstractC0811c;
import t.AbstractC0813e;
/* loaded from: classes.dex */
public class WebViewActivity extends Activity {

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ int f6279q = 0;

    /* renamed from: o  reason: collision with root package name */
    public WebView f6282o;

    /* renamed from: m  reason: collision with root package name */
    public final q f6280m = new q(this, 2);

    /* renamed from: n  reason: collision with root package name */
    public final C0666i f6281n = new WebViewClient();

    /* renamed from: p  reason: collision with root package name */
    public final IntentFilter f6283p = new IntentFilter("close action");

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Map<String, String> map;
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f6282o = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        Bundle bundleExtra = intent.getBundleExtra("com.android.browser.headers");
        if (bundleExtra == null) {
            map = Collections.emptyMap();
        } else {
            HashMap hashMap = new HashMap();
            for (String str : bundleExtra.keySet()) {
                hashMap.put(str, bundleExtra.getString(str));
            }
            map = hashMap;
        }
        this.f6282o.loadUrl(stringExtra, map);
        this.f6282o.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f6282o.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f6282o.setWebViewClient(this.f6281n);
        this.f6282o.getSettings().setSupportMultipleWindows(true);
        this.f6282o.setWebChromeClient(new C0668k(this));
        IntentFilter intentFilter = this.f6283p;
        int i3 = Build.VERSION.SDK_INT;
        BroadcastReceiver broadcastReceiver = this.f6280m;
        if (i3 >= 33) {
            AbstractC0813e.a(this, broadcastReceiver, intentFilter, null, null, 2);
        } else if (i3 >= 26) {
            AbstractC0811c.a(this, broadcastReceiver, intentFilter, null, null, 2);
        } else {
            registerReceiver(broadcastReceiver, intentFilter, null, null);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f6280m);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (i3 == 4 && this.f6282o.canGoBack()) {
            this.f6282o.goBack();
            return true;
        }
        return super.onKeyDown(i3, keyEvent);
    }
}
