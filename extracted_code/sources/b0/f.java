package b0;

import R.H;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s0.p;
/* loaded from: classes.dex */
public final class f implements p {

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f4555m = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // s0.p
    public final Object k(Uri uri, W.j jVar) {
        long j3;
        long parseLong;
        String readLine = new BufferedReader(new InputStreamReader(jVar, C1.d.f153c)).readLine();
        try {
            Matcher matcher = f4555m.matcher(readLine);
            if (matcher.matches()) {
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    if ("+".equals(matcher.group(4))) {
                        j3 = 1;
                    } else {
                        j3 = -1;
                    }
                    long parseLong2 = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    if (TextUtils.isEmpty(group2)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(group2);
                    }
                    time -= (((parseLong2 * 60) + parseLong) * 60000) * j3;
                }
                return Long.valueOf(time);
            }
            throw H.b("Couldn't parse timestamp: " + readLine, null);
        } catch (ParseException e2) {
            throw H.b(null, e2);
        }
    }
}
