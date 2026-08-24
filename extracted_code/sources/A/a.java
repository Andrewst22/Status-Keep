package A;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f0e = new byte[1792];

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f1a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2b;

    /* renamed from: c  reason: collision with root package name */
    public int f3c;

    /* renamed from: d  reason: collision with root package name */
    public char f4d;

    static {
        for (int i3 = 0; i3 < 1792; i3++) {
            f0e[i3] = Character.getDirectionality(i3);
        }
    }

    public a(CharSequence charSequence) {
        this.f1a = charSequence;
        this.f2b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f1a;
        char charAt = charSequence.charAt(this.f3c - 1);
        this.f4d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f3c);
            this.f3c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f3c--;
        char c3 = this.f4d;
        if (c3 < 1792) {
            return f0e[c3];
        }
        return Character.getDirectionality(c3);
    }
}
