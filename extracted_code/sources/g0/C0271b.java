package g0;

import D1.I;
import D1.r;
import N.k;
import R.H;
import R.U;
import android.graphics.Bitmap;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import o0.InterfaceC0699x;
import o0.Q;
import o0.b0;
import p0.C0735h;
import r2.InterfaceC0768c;
import w0.o;
/* renamed from: g0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0271b implements C1.e, U.d, InterfaceC0768c {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f5701m;

    public /* synthetic */ C0271b(int i3) {
        this.f5701m = i3;
    }

    public static Bitmap a(byte[] bArr, int i3) {
        try {
            return android.support.v4.media.session.a.o(bArr, i3);
        } catch (H e2) {
            throw new Exception("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i3 + ")", e2);
        } catch (IOException e3) {
            throw new Exception(e3);
        }
    }

    @Override // U.d
    public void accept(Object obj) {
        ((Q) obj).f8517b.getClass();
    }

    @Override // C1.e
    public Object apply(Object obj) {
        switch (this.f5701m) {
            case 1:
                return I.o(Integer.valueOf(((C0735h) obj).f8801m));
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return ((o) obj).d().getClass().getSimpleName();
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                b0 g3 = ((InterfaceC0699x) obj).g();
                return I.j(r.w(g3.f8580b, new C0271b(5)));
            case k.LONG_FIELD_NUMBER /* 4 */:
            default:
                return Long.valueOf(((T0.a) obj).f2299c);
            case k.STRING_FIELD_NUMBER /* 5 */:
                return Integer.valueOf(((U) obj).f1823c);
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                return Long.valueOf(((T0.a) obj).f2298b);
        }
    }

    public Constructor b() {
        switch (this.f5701m) {
            case 9:
                if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return null;
                }
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(o.class).getConstructor(Integer.TYPE);
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(o.class).getConstructor(null);
        }
    }

    @Override // r2.InterfaceC0768c
    public boolean d(View view) {
        return view.hasFocus();
    }
}
