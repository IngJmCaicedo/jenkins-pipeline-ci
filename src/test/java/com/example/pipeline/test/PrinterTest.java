package com.example.pipeline.test;

import com.example.pipeline.Printer;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by juan.manuel.caicedo on 20/04/2017.
 */
public class PrinterTest {

    private Printer printer = new Printer();

    @Test
    public void successful_print(){
        String result = printer.print("juan");
        Assert.assertEquals("Hi juan", result);
    }

}
