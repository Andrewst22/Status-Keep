package W1;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.PriorityQueue;
/* renamed from: W1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128a {

    /* renamed from: f  reason: collision with root package name */
    public static final Matrix f2827f = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.l f2828a;

    /* renamed from: b  reason: collision with root package name */
    public final B1.a f2829b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2830c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f2831d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public int f2832e;

    public C0128a(io.flutter.embedding.engine.renderer.l lVar, boolean z3) {
        this.f2828a = lVar;
        if (B1.a.f48p == null) {
            B1.a.f48p = new B1.a(11);
        }
        this.f2829b = B1.a.f48p;
        this.f2830c = z3;
    }

    public static int b(int i3) {
        if (i3 == 0) {
            return 4;
        }
        if (i3 == 1) {
            return 6;
        }
        if (i3 == 5) {
            return 4;
        }
        if (i3 == 6) {
            return 6;
        }
        if (i3 == 2) {
            return 5;
        }
        if (i3 == 7) {
            return 3;
        }
        if (i3 == 3) {
            return 0;
        }
        if (i3 == 8) {
            return 3;
        }
        return -1;
    }

    public final void a(MotionEvent motionEvent, int i3, int i4, int i5, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        int i6;
        int i7;
        long j3;
        int i8;
        long j4;
        int i9;
        float[] fArr;
        double d3;
        double d4;
        MotionEvent motionEvent2;
        double d5;
        double d6;
        double d7;
        C0128a c0128a;
        float c3;
        float c4;
        float scaledHorizontalScrollFactor;
        InputDevice.MotionRange motionRange;
        if (i4 == -1) {
            return;
        }
        int pointerId = motionEvent.getPointerId(i3);
        int toolType = motionEvent.getToolType(i3);
        if (toolType != 1) {
            if (toolType != 2) {
                i6 = 3;
                if (toolType != 3) {
                    if (toolType != 4) {
                        i6 = 5;
                    }
                } else {
                    i6 = 1;
                }
            } else {
                i6 = 2;
            }
        } else {
            i6 = 0;
        }
        float[] fArr2 = {motionEvent.getX(i3), motionEvent.getY(i3)};
        matrix.mapPoints(fArr2);
        HashMap hashMap = this.f2831d;
        if (i6 == 1) {
            j3 = motionEvent.getButtonState() & 31;
            if (j3 == 0 && motionEvent.getSource() == 8194) {
                i7 = 4;
                if (i4 == 4) {
                    hashMap.put(Integer.valueOf(pointerId), fArr2);
                }
            } else {
                i7 = 4;
            }
        } else {
            i7 = 4;
            j3 = i6 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean containsKey = hashMap.containsKey(Integer.valueOf(pointerId));
        if (containsKey) {
            if (i4 == i7) {
                i8 = 7;
            } else if (i4 == 5) {
                i8 = 8;
            } else if (i4 != 6 && i4 != 0) {
                i8 = -1;
            } else {
                i8 = 9;
            }
            if (i8 == -1) {
                return;
            }
        } else {
            i8 = -1;
        }
        if (this.f2830c) {
            B1.a aVar = this.f2829b;
            aVar.getClass();
            j4 = B.f2825b.incrementAndGet();
            ((LongSparseArray) aVar.f50n).put(j4, MotionEvent.obtain(motionEvent));
            ((PriorityQueue) aVar.f51o).add(Long.valueOf(j4));
        } else {
            j4 = 0;
        }
        if (motionEvent.getActionMasked() == 8) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        long j5 = j3;
        byteBuffer.putLong(j4);
        byteBuffer.putLong(motionEvent.getEventTime() * 1000);
        if (containsKey) {
            byteBuffer.putLong(i8);
            byteBuffer.putLong(4L);
        } else {
            byteBuffer.putLong(i4);
            byteBuffer.putLong(i6);
        }
        byteBuffer.putLong(i9);
        byteBuffer.putLong(pointerId);
        byteBuffer.putLong(0L);
        if (containsKey) {
            float[] fArr3 = (float[]) hashMap.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr3[0]);
            byteBuffer.putDouble(fArr3[1]);
        } else {
            byteBuffer.putDouble(fArr2[0]);
            byteBuffer.putDouble(fArr2[1]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(j5);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i3));
        if (motionEvent.getDevice() != null && (motionRange = motionEvent.getDevice().getMotionRange(2)) != null) {
            d3 = motionRange.getMin();
            fArr = fArr2;
            d4 = motionRange.getMax();
        } else {
            fArr = fArr2;
            d3 = 0.0d;
            d4 = 1.0d;
        }
        byteBuffer.putDouble(d3);
        byteBuffer.putDouble(d4);
        if (i6 == 2) {
            motionEvent2 = motionEvent;
            byteBuffer.putDouble(motionEvent2.getAxisValue(24, i3));
            byteBuffer.putDouble(0.0d);
        } else {
            motionEvent2 = motionEvent;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(motionEvent.getSize(i3));
        byteBuffer.putDouble(motionEvent.getToolMajor(i3));
        byteBuffer.putDouble(motionEvent.getToolMinor(i3));
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(motionEvent2.getAxisValue(8, i3));
        if (i6 == 2) {
            byteBuffer.putDouble(motionEvent2.getAxisValue(25, i3));
        } else {
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putLong(i5);
        if (i9 == 1) {
            if (context != null) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 26) {
                    scaledHorizontalScrollFactor = ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
                    c3 = scaledHorizontalScrollFactor;
                    c0128a = this;
                } else {
                    c0128a = this;
                    c3 = c0128a.c(context);
                }
                d6 = c3;
                if (i10 >= 26) {
                    c4 = ViewConfiguration.get(context).getScaledVerticalScrollFactor();
                } else {
                    c4 = c0128a.c(context);
                }
                d7 = c4;
            } else {
                d6 = 48.0d;
                d7 = 48.0d;
            }
            byteBuffer.putDouble(d6 * (-motionEvent2.getAxisValue(10, i3)));
            byteBuffer.putDouble(d7 * (-motionEvent2.getAxisValue(9, i3)));
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (containsKey) {
            float[] fArr4 = (float[]) hashMap.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr[0] - fArr4[0]);
            byteBuffer.putDouble(fArr[1] - fArr4[1]);
            d5 = 0.0d;
        } else {
            d5 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d5);
        byteBuffer.putDouble(d5);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d5);
        byteBuffer.putLong(0L);
        if (containsKey && i8 == 9) {
            hashMap.remove(Integer.valueOf(pointerId));
        }
    }

    public final int c(Context context) {
        if (this.f2832e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                return 48;
            }
            this.f2832e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2832e;
    }

    public final void d(MotionEvent motionEvent, Matrix matrix) {
        boolean z3;
        boolean z4;
        int i3;
        int actionMasked = motionEvent.getActionMasked();
        int b3 = b(motionEvent.getActionMasked());
        char c3 = 5;
        if (actionMasked != 0 && actionMasked != 5) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3 && (actionMasked == 1 || actionMasked == 6)) {
            z4 = true;
        } else {
            z4 = false;
        }
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        if (toolType != 1) {
            if (toolType != 2) {
                if (toolType != 3) {
                    if (toolType == 4) {
                        c3 = 3;
                    }
                } else {
                    c3 = 1;
                }
            } else {
                c3 = 2;
            }
        } else {
            c3 = 0;
        }
        if (z4 && c3 == 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((pointerCount + i3) * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z3) {
            a(motionEvent, motionEvent.getActionIndex(), b3, 0, matrix, allocateDirect, null);
        } else if (z4) {
            for (int i4 = 0; i4 < pointerCount; i4++) {
                if (i4 != motionEvent.getActionIndex() && motionEvent.getToolType(i4) == 1) {
                    a(motionEvent, i4, 5, 1, matrix, allocateDirect, null);
                }
            }
            a(motionEvent, motionEvent.getActionIndex(), b3, 0, matrix, allocateDirect, null);
            if (i3 != 0) {
                a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, allocateDirect, null);
            }
        } else {
            for (int i5 = 0; i5 < pointerCount; i5++) {
                a(motionEvent, i5, b3, 0, matrix, allocateDirect, null);
            }
        }
        if (allocateDirect.position() % 288 == 0) {
            this.f2828a.f6109a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
            return;
        }
        throw new AssertionError("Packet position is not on field boundary");
    }
}
