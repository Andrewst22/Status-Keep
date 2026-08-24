package C1;
/* loaded from: classes.dex */
public abstract class a implements g {
    public abstract boolean a(char c3);

    @Override // C1.g
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
