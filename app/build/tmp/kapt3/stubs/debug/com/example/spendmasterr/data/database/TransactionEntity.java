package com.example.spendmasterr.data.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\nH\u00c6\u0003J\t\u0010#\u001a\u00020\fH\u00c6\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ`\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0002\u0010&J\u0013\u0010\'\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020\u000eH\u00d6\u0001J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013\u00a8\u0006+"}, d2 = {"Lcom/example/spendmasterr/data/database/TransactionEntity;", "", "id", "", "amount", "", "description", "type", "category", "date", "Ljava/util/Date;", "isRecurring", "", "recurringPeriod", "", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;ZLjava/lang/Integer;)V", "getAmount", "()D", "getCategory", "()Ljava/lang/String;", "getDate", "()Ljava/util/Date;", "getDescription", "getId", "()Z", "getRecurringPeriod", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;ZLjava/lang/Integer;)Lcom/example/spendmasterr/data/database/TransactionEntity;", "equals", "other", "hashCode", "toString", "app_debug"})
@androidx.room.Entity(tableName = "transactions")
@androidx.room.TypeConverters(value = {com.example.spendmasterr.data.database.Converters.class})
public final class TransactionEntity {
    @androidx.room.PrimaryKey()
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    private final double amount = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String category = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Date date = null;
    private final boolean isRecurring = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer recurringPeriod = null;
    
    public TransactionEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String id, double amount, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    java.util.Date date, boolean isRecurring, @org.jetbrains.annotations.Nullable()
    java.lang.Integer recurringPeriod) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final double getAmount() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDate() {
        return null;
    }
    
    public final boolean isRecurring() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRecurringPeriod() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component6() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.spendmasterr.data.database.TransactionEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, double amount, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    java.util.Date date, boolean isRecurring, @org.jetbrains.annotations.Nullable()
    java.lang.Integer recurringPeriod) {
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