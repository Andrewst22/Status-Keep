package C1;

import a.AbstractC0155a;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class i implements Iterator {

    /* renamed from: n  reason: collision with root package name */
    public String f161n;

    /* renamed from: o  reason: collision with root package name */
    public final CharSequence f162o;

    /* renamed from: p  reason: collision with root package name */
    public final c f163p;

    /* renamed from: r  reason: collision with root package name */
    public int f165r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ j f166s;

    /* renamed from: m  reason: collision with root package name */
    public int f160m = 2;

    /* renamed from: q  reason: collision with root package name */
    public int f164q = 0;

    public i(j jVar, B0.b bVar, CharSequence charSequence) {
        this.f166s = jVar;
        this.f163p = (c) bVar.f28o;
        this.f165r = bVar.f27n;
        this.f162o = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i3 = this.f160m;
        if (i3 != 4) {
            int b3 = N.j.b(i3);
            if (b3 == 0) {
                return true;
            }
            if (b3 == 2) {
                return false;
            }
            this.f160m = 4;
            int i4 = this.f164q;
            while (true) {
                int i5 = this.f164q;
                if (i5 != -1) {
                    b bVar = (b) this.f166s.f168n;
                    CharSequence charSequence = this.f162o;
                    int length = charSequence.length();
                    AbstractC0155a.o(i5, length);
                    while (true) {
                        if (i5 < length) {
                            if (bVar.a(charSequence.charAt(i5))) {
                                break;
                            }
                            i5++;
                        } else {
                            i5 = -1;
                            break;
                        }
                    }
                    if (i5 == -1) {
                        i5 = charSequence.length();
                        this.f164q = -1;
                    } else {
                        this.f164q = i5 + 1;
                    }
                    int i6 = this.f164q;
                    if (i6 == i4) {
                        int i7 = i6 + 1;
                        this.f164q = i7;
                        if (i7 > charSequence.length()) {
                            this.f164q = -1;
                        }
                    } else {
                        c cVar = this.f163p;
                        if (i4 < i5) {
                            charSequence.charAt(i4);
                            cVar.getClass();
                        }
                        if (i5 > i4) {
                            charSequence.charAt(i5 - 1);
                            cVar.getClass();
                        }
                        int i8 = this.f165r;
                        if (i8 == 1) {
                            i5 = charSequence.length();
                            this.f164q = -1;
                            if (i5 > i4) {
                                charSequence.charAt(i5 - 1);
                                cVar.getClass();
                            }
                        } else {
                            this.f165r = i8 - 1;
                        }
                        str = charSequence.subSequence(i4, i5).toString();
                    }
                } else {
                    this.f160m = 3;
                    str = null;
                    break;
                }
            }
            this.f161n = str;
            if (this.f160m != 3) {
                this.f160m = 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f160m = 2;
            String str = this.f161n;
            this.f161n = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
