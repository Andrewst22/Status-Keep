package s;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.ArrayList;
import java.util.Locale;
/* renamed from: s.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0770B extends AbstractC0771C {

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f9040e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f9041f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public U f9042g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f9043h;

    /* renamed from: i  reason: collision with root package name */
    public Boolean f9044i;

    public C0770B() {
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0168 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static s.C0770B h(android.app.Notification r6) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C0770B.h(android.app.Notification):s.B");
    }

    @Override // s.AbstractC0771C
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.f9042g.f9071a);
        bundle.putBundle("android.messagingStyleUser", this.f9042g.b());
        bundle.putCharSequence("android.hiddenConversationTitle", this.f9043h);
        if (this.f9043h != null && this.f9044i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.f9043h);
        }
        ArrayList arrayList = this.f9040e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", C0769A.a(arrayList));
        }
        ArrayList arrayList2 = this.f9041f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", C0769A.a(arrayList2));
        }
        Boolean bool = this.f9044i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x012d  */
    @Override // s.AbstractC0771C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(R0.j r10) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C0770B.b(R0.j):void");
    }

    @Override // s.AbstractC0771C
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, s.U] */
    @Override // s.AbstractC0771C
    public final void g(Bundle bundle) {
        super.g(bundle);
        ArrayList arrayList = this.f9040e;
        arrayList.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            this.f9042g = U.a(bundle.getBundle("android.messagingStyleUser"));
        } else {
            String string = bundle.getString("android.selfDisplayName");
            ?? obj = new Object();
            obj.f9071a = string;
            obj.f9072b = null;
            obj.f9073c = null;
            obj.f9074d = null;
            obj.f9075e = false;
            obj.f9076f = false;
            this.f9042g = obj;
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.f9043h = charSequence;
        if (charSequence == null) {
            this.f9043h = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            arrayList.addAll(C0769A.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.f9041f.addAll(C0769A.b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.f9044i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    public final boolean i() {
        C0791o c0791o = this.f9045a;
        if (c0791o != null && c0791o.f9113a.getApplicationInfo().targetSdkVersion < 28 && this.f9044i == null) {
            if (this.f9043h == null) {
                return false;
            }
            return true;
        }
        Boolean bool = this.f9044i;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final SpannableStringBuilder j(C0769A c0769a) {
        A.b bVar;
        CharSequence charSequence;
        String str = A.b.f5b;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            bVar = A.b.f8e;
        } else {
            bVar = A.b.f7d;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        U u3 = c0769a.f9036c;
        CharSequence charSequence2 = "";
        if (u3 == null) {
            charSequence = "";
        } else {
            charSequence = u3.f9071a;
        }
        int i3 = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.f9042g.f9071a;
            int i4 = this.f9045a.f9136y;
            if (i4 != 0) {
                i3 = i4;
            }
        }
        SpannableStringBuilder c3 = bVar.c(charSequence);
        spannableStringBuilder.append((CharSequence) c3);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i3), null), spannableStringBuilder.length() - c3.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence3 = c0769a.f9034a;
        if (charSequence3 != null) {
            charSequence2 = charSequence3;
        }
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) bVar.c(charSequence2));
        return spannableStringBuilder;
    }

    public C0770B(U u3) {
        if (!TextUtils.isEmpty(u3.f9071a)) {
            this.f9042g = u3;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
