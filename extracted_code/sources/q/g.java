package q;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import n2.AbstractC0664g;
/* loaded from: classes.dex */
public abstract class g implements Future {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f8851d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f8852e = Logger.getLogger(g.class.getName());

    /* renamed from: f  reason: collision with root package name */
    public static final AbstractC0664g f8853f;

    /* renamed from: g  reason: collision with root package name */
    public static final Object f8854g;

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f8855a;

    /* renamed from: b  reason: collision with root package name */
    public volatile c f8856b;

    /* renamed from: c  reason: collision with root package name */
    public volatile f f8857c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [n2.g] */
    /* JADX WARN: Type inference failed for: r4v6 */
    static {
        d dVar;
        try {
            th = null;
            dVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
        } catch (Throwable th) {
            th = th;
            dVar = new Object();
        }
        f8853f = dVar;
        if (th != null) {
            f8852e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f8854g = new Object();
    }

    public static void b(g gVar) {
        f fVar;
        c cVar;
        do {
            fVar = gVar.f8857c;
        } while (!f8853f.c(gVar, fVar, f.f8848c));
        while (fVar != null) {
            Thread thread = fVar.f8849a;
            if (thread != null) {
                fVar.f8849a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f8850b;
        }
        do {
            cVar = gVar.f8856b;
        } while (!f8853f.a(gVar, cVar, c.f8841b));
        c cVar2 = null;
        while (cVar != null) {
            c cVar3 = cVar.f8842a;
            cVar.f8842a = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            cVar2 = cVar2.f8842a;
            try {
                throw null;
                break;
            } catch (RuntimeException e2) {
                f8852e.log(Level.SEVERE, "RuntimeException while executing runnable " + ((Object) null) + " with executor null", (Throwable) e2);
            }
        }
    }

    public static Object c(Object obj) {
        if (!(obj instanceof C0742a)) {
            if (!(obj instanceof b)) {
                if (obj == f8854g) {
                    return null;
                }
                return obj;
            }
            ((b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        CancellationException cancellationException = ((C0742a) obj).f8840a;
        CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
        cancellationException2.initCause(cancellationException);
        throw cancellationException2;
    }

    public static Object d(g gVar) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        String valueOf;
        try {
            Object d3 = d(this);
            sb.append("SUCCESS, result=[");
            if (d3 == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(d3);
            }
            sb.append(valueOf);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        C0742a c0742a;
        Object obj = this.f8855a;
        if (obj != null) {
            return false;
        }
        if (f8851d) {
            c0742a = new C0742a(z3, new CancellationException("Future.cancel() was called."));
        } else if (z3) {
            c0742a = C0742a.f8838b;
        } else {
            c0742a = C0742a.f8839c;
        }
        if (!f8853f.b(this, obj, c0742a)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(f fVar) {
        fVar.f8849a = null;
        while (true) {
            f fVar2 = this.f8857c;
            if (fVar2 == f.f8848c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f8850b;
                if (fVar2.f8849a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f8850b = fVar4;
                    if (fVar3.f8849a == null) {
                        break;
                    }
                } else if (!f8853f.c(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        Locale locale;
        long nanos = timeUnit.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.f8855a;
            if (obj != null) {
                return c(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                f fVar = this.f8857c;
                f fVar2 = f.f8848c;
                if (fVar != fVar2) {
                    f fVar3 = new f();
                    do {
                        AbstractC0664g abstractC0664g = f8853f;
                        abstractC0664g.s(fVar3, fVar);
                        if (abstractC0664g.c(this, fVar, fVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f8855a;
                                    if (obj2 != null) {
                                        return c(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    e(fVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            e(fVar3);
                        } else {
                            fVar = this.f8857c;
                        }
                    } while (fVar != fVar2);
                    return c(this.f8855a);
                }
                return c(this.f8855a);
            }
            while (nanos > 0) {
                Object obj3 = this.f8855a;
                if (obj3 != null) {
                    return c(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String gVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j4 = -nanos;
                long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit.toNanos(convert);
                int i3 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z3 = i3 == 0 || nanos2 > 1000;
                if (i3 > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z3) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z3) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + gVar);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8855a instanceof C0742a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.f8855a != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f8855a instanceof C0742a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f8855a;
            if (obj2 != null) {
                return c(obj2);
            }
            f fVar = this.f8857c;
            f fVar2 = f.f8848c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    AbstractC0664g abstractC0664g = f8853f;
                    abstractC0664g.s(fVar3, fVar);
                    if (abstractC0664g.c(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f8855a;
                            } else {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar = this.f8857c;
                } while (fVar != fVar2);
                return c(this.f8855a);
            }
            return c(this.f8855a);
        }
        throw new InterruptedException();
    }
}
