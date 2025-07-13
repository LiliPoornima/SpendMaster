package com.example.spendmasterr.data.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CurrencyDao_Impl implements CurrencyDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CurrencyEntity> __insertionAdapterOfCurrencyEntity;

  public CurrencyDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCurrencyEntity = new EntityInsertionAdapter<CurrencyEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `currency` (`id`,`code`) VALUES (?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final CurrencyEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getCode() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getCode());
        }
      }
    };
  }

  @Override
  public Object insertOrUpdateCurrency(final CurrencyEntity currency,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCurrencyEntity.insert(currency);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object getCurrency(final Continuation<? super CurrencyEntity> $completion) {
    final String _sql = "SELECT * FROM currency WHERE id = 1 LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<CurrencyEntity>() {
      @Override
      @Nullable
      public CurrencyEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCode = CursorUtil.getColumnIndexOrThrow(_cursor, "code");
          final CurrencyEntity _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpCode;
            if (_cursor.isNull(_cursorIndexOfCode)) {
              _tmpCode = null;
            } else {
              _tmpCode = _cursor.getString(_cursorIndexOfCode);
            }
            _result = new CurrencyEntity(_tmpId,_tmpCode);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
