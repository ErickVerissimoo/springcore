package com.corespring.springcore.resources;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.WritableResource;
import org.springframework.util.FastByteArrayOutputStream;
import org.springframework.util.FileSystemUtils;
import java.nio.file.Files;
import java.nio.file.Path;
import org.springframework.core.SpringProperties;
import java.nio.file.Paths;
public class lerresources {
public static void main(String[] args)throws Exception {
    
   String absolute = Paths.get(".").toAbsolutePath().toString();
   File file = new File(absolute + "ola.txt");

    WritableResource resource = new FileSystemResource(file);
    System.out.println(resource.getFile());
    try (    OutputStreamWriter writer =new OutputStreamWriter(resource.getOutputStream())){
        writer.write("Ola mundoo");

    }
    
    FastByteArrayOutputStream arrei =new FastByteArrayOutputStream();
    var e =new ByteArrayInputStream(new FileInputStream(file).readAllBytes());

}
}
