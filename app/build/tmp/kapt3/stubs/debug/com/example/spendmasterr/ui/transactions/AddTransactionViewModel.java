package com.example.spendmasterr.ui.transactions;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J.\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/example/spendmasterr/ui/transactions/AddTransactionViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/spendmasterr/data/repository/TransactionRepository;", "(Lcom/example/spendmasterr/data/repository/TransactionRepository;)V", "_saveResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/spendmasterr/ui/transactions/AddTransactionViewModel$SaveResult;", "saveResult", "Landroidx/lifecycle/LiveData;", "getSaveResult", "()Landroidx/lifecycle/LiveData;", "addTransaction", "", "description", "", "amount", "", "category", "type", "Lcom/example/spendmasterr/model/TransactionType;", "date", "Ljava/util/Date;", "SaveResult", "app_debug"})
public final class AddTransactionViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.spendmasterr.data.repository.TransactionRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.spendmasterr.ui.transactions.AddTransactionViewModel.SaveResult> _saveResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.spendmasterr.ui.transactions.AddTransactionViewModel.SaveResult> saveResult = null;
    
    public AddTransactionViewModel(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.data.repository.TransactionRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.spendmasterr.ui.transactions.AddTransactionViewModel.SaveResult> getSaveResult() {
        return null;
    }
    
    public final void addTransaction(@org.jetbrains.annotations.NotNull()
    java.lang.String description, double amount, @org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.model.TransactionType type, @org.jetbrains.annotations.NotNull()
    java.util.Date date) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/spendmasterr/ui/transactions/AddTransactionViewModel$SaveResult;", "", "()V", "Error", "Success", "Lcom/example/spendmasterr/ui/transactions/AddTransactionViewModel$SaveResult$Error;", "Lcom/example/spendmasterr/ui/transactions/AddTransactionViewModel$SaveResult$Success;", "app_debug"})
    public static abstract class SaveResult {
        
        private SaveResult() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/spendmasterr/ui/transactions/AddTransactionViewModel$SaveResult$Error;", "Lcom/example/spendmasterr/ui/transactions/AddTransactionViewModel$SaveResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class Error extends com.example.spendmasterr.ui.transactions.AddTransactionViewModel.SaveResult {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String message = null;
            
            public Error(@org.jetbrains.annotations.NotNull()
            java.lang.String message) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getMessage() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.spendmasterr.ui.transactions.AddTransactionViewModel.SaveResult.Error copy(@org.jetbrains.annotations.NotNull()
            java.lang.String message) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/spendmasterr/ui/transactions/AddTransactionViewModel$SaveResult$Success;", "Lcom/example/spendmasterr/ui/transactions/AddTransactionViewModel$SaveResult;", "()V", "app_debug"})
        public static final class Success extends com.example.spendmasterr.ui.transactions.AddTransactionViewModel.SaveResult {
            @org.jetbrains.annotations.NotNull()
            public static final com.example.spendmasterr.ui.transactions.AddTransactionViewModel.SaveResult.Success INSTANCE = null;
            
            private Success() {
            }
        }
    }
}