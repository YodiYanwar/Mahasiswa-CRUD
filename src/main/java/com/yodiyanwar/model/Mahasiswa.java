package com.yodiyanwar.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;

/**
 *
 * @author Yodi Yanwar
 */
@Entity
@Table(name = "mahasiswa")
public class Mahasiswa implements Serializable{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "npm")
    private Long npm;

    @Column(name = "nama")
    private String nama;

    @Column(name = "jurusan")
    private String jurusan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getNpm() {
        return npm;
    }

    public void setNpm(Long npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    
}
