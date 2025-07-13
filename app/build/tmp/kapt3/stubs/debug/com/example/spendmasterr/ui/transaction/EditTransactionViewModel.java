package com.example.spendmasterr.ui.transaction;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u00a2\u0006\u0002\u0010\bJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/example/spendmasterr/ui/transaction/EditTransactionViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/spendmasterr/data/repository/TransactionRepository;", "categoriesProvider", "Lkotlin/Function0;", "", "", "(Lcom/example/spendmasterr/data/repository/TransactionRepository;Lkotlin/jvm/functions/Function0;)V", "_updateResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/spendmasterr/data/Result;", "", "updateResult", "Landroidx/lifecycle/LiveData;", "getUpdateResult", "()Landroidx/lifecycle/LiveData;", "getCategories", "updateTransaction", "transaction", "Lcom/example/spendmasterr/model/Transaction;", "app_debug"})
public final class EditTransactionViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.spendmasterr.data.repository.TransactionRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<java.util.List<java.lang.String>> categoriesProvider = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.spendmasterr.data.Result<kotlin.Unit>> _updateResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.spendmasterr.data.Result<kotlin.Unit>> updateResult = null;
    
    public EditTransactionViewModel(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.data.repository.TransactionRepository repository, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends java.util.List<java.lang.String>> categoriesProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.spendmasterr.data.Result<kotlin.Unit>> getUpdateResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCategories() {
        return null;
    }
    
    public final void updateTransaction(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.model.Transaction transaction) {
    }
}