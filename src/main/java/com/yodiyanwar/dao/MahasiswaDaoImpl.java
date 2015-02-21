package com.yodiyanwar.dao;

import com.yodiyanwar.model.Mahasiswa;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Yodi Yanwar
 */
@Repository
public class MahasiswaDaoImpl implements MahasiswaDao{
    
    @Autowired
    private SessionFactory sessionFactory;
    
    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
    
    @Override
    public Mahasiswa getMhs(Integer id){
        Mahasiswa mhs = (Mahasiswa) getCurrentSession().get(Mahasiswa.class, id);
        return mhs;
    }
    
    @Override
    public List<Mahasiswa> getAll(){
        return getCurrentSession().createQuery("from Mahasiswa").list();
    }
    
    @Override
    public void add(Mahasiswa mhs){
        getCurrentSession().save(mhs);
    }
    
    @Override
    public void edit(Mahasiswa mhs){
        Mahasiswa mhsToEdit = getMhs(mhs.getId());
        mhsToEdit.setNpm(mhs.getNpm());
        mhsToEdit.setNama(mhs.getNama());
        mhsToEdit.setJurusan(mhs.getJurusan());
    }
    
    @Override
    public void delete(Integer id){
        Mahasiswa mhs = getMhs(id);
        if(mhs != null){
            getCurrentSession().delete(mhs);
        }
    } 
    
}
