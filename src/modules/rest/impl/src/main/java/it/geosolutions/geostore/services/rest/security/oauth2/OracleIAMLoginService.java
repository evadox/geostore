package it.geosolutions.geostore.services.rest.security.oauth2;

import it.geosolutions.geostore.services.rest.IdPLoginRest;

public class OracleIAMLoginService extends Oauth2LoginService {

    public OracleIAMLoginService(IdPLoginRest loginRest){
        loginRest.registerService("oracleIAM",this);
    }
}
