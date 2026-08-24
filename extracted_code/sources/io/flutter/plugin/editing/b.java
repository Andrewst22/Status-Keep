package io.flutter.plugin.editing;

import W1.o;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import e0.C0262c;
import g2.r;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class b extends BaseInputConnection implements d {

    /* renamed from: a  reason: collision with root package name */
    public final o f6126a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6127b;

    /* renamed from: c  reason: collision with root package name */
    public final B1.a f6128c;

    /* renamed from: d  reason: collision with root package name */
    public final e f6129d;

    /* renamed from: e  reason: collision with root package name */
    public final EditorInfo f6130e;

    /* renamed from: f  reason: collision with root package name */
    public ExtractedTextRequest f6131f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6132g;

    /* renamed from: h  reason: collision with root package name */
    public CursorAnchorInfo.Builder f6133h;

    /* renamed from: i  reason: collision with root package name */
    public final ExtractedText f6134i;

    /* renamed from: j  reason: collision with root package name */
    public final InputMethodManager f6135j;

    /* renamed from: k  reason: collision with root package name */
    public final DynamicLayout f6136k;

    /* renamed from: l  reason: collision with root package name */
    public final C0262c f6137l;

    /* renamed from: m  reason: collision with root package name */
    public final B1.e f6138m;

    /* renamed from: n  reason: collision with root package name */
    public int f6139n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o oVar, int i3, B1.a aVar, B1.e eVar, e eVar2, EditorInfo editorInfo) {
        super(oVar, true);
        FlutterJNI flutterJNI = new FlutterJNI();
        this.f6132g = false;
        this.f6134i = new ExtractedText();
        this.f6139n = 0;
        this.f6126a = oVar;
        this.f6127b = i3;
        this.f6128c = aVar;
        this.f6129d = eVar2;
        eVar2.a(this);
        this.f6130e = editorInfo;
        this.f6138m = eVar;
        this.f6137l = new C0262c(flutterJNI, 27);
        this.f6136k = new DynamicLayout(eVar2, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f6135j = (InputMethodManager) oVar.getContext().getSystemService("input_method");
    }

    @Override // io.flutter.plugin.editing.d
    public final void a(boolean z3) {
        e eVar = this.f6129d;
        eVar.getClass();
        this.f6135j.updateSelection(this.f6126a, Selection.getSelectionStart(eVar), Selection.getSelectionEnd(eVar), BaseInputConnection.getComposingSpanStart(eVar), BaseInputConnection.getComposingSpanEnd(eVar));
        ExtractedTextRequest extractedTextRequest = this.f6131f;
        InputMethodManager inputMethodManager = this.f6135j;
        o oVar = this.f6126a;
        if (extractedTextRequest != null) {
            inputMethodManager.updateExtractedText(oVar, extractedTextRequest.token, c(extractedTextRequest));
        }
        if (this.f6132g) {
            inputMethodManager.updateCursorAnchorInfo(oVar, b());
        }
    }

    public final CursorAnchorInfo b() {
        CursorAnchorInfo.Builder builder = this.f6133h;
        if (builder == null) {
            this.f6133h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        CursorAnchorInfo.Builder builder2 = this.f6133h;
        e eVar = this.f6129d;
        eVar.getClass();
        int selectionStart = Selection.getSelectionStart(eVar);
        eVar.getClass();
        builder2.setSelectionRange(selectionStart, Selection.getSelectionEnd(eVar));
        eVar.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(eVar);
        eVar.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(eVar);
        if (composingSpanStart >= 0 && composingSpanEnd > composingSpanStart) {
            this.f6133h.setComposingText(composingSpanStart, eVar.toString().subSequence(composingSpanStart, composingSpanEnd));
        } else {
            this.f6133h.setComposingText(-1, "");
        }
        return this.f6133h.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f6129d.b();
        this.f6139n++;
        return super.beginBatchEdit();
    }

    public final ExtractedText c(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f6134i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        CharSequence charSequence = this.f6129d;
        charSequence.getClass();
        extractedText.selectionStart = Selection.getSelectionStart(charSequence);
        charSequence.getClass();
        extractedText.selectionEnd = Selection.getSelectionEnd(charSequence);
        if (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) {
            charSequence = charSequence.toString();
        }
        extractedText.text = charSequence;
        return extractedText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        super.closeConnection();
        this.f6129d.e(this);
        while (this.f6139n > 0) {
            endBatchEdit();
            this.f6139n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
        ClipDescription description;
        Uri contentUri;
        ClipDescription description2;
        int i4;
        if (Build.VERSION.SDK_INT >= 25 && (i3 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                description = inputContentInfo.getDescription();
                if (description.getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    contentUri = inputContentInfo.getContentUri();
                    description2 = inputContentInfo.getDescription();
                    String mimeType = description2.getMimeType(0);
                    Context context = this.f6126a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    try {
                                        i4 = openInputStream.read(bArr);
                                    } catch (IOException unused) {
                                        i4 = -1;
                                    }
                                    if (i4 == -1) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("mimeType", mimeType);
                                        hashMap.put("data", byteArray);
                                        hashMap.put("uri", contentUri.toString());
                                        B1.a aVar = this.f6128c;
                                        aVar.getClass();
                                        ((r) aVar.f50n).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(this.f6127b), "TextInputAction.commitContent", hashMap), null);
                                        inputContentInfo.releasePermission();
                                        return true;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i4);
                                }
                            }
                        } catch (FileNotFoundException unused2) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused3) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x003f A[EDGE_INSN: B:195:0x003f->B:18:0x003f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01af A[EDGE_INSN: B:201:0x01af->B:107:0x01af ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.b.d(boolean, boolean):boolean");
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i3, int i4) {
        e eVar = this.f6129d;
        eVar.getClass();
        if (Selection.getSelectionStart(eVar) == -1) {
            return true;
        }
        return super.deleteSurroundingText(i3, i4);
    }

    public final boolean e(boolean z3, boolean z4) {
        e eVar = this.f6129d;
        int selectionStart = Selection.getSelectionStart(eVar);
        int selectionEnd = Selection.getSelectionEnd(eVar);
        boolean z5 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z4) {
            z5 = true;
        }
        beginBatchEdit();
        DynamicLayout dynamicLayout = this.f6136k;
        if (z5) {
            if (z3) {
                Selection.moveUp(eVar, dynamicLayout);
            } else {
                Selection.moveDown(eVar, dynamicLayout);
            }
            int selectionStart2 = Selection.getSelectionStart(eVar);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z3) {
                Selection.extendUp(eVar, dynamicLayout);
            } else {
                Selection.extendDown(eVar, dynamicLayout);
            }
            setSelection(Selection.getSelectionStart(eVar), Selection.getSelectionEnd(eVar));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f6139n--;
        this.f6129d.c();
        return endBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f6129d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i3) {
        ExtractedTextRequest extractedTextRequest2;
        boolean z3 = true;
        if ((i3 & 1) == 0) {
            z3 = false;
        }
        if (z3) {
            extractedTextRequest2 = extractedTextRequest;
        } else {
            extractedTextRequest2 = null;
        }
        this.f6131f = extractedTextRequest2;
        return c(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i3) {
        beginBatchEdit();
        boolean z3 = true;
        e eVar = this.f6129d;
        if (i3 == 16908319) {
            setSelection(0, eVar.length());
        } else {
            o oVar = this.f6126a;
            if (i3 == 16908320) {
                int selectionStart = Selection.getSelectionStart(eVar);
                int selectionEnd = Selection.getSelectionEnd(eVar);
                if (selectionStart != selectionEnd) {
                    int min = Math.min(selectionStart, selectionEnd);
                    int max = Math.max(selectionStart, selectionEnd);
                    ((ClipboardManager) oVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", eVar.subSequence(min, max)));
                    eVar.delete(min, max);
                    setSelection(min, min);
                }
            } else if (i3 == 16908321) {
                int selectionStart2 = Selection.getSelectionStart(eVar);
                int selectionEnd2 = Selection.getSelectionEnd(eVar);
                if (selectionStart2 != selectionEnd2) {
                    ((ClipboardManager) oVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", eVar.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
                }
            } else if (i3 == 16908322) {
                ClipData primaryClip = ((ClipboardManager) oVar.getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null) {
                    CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(oVar.getContext());
                    int max2 = Math.max(0, Selection.getSelectionStart(eVar));
                    int max3 = Math.max(0, Selection.getSelectionEnd(eVar));
                    int min2 = Math.min(max2, max3);
                    int max4 = Math.max(max2, max3);
                    if (min2 != max4) {
                        eVar.delete(min2, max4);
                    }
                    eVar.insert(min2, coerceToText);
                    int length = coerceToText.length() + min2;
                    setSelection(length, length);
                }
            } else {
                z3 = false;
            }
        }
        endBatchEdit();
        return z3;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i3) {
        int i4 = this.f6127b;
        B1.a aVar = this.f6128c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                if (i3 != 7) {
                                    aVar.getClass();
                                    ((r) aVar.f50n).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.done"), null);
                                } else {
                                    aVar.getClass();
                                    ((r) aVar.f50n).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.previous"), null);
                                }
                            } else {
                                aVar.getClass();
                                ((r) aVar.f50n).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.next"), null);
                            }
                        } else {
                            aVar.getClass();
                            ((r) aVar.f50n).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.send"), null);
                        }
                    } else {
                        aVar.getClass();
                        ((r) aVar.f50n).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.search"), null);
                    }
                } else {
                    aVar.getClass();
                    ((r) aVar.f50n).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.go"), null);
                }
            } else {
                aVar.getClass();
                ((r) aVar.f50n).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.newline"), null);
            }
        } else {
            aVar.getClass();
            ((r) aVar.f50n).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.unspecified"), null);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        B1.a aVar = this.f6128c;
        aVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        ((r) aVar.f50n).a("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(this.f6127b), hashMap), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i3) {
        boolean z3;
        if ((i3 & 1) != 0) {
            this.f6135j.updateCursorAnchorInfo(this.f6126a, b());
        }
        if ((i3 & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f6132g = z3;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f6138m.g0(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i3) {
        boolean composingText;
        beginBatchEdit();
        if (charSequence.length() == 0) {
            composingText = super.commitText(charSequence, i3);
        } else {
            composingText = super.setComposingText(charSequence, i3);
        }
        endBatchEdit();
        return composingText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i3, int i4) {
        beginBatchEdit();
        boolean selection = super.setSelection(i3, i4);
        endBatchEdit();
        return selection;
    }
}
