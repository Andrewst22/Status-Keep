package P;

import a.AbstractC0155a;
import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import j$.util.DesugarTimeZone;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: A  reason: collision with root package name */
    public static final byte[] f1384A;

    /* renamed from: B  reason: collision with root package name */
    public static final String[] f1385B;

    /* renamed from: C  reason: collision with root package name */
    public static final int[] f1386C;

    /* renamed from: D  reason: collision with root package name */
    public static final byte[] f1387D;

    /* renamed from: E  reason: collision with root package name */
    public static final d f1388E;

    /* renamed from: F  reason: collision with root package name */
    public static final d[][] f1389F;

    /* renamed from: G  reason: collision with root package name */
    public static final d[] f1390G;

    /* renamed from: H  reason: collision with root package name */
    public static final HashMap[] f1391H;

    /* renamed from: I  reason: collision with root package name */
    public static final HashMap[] f1392I;

    /* renamed from: J  reason: collision with root package name */
    public static final HashSet f1393J;

    /* renamed from: K  reason: collision with root package name */
    public static final HashMap f1394K;
    public static final Charset L;

    /* renamed from: M  reason: collision with root package name */
    public static final byte[] f1395M;

    /* renamed from: N  reason: collision with root package name */
    public static final byte[] f1396N;

    /* renamed from: l  reason: collision with root package name */
    public static final boolean f1397l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f1398m;

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f1399n;

    /* renamed from: o  reason: collision with root package name */
    public static final byte[] f1400o;

    /* renamed from: p  reason: collision with root package name */
    public static final byte[] f1401p;

    /* renamed from: q  reason: collision with root package name */
    public static final byte[] f1402q;

    /* renamed from: r  reason: collision with root package name */
    public static final byte[] f1403r;

    /* renamed from: s  reason: collision with root package name */
    public static final byte[] f1404s;

    /* renamed from: t  reason: collision with root package name */
    public static final byte[] f1405t;

    /* renamed from: u  reason: collision with root package name */
    public static final byte[] f1406u;

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f1407v;

    /* renamed from: w  reason: collision with root package name */
    public static final byte[] f1408w;
    public static final byte[] x;

    /* renamed from: y  reason: collision with root package name */
    public static final byte[] f1409y;

    /* renamed from: z  reason: collision with root package name */
    public static final byte[] f1410z;

    /* renamed from: a  reason: collision with root package name */
    public final FileDescriptor f1411a;

    /* renamed from: b  reason: collision with root package name */
    public final AssetManager.AssetInputStream f1412b;

    /* renamed from: c  reason: collision with root package name */
    public int f1413c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap[] f1414d;

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f1415e;

    /* renamed from: f  reason: collision with root package name */
    public ByteOrder f1416f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1417g;

    /* renamed from: h  reason: collision with root package name */
    public int f1418h;

    /* renamed from: i  reason: collision with root package name */
    public int f1419i;

    /* renamed from: j  reason: collision with root package name */
    public int f1420j;

    /* renamed from: k  reason: collision with root package name */
    public int f1421k;

    static {
        d[] dVarArr;
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f1398m = new int[]{8, 8, 8};
        f1399n = new int[]{8};
        f1400o = new byte[]{-1, -40, -1};
        f1401p = new byte[]{102, 116, 121, 112};
        f1402q = new byte[]{109, 105, 102, 49};
        f1403r = new byte[]{104, 101, 105, 99};
        f1404s = new byte[]{79, 76, 89, 77, 80, 0};
        f1405t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f1406u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f1407v = new byte[]{101, 88, 73, 102};
        f1408w = new byte[]{73, 72, 68, 82};
        x = new byte[]{73, 69, 78, 68};
        f1409y = new byte[]{82, 73, 70, 70};
        f1410z = new byte[]{87, 69, 66, 80};
        f1384A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f1385B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f1386C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f1387D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr2 = {new d(254, 4, "NewSubfileType"), new d(255, 4, "SubfileType"), new d(256, 3, 4, "ImageWidth"), new d(257, 3, 4, "ImageLength"), new d(258, 3, "BitsPerSample"), new d(259, 3, "Compression"), new d(262, 3, "PhotometricInterpretation"), new d(270, 2, "ImageDescription"), new d(271, 2, "Make"), new d(272, 2, "Model"), new d(273, 3, 4, "StripOffsets"), new d(274, 3, "Orientation"), new d(277, 3, "SamplesPerPixel"), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d(282, 5, "XResolution"), new d(283, 5, "YResolution"), new d(284, 3, "PlanarConfiguration"), new d(296, 3, "ResolutionUnit"), new d(301, 3, "TransferFunction"), new d(305, 2, "Software"), new d(306, 2, "DateTime"), new d(315, 2, "Artist"), new d(318, 5, "WhitePoint"), new d(319, 5, "PrimaryChromaticities"), new d(330, 4, "SubIFDPointer"), new d(513, 4, "JPEGInterchangeFormat"), new d(514, 4, "JPEGInterchangeFormatLength"), new d(529, 5, "YCbCrCoefficients"), new d(530, 3, "YCbCrSubSampling"), new d(531, 3, "YCbCrPositioning"), new d(532, 5, "ReferenceBlackWhite"), new d(33432, 2, "Copyright"), new d(34665, 4, "ExifIFDPointer"), new d(34853, 4, "GPSInfoIFDPointer"), new d(4, 4, "SensorTopBorder"), new d(5, 4, "SensorLeftBorder"), new d(6, 4, "SensorBottomBorder"), new d(7, 4, "SensorRightBorder"), new d(23, 3, "ISO"), new d(46, 7, "JpgFromRaw"), new d(700, 1, "Xmp")};
        f1388E = new d(273, 3, "StripOffsets");
        f1389F = new d[][]{dVarArr2, new d[]{new d(33434, 5, "ExposureTime"), new d(33437, 5, "FNumber"), new d(34850, 3, "ExposureProgram"), new d(34852, 2, "SpectralSensitivity"), new d(34855, 3, "PhotographicSensitivity"), new d(34856, 7, "OECF"), new d(34864, 3, "SensitivityType"), new d(34865, 4, "StandardOutputSensitivity"), new d(34866, 4, "RecommendedExposureIndex"), new d(34867, 4, "ISOSpeed"), new d(34868, 4, "ISOSpeedLatitudeyyy"), new d(34869, 4, "ISOSpeedLatitudezzz"), new d(36864, 2, "ExifVersion"), new d(36867, 2, "DateTimeOriginal"), new d(36868, 2, "DateTimeDigitized"), new d(36880, 2, "OffsetTime"), new d(36881, 2, "OffsetTimeOriginal"), new d(36882, 2, "OffsetTimeDigitized"), new d(37121, 7, "ComponentsConfiguration"), new d(37122, 5, "CompressedBitsPerPixel"), new d(37377, 10, "ShutterSpeedValue"), new d(37378, 5, "ApertureValue"), new d(37379, 10, "BrightnessValue"), new d(37380, 10, "ExposureBiasValue"), new d(37381, 5, "MaxApertureValue"), new d(37382, 5, "SubjectDistance"), new d(37383, 3, "MeteringMode"), new d(37384, 3, "LightSource"), new d(37385, 3, "Flash"), new d(37386, 5, "FocalLength"), new d(37396, 3, "SubjectArea"), new d(37500, 7, "MakerNote"), new d(37510, 7, "UserComment"), new d(37520, 2, "SubSecTime"), new d(37521, 2, "SubSecTimeOriginal"), new d(37522, 2, "SubSecTimeDigitized"), new d(40960, 7, "FlashpixVersion"), new d(40961, 3, "ColorSpace"), new d(40962, 3, 4, "PixelXDimension"), new d(40963, 3, 4, "PixelYDimension"), new d(40964, 2, "RelatedSoundFile"), new d(40965, 4, "InteroperabilityIFDPointer"), new d(41483, 5, "FlashEnergy"), new d(41484, 7, "SpatialFrequencyResponse"), new d(41486, 5, "FocalPlaneXResolution"), new d(41487, 5, "FocalPlaneYResolution"), new d(41488, 3, "FocalPlaneResolutionUnit"), new d(41492, 3, "SubjectLocation"), new d(41493, 5, "ExposureIndex"), new d(41495, 3, "SensingMethod"), new d(41728, 7, "FileSource"), new d(41729, 7, "SceneType"), new d(41730, 7, "CFAPattern"), new d(41985, 3, "CustomRendered"), new d(41986, 3, "ExposureMode"), new d(41987, 3, "WhiteBalance"), new d(41988, 5, "DigitalZoomRatio"), new d(41989, 3, "FocalLengthIn35mmFilm"), new d(41990, 3, "SceneCaptureType"), new d(41991, 3, "GainControl"), new d(41992, 3, "Contrast"), new d(41993, 3, "Saturation"), new d(41994, 3, "Sharpness"), new d(41995, 7, "DeviceSettingDescription"), new d(41996, 3, "SubjectDistanceRange"), new d(42016, 2, "ImageUniqueID"), new d(42032, 2, "CameraOwnerName"), new d(42033, 2, "BodySerialNumber"), new d(42034, 5, "LensSpecification"), new d(42035, 2, "LensMake"), new d(42036, 2, "LensModel"), new d(42240, 5, "Gamma"), new d(50706, 1, "DNGVersion"), new d(50720, 3, 4, "DefaultCropSize")}, new d[]{new d(0, 1, "GPSVersionID"), new d(1, 2, "GPSLatitudeRef"), new d(2, 5, 10, "GPSLatitude"), new d(3, 2, "GPSLongitudeRef"), new d(4, 5, 10, "GPSLongitude"), new d(5, 1, "GPSAltitudeRef"), new d(6, 5, "GPSAltitude"), new d(7, 5, "GPSTimeStamp"), new d(8, 2, "GPSSatellites"), new d(9, 2, "GPSStatus"), new d(10, 2, "GPSMeasureMode"), new d(11, 5, "GPSDOP"), new d(12, 2, "GPSSpeedRef"), new d(13, 5, "GPSSpeed"), new d(14, 2, "GPSTrackRef"), new d(15, 5, "GPSTrack"), new d(16, 2, "GPSImgDirectionRef"), new d(17, 5, "GPSImgDirection"), new d(18, 2, "GPSMapDatum"), new d(19, 2, "GPSDestLatitudeRef"), new d(20, 5, "GPSDestLatitude"), new d(21, 2, "GPSDestLongitudeRef"), new d(22, 5, "GPSDestLongitude"), new d(23, 2, "GPSDestBearingRef"), new d(24, 5, "GPSDestBearing"), new d(25, 2, "GPSDestDistanceRef"), new d(26, 5, "GPSDestDistance"), new d(27, 7, "GPSProcessingMethod"), new d(28, 7, "GPSAreaInformation"), new d(29, 2, "GPSDateStamp"), new d(30, 3, "GPSDifferential"), new d(31, 5, "GPSHPositioningError")}, new d[]{new d(1, 2, "InteroperabilityIndex")}, new d[]{new d(254, 4, "NewSubfileType"), new d(255, 4, "SubfileType"), new d(256, 3, 4, "ThumbnailImageWidth"), new d(257, 3, 4, "ThumbnailImageLength"), new d(258, 3, "BitsPerSample"), new d(259, 3, "Compression"), new d(262, 3, "PhotometricInterpretation"), new d(270, 2, "ImageDescription"), new d(271, 2, "Make"), new d(272, 2, "Model"), new d(273, 3, 4, "StripOffsets"), new d(274, 3, "ThumbnailOrientation"), new d(277, 3, "SamplesPerPixel"), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d(282, 5, "XResolution"), new d(283, 5, "YResolution"), new d(284, 3, "PlanarConfiguration"), new d(296, 3, "ResolutionUnit"), new d(301, 3, "TransferFunction"), new d(305, 2, "Software"), new d(306, 2, "DateTime"), new d(315, 2, "Artist"), new d(318, 5, "WhitePoint"), new d(319, 5, "PrimaryChromaticities"), new d(330, 4, "SubIFDPointer"), new d(513, 4, "JPEGInterchangeFormat"), new d(514, 4, "JPEGInterchangeFormatLength"), new d(529, 5, "YCbCrCoefficients"), new d(530, 3, "YCbCrSubSampling"), new d(531, 3, "YCbCrPositioning"), new d(532, 5, "ReferenceBlackWhite"), new d(33432, 2, "Copyright"), new d(34665, 4, "ExifIFDPointer"), new d(34853, 4, "GPSInfoIFDPointer"), new d(50706, 1, "DNGVersion"), new d(50720, 3, 4, "DefaultCropSize")}, dVarArr2, new d[]{new d(256, 7, "ThumbnailImage"), new d(8224, 4, "CameraSettingsIFDPointer"), new d(8256, 4, "ImageProcessingIFDPointer")}, new d[]{new d(257, 4, "PreviewImageStart"), new d(258, 4, "PreviewImageLength")}, new d[]{new d(4371, 3, "AspectFrame")}, new d[]{new d(55, 3, "ColorSpace")}};
        f1390G = new d[]{new d(330, 4, "SubIFDPointer"), new d(34665, 4, "ExifIFDPointer"), new d(34853, 4, "GPSInfoIFDPointer"), new d(40965, 4, "InteroperabilityIFDPointer"), new d(8224, 1, "CameraSettingsIFDPointer"), new d(8256, 1, "ImageProcessingIFDPointer")};
        f1391H = new HashMap[10];
        f1392I = new HashMap[10];
        f1393J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f1394K = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        L = forName;
        f1395M = "Exif\u0000\u0000".getBytes(forName);
        f1396N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i3 = 0;
        while (true) {
            d[][] dVarArr3 = f1389F;
            if (i3 < dVarArr3.length) {
                f1391H[i3] = new HashMap();
                f1392I[i3] = new HashMap();
                for (d dVar : dVarArr3[i3]) {
                    f1391H[i3].put(Integer.valueOf(dVar.f1378a), dVar);
                    f1392I[i3].put(dVar.f1379b, dVar);
                }
                i3++;
            } else {
                HashMap hashMap = f1394K;
                d[] dVarArr4 = f1390G;
                hashMap.put(Integer.valueOf(dVarArr4[0].f1378a), 5);
                hashMap.put(Integer.valueOf(dVarArr4[1].f1378a), 1);
                hashMap.put(Integer.valueOf(dVarArr4[2].f1378a), 2);
                hashMap.put(Integer.valueOf(dVarArr4[3].f1378a), 3);
                hashMap.put(Integer.valueOf(dVarArr4[4].f1378a), 7);
                hashMap.put(Integer.valueOf(dVarArr4[5].f1378a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa A[Catch: all -> 0x0030, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0030, blocks: (B:3:0x0021, B:5:0x0024, B:12:0x0039, B:18:0x0056, B:20:0x0061, B:28:0x0077, B:23:0x0068, B:26:0x0070, B:27:0x0074, B:29:0x0081, B:31:0x008a, B:33:0x0090, B:35:0x0096, B:37:0x009c, B:42:0x00aa), top: B:52:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(java.io.ByteArrayInputStream r9) {
        /*
            r8 = this;
            r8.<init>()
            P.d[][] r0 = P.g.f1389F
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r8.f1414d = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r2 = r0.length
            r1.<init>(r2)
            r8.f1415e = r1
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r8.f1416f = r1
            r1 = 0
            boolean r2 = P.g.f1397l
            java.lang.String r3 = "ExifInterface"
            r8.f1412b = r1
            r8.f1411a = r1
            r1 = 0
            r4 = 0
        L21:
            int r5 = r0.length     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            if (r4 >= r5) goto L39
            java.util.HashMap[] r5 = r8.f1414d     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r6.<init>()     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r5[r4] = r6     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            int r4 = r4 + 1
            goto L21
        L30:
            r9 = move-exception
            goto Lb0
        L33:
            r9 = move-exception
            goto La8
        L36:
            r9 = move-exception
            goto La8
        L39:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r4 = 5000(0x1388, float:7.006E-42)
            r0.<init>(r9, r4)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            int r9 = r8.f(r0)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r8.f1413c = r9     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r4 = 14
            r5 = 13
            r6 = 9
            r7 = 4
            if (r9 == r7) goto L81
            if (r9 == r6) goto L81
            if (r9 == r5) goto L81
            if (r9 != r4) goto L56
            goto L81
        L56:
            P.f r9 = new P.f     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            int r0 = r8.f1413c     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r1 = 12
            if (r0 != r1) goto L65
            r8.d(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L77
        L65:
            r1 = 7
            if (r0 != r1) goto L6c
            r8.g(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L77
        L6c:
            r1 = 10
            if (r0 != r1) goto L74
            r8.k(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L77
        L74:
            r8.j(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
        L77:
            int r0 = r8.f1418h     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r9.b(r0)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r8.u(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L9f
        L81:
            P.b r9 = new P.b     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            int r0 = r8.f1413c     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            if (r0 != r7) goto L8e
            r8.e(r9, r1, r1)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L9f
        L8e:
            if (r0 != r5) goto L94
            r8.h(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L9f
        L94:
            if (r0 != r6) goto L9a
            r8.i(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L9f
        L9a:
            if (r0 != r4) goto L9f
            r8.l(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
        L9f:
            r8.a()
            if (r2 == 0) goto Lbf
        La4:
            r8.p()
            goto Lbf
        La8:
            if (r2 == 0) goto Lb9
            java.lang.String r0 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r3, r0, r9)     // Catch: java.lang.Throwable -> L30
            goto Lb9
        Lb0:
            r8.a()
            if (r2 == 0) goto Lb8
            r8.p()
        Lb8:
            throw r9
        Lb9:
            r8.a()
            if (r2 == 0) goto Lbf
            goto La4
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P.g.<init>(java.io.ByteArrayInputStream):void");
    }

    public static ByteOrder q(b bVar) {
        short readShort = bVar.readShort();
        boolean z3 = f1397l;
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (z3) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        if (z3) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void a() {
        String b3 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f1414d;
        if (b3 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b3.concat("\u0000").getBytes(L);
            hashMap.put("DateTime", new c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.a(0L, this.f1416f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.a(0L, this.f1416f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.a(0L, this.f1416f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.a(0L, this.f1416f));
        }
    }

    public final String b(String str) {
        c c3 = c(str);
        if (c3 != null) {
            if (!f1393J.contains(str)) {
                return c3.f(this.f1416f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i3 = c3.f1374a;
                if (i3 != 5 && i3 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i3);
                    return null;
                }
                e[] eVarArr = (e[]) c3.g(this.f1416f);
                if (eVarArr != null && eVarArr.length == 3) {
                    e eVar = eVarArr[0];
                    Integer valueOf = Integer.valueOf((int) (((float) eVar.f1382a) / ((float) eVar.f1383b)));
                    e eVar2 = eVarArr[1];
                    Integer valueOf2 = Integer.valueOf((int) (((float) eVar2.f1382a) / ((float) eVar2.f1383b)));
                    e eVar3 = eVarArr[2];
                    return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) eVar3.f1382a) / ((float) eVar3.f1383b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                return null;
            }
            try {
                return Double.toString(c3.d(this.f1416f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f1397l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i3 = 0; i3 < f1389F.length; i3++) {
            c cVar = (c) this.f1414d[i3].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void d(f fVar) {
        String str;
        String str2;
        String str3;
        int i3;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    i.a(mediaMetadataRetriever, new a(fVar));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str3 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str3 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    HashMap[] hashMapArr = this.f1414d;
                    if (str != null) {
                        hashMapArr[0].put("ImageWidth", c.c(Integer.parseInt(str), this.f1416f));
                    }
                    if (str2 != null) {
                        hashMapArr[0].put("ImageLength", c.c(Integer.parseInt(str2), this.f1416f));
                    }
                    if (str3 != null) {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    i3 = 1;
                                } else {
                                    i3 = 8;
                                }
                            } else {
                                i3 = 3;
                            }
                        } else {
                            i3 = 6;
                        }
                        hashMapArr[0].put("Orientation", c.c(i3, this.f1416f));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            fVar.b(parseInt2);
                            byte[] bArr = new byte[6];
                            if (fVar.read(bArr) == 6) {
                                int i4 = parseInt2 + 6;
                                int i5 = parseInt3 - 6;
                                if (Arrays.equals(bArr, f1395M)) {
                                    byte[] bArr2 = new byte[i5];
                                    if (fVar.read(bArr2) == i5) {
                                        this.f1418h = i4;
                                        r(bArr2, 0);
                                    } else {
                                        throw new IOException("Can't read exif");
                                    }
                                } else {
                                    throw new IOException("Invalid identifier");
                                }
                            } else {
                                throw new IOException("Can't read identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (f1397l) {
                        Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                    }
                    mediaMetadataRetriever.release();
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a2, code lost:
        r23.f1371n = r22.f1416f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a6, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018e A[LOOP:0: B:10:0x0034->B:82:0x018e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0196 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(P.b r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P.g.e(P.b, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bf, code lost:
        if (r8 != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fc A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P.g.f(java.io.BufferedInputStream):int");
    }

    public final void g(f fVar) {
        int i3;
        int i4;
        j(fVar);
        HashMap[] hashMapArr = this.f1414d;
        c cVar = (c) hashMapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f1377d);
            fVar2.f1371n = this.f1416f;
            byte[] bArr = f1404s;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.b(0L);
            byte[] bArr3 = f1405t;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.b(12L);
            }
            s(fVar2, 6);
            c cVar2 = (c) hashMapArr[7].get("PreviewImageStart");
            c cVar3 = (c) hashMapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", cVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) hashMapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f1416f);
                if (iArr != null && iArr.length == 4) {
                    int i5 = iArr[2];
                    int i6 = iArr[0];
                    if (i5 > i6 && (i3 = iArr[3]) > (i4 = iArr[1])) {
                        int i7 = (i5 - i6) + 1;
                        int i8 = (i3 - i4) + 1;
                        if (i7 < i8) {
                            int i9 = i7 + i8;
                            i8 = i9 - i8;
                            i7 = i9 - i8;
                        }
                        c c3 = c.c(i7, this.f1416f);
                        c c4 = c.c(i8, this.f1416f);
                        hashMapArr[0].put("ImageWidth", c3);
                        hashMapArr[0].put("ImageLength", c4);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    public final void h(b bVar) {
        if (f1397l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f1371n = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f1406u;
        bVar.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i3 = length + 8;
                    if (i3 == 16 && !Arrays.equals(bArr2, f1408w)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (!Arrays.equals(bArr2, x)) {
                        if (Arrays.equals(bArr2, f1407v)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f1418h = i3;
                                    r(bArr3, 0);
                                    x();
                                    u(new b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC0155a.j(bArr2));
                        }
                        int i4 = readInt + 4;
                        bVar.a(i4);
                        length = i3 + i4;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(b bVar) {
        boolean z3 = f1397l;
        if (z3) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i3 = ByteBuffer.wrap(bArr).getInt();
        int i4 = ByteBuffer.wrap(bArr2).getInt();
        int i5 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i4];
        bVar.a(i3 - bVar.f1372o);
        bVar.read(bArr4);
        e(new b(bArr4), i3, 5);
        bVar.a(i5 - bVar.f1372o);
        bVar.f1371n = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i6 = 0; i6 < readInt; i6++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f1388E.f1378a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c c3 = c.c(readShort, this.f1416f);
                c c4 = c.c(readShort2, this.f1416f);
                HashMap[] hashMapArr = this.f1414d;
                hashMapArr[0].put("ImageLength", c3);
                hashMapArr[0].put("ImageWidth", c4);
                if (z3) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.a(readUnsignedShort2);
        }
    }

    public final void j(f fVar) {
        o(fVar);
        s(fVar, 0);
        w(fVar, 0);
        w(fVar, 5);
        w(fVar, 4);
        x();
        if (this.f1413c == 8) {
            HashMap[] hashMapArr = this.f1414d;
            c cVar = (c) hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f1377d);
                fVar2.f1371n = this.f1416f;
                fVar2.a(6);
                s(fVar2, 9);
                c cVar2 = (c) hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void k(f fVar) {
        if (f1397l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] hashMapArr = this.f1414d;
        c cVar = (c) hashMapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.f1377d), (int) cVar.f1376c, 5);
        }
        c cVar2 = (c) hashMapArr[0].get("ISO");
        c cVar3 = (c) hashMapArr[1].get("PhotographicSensitivity");
        if (cVar2 != null && cVar3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", cVar2);
        }
    }

    public final void l(b bVar) {
        if (f1397l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f1371n = ByteOrder.LITTLE_ENDIAN;
        bVar.a(f1409y.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f1410z;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i3 = length + 8;
                    if (Arrays.equals(f1384A, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.f1418h = i3;
                            r(bArr3, 0);
                            u(new b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC0155a.j(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i3 + readInt2;
                    if (length == readInt) {
                        return;
                    }
                    if (length <= readInt) {
                        bVar.a(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int e2 = cVar.e(this.f1416f);
            int e3 = cVar2.e(this.f1416f);
            if (this.f1413c == 7) {
                e2 += this.f1419i;
            }
            if (e2 > 0 && e3 > 0 && this.f1412b == null && this.f1411a == null) {
                bVar.skip(e2);
                bVar.read(new byte[e3]);
            }
            if (f1397l) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e2 + ", length: " + e3);
            }
        }
    }

    public final boolean n(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar != null && cVar2 != null) {
            int e2 = cVar.e(this.f1416f);
            int e3 = cVar2.e(this.f1416f);
            if (e2 <= 512 && e3 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o(f fVar) {
        ByteOrder q3 = q(fVar);
        this.f1416f = q3;
        fVar.f1371n = q3;
        int readUnsignedShort = fVar.readUnsignedShort();
        int i3 = this.f1413c;
        if (i3 != 7 && i3 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = fVar.readInt();
        if (readInt >= 8) {
            int i4 = readInt - 8;
            if (i4 > 0) {
                fVar.a(i4);
                return;
            }
            return;
        }
        throw new IOException(D2.h.k("Invalid first Ifd offset: ", readInt));
    }

    public final void p() {
        int i3 = 0;
        while (true) {
            HashMap[] hashMapArr = this.f1414d;
            if (i3 < hashMapArr.length) {
                Log.d("ExifInterface", "The size of tag group[" + i3 + "]: " + hashMapArr[i3].size());
                for (Map.Entry entry : hashMapArr[i3].entrySet()) {
                    c cVar = (c) entry.getValue();
                    Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f1416f) + "'");
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public final void r(byte[] bArr, int i3) {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(P.f r29, int r30) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P.g.s(P.f, int):void");
    }

    public final void t(int i3, String str, String str2) {
        HashMap[] hashMapArr = this.f1414d;
        if (!hashMapArr[i3].isEmpty() && hashMapArr[i3].get(str) != null) {
            HashMap hashMap = hashMapArr[i3];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[i3].remove(str);
        }
    }

    public final void u(b bVar) {
        c cVar;
        int e2;
        HashMap hashMap = this.f1414d[4];
        c cVar2 = (c) hashMap.get("Compression");
        if (cVar2 != null) {
            int e3 = cVar2.e(this.f1416f);
            int i3 = 1;
            if (e3 != 1) {
                if (e3 != 6) {
                    if (e3 != 7) {
                        return;
                    }
                } else {
                    m(bVar, hashMap);
                    return;
                }
            }
            c cVar3 = (c) hashMap.get("BitsPerSample");
            if (cVar3 != null) {
                int[] iArr = (int[]) cVar3.g(this.f1416f);
                int[] iArr2 = f1398m;
                if (Arrays.equals(iArr2, iArr) || (this.f1413c == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((e2 = cVar.e(this.f1416f)) == 1 && Arrays.equals(iArr, f1399n)) || (e2 == 6 && Arrays.equals(iArr, iArr2))))) {
                    c cVar4 = (c) hashMap.get("StripOffsets");
                    c cVar5 = (c) hashMap.get("StripByteCounts");
                    if (cVar4 != null && cVar5 != null) {
                        long[] u3 = AbstractC0155a.u(cVar4.g(this.f1416f));
                        long[] u4 = AbstractC0155a.u(cVar5.g(this.f1416f));
                        if (u3 != null && u3.length != 0) {
                            if (u4 != null && u4.length != 0) {
                                if (u3.length != u4.length) {
                                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                                    return;
                                }
                                long j3 = 0;
                                for (long j4 : u4) {
                                    j3 += j4;
                                }
                                byte[] bArr = new byte[(int) j3];
                                this.f1417g = true;
                                int i4 = 0;
                                int i5 = 0;
                                int i6 = 0;
                                while (i4 < u3.length) {
                                    int i7 = (int) u3[i4];
                                    int i8 = (int) u4[i4];
                                    if (i4 < u3.length - i3 && i7 + i8 != u3[i4 + 1]) {
                                        this.f1417g = false;
                                    }
                                    int i9 = i7 - i5;
                                    if (i9 < 0) {
                                        Log.d("ExifInterface", "Invalid strip offset value");
                                        return;
                                    }
                                    long j5 = i9;
                                    if (bVar.skip(j5) != j5) {
                                        Log.d("ExifInterface", "Failed to skip " + i9 + " bytes.");
                                        return;
                                    }
                                    int i10 = i5 + i9;
                                    byte[] bArr2 = new byte[i8];
                                    if (bVar.read(bArr2) != i8) {
                                        Log.d("ExifInterface", "Failed to read " + i8 + " bytes.");
                                        return;
                                    }
                                    i5 = i10 + i8;
                                    System.arraycopy(bArr2, 0, bArr, i6, i8);
                                    i6 += i8;
                                    i4++;
                                    i3 = 1;
                                }
                                if (this.f1417g) {
                                    long j6 = u3[0];
                                    return;
                                }
                                return;
                            }
                            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                            return;
                        }
                        Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                        return;
                    }
                    return;
                }
            }
            if (f1397l) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        m(bVar, hashMap);
    }

    public final void v(int i3, int i4) {
        HashMap[] hashMapArr = this.f1414d;
        boolean isEmpty = hashMapArr[i3].isEmpty();
        boolean z3 = f1397l;
        if (!isEmpty && !hashMapArr[i4].isEmpty()) {
            c cVar = (c) hashMapArr[i3].get("ImageLength");
            c cVar2 = (c) hashMapArr[i3].get("ImageWidth");
            c cVar3 = (c) hashMapArr[i4].get("ImageLength");
            c cVar4 = (c) hashMapArr[i4].get("ImageWidth");
            if (cVar != null && cVar2 != null) {
                if (cVar3 != null && cVar4 != null) {
                    int e2 = cVar.e(this.f1416f);
                    int e3 = cVar2.e(this.f1416f);
                    int e4 = cVar3.e(this.f1416f);
                    int e5 = cVar4.e(this.f1416f);
                    if (e2 < e4 && e3 < e5) {
                        HashMap hashMap = hashMapArr[i3];
                        hashMapArr[i3] = hashMapArr[i4];
                        hashMapArr[i4] = hashMap;
                    }
                } else if (z3) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                }
            } else if (z3) {
                Log.d("ExifInterface", "First image does not contain valid size information");
            }
        } else if (z3) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void w(f fVar, int i3) {
        c c3;
        c c4;
        HashMap[] hashMapArr = this.f1414d;
        c cVar = (c) hashMapArr[i3].get("DefaultCropSize");
        c cVar2 = (c) hashMapArr[i3].get("SensorTopBorder");
        c cVar3 = (c) hashMapArr[i3].get("SensorLeftBorder");
        c cVar4 = (c) hashMapArr[i3].get("SensorBottomBorder");
        c cVar5 = (c) hashMapArr[i3].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f1374a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f1416f);
                if (eVarArr != null && eVarArr.length == 2) {
                    c3 = c.b(eVarArr[0], this.f1416f);
                    c4 = c.b(eVarArr[1], this.f1416f);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) cVar.g(this.f1416f);
                if (iArr != null && iArr.length == 2) {
                    c3 = c.c(iArr[0], this.f1416f);
                    c4 = c.c(iArr[1], this.f1416f);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            hashMapArr[i3].put("ImageWidth", c3);
            hashMapArr[i3].put("ImageLength", c4);
        } else if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int e2 = cVar2.e(this.f1416f);
            int e3 = cVar4.e(this.f1416f);
            int e4 = cVar5.e(this.f1416f);
            int e5 = cVar3.e(this.f1416f);
            if (e3 > e2 && e4 > e5) {
                c c5 = c.c(e3 - e2, this.f1416f);
                c c6 = c.c(e4 - e5, this.f1416f);
                hashMapArr[i3].put("ImageLength", c5);
                hashMapArr[i3].put("ImageWidth", c6);
            }
        } else {
            c cVar6 = (c) hashMapArr[i3].get("ImageLength");
            c cVar7 = (c) hashMapArr[i3].get("ImageWidth");
            if (cVar6 == null || cVar7 == null) {
                c cVar8 = (c) hashMapArr[i3].get("JPEGInterchangeFormat");
                c cVar9 = (c) hashMapArr[i3].get("JPEGInterchangeFormatLength");
                if (cVar8 != null && cVar9 != null) {
                    int e6 = cVar8.e(this.f1416f);
                    int e7 = cVar8.e(this.f1416f);
                    fVar.b(e6);
                    byte[] bArr = new byte[e7];
                    fVar.read(bArr);
                    e(new b(bArr), e6, i3);
                }
            }
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.f1414d;
        c cVar = (c) hashMapArr[1].get("PixelXDimension");
        c cVar2 = (c) hashMapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
        }
        if (hashMapArr[4].isEmpty() && n(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!n(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
