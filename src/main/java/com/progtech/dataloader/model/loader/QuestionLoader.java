/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progtech.dataloader.model.loader;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.progtech.dataloader.model.Question;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import lombok.NonNull;

/**
 *
 * @author partosb
 */
public class QuestionLoader {
    
    public List<Question> readQuestionsFromFile( @NonNull final Path filePath ) {
        try {
            String json = new String(Files.readAllBytes(filePath), Charset.forName("UTF-8"));
            Type type = new TypeToken<ArrayList<Question>>(){}.getType();
            return new Gson().fromJson(json, type);
        } catch (IOException ex) {
            throw new IllegalArgumentException(ex);
        }   
    }
    
    public List<Question> readQuestionsFromFile( @NonNull final String filePath ) {
        return readQuestionsFromFile(Paths.get(filePath));
    }
    
}
