package com.scheidtbachmann.tank.medvede.action;

import com.scheidtbachmann.tank.medvede.model.MedvedModel;
import com.scheidtbachmann.tank.medvede.service.MedvedService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by lorman.erich on 9. 4. 2015.
 */
@ApplicationScoped
@Named
public class MedvedAction {

  @Inject
  MedvedModel medvedModel;

  @Inject
  MedvedService medvedService;

  public MedvedAction() {
    System.out.println();
  }

  /*
   * zavolat service, nahrat vsetky medvede do modelu
   * naseledne z modelu nacitat medvede na stranku do h:datatable
   */
  public String nacitajPocetMedvedovDoModelu() {
    medvedModel.setPocetMedvedov(medvedService.vratVsetkyMedvede().size());
    return null;
  }

  public String nulovaciGombik() {
    medvedModel.setPocetMedvedov(0);
    return null;
  }


}
