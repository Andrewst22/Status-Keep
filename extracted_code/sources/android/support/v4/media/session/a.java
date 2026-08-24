package android.support.v4.media.session;

import A.f;
import C2.p;
import D1.g0;
import D2.h;
import D2.i;
import H.d;
import H.e;
import H.m;
import H.n;
import H.o;
import K2.AbstractC0072a;
import N.k;
import P.c;
import P.g;
import P2.AbstractC0097a;
import R.F;
import R.G;
import R.H;
import U.A;
import U.AbstractC0123a;
import U.t;
import a.AbstractC0155a;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.EdgeEffect;
import android.widget.TextView;
import c0.C0222b;
import c0.j;
import d1.C0255e;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import l.C0581t;
import l.u0;
import m2.AbstractC0635d;
import n2.AbstractC0664g;
import s2.C0808g;
import t2.AbstractC0828e;
import w0.l;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f3902a;

    public static f A(C0581t c0581t) {
        int i3;
        int i4;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            return new f(o.c(c0581t));
        }
        TextPaint textPaint = new TextPaint(c0581t.getPaint());
        boolean z3 = false;
        if (i5 >= 23) {
            i3 = 1;
            i4 = 1;
        } else {
            i3 = 0;
            i4 = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i5 >= 23) {
            i3 = m.a(c0581t);
            i4 = m.d(c0581t);
        }
        if (c0581t.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i5 >= 28 && (c0581t.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(o.b(n.a(c0581t.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        } else {
            if (c0581t.getLayoutDirection() == 1) {
                z3 = true;
            }
            switch (c0581t.getTextDirection()) {
                case k.FLOAT_FIELD_NUMBER /* 2 */:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case k.INTEGER_FIELD_NUMBER /* 3 */:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case k.LONG_FIELD_NUMBER /* 4 */:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case k.STRING_FIELD_NUMBER /* 5 */:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case k.STRING_SET_FIELD_NUMBER /* 6 */:
                    break;
                case k.DOUBLE_FIELD_NUMBER /* 7 */:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z3) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    }
                    break;
            }
        }
        return new f(textPaint, textDirectionHeuristic, i3, i4);
    }

    public static int B(int i3, int i4, int i5, int[] iArr) {
        while (i4 < i5) {
            if (iArr[i4] == i3) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int C(String str) {
        char c3;
        if (str == null) {
            return -1;
        }
        String l3 = G.l(str);
        l3.getClass();
        switch (l3.hashCode()) {
            case -2123537834:
                if (l3.equals("audio/eac3-joc")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case -1662384011:
                if (l3.equals("video/mp2p")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case -1662384007:
                if (l3.equals("video/mp2t")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case -1662095187:
                if (l3.equals("video/webm")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case -1606874997:
                if (l3.equals("audio/amr-wb")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case -1487656890:
                if (l3.equals("image/avif")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case -1487464693:
                if (l3.equals("image/heic")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case -1487464690:
                if (l3.equals("image/heif")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case -1487394660:
                if (l3.equals("image/jpeg")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case -1487018032:
                if (l3.equals("image/webp")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case -1248337486:
                if (l3.equals("application/mp4")) {
                    c3 = '\n';
                    break;
                }
                c3 = 65535;
                break;
            case -1079884372:
                if (l3.equals("video/x-msvideo")) {
                    c3 = 11;
                    break;
                }
                c3 = 65535;
                break;
            case -1004728940:
                if (l3.equals("text/vtt")) {
                    c3 = '\f';
                    break;
                }
                c3 = 65535;
                break;
            case -879272239:
                if (l3.equals("image/bmp")) {
                    c3 = '\r';
                    break;
                }
                c3 = 65535;
                break;
            case -879258763:
                if (l3.equals("image/png")) {
                    c3 = 14;
                    break;
                }
                c3 = 65535;
                break;
            case -387023398:
                if (l3.equals("audio/x-matroska")) {
                    c3 = 15;
                    break;
                }
                c3 = 65535;
                break;
            case -43467528:
                if (l3.equals("application/webm")) {
                    c3 = 16;
                    break;
                }
                c3 = 65535;
                break;
            case 13915911:
                if (l3.equals("video/x-flv")) {
                    c3 = 17;
                    break;
                }
                c3 = 65535;
                break;
            case 187078296:
                if (l3.equals("audio/ac3")) {
                    c3 = 18;
                    break;
                }
                c3 = 65535;
                break;
            case 187078297:
                if (l3.equals("audio/ac4")) {
                    c3 = 19;
                    break;
                }
                c3 = 65535;
                break;
            case 187078669:
                if (l3.equals("audio/amr")) {
                    c3 = 20;
                    break;
                }
                c3 = 65535;
                break;
            case 187090232:
                if (l3.equals("audio/mp4")) {
                    c3 = 21;
                    break;
                }
                c3 = 65535;
                break;
            case 187091926:
                if (l3.equals("audio/ogg")) {
                    c3 = 22;
                    break;
                }
                c3 = 65535;
                break;
            case 187099443:
                if (l3.equals("audio/wav")) {
                    c3 = 23;
                    break;
                }
                c3 = 65535;
                break;
            case 1331848029:
                if (l3.equals("video/mp4")) {
                    c3 = 24;
                    break;
                }
                c3 = 65535;
                break;
            case 1503095341:
                if (l3.equals("audio/3gpp")) {
                    c3 = 25;
                    break;
                }
                c3 = 65535;
                break;
            case 1504578661:
                if (l3.equals("audio/eac3")) {
                    c3 = 26;
                    break;
                }
                c3 = 65535;
                break;
            case 1504619009:
                if (l3.equals("audio/flac")) {
                    c3 = 27;
                    break;
                }
                c3 = 65535;
                break;
            case 1504824762:
                if (l3.equals("audio/midi")) {
                    c3 = 28;
                    break;
                }
                c3 = 65535;
                break;
            case 1504831518:
                if (l3.equals("audio/mpeg")) {
                    c3 = 29;
                    break;
                }
                c3 = 65535;
                break;
            case 1505118770:
                if (l3.equals("audio/webm")) {
                    c3 = 30;
                    break;
                }
                c3 = 65535;
                break;
            case 2039520277:
                if (l3.equals("video/x-matroska")) {
                    c3 = 31;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
            case 18:
            case 26:
                return 0;
            case 1:
                return 10;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return 11;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
            case 15:
            case 16:
            case 30:
            case 31:
                return 6;
            case k.LONG_FIELD_NUMBER /* 4 */:
            case 20:
            case 25:
                return 3;
            case k.STRING_FIELD_NUMBER /* 5 */:
                return 21;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                return 20;
            case k.BYTES_FIELD_NUMBER /* 8 */:
                return 14;
            case '\t':
                return 18;
            case '\n':
            case 21:
            case 24:
                return 8;
            case 11:
                return 16;
            case '\f':
                return 13;
            case '\r':
                return 19;
            case 14:
                return 17;
            case 17:
                return 5;
            case 19:
                return 1;
            case 22:
                return 9;
            case 23:
                return 12;
            case 27:
                return 4;
            case 28:
                return 15;
            case 29:
                return 7;
            default:
                return -1;
        }
    }

    public static int D(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
            if (lastPathSegment.endsWith(".ac4")) {
                return 1;
            }
            if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                if (lastPathSegment.endsWith(".amr")) {
                    return 3;
                }
                if (lastPathSegment.endsWith(".flac")) {
                    return 4;
                }
                if (lastPathSegment.endsWith(".flv")) {
                    return 5;
                }
                if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                    if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                        if (lastPathSegment.endsWith(".mp3")) {
                            return 7;
                        }
                        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                            if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                    if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                        if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                            if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                    if (lastPathSegment.endsWith(".avi")) {
                                                        return 16;
                                                    }
                                                    if (lastPathSegment.endsWith(".png")) {
                                                        return 17;
                                                    }
                                                    if (lastPathSegment.endsWith(".webp")) {
                                                        return 18;
                                                    }
                                                    if (!lastPathSegment.endsWith(".bmp") && !lastPathSegment.endsWith(".dib")) {
                                                        if (!lastPathSegment.endsWith(".heic") && !lastPathSegment.endsWith(".heif")) {
                                                            if (!lastPathSegment.endsWith(".avif")) {
                                                                return -1;
                                                            }
                                                            return 21;
                                                        }
                                                        return 20;
                                                    }
                                                    return 19;
                                                }
                                                return 14;
                                            }
                                            return 13;
                                        }
                                        return 12;
                                    }
                                    return 11;
                                }
                                return 10;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 6;
                }
                return 15;
            }
            return 2;
        }
        return 0;
    }

    public static boolean E(byte b3) {
        if (b3 > -65) {
            return true;
        }
        return false;
    }

    public static String F(String str, Object... objArr) {
        int indexOf;
        String str2;
        int i3 = 0;
        for (int i4 = 0; i4 < objArr.length; i4++) {
            Object obj = objArr[i4];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e2) {
                    String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str3, (Throwable) e2);
                    str2 = "<" + str3 + " threw " + e2.getClass().getName() + ">";
                }
            }
            objArr[i4] = str2;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i5 = 0;
        while (i3 < objArr.length && (indexOf = str.indexOf("%s", i5)) != -1) {
            sb.append((CharSequence) str, i5, indexOf);
            sb.append(objArr[i3]);
            i5 = indexOf + 2;
            i3++;
        }
        sb.append((CharSequence) str, i5, str.length());
        if (i3 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i3]);
            for (int i6 = i3 + 1; i6 < objArr.length; i6++) {
                sb.append(", ");
                sb.append(objArr[i6]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static float G(EdgeEffect edgeEffect, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.c(edgeEffect, f3, f4);
        }
        d.a(edgeEffect, f3, f4);
        return f3;
    }

    public static R1.a H(W1.d dVar, Uri uri, boolean z3) {
        String str;
        FileOutputStream fileOutputStream;
        Log.i("FilePickerUtils", "Caching from URI: " + uri.toString());
        String x = x(uri, dVar);
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.getCacheDir().getAbsolutePath());
        sb.append("/file_picker/");
        sb.append(System.currentTimeMillis());
        sb.append("/");
        if (x != null) {
            str = x;
        } else {
            str = "unamed";
        }
        sb.append(str);
        String sb2 = sb.toString();
        File file = new File(sb2);
        byte[] bArr = null;
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                fileOutputStream = new FileOutputStream(sb2);
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = null;
            }
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                InputStream openInputStream = dVar.getContentResolver().openInputStream(uri);
                byte[] bArr2 = new byte[8192];
                while (true) {
                    int read = openInputStream.read(bArr2);
                    if (read < 0) {
                        break;
                    }
                    bufferedOutputStream.write(bArr2, 0, read);
                }
                bufferedOutputStream.flush();
                fileOutputStream.getFD().sync();
            } catch (Exception e3) {
                e = e3;
                try {
                    fileOutputStream.close();
                    Log.e("FilePickerUtils", "Failed to retrieve path: " + e.getMessage(), null);
                    return null;
                } catch (IOException | NullPointerException unused) {
                    Log.e("FilePickerUtils", "Failed to close file streams: " + e.getMessage(), null);
                    return null;
                }
            }
        }
        Log.d("FilePickerUtils", "File loaded and cached at:" + sb2);
        if (z3) {
            try {
                int length = (int) file.length();
                byte[] bArr3 = new byte[length];
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    bufferedInputStream.read(bArr3, 0, length);
                    bufferedInputStream.close();
                } catch (FileNotFoundException e4) {
                    Log.e("FilePickerUtils", "File not found: " + e4.getMessage(), null);
                } catch (IOException e5) {
                    Log.e("FilePickerUtils", "Failed to close file streams: " + e5.getMessage(), null);
                }
                bArr = bArr3;
            } catch (Exception e6) {
                Log.e("FilePickerUtils", "Failed to load bytes into memory with error " + e6.toString() + ". Probably the file is too big to fit device memory. Bytes won't be added to the file this time.");
            }
        }
        return new R1.a(sb2, x, uri, Long.parseLong(String.valueOf(file.length())), bArr);
    }

    public static void I(T0.d dVar, int i3, U.d dVar2) {
        long F3 = dVar.F(i3);
        List A3 = dVar.A(F3);
        if (A3.isEmpty()) {
            return;
        }
        if (i3 != dVar.P() - 1) {
            long F4 = dVar.F(i3 + 1) - dVar.F(i3);
            if (F4 > 0) {
                dVar2.accept(new T0.a(A3, F3, F4));
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public static long J(t tVar, int i3, int i4) {
        tVar.G(i3);
        if (tVar.a() < 5) {
            return -9223372036854775807L;
        }
        int h3 = tVar.h();
        if ((8388608 & h3) != 0 || ((2096896 & h3) >> 8) != i4 || (h3 & 32) == 0 || tVar.u() < 7 || tVar.a() < 7 || (tVar.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        tVar.f(bArr, 0, 6);
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((bArr[4] & 255) >> 7);
    }

    public static void K(File file) {
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    K(file2);
                }
            }
            file.delete();
        }
    }

    public static int M(long j3) {
        if (j3 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j3 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j3;
    }

    public static long N(long j3, long j4) {
        boolean z3;
        boolean z4;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j4) + Long.numberOfLeadingZeros(j4) + Long.numberOfLeadingZeros(~j3) + Long.numberOfLeadingZeros(j3);
        if (numberOfLeadingZeros > 65) {
            return j3 * j4;
        }
        long j5 = ((j3 ^ j4) >>> 63) + Long.MAX_VALUE;
        boolean z5 = false;
        if (numberOfLeadingZeros < 64) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i3 < 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (j4 == Long.MIN_VALUE) {
            z5 = true;
        }
        if (z3 | (z5 & z4)) {
            return j5;
        }
        long j6 = j3 * j4;
        if (i3 != 0 && j6 / j3 != j4) {
            return j5;
        }
        return j6;
    }

    public static void Q(TextView textView, int i3) {
        int i4;
        if (i3 >= 0) {
            if (Build.VERSION.SDK_INT >= 28) {
                o.d(textView, i3);
                return;
            }
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i4 = fontMetricsInt.top;
            } else {
                i4 = fontMetricsInt.ascent;
            }
            if (i3 > Math.abs(i4)) {
                textView.setPadding(textView.getPaddingLeft(), i3 + i4, textView.getPaddingRight(), textView.getPaddingBottom());
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void R(TextView textView, int i3) {
        int i4;
        if (i3 >= 0) {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i4 = fontMetricsInt.bottom;
            } else {
                i4 = fontMetricsInt.descent;
            }
            if (i3 > Math.abs(i4)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i3 - i4);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void S(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        u0 u0Var = u0.f7927j;
        if (u0Var != null && u0Var.f7929a == view) {
            u0.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            u0 u0Var2 = u0.f7928k;
            if (u0Var2 != null && u0Var2.f7929a == view) {
                u0Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new u0(view, charSequence);
    }

    public static C0255e T(int i3, l lVar, t tVar) {
        C0255e b3 = C0255e.b(lVar, tVar);
        while (true) {
            int i4 = b3.f5183a;
            if (i4 != i3) {
                h.n(i4, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
                long j3 = b3.f5184b;
                long j4 = 8 + j3;
                if (j3 % 2 != 0) {
                    j4 = 9 + j3;
                }
                if (j4 <= 2147483647L) {
                    lVar.d((int) j4);
                    b3 = C0255e.b(lVar, tVar);
                } else {
                    throw H.c("Chunk is too large (~2GB+) to skip; id: " + i4);
                }
            } else {
                return b3;
            }
        }
    }

    public static void V(p pVar, AbstractC0072a abstractC0072a, AbstractC0072a abstractC0072a2) {
        try {
            AbstractC0097a.i(AbstractC0664g.p(((w2.b) pVar).d(abstractC0072a, abstractC0072a2)), C0808g.f9229a, null);
        } catch (Throwable th) {
            abstractC0072a2.k(AbstractC0664g.f(th));
            throw th;
        }
    }

    public static int[] X(Collection collection) {
        if (collection instanceof G1.b) {
            G1.b bVar = (G1.b) collection;
            return Arrays.copyOfRange(bVar.f381m, bVar.f382n, bVar.f383o);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            Object obj = array[i3];
            obj.getClass();
            iArr[i3] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a A[LOOP:0: B:23:0x0054->B:25:0x005a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Y(T0.d r13, T0.k r14, U.d r15) {
        /*
            long r0 = r14.f2323a
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto Le
            r5 = 0
            goto L27
        Le:
            int r5 = r13.g(r0)
            r6 = -1
            if (r5 != r6) goto L19
            int r5 = r13.P()
        L19:
            if (r5 <= 0) goto L27
            int r6 = r5 + (-1)
            long r6 = r13.F(r6)
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 != 0) goto L27
            int r5 = r5 + (-1)
        L27:
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L52
            int r2 = r13.P()
            if (r5 >= r2) goto L52
            java.util.List r7 = r13.A(r0)
            long r2 = r13.F(r5)
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L52
            long r8 = r14.f2323a
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 >= 0) goto L52
            T0.a r12 = new T0.a
            long r10 = r2 - r8
            r6 = r12
            r6.<init>(r7, r8, r10)
            r15.accept(r12)
            r2 = 1
            goto L53
        L52:
            r2 = 0
        L53:
            r3 = r5
        L54:
            int r6 = r13.P()
            if (r3 >= r6) goto L60
            I(r13, r3, r15)
            int r3 = r3 + 1
            goto L54
        L60:
            boolean r14 = r14.f2324b
            if (r14 == 0) goto L89
            if (r2 == 0) goto L68
            int r5 = r5 + (-1)
        L68:
            if (r4 >= r5) goto L70
            I(r13, r4, r15)
            int r4 = r4 + 1
            goto L68
        L70:
            if (r2 == 0) goto L89
            T0.a r14 = new T0.a
            java.util.List r7 = r13.A(r0)
            long r8 = r13.F(r5)
            long r2 = r13.F(r5)
            long r10 = r0 - r2
            r6 = r14
            r6.<init>(r7, r8, r10)
            r15.accept(r14)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.a.Y(T0.d, T0.k, U.d):void");
    }

    public static ActionMode.Callback Z(ActionMode.Callback callback, TextView textView) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && i3 <= 27 && !(callback instanceof H.p) && callback != null) {
            return new H.p(callback, textView);
        }
        return callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.util.List r6, K.C0057k r7, w2.b r8) {
        /*
            boolean r0 = r8 instanceof K.C0051e
            if (r0 == 0) goto L13
            r0 = r8
            K.e r0 = (K.C0051e) r0
            int r1 = r0.f616s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f616s = r1
            goto L18
        L13:
            K.e r0 = new K.e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f615r
            v2.a r1 = v2.EnumC0879a.f9494m
            int r2 = r0.f616s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.util.Iterator r6 = r0.f614q
            java.io.Serializable r7 = r0.f613p
            D2.q r7 = (D2.q) r7
            n2.AbstractC0664g.w(r8)     // Catch: java.lang.Throwable -> L30
            goto L65
        L30:
            r8 = move-exception
            goto L7e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.f613p
            java.util.List r6 = (java.util.List) r6
            n2.AbstractC0664g.w(r8)
            goto L5c
        L42:
            n2.AbstractC0664g.w(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            K.g r2 = new K.g
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.f613p = r8
            r0.f616s = r4
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L5b
            goto L93
        L5b:
            r6 = r8
        L5c:
            D2.q r7 = new D2.q
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L65:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()
            C2.l r8 = (C2.l) r8
            r0.f613p = r7     // Catch: java.lang.Throwable -> L30
            r0.f614q = r6     // Catch: java.lang.Throwable -> L30
            r0.f616s = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.b(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto L65
            goto L93
        L7e:
            java.lang.Object r2 = r7.f342m
            if (r2 != 0) goto L85
            r7.f342m = r8
            goto L65
        L85:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            m2.AbstractC0635d.b(r2, r8)
            goto L65
        L8b:
            java.lang.Object r6 = r7.f342m
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L94
            s2.g r1 = s2.C0808g.f9229a
        L93:
            return r1
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.a.a(java.util.List, K.k, w2.b):java.lang.Object");
    }

    public static ArrayList a0(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static final List b(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String th2 = th.toString();
        Throwable cause = th.getCause();
        String stackTraceString = Log.getStackTraceString(th);
        return AbstractC0828e.C(simpleName, th2, "Cause: " + cause + ", Stacktrace: " + stackTraceString);
    }

    public static ArrayList b0(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static List c(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new G1.b(0, iArr.length, iArr);
    }

    public static W.l d(c0.m mVar, String str, j jVar, int i3) {
        W.k kVar = new W.k();
        kVar.f2759a = AbstractC0123a.y(str, jVar.f4756c);
        kVar.f2762d = jVar.f4754a;
        kVar.f2763e = jVar.f4755b;
        String c3 = mVar.c();
        if (c3 == null) {
            c3 = AbstractC0123a.y(((C0222b) mVar.f4762n.get(0)).f4709a, jVar.f4756c).toString();
        }
        kVar.f2764f = c3;
        kVar.f2765g = i3;
        kVar.f2761c = g0.f255s;
        AbstractC0123a.l(kVar.f2759a, "The uri must be set.");
        return new W.l(kVar.f2759a, kVar.f2760b, null, kVar.f2761c, kVar.f2762d, kVar.f2763e, kVar.f2764f, kVar.f2765g);
    }

    public static boolean f(l lVar) {
        t tVar = new t(8);
        int i3 = C0255e.b(lVar, tVar).f5183a;
        if (i3 != 1380533830 && i3 != 1380333108) {
            return false;
        }
        lVar.p(tVar.f2477a, 0, 4, false);
        tVar.G(0);
        int h3 = tVar.h();
        if (h3 != 1463899717) {
            AbstractC0123a.n("WavHeaderReader", "Unsupported form type: " + h3);
            return false;
        }
        return true;
    }

    public static void g(int i3) {
        if (2 <= i3 && i3 < 37) {
            return;
        }
        throw new IllegalArgumentException("radix " + i3 + " was not in valid range " + new G2.a(2, 36, 1));
    }

    public static long h(long j3, long j4) {
        boolean z3;
        long j5 = j3 + j4;
        boolean z4 = false;
        if ((j3 ^ j4) < 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((j3 ^ j5) >= 0) {
            z4 = true;
        }
        if (z3 | z4) {
            return j5;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + j3 + ", " + j4 + ")");
    }

    public static int i(long j3) {
        boolean z3;
        int i3 = (int) j3;
        if (i3 == j3) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0155a.k(z3, "Out of range: %s", j3);
        return i3;
    }

    public static final void j(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC0635d.b(th, th2);
            }
        }
    }

    public static Uri k(int i3, Context context, Uri uri) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            File l3 = l();
            Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(l3);
            decodeStream.compress(Bitmap.CompressFormat.JPEG, i3, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            Uri fromFile = Uri.fromFile(l3);
            if (openInputStream != null) {
                openInputStream.close();
            }
            return fromFile;
        } catch (FileNotFoundException e2) {
            throw new RuntimeException(e2);
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static File l() {
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        return File.createTempFile("JPEG_" + format + "_", ".jpg", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));
    }

    public static Bitmap o(byte[] bArr, int i3) {
        int i4 = 0;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i3, null);
        if (decodeByteArray != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                g gVar = new g(byteArrayInputStream);
                byteArrayInputStream.close();
                c c3 = gVar.c("Orientation");
                int i5 = 1;
                if (c3 != null) {
                    try {
                        i5 = c3.e(gVar.f1416f);
                    } catch (NumberFormatException unused) {
                    }
                }
                switch (i5) {
                    case k.INTEGER_FIELD_NUMBER /* 3 */:
                    case k.LONG_FIELD_NUMBER /* 4 */:
                        i4 = 180;
                        break;
                    case k.STRING_FIELD_NUMBER /* 5 */:
                    case k.BYTES_FIELD_NUMBER /* 8 */:
                        i4 = 270;
                        break;
                    case k.STRING_SET_FIELD_NUMBER /* 6 */:
                    case k.DOUBLE_FIELD_NUMBER /* 7 */:
                        i4 = 90;
                        break;
                }
                if (i4 != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i4);
                    return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
                }
                return decodeByteArray;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw H.a(new IllegalStateException(), "Could not decode image data");
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean p(java.lang.Object r6, java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.a.p(java.lang.Object, java.lang.Object):boolean");
    }

    public static long q(long j3, long j4, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j5 = j3 / j4;
        long j6 = j3 - (j4 * j5);
        int i3 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        if (i3 == 0) {
            return j5;
        }
        int i4 = ((int) ((j3 ^ j4) >> 63)) | 1;
        switch (F1.e.f373a[roundingMode.ordinal()]) {
            case 1:
                if (i3 == 0) {
                    return j5;
                }
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return j5;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                if (i4 >= 0) {
                    return j5;
                }
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                if (i4 <= 0) {
                    return j5;
                }
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
            case k.BYTES_FIELD_NUMBER /* 8 */:
                long abs = Math.abs(j6);
                int i5 = ((abs - (Math.abs(j4) - abs)) > 0L ? 1 : ((abs - (Math.abs(j4) - abs)) == 0L ? 0 : -1));
                if (i5 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j5) == 0)) {
                        return j5;
                    }
                } else if (i5 <= 0) {
                    return j5;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j5 + i4;
    }

    public static T2.b r(String str) {
        byte[] bytes = str.getBytes(J2.a.f495a);
        i.d(bytes, "this as java.lang.String).getBytes(charset)");
        T2.b bVar = new T2.b(bytes);
        bVar.f2357o = str;
        return bVar;
    }

    public static boolean s(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static int t(byte[] bArr) {
        boolean z3;
        if (bArr.length >= 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        int length = bArr.length;
        if (z3) {
            byte b3 = bArr[0];
            byte b4 = bArr[1];
            return (bArr[3] & 255) | ((bArr[2] & 255) << 8) | (b3 << 24) | ((b4 & 255) << 16);
        }
        throw new IllegalArgumentException(F("array too small: %s < %s", Integer.valueOf(length), 4));
    }

    public static long u(long j3, long j4) {
        AbstractC0155a.m("a", j3);
        AbstractC0155a.m("b", j4);
        if (j3 == 0) {
            return j4;
        }
        if (j4 == 0) {
            return j3;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
        long j5 = j3 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j4);
        long j6 = j4 >> numberOfTrailingZeros2;
        while (j5 != j6) {
            long j7 = j5 - j6;
            long j8 = (j7 >> 63) & j7;
            long j9 = (j7 - j8) - j8;
            j6 += j8;
            j5 = j9 >> Long.numberOfTrailingZeros(j9);
        }
        return j5 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static String v(Class cls, Object obj) {
        if (Build.VERSION.SDK_INT < 30) {
            return (String) cls.getMethod("getPath", null).invoke(obj, null);
        }
        File file = (File) cls.getMethod("getDirectory", null).invoke(obj, null);
        if (file != null) {
            return file.getPath();
        }
        return null;
    }

    public static float w(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static String x(Uri uri, W1.d dVar) {
        String str = null;
        try {
            if (uri.getScheme().equals("content")) {
                Cursor query = dVar.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                if (query != null && query.moveToFirst()) {
                    str = query.getString(query.getColumnIndexOrThrow("_display_name"));
                }
                query.close();
            }
            if (str == null) {
                String path = uri.getPath();
                int lastIndexOf = path.lastIndexOf(47);
                if (lastIndexOf != -1) {
                    return path.substring(lastIndexOf + 1);
                }
                return path;
            }
            return str;
        } catch (Exception e2) {
            Log.e("FilePickerUtils", "Failed to handle file name: " + e2.toString());
            return null;
        }
    }

    public static W.l y(int i3) {
        int i4 = A.f2405a;
        Locale locale = Locale.US;
        return new W.l(Uri.parse("rtp://0.0.0.0:" + i3), 1, null, Collections.emptyMap(), 0L, -1L, null, 0);
    }

    public static String[] z(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension((String) arrayList.get(i3));
                if (mimeTypeFromExtension == null) {
                    Log.w("FilePickerUtils", "Custom file type " + ((String) arrayList.get(i3)) + " is unsupported and will be ignored.");
                } else {
                    arrayList2.add(mimeTypeFromExtension);
                }
            }
            Log.d("FilePickerUtils", "Allowed file extensions mimes: " + arrayList2);
            return (String[]) arrayList2.toArray(new String[0]);
        }
        return null;
    }

    public abstract void U();

    public abstract void W();

    public abstract void c0(byte[] bArr, int i3, int i4);

    public boolean e() {
        return false;
    }

    public F m(F0.a aVar) {
        boolean z3;
        ByteBuffer byteBuffer = aVar.f2934q;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        return n(aVar, byteBuffer);
    }

    public abstract F n(F0.a aVar, ByteBuffer byteBuffer);

    public void L() {
    }

    public void O(boolean z3) {
    }

    public void P(boolean z3) {
    }
}
