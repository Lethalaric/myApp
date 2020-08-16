package myapp

class KaryawanController {


    def karyawanService

    def index() {
        respond karyawanService.list()
    }

    def show(Long id) {
        respond karyawanService.get(id)
    }

    def create() {
        respond new Karyawan(params)
    }

    def edit(Long id) {
        respond karyawanService.get(id)
    }

    def update(Karyawan karyawan) {
        karyawanService.save(karyawan)
        redirect action:"index", method:"GET"
    }

    def save(Karyawan karyawan) {
        karyawanService.save(karyawan)
        redirect action:"index", method:"GET"
    }

    def delete(Long id) {
        karyawanService.delete(id)
        redirect action:"index", method:"GET"
    }

}
