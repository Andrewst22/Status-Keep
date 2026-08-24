package j$.time;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class z extends ZoneId {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f6654d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* renamed from: b  reason: collision with root package name */
    private final String f6655b;

    /* renamed from: c  reason: collision with root package name */
    private final transient j$.time.zone.f f6656c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z S(String str, boolean z3) {
        j$.time.zone.f fVar;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = str.charAt(i3);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i3 == 0) && ((charAt < '0' || charAt > '9' || i3 == 0) && ((charAt != '~' || i3 == 0) && ((charAt != '.' || i3 == 0) && ((charAt != '_' || i3 == 0) && ((charAt != '+' || i3 == 0) && (charAt != '-' || i3 == 0))))))))) {
                    throw new RuntimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                fVar = j$.time.zone.j.b(str, true);
            } catch (j$.time.zone.g e2) {
                if (z3) {
                    throw e2;
                }
                fVar = null;
            }
            return new z(str, fVar);
        }
        throw new RuntimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(String str, j$.time.zone.f fVar) {
        this.f6655b = str;
        this.f6656c = fVar;
    }

    @Override // j$.time.ZoneId
    public final String l() {
        return this.f6655b;
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f N() {
        j$.time.zone.f fVar = this.f6656c;
        return fVar != null ? fVar : j$.time.zone.j.b(this.f6655b, false);
    }

    private Object writeReplace() {
        return new t((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.ZoneId
    public final void R(ObjectOutput objectOutput) {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.f6655b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void T(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f6655b);
    }
}
