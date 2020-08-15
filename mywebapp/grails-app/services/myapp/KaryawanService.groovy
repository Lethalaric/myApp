package myapp

import grails.gorm.transactions.Transactional

@Transactional
class KaryawanService {

    def serviceMethod() {

    }

    def get(id){
        Karyawan.get(id)
    }

    def list() {
        Karyawan.list()
    }

    def save(karyawan){
        karyawan.save()
    }

    def delete(id){
        Karyawan.get(id).delete()
    }
}
