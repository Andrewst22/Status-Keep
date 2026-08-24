package n2;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import io.flutter.plugins.urllauncher.WebViewActivity;
/* renamed from: n2.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0668k extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f8409a;

    public C0668k(WebViewActivity webViewActivity) {
        this.f8409a = webViewActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z3, boolean z4, Message message) {
        C0667j c0667j = new C0667j(this);
        WebView webView2 = new WebView(this.f8409a.f6282o.getContext());
        webView2.setWebViewClient(c0667j);
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }
}
