package e0;

import R.H;
import a.AbstractC0155a;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.example.flutter_application_1.R;
import d1.C0255e;
import g1.InterfaceC0275c;
import g2.x;
import h0.B;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import k.InterfaceC0532n;
import k.MenuC0527i;
import k.SubMenuC0537s;
import k0.C0544G;
import k0.C0545H;
import k0.InterfaceC0549d;
import p.C0726h;
import p.C0727i;
/* loaded from: classes.dex */
public final class l implements f0.p, g2.p, InterfaceC0275c, B, h0.k, InterfaceC0532n, p0.m, s0.o {

    /* renamed from: n  reason: collision with root package name */
    public static l f5258n;

    /* renamed from: o  reason: collision with root package name */
    public static l f5259o;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f5260m;

    public /* synthetic */ l(int i3) {
        this.f5260m = i3;
    }

    public static MediaCodec q(h0.j jVar) {
        h0.o oVar = jVar.f5847a;
        StringBuilder sb = new StringBuilder("createCodec:");
        String str = oVar.f5853a;
        sb.append(str);
        Trace.beginSection(sb.toString());
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static C0255e t(s0.h hVar, B.b bVar) {
        int i3;
        IOException iOException = (IOException) bVar.f23n;
        if (!(iOException instanceof W.w) || ((i3 = ((W.w) iOException).f2804p) != 403 && i3 != 404 && i3 != 410 && i3 != 416 && i3 != 500 && i3 != 503)) {
            return null;
        }
        if (hVar.a(1)) {
            return new C0255e(300000L, 1);
        }
        if (!hVar.a(2)) {
            return null;
        }
        return new C0255e(60000L, 2);
    }

    public static long v(B.b bVar) {
        Throwable th = (IOException) bVar.f23n;
        if (!(th instanceof H) && !(th instanceof FileNotFoundException) && !(th instanceof W.t) && !(th instanceof s0.m)) {
            int i3 = W.i.f2752n;
            while (th != null) {
                if (!(th instanceof W.i) || ((W.i) th).f2753m != 2008) {
                    th = th.getCause();
                }
            }
            return Math.min((bVar.f22m - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    @Override // h0.B
    public boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // h0.B
    public int d() {
        return MediaCodecList.getCodecCount();
    }

    @Override // p0.m
    public long e() {
        throw new NoSuchElementException();
    }

    @Override // f0.p
    public s0.p f(f0.l lVar, f0.i iVar) {
        return new f0.o(lVar, iVar);
    }

    @Override // h0.B
    public MediaCodecInfo g(int i3) {
        return MediaCodecList.getCodecInfoAt(i3);
    }

    @Override // g1.InterfaceC0275c
    public void h(int i3, Serializable serializable) {
        String str;
        switch (this.f5260m) {
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return;
            default:
                switch (i3) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case N.k.LONG_FIELD_NUMBER /* 4 */:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case N.k.STRING_FIELD_NUMBER /* 5 */:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case N.k.BYTES_FIELD_NUMBER /* 8 */:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i3 != 6 && i3 != 7 && i3 != 8) {
                    Log.d("ProfileInstaller", str);
                    return;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                    return;
                }
        }
    }

    @Override // g1.InterfaceC0275c
    public void i() {
        switch (this.f5260m) {
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                return;
        }
    }

    @Override // h0.k
    public h0.l j(h0.j jVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = q(jVar);
            Trace.beginSection("configureCodec");
            mediaCodec.configure(jVar.f5848b, jVar.f5850d, jVar.f5851e, 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new B1.e(mediaCodec);
        } catch (IOException | RuntimeException e2) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e2;
        }
    }

    @Override // p0.m
    public long k() {
        throw new NoSuchElementException();
    }

    @Override // f0.p
    public s0.p l() {
        return new f0.o(f0.l.f5482l, null);
    }

    @Override // h0.B
    public boolean m(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0532n
    public boolean n(SubMenuC0537s subMenuC0537s) {
        return false;
    }

    @Override // p0.m
    public boolean next() {
        return false;
    }

    @Override // h0.B
    public boolean o() {
        return false;
    }

    @Override // g2.p
    public void onMethodCall(g2.o oVar, g2.q qVar) {
        switch (this.f5260m) {
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                ((R1.f) qVar).b(null);
                return;
            default:
                ((R1.f) qVar).b(null);
                return;
        }
    }

    public InterfaceC0549d p(int i3) {
        int i4;
        switch (this.f5260m) {
            case 19:
                C0544G c0544g = new C0544G();
                c0544g.j(android.support.v4.media.session.a.y(i3 * 2));
                return c0544g;
            default:
                C0545H c0545h = new C0545H();
                C0545H c0545h2 = new C0545H();
                boolean z3 = false;
                try {
                    c0545h.f7540m.j(android.support.v4.media.session.a.y(0));
                    int l3 = c0545h.l();
                    if (l3 % 2 == 0) {
                        z3 = true;
                    }
                    if (z3) {
                        i4 = l3 + 1;
                    } else {
                        i4 = l3 - 1;
                    }
                    c0545h2.f7540m.j(android.support.v4.media.session.a.y(i4));
                    if (z3) {
                        c0545h.f7541n = c0545h2;
                        return c0545h;
                    }
                    c0545h2.f7541n = c0545h;
                    return c0545h2;
                } catch (IOException e2) {
                    AbstractC0155a.r(c0545h);
                    AbstractC0155a.r(c0545h2);
                    throw e2;
                }
        }
    }

    public List r(String str) {
        switch (this.f5260m) {
            case 22:
                try {
                    return (List) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
                } catch (IOException | ClassNotFoundException e2) {
                    throw new RuntimeException(e2);
                }
            default:
                D2.i.e(str, "listString");
                Object readObject = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
                D2.i.c(readObject, "null cannot be cast to non-null type kotlin.collections.List<*>");
                ArrayList arrayList = new ArrayList();
                for (Object obj : (List) readObject) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
        }
    }

    public String s(List list) {
        switch (this.f5260m) {
            case 22:
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(list);
                    objectOutputStream.flush();
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            default:
                D2.i.e(list, "list");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                objectOutputStream2.writeObject(list);
                objectOutputStream2.flush();
                String encodeToString = Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 0);
                D2.i.d(encodeToString, "encodeToString(...)");
                return encodeToString;
        }
    }

    public int u(int i3) {
        if (i3 == 7) {
            return 6;
        }
        return 3;
    }

    public CharSequence y(Preference preference) {
        switch (this.f5260m) {
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                EditTextPreference editTextPreference = (EditTextPreference) preference;
                editTextPreference.getClass();
                if (!TextUtils.isEmpty(null)) {
                    return null;
                }
                return editTextPreference.f4406m.getString(R.string.not_set);
            default:
                ListPreference listPreference = (ListPreference) preference;
                listPreference.getClass();
                if (!TextUtils.isEmpty(null)) {
                    return null;
                }
                return listPreference.f4406m.getString(R.string.not_set);
        }
    }

    public /* synthetic */ l(Object obj, int i3) {
        this.f5260m = i3;
    }

    public l() {
        this.f5260m = 18;
        new C0727i();
        new C0726h();
    }

    public l(Y1.b bVar) {
        this.f5260m = 5;
        new g2.r(bVar, "flutter/deferredcomponent", x.f5796a).b(new C0262c(this, 5));
        B1.e.j0().getClass();
        new HashMap();
    }

    private final void w() {
    }

    @Override // s0.o
    public void a() {
    }

    private final void x(int i3, Serializable serializable) {
    }

    @Override // k.InterfaceC0532n
    public void b(MenuC0527i menuC0527i, boolean z3) {
    }
}
