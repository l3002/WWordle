package com.wwordle.data.word;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Word {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String word;
  private Byte length;
  private Byte difficulty;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public Byte getLength() {
    return length;
  }

  public void setLength(Byte length) {
    this.length = length;
  }

  public Byte getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(Byte difficulty) {
    this.difficulty = difficulty;
  }

  public Word(Long id, String word, Byte length, Byte difficulty) {
    this.id = id;
    this.word = word;
    this.length = length;
    this.difficulty = difficulty;
  }

  public Word() {

  }

}
