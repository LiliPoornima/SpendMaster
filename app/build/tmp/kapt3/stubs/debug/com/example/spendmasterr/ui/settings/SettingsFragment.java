package com.example.spendmasterr.ui.settings;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u001a\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u000eH\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u0015H\u0016J\u001a\u0010\'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010)\u001a\u00020\u0015H\u0002J\b\u0010*\u001a\u00020\u0015H\u0002J\b\u0010+\u001a\u00020\u0015H\u0002J\u0018\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u000eH\u0002J\b\u0010/\u001a\u00020\u0015H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/example/spendmasterr/ui/settings/SettingsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/spendmasterr/databinding/FragmentSettingsBinding;", "binding", "getBinding", "()Lcom/example/spendmasterr/databinding/FragmentSettingsBinding;", "exportManager", "Lcom/example/spendmasterr/util/ExportManager;", "notificationHelper", "Lcom/example/spendmasterr/util/NotificationHelper;", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "sharedCurrencyViewModel", "Lcom/example/spendmasterr/viewmodel/SharedCurrencyViewModel;", "viewModel", "Lcom/example/spendmasterr/ui/settings/SettingsViewModel;", "checkAndNotifyBudgetUsage", "", "monthlyBudget", "", "monthlyExpenses", "checkStoragePermissionAndExport", "formatCurrency", "amount", "currencyCode", "observeViewModel", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "performExport", "setupClickListeners", "setupUI", "showBudgetNotification", "title", "message", "showStoragePermissionDialog", "app_debug"})
public final class SettingsFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private com.example.spendmasterr.databinding.FragmentSettingsBinding _binding;
    private com.example.spendmasterr.ui.settings.SettingsViewModel viewModel;
    private com.example.spendmasterr.util.ExportManager exportManager;
    private com.example.spendmasterr.viewmodel.SharedCurrencyViewModel sharedCurrencyViewModel;
    private com.example.spendmasterr.util.NotificationHelper notificationHelper;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionLauncher = null;
    
    public SettingsFragment() {
        super();
    }
    
    private final com.example.spendmasterr.databinding.FragmentSettingsBinding getBinding() {
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupUI() {
    }
    
    private final void setupClickListeners() {
    }
    
    private final void checkStoragePermissionAndExport() {
    }
    
    private final void showStoragePermissionDialog() {
    }
    
    private final void performExport() {
    }
    
    private final void observeViewModel() {
    }
    
    private final void checkAndNotifyBudgetUsage(double monthlyBudget, double monthlyExpenses) {
    }
    
    private final void showBudgetNotification(java.lang.String title, java.lang.String message) {
    }
    
    private final java.lang.String formatCurrency(double amount, java.lang.String currencyCode) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}