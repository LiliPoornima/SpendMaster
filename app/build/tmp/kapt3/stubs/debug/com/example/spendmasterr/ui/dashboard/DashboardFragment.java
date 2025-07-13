package com.example.spendmasterr.ui.dashboard;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0017H\u0016J\b\u0010!\u001a\u00020\u0017H\u0016J\u001a\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010$\u001a\u00020\u0017H\u0002J\b\u0010%\u001a\u00020\u0017H\u0002J\b\u0010&\u001a\u00020\u0017H\u0002J\b\u0010\'\u001a\u00020\u0017H\u0002J\b\u0010(\u001a\u00020\u0017H\u0002J\u0016\u0010)\u001a\u00020\u00172\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0014H\u0002J\u001c\u0010,\u001a\u00020\u00172\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120.H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/example/spendmasterr/ui/dashboard/DashboardFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/spendmasterr/databinding/FragmentDashboardBinding;", "binding", "getBinding", "()Lcom/example/spendmasterr/databinding/FragmentDashboardBinding;", "currentCurrencyCode", "", "dateFormat", "Ljava/text/SimpleDateFormat;", "sharedCurrencyViewModel", "Lcom/example/spendmasterr/viewmodel/SharedCurrencyViewModel;", "viewModel", "Lcom/example/spendmasterr/ui/dashboard/DashboardViewModel;", "formatCurrency", "amount", "", "getChartColors", "", "", "observeViewModel", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onResume", "onViewCreated", "view", "setupLineCharts", "setupPieChart", "setupUI", "setupViewModel", "updateAllCurrencyUI", "updateLineCharts", "transactions", "Lcom/example/spendmasterr/model/Transaction;", "updatePieChart", "spending", "", "app_debug"})
public final class DashboardFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private com.example.spendmasterr.databinding.FragmentDashboardBinding _binding;
    private com.example.spendmasterr.ui.dashboard.DashboardViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private final java.text.SimpleDateFormat dateFormat = null;
    private com.example.spendmasterr.viewmodel.SharedCurrencyViewModel sharedCurrencyViewModel;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentCurrencyCode = "USD";
    
    public DashboardFragment() {
        super();
    }
    
    private final com.example.spendmasterr.databinding.FragmentDashboardBinding getBinding() {
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
    
    private final void setupViewModel() {
    }
    
    private final void setupUI() {
    }
    
    private final void setupPieChart() {
    }
    
    private final void setupLineCharts() {
    }
    
    private final void observeViewModel() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final java.lang.String formatCurrency(double amount) {
        return null;
    }
    
    private final void updatePieChart(java.util.Map<java.lang.String, java.lang.Double> spending) {
    }
    
    private final void updateLineCharts(java.util.List<com.example.spendmasterr.model.Transaction> transactions) {
    }
    
    private final java.util.List<java.lang.Integer> getChartColors() {
        return null;
    }
    
    private final void updateAllCurrencyUI() {
    }
}