
@groovy.transform.CompileStatic
def cst() {
    new org.j3rem1e.test.Bridge().files.collect { it.name }
}
