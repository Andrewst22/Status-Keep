package c0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: c0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221a {

    /* renamed from: a  reason: collision with root package name */
    public final long f4703a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4704b;

    /* renamed from: c  reason: collision with root package name */
    public final List f4705c;

    /* renamed from: d  reason: collision with root package name */
    public final List f4706d;

    /* renamed from: e  reason: collision with root package name */
    public final List f4707e;

    /* renamed from: f  reason: collision with root package name */
    public final List f4708f;

    public C0221a(long j3, int i3, ArrayList arrayList, List list, List list2, List list3) {
        this.f4703a = j3;
        this.f4704b = i3;
        this.f4705c = Collections.unmodifiableList(arrayList);
        this.f4706d = Collections.unmodifiableList(list);
        this.f4707e = Collections.unmodifiableList(list2);
        this.f4708f = Collections.unmodifiableList(list3);
    }
}
