package com.em.earthquakemonitor.greendao;

import com.em.earthquakemonitor.greendao.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table EARTHQUAKES.
 */
public class Earthquakes {

    private Long id;
    private String QId;
    private String QPlace;
    private String QUrl;
    private String Qtitle;
    private Float QMagnitude;
    private String QDetails;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient EarthquakesDao myDao;


    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Earthquakes() {
    }

    public Earthquakes(Long id) {
        this.id = id;
    }

    public Earthquakes(Long id, String QId, String QPlace, String QUrl, String Qtitle, Float QMagnitude, String QDetails) {
        this.id = id;
        this.QId = QId;
        this.QPlace = QPlace;
        this.QUrl = QUrl;
        this.Qtitle = Qtitle;
        this.QMagnitude = QMagnitude;
        this.QDetails = QDetails;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getEarthquakesDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQId() {
        return QId;
    }

    public void setQId(String QId) {
        this.QId = QId;
    }

    public String getQPlace() {
        return QPlace;
    }

    public void setQPlace(String QPlace) {
        this.QPlace = QPlace;
    }

    public String getQUrl() {
        return QUrl;
    }

    public void setQUrl(String QUrl) {
        this.QUrl = QUrl;
    }

    public String getQtitle() {
        return Qtitle;
    }

    public void setQtitle(String Qtitle) {
        this.Qtitle = Qtitle;
    }

    public Float getQMagnitude() {
        return QMagnitude;
    }

    public void setQMagnitude(Float QMagnitude) {
        this.QMagnitude = QMagnitude;
    }

    public String getQDetails() {
        return QDetails;
    }

    public void setQDetails(String QDetails) {
        this.QDetails = QDetails;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}