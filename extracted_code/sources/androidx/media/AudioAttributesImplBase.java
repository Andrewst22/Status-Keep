package androidx.media;

import D2.h;
import N.k;
import java.util.Arrays;
/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public int f4375a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f4376b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f4377c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f4378d = -1;

    public final boolean equals(Object obj) {
        int i3;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f4376b == audioAttributesImplBase.f4376b) {
            int i4 = this.f4377c;
            int i5 = audioAttributesImplBase.f4377c;
            int i6 = audioAttributesImplBase.f4378d;
            if (i6 != -1) {
                i3 = i6;
            } else {
                int i7 = audioAttributesImplBase.f4375a;
                int i8 = AudioAttributesCompat.f4371b;
                if ((i5 & 1) == 1) {
                    i3 = 7;
                } else if ((i5 & 4) == 4) {
                    i3 = 6;
                } else {
                    switch (i7) {
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            i3 = 0;
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            i3 = 8;
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            i3 = 4;
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                        case 9:
                        case 10:
                            i3 = 5;
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            i3 = 2;
                            break;
                        case 11:
                            i3 = 10;
                            break;
                        case 12:
                        default:
                            i3 = 3;
                            break;
                        case 13:
                            i3 = 1;
                            break;
                    }
                }
            }
            if (i3 == 6) {
                i5 |= 4;
            } else if (i3 == 7) {
                i5 |= 1;
            }
            if (i4 == (i5 & 273) && this.f4375a == audioAttributesImplBase.f4375a && this.f4378d == i6) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4376b), Integer.valueOf(this.f4377c), Integer.valueOf(this.f4375a), Integer.valueOf(this.f4378d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f4378d != -1) {
            sb.append(" stream=");
            sb.append(this.f4378d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i3 = this.f4375a;
        int i4 = AudioAttributesCompat.f4371b;
        switch (i3) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                str = "USAGE_ALARM";
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                str = "USAGE_NOTIFICATION";
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case k.BYTES_FIELD_NUMBER /* 8 */:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = h.k("unknown usage ", i3);
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f4376b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f4377c).toUpperCase());
        return sb.toString();
    }
}
