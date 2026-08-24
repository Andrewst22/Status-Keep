package I1;

import java.lang.reflect.Field;
/* loaded from: classes.dex */
public enum a extends g {
    public a() {
        super("IDENTITY", 0);
    }

    @Override // I1.g
    public final String b(Field field) {
        return field.getName();
    }
}
