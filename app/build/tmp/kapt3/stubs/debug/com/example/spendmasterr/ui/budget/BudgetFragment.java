package com.example.spendmasterr.ui.budget;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\r\u0018\u0000 02\u00020\u0001:\u00010B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0016J-\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u000e\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\"2\u0006\u0010#\u001a\u00020$H\u0016\u00a2\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u0014H\u0016J\b\u0010\'\u001a\u00020\u0014H\u0002J\b\u0010(\u001a\u00020\u0014H\u0002J\b\u0010)\u001a\u00020\u0014H\u0002J\b\u0010*\u001a\u00020\u0014H\u0002J\b\u0010+\u001a\u00020\u0014H\u0002J\b\u0010,\u001a\u00020\u0014H\u0002J\b\u0010-\u001a\u00020\u0014H\u0002J\b\u0010.\u001a\u00020\u0014H\u0002J\b\u0010/\u001a\u00020\u0014H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/example/spendmasterr/ui/budget/BudgetFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/spendmasterr/databinding/FragmentBudgetBinding;", "binding", "getBinding", "()Lcom/example/spendmasterr/databinding/FragmentBudgetBinding;", "currentCurrencyCode", "", "notificationHelper", "Lcom/example/spendmasterr/util/NotificationHelper;", "viewModel", "Lcom/example/spendmasterr/ui/budget/BudgetViewModel;", "checkNotificationPermission", "", "formatCurrency", "amount", "", "observeViewModel", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "openAppSettings", "saveBudget", "setupBarChart", "setupClickListeners", "setupUI", "showNotificationPermissionDialog", "startBudgetService", "updateBarChart", "updateBudgetProgress", "Companion", "app_debug"})
public final class BudgetFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private com.example.spendmasterr.databinding.FragmentBudgetBinding _binding;
    private com.example.spendmasterr.ui.budget.BudgetViewModel viewModel;
    private com.example.spendmasterr.util.NotificationHelper notificationHelper;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentCurrencyCode = "USD";
    private static final int NOTIFICATION_PERMISSION_REQUEST_CODE = 123;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.spendmasterr.ui.budget.BudgetFragment.Companion Companion = null;
    
    public BudgetFragment() {
        super();
    }
    
    private final com.example.spendmasterr.databinding.FragmentBudgetBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void setupUI() {
    }
    
    private final void setupClickListeners() {
    }
    
    private final void observeViewModel() {
    }
    
    private final void saveBudget() {
    }
    
    private final boolean checkNotificationPermission() {
        return false;
    }
    
    private final void showNotificationPermissionDialog() {
    }
    
    private final void openAppSettings() {
    }
    
    private final void startBudgetService() {
    }
    
    private final void updateBudgetProgress() {
    }
    
    private final void setupBarChart() {
    }
    
    private final void updateBarChart() {
    }
    
    private final java.lang.String formatCurrency(double amount) {
        return null;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/spendmasterr/ui/budget/BudgetFragment$Companion;", "", "()V", "NOTIFICATION_PERMISSION_REQUEST_CODE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}