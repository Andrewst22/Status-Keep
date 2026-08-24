package f2;

import K.C0059m;
import android.os.Build;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5616a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5617b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5618c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5619d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5620e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5621f;

    /* renamed from: g  reason: collision with root package name */
    public final o f5622g;

    /* renamed from: h  reason: collision with root package name */
    public final Integer f5623h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5624i;

    /* renamed from: j  reason: collision with root package name */
    public final C0059m f5625j;

    /* renamed from: k  reason: collision with root package name */
    public final String[] f5626k;

    /* renamed from: l  reason: collision with root package name */
    public final n[] f5627l;

    public n(boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i3, o oVar, Integer num, String str, C0059m c0059m, String[] strArr, n[] nVarArr) {
        this.f5616a = z3;
        this.f5617b = z4;
        this.f5618c = z5;
        this.f5619d = z6;
        this.f5620e = z7;
        this.f5621f = i3;
        this.f5622g = oVar;
        this.f5623h = num;
        this.f5624i = str;
        this.f5625j = c0059m;
        this.f5626k = strArr;
        this.f5627l = nVarArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static n a(JSONObject jSONObject) {
        int i3;
        n[] nVarArr;
        char c3;
        Integer num;
        int i4;
        JSONArray jSONArray;
        String str;
        o oVar;
        String str2;
        String string;
        String str3;
        o oVar2;
        C0059m c0059m;
        String str4;
        String str5 = "creditCardExpirationMonth";
        String str6 = null;
        String string2 = jSONObject.getString("inputAction");
        if (string2 != null) {
            if (!jSONObject.isNull("fields")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("fields");
                int length = jSONArray2.length();
                n[] nVarArr2 = new n[length];
                for (int i5 = 0; i5 < length; i5++) {
                    nVarArr2[i5] = a(jSONArray2.getJSONObject(i5));
                }
                i3 = 1;
                nVarArr = nVarArr2;
            } else {
                i3 = 1;
                nVarArr = null;
            }
            int valueOf = Integer.valueOf(i3);
            switch (string2.hashCode()) {
                case -737377923:
                    if (string2.equals("TextInputAction.done")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -737089298:
                    if (string2.equals("TextInputAction.next")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -737080013:
                    if (string2.equals("TextInputAction.none")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -736940669:
                    if (string2.equals("TextInputAction.send")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 469250275:
                    if (string2.equals("TextInputAction.search")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1241689507:
                    if (string2.equals("TextInputAction.go")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1539450297:
                    if (string2.equals("TextInputAction.newline")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2110497650:
                    if (string2.equals("TextInputAction.previous")) {
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
                    num = 6;
                    break;
                case 1:
                    valueOf = 5;
                    num = valueOf;
                    break;
                case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    num = valueOf;
                    break;
                case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                    i4 = 4;
                    num = i4;
                    break;
                case N.k.LONG_FIELD_NUMBER /* 4 */:
                    i4 = 3;
                    num = i4;
                    break;
                case N.k.STRING_FIELD_NUMBER /* 5 */:
                    i4 = 2;
                    num = i4;
                    break;
                case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    valueOf = 7;
                    num = valueOf;
                    break;
                default:
                    num = 0;
                    break;
            }
            ArrayList arrayList = new ArrayList();
            if (jSONObject.isNull("contentCommitMimeTypes")) {
                jSONArray = null;
            } else {
                jSONArray = jSONObject.getJSONArray("contentCommitMimeTypes");
            }
            if (jSONArray != null) {
                for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                    arrayList.add(jSONArray.optString(i6));
                }
            }
            boolean optBoolean = jSONObject.optBoolean("obscureText");
            boolean optBoolean2 = jSONObject.optBoolean("autocorrect", true);
            boolean optBoolean3 = jSONObject.optBoolean("enableSuggestions");
            boolean optBoolean4 = jSONObject.optBoolean("enableIMEPersonalizedLearning");
            boolean optBoolean5 = jSONObject.optBoolean("enableDeltaModel");
            String string3 = jSONObject.getString("textCapitalization");
            int[] c4 = N.j.c(4);
            int length2 = c4.length;
            int i7 = 0;
            while (i7 < length2) {
                int i8 = length2;
                int i9 = c4[i7];
                int[] iArr = c4;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 == 4) {
                                str = "TextCapitalization.none";
                            } else {
                                throw null;
                            }
                        } else {
                            str = "TextCapitalization.sentences";
                        }
                    } else {
                        str = "TextCapitalization.words";
                    }
                } else {
                    str = "TextCapitalization.characters";
                }
                if (str.equals(string3)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("inputType");
                    String string4 = jSONObject2.getString("name");
                    int[] c5 = N.j.c(13);
                    ArrayList arrayList2 = arrayList;
                    int length3 = c5.length;
                    String str7 = str5;
                    int i10 = 0;
                    while (i10 < length3) {
                        int i11 = length3;
                        int i12 = c5[i10];
                        switch (i12) {
                            case 1:
                                str2 = "TextInputType.text";
                                break;
                            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                                str2 = "TextInputType.datetime";
                                break;
                            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                                str2 = "TextInputType.name";
                                break;
                            case N.k.LONG_FIELD_NUMBER /* 4 */:
                                str2 = "TextInputType.address";
                                break;
                            case N.k.STRING_FIELD_NUMBER /* 5 */:
                                str2 = "TextInputType.number";
                                break;
                            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                str2 = "TextInputType.phone";
                                break;
                            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                str2 = "TextInputType.multiline";
                                break;
                            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                                str2 = "TextInputType.emailAddress";
                                break;
                            case 9:
                                str2 = "TextInputType.url";
                                break;
                            case 10:
                                str2 = "TextInputType.visiblePassword";
                                break;
                            case 11:
                                str2 = "TextInputType.none";
                                break;
                            case 12:
                                str2 = "TextInputType.webSearch";
                                break;
                            case 13:
                                str2 = "TextInputType.twitter";
                                break;
                            default:
                                throw null;
                        }
                        int[] iArr2 = c5;
                        if (str2.equals(string4)) {
                            oVar = new o(i12, jSONObject2.optBoolean("signed", false), jSONObject2.optBoolean("decimal", false));
                            if (jSONObject.isNull("actionLabel")) {
                                string = null;
                            } else {
                                string = jSONObject.getString("actionLabel");
                            }
                            if (jSONObject.isNull("autofill")) {
                                str3 = string;
                                oVar2 = oVar;
                                c0059m = null;
                            } else {
                                JSONObject jSONObject3 = jSONObject.getJSONObject("autofill");
                                String string5 = jSONObject3.getString("uniqueIdentifier");
                                JSONArray jSONArray3 = jSONObject3.getJSONArray("hints");
                                if (!jSONObject3.isNull("hintText")) {
                                    str6 = jSONObject3.getString("hintText");
                                }
                                String str8 = str6;
                                JSONObject jSONObject4 = jSONObject3.getJSONObject("editingValue");
                                String[] strArr = new String[jSONArray3.length()];
                                str3 = string;
                                oVar2 = oVar;
                                int i13 = 0;
                                while (i13 < jSONArray3.length()) {
                                    String string6 = jSONArray3.getString(i13);
                                    JSONArray jSONArray4 = jSONArray3;
                                    String str9 = string5;
                                    char c6 = 26;
                                    if (Build.VERSION.SDK_INT < 26) {
                                        str4 = str7;
                                    } else {
                                        string6.getClass();
                                        switch (string6.hashCode()) {
                                            case -2058889126:
                                                str4 = str7;
                                                if (string6.equals("birthdayYear")) {
                                                    c6 = 0;
                                                    break;
                                                }
                                                c6 = 65535;
                                                break;
                                            case -1917283616:
                                                str4 = str7;
                                                if (string6.equals("oneTimeCode")) {
                                                    c6 = 1;
                                                    break;
                                                }
                                                c6 = 65535;
                                                break;
                                            case -1844815832:
                                                str4 = str7;
                                                if (string6.equals(str4)) {
                                                    c6 = 2;
                                                    break;
                                                }
                                                c6 = 65535;
                                                break;
                                            case -1825589953:
                                                if (string6.equals("telephoneNumberNational")) {
                                                    str4 = str7;
                                                    c6 = 3;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case -1821235109:
                                                if (string6.equals("newPassword")) {
                                                    str4 = str7;
                                                    c6 = 4;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case -1757573738:
                                                if (string6.equals("creditCardSecurityCode")) {
                                                    str4 = str7;
                                                    c6 = 5;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case -1682373820:
                                                if (string6.equals("creditCardExpirationDay")) {
                                                    str4 = str7;
                                                    c6 = 6;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case -1658955742:
                                                if (string6.equals("fullStreetAddress")) {
                                                    str4 = str7;
                                                    c6 = 7;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case -1567118045:
                                                if (string6.equals("telephoneNumberDevice")) {
                                                    str4 = str7;
                                                    c6 = '\b';
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case -1476752575:
                                                if (string6.equals("countryName")) {
                                                    str4 = str7;
                                                    c6 = '\t';
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case -1413737489:
                                                if (string6.equals("middleInitial")) {
                                                    str4 = str7;
                                                    c6 = '\n';
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case -1377792129:
                                                if (string6.equals("addressCity")) {
                                                    str4 = str7;
                                                    c6 = 11;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case -1249512767:
                                                if (string6.equals("gender")) {
                                                    str4 = str7;
                                                    c6 = '\f';
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case -1186060294:
                                                if (string6.equals("postalAddressExtendedPostalCode")) {
                                                    str4 = str7;
                                                    c6 = '\r';
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case -1151034798:
                                                if (string6.equals("creditCardNumber")) {
                                                    str4 = str7;
                                                    c6 = 14;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case -835992323:
                                                if (string6.equals("namePrefix")) {
                                                    str4 = str7;
                                                    c6 = 15;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case -818219584:
                                                if (string6.equals("middleName")) {
                                                    str4 = str7;
                                                    c6 = 16;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case -747304516:
                                                if (string6.equals("nameSuffix")) {
                                                    str4 = str7;
                                                    c6 = 17;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case -613980922:
                                                if (string6.equals("creditCardExpirationDate")) {
                                                    str4 = str7;
                                                    c6 = 18;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case -613352043:
                                                if (string6.equals("creditCardExpirationYear")) {
                                                    str4 = str7;
                                                    c6 = 19;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case -549230602:
                                                if (string6.equals("telephoneNumberCountryCode")) {
                                                    str4 = str7;
                                                    c6 = 20;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case -265713450:
                                                if (string6.equals("username")) {
                                                    str4 = str7;
                                                    c6 = 21;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case 3373707:
                                                if (string6.equals("name")) {
                                                    str4 = str7;
                                                    c6 = 22;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case 96619420:
                                                if (string6.equals("email")) {
                                                    str4 = str7;
                                                    c6 = 23;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case 253202685:
                                                if (string6.equals("addressState")) {
                                                    str4 = str7;
                                                    c6 = 24;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case 588174851:
                                                if (string6.equals("birthdayMonth")) {
                                                    str4 = str7;
                                                    c6 = 25;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case 798554127:
                                                if (string6.equals("familyName")) {
                                                    str4 = str7;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case 892233837:
                                                if (string6.equals("telephoneNumber")) {
                                                    str4 = str7;
                                                    c6 = 27;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case 991032982:
                                                if (string6.equals("newUsername")) {
                                                    str4 = str7;
                                                    c6 = 28;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case 1069376125:
                                                if (string6.equals("birthday")) {
                                                    str4 = str7;
                                                    c6 = 29;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case 1216985755:
                                                if (string6.equals("password")) {
                                                    str4 = str7;
                                                    c6 = 30;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case 1469046696:
                                                if (string6.equals("givenName")) {
                                                    str4 = str7;
                                                    c6 = 31;
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case 1662667945:
                                                if (string6.equals("postalAddress")) {
                                                    str4 = str7;
                                                    c6 = ' ';
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case 1921869058:
                                                if (string6.equals("postalAddressExtended")) {
                                                    str4 = str7;
                                                    c6 = '!';
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case 2011152728:
                                                if (string6.equals("postalCode")) {
                                                    str4 = str7;
                                                    c6 = '\"';
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            case 2011773919:
                                                if (string6.equals("birthdayDay")) {
                                                    str4 = str7;
                                                    c6 = '#';
                                                    break;
                                                }
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                            default:
                                                str4 = str7;
                                                c6 = 65535;
                                                break;
                                        }
                                        switch (c6) {
                                            case 0:
                                                string6 = "birthDateYear";
                                                continue;
                                            case 1:
                                                string6 = "smsOTPCode";
                                                continue;
                                            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                                                string6 = str4;
                                                continue;
                                            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                                                string6 = "phoneNational";
                                                continue;
                                            case N.k.LONG_FIELD_NUMBER /* 4 */:
                                                string6 = "newPassword";
                                                continue;
                                            case N.k.STRING_FIELD_NUMBER /* 5 */:
                                                string6 = "creditCardSecurityCode";
                                                continue;
                                            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                                string6 = "creditCardExpirationDay";
                                                continue;
                                            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                                string6 = "streetAddress";
                                                continue;
                                            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                                                string6 = "phoneNumberDevice";
                                                continue;
                                            case '\t':
                                                string6 = "addressCountry";
                                                continue;
                                            case '\n':
                                                string6 = "personMiddleInitial";
                                                continue;
                                            case 11:
                                                string6 = "addressLocality";
                                                continue;
                                            case '\f':
                                                string6 = "gender";
                                                continue;
                                            case '\r':
                                                string6 = "extendedPostalCode";
                                                continue;
                                            case 14:
                                                string6 = "creditCardNumber";
                                                continue;
                                            case 15:
                                                string6 = "personNamePrefix";
                                                continue;
                                            case 16:
                                                string6 = "personMiddleName";
                                                continue;
                                            case 17:
                                                string6 = "personNameSuffix";
                                                continue;
                                            case 18:
                                                string6 = "creditCardExpirationDate";
                                                continue;
                                            case 19:
                                                string6 = "creditCardExpirationYear";
                                                continue;
                                            case 20:
                                                string6 = "phoneCountryCode";
                                                continue;
                                            case 21:
                                                string6 = "username";
                                                continue;
                                            case 22:
                                                string6 = "personName";
                                                continue;
                                            case 23:
                                                string6 = "emailAddress";
                                                continue;
                                            case 24:
                                                string6 = "addressRegion";
                                                continue;
                                            case 25:
                                                string6 = "birthDateMonth";
                                                continue;
                                            case 26:
                                                string6 = "personFamilyName";
                                                continue;
                                            case 27:
                                                string6 = "phoneNumber";
                                                continue;
                                            case 28:
                                                string6 = "newUsername";
                                                continue;
                                            case 29:
                                                string6 = "birthDateFull";
                                                continue;
                                            case 30:
                                                string6 = "password";
                                                continue;
                                            case 31:
                                                string6 = "personGivenName";
                                                continue;
                                            case ' ':
                                                string6 = "postalAddress";
                                                continue;
                                            case '!':
                                                string6 = "extendedAddress";
                                                continue;
                                            case '\"':
                                                string6 = "postalCode";
                                                continue;
                                            case '#':
                                                string6 = "birthDateDay";
                                                continue;
                                        }
                                    }
                                    strArr[i13] = string6;
                                    i13++;
                                    str7 = str4;
                                    string5 = str9;
                                    jSONArray3 = jSONArray4;
                                }
                                c0059m = new C0059m(string5, strArr, str8, p.a(jSONObject4));
                            }
                            return new n(optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, i9, oVar2, num, str3, c0059m, (String[]) arrayList2.toArray(new String[arrayList2.size()]), nVarArr);
                        }
                        i10++;
                        jSONObject2 = jSONObject2;
                        length3 = i11;
                        c5 = iArr2;
                        oVar = oVar;
                    }
                    throw new NoSuchFieldException(D2.h.l("No such TextInputType: ", string4));
                }
                i7++;
                length2 = i8;
                c4 = iArr;
                string3 = string3;
                str5 = str5;
                arrayList = arrayList;
            }
            throw new NoSuchFieldException(D2.h.l("No such TextCapitalization: ", string3));
        }
        throw new JSONException("Configuration JSON missing 'inputAction' property.");
    }
}
