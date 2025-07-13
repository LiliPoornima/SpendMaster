package com.example.spendmasterr.ui.transaction;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lcom/example/spendmasterr/ui/transaction/AddTransactionViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/spendmasterr/data/repository/TransactionRepository;", "(Lcom/example/spendmasterr/data/repository/TransactionRepository;)V", "_saveResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/spendmasterr/data/Result;", "", "saveResult", "Landroidx/lifecycle/LiveData;", "getSaveResult", "()Landroidx/lifecycle/LiveData;", "addTransaction", "transaction", "Lcom/example/spendmasterr/model/Transaction;", "app_debug"})
public final class AddTransactionViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.spendmasterr.data.repository.TransactionRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.spendmasterr.data.Result<kotlin.Unit>> _saveResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.spendmasterr.data.Result<kotlin.Unit>> saveResult = null;
    
    public AddTransactionViewModel(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.data.repository.TransactionRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.spendmasterr.data.Result<kotlin.Unit>> getSaveResult() {
        return null;
    }
    
    public final void addTransaction(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.model.Transaction transaction) {
    }
}