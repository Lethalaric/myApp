package myapp


import grails.rest.*
import grails.converters.*
import groovy.transform.CompileStatic

@CompileStatic
class KaryawanController extends RestfulController {
    static responseFormats = ['json', 'xml']
    KaryawanController() {
        super(Karyawan)
    }
}
