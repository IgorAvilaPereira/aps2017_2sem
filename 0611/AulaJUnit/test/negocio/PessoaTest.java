/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author iapereira
 */
public class PessoaTest {

    public PessoaTest() throws FileNotFoundException {
        System.setOut(new PrintStream(new File("log.txt")));

    }

    
    @Before
    public void antes() {
        System.out.println("Antes de todo metodo de teste");
    }

    @Test
    public void testValida() throws FileNotFoundException {

//        FileWriter arq;
//        try {
//            arq = new FileWriter("./log.txt");
//            PrintWriter gravarArq = new PrintWriter(arq);
//            gravarArq.printf("+--Log--+%n");
            System.out.println("testValida");
            //String cpf = ;
            Pessoa instance = new Pessoa();
            System.out.println("Testando o valida...");
            System.out.println("true == "+ instance.validaCpf("01763917037"));
//            gravarArq.printf("Testando o valida...");
//            gravarArq.printf("true == "+ true,instance.validaCpf("01763917037"));
            assertEquals(true,instance.validaCpf("01763917037"));
//            gravarArq.close();
//        } catch (IOException ex) {
//            Logger.getLogger(PessoaTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //assertEquals("Este cpf eh valido?",true,instance.validaCpf("01890421099"));
    }

    @Test
    public void testValidaMascara() {
        System.out.println("testValidaMascara");
        //String cpf = ;
        Pessoa instance = new Pessoa();
        instance.setCpf("01763917037");
        System.out.println("Primeiro teste da mascara....");
        assertEquals("017.639.170-37", instance.getCpfComMascara());
        //assertEquals("Este cpf eh valido?",true,instance.validaCpf("01890421099"));

    }
}
