package androidx.datastore.preferences.protobuf;

import java.io.IOException;
/* renamed from: androidx.datastore.preferences.protobuf.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0201y extends IOException {

    /* renamed from: m  reason: collision with root package name */
    public boolean f4315m;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.y, java.io.IOException] */
    public static C0201y a() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, androidx.datastore.preferences.protobuf.x] */
    public static C0200x b() {
        return new IOException("Protocol message tag had invalid wire type.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.y, java.io.IOException] */
    public static C0201y c() {
        return new IOException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.y, java.io.IOException] */
    public static C0201y d() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.y, java.io.IOException] */
    public static C0201y e() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
