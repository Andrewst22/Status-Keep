package v;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import n2.AbstractC0664g;
import u.C0843f;
import u.C0844g;
import z.C0911g;
/* loaded from: classes.dex */
public final class j extends AbstractC0664g {
    public static int A(FontStyle fontStyle, FontStyle fontStyle2) {
        int i3;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i3 = 0;
        } else {
            i3 = 2;
        }
        return abs + i3;
    }

    public static Font z(FontFamily fontFamily, int i3) {
        int i4;
        int i5;
        if ((i3 & 1) != 0) {
            i4 = 700;
        } else {
            i4 = 400;
        }
        if ((i3 & 2) != 0) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        FontStyle fontStyle = new FontStyle(i4, i5);
        Font font = fontFamily.getFont(0);
        int A3 = A(fontStyle, font.getStyle());
        for (int i6 = 1; i6 < fontFamily.getSize(); i6++) {
            Font font2 = fontFamily.getFont(i6);
            int A4 = A(fontStyle, font2.getStyle());
            if (A4 < A3) {
                font = font2;
                A3 = A4;
            }
        }
        return font;
    }

    @Override // n2.AbstractC0664g
    public final Typeface g(Context context, C0843f c0843f, Resources resources, int i3) {
        C0844g[] c0844gArr;
        try {
            FontFamily.Builder builder = null;
            for (C0844g c0844g : c0843f.f9278a) {
                try {
                    Font build = new Font.Builder(resources, c0844g.f9284f).setWeight(c0844g.f9280b).setSlant(c0844g.f9281c ? 1 : 0).setTtcIndex(c0844g.f9283e).setFontVariationSettings(c0844g.f9282d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(z(build2, i3).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // n2.AbstractC0664g
    public final Typeface h(Context context, C0911g[] c0911gArr, int i3) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C0911g c0911g : c0911gArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(c0911g.f9758a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor == null) {
                    }
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(c0911g.f9760c).setSlant(c0911g.f9761d ? 1 : 0).setTtcIndex(c0911g.f9759b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(z(build2, i3).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // n2.AbstractC0664g
    public final Typeface i(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // n2.AbstractC0664g
    public final Typeface j(Context context, Resources resources, int i3, String str, int i4) {
        try {
            Font build = new Font.Builder(resources, i3).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // n2.AbstractC0664g
    public final C0911g l(C0911g[] c0911gArr, int i3) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
