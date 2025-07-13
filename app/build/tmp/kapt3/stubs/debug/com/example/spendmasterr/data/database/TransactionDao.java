package com.example.spendmasterr.data.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\fH\'J(\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u00a7@\u00a2\u0006\u0002\u0010\u0014J$\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\'J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\f2\u0006\u0010\u0010\u001a\u00020\tH\'J\u0016\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0019"}, d2 = {"Lcom/example/spendmasterr/data/database/TransactionDao;", "", "deleteTransaction", "", "transaction", "Lcom/example/spendmasterr/data/database/TransactionEntity;", "(Lcom/example/spendmasterr/data/database/TransactionEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTransactionById", "transactionId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTransactions", "Lkotlinx/coroutines/flow/Flow;", "", "getTotalAmountByTypeAndDateRange", "", "type", "startDate", "", "endDate", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTransactionsBetweenDates", "getTransactionsByType", "insertTransaction", "updateTransaction", "app_debug"})
@androidx.room.Dao()
public abstract interface TransactionDao {
    
    @androidx.room.Query(value = "SELECT * FROM transactions ORDER BY date DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.spendmasterr.data.database.TransactionEntity>> getAllTransactions();
    
    @androidx.room.Query(value = "SELECT * FROM transactions WHERE type = :type ORDER BY date DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.spendmasterr.data.database.TransactionEntity>> getTransactionsByType(@org.jetbrains.annotations.NotNull()
    java.lang.String type);
    
    @androidx.room.Query(value = "SELECT * FROM transactions WHERE date BETWEEN :startDate AND :endDate ORDER BY date DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.spendmasterr.data.database.TransactionEntity>> getTransactionsBetweenDates(long startDate, long endDate);
    
    @androidx.room.Query(value = "SELECT SUM(amount) FROM transactions WHERE type = :type AND date BETWEEN :startDate AND :endDate")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTotalAmountByTypeAndDateRange(@org.jetbrains.annotations.NotNull()
    java.lang.String type, long startDate, long endDate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Double> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertTransaction(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.data.database.TransactionEntity transaction, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateTransaction(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.data.database.TransactionEntity transaction, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteTransaction(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.data.database.TransactionEntity transaction, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM transactions WHERE id = :transactionId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteTransactionById(@org.jetbrains.annotations.NotNull()
    java.lang.String transactionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}