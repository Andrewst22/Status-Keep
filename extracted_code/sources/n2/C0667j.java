package n2;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* renamed from: n2.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0667j extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0668k f8408a;

    public C0667j(C0668k c0668k) {
        this.f8408a = c0668k;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f8408a.f8409a.f6282o.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f8408a.f8409a.f6282o.loadUrl(str);
        return true;
    }
}
