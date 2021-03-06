package com.yodiyanwar.dao;

import com.yodiyanwar.model.Mahasiswa;
import java.util.List;

/**
 *
 * @author Yodi Yanwar
 */
public interface MahasiswaDao {
    
    public List<Mahasiswa> getAll();
    public void add(Mahasiswa mhs);
    public void edit(Mahasiswa mhs);
    public void delete(Integer id);
    public Mahasiswa getMhs(Integer id);
    
}
