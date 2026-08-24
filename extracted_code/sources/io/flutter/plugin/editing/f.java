package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import e0.C0262c;
import h2.C0286a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
/* loaded from: classes.dex */
public final class f implements SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a  reason: collision with root package name */
    public final C0262c f6152a;

    /* renamed from: b  reason: collision with root package name */
    public final TextServicesManager f6153b;

    /* renamed from: c  reason: collision with root package name */
    public SpellCheckerSession f6154c;

    /* renamed from: d  reason: collision with root package name */
    public R1.f f6155d;

    public f(TextServicesManager textServicesManager, C0262c c0262c) {
        this.f6153b = textServicesManager;
        this.f6152a = c0262c;
        c0262c.f5225n = this;
    }

    public final void a(String str, String str2, R1.f fVar) {
        if (this.f6155d != null) {
            fVar.a("error", "Previous spell check request still pending.", null);
            return;
        }
        this.f6155d = fVar;
        Locale a3 = C0286a.a(str);
        if (this.f6154c == null) {
            this.f6154c = this.f6153b.newSpellCheckerSession(null, a3, this, true);
        }
        this.f6154c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f6155d.b(new ArrayList());
            this.f6155d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f6155d.b(new ArrayList());
            this.f6155d = null;
            return;
        }
        for (int i3 = 0; i3 < sentenceSuggestionsInfo.getSuggestionsCount(); i3++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i3);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap hashMap = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i3);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i3) + offsetAt;
                hashMap.put("startIndex", Integer.valueOf(offsetAt));
                hashMap.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z3 = false;
                for (int i4 = 0; i4 < suggestionsCount; i4++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i4);
                    if (!suggestionAt.equals("")) {
                        arrayList2.add(suggestionAt);
                        z3 = true;
                    }
                }
                if (z3) {
                    hashMap.put("suggestions", arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.f6155d.b(arrayList);
        this.f6155d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
