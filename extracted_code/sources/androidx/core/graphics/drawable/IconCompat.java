package androidx.core.graphics.drawable;

import N.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import w.AbstractC0882c;
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f4125k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f4126a;

    /* renamed from: b  reason: collision with root package name */
    public Object f4127b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f4128c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f4129d;

    /* renamed from: e  reason: collision with root package name */
    public int f4130e;

    /* renamed from: f  reason: collision with root package name */
    public int f4131f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f4132g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f4133h;

    /* renamed from: i  reason: collision with root package name */
    public String f4134i;

    /* renamed from: j  reason: collision with root package name */
    public String f4135j;

    public IconCompat() {
        this.f4126a = -1;
        this.f4128c = null;
        this.f4129d = null;
        this.f4130e = 0;
        this.f4131f = 0;
        this.f4132g = null;
        this.f4133h = f4125k;
        this.f4134i = null;
    }

    public static IconCompat a(Bundle bundle) {
        int i3 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i3);
        iconCompat.f4130e = bundle.getInt("int1");
        iconCompat.f4131f = bundle.getInt("int2");
        iconCompat.f4135j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f4132g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f4133h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i3) {
            case -1:
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.f4127b = bundle.getParcelable("obj");
                break;
            case 0:
            default:
                Log.w("IconCompat", "Unknown type " + i3);
                return null;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.f4127b = bundle.getString("obj");
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f4127b = bundle.getByteArray("obj");
                break;
        }
        return iconCompat;
    }

    public static IconCompat b(Icon icon) {
        icon.getClass();
        int c3 = AbstractC0882c.c(icon);
        if (c3 != 2) {
            if (c3 != 4) {
                if (c3 != 6) {
                    IconCompat iconCompat = new IconCompat(-1);
                    iconCompat.f4127b = icon;
                    return iconCompat;
                }
                Uri d3 = AbstractC0882c.d(icon);
                d3.getClass();
                String uri = d3.toString();
                uri.getClass();
                IconCompat iconCompat2 = new IconCompat(6);
                iconCompat2.f4127b = uri;
                return iconCompat2;
            }
            Uri d4 = AbstractC0882c.d(icon);
            d4.getClass();
            String uri2 = d4.toString();
            uri2.getClass();
            IconCompat iconCompat3 = new IconCompat(4);
            iconCompat3.f4127b = uri2;
            return iconCompat3;
        }
        return e(null, AbstractC0882c.b(icon), AbstractC0882c.a(icon));
    }

    public static Bitmap c(Bitmap bitmap, boolean z3) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f3 = min;
        float f4 = 0.5f * f3;
        float f5 = 0.9166667f * f4;
        if (z3) {
            float f6 = 0.010416667f * f3;
            paint.setColor(0);
            paint.setShadowLayer(f6, 0.0f, f3 * 0.020833334f, 1023410176);
            canvas.drawCircle(f4, f4, f5, paint);
            paint.setShadowLayer(f6, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f4, f4, f5, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f4, f4, f5, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat d(Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f4127b = bitmap;
        return iconCompat;
    }

    public static IconCompat e(Resources resources, String str, int i3) {
        str.getClass();
        if (i3 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f4130e = i3;
            if (resources != null) {
                try {
                    iconCompat.f4127b = resources.getResourceName(i3);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f4127b = str;
            }
            iconCompat.f4135j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final Bitmap f() {
        int i3 = this.f4126a;
        if (i3 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f4127b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i3 == 1) {
            return (Bitmap) this.f4127b;
        } else {
            if (i3 == 5) {
                return c((Bitmap) this.f4127b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    public final int g() {
        int i3 = this.f4126a;
        if (i3 == -1 && Build.VERSION.SDK_INT >= 23) {
            return AbstractC0882c.a(this.f4127b);
        }
        if (i3 == 2) {
            return this.f4130e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final int h() {
        int i3 = this.f4126a;
        if (i3 == -1 && Build.VERSION.SDK_INT >= 23) {
            return AbstractC0882c.c(this.f4127b);
        }
        return i3;
    }

    public final Uri i() {
        int i3 = this.f4126a;
        if (i3 == -1 && Build.VERSION.SDK_INT >= 23) {
            return AbstractC0882c.d(this.f4127b);
        }
        if (i3 != 4 && i3 != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f4127b);
    }

    public final Bundle j() {
        Bundle bundle = new Bundle();
        switch (this.f4126a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f4127b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                bundle.putParcelable("obj", (Bitmap) this.f4127b);
                break;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                bundle.putString("obj", (String) this.f4127b);
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                bundle.putByteArray("obj", (byte[]) this.f4127b);
                break;
        }
        bundle.putInt("type", this.f4126a);
        bundle.putInt("int1", this.f4130e);
        bundle.putInt("int2", this.f4131f);
        bundle.putString("string1", this.f4135j);
        ColorStateList colorStateList = this.f4132g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f4133h;
        if (mode != f4125k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public final Icon k(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC0882c.f(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public final String toString() {
        String str;
        if (this.f4126a == -1) {
            return String.valueOf(this.f4127b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f4126a) {
            case 1:
                str = "BITMAP";
                break;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESOURCE";
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "DATA";
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                str = "URI";
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f4126a) {
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.f4127b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f4127b).getHeight());
                break;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                sb.append(" pkg=");
                sb.append(this.f4135j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(g())));
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                sb.append(" len=");
                sb.append(this.f4130e);
                if (this.f4131f != 0) {
                    sb.append(" off=");
                    sb.append(this.f4131f);
                    break;
                }
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.f4127b);
                break;
        }
        if (this.f4132g != null) {
            sb.append(" tint=");
            sb.append(this.f4132g);
        }
        if (this.f4133h != f4125k) {
            sb.append(" mode=");
            sb.append(this.f4133h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i3) {
        this.f4128c = null;
        this.f4129d = null;
        this.f4130e = 0;
        this.f4131f = 0;
        this.f4132g = null;
        this.f4133h = f4125k;
        this.f4134i = null;
        this.f4126a = i3;
    }
}
