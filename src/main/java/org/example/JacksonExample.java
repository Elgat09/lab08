package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.List;

public class JacksonExample {
        public static void main(String args[]) throws Exception {
            Persoana std = new Persoana();
            std.setAge(001);
            std.setName("Krishna");
            std.setAge(30);

            Persoana std2 = new Persoana();
            std.setAge(001);
            std.setName("Krishna");
            std.setAge(30);


            List<Persoana> list = Arrays.asList(std, std2);

            ObjectMapper mapper = new ObjectMapper();

            String jsonString = mapper.writeValueAsString(list);
            System.out.println(jsonString);

            List<Persoana> list2 = mapper.readValue(jsonString, new TypeReference<List<Persoana>>(){});


        }
    }

