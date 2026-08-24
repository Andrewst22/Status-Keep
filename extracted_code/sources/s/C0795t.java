package s;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.example.flutter_application_1.R;
import l.AbstractC0582u;
import t.AbstractC0810b;
/* renamed from: s.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0795t extends AbstractC0771C {

    /* renamed from: e  reason: collision with root package name */
    public int f9138e;

    /* renamed from: f  reason: collision with root package name */
    public U f9139f;

    /* renamed from: g  reason: collision with root package name */
    public PendingIntent f9140g;

    /* renamed from: h  reason: collision with root package name */
    public PendingIntent f9141h;

    /* renamed from: i  reason: collision with root package name */
    public PendingIntent f9142i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f9143j;

    /* renamed from: k  reason: collision with root package name */
    public Integer f9144k;

    /* renamed from: l  reason: collision with root package name */
    public Integer f9145l;

    /* renamed from: m  reason: collision with root package name */
    public IconCompat f9146m;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f9147n;

    @Override // s.AbstractC0771C
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putInt("android.callType", this.f9138e);
        bundle.putBoolean("android.callIsVideo", this.f9143j);
        U u3 = this.f9139f;
        if (u3 != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bundle.putParcelable("android.callPerson", r.b(T.b(u3)));
            } else {
                bundle.putParcelable("android.callPersonCompat", u3.b());
            }
        }
        IconCompat iconCompat = this.f9146m;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                bundle.putParcelable("android.verificationIcon", AbstractC0793q.a(iconCompat.k(this.f9045a.f9113a)));
            } else {
                bundle.putParcelable("android.verificationIconCompat", iconCompat.j());
            }
        }
        bundle.putCharSequence("android.verificationText", this.f9147n);
        bundle.putParcelable("android.answerIntent", this.f9140g);
        bundle.putParcelable("android.declineIntent", this.f9141h);
        bundle.putParcelable("android.hangUpIntent", this.f9142i);
        Integer num = this.f9144k;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.f9145l;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }

    @Override // s.AbstractC0771C
    public final void b(R0.j jVar) {
        CharSequence charSequence;
        String str;
        IconCompat iconCompat;
        int i3 = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) jVar.f2060o;
        String str2 = null;
        r5 = null;
        Notification.CallStyle a3 = null;
        if (i3 >= 31) {
            int i4 = this.f9138e;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (Log.isLoggable("NotifCompat", 3)) {
                            Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f9138e));
                        }
                    } else {
                        U u3 = this.f9139f;
                        u3.getClass();
                        a3 = AbstractC0794s.c(T.b(u3), this.f9142i, this.f9140g);
                    }
                } else {
                    U u4 = this.f9139f;
                    u4.getClass();
                    a3 = AbstractC0794s.b(T.b(u4), this.f9142i);
                }
            } else {
                U u5 = this.f9139f;
                u5.getClass();
                a3 = AbstractC0794s.a(T.b(u5), this.f9141h, this.f9140g);
            }
            if (a3 != null) {
                a3.setBuilder(builder);
                Integer num = this.f9144k;
                if (num != null) {
                    AbstractC0794s.d(a3, num.intValue());
                }
                Integer num2 = this.f9145l;
                if (num2 != null) {
                    AbstractC0794s.f(a3, num2.intValue());
                }
                AbstractC0794s.i(a3, this.f9147n);
                IconCompat iconCompat2 = this.f9146m;
                if (iconCompat2 != null) {
                    AbstractC0794s.h(a3, iconCompat2.k(this.f9045a.f9113a));
                }
                AbstractC0794s.g(a3, this.f9143j);
                return;
            }
            return;
        }
        U u6 = this.f9139f;
        if (u6 != null) {
            charSequence = u6.f9071a;
        } else {
            charSequence = null;
        }
        builder.setContentTitle(charSequence);
        Bundle bundle = this.f9045a.x;
        if (bundle != null && bundle.containsKey("android.text")) {
            str = this.f9045a.x.getCharSequence("android.text");
        } else {
            str = null;
        }
        if (str == null) {
            int i5 = this.f9138e;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        str2 = this.f9045a.f9113a.getResources().getString(R.string.call_notification_screening_text);
                    }
                } else {
                    str2 = this.f9045a.f9113a.getResources().getString(R.string.call_notification_ongoing_text);
                }
            } else {
                str2 = this.f9045a.f9113a.getResources().getString(R.string.call_notification_incoming_text);
            }
            str = str2;
        }
        builder.setContentText(str);
        U u7 = this.f9139f;
        if (u7 != null) {
            if (i3 >= 23 && (iconCompat = u7.f9072b) != null) {
                AbstractC0793q.c(builder, iconCompat.k(this.f9045a.f9113a));
            }
            if (i3 >= 28) {
                U u8 = this.f9139f;
                u8.getClass();
                r.a(builder, T.b(u8));
            } else {
                AbstractC0792p.a(builder, this.f9139f.f9073c);
            }
        }
        AbstractC0792p.b(builder, "call");
    }

    @Override // s.AbstractC0771C
    public final String c() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override // s.AbstractC0771C
    public final void g(Bundle bundle) {
        Integer num;
        super.g(bundle);
        this.f9138e = bundle.getInt("android.callType");
        this.f9143j = bundle.getBoolean("android.callIsVideo");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28 && bundle.containsKey("android.callPerson")) {
            this.f9139f = T.a(X1.i.d(bundle.getParcelable("android.callPerson")));
        } else if (bundle.containsKey("android.callPersonCompat")) {
            this.f9139f = U.a(bundle.getBundle("android.callPersonCompat"));
        }
        if (i3 >= 23 && bundle.containsKey("android.verificationIcon")) {
            this.f9146m = IconCompat.b(AbstractC0582u.c(bundle.getParcelable("android.verificationIcon")));
        } else if (bundle.containsKey("android.verificationIconCompat")) {
            this.f9146m = IconCompat.a(bundle.getBundle("android.verificationIconCompat"));
        }
        this.f9147n = bundle.getCharSequence("android.verificationText");
        this.f9140g = (PendingIntent) bundle.getParcelable("android.answerIntent");
        this.f9141h = (PendingIntent) bundle.getParcelable("android.declineIntent");
        this.f9142i = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
        Integer num2 = null;
        if (bundle.containsKey("android.answerColor")) {
            num = Integer.valueOf(bundle.getInt("android.answerColor"));
        } else {
            num = null;
        }
        this.f9144k = num;
        if (bundle.containsKey("android.declineColor")) {
            num2 = Integer.valueOf(bundle.getInt("android.declineColor"));
        }
        this.f9145l = num2;
    }

    public final C0785i h(int i3, int i4, Integer num, int i5, PendingIntent pendingIntent) {
        int color;
        if (num == null) {
            Context context = this.f9045a.f9113a;
            if (Build.VERSION.SDK_INT >= 23) {
                color = AbstractC0810b.a(context, i5);
            } else {
                color = context.getResources().getColor(i5);
            }
            num = Integer.valueOf(color);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f9045a.f9113a.getResources().getString(i4));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        Context context2 = this.f9045a.f9113a;
        PorterDuff.Mode mode = IconCompat.f4125k;
        context2.getClass();
        C0785i a3 = new C0784h(IconCompat.e(context2.getResources(), context2.getPackageName(), i3), spannableStringBuilder, pendingIntent).a();
        a3.f9090a.putBoolean("key_action_priority", true);
        return a3;
    }
}
