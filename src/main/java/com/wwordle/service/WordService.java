package com.wwordle.service;

import com.wwordle.word.Word;
import org.springframework.web.multipart.MultipartFile;

import java.util.Set;

public interface WordService {
    public boolean add(final Word word);
    public boolean delete(final Word word);
    public boolean addAll(final Set<Word> word);
    public boolean deleteAll(final Set<Word> word);
    public boolean addViaFile();
    public boolean deleteViaFile();
}
