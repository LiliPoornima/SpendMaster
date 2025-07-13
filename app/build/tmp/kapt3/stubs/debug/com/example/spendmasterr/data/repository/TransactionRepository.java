package com.example.spendmasterr.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\fJ&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0015J\"\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\f\u0010\u0019\u001a\u00020\u001a*\u00020\bH\u0002J\f\u0010\u001b\u001a\u00020\b*\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/spendmasterr/data/repository/TransactionRepository;", "", "transactionDao", "Lcom/example/spendmasterr/data/database/TransactionDao;", "(Lcom/example/spendmasterr/data/database/TransactionDao;)V", "addTransaction", "", "transaction", "Lcom/example/spendmasterr/model/Transaction;", "(Lcom/example/spendmasterr/model/Transaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTransaction", "getAllTransactions", "Lkotlinx/coroutines/flow/Flow;", "", "getTotalAmountByTypeAndDateRange", "", "type", "Lcom/example/spendmasterr/model/TransactionType;", "startDate", "Ljava/util/Date;", "endDate", "(Lcom/example/spendmasterr/model/TransactionType;Ljava/util/Date;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTransactionsBetweenDates", "getTransactionsByType", "updateTransaction", "toEntity", "Lcom/example/spendmasterr/data/database/TransactionEntity;", "toTransaction", "app_debug"})
public final class TransactionRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.spendmasterr.data.database.TransactionDao transactionDao = null;
    
    public TransactionRepository(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.data.database.TransactionDao transactionDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.spendmasterr.model.Transaction>> getAllTransactions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.spendmasterr.model.Transaction>> getTransactionsByType(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.model.TransactionType type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.spendmasterr.model.Transaction>> getTransactionsBetweenDates(@org.jetbrains.annotations.NotNull()
    java.util.Date startDate, @org.jetbrains.annotations.NotNull()
    java.util.Date endDate) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTotalAmountByTypeAndDateRange(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.model.TransactionType type, @org.jetbrains.annotations.NotNull()
    java.util.Date startDate, @org.jetbrains.annotations.NotNull()
    java.util.Date endDate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Double> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addTransaction(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.model.Transaction transaction, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateTransaction(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.model.Transaction transaction, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteTransaction(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.model.Transaction transaction, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final com.example.spendmasterr.model.Transaction toTransaction(com.example.spendmasterr.data.database.TransactionEntity $this$toTransaction) {
        return null;
    }
    
    private final com.example.spendmasterr.data.database.TransactionEntity toEntity(com.example.spendmasterr.model.Transaction $this$toEntity) {
        return null;
    }
}