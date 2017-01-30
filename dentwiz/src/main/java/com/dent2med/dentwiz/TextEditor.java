package com.dent2med.dentwiz;

import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by bbates on 12/14/16.
 */
public class TextEditor {
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    @Required
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker." );
        this.spellChecker = spellChecker;
    }

    private SpellChecker spellChecker;

    public SpellChecker getBackupSpellChecker() {
        return backupSpellChecker;
    }

    public void setBackupSpellChecker(SpellChecker backupSpellChecker) {
        System.out.println("Inside setBackupSpellChecker." );
        this.backupSpellChecker = backupSpellChecker;
    }

    private SpellChecker backupSpellChecker;

    public SpellChecker getThirdSpellChecker() {

        return thirdSpellChecker;
    }

    public void setThirdSpellChecker(SpellChecker thirdSpellChecker) {
        System.out.println("Inside setThirdSpellChecker." );
        this.thirdSpellChecker = thirdSpellChecker;
    }

    private SpellChecker thirdSpellChecker;

   public TextEditor(SpellChecker spellChecker,int verNumber) {
      System.out.println("Inside TextEditor constructor. verNumber:"+verNumber );
      this.spellChecker = spellChecker;
   }
   public void spellCheck() {
      spellChecker.checkSpelling();
   }

    public String getTextMode() {
        return textMode;
    }

    public void setTextMode(String textMode) {
        System.out.println("Inside setTextMode." );
        this.textMode = textMode;
    }

    private String textMode;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        System.out.println("Inside setEmail:"+email );
    }

    private String email;
    @PostConstruct
    public void init(){
       System.out.println("TextEditor Bean is going through init.");
    }
    @PreDestroy
    public void destroy(){
       System.out.println("TextEditor Bean will destroy now.");
    }

    public SpellChecker getFourthSpellChecker() {
        return fourthSpellChecker;
    }
    @Resource(name= "spellChecker")
    public void setFourthSpellChecker(SpellChecker fourthSpellChecker) {
        this.fourthSpellChecker = fourthSpellChecker;
        System.out.println("Inside setFourthSpellChecker." );
    }

    private SpellChecker fourthSpellChecker;
}
