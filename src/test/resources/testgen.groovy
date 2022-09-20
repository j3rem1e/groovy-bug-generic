
@groovy.transform.CompileStatic
def cst() {
    new org.j3rem1e.test.Bridge().files.collect { it.name }
}

@groovy.transform.CompileStatic
def cst2() {
    def f = new org.j3rem1e.test.Bridge().files[0]
    f.name
}