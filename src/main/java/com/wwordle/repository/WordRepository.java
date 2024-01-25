package com.wwordle.repository;

import com.wwordle.data.word.Word;
import org.springframework.data.repository.Repository;

public interface WordRepository extends Repository<Word, Long> {

}
