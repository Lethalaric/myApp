package myapp

import org.grails.datastore.gorm.GormEntity

class Karyawan implements GormEntity<Karyawan> {

    String nama
    String alamat
    String jabatan
    int umur
    int lamaKerja
    List skillsets

    static hasMany = [skillsets: String]

    static constraints = {
    }
}
