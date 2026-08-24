package Z;

import R.C0113p;
import R.C0119w;
import R.I;
import R.Q;
import R.S;
import R.T;
import U.A;
import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import o0.C0701z;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: A  reason: collision with root package name */
    public boolean f3501A;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3502a;

    /* renamed from: b  reason: collision with root package name */
    public final h f3503b;

    /* renamed from: c  reason: collision with root package name */
    public final PlaybackSession f3504c;

    /* renamed from: i  reason: collision with root package name */
    public String f3510i;

    /* renamed from: j  reason: collision with root package name */
    public PlaybackMetrics.Builder f3511j;

    /* renamed from: k  reason: collision with root package name */
    public int f3512k;

    /* renamed from: n  reason: collision with root package name */
    public I f3515n;

    /* renamed from: o  reason: collision with root package name */
    public B0.b f3516o;

    /* renamed from: p  reason: collision with root package name */
    public B0.b f3517p;

    /* renamed from: q  reason: collision with root package name */
    public B0.b f3518q;

    /* renamed from: r  reason: collision with root package name */
    public C0113p f3519r;

    /* renamed from: s  reason: collision with root package name */
    public C0113p f3520s;

    /* renamed from: t  reason: collision with root package name */
    public C0113p f3521t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3522u;

    /* renamed from: v  reason: collision with root package name */
    public int f3523v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3524w;
    public int x;

    /* renamed from: y  reason: collision with root package name */
    public int f3525y;

    /* renamed from: z  reason: collision with root package name */
    public int f3526z;

    /* renamed from: e  reason: collision with root package name */
    public final S f3506e = new S();

    /* renamed from: f  reason: collision with root package name */
    public final Q f3507f = new Q();

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f3509h = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f3508g = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final long f3505d = SystemClock.elapsedRealtime();

    /* renamed from: l  reason: collision with root package name */
    public int f3513l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f3514m = 0;

    public k(Context context, PlaybackSession playbackSession) {
        this.f3502a = context.getApplicationContext();
        this.f3504c = playbackSession;
        h hVar = new h();
        this.f3503b = hVar;
        hVar.f3497d = this;
    }

    public final boolean a(B0.b bVar) {
        String str;
        if (bVar != null) {
            String str2 = (String) bVar.f29p;
            h hVar = this.f3503b;
            synchronized (hVar) {
                str = hVar.f3499f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        long longValue;
        long longValue2;
        int i3;
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f3511j;
        if (builder != null && this.f3501A) {
            builder.setAudioUnderrunCount(this.f3526z);
            this.f3511j.setVideoFramesDropped(this.x);
            this.f3511j.setVideoFramesPlayed(this.f3525y);
            Long l3 = (Long) this.f3508g.get(this.f3510i);
            PlaybackMetrics.Builder builder2 = this.f3511j;
            if (l3 == null) {
                longValue = 0;
            } else {
                longValue = l3.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l4 = (Long) this.f3509h.get(this.f3510i);
            PlaybackMetrics.Builder builder3 = this.f3511j;
            if (l4 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l4.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.f3511j;
            if (l4 != null && l4.longValue() > 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            builder4.setStreamSource(i3);
            PlaybackSession playbackSession = this.f3504c;
            build = this.f3511j.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.f3511j = null;
        this.f3510i = null;
        this.f3526z = 0;
        this.x = 0;
        this.f3525y = 0;
        this.f3519r = null;
        this.f3520s = null;
        this.f3521t = null;
        this.f3501A = false;
    }

    public final void c(T t3, C0701z c0701z) {
        int b3;
        PlaybackMetrics.Builder builder = this.f3511j;
        if (c0701z == null || (b3 = t3.b(c0701z.f8653a)) == -1) {
            return;
        }
        Q q3 = this.f3507f;
        int i3 = 0;
        t3.f(b3, q3, false);
        int i4 = q3.f1797c;
        S s3 = this.f3506e;
        t3.n(i4, s3);
        C0119w c0119w = s3.f1806c.f2008b;
        int i5 = 2;
        if (c0119w != null) {
            int G3 = A.G(c0119w.f2001a, c0119w.f2002b);
            if (G3 != 0) {
                if (G3 != 1) {
                    if (G3 != 2) {
                        i3 = 1;
                    } else {
                        i3 = 4;
                    }
                } else {
                    i3 = 5;
                }
            } else {
                i3 = 3;
            }
        }
        builder.setStreamType(i3);
        if (s3.f1816m != -9223372036854775807L && !s3.f1814k && !s3.f1812i && !s3.a()) {
            builder.setMediaDurationMillis(A.Z(s3.f1816m));
        }
        if (!s3.a()) {
            i5 = 1;
        }
        builder.setPlaybackType(i5);
        this.f3501A = true;
    }

    public final void d(a aVar, String str) {
        C0701z c0701z = aVar.f3457d;
        if ((c0701z == null || !c0701z.b()) && str.equals(this.f3510i)) {
            b();
        }
        this.f3508g.remove(str);
        this.f3509h.remove(str);
    }

    public final void e(int i3, long j3, C0113p c0113p, int i4) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i5;
        String str;
        timeSinceCreatedMillis = i.l(i3).setTimeSinceCreatedMillis(j3 - this.f3505d);
        if (c0113p != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i4 != 1) {
                i5 = 3;
                if (i4 != 2) {
                    if (i4 != 3) {
                        i5 = 1;
                    } else {
                        i5 = 4;
                    }
                }
            } else {
                i5 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i5);
            String str2 = c0113p.f1973l;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = c0113p.f1974m;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = c0113p.f1971j;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i6 = c0113p.f1970i;
            if (i6 != -1) {
                timeSinceCreatedMillis.setBitrate(i6);
            }
            int i7 = c0113p.f1980s;
            if (i7 != -1) {
                timeSinceCreatedMillis.setWidth(i7);
            }
            int i8 = c0113p.f1981t;
            if (i8 != -1) {
                timeSinceCreatedMillis.setHeight(i8);
            }
            int i9 = c0113p.f1951A;
            if (i9 != -1) {
                timeSinceCreatedMillis.setChannelCount(i9);
            }
            int i10 = c0113p.f1952B;
            if (i10 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i10);
            }
            String str5 = c0113p.f1965d;
            if (str5 != null) {
                int i11 = A.f2405a;
                String[] split = str5.split("-", -1);
                String str6 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str6, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f3 = c0113p.f1982u;
            if (f3 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f3);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f3501A = true;
        PlaybackSession playbackSession = this.f3504c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }
}
