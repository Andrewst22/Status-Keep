package f2;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final String f5631a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5632b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5633c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5634d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5635e;

    public p(String str, int i3, int i4, int i5, int i6) {
        if ((i3 == -1 && i4 == -1) || (i3 >= 0 && i4 >= 0)) {
            if ((i5 == -1 && i6 == -1) || (i5 >= 0 && i5 <= i6)) {
                if (i6 <= str.length()) {
                    if (i3 <= str.length()) {
                        if (i4 <= str.length()) {
                            this.f5631a = str;
                            this.f5632b = i3;
                            this.f5633c = i4;
                            this.f5634d = i5;
                            this.f5635e = i6;
                            return;
                        }
                        throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i4));
                    }
                    throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i3));
                }
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i5));
            }
            throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i5) + ", " + String.valueOf(i6) + ")");
        }
        throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i3) + ", " + String.valueOf(i4) + ")");
    }

    public static p a(JSONObject jSONObject) {
        return new p(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
