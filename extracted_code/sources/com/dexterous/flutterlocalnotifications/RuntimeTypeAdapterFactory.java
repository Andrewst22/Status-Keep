package com.dexterous.flutterlocalnotifications;

import I1.k;
import I1.r;
import I1.s;
import d.InterfaceC0249a;
import java.util.LinkedHashMap;
import java.util.Map;
@InterfaceC0249a
/* loaded from: classes.dex */
public final class RuntimeTypeAdapterFactory<T> implements s {
    private final Class<?> baseType;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    private RuntimeTypeAdapterFactory(Class<?> cls, String str) {
        if (str != null && cls != null) {
            this.baseType = cls;
            this.typeFieldName = str;
            return;
        }
        throw null;
    }

    public static /* synthetic */ String access$000(RuntimeTypeAdapterFactory runtimeTypeAdapterFactory) {
        return runtimeTypeAdapterFactory.typeFieldName;
    }

    public static /* synthetic */ Class access$100(RuntimeTypeAdapterFactory runtimeTypeAdapterFactory) {
        return runtimeTypeAdapterFactory.baseType;
    }

    public static /* synthetic */ Map access$200(RuntimeTypeAdapterFactory runtimeTypeAdapterFactory) {
        return runtimeTypeAdapterFactory.subtypeToLabel;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str);
    }

    @Override // I1.s
    public <R> r create(k kVar, P1.a aVar) {
        if (aVar.f1465a != this.baseType) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, Class<?>> entry : this.labelToSubtype.entrySet()) {
            r d3 = kVar.d(this, new P1.a(entry.getValue()));
            linkedHashMap.put(entry.getKey(), d3);
            linkedHashMap2.put(entry.getValue(), d3);
        }
        return new I1.i(new L1.s(this, linkedHashMap, linkedHashMap2), 2);
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls != null && str != null) {
            if (!this.subtypeToLabel.containsKey(cls) && !this.labelToSubtype.containsKey(str)) {
                this.labelToSubtype.put(str, cls);
                this.subtypeToLabel.put(cls, str);
                return this;
            }
            throw new IllegalArgumentException("types and labels must be unique");
        }
        throw null;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type");
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }
}
