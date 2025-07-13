package com.example.spendmasterr.ui.settings;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/spendmasterr/ui/settings/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/spendmasterr/data/repository/CurrencyRepository;", "(Lcom/example/spendmasterr/data/repository/CurrencyRepository;)V", "_currency", "Landroidx/lifecycle/MutableLiveData;", "", "currency", "Landroidx/lifecycle/LiveData;", "getCurrency", "()Landroidx/lifecycle/LiveData;", "loadCurrency", "", "setSelectedCurrency", "updateCurrency", "newCurrency", "app_debug"})
public final class SettingsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.spendmasterr.data.repository.CurrencyRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _currency = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> currency = null;
    
    public SettingsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.data.repository.CurrencyRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getCurrency() {
        return null;
    }
    
    private final void loadCurrency() {
    }
    
    public final void updateCurrency(@org.jetbrains.annotations.NotNull()
    java.lang.String newCurrency) {
    }
    
    public final void setSelectedCurrency(@org.jetbrains.annotations.NotNull()
    java.lang.String currency) {
    }
}