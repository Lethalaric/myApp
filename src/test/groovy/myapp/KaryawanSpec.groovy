package myapp

import grails.test.hibernate.HibernateSpec
import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class KaryawanSpec extends HibernateSpec {

    def setup() {
        Karyawan karyawan = new Karyawan(
                nama: 'haris test initial',
                alamat: 'jakarta',
                jabatan: 'it',
                umur: 25,
                lamaKerja: 2,
                skillsets: ['java','spring boot']).save()
    }

    def cleanup() {
    }

    void "save to db"() {
        expect:
        Karyawan.count() == 1
    }

    void "select from db"() {
        def expectedString = 'haris test initial'
        expect:
        Karyawan.get(1).nama == expectedString
    }

    void "delete from db"() {
        Karyawan forDeletedKaryawan = Karyawan.get(1)
        forDeletedKaryawan.delete(flush:true)

        expect:
        Karyawan.count() == 0


    }

    void "update data on db"() {
        Karyawan originalKaryawan = Karyawan.get(1)
        def stringAfter = 'haris test after'
        originalKaryawan.setNama(stringAfter)
        originalKaryawan.save()

        expect:
        Karyawan.get(1).nama == stringAfter
    }
}
