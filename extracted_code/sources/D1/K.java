package D1;
/* loaded from: classes.dex */
public final class K {

    /* renamed from: a  reason: collision with root package name */
    public final Object f199a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f200b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f201c;

    public K(Object obj, Object obj2, Object obj3) {
        this.f199a = obj;
        this.f200b = obj2;
        this.f201c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f199a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f200b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f201c);
        return new IllegalArgumentException(sb.toString());
    }
}
