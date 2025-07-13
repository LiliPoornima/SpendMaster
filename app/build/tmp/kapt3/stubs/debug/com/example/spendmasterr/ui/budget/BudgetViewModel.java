package com.example.spendmasterr.ui.budget;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001dB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0016\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@\u00a2\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\u000e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\tR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/spendmasterr/ui/budget/BudgetViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/spendmasterr/data/repository/BudgetRepository;", "currencyRepository", "Lcom/example/spendmasterr/data/repository/CurrencyRepository;", "(Lcom/example/spendmasterr/data/repository/BudgetRepository;Lcom/example/spendmasterr/data/repository/CurrencyRepository;)V", "_budget", "Landroidx/lifecycle/MutableLiveData;", "", "_currencyCode", "", "budget", "Landroidx/lifecycle/LiveData;", "getBudget", "()Landroidx/lifecycle/LiveData;", "currencyCode", "getCurrencyCode", "formatCurrency", "amount", "getMonthlyExpenses", "transactionRepository", "Lcom/example/spendmasterr/data/repository/TransactionRepository;", "(Lcom/example/spendmasterr/data/repository/TransactionRepository;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBudget", "", "loadCurrency", "updateBudget", "newBudget", "Factory", "app_debug"})
public final class BudgetViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.spendmasterr.data.repository.BudgetRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.spendmasterr.data.repository.CurrencyRepository currencyRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Double> _budget = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Double> budget = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _currencyCode = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> currencyCode = null;
    
    public BudgetViewModel(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.data.repository.BudgetRepository repository, @org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.data.repository.CurrencyRepository currencyRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Double> getBudget() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getCurrencyCode() {
        return null;
    }
    
    private final void loadBudget() {
    }
    
    private final void loadCurrency() {
    }
    
    public final void updateBudget(double newBudget) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMonthlyExpenses(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.data.repository.TransactionRepository transactionRepository, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Double> $completion) {
        return null;
    }
    
    private final java.lang.String formatCurrency(double amount) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/spendmasterr/ui/budget/BudgetViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "repository", "Lcom/example/spendmasterr/data/repository/BudgetRepository;", "currencyRepository", "Lcom/example/spendmasterr/data/repository/CurrencyRepository;", "(Lcom/example/spendmasterr/data/repository/BudgetRepository;Lcom/example/spendmasterr/data/repository/CurrencyRepository;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        @org.jetbrains.annotations.NotNull()
        private final com.example.spendmasterr.data.repository.BudgetRepository repository = null;
        @org.jetbrains.annotations.NotNull()
        private final com.example.spendmasterr.data.repository.CurrencyRepository currencyRepository = null;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        com.example.spendmasterr.data.repository.BudgetRepository repository, @org.jetbrains.annotations.NotNull()
        com.example.spendmasterr.data.repository.CurrencyRepository currencyRepository) {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}