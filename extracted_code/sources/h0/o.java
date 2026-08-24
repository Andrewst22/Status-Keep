package h0;

import R.C0106i;
import R.C0113p;
import R.G;
import U.AbstractC0123a;
import Y.C0137h;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final String f5853a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5854b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5855c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f5856d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5857e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5858f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5859g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5860h;

    public o(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z3, boolean z4, boolean z5) {
        str.getClass();
        this.f5853a = str;
        this.f5854b = str2;
        this.f5855c = str3;
        this.f5856d = codecCapabilities;
        this.f5859g = z3;
        this.f5857e = z4;
        this.f5858f = z5;
        this.f5860h = G.k(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i3, int i4, double d3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(U.A.g(i3, widthAlignment) * widthAlignment, U.A.g(i4, heightAlignment) * heightAlignment);
        int i5 = point.x;
        int i6 = point.y;
        if (d3 != -1.0d && d3 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i5, i6, Math.floor(d3));
        }
        return videoCapabilities.isSizeSupported(i5, i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        if ("Nexus 10".equals(r1) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r8) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static h0.o h(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            h0.o r13 = new h0.o
            r14 = 0
            r0 = 1
            if (r11 == 0) goto L39
            java.lang.String r1 = "adaptive-playback"
            boolean r1 = r11.isFeatureSupported(r1)
            if (r1 == 0) goto L39
            int r1 = U.A.f2405a
            r2 = 22
            if (r1 > r2) goto L37
            java.lang.String r1 = U.A.f2408d
            java.lang.String r2 = "ODROID-XU3"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L26
            java.lang.String r2 = "Nexus 10"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L37
        L26:
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L39
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L37
            goto L39
        L37:
            r6 = 1
            goto L3a
        L39:
            r6 = 0
        L3a:
            r1 = 21
            if (r11 == 0) goto L48
            int r2 = U.A.f2405a
            if (r2 < r1) goto L48
            java.lang.String r2 = "tunneled-playback"
            boolean r2 = r11.isFeatureSupported(r2)
        L48:
            if (r15 != 0) goto L5b
            if (r11 == 0) goto L59
            int r15 = U.A.f2405a
            if (r15 < r1) goto L59
            java.lang.String r15 = "secure-playback"
            boolean r15 = r11.isFeatureSupported(r15)
            if (r15 == 0) goto L59
            goto L5b
        L59:
            r7 = 0
            goto L5c
        L5b:
            r7 = 1
        L5c:
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.o.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):h0.o");
    }

    public final C0137h b(C0113p c0113p, C0113p c0113p2) {
        int i3;
        int i4;
        if (!U.A.a(c0113p.f1974m, c0113p2.f1974m)) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        if (this.f5860h) {
            if (c0113p.f1983v != c0113p2.f1983v) {
                i3 |= 1024;
            }
            if (!this.f5857e && (c0113p.f1980s != c0113p2.f1980s || c0113p.f1981t != c0113p2.f1981t)) {
                i3 |= 512;
            }
            C0106i c0106i = c0113p.f1986z;
            boolean e2 = C0106i.e(c0106i);
            C0106i c0106i2 = c0113p2.f1986z;
            if ((!e2 || !C0106i.e(c0106i2)) && !U.A.a(c0106i, c0106i2)) {
                i3 |= 2048;
            }
            if (U.A.f2408d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f5853a) && !c0113p.c(c0113p2)) {
                i3 |= 2;
            }
            if (i3 == 0) {
                if (c0113p.c(c0113p2)) {
                    i4 = 3;
                } else {
                    i4 = 2;
                }
                return new C0137h(this.f5853a, c0113p, c0113p2, i4, 0);
            }
        } else {
            if (c0113p.f1951A != c0113p2.f1951A) {
                i3 |= 4096;
            }
            if (c0113p.f1952B != c0113p2.f1952B) {
                i3 |= 8192;
            }
            if (c0113p.f1953C != c0113p2.f1953C) {
                i3 |= 16384;
            }
            String str = this.f5854b;
            if (i3 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair d3 = D.d(c0113p);
                Pair d4 = D.d(c0113p2);
                if (d3 != null && d4 != null) {
                    int intValue = ((Integer) d3.first).intValue();
                    int intValue2 = ((Integer) d4.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C0137h(this.f5853a, c0113p, c0113p2, 3, 0);
                    }
                }
            }
            if (!c0113p.c(c0113p2)) {
                i3 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i3 |= 2;
            }
            if (i3 == 0) {
                return new C0137h(this.f5853a, c0113p, c0113p2, 1, 0);
            }
        }
        return new C0137h(this.f5853a, c0113p, c0113p2, 0, i3);
    }

    public final boolean c(C0113p c0113p, boolean z3) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i3;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair d3 = D.d(c0113p);
        if (d3 == null) {
            return true;
        }
        int intValue = ((Integer) d3.first).intValue();
        int intValue2 = ((Integer) d3.second).intValue();
        boolean equals = "video/dolby-vision".equals(c0113p.f1974m);
        int i4 = 8;
        String str = this.f5854b;
        if (equals) {
            if ("video/avc".equals(str)) {
                intValue2 = 0;
                intValue = 8;
            } else if ("video/hevc".equals(str)) {
                intValue2 = 0;
                intValue = 2;
            }
        }
        if (!this.f5860h && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5856d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (U.A.f2405a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
            if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                i3 = videoCapabilities.getBitrateRange().getUpper().intValue();
            } else {
                i3 = 0;
            }
            if (i3 >= 180000000) {
                i4 = 1024;
            } else if (i3 >= 120000000) {
                i4 = 512;
            } else if (i3 >= 60000000) {
                i4 = 256;
            } else if (i3 >= 30000000) {
                i4 = 128;
            } else if (i3 >= 18000000) {
                i4 = 64;
            } else if (i3 >= 12000000) {
                i4 = 32;
            } else if (i3 >= 7200000) {
                i4 = 16;
            } else if (i3 < 3600000) {
                if (i3 >= 1800000) {
                    i4 = 4;
                } else if (i3 >= 800000) {
                    i4 = 2;
                } else {
                    i4 = 1;
                }
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i4;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z3)) {
                if ("video/hevc".equals(str) && 2 == intValue) {
                    String str2 = U.A.f2406b;
                    if (!"sailfish".equals(str2) && !"marlin".equals(str2)) {
                    }
                }
                return true;
            }
        }
        g("codec.profileLevel, " + c0113p.f1971j + ", " + this.f5855c);
        return false;
    }

    public final boolean d(C0113p c0113p) {
        boolean z3;
        int i3;
        int i4;
        String str = c0113p.f1974m;
        String str2 = this.f5854b;
        boolean z4 = true;
        if (!str2.equals(str) && !str2.equals(D.b(c0113p))) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3 || !c(c0113p, true)) {
            return false;
        }
        if (this.f5860h) {
            int i5 = c0113p.f1980s;
            if (i5 > 0 && (i4 = c0113p.f1981t) > 0) {
                if (U.A.f2405a >= 21) {
                    return f(i5, i4, c0113p.f1982u);
                }
                if (i5 * i4 > D.j()) {
                    z4 = false;
                }
                if (!z4) {
                    g("legacyFrameSize, " + i5 + "x" + i4);
                }
            }
            return z4;
        }
        int i6 = U.A.f2405a;
        if (i6 < 21) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5856d;
        int i7 = c0113p.f1952B;
        if (i7 != -1) {
            if (codecCapabilities == null) {
                g("sampleRate.caps");
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    g("sampleRate.aCaps");
                } else if (!audioCapabilities.isSampleRateSupported(i7)) {
                    g("sampleRate.support, " + i7);
                }
            }
            return false;
        }
        int i8 = c0113p.f1951A;
        if (i8 == -1) {
            return true;
        }
        if (codecCapabilities == null) {
            g("channelCount.caps");
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                g("channelCount.aCaps");
            } else {
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((i6 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i3 = 6;
                    } else if ("audio/eac3".equals(str2)) {
                        i3 = 16;
                    } else {
                        i3 = 30;
                    }
                    AbstractC0123a.A("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f5853a + ", [" + maxInputChannelCount + " to " + i3 + "]");
                    maxInputChannelCount = i3;
                }
                if (maxInputChannelCount >= i8) {
                    return true;
                }
                g("channelCount.support, " + i8);
            }
        }
        return false;
    }

    public final boolean e(C0113p c0113p) {
        if (this.f5860h) {
            return this.f5857e;
        }
        Pair d3 = D.d(c0113p);
        if (d3 != null && ((Integer) d3.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean f(int i3, int i4, double d3) {
        int i5;
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5856d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        int i6 = U.A.f2405a;
        if (i6 >= 29) {
            if (i6 >= 29 && ((bool = android.support.v4.media.session.a.f3902a) == null || !bool.booleanValue())) {
                i5 = p.a(videoCapabilities, i3, i4, d3);
            } else {
                i5 = 0;
            }
            if (i5 == 2) {
                return true;
            }
            if (i5 == 1) {
                g("sizeAndRate.cover, " + i3 + "x" + i4 + "@" + d3);
                return false;
            }
        }
        if (!a(videoCapabilities, i3, i4, d3)) {
            if (i3 < i4) {
                String str = this.f5853a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(U.A.f2406b)) && a(videoCapabilities, i4, i3, d3)) {
                    AbstractC0123a.m("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i3 + "x" + i4 + "@" + d3) + "] [" + str + ", " + this.f5854b + "] [" + U.A.f2409e + "]");
                }
            }
            g("sizeAndRate.support, " + i3 + "x" + i4 + "@" + d3);
            return false;
        }
        return true;
    }

    public final void g(String str) {
        AbstractC0123a.m("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f5853a + ", " + this.f5854b + "] [" + U.A.f2409e + "]");
    }

    public final String toString() {
        return this.f5853a;
    }
}
