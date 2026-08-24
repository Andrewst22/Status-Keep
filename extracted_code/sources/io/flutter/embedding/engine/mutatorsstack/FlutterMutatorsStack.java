package io.flutter.embedding.engine.mutatorsstack;

import B1.b;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import d.InterfaceC0249a;
import java.util.ArrayList;
import java.util.List;
@InterfaceC0249a
/* loaded from: classes.dex */
public class FlutterMutatorsStack {
    private List<b> mutators = new ArrayList();
    private Matrix finalMatrix = new Matrix();
    private List<Path> finalClippingPaths = new ArrayList();
    private float finalOpacity = 1.0f;

    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public float getFinalOpacity() {
        return this.finalOpacity;
    }

    public List<b> getMutators() {
        return this.mutators;
    }

    public void pushClipPath(Path path) {
        this.mutators.add(new b(28));
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRRect(int i3, int i4, int i5, int i6, float[] fArr) {
        Rect rect = new Rect(i3, i4, i5, i6);
        this.mutators.add(new b(28));
        Path path = new Path();
        path.addRoundRect(new RectF(rect), fArr, Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i3, int i4, int i5, int i6) {
        Rect rect = new Rect(i3, i4, i5, i6);
        this.mutators.add(new b(28));
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushOpacity(float f3) {
        this.mutators.add(new b(28));
        this.finalOpacity *= f3;
    }

    public void pushTransform(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        this.mutators.add(new b(28));
        this.finalMatrix.preConcat(matrix);
    }
}
