package com.example.spendmasterr.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00020\fH\u0082@\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fJ\u0016\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\u0013J\u0016\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/spendmasterr/util/NotificationHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "budgetNotificationManager", "Lcom/example/spendmasterr/notification/BudgetNotificationManager;", "createNotificationChannel", "", "formatCurrency", "", "amount", "", "getMonthlyExpenses", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showBudgetAlert", "monthlyBudget", "monthlyExpenses", "showBudgetNotification", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "title", "message", "Companion", "app_debug"})
public final class NotificationHelper {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANNEL_ID = "budget_alerts_test";
    public static final int NOTIFICATION_ID = 1;
    @org.jetbrains.annotations.NotNull()
    private final com.example.spendmasterr.notification.BudgetNotificationManager budgetNotificationManager = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.spendmasterr.util.NotificationHelper.Companion Companion = null;
    
    public NotificationHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final void createNotificationChannel() {
    }
    
    /**
     * Call this from a coroutine or background thread.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object showBudgetNotification(double monthlyBudget, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object getMonthlyExpenses(kotlin.coroutines.Continuation<? super java.lang.Double> $completion) {
        return null;
    }
    
    public final void showBudgetAlert(double monthlyBudget, double monthlyExpenses) {
    }
    
    public final void showBudgetNotification(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    private final java.lang.String formatCurrency(double amount) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/spendmasterr/util/NotificationHelper$Companion;", "", "()V", "CHANNEL_ID", "", "NOTIFICATION_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}