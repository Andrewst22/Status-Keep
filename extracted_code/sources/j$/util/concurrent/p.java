package j$.util.concurrent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    l[] f6788a;

    /* renamed from: b  reason: collision with root package name */
    l f6789b = null;

    /* renamed from: c  reason: collision with root package name */
    o f6790c;

    /* renamed from: d  reason: collision with root package name */
    o f6791d;

    /* renamed from: e  reason: collision with root package name */
    int f6792e;

    /* renamed from: f  reason: collision with root package name */
    int f6793f;

    /* renamed from: g  reason: collision with root package name */
    int f6794g;

    /* renamed from: h  reason: collision with root package name */
    final int f6795h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(l[] lVarArr, int i3, int i4, int i5) {
        this.f6788a = lVarArr;
        this.f6795h = i3;
        this.f6792e = i4;
        this.f6793f = i4;
        this.f6794g = i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final l a() {
        l[] lVarArr;
        int length;
        int i3;
        o oVar;
        o oVar2;
        l lVar = this.f6789b;
        if (lVar != null) {
            lVar = lVar.f6783d;
        }
        while (lVar == null) {
            if (this.f6793f >= this.f6794g || (lVarArr = this.f6788a) == null || (length = lVarArr.length) <= (i3 = this.f6792e) || i3 < 0) {
                this.f6789b = null;
                return null;
            }
            l k3 = ConcurrentHashMap.k(lVarArr, i3);
            if (k3 == null || k3.f6780a >= 0) {
                lVar = k3;
            } else if (k3 instanceof g) {
                this.f6788a = ((g) k3).f6773e;
                o oVar3 = this.f6791d;
                if (oVar3 == null) {
                    oVar2 = new Object();
                } else {
                    this.f6791d = oVar3.f6787d;
                    oVar2 = oVar3;
                }
                oVar2.f6786c = lVarArr;
                oVar2.f6784a = length;
                oVar2.f6785b = i3;
                oVar2.f6787d = this.f6790c;
                this.f6790c = oVar2;
                lVar = null;
            } else {
                lVar = k3 instanceof q ? ((q) k3).f6799f : null;
            }
            if (this.f6790c != null) {
                while (true) {
                    oVar = this.f6790c;
                    if (oVar == null) {
                        break;
                    }
                    int i4 = this.f6792e;
                    int i5 = oVar.f6784a;
                    int i6 = i4 + i5;
                    this.f6792e = i6;
                    if (i6 < length) {
                        break;
                    }
                    this.f6792e = oVar.f6785b;
                    this.f6788a = oVar.f6786c;
                    oVar.f6786c = null;
                    o oVar4 = oVar.f6787d;
                    oVar.f6787d = this.f6791d;
                    this.f6790c = oVar4;
                    this.f6791d = oVar;
                    length = i5;
                }
                if (oVar == null) {
                    int i7 = this.f6792e + this.f6795h;
                    this.f6792e = i7;
                    if (i7 >= length) {
                        int i8 = this.f6793f + 1;
                        this.f6793f = i8;
                        this.f6792e = i8;
                    }
                }
            } else {
                int i9 = i3 + this.f6795h;
                this.f6792e = i9;
                if (i9 >= length) {
                    int i10 = this.f6793f + 1;
                    this.f6793f = i10;
                    this.f6792e = i10;
                }
            }
        }
        this.f6789b = lVar;
        return lVar;
    }
}
