package com.example.spendmasterr.ui.transactions

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.spendmasterr.R
import com.example.spendmasterr.model.Transaction
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class TransactionsFragmentDirections private constructor() {
  private data class ActionNavigationTransactionsToEditTransactionFragment(
    public val transaction: Transaction,
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_navigation_transactions_to_editTransactionFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  public companion object {
    public fun actionNavigationTransactionsToAddTransactionFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_navigation_transactions_to_addTransactionFragment)

    public fun actionNavigationTransactionsToEditTransactionFragment(transaction: Transaction):
        NavDirections = ActionNavigationTransactionsToEditTransactionFragment(transaction)
  }
}
