package com.example.spendmasterr.ui.transaction

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.example.spendmasterr.model.Transaction
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class EditTransactionFragmentArgs(
  public val transaction: Transaction,
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Transaction::class.java)) {
      result.putParcelable("transaction", this.transaction as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Transaction::class.java)) {
      result.putSerializable("transaction", this.transaction as Serializable)
    } else {
      throw UnsupportedOperationException(Transaction::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Transaction::class.java)) {
      result.set("transaction", this.transaction as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Transaction::class.java)) {
      result.set("transaction", this.transaction as Serializable)
    } else {
      throw UnsupportedOperationException(Transaction::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): EditTransactionFragmentArgs {
      bundle.setClassLoader(EditTransactionFragmentArgs::class.java.classLoader)
      val __transaction : Transaction?
      if (bundle.containsKey("transaction")) {
        if (Parcelable::class.java.isAssignableFrom(Transaction::class.java) ||
            Serializable::class.java.isAssignableFrom(Transaction::class.java)) {
          __transaction = bundle.get("transaction") as Transaction?
        } else {
          throw UnsupportedOperationException(Transaction::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__transaction == null) {
          throw IllegalArgumentException("Argument \"transaction\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"transaction\" is missing and does not have an android:defaultValue")
      }
      return EditTransactionFragmentArgs(__transaction)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        EditTransactionFragmentArgs {
      val __transaction : Transaction?
      if (savedStateHandle.contains("transaction")) {
        if (Parcelable::class.java.isAssignableFrom(Transaction::class.java) ||
            Serializable::class.java.isAssignableFrom(Transaction::class.java)) {
          __transaction = savedStateHandle.get<Transaction?>("transaction")
        } else {
          throw UnsupportedOperationException(Transaction::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__transaction == null) {
          throw IllegalArgumentException("Argument \"transaction\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"transaction\" is missing and does not have an android:defaultValue")
      }
      return EditTransactionFragmentArgs(__transaction)
    }
  }
}
