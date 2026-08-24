package b1;

import N.k;
import U.A;
import U.AbstractC0123a;
import U.t;
import a.AbstractC0155a;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f4679a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f4680b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c  reason: collision with root package name */
    public static final Map f4681c;

    /* renamed from: d  reason: collision with root package name */
    public static final Map f4682d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f4681c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f4682d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(String str, f fVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c3;
        char c4;
        char c5;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = fVar.f4663b;
        int length = spannableStringBuilder.length();
        String str2 = fVar.f4662a;
        str2.getClass();
        int i8 = -1;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 99:
                if (str2.equals("c")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 117:
                if (str2.equals("u")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 118:
                if (str2.equals("v")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
            case k.STRING_FIELD_NUMBER /* 5 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i7, length, 33);
                break;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                for (String str3 : fVar.f4665d) {
                    Map map = f4681c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i7, length, 33);
                    } else {
                        Map map2 = f4682d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i7, length, 33);
                        }
                    }
                }
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                spannableStringBuilder.setSpan(new StyleSpan(2), i7, length, 33);
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i7, length, 33);
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                int c6 = c(list2, str, fVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C0215e.f4659c);
                int i9 = fVar.f4663b;
                int i10 = 0;
                int i11 = 0;
                while (i10 < arrayList.size()) {
                    if ("rt".equals(((C0215e) arrayList.get(i10)).f4660a.f4662a)) {
                        C0215e c0215e = (C0215e) arrayList.get(i10);
                        int c7 = c(list2, str, c0215e.f4660a);
                        if (c7 == i8) {
                            if (c6 != i8) {
                                c7 = c6;
                            } else {
                                c7 = 1;
                            }
                        }
                        int i12 = c0215e.f4660a.f4663b - i11;
                        int i13 = c0215e.f4661b - i11;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i12, i13);
                        spannableStringBuilder.delete(i12, i13);
                        spannableStringBuilder.setSpan(new T.f(subSequence.toString(), c7), i9, i12, 33);
                        i11 = subSequence.length() + i11;
                        i9 = i12;
                    }
                    i10++;
                    i8 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b3 = b(list2, str, fVar);
        for (int i14 = 0; i14 < b3.size(); i14++) {
            C0213c c0213c = ((g) b3.get(i14)).f4667n;
            int i15 = c0213c.f4650k;
            if (i15 == -1 && c0213c.f4651l == -1) {
                i3 = -1;
            } else {
                if (i15 == 1) {
                    c4 = 1;
                } else {
                    c4 = 0;
                }
                if (c0213c.f4651l == 1) {
                    c5 = 2;
                } else {
                    c5 = 0;
                }
                i3 = c5 | c4;
            }
            if (i3 != -1) {
                int i16 = c0213c.f4650k;
                if (i16 == -1 && c0213c.f4651l == -1) {
                    i6 = -1;
                } else {
                    if (i16 == 1) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    if (c0213c.f4651l == 1) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    i6 = i4 | i5;
                }
                AbstractC0155a.b(spannableStringBuilder, new StyleSpan(i6), i7, length);
            }
            if (c0213c.f4649j == 1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i7, length, 33);
            }
            if (c0213c.f4646g) {
                if (c0213c.f4646g) {
                    AbstractC0155a.b(spannableStringBuilder, new ForegroundColorSpan(c0213c.f4645f), i7, length);
                } else {
                    throw new IllegalStateException("Font color not defined");
                }
            }
            if (c0213c.f4648i) {
                if (c0213c.f4648i) {
                    AbstractC0155a.b(spannableStringBuilder, new BackgroundColorSpan(c0213c.f4647h), i7, length);
                } else {
                    throw new IllegalStateException("Background color not defined.");
                }
            }
            if (c0213c.f4644e != null) {
                AbstractC0155a.b(spannableStringBuilder, new TypefaceSpan(c0213c.f4644e), i7, length);
            }
            int i17 = c0213c.f4652m;
            if (i17 != 1) {
                if (i17 != 2) {
                    if (i17 == 3) {
                        AbstractC0155a.b(spannableStringBuilder, new RelativeSizeSpan(c0213c.f4653n / 100.0f), i7, length);
                    }
                } else {
                    AbstractC0155a.b(spannableStringBuilder, new RelativeSizeSpan(c0213c.f4653n), i7, length);
                }
            } else {
                AbstractC0155a.b(spannableStringBuilder, new AbsoluteSizeSpan((int) c0213c.f4653n, true), i7, length);
            }
            if (c0213c.f4655p) {
                spannableStringBuilder.setSpan(new Object(), i7, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, f fVar) {
        int i3;
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            C0213c c0213c = (C0213c) list.get(i4);
            String str2 = fVar.f4662a;
            if (c0213c.f4640a.isEmpty() && c0213c.f4641b.isEmpty() && c0213c.f4642c.isEmpty() && c0213c.f4643d.isEmpty()) {
                i3 = TextUtils.isEmpty(str2);
            } else {
                int a3 = C0213c.a(C0213c.a(C0213c.a(0, 1073741824, c0213c.f4640a, str), 2, c0213c.f4641b, str2), 4, c0213c.f4643d, fVar.f4664c);
                if (a3 != -1) {
                    if (fVar.f4665d.containsAll(c0213c.f4642c)) {
                        i3 = a3 + (c0213c.f4642c.size() * 4);
                    }
                }
                i3 = 0;
            }
            if (i3 > 0) {
                arrayList.add(new g(i3, c0213c));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, f fVar) {
        ArrayList b3 = b(list, str, fVar);
        for (int i3 = 0; i3 < b3.size(); i3++) {
            int i4 = ((g) b3.get(i3)).f4667n.f4654o;
            if (i4 != -1) {
                return i4;
            }
        }
        return -1;
    }

    public static C0214d d(String str, Matcher matcher, t tVar, ArrayList arrayList) {
        h hVar = new h();
        try {
            String group = matcher.group(1);
            group.getClass();
            hVar.f4668a = j.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            hVar.f4669b = j.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, hVar);
            StringBuilder sb = new StringBuilder();
            tVar.getClass();
            String i3 = tVar.i(C1.d.f153c);
            while (!TextUtils.isEmpty(i3)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(i3.trim());
                i3 = tVar.i(C1.d.f153c);
            }
            hVar.f4670c = f(str, sb.toString(), arrayList);
            return new C0214d(hVar.a().a(), hVar.f4668a, hVar.f4669b);
        } catch (NumberFormatException unused) {
            AbstractC0123a.A("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, h hVar) {
        char c3;
        int i3;
        char c4;
        int i4;
        int i5;
        Matcher matcher = f4680b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    g(group2, hVar);
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 109757538:
                            if (group2.equals("start")) {
                                c3 = 5;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                        case 1:
                            i3 = 2;
                            break;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            i3 = 3;
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            i3 = 4;
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            i3 = 5;
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            i3 = 1;
                            break;
                        default:
                            AbstractC0123a.A("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                            i3 = 2;
                            break;
                    }
                    hVar.f4671d = i3;
                } else if ("position".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        substring.getClass();
                        switch (substring.hashCode()) {
                            case -1842484672:
                                if (substring.equals("line-left")) {
                                    c4 = 0;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case -1364013995:
                                if (substring.equals("center")) {
                                    c4 = 1;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case -1276788989:
                                if (substring.equals("line-right")) {
                                    c4 = 2;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case -1074341483:
                                if (substring.equals("middle")) {
                                    c4 = 3;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 100571:
                                if (substring.equals("end")) {
                                    c4 = 4;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 109757538:
                                if (substring.equals("start")) {
                                    c4 = 5;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            default:
                                c4 = 65535;
                                break;
                        }
                        switch (c4) {
                            case 0:
                            case k.STRING_FIELD_NUMBER /* 5 */:
                                i4 = 0;
                                break;
                            case 1:
                            case k.INTEGER_FIELD_NUMBER /* 3 */:
                                i4 = 1;
                                break;
                            case k.FLOAT_FIELD_NUMBER /* 2 */:
                            case k.LONG_FIELD_NUMBER /* 4 */:
                                i4 = 2;
                                break;
                            default:
                                AbstractC0123a.A("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                i4 = Integer.MIN_VALUE;
                                break;
                        }
                        hVar.f4676i = i4;
                        group2 = group2.substring(0, indexOf);
                    }
                    hVar.f4675h = j.b(group2);
                } else if ("size".equals(group)) {
                    hVar.f4677j = j.b(group2);
                } else if ("vertical".equals(group)) {
                    if (!group2.equals("lr")) {
                        if (!group2.equals("rl")) {
                            AbstractC0123a.A("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i5 = Integer.MIN_VALUE;
                        } else {
                            i5 = 1;
                        }
                    } else {
                        i5 = 2;
                    }
                    hVar.f4678k = i5;
                } else {
                    AbstractC0123a.A("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                }
            } catch (NumberFormatException unused) {
                AbstractC0123a.A("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public static SpannedString f(String str, String str2, List list) {
        char c3;
        boolean z3;
        boolean z4;
        int i3;
        char c4;
        char c5;
        int i4 = -1;
        int i5 = 2;
        int i6 = 1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            String str3 = "";
            if (i7 < str2.length()) {
                char charAt = str2.charAt(i7);
                if (charAt != '&') {
                    if (charAt != '<') {
                        spannableStringBuilder.append(charAt);
                        i7 += i6;
                    } else {
                        int i8 = i7 + 1;
                        if (i8 < str2.length()) {
                            if (str2.charAt(i8) == '/') {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            int indexOf = str2.indexOf(62, i8);
                            if (indexOf == i4) {
                                i8 = str2.length();
                            } else {
                                i8 = indexOf + i6;
                            }
                            int i9 = i8 - 2;
                            if (str2.charAt(i9) == '/') {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z3) {
                                i3 = 2;
                            } else {
                                i3 = 1;
                            }
                            int i10 = i7 + i3;
                            if (!z4) {
                                i9 = i8 - 1;
                            }
                            String substring = str2.substring(i10, i9);
                            if (!substring.trim().isEmpty()) {
                                String trim = substring.trim();
                                AbstractC0123a.e(trim.isEmpty() ^ i6);
                                int i11 = A.f2405a;
                                String str4 = trim.split("[ \\.]", i5)[0];
                                str4.getClass();
                                switch (str4.hashCode()) {
                                    case 98:
                                        if (str4.equals("b")) {
                                            c4 = 0;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 99:
                                        if (str4.equals("c")) {
                                            c4 = 1;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 105:
                                        if (str4.equals("i")) {
                                            c4 = 2;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 117:
                                        if (str4.equals("u")) {
                                            c4 = 3;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 118:
                                        if (str4.equals("v")) {
                                            c4 = 4;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 3650:
                                        if (str4.equals("rt")) {
                                            c4 = 5;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 3314158:
                                        if (str4.equals("lang")) {
                                            c4 = 6;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 3511770:
                                        if (str4.equals("ruby")) {
                                            c4 = 7;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    default:
                                        c4 = 65535;
                                        break;
                                }
                                switch (c4) {
                                    case 0:
                                    case 1:
                                    case k.FLOAT_FIELD_NUMBER /* 2 */:
                                    case k.INTEGER_FIELD_NUMBER /* 3 */:
                                    case k.LONG_FIELD_NUMBER /* 4 */:
                                    case k.STRING_FIELD_NUMBER /* 5 */:
                                    case k.STRING_SET_FIELD_NUMBER /* 6 */:
                                    case k.DOUBLE_FIELD_NUMBER /* 7 */:
                                        if (z3) {
                                            while (!arrayDeque.isEmpty()) {
                                                f fVar = (f) arrayDeque.pop();
                                                a(str, fVar, arrayList, spannableStringBuilder, list);
                                                if (!arrayDeque.isEmpty()) {
                                                    arrayList.add(new C0215e(fVar, spannableStringBuilder.length()));
                                                } else {
                                                    arrayList.clear();
                                                }
                                                if (fVar.f4662a.equals(str4)) {
                                                    break;
                                                }
                                            }
                                            break;
                                        } else if (!z4) {
                                            int length = spannableStringBuilder.length();
                                            String trim2 = substring.trim();
                                            AbstractC0123a.e(trim2.isEmpty() ^ i6);
                                            int indexOf2 = trim2.indexOf(" ");
                                            if (indexOf2 == -1) {
                                                c5 = 0;
                                            } else {
                                                str3 = trim2.substring(indexOf2).trim();
                                                c5 = 0;
                                                trim2 = trim2.substring(0, indexOf2);
                                            }
                                            String[] split = trim2.split("\\.", -1);
                                            String str5 = split[c5];
                                            HashSet hashSet = new HashSet();
                                            for (int i12 = 1; i12 < split.length; i12 += i6) {
                                                hashSet.add(split[i12]);
                                            }
                                            arrayDeque.push(new f(str5, length, str3, hashSet));
                                            break;
                                        }
                                        break;
                                }
                            }
                            i7 = i8;
                            i4 = -1;
                        }
                        i7 = i8;
                    }
                } else {
                    i7 += i6;
                    int indexOf3 = str2.indexOf(59, i7);
                    int indexOf4 = str2.indexOf(32, i7);
                    if (indexOf3 == -1) {
                        indexOf3 = indexOf4;
                    } else if (indexOf4 != -1) {
                        indexOf3 = Math.min(indexOf3, indexOf4);
                    }
                    if (indexOf3 != -1) {
                        String substring2 = str2.substring(i7, indexOf3);
                        substring2.getClass();
                        switch (substring2.hashCode()) {
                            case 3309:
                                if (substring2.equals("gt")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3464:
                                if (substring2.equals("lt")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 96708:
                                if (substring2.equals("amp")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3374865:
                                if (substring2.equals("nbsp")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                                spannableStringBuilder.append('>');
                                break;
                            case 1:
                                spannableStringBuilder.append('<');
                                break;
                            case k.FLOAT_FIELD_NUMBER /* 2 */:
                                spannableStringBuilder.append('&');
                                break;
                            case k.INTEGER_FIELD_NUMBER /* 3 */:
                                spannableStringBuilder.append(' ');
                                break;
                            default:
                                AbstractC0123a.A("WebvttCueParser", "ignoring unsupported entity: '&" + substring2 + ";'");
                                break;
                        }
                        if (indexOf3 == indexOf4) {
                            spannableStringBuilder.append((CharSequence) " ");
                        }
                        i7 = indexOf3 + 1;
                    } else {
                        spannableStringBuilder.append(charAt);
                    }
                }
                i4 = -1;
                i5 = 2;
                i6 = 1;
            } else {
                while (!arrayDeque.isEmpty()) {
                    a(str, (f) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new f("", 0, "", Collections.emptySet()), Collections.emptyList(), spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
        }
    }

    public static void g(String str, h hVar) {
        int i3 = 2;
        int indexOf = str.indexOf(44);
        char c3 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c3 = 3;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                case 1:
                    i3 = 1;
                    break;
                case k.FLOAT_FIELD_NUMBER /* 2 */:
                    break;
                case k.INTEGER_FIELD_NUMBER /* 3 */:
                    i3 = 0;
                    break;
                default:
                    AbstractC0123a.A("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i3 = Integer.MIN_VALUE;
                    break;
            }
            hVar.f4674g = i3;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            hVar.f4672e = j.b(str);
            hVar.f4673f = 0;
            return;
        }
        hVar.f4672e = Integer.parseInt(str);
        hVar.f4673f = 1;
    }
}
