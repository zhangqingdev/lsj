package com.android.lsj.http.utils;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import com.android.lsj.http.http.cookie.CookieResulte;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/**
 * Created by dianjoy on 2017/3/8.
 */

public class CookieResulteDao extends AbstractDao<CookieResulte, Long> {

    public static final String TABLENAME = "COOKIE_RESULTE";

    /**
     * Properties of entity CookieResulte.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property Url = new Property(1, String.class, "url", false, "URL");
        public final static Property Resulte = new Property(2, String.class, "resulte", false, "RESULTE");
        public final static Property Time = new Property(3, long.class, "time", false, "TIME");
    }


    public CookieResulteDao(DaoConfig config) {
        super(config);
    }

    public CookieResulteDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"COOKIE_RESULTE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: id
                "\"URL\" TEXT," + // 1: url
                "\"RESULTE\" TEXT," + // 2: resulte
                "\"TIME\" INTEGER NOT NULL );"); // 3: time
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"COOKIE_RESULTE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, CookieResulte entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());

        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(2, url);
        }

        String resulte = entity.getResulte();
        if (resulte != null) {
            stmt.bindString(3, resulte);
        }
        stmt.bindLong(4, entity.getTime());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, CookieResulte entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());

        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(2, url);
        }

        String resulte = entity.getResulte();
        if (resulte != null) {
            stmt.bindString(3, resulte);
        }
        stmt.bindLong(4, entity.getTime());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }

    @Override
    public CookieResulte readEntity(Cursor cursor, int offset) {
        CookieResulte entity = new CookieResulte( //
                cursor.getLong(offset + 0), // id
                cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // url
                cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // resulte
                cursor.getLong(offset + 3) // time
        );
        return entity;
    }

    @Override
    public void readEntity(Cursor cursor, CookieResulte entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setUrl(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setResulte(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTime(cursor.getLong(offset + 3));
    }

    @Override
    protected final Long updateKeyAfterInsert(CookieResulte entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }

    @Override
    public Long getKey(CookieResulte entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(CookieResulte entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }

}
