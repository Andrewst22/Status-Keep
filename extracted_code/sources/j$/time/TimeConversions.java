package j$.time;
/* loaded from: classes2.dex */
public class TimeConversions {
    public static java.time.Duration convert(Duration duration) {
        if (duration == null) {
            return null;
        }
        return java.time.Duration.ofSeconds(duration.r(), duration.q());
    }

    public static Duration convert(java.time.Duration duration) {
        if (duration == null) {
            return null;
        }
        return Duration.z(duration.getSeconds(), duration.getNano());
    }
}
