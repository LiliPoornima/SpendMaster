package com.example.spendmasterr.data.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/spendmasterr/data/database/BudgetDao;", "", "getBudget", "Lcom/example/spendmasterr/data/database/BudgetEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertOrUpdateBudget", "", "budget", "(Lcom/example/spendmasterr/data/database/BudgetEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface BudgetDao {
    
    @androidx.room.Query(value = "SELECT * FROM budget WHERE id = 1 LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getBudget(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.spendmasterr.data.database.BudgetEntity> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertOrUpdateBudget(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.data.database.BudgetEntity budget, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}