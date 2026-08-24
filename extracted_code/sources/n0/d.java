package n0;

import R.H;
import android.util.Pair;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f8367a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8368b;

    /* renamed from: c  reason: collision with root package name */
    public final d f8369c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedList f8370d = new LinkedList();

    public d(d dVar, String str, String str2) {
        this.f8369c = dVar;
        this.f8367a = str;
        this.f8368b = str2;
    }

    public static int g(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e2) {
                throw H.b(null, e2);
            }
        }
        return -1;
    }

    public static long h(XmlPullParser xmlPullParser, String str, long j3) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e2) {
                throw H.b(null, e2);
            }
        }
        return j3;
    }

    public static int i(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e2) {
                throw H.b(null, e2);
            }
        }
        throw new C0.d(str, 1);
    }

    public abstract Object b();

    public final Object c(String str) {
        int i3 = 0;
        while (true) {
            LinkedList linkedList = this.f8370d;
            if (i3 < linkedList.size()) {
                Pair pair = (Pair) linkedList.get(i3);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
                i3++;
            } else {
                d dVar = this.f8369c;
                if (dVar == null) {
                    return null;
                }
                return dVar.c(str);
            }
        }
    }

    public boolean d(String str) {
        return false;
    }

    public final Object e(XmlPullParser xmlPullParser) {
        boolean z3 = false;
        int i3 = 0;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            d dVar = null;
            if (eventType == 1) {
                return null;
            }
            if (eventType != 2) {
                if (eventType != 3) {
                    if (eventType == 4 && z3 && i3 == 0) {
                        k(xmlPullParser);
                    }
                } else if (!z3) {
                    continue;
                } else if (i3 > 0) {
                    i3--;
                } else {
                    String name = xmlPullParser.getName();
                    f(xmlPullParser);
                    if (!d(name)) {
                        return b();
                    }
                }
            } else {
                String name2 = xmlPullParser.getName();
                if (this.f8368b.equals(name2)) {
                    j(xmlPullParser);
                    z3 = true;
                } else if (z3) {
                    if (i3 > 0) {
                        i3++;
                    } else if (d(name2)) {
                        j(xmlPullParser);
                    } else {
                        boolean equals = "QualityLevel".equals(name2);
                        String str = this.f8367a;
                        if (equals) {
                            dVar = new d(this, str, "QualityLevel");
                        } else if ("Protection".equals(name2)) {
                            dVar = new d(this, str, "Protection");
                        } else if ("StreamIndex".equals(name2)) {
                            dVar = new h(this, str);
                        }
                        if (dVar == null) {
                            i3 = 1;
                        } else {
                            a(dVar.e(xmlPullParser));
                        }
                    }
                }
            }
            xmlPullParser.next();
        }
    }

    public abstract void j(XmlPullParser xmlPullParser);

    public final void l(Object obj, String str) {
        this.f8370d.add(Pair.create(str, obj));
    }

    public void a(Object obj) {
    }

    public void f(XmlPullParser xmlPullParser) {
    }

    public void k(XmlPullParser xmlPullParser) {
    }
}
