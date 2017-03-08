package com.android.lsj.http.utils;

import com.android.lsj.http.http.cookie.CookieResulte;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import java.util.Map;

/**
 * Created by dianjoy on 2017/3/8.
 */

public class DaoSession extends AbstractDaoSession {

    private final DaoConfig cookieResulteDaoConfig;

    private final CookieResulteDao cookieResulteDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);
        cookieResulteDaoConfig = daoConfigMap.get(CookieResulteDao.class).clone();
        cookieResulteDaoConfig.initIdentityScope(type);
        cookieResulteDao = new CookieResulteDao(cookieResulteDaoConfig, this);
        registerDao(CookieResulte.class, cookieResulteDao);
    }

    public void clear() {
        cookieResulteDaoConfig.clearIdentityScope();
    }


    public CookieResulteDao getCookieResulteDao() {
        return cookieResulteDao;
    }

}
