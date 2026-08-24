package j$.util.stream;

import j$.util.function.C0351f;
import j$.util.function.InterfaceC0352g;
/* loaded from: classes2.dex */
public interface C extends InterfaceC0407g {
    void g(InterfaceC0352g interfaceC0352g);

    @Override // j$.util.stream.InterfaceC0407g
    C parallel();

    void q(C0351f c0351f);

    @Override // j$.util.stream.InterfaceC0407g
    C sequential();
}
