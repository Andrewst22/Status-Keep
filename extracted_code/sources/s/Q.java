package s;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import b.AbstractBinderC0206b;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class Q implements Handler.Callback, ServiceConnection {

    /* renamed from: m  reason: collision with root package name */
    public final Context f9060m;

    /* renamed from: n  reason: collision with root package name */
    public final Handler f9061n;

    /* renamed from: o  reason: collision with root package name */
    public final HashMap f9062o = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    public HashSet f9063p = new HashSet();

    public Q(Context context) {
        this.f9060m = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f9061n = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(P p3) {
        boolean z3;
        ArrayDeque arrayDeque;
        boolean isLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = p3.f9055a;
        if (isLoggable) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + p3.f9058d.size() + " queued tasks");
        }
        if (p3.f9058d.isEmpty()) {
            return;
        }
        if (p3.f9056b) {
            z3 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f9060m;
            boolean bindService = context.bindService(component, this, 33);
            p3.f9056b = bindService;
            if (bindService) {
                p3.f9059e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z3 = p3.f9056b;
        }
        if (z3 && p3.f9057c != null) {
            while (true) {
                arrayDeque = p3.f9058d;
                N n3 = (N) arrayDeque.peek();
                if (n3 == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + n3);
                    }
                    n3.a(p3.f9057c);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + componentName);
                    }
                } catch (RemoteException e2) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e2);
                }
            }
            if (!arrayDeque.isEmpty()) {
                b(p3);
                return;
            }
            return;
        }
        b(p3);
    }

    public final void b(P p3) {
        Handler handler = this.f9061n;
        ComponentName componentName = p3.f9055a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i3 = p3.f9059e;
        int i4 = i3 + 1;
        p3.f9059e = i4;
        if (i4 > 6) {
            StringBuilder sb = new StringBuilder("Giving up on delivering ");
            ArrayDeque arrayDeque = p3.f9058d;
            sb.append(arrayDeque.size());
            sb.append(" tasks to ");
            sb.append(componentName);
            sb.append(" after ");
            sb.append(p3.f9059e);
            sb.append(" retries");
            Log.w("NotifManCompat", sb.toString());
            arrayDeque.clear();
            return;
        }
        int i5 = (1 << i3) * 1000;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Scheduling retry for " + i5 + " ms");
        }
        handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i5);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [b.a, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i3 = message.what;
        b.c cVar = null;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        return false;
                    }
                    P p3 = (P) this.f9062o.get((ComponentName) message.obj);
                    if (p3 != null) {
                        a(p3);
                    }
                    return true;
                }
                P p4 = (P) this.f9062o.get((ComponentName) message.obj);
                if (p4 != null) {
                    if (p4.f9056b) {
                        this.f9060m.unbindService(this);
                        p4.f9056b = false;
                    }
                    p4.f9057c = null;
                }
                return true;
            }
            O o3 = (O) message.obj;
            ComponentName componentName = o3.f9053a;
            IBinder iBinder = o3.f9054b;
            P p5 = (P) this.f9062o.get(componentName);
            if (p5 != null) {
                int i4 = AbstractBinderC0206b.f4507c;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(b.c.f4508a);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof b.c)) {
                        cVar = (b.c) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.f4506c = iBinder;
                        cVar = obj;
                    }
                }
                p5.f9057c = cVar;
                p5.f9059e = 0;
                a(p5);
            }
            return true;
        }
        N n3 = (N) message.obj;
        String string = Settings.Secure.getString(this.f9060m.getContentResolver(), "enabled_notification_listeners");
        synchronized (S.f9064c) {
            if (string != null) {
                try {
                    if (!string.equals(S.f9065d)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet2 = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet2.add(unflattenFromString.getPackageName());
                            }
                        }
                        S.f9066e = hashSet2;
                        S.f9065d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            hashSet = S.f9066e;
        }
        if (!hashSet.equals(this.f9063p)) {
            this.f9063p = hashSet;
            List<ResolveInfo> queryIntentServices = this.f9060m.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet hashSet3 = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                    } else {
                        hashSet3.add(componentName2);
                    }
                }
            }
            Iterator it = hashSet3.iterator();
            while (it.hasNext()) {
                ComponentName componentName3 = (ComponentName) it.next();
                if (!this.f9062o.containsKey(componentName3)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                    }
                    this.f9062o.put(componentName3, new P(componentName3));
                }
            }
            Iterator it2 = this.f9062o.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet3.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    P p6 = (P) entry.getValue();
                    if (p6.f9056b) {
                        this.f9060m.unbindService(this);
                        p6.f9056b = false;
                    }
                    p6.f9057c = null;
                    it2.remove();
                }
            }
        }
        for (P p7 : this.f9062o.values()) {
            p7.f9058d.add(n3);
            a(p7);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f9061n.obtainMessage(1, new O(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f9061n.obtainMessage(2, componentName).sendToTarget();
    }
}
