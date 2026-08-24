package j$.time.format;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    private final f[] f6515a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f6516b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(ArrayList arrayList, boolean z3) {
        this((f[]) arrayList.toArray(new f[arrayList.size()]), z3);
    }

    e(f[] fVarArr, boolean z3) {
        this.f6515a = fVarArr;
        this.f6516b = z3;
    }

    public final e a() {
        return !this.f6516b ? this : new e(this.f6515a, false);
    }

    @Override // j$.time.format.f
    public final boolean m(t tVar, StringBuilder sb) {
        int length = sb.length();
        boolean z3 = this.f6516b;
        if (z3) {
            tVar.g();
        }
        try {
            for (f fVar : this.f6515a) {
                if (!fVar.m(tVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            if (z3) {
                tVar.a();
            }
            return true;
        } finally {
            if (z3) {
                tVar.a();
            }
        }
    }

    @Override // j$.time.format.f
    public final int o(q qVar, CharSequence charSequence, int i3) {
        boolean z3 = this.f6516b;
        f[] fVarArr = this.f6515a;
        if (z3) {
            qVar.q();
            int i4 = i3;
            for (f fVar : fVarArr) {
                i4 = fVar.o(qVar, charSequence, i4);
                if (i4 < 0) {
                    qVar.e(false);
                    return i3;
                }
            }
            qVar.e(true);
            return i4;
        }
        for (f fVar2 : fVarArr) {
            i3 = fVar2.o(qVar, charSequence, i3);
            if (i3 < 0) {
                break;
            }
        }
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        f[] fVarArr = this.f6515a;
        if (fVarArr != null) {
            boolean z3 = this.f6516b;
            sb.append(z3 ? "[" : "(");
            for (f fVar : fVarArr) {
                sb.append(fVar);
            }
            sb.append(z3 ? "]" : ")");
        }
        return sb.toString();
    }
}
