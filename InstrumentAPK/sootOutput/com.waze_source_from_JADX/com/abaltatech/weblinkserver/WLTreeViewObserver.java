package com.abaltatech.weblinkserver;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.abaltatech.mcs.logger.MCSLogger;
import dalvik.annotation.Signature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

@SuppressLint({"NewApi"})
class WLTreeViewObserver implements OnHierarchyChangeListener {
    private static final String TAG = "WLTreeViewObserver";
    private HashSet<View> m_allViews;
    private Field m_fieldViews;
    private Method m_getRootView;
    private Method m_getViewRootNames;
    private ConcurrentLinkedQueue<OnHierarchyChangeListener> m_listeners;
    private Thread m_monitoringThread;
    private ArrayList<View> m_rootViews;
    private WindowManager m_windowManager;
    private Object m_windowManagerGlobal;

    class C04261 extends Thread {
        C04261() throws  {
        }

        public void run() throws  {
            while (!C04261.interrupted()) {
                try {
                    C04261.sleep(1000);
                    WLTreeViewObserver.this.updateViewsHierarchy();
                } catch (InterruptedException e) {
                    return;
                } catch (Exception $r3) {
                    MCSLogger.log(WLTreeViewObserver.TAG, "Updating View hierarchy", $r3);
                }
            }
        }
    }

    private static class SingletonHolder {
        public static final WLTreeViewObserver INSTANCE = new WLTreeViewObserver();

        private SingletonHolder() throws  {
        }
    }

    public java.util.ArrayList<android.view.View> getRootViewsApiLevel16(@dalvik.annotation.Signature({"(I)", "Ljava/util/ArrayList", "<", "Landroid/view/View;", ">;"}) int r15) throws  {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x004f in list []
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:42)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r14 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r14.m_windowManager;
        if (r1 == 0) goto L_0x004b;
    L_0x0009:
        r2 = r14.m_fieldViews;
        if (r2 == 0) goto L_0x004c;
    L_0x000d:
        r2 = r14.m_fieldViews;	 Catch:{ Exception -> 0x0042 }
        r1 = r14.m_windowManager;	 Catch:{ Exception -> 0x0042 }
        r3 = r2.get(r1);	 Catch:{ Exception -> 0x0042 }
        if (r3 == 0) goto L_0x004d;	 Catch:{ Exception -> 0x0042 }
    L_0x0017:
        r4 = r3.getClass();	 Catch:{ Exception -> 0x0042 }
        r5 = r4.isArray();	 Catch:{ Exception -> 0x0042 }
        if (r5 == 0) goto L_0x004e;	 Catch:{ Exception -> 0x0042 }
    L_0x0021:
        r15 = java.lang.reflect.Array.getLength(r3);	 Catch:{ Exception -> 0x0042 }
        r6 = 0;
    L_0x0026:
        if (r6 >= r15) goto L_0x004f;	 Catch:{ Exception -> 0x0042 }
    L_0x0028:
        r7 = java.lang.reflect.Array.get(r3, r6);	 Catch:{ Exception -> 0x0042 }
        if (r7 == 0) goto L_0x003f;
    L_0x002e:
        r5 = r7 instanceof android.view.View;
        if (r5 == 0) goto L_0x003f;	 Catch:{ Exception -> 0x0042 }
    L_0x0032:
        r9 = r7;	 Catch:{ Exception -> 0x0042 }
        r9 = (android.view.View) r9;	 Catch:{ Exception -> 0x0042 }
        r8 = r9;	 Catch:{ Exception -> 0x0042 }
        r10 = r8.getVisibility();	 Catch:{ Exception -> 0x0042 }
        if (r10 != 0) goto L_0x003f;	 Catch:{ Exception -> 0x0042 }
    L_0x003c:
        r0.add(r8);	 Catch:{ Exception -> 0x0042 }
    L_0x003f:
        r6 = r6 + 1;
        goto L_0x0026;
    L_0x0042:
        r11 = move-exception;
        r12 = "WLTreeViewObserver";
        r13 = "Can't find the root views";
        com.abaltatech.mcs.logger.MCSLogger.log(r12, r13, r11);
        return r0;
    L_0x004b:
        return r0;
    L_0x004c:
        return r0;
    L_0x004d:
        return r0;
    L_0x004e:
        return r0;
    L_0x004f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.abaltatech.weblinkserver.WLTreeViewObserver.getRootViewsApiLevel16(int):java.util.ArrayList<android.view.View>");
    }

    public java.util.ArrayList<android.view.View> getRootViewsApiLevel17(@dalvik.annotation.Signature({"(I)", "Ljava/util/ArrayList", "<", "Landroid/view/View;", ">;"}) int r14) throws  {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x004f in list []
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:42)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r13 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r13.m_windowManagerGlobal;
        if (r1 == 0) goto L_0x004b;
    L_0x0009:
        r2 = r13.m_fieldViews;
        if (r2 == 0) goto L_0x004c;
    L_0x000d:
        r2 = r13.m_fieldViews;	 Catch:{ Exception -> 0x0042 }
        r1 = r13.m_windowManagerGlobal;	 Catch:{ Exception -> 0x0042 }
        r1 = r2.get(r1);	 Catch:{ Exception -> 0x0042 }
        if (r1 == 0) goto L_0x004d;	 Catch:{ Exception -> 0x0042 }
    L_0x0017:
        r3 = r1.getClass();	 Catch:{ Exception -> 0x0042 }
        r4 = r3.isArray();	 Catch:{ Exception -> 0x0042 }
        if (r4 == 0) goto L_0x004e;	 Catch:{ Exception -> 0x0042 }
    L_0x0021:
        r14 = java.lang.reflect.Array.getLength(r1);	 Catch:{ Exception -> 0x0042 }
        r5 = 0;
    L_0x0026:
        if (r5 >= r14) goto L_0x004f;	 Catch:{ Exception -> 0x0042 }
    L_0x0028:
        r6 = java.lang.reflect.Array.get(r1, r5);	 Catch:{ Exception -> 0x0042 }
        if (r6 == 0) goto L_0x003f;
    L_0x002e:
        r4 = r6 instanceof android.view.View;
        if (r4 == 0) goto L_0x003f;	 Catch:{ Exception -> 0x0042 }
    L_0x0032:
        r8 = r6;	 Catch:{ Exception -> 0x0042 }
        r8 = (android.view.View) r8;	 Catch:{ Exception -> 0x0042 }
        r7 = r8;	 Catch:{ Exception -> 0x0042 }
        r9 = r7.getVisibility();	 Catch:{ Exception -> 0x0042 }
        if (r9 != 0) goto L_0x003f;	 Catch:{ Exception -> 0x0042 }
    L_0x003c:
        r0.add(r7);	 Catch:{ Exception -> 0x0042 }
    L_0x003f:
        r5 = r5 + 1;
        goto L_0x0026;
    L_0x0042:
        r10 = move-exception;
        r11 = "WLTreeViewObserver";
        r12 = "Can't find the root views";
        com.abaltatech.mcs.logger.MCSLogger.log(r11, r12, r10);
        return r0;
    L_0x004b:
        return r0;
    L_0x004c:
        return r0;
    L_0x004d:
        return r0;
    L_0x004e:
        return r0;
    L_0x004f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.abaltatech.weblinkserver.WLTreeViewObserver.getRootViewsApiLevel17(int):java.util.ArrayList<android.view.View>");
    }

    public java.util.ArrayList<android.view.View> getRootViewsApiLevel18AndUp(@dalvik.annotation.Signature({"(I)", "Ljava/util/ArrayList", "<", "Landroid/view/View;", ">;"}) int r22) throws  {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0070 in list []
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:42)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r21 = this;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r0 = r21;
        r4 = r0.m_getViewRootNames;
        if (r4 == 0) goto L_0x0090;
    L_0x000b:
        r0 = r21;
        r5 = r0.m_windowManagerGlobal;
        if (r5 == 0) goto L_0x0091;
    L_0x0011:
        r0 = r21;
        r4 = r0.m_getRootView;
        if (r4 == 0) goto L_0x0092;
    L_0x0017:
        r0 = r21;	 Catch:{ Exception -> 0x0081 }
        r4 = r0.m_getViewRootNames;	 Catch:{ Exception -> 0x0081 }
        r0 = r21;	 Catch:{ Exception -> 0x0081 }
        r5 = r0.m_windowManagerGlobal;	 Catch:{ Exception -> 0x0081 }
        r6 = 0;	 Catch:{ Exception -> 0x0081 }
        r5 = r4.invoke(r5, r6);	 Catch:{ Exception -> 0x0081 }
        r8 = r5;	 Catch:{ Exception -> 0x0081 }
        r8 = (java.lang.String[]) r8;	 Catch:{ Exception -> 0x0081 }
        r7 = r8;	 Catch:{ Exception -> 0x0081 }
        r7 = (java.lang.String[]) r7;
        r9 = 0;	 Catch:{ Exception -> 0x0081 }
    L_0x002b:
        r10 = r7.length;	 Catch:{ Exception -> 0x0081 }
        if (r9 >= r10) goto L_0x0093;	 Catch:{ Exception -> 0x0081 }
    L_0x002e:
        r11 = r7[r9];	 Catch:{ Exception -> 0x0081 }
        r0 = r21;	 Catch:{ Exception -> 0x0081 }
        r4 = r0.m_getRootView;	 Catch:{ Exception -> 0x0081 }
        r0 = r21;	 Catch:{ Exception -> 0x0081 }
        r5 = r0.m_windowManagerGlobal;	 Catch:{ Exception -> 0x0081 }
        r13 = 1;	 Catch:{ Exception -> 0x0081 }
        r12 = new java.lang.Object[r13];	 Catch:{ Exception -> 0x0081 }
        r13 = 0;	 Catch:{ Exception -> 0x0081 }
        r12[r13] = r11;	 Catch:{ Exception -> 0x0081 }
        r5 = r4.invoke(r5, r12);	 Catch:{ Exception -> 0x0081 }
        r15 = r5;	 Catch:{ Exception -> 0x0081 }
        r15 = (android.view.View) r15;	 Catch:{ Exception -> 0x0081 }
        r14 = r15;	 Catch:{ Exception -> 0x0081 }
        r13 = -1;
        r0 = r22;
        if (r0 != r13) goto L_0x0073;
    L_0x004b:
        r16 = 1;
    L_0x004d:
        if (r16 != 0) goto L_0x0065;
    L_0x004f:
        r10 = android.os.Build.VERSION.SDK_INT;
        r13 = 17;	 Catch:{ Exception -> 0x0081 }
        if (r10 < r13) goto L_0x0079;	 Catch:{ Exception -> 0x0081 }
    L_0x0055:
        r17 = r14.getDisplay();	 Catch:{ Exception -> 0x0081 }
        r0 = r17;	 Catch:{ Exception -> 0x0081 }
        r10 = r0.getDisplayId();	 Catch:{ Exception -> 0x0081 }
        r0 = r22;
        if (r10 != r0) goto L_0x0076;
    L_0x0063:
        r16 = 1;
    L_0x0065:
        if (r16 == 0) goto L_0x0070;	 Catch:{ Exception -> 0x0081 }
    L_0x0067:
        r10 = r14.getVisibility();	 Catch:{ Exception -> 0x0081 }
        if (r10 != 0) goto L_0x0070;	 Catch:{ Exception -> 0x0081 }
    L_0x006d:
        r3.add(r14);	 Catch:{ Exception -> 0x0081 }
    L_0x0070:
        r9 = r9 + 1;
        goto L_0x002b;
    L_0x0073:
        r16 = 0;
        goto L_0x004d;
    L_0x0076:
        r16 = 0;
        goto L_0x0065;
    L_0x0079:
        if (r22 != 0) goto L_0x007e;
    L_0x007b:
        r16 = 1;
    L_0x007d:
        goto L_0x0065;
    L_0x007e:
        r16 = 0;
        goto L_0x007d;
    L_0x0081:
        r18 = move-exception;
        r19 = "WLTreeViewObserver";
        r20 = "Can't find the root views";
        r0 = r19;
        r1 = r20;
        r2 = r18;
        com.abaltatech.mcs.logger.MCSLogger.log(r0, r1, r2);
        return r3;
    L_0x0090:
        return r3;
    L_0x0091:
        return r3;
    L_0x0092:
        return r3;
    L_0x0093:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.abaltatech.weblinkserver.WLTreeViewObserver.getRootViewsApiLevel18AndUp(int):java.util.ArrayList<android.view.View>");
    }

    private WLTreeViewObserver() throws  {
        this.m_listeners = new ConcurrentLinkedQueue();
        int $i0 = VERSION.SDK_INT;
        if ($i0 == 16) {
            initApiLevel16();
        } else if ($i0 == 17) {
            initApiLevel17();
        } else if ($i0 > 17) {
            initApiLevel18AndUp();
        }
    }

    private boolean initApiLevel16() throws  {
        try {
            Class $r2 = Class.forName("android.view.WindowManagerImpl");
            Object $r4 = WLServerApp.getAppContext().getSystemService("window");
            if ($r4 == null) {
                return false;
            }
            Field $r6 = $r4.getClass().getDeclaredField("mWindowManager");
            $r6.setAccessible(true);
            $r4 = $r6.get($r4);
            if ($r4 == null) {
                return false;
            }
            if (!$r2.isAssignableFrom($r4.getClass())) {
                return false;
            }
            this.m_fieldViews = $r2.getDeclaredField("mViews");
            this.m_fieldViews.setAccessible(true);
            this.m_windowManager = (WindowManager) $r4;
            return true;
        } catch (Exception $r1) {
            this.m_fieldViews = null;
            this.m_windowManager = null;
            MCSLogger.log(TAG, "Can't initialize tree view observer", $r1);
            return false;
        }
    }

    private boolean initApiLevel17() throws  {
        try {
            Class $r2 = Class.forName("android.view.WindowManagerGlobal");
            this.m_windowManagerGlobal = $r2.getDeclaredMethod("getInstance", null).invoke(null, null);
            if (this.m_windowManagerGlobal == null) {
                return false;
            }
            this.m_fieldViews = $r2.getDeclaredField("mViews");
            this.m_fieldViews.setAccessible(true);
            return true;
        } catch (Exception $r1) {
            this.m_fieldViews = null;
            this.m_windowManager = null;
            MCSLogger.log(TAG, "Can't initialize tree view observer", $r1);
            return false;
        }
    }

    private boolean initApiLevel18AndUp() throws  {
        try {
            Class $r2 = Class.forName("android.view.WindowManagerGlobal");
            this.m_windowManagerGlobal = $r2.getDeclaredMethod("getInstance", null).invoke(null, null);
            this.m_getViewRootNames = $r2.getDeclaredMethod("getViewRootNames", null);
            this.m_getRootView = $r2.getDeclaredMethod("getRootView", new Class[]{String.class});
            return true;
        } catch (Exception $r1) {
            MCSLogger.log(TAG, "Can't initialize tree view observer", $r1);
            return false;
        }
    }

    public static WLTreeViewObserver getInstance() throws  {
        return SingletonHolder.INSTANCE;
    }

    public void registerOnHierarchyChangeListener(OnHierarchyChangeListener $r1) throws  {
        if ($r1 != null) {
            synchronized (this) {
                if (this.m_allViews != null) {
                    Iterator $r3 = this.m_allViews.iterator();
                    while ($r3.hasNext()) {
                        $r1.onChildViewAdded(null, (View) $r3.next());
                    }
                }
            }
            this.m_listeners.add($r1);
        }
    }

    public void unregisterOnHierarchyChangeListener(OnHierarchyChangeListener $r1) throws  {
        this.m_listeners.remove($r1);
    }

    public synchronized void startMonitoring() throws  {
        if (this.m_monitoringThread == null) {
            this.m_rootViews = new ArrayList();
            this.m_allViews = new HashSet();
            this.m_monitoringThread = new C04261();
            this.m_monitoringThread.start();
        }
    }

    public synchronized void stopMonitoring() throws  {
        if (this.m_monitoringThread != null) {
            this.m_monitoringThread.interrupt();
            this.m_monitoringThread = null;
            this.m_rootViews = null;
            unmonitorAllViews();
            this.m_allViews = null;
        }
    }

    private void unmonitorAllViews() throws  {
        if (this.m_allViews != null) {
            for (Object $r1 : this.m_allViews.toArray()) {
                unmonitorViews((View) $r1);
            }
        }
    }

    public ArrayList<View> getRootViews() throws  {
        return getRootViews(-1);
    }

    public ArrayList<View> getRootViews(@Signature({"(I)", "Ljava/util/ArrayList", "<", "Landroid/view/View;", ">;"}) int $i0) throws  {
        ArrayList $r1;
        int $i1 = VERSION.SDK_INT;
        if ($i1 == 16) {
            $r1 = getRootViewsApiLevel16($i0);
        } else if ($i1 == 17) {
            $r1 = getRootViewsApiLevel17($i0);
        } else if ($i1 > 17) {
            $r1 = getRootViewsApiLevel18AndUp($i0);
        } else {
            $r1 = new ArrayList();
        }
        return reorderViews($r1);
    }

    private ArrayList<View> reorderViews(@Signature({"(", "Ljava/util/ArrayList", "<", "Landroid/view/View;", ">;)", "Ljava/util/ArrayList", "<", "Landroid/view/View;", ">;"}) ArrayList<View> $r1) throws  {
        ArrayList $r2 = new ArrayList($r1.size());
        Iterator $r3 = $r1.iterator();
        while ($r3.hasNext()) {
            View $r5 = (View) $r3.next();
            int $i0 = ((LayoutParams) $r5.getLayoutParams()).type;
            int $i1 = 0;
            Iterator $r8 = $r2.iterator();
            while ($r8.hasNext()) {
                LayoutParams $r7 = (LayoutParams) ((View) $r8.next()).getLayoutParams();
                int $i2 = $r7.type;
                if ($i0 < $i2 && $r7.type < 2000) {
                    break;
                }
                $i1++;
            }
            $r2.add($i1, $r5);
        }
        return $r2;
    }

    private synchronized void updateViewsHierarchy() throws  {
        if (!this.m_listeners.isEmpty()) {
            View $r6;
            ArrayList $r2 = getRootViews();
            Iterator $r4 = this.m_rootViews.iterator();
            while ($r4.hasNext()) {
                $r6 = (View) $r4.next();
                if (!$r2.contains($r6)) {
                    onChildViewRemoved(null, $r6);
                }
            }
            $r4 = $r2.iterator();
            while ($r4.hasNext()) {
                $r6 = (View) $r4.next();
                if (!this.m_rootViews.contains($r6)) {
                    onChildViewAdded(null, $r6);
                }
            }
            this.m_rootViews = $r2;
        }
    }

    private synchronized void monitorViews(View $r1) throws  {
        if ($r1 instanceof ViewGroup) {
            ViewGroup $r2 = (ViewGroup) $r1;
            int $i0 = $r2.getChildCount();
            $r2.setOnHierarchyChangeListener(this);
            for (int $i1 = 0; $i1 < $i0; $i1++) {
                View $r3 = $r2.getChildAt($i1);
                monitorViews($r3);
                onChildViewAdded($r1, $r3);
            }
        }
    }

    private synchronized void unmonitorViews(View $r1) throws  {
        if ($r1 instanceof ViewGroup) {
            ViewGroup $r2 = (ViewGroup) $r1;
            int $i0 = $r2.getChildCount();
            $r2.setOnHierarchyChangeListener(null);
            for (int $i1 = 0; $i1 < $i0; $i1++) {
                View $r3 = $r2.getChildAt($i1);
                unmonitorViews($r3);
                onChildViewRemoved($r1, $r3);
            }
        }
    }

    public synchronized void onChildViewAdded(View $r1, View $r2) throws  {
        if ($r2 != null) {
            if (!(this.m_allViews == null || this.m_allViews.contains($r2))) {
                this.m_allViews.add($r2);
                monitorViews($r2);
                Iterator $r5 = this.m_listeners.iterator();
                while ($r5.hasNext()) {
                    ((OnHierarchyChangeListener) $r5.next()).onChildViewAdded($r1, $r2);
                }
            }
        }
    }

    public synchronized void onChildViewRemoved(View $r1, View $r2) throws  {
        if ($r2 != null) {
            if (this.m_allViews != null && this.m_allViews.contains($r2)) {
                this.m_allViews.remove($r2);
                unmonitorViews($r2);
                Iterator $r5 = this.m_listeners.iterator();
                while ($r5.hasNext()) {
                    ((OnHierarchyChangeListener) $r5.next()).onChildViewRemoved($r1, $r2);
                }
            }
        }
    }
}
