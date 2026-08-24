package com.dexterous.flutterlocalnotifications;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: m  reason: collision with root package name */
    public static final g f5136m;

    /* renamed from: n  reason: collision with root package name */
    public static final g f5137n;

    /* renamed from: o  reason: collision with root package name */
    public static final g f5138o;

    /* renamed from: p  reason: collision with root package name */
    public static final g f5139p;

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ g[] f5140q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, com.dexterous.flutterlocalnotifications.g] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, com.dexterous.flutterlocalnotifications.g] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, com.dexterous.flutterlocalnotifications.g] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, com.dexterous.flutterlocalnotifications.g] */
    static {
        ?? r4 = new Enum("None", 0);
        f5136m = r4;
        ?? r5 = new Enum("RequestingNotificationPermission", 1);
        f5137n = r5;
        ?? r6 = new Enum("RequestingExactAlarmsPermission", 2);
        f5138o = r6;
        ?? r7 = new Enum("RequestingFullScreenIntentPermission", 3);
        f5139p = r7;
        f5140q = new g[]{r4, r5, r6, r7};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f5140q.clone();
    }
}
