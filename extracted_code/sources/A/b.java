package A;

import android.text.SpannableStringBuilder;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final String f5b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f6c;

    /* renamed from: d  reason: collision with root package name */
    public static final b f7d;

    /* renamed from: e  reason: collision with root package name */
    public static final b f8e;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9a;

    static {
        i iVar = j.f19c;
        f5b = Character.toString((char) 8206);
        f6c = Character.toString((char) 8207);
        f7d = new b(false);
        f8e = new b(true);
    }

    public b(boolean z3) {
        i iVar = j.f17a;
        this.f9a = z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
        if (r1 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r2 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r0.f3c <= 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
        switch(r0.a()) {
            case 14: goto L62;
            case 15: goto L62;
            case 16: goto L57;
            case 17: goto L57;
            case 18: goto L53;
            default: goto L65;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
        if (r1 != r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0089, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
        if (r1 != r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.CharSequence r9) {
        /*
            A.a r0 = new A.a
            r0.<init>(r9)
            r9 = 0
            r0.f3c = r9
            r1 = 0
            r2 = 0
            r3 = 0
        Lb:
            int r4 = r0.f3c
            int r5 = r0.f2b
            r6 = 1
            r7 = -1
            if (r4 >= r5) goto L70
            if (r1 != 0) goto L70
            java.lang.CharSequence r5 = r0.f1a
            char r4 = r5.charAt(r4)
            r0.f4d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.f3c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.f3c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.f3c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4b
        L37:
            int r4 = r0.f3c
            int r4 = r4 + r6
            r0.f3c = r4
            char r4 = r0.f4d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L47
            byte[] r5 = A.a.f0e
            r4 = r5[r4]
            goto L4b
        L47:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4b:
            if (r4 == 0) goto L6a
            if (r4 == r6) goto L66
            r5 = 2
            if (r4 == r5) goto L66
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L62;
                case 15: goto L62;
                case 16: goto L5e;
                case 17: goto L5e;
                case 18: goto L5a;
                default: goto L59;
            }
        L59:
            goto L6e
        L5a:
            int r3 = r3 + (-1)
            r2 = 0
            goto Lb
        L5e:
            int r3 = r3 + 1
            r2 = 1
            goto Lb
        L62:
            int r3 = r3 + 1
            r2 = -1
            goto Lb
        L66:
            if (r3 != 0) goto L6e
        L68:
            r9 = 1
            goto L8f
        L6a:
            if (r3 != 0) goto L6e
        L6c:
            r9 = -1
            goto L8f
        L6e:
            r1 = r3
            goto Lb
        L70:
            if (r1 != 0) goto L73
            goto L8f
        L73:
            if (r2 == 0) goto L77
            r9 = r2
            goto L8f
        L77:
            int r2 = r0.f3c
            if (r2 <= 0) goto L8f
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L8c;
                case 15: goto L8c;
                case 16: goto L86;
                case 17: goto L86;
                case 18: goto L83;
                default: goto L82;
            }
        L82:
            goto L77
        L83:
            int r3 = r3 + 1
            goto L77
        L86:
            if (r1 != r3) goto L89
            goto L68
        L89:
            int r3 = r3 + (-1)
            goto L77
        L8c:
            if (r1 != r3) goto L89
            goto L6c
        L8f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: A.b.a(java.lang.CharSequence):int");
    }

    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f3c = aVar.f2b;
        int i3 = 0;
        int i4 = 0;
        while (aVar.f3c > 0) {
            byte a3 = aVar.a();
            if (a3 != 0) {
                if (a3 != 1 && a3 != 2) {
                    if (a3 != 9) {
                        switch (a3) {
                            case 14:
                            case 15:
                                if (i4 == i3) {
                                    return -1;
                                }
                                i3--;
                                break;
                            case 16:
                            case 17:
                                if (i4 == i3) {
                                    return 1;
                                }
                                i3--;
                                break;
                            case 18:
                                i3++;
                                break;
                            default:
                                if (i4 != 0) {
                                    break;
                                } else {
                                    i4 = i3;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else if (i3 == 0) {
                    return 1;
                } else {
                    if (i4 == 0) {
                        i4 = i3;
                    }
                }
            } else if (i3 == 0) {
                return -1;
            } else {
                if (i4 == 0) {
                    i4 = i3;
                }
            }
        }
        return 0;
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        i iVar;
        String str;
        i iVar2;
        char c3;
        if (charSequence == null) {
            return null;
        }
        boolean d3 = j.f19c.d(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d3) {
            iVar = j.f18b;
        } else {
            iVar = j.f17a;
        }
        boolean d4 = iVar.d(charSequence, charSequence.length());
        String str2 = "";
        String str3 = f6c;
        String str4 = f5b;
        boolean z3 = this.f9a;
        if (!z3 && (d4 || a(charSequence) == 1)) {
            str = str4;
        } else if (!z3 || (d4 && a(charSequence) != -1)) {
            str = "";
        } else {
            str = str3;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (d3 != z3) {
            if (d3) {
                c3 = 8235;
            } else {
                c3 = 8234;
            }
            spannableStringBuilder.append(c3);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (d3) {
            iVar2 = j.f18b;
        } else {
            iVar2 = j.f17a;
        }
        boolean d5 = iVar2.d(charSequence, charSequence.length());
        if (!z3 && (d5 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z3 && (!d5 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
