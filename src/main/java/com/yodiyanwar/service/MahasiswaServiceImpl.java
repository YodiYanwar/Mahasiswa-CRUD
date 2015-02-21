package com.yodiyanwar.service;

import com.yodiyanwar.dao.MahasiswaDao;
import com.yodiyanwar.model.Mahasiswa;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Yodi Yanwar
 */
@Service
@Transactional
public class MahasiswaServiceImpl implements MahasiswaService {
    
    @Autowired
    private MahasiswaDao mhsDao;
    
    public List<Mahasiswa> getAll(){
        return mhsDao.getAll();
    }
    
    public void add(Mahasiswa mhs){
        mhsDao.add(mhs);
    }
    
    public void edit(Mahasiswa mhs){
        mhsDao.edit(mhs);
    }
    
    public void delete(Integer id){
        mhsDao.delete(id);
    }
    
    public Mahasiswa getMhs(Integer id){
        return mhsDao.getMhs(id);
    }  
}
