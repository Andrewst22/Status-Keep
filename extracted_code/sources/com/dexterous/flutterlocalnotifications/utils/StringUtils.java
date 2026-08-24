package com.dexterous.flutterlocalnotifications.utils;

import d.InterfaceC0249a;
@InterfaceC0249a
/* loaded from: classes.dex */
public class StringUtils {
    public static Boolean isNullOrEmpty(String str) {
        boolean z3;
        if (str != null && !str.isEmpty()) {
            z3 = false;
        } else {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}
