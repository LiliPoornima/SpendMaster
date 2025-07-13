package com.example.spendmasterr;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/spendmasterr/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/spendmasterr/databinding/ActivityMainBinding;", "navController", "Landroidx/navigation/NavController;", "createNotificationChannel", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "setupNavigation", "Companion", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.spendmasterr.databinding.ActivityMainBinding binding;
    private androidx.navigation.NavController navController;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANNEL_ID = "budget_alerts_channel";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.spendmasterr.MainActivity.Companion Companion = null;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void createNotificationChannel() {
    }
    
    private final void setupNavigation() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/spendmasterr/MainActivity$Companion;", "", "()V", "CHANNEL_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}