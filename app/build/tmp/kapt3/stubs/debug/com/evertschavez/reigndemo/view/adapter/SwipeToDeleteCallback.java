package com.evertschavez.reigndemo.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J=\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0002\u00a2\u0006\u0002\u0010\u001bJ\u001c\u0010\u001c\u001a\u00020\u00062\b\b\u0001\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\u00172\b\b\u0001\u0010\u001f\u001a\u00020 H\u0016JF\u0010\"\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u001f\u001a\u00020 2\u0006\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\'H\u0016J&\u0010(\u001a\u00020\'2\b\b\u0001\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u001f\u001a\u00020 2\b\b\u0001\u0010)\u001a\u00020 H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0004\u00a8\u0006*"}, d2 = {"Lcom/evertschavez/reigndemo/view/adapter/SwipeToDeleteCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "backgroundColor", "", "deleteDrawable", "Landroid/graphics/drawable/Drawable;", "intrinsicHeight", "intrinsicWidth", "mBackground", "Landroid/graphics/drawable/ColorDrawable;", "mClearPaint", "Landroid/graphics/Paint;", "getMContext$app_debug", "()Landroid/content/Context;", "setMContext$app_debug", "clearCanvas", "", "c", "Landroid/graphics/Canvas;", "left", "", "top", "right", "bottom", "(Landroid/graphics/Canvas;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "getMovementFlags", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getSwipeThreshold", "onChildDraw", "dX", "dY", "actionState", "isCurrentlyActive", "", "onMove", "viewHolder1", "app_debug"})
public abstract class SwipeToDeleteCallback extends androidx.recyclerview.widget.ItemTouchHelper.Callback {
    private final android.graphics.Paint mClearPaint = null;
    private final android.graphics.drawable.ColorDrawable mBackground = null;
    private final int backgroundColor = 0;
    private final android.graphics.drawable.Drawable deleteDrawable = null;
    private final int intrinsicWidth = 0;
    private final int intrinsicHeight = 0;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context mContext;
    
    @java.lang.Override()
    public int getMovementFlags(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        return 0;
    }
    
    @java.lang.Override()
    public boolean onMove(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder1) {
        return false;
    }
    
    @java.lang.Override()
    public void onChildDraw(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
    }
    
    private final void clearCanvas(android.graphics.Canvas c, java.lang.Float left, java.lang.Float top, java.lang.Float right, java.lang.Float bottom) {
    }
    
    @java.lang.Override()
    public float getSwipeThreshold(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext$app_debug() {
        return null;
    }
    
    public final void setMContext$app_debug(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public SwipeToDeleteCallback(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
}