package m1;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p.C0723e;
/* renamed from: m1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0617a {

    /* renamed from: a  reason: collision with root package name */
    public final C0723e f8182a;

    /* renamed from: b  reason: collision with root package name */
    public final C0723e f8183b;

    /* renamed from: c  reason: collision with root package name */
    public final C0723e f8184c;

    public AbstractC0617a(C0723e c0723e, C0723e c0723e2, C0723e c0723e3) {
        this.f8182a = c0723e;
        this.f8183b = c0723e2;
        this.f8184c = c0723e3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        C0723e c0723e = this.f8184c;
        Class cls2 = (Class) c0723e.getOrDefault(name, null);
        if (cls2 == null) {
            String name2 = cls.getPackage().getName();
            String simpleName = cls.getSimpleName();
            Class<?> cls3 = Class.forName(name2 + "." + simpleName + "Parcelizer", false, cls.getClassLoader());
            c0723e.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        C0723e c0723e = this.f8182a;
        Method method = (Method) c0723e.getOrDefault(str, null);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, AbstractC0617a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0617a.class);
            c0723e.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        C0723e c0723e = this.f8183b;
        Method method = (Method) c0723e.getOrDefault(name, null);
        if (method == null) {
            Class b3 = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b3.getDeclaredMethod("write", cls, AbstractC0617a.class);
            c0723e.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i3);

    public final int f(int i3, int i4) {
        if (!e(i4)) {
            return i3;
        }
        return ((b) this).f8186e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i3) {
        if (!e(i3)) {
            return parcelable;
        }
        return ((b) this).f8186e.readParcelable(b.class.getClassLoader());
    }

    public final c h() {
        String readString = ((b) this).f8186e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    public abstract void i(int i3);

    public final void j(int i3, int i4) {
        i(i4);
        ((b) this).f8186e.writeInt(i3);
    }

    public final void k(Parcelable parcelable, int i3) {
        i(i3);
        ((b) this).f8186e.writeParcelable(parcelable, 0);
    }

    public final void l(c cVar) {
        if (cVar == null) {
            ((b) this).f8186e.writeString(null);
            return;
        }
        try {
            ((b) this).f8186e.writeString(b(cVar.getClass()).getName());
            b a3 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a3);
                int i3 = a3.f8190i;
                if (i3 >= 0) {
                    int i4 = a3.f8185d.get(i3);
                    Parcel parcel = a3.f8186e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i4);
                    parcel.writeInt(dataPosition - i4);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (InvocationTargetException e5) {
                if (e5.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e5.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e6);
        }
    }
}
