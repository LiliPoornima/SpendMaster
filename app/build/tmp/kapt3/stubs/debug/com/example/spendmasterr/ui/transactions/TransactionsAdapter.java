package com.example.spendmasterr.ui.transactions;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0011\u0012B-\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\u00062\n\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/spendmasterr/ui/transactions/TransactionsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/spendmasterr/model/Transaction;", "Lcom/example/spendmasterr/ui/transactions/TransactionsAdapter$TransactionViewHolder;", "onEditClick", "Lkotlin/Function1;", "", "onDeleteClick", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "TransactionDiffCallback", "TransactionViewHolder", "app_debug"})
public final class TransactionsAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.spendmasterr.model.Transaction, com.example.spendmasterr.ui.transactions.TransactionsAdapter.TransactionViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.example.spendmasterr.model.Transaction, kotlin.Unit> onEditClick = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.example.spendmasterr.model.Transaction, kotlin.Unit> onDeleteClick = null;
    
    public TransactionsAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.spendmasterr.model.Transaction, kotlin.Unit> onEditClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.spendmasterr.model.Transaction, kotlin.Unit> onDeleteClick) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.spendmasterr.ui.transactions.TransactionsAdapter.TransactionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.ui.transactions.TransactionsAdapter.TransactionViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/spendmasterr/ui/transactions/TransactionsAdapter$TransactionDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/spendmasterr/model/Transaction;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    static final class TransactionDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.spendmasterr.model.Transaction> {
        
        public TransactionDiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.spendmasterr.model.Transaction oldItem, @org.jetbrains.annotations.NotNull()
        com.example.spendmasterr.model.Transaction newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.spendmasterr.model.Transaction oldItem, @org.jetbrains.annotations.NotNull()
        com.example.spendmasterr.model.Transaction newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/spendmasterr/ui/transactions/TransactionsAdapter$TransactionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/spendmasterr/ui/transactions/TransactionsAdapter;Landroid/view/View;)V", "amountTextView", "Landroid/widget/TextView;", "categoryTextView", "dateTextView", "deleteButton", "Landroid/widget/ImageButton;", "editButton", "titleTextView", "typeIndicator", "bind", "", "transaction", "Lcom/example/spendmasterr/model/Transaction;", "formatAmount", "", "amount", "", "type", "Lcom/example/spendmasterr/model/TransactionType;", "formatDate", "date", "Ljava/util/Date;", "app_debug"})
    public final class TransactionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView titleTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView categoryTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView amountTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView dateTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View typeIndicator = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageButton editButton = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageButton deleteButton = null;
        
        public TransactionViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.spendmasterr.model.Transaction transaction) {
        }
        
        private final java.lang.String formatAmount(double amount, com.example.spendmasterr.model.TransactionType type) {
            return null;
        }
        
        private final java.lang.String formatDate(java.util.Date date) {
            return null;
        }
    }
}