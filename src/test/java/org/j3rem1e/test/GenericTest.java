package org.j3rem1e.test;

import java.io.File;
import java.io.IOException;

import org.codehaus.groovy.control.CompilationFailedException;
import org.junit.jupiter.api.Test;

import groovy.lang.GroovyShell;

public class GenericTest {
    
    @Test
    public void testGenerics() throws CompilationFailedException, IOException {
        GroovyShell shell = new GroovyShell();
        shell.evaluate(new File("src/test/resources/testgen.groovy"));
    }

}
