package h0;
/* loaded from: classes.dex */
public final /* synthetic */ class w implements C {

    /* renamed from: n  reason: collision with root package name */
    public static final w f5934n = new w(0);

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f5935m;

    public /* synthetic */ w(int i3) {
        this.f5935m = i3;
    }

    @Override // h0.C
    public int c(Object obj) {
        o oVar = (o) obj;
        switch (this.f5935m) {
            case 1:
                String str = oVar.f5853a;
                if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
                    if (U.A.f2405a < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        return -1;
                    }
                    return 0;
                }
                return 1;
            default:
                return oVar.f5853a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
