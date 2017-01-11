package com.scheidtbachmann.tank.medvede.model;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by lorman.erich on 9. 4. 2015.
 */
@SessionScoped
@Named
public class MedvedModel implements Serializable{

  int pocetMedvedov;

  public int getPocetMedvedov() {
    return pocetMedvedov;
  }

  public void setPocetMedvedov(final int pocetMedvedov) {
    this.pocetMedvedov = pocetMedvedov;
  }

}
