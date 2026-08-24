package j$.time.format;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final char f6514a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(char c3) {
        this.f6514a = c3;
    }

    @Override // j$.time.format.f
    public final boolean m(t tVar, StringBuilder sb) {
        sb.append(this.f6514a);
        return true;
    }

    @Override // j$.time.format.f
    public final int o(q qVar, CharSequence charSequence, int i3) {
        if (i3 == charSequence.length()) {
            return ~i3;
        }
        char charAt = charSequence.charAt(i3);
        char c3 = this.f6514a;
        return (charAt == c3 || (!qVar.j() && (Character.toUpperCase(charAt) == Character.toUpperCase(c3) || Character.toLowerCase(charAt) == Character.toLowerCase(c3)))) ? i3 + 1 : ~i3;
    }

    public final String toString() {
        char c3 = this.f6514a;
        if (c3 == '\'') {
            return "''";
        }
        return "'" + c3 + "'";
    }
}
