package com.example.spendmasterr.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u000bH\u0002J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\b\u0010\u001c\u001a\u00020\u000bH\u0016J\"\u0010\u001d\u001a\u00020\u001e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016J \u0010!\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u001eH\u0002J\b\u0010#\u001a\u00020\u000bH\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/example/spendmasterr/service/BudgetNotificationService;", "Landroid/app/Service;", "()V", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "notificationManager", "Landroid/app/NotificationManager;", "serviceScope", "Lkotlinx/coroutines/CoroutineScope;", "checkBudgetStatus", "", "createNotification", "Landroid/app/Notification;", "title", "", "message", "isForeground", "", "createNotificationChannels", "formatAmount", "amount", "", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onStartCommand", "", "flags", "startId", "showBudgetAlert", "importance", "startBudgetMonitoring", "Companion", "app_debug"})
public final class BudgetNotificationService extends android.app.Service {
    private final java.util.concurrent.ScheduledExecutorService executor = null;
    private android.app.NotificationManager notificationManager;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope serviceScope = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CHANNEL_ID = "budget_alerts";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ALERT_CHANNEL_ID = "budget_warnings";
    private static final int NOTIFICATION_ID = 1001;
    private static final int FOREGROUND_NOTIFICATION_ID = 1002;
    private static final long CHECK_INTERVAL_HOURS = 6L;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.spendmasterr.service.BudgetNotificationService.Companion Companion = null;
    
    public BudgetNotificationService() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    private final void startBudgetMonitoring() {
    }
    
    private final void checkBudgetStatus() {
    }
    
    private final void createNotificationChannels() {
    }
    
    private final android.app.Notification createNotification(java.lang.String title, java.lang.String message, boolean isForeground) {
        return null;
    }
    
    private final void showBudgetAlert(java.lang.String title, java.lang.String message, int importance) {
    }
    
    private final java.lang.String formatAmount(double amount) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/spendmasterr/service/BudgetNotificationService$Companion;", "", "()V", "ALERT_CHANNEL_ID", "", "CHANNEL_ID", "CHECK_INTERVAL_HOURS", "", "FOREGROUND_NOTIFICATION_ID", "", "NOTIFICATION_ID", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}