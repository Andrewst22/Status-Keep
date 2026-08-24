package C1;
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: m  reason: collision with root package name */
    public final char f149m;

    public b(char c3) {
        this.f149m = c3;
    }

    @Override // C1.a
    public final boolean a(char c3) {
        if (c3 == this.f149m) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c3 = this.f149m;
        for (int i3 = 0; i3 < 4; i3++) {
            cArr[5 - i3] = "0123456789ABCDEF".charAt(c3 & 15);
            c3 = (char) (c3 >> 4);
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
