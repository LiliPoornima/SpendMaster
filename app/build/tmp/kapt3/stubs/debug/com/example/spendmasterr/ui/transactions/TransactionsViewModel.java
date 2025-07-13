package com.example.spendmasterr.ui.transactions;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\tJ\u0006\u0010\u0015\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lcom/example/spendmasterr/ui/transactions/TransactionsViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/spendmasterr/data/repository/TransactionRepository;", "context", "Landroid/content/Context;", "(Lcom/example/spendmasterr/data/repository/TransactionRepository;Landroid/content/Context;)V", "_transactions", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/spendmasterr/model/Transaction;", "transactions", "Landroidx/lifecycle/LiveData;", "getTransactions", "()Landroidx/lifecycle/LiveData;", "addTransaction", "", "transaction", "deleteTransaction", "getCategories", "", "loadTransactions", "updateTransaction", "app_debug"})
public final class TransactionsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.spendmasterr.data.repository.TransactionRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.spendmasterr.model.Transaction>> _transactions = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.spendmasterr.model.Transaction>> transactions = null;
    
    public TransactionsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.data.repository.TransactionRepository repository, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.spendmasterr.model.Transaction>> getTransactions() {
        return null;
    }
    
    public final void loadTransactions() {
    }
    
    public final void addTransaction(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.model.Transaction transaction) {
    }
    
    public final void updateTransaction(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.model.Transaction transaction) {
    }
    
    public final void deleteTransaction(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.model.Transaction transaction) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCategories() {
        return null;
    }
}