package com.example.spendmasterr.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/spendmasterr/adapter/OnboardingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/spendmasterr/adapter/OnboardingAdapter$OnboardingViewHolder;", "onboardingScreens", "", "Lcom/example/spendmasterr/model/OnboardingScreen;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnboardingViewHolder", "app_debug"})
public final class OnboardingAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.spendmasterr.adapter.OnboardingAdapter.OnboardingViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.spendmasterr.model.OnboardingScreen> onboardingScreens = null;
    
    public OnboardingAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.spendmasterr.model.OnboardingScreen> onboardingScreens) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.spendmasterr.adapter.OnboardingAdapter.OnboardingViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.spendmasterr.adapter.OnboardingAdapter.OnboardingViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/spendmasterr/adapter/OnboardingAdapter$OnboardingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/spendmasterr/adapter/OnboardingAdapter;Landroid/view/View;)V", "imageOnboarding", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "textDescription", "Landroid/widget/TextView;", "textTitle", "bind", "", "onboardingScreen", "Lcom/example/spendmasterr/model/OnboardingScreen;", "app_debug"})
    public final class OnboardingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView imageOnboarding = null;
        private final android.widget.TextView textTitle = null;
        private final android.widget.TextView textDescription = null;
        
        public OnboardingViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.spendmasterr.model.OnboardingScreen onboardingScreen) {
        }
    }
}