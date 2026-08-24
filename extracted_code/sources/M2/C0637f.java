package m2;

import K.C0059m;
import g2.C0276a;
import g2.InterfaceC0278c;
import java.util.List;
import s2.C0806e;
/* renamed from: m2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0637f {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ C0637f f8254a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C0806e f8255b = new C0806e(new T1.c(2));

    public static g2.n a() {
        return (g2.n) f8255b.a();
    }

    public static void b(g2.g gVar, final InterfaceC0638g interfaceC0638g, String str) {
        String str2;
        D2.i.e(gVar, "binaryMessenger");
        if (str.length() > 0) {
            str2 = ".".concat(str);
        } else {
            str2 = "";
        }
        B1.b i3 = gVar.i();
        C0059m c0059m = new C0059m(gVar, D2.h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", str2), a(), i3);
        if (interfaceC0638g != null) {
            c0059m.o(new InterfaceC0278c() { // from class: m2.e
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    List a3;
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    switch (r2) {
                        case 0:
                            InterfaceC0638g interfaceC0638g2 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            D2.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            D2.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            D2.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g2.h(str3, str4, (C0639h) obj4);
                                a3 = AbstractC0635d.s(null);
                            } catch (Throwable th) {
                                a3 = AbstractC0635d.a(th);
                            }
                            c0276a.o(a3);
                            return;
                        case 1:
                            InterfaceC0638g interfaceC0638g3 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            D2.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            D2.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            D2.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g3.y(str5, list3, (C0639h) obj7);
                                a4 = AbstractC0635d.s(null);
                            } catch (Throwable th2) {
                                a4 = AbstractC0635d.a(th2);
                            }
                            c0276a.o(a4);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0638g interfaceC0638g4 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            D2.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            D2.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a5 = AbstractC0635d.s(interfaceC0638g4.O(str6, (C0639h) obj9));
                            } catch (Throwable th3) {
                                a5 = AbstractC0635d.a(th3);
                            }
                            c0276a.o(a5);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0638g interfaceC0638g5 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            D2.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            D2.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = AbstractC0635d.s(interfaceC0638g5.i(str7, (C0639h) obj11));
                            } catch (Throwable th4) {
                                a6 = AbstractC0635d.a(th4);
                            }
                            c0276a.o(a6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0638g interfaceC0638g6 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            D2.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            D2.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = AbstractC0635d.s(interfaceC0638g6.E(str8, (C0639h) obj13));
                            } catch (Throwable th5) {
                                a7 = AbstractC0635d.a(th5);
                            }
                            c0276a.o(a7);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0638g interfaceC0638g7 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            D2.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            D2.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = AbstractC0635d.s(interfaceC0638g7.t(str9, (C0639h) obj15));
                            } catch (Throwable th6) {
                                a8 = AbstractC0635d.a(th6);
                            }
                            c0276a.o(a8);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0638g interfaceC0638g8 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            D2.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            D2.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            D2.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g8.N(str10, booleanValue, (C0639h) obj18);
                                a9 = AbstractC0635d.s(null);
                            } catch (Throwable th7) {
                                a9 = AbstractC0635d.a(th7);
                            }
                            c0276a.o(a9);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0638g interfaceC0638g9 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            D2.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            D2.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a10 = AbstractC0635d.s(interfaceC0638g9.G(str11, (C0639h) obj20));
                            } catch (Throwable th8) {
                                a10 = AbstractC0635d.a(th8);
                            }
                            c0276a.o(a10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0638g interfaceC0638g10 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            D2.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            D2.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = AbstractC0635d.s(interfaceC0638g10.p(str12, (C0639h) obj22));
                            } catch (Throwable th9) {
                                a11 = AbstractC0635d.a(th9);
                            }
                            c0276a.o(a11);
                            return;
                        case 9:
                            InterfaceC0638g interfaceC0638g11 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            D2.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g11.k(list12, (C0639h) obj23);
                                a12 = AbstractC0635d.s(null);
                            } catch (Throwable th10) {
                                a12 = AbstractC0635d.a(th10);
                            }
                            c0276a.o(a12);
                            return;
                        case 10:
                            InterfaceC0638g interfaceC0638g12 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            D2.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a13 = AbstractC0635d.s(interfaceC0638g12.I(list14, (C0639h) obj24));
                            } catch (Throwable th11) {
                                a13 = AbstractC0635d.a(th11);
                            }
                            c0276a.o(a13);
                            return;
                        case 11:
                            InterfaceC0638g interfaceC0638g13 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            D2.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = AbstractC0635d.s(interfaceC0638g13.o(list16, (C0639h) obj25));
                            } catch (Throwable th12) {
                                a14 = AbstractC0635d.a(th12);
                            }
                            c0276a.o(a14);
                            return;
                        case 12:
                            InterfaceC0638g interfaceC0638g14 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            D2.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            D2.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            D2.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g14.q(str13, str14, (C0639h) obj28);
                                a15 = AbstractC0635d.s(null);
                            } catch (Throwable th13) {
                                a15 = AbstractC0635d.a(th13);
                            }
                            c0276a.o(a15);
                            return;
                        case 13:
                            InterfaceC0638g interfaceC0638g15 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            D2.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            D2.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            D2.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g15.M(str15, longValue, (C0639h) obj31);
                                a16 = AbstractC0635d.s(null);
                            } catch (Throwable th14) {
                                a16 = AbstractC0635d.a(th14);
                            }
                            c0276a.o(a16);
                            return;
                        default:
                            InterfaceC0638g interfaceC0638g16 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            D2.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            D2.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            D2.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g16.u(str16, doubleValue, (C0639h) obj34);
                                a17 = AbstractC0635d.s(null);
                            } catch (Throwable th15) {
                                a17 = AbstractC0635d.a(th15);
                            }
                            c0276a.o(a17);
                            return;
                    }
                }
            });
        } else {
            c0059m.o(null);
        }
        C0059m c0059m2 = new C0059m(gVar, D2.h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", str2), a(), i3);
        if (interfaceC0638g != null) {
            c0059m2.o(new InterfaceC0278c() { // from class: m2.e
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    List a3;
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    switch (r2) {
                        case 0:
                            InterfaceC0638g interfaceC0638g2 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            D2.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            D2.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            D2.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g2.h(str3, str4, (C0639h) obj4);
                                a3 = AbstractC0635d.s(null);
                            } catch (Throwable th) {
                                a3 = AbstractC0635d.a(th);
                            }
                            c0276a.o(a3);
                            return;
                        case 1:
                            InterfaceC0638g interfaceC0638g3 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            D2.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            D2.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            D2.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g3.y(str5, list3, (C0639h) obj7);
                                a4 = AbstractC0635d.s(null);
                            } catch (Throwable th2) {
                                a4 = AbstractC0635d.a(th2);
                            }
                            c0276a.o(a4);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0638g interfaceC0638g4 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            D2.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            D2.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a5 = AbstractC0635d.s(interfaceC0638g4.O(str6, (C0639h) obj9));
                            } catch (Throwable th3) {
                                a5 = AbstractC0635d.a(th3);
                            }
                            c0276a.o(a5);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0638g interfaceC0638g5 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            D2.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            D2.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = AbstractC0635d.s(interfaceC0638g5.i(str7, (C0639h) obj11));
                            } catch (Throwable th4) {
                                a6 = AbstractC0635d.a(th4);
                            }
                            c0276a.o(a6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0638g interfaceC0638g6 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            D2.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            D2.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = AbstractC0635d.s(interfaceC0638g6.E(str8, (C0639h) obj13));
                            } catch (Throwable th5) {
                                a7 = AbstractC0635d.a(th5);
                            }
                            c0276a.o(a7);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0638g interfaceC0638g7 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            D2.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            D2.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = AbstractC0635d.s(interfaceC0638g7.t(str9, (C0639h) obj15));
                            } catch (Throwable th6) {
                                a8 = AbstractC0635d.a(th6);
                            }
                            c0276a.o(a8);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0638g interfaceC0638g8 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            D2.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            D2.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            D2.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g8.N(str10, booleanValue, (C0639h) obj18);
                                a9 = AbstractC0635d.s(null);
                            } catch (Throwable th7) {
                                a9 = AbstractC0635d.a(th7);
                            }
                            c0276a.o(a9);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0638g interfaceC0638g9 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            D2.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            D2.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a10 = AbstractC0635d.s(interfaceC0638g9.G(str11, (C0639h) obj20));
                            } catch (Throwable th8) {
                                a10 = AbstractC0635d.a(th8);
                            }
                            c0276a.o(a10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0638g interfaceC0638g10 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            D2.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            D2.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = AbstractC0635d.s(interfaceC0638g10.p(str12, (C0639h) obj22));
                            } catch (Throwable th9) {
                                a11 = AbstractC0635d.a(th9);
                            }
                            c0276a.o(a11);
                            return;
                        case 9:
                            InterfaceC0638g interfaceC0638g11 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            D2.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g11.k(list12, (C0639h) obj23);
                                a12 = AbstractC0635d.s(null);
                            } catch (Throwable th10) {
                                a12 = AbstractC0635d.a(th10);
                            }
                            c0276a.o(a12);
                            return;
                        case 10:
                            InterfaceC0638g interfaceC0638g12 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            D2.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a13 = AbstractC0635d.s(interfaceC0638g12.I(list14, (C0639h) obj24));
                            } catch (Throwable th11) {
                                a13 = AbstractC0635d.a(th11);
                            }
                            c0276a.o(a13);
                            return;
                        case 11:
                            InterfaceC0638g interfaceC0638g13 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            D2.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = AbstractC0635d.s(interfaceC0638g13.o(list16, (C0639h) obj25));
                            } catch (Throwable th12) {
                                a14 = AbstractC0635d.a(th12);
                            }
                            c0276a.o(a14);
                            return;
                        case 12:
                            InterfaceC0638g interfaceC0638g14 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            D2.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            D2.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            D2.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g14.q(str13, str14, (C0639h) obj28);
                                a15 = AbstractC0635d.s(null);
                            } catch (Throwable th13) {
                                a15 = AbstractC0635d.a(th13);
                            }
                            c0276a.o(a15);
                            return;
                        case 13:
                            InterfaceC0638g interfaceC0638g15 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            D2.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            D2.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            D2.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g15.M(str15, longValue, (C0639h) obj31);
                                a16 = AbstractC0635d.s(null);
                            } catch (Throwable th14) {
                                a16 = AbstractC0635d.a(th14);
                            }
                            c0276a.o(a16);
                            return;
                        default:
                            InterfaceC0638g interfaceC0638g16 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            D2.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            D2.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            D2.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g16.u(str16, doubleValue, (C0639h) obj34);
                                a17 = AbstractC0635d.s(null);
                            } catch (Throwable th15) {
                                a17 = AbstractC0635d.a(th15);
                            }
                            c0276a.o(a17);
                            return;
                    }
                }
            });
        } else {
            c0059m2.o(null);
        }
        C0059m c0059m3 = new C0059m(gVar, D2.h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", str2), a(), i3);
        if (interfaceC0638g != null) {
            c0059m3.o(new InterfaceC0278c() { // from class: m2.e
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    List a3;
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    switch (r2) {
                        case 0:
                            InterfaceC0638g interfaceC0638g2 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            D2.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            D2.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            D2.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g2.h(str3, str4, (C0639h) obj4);
                                a3 = AbstractC0635d.s(null);
                            } catch (Throwable th) {
                                a3 = AbstractC0635d.a(th);
                            }
                            c0276a.o(a3);
                            return;
                        case 1:
                            InterfaceC0638g interfaceC0638g3 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            D2.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            D2.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            D2.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g3.y(str5, list3, (C0639h) obj7);
                                a4 = AbstractC0635d.s(null);
                            } catch (Throwable th2) {
                                a4 = AbstractC0635d.a(th2);
                            }
                            c0276a.o(a4);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0638g interfaceC0638g4 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            D2.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            D2.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a5 = AbstractC0635d.s(interfaceC0638g4.O(str6, (C0639h) obj9));
                            } catch (Throwable th3) {
                                a5 = AbstractC0635d.a(th3);
                            }
                            c0276a.o(a5);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0638g interfaceC0638g5 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            D2.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            D2.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = AbstractC0635d.s(interfaceC0638g5.i(str7, (C0639h) obj11));
                            } catch (Throwable th4) {
                                a6 = AbstractC0635d.a(th4);
                            }
                            c0276a.o(a6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0638g interfaceC0638g6 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            D2.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            D2.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = AbstractC0635d.s(interfaceC0638g6.E(str8, (C0639h) obj13));
                            } catch (Throwable th5) {
                                a7 = AbstractC0635d.a(th5);
                            }
                            c0276a.o(a7);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0638g interfaceC0638g7 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            D2.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            D2.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = AbstractC0635d.s(interfaceC0638g7.t(str9, (C0639h) obj15));
                            } catch (Throwable th6) {
                                a8 = AbstractC0635d.a(th6);
                            }
                            c0276a.o(a8);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0638g interfaceC0638g8 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            D2.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            D2.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            D2.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g8.N(str10, booleanValue, (C0639h) obj18);
                                a9 = AbstractC0635d.s(null);
                            } catch (Throwable th7) {
                                a9 = AbstractC0635d.a(th7);
                            }
                            c0276a.o(a9);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0638g interfaceC0638g9 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            D2.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            D2.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a10 = AbstractC0635d.s(interfaceC0638g9.G(str11, (C0639h) obj20));
                            } catch (Throwable th8) {
                                a10 = AbstractC0635d.a(th8);
                            }
                            c0276a.o(a10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0638g interfaceC0638g10 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            D2.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            D2.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = AbstractC0635d.s(interfaceC0638g10.p(str12, (C0639h) obj22));
                            } catch (Throwable th9) {
                                a11 = AbstractC0635d.a(th9);
                            }
                            c0276a.o(a11);
                            return;
                        case 9:
                            InterfaceC0638g interfaceC0638g11 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            D2.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g11.k(list12, (C0639h) obj23);
                                a12 = AbstractC0635d.s(null);
                            } catch (Throwable th10) {
                                a12 = AbstractC0635d.a(th10);
                            }
                            c0276a.o(a12);
                            return;
                        case 10:
                            InterfaceC0638g interfaceC0638g12 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            D2.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a13 = AbstractC0635d.s(interfaceC0638g12.I(list14, (C0639h) obj24));
                            } catch (Throwable th11) {
                                a13 = AbstractC0635d.a(th11);
                            }
                            c0276a.o(a13);
                            return;
                        case 11:
                            InterfaceC0638g interfaceC0638g13 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            D2.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = AbstractC0635d.s(interfaceC0638g13.o(list16, (C0639h) obj25));
                            } catch (Throwable th12) {
                                a14 = AbstractC0635d.a(th12);
                            }
                            c0276a.o(a14);
                            return;
                        case 12:
                            InterfaceC0638g interfaceC0638g14 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            D2.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            D2.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            D2.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g14.q(str13, str14, (C0639h) obj28);
                                a15 = AbstractC0635d.s(null);
                            } catch (Throwable th13) {
                                a15 = AbstractC0635d.a(th13);
                            }
                            c0276a.o(a15);
                            return;
                        case 13:
                            InterfaceC0638g interfaceC0638g15 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            D2.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            D2.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            D2.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g15.M(str15, longValue, (C0639h) obj31);
                                a16 = AbstractC0635d.s(null);
                            } catch (Throwable th14) {
                                a16 = AbstractC0635d.a(th14);
                            }
                            c0276a.o(a16);
                            return;
                        default:
                            InterfaceC0638g interfaceC0638g16 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            D2.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            D2.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            D2.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g16.u(str16, doubleValue, (C0639h) obj34);
                                a17 = AbstractC0635d.s(null);
                            } catch (Throwable th15) {
                                a17 = AbstractC0635d.a(th15);
                            }
                            c0276a.o(a17);
                            return;
                    }
                }
            });
        } else {
            c0059m3.o(null);
        }
        C0059m c0059m4 = new C0059m(gVar, D2.h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", str2), a(), i3);
        if (interfaceC0638g != null) {
            c0059m4.o(new InterfaceC0278c() { // from class: m2.e
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    List a3;
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    switch (r2) {
                        case 0:
                            InterfaceC0638g interfaceC0638g2 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            D2.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            D2.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            D2.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g2.h(str3, str4, (C0639h) obj4);
                                a3 = AbstractC0635d.s(null);
                            } catch (Throwable th) {
                                a3 = AbstractC0635d.a(th);
                            }
                            c0276a.o(a3);
                            return;
                        case 1:
                            InterfaceC0638g interfaceC0638g3 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            D2.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            D2.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            D2.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g3.y(str5, list3, (C0639h) obj7);
                                a4 = AbstractC0635d.s(null);
                            } catch (Throwable th2) {
                                a4 = AbstractC0635d.a(th2);
                            }
                            c0276a.o(a4);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0638g interfaceC0638g4 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            D2.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            D2.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a5 = AbstractC0635d.s(interfaceC0638g4.O(str6, (C0639h) obj9));
                            } catch (Throwable th3) {
                                a5 = AbstractC0635d.a(th3);
                            }
                            c0276a.o(a5);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0638g interfaceC0638g5 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            D2.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            D2.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = AbstractC0635d.s(interfaceC0638g5.i(str7, (C0639h) obj11));
                            } catch (Throwable th4) {
                                a6 = AbstractC0635d.a(th4);
                            }
                            c0276a.o(a6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0638g interfaceC0638g6 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            D2.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            D2.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = AbstractC0635d.s(interfaceC0638g6.E(str8, (C0639h) obj13));
                            } catch (Throwable th5) {
                                a7 = AbstractC0635d.a(th5);
                            }
                            c0276a.o(a7);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0638g interfaceC0638g7 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            D2.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            D2.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = AbstractC0635d.s(interfaceC0638g7.t(str9, (C0639h) obj15));
                            } catch (Throwable th6) {
                                a8 = AbstractC0635d.a(th6);
                            }
                            c0276a.o(a8);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0638g interfaceC0638g8 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            D2.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            D2.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            D2.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g8.N(str10, booleanValue, (C0639h) obj18);
                                a9 = AbstractC0635d.s(null);
                            } catch (Throwable th7) {
                                a9 = AbstractC0635d.a(th7);
                            }
                            c0276a.o(a9);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0638g interfaceC0638g9 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            D2.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            D2.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a10 = AbstractC0635d.s(interfaceC0638g9.G(str11, (C0639h) obj20));
                            } catch (Throwable th8) {
                                a10 = AbstractC0635d.a(th8);
                            }
                            c0276a.o(a10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0638g interfaceC0638g10 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            D2.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            D2.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = AbstractC0635d.s(interfaceC0638g10.p(str12, (C0639h) obj22));
                            } catch (Throwable th9) {
                                a11 = AbstractC0635d.a(th9);
                            }
                            c0276a.o(a11);
                            return;
                        case 9:
                            InterfaceC0638g interfaceC0638g11 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            D2.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g11.k(list12, (C0639h) obj23);
                                a12 = AbstractC0635d.s(null);
                            } catch (Throwable th10) {
                                a12 = AbstractC0635d.a(th10);
                            }
                            c0276a.o(a12);
                            return;
                        case 10:
                            InterfaceC0638g interfaceC0638g12 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            D2.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a13 = AbstractC0635d.s(interfaceC0638g12.I(list14, (C0639h) obj24));
                            } catch (Throwable th11) {
                                a13 = AbstractC0635d.a(th11);
                            }
                            c0276a.o(a13);
                            return;
                        case 11:
                            InterfaceC0638g interfaceC0638g13 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            D2.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = AbstractC0635d.s(interfaceC0638g13.o(list16, (C0639h) obj25));
                            } catch (Throwable th12) {
                                a14 = AbstractC0635d.a(th12);
                            }
                            c0276a.o(a14);
                            return;
                        case 12:
                            InterfaceC0638g interfaceC0638g14 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            D2.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            D2.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            D2.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g14.q(str13, str14, (C0639h) obj28);
                                a15 = AbstractC0635d.s(null);
                            } catch (Throwable th13) {
                                a15 = AbstractC0635d.a(th13);
                            }
                            c0276a.o(a15);
                            return;
                        case 13:
                            InterfaceC0638g interfaceC0638g15 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            D2.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            D2.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            D2.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g15.M(str15, longValue, (C0639h) obj31);
                                a16 = AbstractC0635d.s(null);
                            } catch (Throwable th14) {
                                a16 = AbstractC0635d.a(th14);
                            }
                            c0276a.o(a16);
                            return;
                        default:
                            InterfaceC0638g interfaceC0638g16 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            D2.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            D2.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            D2.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g16.u(str16, doubleValue, (C0639h) obj34);
                                a17 = AbstractC0635d.s(null);
                            } catch (Throwable th15) {
                                a17 = AbstractC0635d.a(th15);
                            }
                            c0276a.o(a17);
                            return;
                    }
                }
            });
        } else {
            c0059m4.o(null);
        }
        C0059m c0059m5 = new C0059m(gVar, D2.h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", str2), a(), i3);
        if (interfaceC0638g != null) {
            c0059m5.o(new InterfaceC0278c() { // from class: m2.e
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    List a3;
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    switch (r2) {
                        case 0:
                            InterfaceC0638g interfaceC0638g2 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            D2.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            D2.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            D2.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g2.h(str3, str4, (C0639h) obj4);
                                a3 = AbstractC0635d.s(null);
                            } catch (Throwable th) {
                                a3 = AbstractC0635d.a(th);
                            }
                            c0276a.o(a3);
                            return;
                        case 1:
                            InterfaceC0638g interfaceC0638g3 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            D2.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            D2.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            D2.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g3.y(str5, list3, (C0639h) obj7);
                                a4 = AbstractC0635d.s(null);
                            } catch (Throwable th2) {
                                a4 = AbstractC0635d.a(th2);
                            }
                            c0276a.o(a4);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0638g interfaceC0638g4 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            D2.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            D2.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a5 = AbstractC0635d.s(interfaceC0638g4.O(str6, (C0639h) obj9));
                            } catch (Throwable th3) {
                                a5 = AbstractC0635d.a(th3);
                            }
                            c0276a.o(a5);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0638g interfaceC0638g5 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            D2.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            D2.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = AbstractC0635d.s(interfaceC0638g5.i(str7, (C0639h) obj11));
                            } catch (Throwable th4) {
                                a6 = AbstractC0635d.a(th4);
                            }
                            c0276a.o(a6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0638g interfaceC0638g6 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            D2.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            D2.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = AbstractC0635d.s(interfaceC0638g6.E(str8, (C0639h) obj13));
                            } catch (Throwable th5) {
                                a7 = AbstractC0635d.a(th5);
                            }
                            c0276a.o(a7);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0638g interfaceC0638g7 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            D2.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            D2.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = AbstractC0635d.s(interfaceC0638g7.t(str9, (C0639h) obj15));
                            } catch (Throwable th6) {
                                a8 = AbstractC0635d.a(th6);
                            }
                            c0276a.o(a8);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0638g interfaceC0638g8 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            D2.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            D2.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            D2.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g8.N(str10, booleanValue, (C0639h) obj18);
                                a9 = AbstractC0635d.s(null);
                            } catch (Throwable th7) {
                                a9 = AbstractC0635d.a(th7);
                            }
                            c0276a.o(a9);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0638g interfaceC0638g9 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            D2.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            D2.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a10 = AbstractC0635d.s(interfaceC0638g9.G(str11, (C0639h) obj20));
                            } catch (Throwable th8) {
                                a10 = AbstractC0635d.a(th8);
                            }
                            c0276a.o(a10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0638g interfaceC0638g10 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            D2.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            D2.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = AbstractC0635d.s(interfaceC0638g10.p(str12, (C0639h) obj22));
                            } catch (Throwable th9) {
                                a11 = AbstractC0635d.a(th9);
                            }
                            c0276a.o(a11);
                            return;
                        case 9:
                            InterfaceC0638g interfaceC0638g11 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            D2.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g11.k(list12, (C0639h) obj23);
                                a12 = AbstractC0635d.s(null);
                            } catch (Throwable th10) {
                                a12 = AbstractC0635d.a(th10);
                            }
                            c0276a.o(a12);
                            return;
                        case 10:
                            InterfaceC0638g interfaceC0638g12 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            D2.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a13 = AbstractC0635d.s(interfaceC0638g12.I(list14, (C0639h) obj24));
                            } catch (Throwable th11) {
                                a13 = AbstractC0635d.a(th11);
                            }
                            c0276a.o(a13);
                            return;
                        case 11:
                            InterfaceC0638g interfaceC0638g13 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            D2.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = AbstractC0635d.s(interfaceC0638g13.o(list16, (C0639h) obj25));
                            } catch (Throwable th12) {
                                a14 = AbstractC0635d.a(th12);
                            }
                            c0276a.o(a14);
                            return;
                        case 12:
                            InterfaceC0638g interfaceC0638g14 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            D2.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            D2.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            D2.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g14.q(str13, str14, (C0639h) obj28);
                                a15 = AbstractC0635d.s(null);
                            } catch (Throwable th13) {
                                a15 = AbstractC0635d.a(th13);
                            }
                            c0276a.o(a15);
                            return;
                        case 13:
                            InterfaceC0638g interfaceC0638g15 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            D2.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            D2.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            D2.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g15.M(str15, longValue, (C0639h) obj31);
                                a16 = AbstractC0635d.s(null);
                            } catch (Throwable th14) {
                                a16 = AbstractC0635d.a(th14);
                            }
                            c0276a.o(a16);
                            return;
                        default:
                            InterfaceC0638g interfaceC0638g16 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            D2.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            D2.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            D2.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g16.u(str16, doubleValue, (C0639h) obj34);
                                a17 = AbstractC0635d.s(null);
                            } catch (Throwable th15) {
                                a17 = AbstractC0635d.a(th15);
                            }
                            c0276a.o(a17);
                            return;
                    }
                }
            });
        } else {
            c0059m5.o(null);
        }
        C0059m c0059m6 = new C0059m(gVar, D2.h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", str2), a(), i3);
        if (interfaceC0638g != null) {
            c0059m6.o(new InterfaceC0278c() { // from class: m2.e
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    List a3;
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    switch (r2) {
                        case 0:
                            InterfaceC0638g interfaceC0638g2 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            D2.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            D2.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            D2.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g2.h(str3, str4, (C0639h) obj4);
                                a3 = AbstractC0635d.s(null);
                            } catch (Throwable th) {
                                a3 = AbstractC0635d.a(th);
                            }
                            c0276a.o(a3);
                            return;
                        case 1:
                            InterfaceC0638g interfaceC0638g3 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            D2.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            D2.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            D2.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g3.y(str5, list3, (C0639h) obj7);
                                a4 = AbstractC0635d.s(null);
                            } catch (Throwable th2) {
                                a4 = AbstractC0635d.a(th2);
                            }
                            c0276a.o(a4);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0638g interfaceC0638g4 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            D2.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            D2.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a5 = AbstractC0635d.s(interfaceC0638g4.O(str6, (C0639h) obj9));
                            } catch (Throwable th3) {
                                a5 = AbstractC0635d.a(th3);
                            }
                            c0276a.o(a5);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0638g interfaceC0638g5 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            D2.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            D2.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = AbstractC0635d.s(interfaceC0638g5.i(str7, (C0639h) obj11));
                            } catch (Throwable th4) {
                                a6 = AbstractC0635d.a(th4);
                            }
                            c0276a.o(a6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0638g interfaceC0638g6 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            D2.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            D2.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = AbstractC0635d.s(interfaceC0638g6.E(str8, (C0639h) obj13));
                            } catch (Throwable th5) {
                                a7 = AbstractC0635d.a(th5);
                            }
                            c0276a.o(a7);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0638g interfaceC0638g7 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            D2.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            D2.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = AbstractC0635d.s(interfaceC0638g7.t(str9, (C0639h) obj15));
                            } catch (Throwable th6) {
                                a8 = AbstractC0635d.a(th6);
                            }
                            c0276a.o(a8);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0638g interfaceC0638g8 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            D2.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            D2.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            D2.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g8.N(str10, booleanValue, (C0639h) obj18);
                                a9 = AbstractC0635d.s(null);
                            } catch (Throwable th7) {
                                a9 = AbstractC0635d.a(th7);
                            }
                            c0276a.o(a9);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0638g interfaceC0638g9 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            D2.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            D2.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a10 = AbstractC0635d.s(interfaceC0638g9.G(str11, (C0639h) obj20));
                            } catch (Throwable th8) {
                                a10 = AbstractC0635d.a(th8);
                            }
                            c0276a.o(a10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0638g interfaceC0638g10 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            D2.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            D2.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = AbstractC0635d.s(interfaceC0638g10.p(str12, (C0639h) obj22));
                            } catch (Throwable th9) {
                                a11 = AbstractC0635d.a(th9);
                            }
                            c0276a.o(a11);
                            return;
                        case 9:
                            InterfaceC0638g interfaceC0638g11 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            D2.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g11.k(list12, (C0639h) obj23);
                                a12 = AbstractC0635d.s(null);
                            } catch (Throwable th10) {
                                a12 = AbstractC0635d.a(th10);
                            }
                            c0276a.o(a12);
                            return;
                        case 10:
                            InterfaceC0638g interfaceC0638g12 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            D2.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a13 = AbstractC0635d.s(interfaceC0638g12.I(list14, (C0639h) obj24));
                            } catch (Throwable th11) {
                                a13 = AbstractC0635d.a(th11);
                            }
                            c0276a.o(a13);
                            return;
                        case 11:
                            InterfaceC0638g interfaceC0638g13 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            D2.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = AbstractC0635d.s(interfaceC0638g13.o(list16, (C0639h) obj25));
                            } catch (Throwable th12) {
                                a14 = AbstractC0635d.a(th12);
                            }
                            c0276a.o(a14);
                            return;
                        case 12:
                            InterfaceC0638g interfaceC0638g14 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            D2.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            D2.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            D2.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g14.q(str13, str14, (C0639h) obj28);
                                a15 = AbstractC0635d.s(null);
                            } catch (Throwable th13) {
                                a15 = AbstractC0635d.a(th13);
                            }
                            c0276a.o(a15);
                            return;
                        case 13:
                            InterfaceC0638g interfaceC0638g15 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            D2.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            D2.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            D2.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g15.M(str15, longValue, (C0639h) obj31);
                                a16 = AbstractC0635d.s(null);
                            } catch (Throwable th14) {
                                a16 = AbstractC0635d.a(th14);
                            }
                            c0276a.o(a16);
                            return;
                        default:
                            InterfaceC0638g interfaceC0638g16 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            D2.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            D2.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            D2.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g16.u(str16, doubleValue, (C0639h) obj34);
                                a17 = AbstractC0635d.s(null);
                            } catch (Throwable th15) {
                                a17 = AbstractC0635d.a(th15);
                            }
                            c0276a.o(a17);
                            return;
                    }
                }
            });
        } else {
            c0059m6.o(null);
        }
        C0059m c0059m7 = new C0059m(gVar, D2.h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", str2), a(), i3);
        if (interfaceC0638g != null) {
            c0059m7.o(new InterfaceC0278c() { // from class: m2.e
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    List a3;
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    switch (r2) {
                        case 0:
                            InterfaceC0638g interfaceC0638g2 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            D2.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            D2.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            D2.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g2.h(str3, str4, (C0639h) obj4);
                                a3 = AbstractC0635d.s(null);
                            } catch (Throwable th) {
                                a3 = AbstractC0635d.a(th);
                            }
                            c0276a.o(a3);
                            return;
                        case 1:
                            InterfaceC0638g interfaceC0638g3 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            D2.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            D2.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            D2.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g3.y(str5, list3, (C0639h) obj7);
                                a4 = AbstractC0635d.s(null);
                            } catch (Throwable th2) {
                                a4 = AbstractC0635d.a(th2);
                            }
                            c0276a.o(a4);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0638g interfaceC0638g4 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            D2.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            D2.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a5 = AbstractC0635d.s(interfaceC0638g4.O(str6, (C0639h) obj9));
                            } catch (Throwable th3) {
                                a5 = AbstractC0635d.a(th3);
                            }
                            c0276a.o(a5);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0638g interfaceC0638g5 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            D2.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            D2.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = AbstractC0635d.s(interfaceC0638g5.i(str7, (C0639h) obj11));
                            } catch (Throwable th4) {
                                a6 = AbstractC0635d.a(th4);
                            }
                            c0276a.o(a6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0638g interfaceC0638g6 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            D2.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            D2.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = AbstractC0635d.s(interfaceC0638g6.E(str8, (C0639h) obj13));
                            } catch (Throwable th5) {
                                a7 = AbstractC0635d.a(th5);
                            }
                            c0276a.o(a7);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0638g interfaceC0638g7 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            D2.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            D2.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = AbstractC0635d.s(interfaceC0638g7.t(str9, (C0639h) obj15));
                            } catch (Throwable th6) {
                                a8 = AbstractC0635d.a(th6);
                            }
                            c0276a.o(a8);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0638g interfaceC0638g8 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            D2.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            D2.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            D2.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g8.N(str10, booleanValue, (C0639h) obj18);
                                a9 = AbstractC0635d.s(null);
                            } catch (Throwable th7) {
                                a9 = AbstractC0635d.a(th7);
                            }
                            c0276a.o(a9);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0638g interfaceC0638g9 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            D2.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            D2.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a10 = AbstractC0635d.s(interfaceC0638g9.G(str11, (C0639h) obj20));
                            } catch (Throwable th8) {
                                a10 = AbstractC0635d.a(th8);
                            }
                            c0276a.o(a10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0638g interfaceC0638g10 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            D2.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            D2.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = AbstractC0635d.s(interfaceC0638g10.p(str12, (C0639h) obj22));
                            } catch (Throwable th9) {
                                a11 = AbstractC0635d.a(th9);
                            }
                            c0276a.o(a11);
                            return;
                        case 9:
                            InterfaceC0638g interfaceC0638g11 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            D2.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g11.k(list12, (C0639h) obj23);
                                a12 = AbstractC0635d.s(null);
                            } catch (Throwable th10) {
                                a12 = AbstractC0635d.a(th10);
                            }
                            c0276a.o(a12);
                            return;
                        case 10:
                            InterfaceC0638g interfaceC0638g12 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            D2.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a13 = AbstractC0635d.s(interfaceC0638g12.I(list14, (C0639h) obj24));
                            } catch (Throwable th11) {
                                a13 = AbstractC0635d.a(th11);
                            }
                            c0276a.o(a13);
                            return;
                        case 11:
                            InterfaceC0638g interfaceC0638g13 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            D2.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = AbstractC0635d.s(interfaceC0638g13.o(list16, (C0639h) obj25));
                            } catch (Throwable th12) {
                                a14 = AbstractC0635d.a(th12);
                            }
                            c0276a.o(a14);
                            return;
                        case 12:
                            InterfaceC0638g interfaceC0638g14 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            D2.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            D2.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            D2.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g14.q(str13, str14, (C0639h) obj28);
                                a15 = AbstractC0635d.s(null);
                            } catch (Throwable th13) {
                                a15 = AbstractC0635d.a(th13);
                            }
                            c0276a.o(a15);
                            return;
                        case 13:
                            InterfaceC0638g interfaceC0638g15 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            D2.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            D2.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            D2.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g15.M(str15, longValue, (C0639h) obj31);
                                a16 = AbstractC0635d.s(null);
                            } catch (Throwable th14) {
                                a16 = AbstractC0635d.a(th14);
                            }
                            c0276a.o(a16);
                            return;
                        default:
                            InterfaceC0638g interfaceC0638g16 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            D2.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            D2.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            D2.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g16.u(str16, doubleValue, (C0639h) obj34);
                                a17 = AbstractC0635d.s(null);
                            } catch (Throwable th15) {
                                a17 = AbstractC0635d.a(th15);
                            }
                            c0276a.o(a17);
                            return;
                    }
                }
            });
        } else {
            c0059m7.o(null);
        }
        C0059m c0059m8 = new C0059m(gVar, D2.h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", str2), a(), i3);
        if (interfaceC0638g != null) {
            c0059m8.o(new InterfaceC0278c() { // from class: m2.e
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    List a3;
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    switch (r2) {
                        case 0:
                            InterfaceC0638g interfaceC0638g2 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            D2.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            D2.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            D2.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g2.h(str3, str4, (C0639h) obj4);
                                a3 = AbstractC0635d.s(null);
                            } catch (Throwable th) {
                                a3 = AbstractC0635d.a(th);
                            }
                            c0276a.o(a3);
                            return;
                        case 1:
                            InterfaceC0638g interfaceC0638g3 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            D2.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            D2.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            D2.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g3.y(str5, list3, (C0639h) obj7);
                                a4 = AbstractC0635d.s(null);
                            } catch (Throwable th2) {
                                a4 = AbstractC0635d.a(th2);
                            }
                            c0276a.o(a4);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0638g interfaceC0638g4 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            D2.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            D2.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a5 = AbstractC0635d.s(interfaceC0638g4.O(str6, (C0639h) obj9));
                            } catch (Throwable th3) {
                                a5 = AbstractC0635d.a(th3);
                            }
                            c0276a.o(a5);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0638g interfaceC0638g5 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            D2.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            D2.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = AbstractC0635d.s(interfaceC0638g5.i(str7, (C0639h) obj11));
                            } catch (Throwable th4) {
                                a6 = AbstractC0635d.a(th4);
                            }
                            c0276a.o(a6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0638g interfaceC0638g6 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            D2.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            D2.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = AbstractC0635d.s(interfaceC0638g6.E(str8, (C0639h) obj13));
                            } catch (Throwable th5) {
                                a7 = AbstractC0635d.a(th5);
                            }
                            c0276a.o(a7);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0638g interfaceC0638g7 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            D2.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            D2.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = AbstractC0635d.s(interfaceC0638g7.t(str9, (C0639h) obj15));
                            } catch (Throwable th6) {
                                a8 = AbstractC0635d.a(th6);
                            }
                            c0276a.o(a8);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0638g interfaceC0638g8 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            D2.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            D2.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            D2.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g8.N(str10, booleanValue, (C0639h) obj18);
                                a9 = AbstractC0635d.s(null);
                            } catch (Throwable th7) {
                                a9 = AbstractC0635d.a(th7);
                            }
                            c0276a.o(a9);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0638g interfaceC0638g9 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            D2.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            D2.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a10 = AbstractC0635d.s(interfaceC0638g9.G(str11, (C0639h) obj20));
                            } catch (Throwable th8) {
                                a10 = AbstractC0635d.a(th8);
                            }
                            c0276a.o(a10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0638g interfaceC0638g10 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            D2.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            D2.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = AbstractC0635d.s(interfaceC0638g10.p(str12, (C0639h) obj22));
                            } catch (Throwable th9) {
                                a11 = AbstractC0635d.a(th9);
                            }
                            c0276a.o(a11);
                            return;
                        case 9:
                            InterfaceC0638g interfaceC0638g11 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            D2.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g11.k(list12, (C0639h) obj23);
                                a12 = AbstractC0635d.s(null);
                            } catch (Throwable th10) {
                                a12 = AbstractC0635d.a(th10);
                            }
                            c0276a.o(a12);
                            return;
                        case 10:
                            InterfaceC0638g interfaceC0638g12 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            D2.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a13 = AbstractC0635d.s(interfaceC0638g12.I(list14, (C0639h) obj24));
                            } catch (Throwable th11) {
                                a13 = AbstractC0635d.a(th11);
                            }
                            c0276a.o(a13);
                            return;
                        case 11:
                            InterfaceC0638g interfaceC0638g13 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            D2.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = AbstractC0635d.s(interfaceC0638g13.o(list16, (C0639h) obj25));
                            } catch (Throwable th12) {
                                a14 = AbstractC0635d.a(th12);
                            }
                            c0276a.o(a14);
                            return;
                        case 12:
                            InterfaceC0638g interfaceC0638g14 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            D2.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            D2.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            D2.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g14.q(str13, str14, (C0639h) obj28);
                                a15 = AbstractC0635d.s(null);
                            } catch (Throwable th13) {
                                a15 = AbstractC0635d.a(th13);
                            }
                            c0276a.o(a15);
                            return;
                        case 13:
                            InterfaceC0638g interfaceC0638g15 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            D2.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            D2.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            D2.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g15.M(str15, longValue, (C0639h) obj31);
                                a16 = AbstractC0635d.s(null);
                            } catch (Throwable th14) {
                                a16 = AbstractC0635d.a(th14);
                            }
                            c0276a.o(a16);
                            return;
                        default:
                            InterfaceC0638g interfaceC0638g16 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            D2.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            D2.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            D2.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g16.u(str16, doubleValue, (C0639h) obj34);
                                a17 = AbstractC0635d.s(null);
                            } catch (Throwable th15) {
                                a17 = AbstractC0635d.a(th15);
                            }
                            c0276a.o(a17);
                            return;
                    }
                }
            });
        } else {
            c0059m8.o(null);
        }
        C0059m c0059m9 = new C0059m(gVar, D2.h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", str2), a(), i3);
        if (interfaceC0638g != null) {
            c0059m9.o(new InterfaceC0278c() { // from class: m2.e
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    List a3;
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    switch (r2) {
                        case 0:
                            InterfaceC0638g interfaceC0638g2 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            D2.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            D2.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            D2.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g2.h(str3, str4, (C0639h) obj4);
                                a3 = AbstractC0635d.s(null);
                            } catch (Throwable th) {
                                a3 = AbstractC0635d.a(th);
                            }
                            c0276a.o(a3);
                            return;
                        case 1:
                            InterfaceC0638g interfaceC0638g3 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            D2.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            D2.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            D2.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g3.y(str5, list3, (C0639h) obj7);
                                a4 = AbstractC0635d.s(null);
                            } catch (Throwable th2) {
                                a4 = AbstractC0635d.a(th2);
                            }
                            c0276a.o(a4);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0638g interfaceC0638g4 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            D2.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            D2.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a5 = AbstractC0635d.s(interfaceC0638g4.O(str6, (C0639h) obj9));
                            } catch (Throwable th3) {
                                a5 = AbstractC0635d.a(th3);
                            }
                            c0276a.o(a5);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0638g interfaceC0638g5 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            D2.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            D2.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = AbstractC0635d.s(interfaceC0638g5.i(str7, (C0639h) obj11));
                            } catch (Throwable th4) {
                                a6 = AbstractC0635d.a(th4);
                            }
                            c0276a.o(a6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0638g interfaceC0638g6 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            D2.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            D2.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = AbstractC0635d.s(interfaceC0638g6.E(str8, (C0639h) obj13));
                            } catch (Throwable th5) {
                                a7 = AbstractC0635d.a(th5);
                            }
                            c0276a.o(a7);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0638g interfaceC0638g7 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            D2.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            D2.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = AbstractC0635d.s(interfaceC0638g7.t(str9, (C0639h) obj15));
                            } catch (Throwable th6) {
                                a8 = AbstractC0635d.a(th6);
                            }
                            c0276a.o(a8);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0638g interfaceC0638g8 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            D2.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            D2.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            D2.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g8.N(str10, booleanValue, (C0639h) obj18);
                                a9 = AbstractC0635d.s(null);
                            } catch (Throwable th7) {
                                a9 = AbstractC0635d.a(th7);
                            }
                            c0276a.o(a9);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0638g interfaceC0638g9 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            D2.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            D2.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a10 = AbstractC0635d.s(interfaceC0638g9.G(str11, (C0639h) obj20));
                            } catch (Throwable th8) {
                                a10 = AbstractC0635d.a(th8);
                            }
                            c0276a.o(a10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0638g interfaceC0638g10 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            D2.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            D2.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = AbstractC0635d.s(interfaceC0638g10.p(str12, (C0639h) obj22));
                            } catch (Throwable th9) {
                                a11 = AbstractC0635d.a(th9);
                            }
                            c0276a.o(a11);
                            return;
                        case 9:
                            InterfaceC0638g interfaceC0638g11 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            D2.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g11.k(list12, (C0639h) obj23);
                                a12 = AbstractC0635d.s(null);
                            } catch (Throwable th10) {
                                a12 = AbstractC0635d.a(th10);
                            }
                            c0276a.o(a12);
                            return;
                        case 10:
                            InterfaceC0638g interfaceC0638g12 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            D2.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a13 = AbstractC0635d.s(interfaceC0638g12.I(list14, (C0639h) obj24));
                            } catch (Throwable th11) {
                                a13 = AbstractC0635d.a(th11);
                            }
                            c0276a.o(a13);
                            return;
                        case 11:
                            InterfaceC0638g interfaceC0638g13 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            D2.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = AbstractC0635d.s(interfaceC0638g13.o(list16, (C0639h) obj25));
                            } catch (Throwable th12) {
                                a14 = AbstractC0635d.a(th12);
                            }
                            c0276a.o(a14);
                            return;
                        case 12:
                            InterfaceC0638g interfaceC0638g14 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            D2.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            D2.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            D2.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g14.q(str13, str14, (C0639h) obj28);
                                a15 = AbstractC0635d.s(null);
                            } catch (Throwable th13) {
                                a15 = AbstractC0635d.a(th13);
                            }
                            c0276a.o(a15);
                            return;
                        case 13:
                            InterfaceC0638g interfaceC0638g15 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            D2.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            D2.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            D2.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g15.M(str15, longValue, (C0639h) obj31);
                                a16 = AbstractC0635d.s(null);
                            } catch (Throwable th14) {
                                a16 = AbstractC0635d.a(th14);
                            }
                            c0276a.o(a16);
                            return;
                        default:
                            InterfaceC0638g interfaceC0638g16 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            D2.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            D2.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            D2.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g16.u(str16, doubleValue, (C0639h) obj34);
                                a17 = AbstractC0635d.s(null);
                            } catch (Throwable th15) {
                                a17 = AbstractC0635d.a(th15);
                            }
                            c0276a.o(a17);
                            return;
                    }
                }
            });
        } else {
            c0059m9.o(null);
        }
        C0059m c0059m10 = new C0059m(gVar, D2.h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", str2), a(), i3);
        if (interfaceC0638g != null) {
            c0059m10.o(new InterfaceC0278c() { // from class: m2.e
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    List a3;
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    switch (r2) {
                        case 0:
                            InterfaceC0638g interfaceC0638g2 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            D2.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            D2.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            D2.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g2.h(str3, str4, (C0639h) obj4);
                                a3 = AbstractC0635d.s(null);
                            } catch (Throwable th) {
                                a3 = AbstractC0635d.a(th);
                            }
                            c0276a.o(a3);
                            return;
                        case 1:
                            InterfaceC0638g interfaceC0638g3 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            D2.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            D2.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            D2.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g3.y(str5, list3, (C0639h) obj7);
                                a4 = AbstractC0635d.s(null);
                            } catch (Throwable th2) {
                                a4 = AbstractC0635d.a(th2);
                            }
                            c0276a.o(a4);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0638g interfaceC0638g4 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            D2.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            D2.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a5 = AbstractC0635d.s(interfaceC0638g4.O(str6, (C0639h) obj9));
                            } catch (Throwable th3) {
                                a5 = AbstractC0635d.a(th3);
                            }
                            c0276a.o(a5);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0638g interfaceC0638g5 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            D2.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            D2.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = AbstractC0635d.s(interfaceC0638g5.i(str7, (C0639h) obj11));
                            } catch (Throwable th4) {
                                a6 = AbstractC0635d.a(th4);
                            }
                            c0276a.o(a6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0638g interfaceC0638g6 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            D2.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            D2.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = AbstractC0635d.s(interfaceC0638g6.E(str8, (C0639h) obj13));
                            } catch (Throwable th5) {
                                a7 = AbstractC0635d.a(th5);
                            }
                            c0276a.o(a7);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0638g interfaceC0638g7 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            D2.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            D2.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = AbstractC0635d.s(interfaceC0638g7.t(str9, (C0639h) obj15));
                            } catch (Throwable th6) {
                                a8 = AbstractC0635d.a(th6);
                            }
                            c0276a.o(a8);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0638g interfaceC0638g8 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            D2.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            D2.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            D2.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g8.N(str10, booleanValue, (C0639h) obj18);
                                a9 = AbstractC0635d.s(null);
                            } catch (Throwable th7) {
                                a9 = AbstractC0635d.a(th7);
                            }
                            c0276a.o(a9);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0638g interfaceC0638g9 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            D2.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            D2.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a10 = AbstractC0635d.s(interfaceC0638g9.G(str11, (C0639h) obj20));
                            } catch (Throwable th8) {
                                a10 = AbstractC0635d.a(th8);
                            }
                            c0276a.o(a10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0638g interfaceC0638g10 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            D2.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            D2.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = AbstractC0635d.s(interfaceC0638g10.p(str12, (C0639h) obj22));
                            } catch (Throwable th9) {
                                a11 = AbstractC0635d.a(th9);
                            }
                            c0276a.o(a11);
                            return;
                        case 9:
                            InterfaceC0638g interfaceC0638g11 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            D2.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g11.k(list12, (C0639h) obj23);
                                a12 = AbstractC0635d.s(null);
                            } catch (Throwable th10) {
                                a12 = AbstractC0635d.a(th10);
                            }
                            c0276a.o(a12);
                            return;
                        case 10:
                            InterfaceC0638g interfaceC0638g12 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            D2.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a13 = AbstractC0635d.s(interfaceC0638g12.I(list14, (C0639h) obj24));
                            } catch (Throwable th11) {
                                a13 = AbstractC0635d.a(th11);
                            }
                            c0276a.o(a13);
                            return;
                        case 11:
                            InterfaceC0638g interfaceC0638g13 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            D2.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = AbstractC0635d.s(interfaceC0638g13.o(list16, (C0639h) obj25));
                            } catch (Throwable th12) {
                                a14 = AbstractC0635d.a(th12);
                            }
                            c0276a.o(a14);
                            return;
                        case 12:
                            InterfaceC0638g interfaceC0638g14 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            D2.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            D2.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            D2.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g14.q(str13, str14, (C0639h) obj28);
                                a15 = AbstractC0635d.s(null);
                            } catch (Throwable th13) {
                                a15 = AbstractC0635d.a(th13);
                            }
                            c0276a.o(a15);
                            return;
                        case 13:
                            InterfaceC0638g interfaceC0638g15 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            D2.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            D2.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            D2.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g15.M(str15, longValue, (C0639h) obj31);
                                a16 = AbstractC0635d.s(null);
                            } catch (Throwable th14) {
                                a16 = AbstractC0635d.a(th14);
                            }
                            c0276a.o(a16);
                            return;
                        default:
                            InterfaceC0638g interfaceC0638g16 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            D2.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            D2.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            D2.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g16.u(str16, doubleValue, (C0639h) obj34);
                                a17 = AbstractC0635d.s(null);
                            } catch (Throwable th15) {
                                a17 = AbstractC0635d.a(th15);
                            }
                            c0276a.o(a17);
                            return;
                    }
                }
            });
        } else {
            c0059m10.o(null);
        }
        C0059m c0059m11 = new C0059m(gVar, D2.h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", str2), a(), i3);
        if (interfaceC0638g != null) {
            c0059m11.o(new InterfaceC0278c() { // from class: m2.e
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    List a3;
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    switch (r2) {
                        case 0:
                            InterfaceC0638g interfaceC0638g2 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            D2.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            D2.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            D2.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g2.h(str3, str4, (C0639h) obj4);
                                a3 = AbstractC0635d.s(null);
                            } catch (Throwable th) {
                                a3 = AbstractC0635d.a(th);
                            }
                            c0276a.o(a3);
                            return;
                        case 1:
                            InterfaceC0638g interfaceC0638g3 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            D2.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            D2.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            D2.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g3.y(str5, list3, (C0639h) obj7);
                                a4 = AbstractC0635d.s(null);
                            } catch (Throwable th2) {
                                a4 = AbstractC0635d.a(th2);
                            }
                            c0276a.o(a4);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0638g interfaceC0638g4 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            D2.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            D2.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a5 = AbstractC0635d.s(interfaceC0638g4.O(str6, (C0639h) obj9));
                            } catch (Throwable th3) {
                                a5 = AbstractC0635d.a(th3);
                            }
                            c0276a.o(a5);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0638g interfaceC0638g5 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            D2.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            D2.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = AbstractC0635d.s(interfaceC0638g5.i(str7, (C0639h) obj11));
                            } catch (Throwable th4) {
                                a6 = AbstractC0635d.a(th4);
                            }
                            c0276a.o(a6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0638g interfaceC0638g6 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            D2.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            D2.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = AbstractC0635d.s(interfaceC0638g6.E(str8, (C0639h) obj13));
                            } catch (Throwable th5) {
                                a7 = AbstractC0635d.a(th5);
                            }
                            c0276a.o(a7);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0638g interfaceC0638g7 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            D2.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            D2.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = AbstractC0635d.s(interfaceC0638g7.t(str9, (C0639h) obj15));
                            } catch (Throwable th6) {
                                a8 = AbstractC0635d.a(th6);
                            }
                            c0276a.o(a8);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0638g interfaceC0638g8 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            D2.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            D2.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            D2.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g8.N(str10, booleanValue, (C0639h) obj18);
                                a9 = AbstractC0635d.s(null);
                            } catch (Throwable th7) {
                                a9 = AbstractC0635d.a(th7);
                            }
                            c0276a.o(a9);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0638g interfaceC0638g9 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            D2.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            D2.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a10 = AbstractC0635d.s(interfaceC0638g9.G(str11, (C0639h) obj20));
                            } catch (Throwable th8) {
                                a10 = AbstractC0635d.a(th8);
                            }
                            c0276a.o(a10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0638g interfaceC0638g10 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            D2.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            D2.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = AbstractC0635d.s(interfaceC0638g10.p(str12, (C0639h) obj22));
                            } catch (Throwable th9) {
                                a11 = AbstractC0635d.a(th9);
                            }
                            c0276a.o(a11);
                            return;
                        case 9:
                            InterfaceC0638g interfaceC0638g11 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            D2.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g11.k(list12, (C0639h) obj23);
                                a12 = AbstractC0635d.s(null);
                            } catch (Throwable th10) {
                                a12 = AbstractC0635d.a(th10);
                            }
                            c0276a.o(a12);
                            return;
                        case 10:
                            InterfaceC0638g interfaceC0638g12 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            D2.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a13 = AbstractC0635d.s(interfaceC0638g12.I(list14, (C0639h) obj24));
                            } catch (Throwable th11) {
                                a13 = AbstractC0635d.a(th11);
                            }
                            c0276a.o(a13);
                            return;
                        case 11:
                            InterfaceC0638g interfaceC0638g13 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            D2.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = AbstractC0635d.s(interfaceC0638g13.o(list16, (C0639h) obj25));
                            } catch (Throwable th12) {
                                a14 = AbstractC0635d.a(th12);
                            }
                            c0276a.o(a14);
                            return;
                        case 12:
                            InterfaceC0638g interfaceC0638g14 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            D2.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            D2.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            D2.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g14.q(str13, str14, (C0639h) obj28);
                                a15 = AbstractC0635d.s(null);
                            } catch (Throwable th13) {
                                a15 = AbstractC0635d.a(th13);
                            }
                            c0276a.o(a15);
                            return;
                        case 13:
                            InterfaceC0638g interfaceC0638g15 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            D2.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            D2.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            D2.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g15.M(str15, longValue, (C0639h) obj31);
                                a16 = AbstractC0635d.s(null);
                            } catch (Throwable th14) {
                                a16 = AbstractC0635d.a(th14);
                            }
                            c0276a.o(a16);
                            return;
                        default:
                            InterfaceC0638g interfaceC0638g16 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            D2.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            D2.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            D2.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g16.u(str16, doubleValue, (C0639h) obj34);
                                a17 = AbstractC0635d.s(null);
                            } catch (Throwable th15) {
                                a17 = AbstractC0635d.a(th15);
                            }
                            c0276a.o(a17);
                            return;
                    }
                }
            });
        } else {
            c0059m11.o(null);
        }
        C0059m c0059m12 = new C0059m(gVar, D2.h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", str2), a(), i3);
        if (interfaceC0638g != null) {
            c0059m12.o(new InterfaceC0278c() { // from class: m2.e
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    List a3;
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    switch (r2) {
                        case 0:
                            InterfaceC0638g interfaceC0638g2 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            D2.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            D2.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            D2.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g2.h(str3, str4, (C0639h) obj4);
                                a3 = AbstractC0635d.s(null);
                            } catch (Throwable th) {
                                a3 = AbstractC0635d.a(th);
                            }
                            c0276a.o(a3);
                            return;
                        case 1:
                            InterfaceC0638g interfaceC0638g3 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            D2.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            D2.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            D2.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g3.y(str5, list3, (C0639h) obj7);
                                a4 = AbstractC0635d.s(null);
                            } catch (Throwable th2) {
                                a4 = AbstractC0635d.a(th2);
                            }
                            c0276a.o(a4);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0638g interfaceC0638g4 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            D2.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            D2.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a5 = AbstractC0635d.s(interfaceC0638g4.O(str6, (C0639h) obj9));
                            } catch (Throwable th3) {
                                a5 = AbstractC0635d.a(th3);
                            }
                            c0276a.o(a5);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0638g interfaceC0638g5 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            D2.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            D2.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = AbstractC0635d.s(interfaceC0638g5.i(str7, (C0639h) obj11));
                            } catch (Throwable th4) {
                                a6 = AbstractC0635d.a(th4);
                            }
                            c0276a.o(a6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0638g interfaceC0638g6 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            D2.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            D2.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = AbstractC0635d.s(interfaceC0638g6.E(str8, (C0639h) obj13));
                            } catch (Throwable th5) {
                                a7 = AbstractC0635d.a(th5);
                            }
                            c0276a.o(a7);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0638g interfaceC0638g7 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            D2.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            D2.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = AbstractC0635d.s(interfaceC0638g7.t(str9, (C0639h) obj15));
                            } catch (Throwable th6) {
                                a8 = AbstractC0635d.a(th6);
                            }
                            c0276a.o(a8);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0638g interfaceC0638g8 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            D2.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            D2.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            D2.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g8.N(str10, booleanValue, (C0639h) obj18);
                                a9 = AbstractC0635d.s(null);
                            } catch (Throwable th7) {
                                a9 = AbstractC0635d.a(th7);
                            }
                            c0276a.o(a9);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0638g interfaceC0638g9 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            D2.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            D2.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a10 = AbstractC0635d.s(interfaceC0638g9.G(str11, (C0639h) obj20));
                            } catch (Throwable th8) {
                                a10 = AbstractC0635d.a(th8);
                            }
                            c0276a.o(a10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0638g interfaceC0638g10 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            D2.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            D2.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = AbstractC0635d.s(interfaceC0638g10.p(str12, (C0639h) obj22));
                            } catch (Throwable th9) {
                                a11 = AbstractC0635d.a(th9);
                            }
                            c0276a.o(a11);
                            return;
                        case 9:
                            InterfaceC0638g interfaceC0638g11 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            D2.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g11.k(list12, (C0639h) obj23);
                                a12 = AbstractC0635d.s(null);
                            } catch (Throwable th10) {
                                a12 = AbstractC0635d.a(th10);
                            }
                            c0276a.o(a12);
                            return;
                        case 10:
                            InterfaceC0638g interfaceC0638g12 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            D2.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a13 = AbstractC0635d.s(interfaceC0638g12.I(list14, (C0639h) obj24));
                            } catch (Throwable th11) {
                                a13 = AbstractC0635d.a(th11);
                            }
                            c0276a.o(a13);
                            return;
                        case 11:
                            InterfaceC0638g interfaceC0638g13 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            D2.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = AbstractC0635d.s(interfaceC0638g13.o(list16, (C0639h) obj25));
                            } catch (Throwable th12) {
                                a14 = AbstractC0635d.a(th12);
                            }
                            c0276a.o(a14);
                            return;
                        case 12:
                            InterfaceC0638g interfaceC0638g14 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            D2.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            D2.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            D2.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g14.q(str13, str14, (C0639h) obj28);
                                a15 = AbstractC0635d.s(null);
                            } catch (Throwable th13) {
                                a15 = AbstractC0635d.a(th13);
                            }
                            c0276a.o(a15);
                            return;
                        case 13:
                            InterfaceC0638g interfaceC0638g15 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            D2.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            D2.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            D2.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g15.M(str15, longValue, (C0639h) obj31);
                                a16 = AbstractC0635d.s(null);
                            } catch (Throwable th14) {
                                a16 = AbstractC0635d.a(th14);
                            }
                            c0276a.o(a16);
                            return;
                        default:
                            InterfaceC0638g interfaceC0638g16 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            D2.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            D2.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            D2.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g16.u(str16, doubleValue, (C0639h) obj34);
                                a17 = AbstractC0635d.s(null);
                            } catch (Throwable th15) {
                                a17 = AbstractC0635d.a(th15);
                            }
                            c0276a.o(a17);
                            return;
                    }
                }
            });
        } else {
            c0059m12.o(null);
        }
        C0059m c0059m13 = new C0059m(gVar, D2.h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", str2), a(), i3);
        if (interfaceC0638g != null) {
            c0059m13.o(new InterfaceC0278c() { // from class: m2.e
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    List a3;
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    switch (r2) {
                        case 0:
                            InterfaceC0638g interfaceC0638g2 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            D2.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            D2.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            D2.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g2.h(str3, str4, (C0639h) obj4);
                                a3 = AbstractC0635d.s(null);
                            } catch (Throwable th) {
                                a3 = AbstractC0635d.a(th);
                            }
                            c0276a.o(a3);
                            return;
                        case 1:
                            InterfaceC0638g interfaceC0638g3 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            D2.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            D2.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            D2.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g3.y(str5, list3, (C0639h) obj7);
                                a4 = AbstractC0635d.s(null);
                            } catch (Throwable th2) {
                                a4 = AbstractC0635d.a(th2);
                            }
                            c0276a.o(a4);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0638g interfaceC0638g4 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            D2.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            D2.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a5 = AbstractC0635d.s(interfaceC0638g4.O(str6, (C0639h) obj9));
                            } catch (Throwable th3) {
                                a5 = AbstractC0635d.a(th3);
                            }
                            c0276a.o(a5);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0638g interfaceC0638g5 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            D2.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            D2.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = AbstractC0635d.s(interfaceC0638g5.i(str7, (C0639h) obj11));
                            } catch (Throwable th4) {
                                a6 = AbstractC0635d.a(th4);
                            }
                            c0276a.o(a6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0638g interfaceC0638g6 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            D2.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            D2.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = AbstractC0635d.s(interfaceC0638g6.E(str8, (C0639h) obj13));
                            } catch (Throwable th5) {
                                a7 = AbstractC0635d.a(th5);
                            }
                            c0276a.o(a7);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0638g interfaceC0638g7 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            D2.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            D2.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = AbstractC0635d.s(interfaceC0638g7.t(str9, (C0639h) obj15));
                            } catch (Throwable th6) {
                                a8 = AbstractC0635d.a(th6);
                            }
                            c0276a.o(a8);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0638g interfaceC0638g8 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            D2.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            D2.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            D2.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g8.N(str10, booleanValue, (C0639h) obj18);
                                a9 = AbstractC0635d.s(null);
                            } catch (Throwable th7) {
                                a9 = AbstractC0635d.a(th7);
                            }
                            c0276a.o(a9);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0638g interfaceC0638g9 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            D2.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            D2.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a10 = AbstractC0635d.s(interfaceC0638g9.G(str11, (C0639h) obj20));
                            } catch (Throwable th8) {
                                a10 = AbstractC0635d.a(th8);
                            }
                            c0276a.o(a10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0638g interfaceC0638g10 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            D2.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            D2.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = AbstractC0635d.s(interfaceC0638g10.p(str12, (C0639h) obj22));
                            } catch (Throwable th9) {
                                a11 = AbstractC0635d.a(th9);
                            }
                            c0276a.o(a11);
                            return;
                        case 9:
                            InterfaceC0638g interfaceC0638g11 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            D2.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g11.k(list12, (C0639h) obj23);
                                a12 = AbstractC0635d.s(null);
                            } catch (Throwable th10) {
                                a12 = AbstractC0635d.a(th10);
                            }
                            c0276a.o(a12);
                            return;
                        case 10:
                            InterfaceC0638g interfaceC0638g12 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            D2.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a13 = AbstractC0635d.s(interfaceC0638g12.I(list14, (C0639h) obj24));
                            } catch (Throwable th11) {
                                a13 = AbstractC0635d.a(th11);
                            }
                            c0276a.o(a13);
                            return;
                        case 11:
                            InterfaceC0638g interfaceC0638g13 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            D2.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = AbstractC0635d.s(interfaceC0638g13.o(list16, (C0639h) obj25));
                            } catch (Throwable th12) {
                                a14 = AbstractC0635d.a(th12);
                            }
                            c0276a.o(a14);
                            return;
                        case 12:
                            InterfaceC0638g interfaceC0638g14 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            D2.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            D2.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            D2.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g14.q(str13, str14, (C0639h) obj28);
                                a15 = AbstractC0635d.s(null);
                            } catch (Throwable th13) {
                                a15 = AbstractC0635d.a(th13);
                            }
                            c0276a.o(a15);
                            return;
                        case 13:
                            InterfaceC0638g interfaceC0638g15 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            D2.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            D2.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            D2.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g15.M(str15, longValue, (C0639h) obj31);
                                a16 = AbstractC0635d.s(null);
                            } catch (Throwable th14) {
                                a16 = AbstractC0635d.a(th14);
                            }
                            c0276a.o(a16);
                            return;
                        default:
                            InterfaceC0638g interfaceC0638g16 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            D2.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            D2.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            D2.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g16.u(str16, doubleValue, (C0639h) obj34);
                                a17 = AbstractC0635d.s(null);
                            } catch (Throwable th15) {
                                a17 = AbstractC0635d.a(th15);
                            }
                            c0276a.o(a17);
                            return;
                    }
                }
            });
        } else {
            c0059m13.o(null);
        }
        C0059m c0059m14 = new C0059m(gVar, D2.h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", str2), a(), i3);
        if (interfaceC0638g != null) {
            c0059m14.o(new InterfaceC0278c() { // from class: m2.e
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    List a3;
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    switch (r2) {
                        case 0:
                            InterfaceC0638g interfaceC0638g2 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            D2.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            D2.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            D2.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g2.h(str3, str4, (C0639h) obj4);
                                a3 = AbstractC0635d.s(null);
                            } catch (Throwable th) {
                                a3 = AbstractC0635d.a(th);
                            }
                            c0276a.o(a3);
                            return;
                        case 1:
                            InterfaceC0638g interfaceC0638g3 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            D2.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            D2.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            D2.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g3.y(str5, list3, (C0639h) obj7);
                                a4 = AbstractC0635d.s(null);
                            } catch (Throwable th2) {
                                a4 = AbstractC0635d.a(th2);
                            }
                            c0276a.o(a4);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0638g interfaceC0638g4 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            D2.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            D2.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a5 = AbstractC0635d.s(interfaceC0638g4.O(str6, (C0639h) obj9));
                            } catch (Throwable th3) {
                                a5 = AbstractC0635d.a(th3);
                            }
                            c0276a.o(a5);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0638g interfaceC0638g5 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            D2.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            D2.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = AbstractC0635d.s(interfaceC0638g5.i(str7, (C0639h) obj11));
                            } catch (Throwable th4) {
                                a6 = AbstractC0635d.a(th4);
                            }
                            c0276a.o(a6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0638g interfaceC0638g6 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            D2.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            D2.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = AbstractC0635d.s(interfaceC0638g6.E(str8, (C0639h) obj13));
                            } catch (Throwable th5) {
                                a7 = AbstractC0635d.a(th5);
                            }
                            c0276a.o(a7);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0638g interfaceC0638g7 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            D2.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            D2.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = AbstractC0635d.s(interfaceC0638g7.t(str9, (C0639h) obj15));
                            } catch (Throwable th6) {
                                a8 = AbstractC0635d.a(th6);
                            }
                            c0276a.o(a8);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0638g interfaceC0638g8 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            D2.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            D2.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            D2.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g8.N(str10, booleanValue, (C0639h) obj18);
                                a9 = AbstractC0635d.s(null);
                            } catch (Throwable th7) {
                                a9 = AbstractC0635d.a(th7);
                            }
                            c0276a.o(a9);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0638g interfaceC0638g9 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            D2.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            D2.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a10 = AbstractC0635d.s(interfaceC0638g9.G(str11, (C0639h) obj20));
                            } catch (Throwable th8) {
                                a10 = AbstractC0635d.a(th8);
                            }
                            c0276a.o(a10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0638g interfaceC0638g10 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            D2.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            D2.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = AbstractC0635d.s(interfaceC0638g10.p(str12, (C0639h) obj22));
                            } catch (Throwable th9) {
                                a11 = AbstractC0635d.a(th9);
                            }
                            c0276a.o(a11);
                            return;
                        case 9:
                            InterfaceC0638g interfaceC0638g11 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            D2.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g11.k(list12, (C0639h) obj23);
                                a12 = AbstractC0635d.s(null);
                            } catch (Throwable th10) {
                                a12 = AbstractC0635d.a(th10);
                            }
                            c0276a.o(a12);
                            return;
                        case 10:
                            InterfaceC0638g interfaceC0638g12 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            D2.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a13 = AbstractC0635d.s(interfaceC0638g12.I(list14, (C0639h) obj24));
                            } catch (Throwable th11) {
                                a13 = AbstractC0635d.a(th11);
                            }
                            c0276a.o(a13);
                            return;
                        case 11:
                            InterfaceC0638g interfaceC0638g13 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            D2.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = AbstractC0635d.s(interfaceC0638g13.o(list16, (C0639h) obj25));
                            } catch (Throwable th12) {
                                a14 = AbstractC0635d.a(th12);
                            }
                            c0276a.o(a14);
                            return;
                        case 12:
                            InterfaceC0638g interfaceC0638g14 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            D2.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            D2.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            D2.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g14.q(str13, str14, (C0639h) obj28);
                                a15 = AbstractC0635d.s(null);
                            } catch (Throwable th13) {
                                a15 = AbstractC0635d.a(th13);
                            }
                            c0276a.o(a15);
                            return;
                        case 13:
                            InterfaceC0638g interfaceC0638g15 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            D2.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            D2.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            D2.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g15.M(str15, longValue, (C0639h) obj31);
                                a16 = AbstractC0635d.s(null);
                            } catch (Throwable th14) {
                                a16 = AbstractC0635d.a(th14);
                            }
                            c0276a.o(a16);
                            return;
                        default:
                            InterfaceC0638g interfaceC0638g16 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            D2.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            D2.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            D2.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g16.u(str16, doubleValue, (C0639h) obj34);
                                a17 = AbstractC0635d.s(null);
                            } catch (Throwable th15) {
                                a17 = AbstractC0635d.a(th15);
                            }
                            c0276a.o(a17);
                            return;
                    }
                }
            });
        } else {
            c0059m14.o(null);
        }
        C0059m c0059m15 = new C0059m(gVar, D2.h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", str2), a(), i3);
        if (interfaceC0638g != null) {
            c0059m15.o(new InterfaceC0278c() { // from class: m2.e
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    List a3;
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    switch (r2) {
                        case 0:
                            InterfaceC0638g interfaceC0638g2 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            D2.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            D2.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            D2.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g2.h(str3, str4, (C0639h) obj4);
                                a3 = AbstractC0635d.s(null);
                            } catch (Throwable th) {
                                a3 = AbstractC0635d.a(th);
                            }
                            c0276a.o(a3);
                            return;
                        case 1:
                            InterfaceC0638g interfaceC0638g3 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            D2.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            D2.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            D2.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g3.y(str5, list3, (C0639h) obj7);
                                a4 = AbstractC0635d.s(null);
                            } catch (Throwable th2) {
                                a4 = AbstractC0635d.a(th2);
                            }
                            c0276a.o(a4);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0638g interfaceC0638g4 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            D2.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            D2.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a5 = AbstractC0635d.s(interfaceC0638g4.O(str6, (C0639h) obj9));
                            } catch (Throwable th3) {
                                a5 = AbstractC0635d.a(th3);
                            }
                            c0276a.o(a5);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0638g interfaceC0638g5 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            D2.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            D2.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = AbstractC0635d.s(interfaceC0638g5.i(str7, (C0639h) obj11));
                            } catch (Throwable th4) {
                                a6 = AbstractC0635d.a(th4);
                            }
                            c0276a.o(a6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0638g interfaceC0638g6 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            D2.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            D2.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = AbstractC0635d.s(interfaceC0638g6.E(str8, (C0639h) obj13));
                            } catch (Throwable th5) {
                                a7 = AbstractC0635d.a(th5);
                            }
                            c0276a.o(a7);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0638g interfaceC0638g7 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            D2.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            D2.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = AbstractC0635d.s(interfaceC0638g7.t(str9, (C0639h) obj15));
                            } catch (Throwable th6) {
                                a8 = AbstractC0635d.a(th6);
                            }
                            c0276a.o(a8);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0638g interfaceC0638g8 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            D2.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            D2.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            D2.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g8.N(str10, booleanValue, (C0639h) obj18);
                                a9 = AbstractC0635d.s(null);
                            } catch (Throwable th7) {
                                a9 = AbstractC0635d.a(th7);
                            }
                            c0276a.o(a9);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0638g interfaceC0638g9 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            D2.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            D2.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a10 = AbstractC0635d.s(interfaceC0638g9.G(str11, (C0639h) obj20));
                            } catch (Throwable th8) {
                                a10 = AbstractC0635d.a(th8);
                            }
                            c0276a.o(a10);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0638g interfaceC0638g10 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            D2.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            D2.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = AbstractC0635d.s(interfaceC0638g10.p(str12, (C0639h) obj22));
                            } catch (Throwable th9) {
                                a11 = AbstractC0635d.a(th9);
                            }
                            c0276a.o(a11);
                            return;
                        case 9:
                            InterfaceC0638g interfaceC0638g11 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            D2.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g11.k(list12, (C0639h) obj23);
                                a12 = AbstractC0635d.s(null);
                            } catch (Throwable th10) {
                                a12 = AbstractC0635d.a(th10);
                            }
                            c0276a.o(a12);
                            return;
                        case 10:
                            InterfaceC0638g interfaceC0638g12 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            D2.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a13 = AbstractC0635d.s(interfaceC0638g12.I(list14, (C0639h) obj24));
                            } catch (Throwable th11) {
                                a13 = AbstractC0635d.a(th11);
                            }
                            c0276a.o(a13);
                            return;
                        case 11:
                            InterfaceC0638g interfaceC0638g13 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            D2.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = AbstractC0635d.s(interfaceC0638g13.o(list16, (C0639h) obj25));
                            } catch (Throwable th12) {
                                a14 = AbstractC0635d.a(th12);
                            }
                            c0276a.o(a14);
                            return;
                        case 12:
                            InterfaceC0638g interfaceC0638g14 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            D2.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            D2.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            D2.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g14.q(str13, str14, (C0639h) obj28);
                                a15 = AbstractC0635d.s(null);
                            } catch (Throwable th13) {
                                a15 = AbstractC0635d.a(th13);
                            }
                            c0276a.o(a15);
                            return;
                        case 13:
                            InterfaceC0638g interfaceC0638g15 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            D2.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            D2.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            D2.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g15.M(str15, longValue, (C0639h) obj31);
                                a16 = AbstractC0635d.s(null);
                            } catch (Throwable th14) {
                                a16 = AbstractC0635d.a(th14);
                            }
                            c0276a.o(a16);
                            return;
                        default:
                            InterfaceC0638g interfaceC0638g16 = interfaceC0638g;
                            D2.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            D2.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            D2.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            D2.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0638g16.u(str16, doubleValue, (C0639h) obj34);
                                a17 = AbstractC0635d.s(null);
                            } catch (Throwable th15) {
                                a17 = AbstractC0635d.a(th15);
                            }
                            c0276a.o(a17);
                            return;
                    }
                }
            });
        } else {
            c0059m15.o(null);
        }
    }
}
