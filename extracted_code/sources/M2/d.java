package M2;

import K2.InterfaceC0076e;
import P2.AbstractC0097a;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final j f1070a = new j(-1, null, null, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final int f1071b = AbstractC0097a.l("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c  reason: collision with root package name */
    public static final int f1072c = AbstractC0097a.l("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d  reason: collision with root package name */
    public static final C1.f f1073d = new C1.f("BUFFERED", 1);

    /* renamed from: e  reason: collision with root package name */
    public static final C1.f f1074e = new C1.f("SHOULD_BUFFER", 1);

    /* renamed from: f  reason: collision with root package name */
    public static final C1.f f1075f = new C1.f("S_RESUMING_BY_RCV", 1);

    /* renamed from: g  reason: collision with root package name */
    public static final C1.f f1076g = new C1.f("RESUMING_BY_EB", 1);

    /* renamed from: h  reason: collision with root package name */
    public static final C1.f f1077h = new C1.f("POISONED", 1);

    /* renamed from: i  reason: collision with root package name */
    public static final C1.f f1078i = new C1.f("DONE_RCV", 1);

    /* renamed from: j  reason: collision with root package name */
    public static final C1.f f1079j = new C1.f("INTERRUPTED_SEND", 1);

    /* renamed from: k  reason: collision with root package name */
    public static final C1.f f1080k = new C1.f("INTERRUPTED_RCV", 1);

    /* renamed from: l  reason: collision with root package name */
    public static final C1.f f1081l = new C1.f("CHANNEL_CLOSED", 1);

    /* renamed from: m  reason: collision with root package name */
    public static final C1.f f1082m = new C1.f("SUSPEND", 1);

    /* renamed from: n  reason: collision with root package name */
    public static final C1.f f1083n = new C1.f("SUSPEND_NO_WAITER", 1);

    /* renamed from: o  reason: collision with root package name */
    public static final C1.f f1084o = new C1.f("FAILED", 1);

    /* renamed from: p  reason: collision with root package name */
    public static final C1.f f1085p = new C1.f("NO_RECEIVE_RESULT", 1);

    /* renamed from: q  reason: collision with root package name */
    public static final C1.f f1086q = new C1.f("CLOSE_HANDLER_CLOSED", 1);

    /* renamed from: r  reason: collision with root package name */
    public static final C1.f f1087r = new C1.f("CLOSE_HANDLER_INVOKED", 1);

    /* renamed from: s  reason: collision with root package name */
    public static final C1.f f1088s = new C1.f("NO_CLOSE_CAUSE", 1);

    public static final boolean a(InterfaceC0076e interfaceC0076e, Object obj, C2.l lVar) {
        C1.f g3 = interfaceC0076e.g(obj, lVar);
        if (g3 != null) {
            interfaceC0076e.m(g3);
            return true;
        }
        return false;
    }
}
