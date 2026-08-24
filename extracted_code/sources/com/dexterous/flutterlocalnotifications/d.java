package com.dexterous.flutterlocalnotifications;

import g2.q;
/* loaded from: classes.dex */
public final class d implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5130a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f5131b;

    public /* synthetic */ d(q qVar, int i3) {
        this.f5130a = i3;
        this.f5131b = qVar;
    }

    @Override // com.dexterous.flutterlocalnotifications.j
    public final void a(boolean z3) {
        switch (this.f5130a) {
            case 0:
                this.f5131b.b(Boolean.valueOf(z3));
                return;
            case 1:
                this.f5131b.b(Boolean.valueOf(z3));
                return;
            default:
                this.f5131b.b(Boolean.valueOf(z3));
                return;
        }
    }

    @Override // com.dexterous.flutterlocalnotifications.j
    public final void b() {
        switch (this.f5130a) {
            case 0:
                this.f5131b.a("permissionRequestInProgress", "Another permission request is already in progress", null);
                return;
            case 1:
                this.f5131b.a("permissionRequestInProgress", "Another permission request is already in progress", null);
                return;
            default:
                this.f5131b.a("permissionRequestInProgress", "Another permission request is already in progress", null);
                return;
        }
    }
}
