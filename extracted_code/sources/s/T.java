package s;

import android.app.Person;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;
/* loaded from: classes.dex */
public abstract class T {
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, s.U] */
    public static U a(Person person) {
        IconCompat iconCompat;
        CharSequence name = person.getName();
        if (person.getIcon() != null) {
            iconCompat = IconCompat.b(person.getIcon());
        } else {
            iconCompat = null;
        }
        String uri = person.getUri();
        String key = person.getKey();
        boolean isBot = person.isBot();
        boolean isImportant = person.isImportant();
        ?? obj = new Object();
        obj.f9071a = name;
        obj.f9072b = iconCompat;
        obj.f9073c = uri;
        obj.f9074d = key;
        obj.f9075e = isBot;
        obj.f9076f = isImportant;
        return obj;
    }

    public static Person b(U u3) {
        Person.Builder name = new Person.Builder().setName(u3.f9071a);
        Icon icon = null;
        IconCompat iconCompat = u3.f9072b;
        if (iconCompat != null) {
            icon = iconCompat.k(null);
        }
        return name.setIcon(icon).setUri(u3.f9073c).setKey(u3.f9074d).setBot(u3.f9075e).setImportant(u3.f9076f).build();
    }
}
