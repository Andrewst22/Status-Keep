package j$.time.format;

import java.text.ParsePosition;
import java.util.Iterator;
import java.util.Set;
/* loaded from: classes2.dex */
class l {

    /* renamed from: a  reason: collision with root package name */
    protected String f6530a;

    /* renamed from: b  reason: collision with root package name */
    protected String f6531b;

    /* renamed from: c  reason: collision with root package name */
    protected char f6532c;

    /* renamed from: d  reason: collision with root package name */
    protected l f6533d;

    /* renamed from: e  reason: collision with root package name */
    protected l f6534e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ l(String str, String str2, l lVar, int i3) {
        this(str, str2, lVar);
    }

    protected boolean b(char c3, char c4) {
        return c3 == c4;
    }

    private l(String str, String str2, l lVar) {
        this.f6530a = str;
        this.f6531b = str2;
        this.f6533d = lVar;
        if (str.isEmpty()) {
            this.f6532c = (char) 65535;
        } else {
            this.f6532c = this.f6530a.charAt(0);
        }
    }

    public static l e(Set set, q qVar) {
        l lVar;
        if (qVar.j()) {
            lVar = new l("", null, null);
        } else {
            lVar = new l("", null, null);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            lVar.a(str, str);
        }
        return lVar;
    }

    public final String c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (f(charSequence, index, length)) {
            int length2 = this.f6530a.length() + index;
            l lVar = this.f6533d;
            if (lVar != null && length2 != length) {
                while (true) {
                    if (b(lVar.f6532c, charSequence.charAt(length2))) {
                        parsePosition.setIndex(length2);
                        String c3 = lVar.c(charSequence, parsePosition);
                        if (c3 != null) {
                            return c3;
                        }
                    } else {
                        lVar = lVar.f6534e;
                        if (lVar == null) {
                            break;
                        }
                    }
                }
            }
            parsePosition.setIndex(length2);
            return this.f6531b;
        }
        return null;
    }

    protected l d(String str, String str2, l lVar) {
        return new l(str, str2, lVar);
    }

    protected boolean f(CharSequence charSequence, int i3, int i4) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f6530a, i3);
        }
        int length = this.f6530a.length();
        if (length > i4 - i3) {
            return false;
        }
        int i5 = 0;
        while (true) {
            int i6 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i7 = i5 + 1;
            int i8 = i3 + 1;
            if (!b(this.f6530a.charAt(i5), charSequence.charAt(i3))) {
                return false;
            }
            i3 = i8;
            length = i6;
            i5 = i7;
        }
    }

    private boolean a(String str, String str2) {
        int i3 = 0;
        while (i3 < str.length() && i3 < this.f6530a.length() && b(str.charAt(i3), this.f6530a.charAt(i3))) {
            i3++;
        }
        if (i3 == this.f6530a.length()) {
            if (i3 < str.length()) {
                String substring = str.substring(i3);
                for (l lVar = this.f6533d; lVar != null; lVar = lVar.f6534e) {
                    if (b(lVar.f6532c, substring.charAt(0))) {
                        return lVar.a(substring, str2);
                    }
                }
                l d3 = d(substring, str2, null);
                d3.f6534e = this.f6533d;
                this.f6533d = d3;
                return true;
            }
            this.f6531b = str2;
            return true;
        }
        l d4 = d(this.f6530a.substring(i3), this.f6531b, this.f6533d);
        this.f6530a = str.substring(0, i3);
        this.f6533d = d4;
        if (i3 < str.length()) {
            this.f6533d.f6534e = d(str.substring(i3), str2, null);
            this.f6531b = null;
        } else {
            this.f6531b = str2;
        }
        return true;
    }
}
