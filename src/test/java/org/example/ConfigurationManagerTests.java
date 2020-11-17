package org.example;

import org.example.config.ConfigurationManager;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConfigurationManagerTests {

    @Test
    public void testRunOnDefaultValue(){
        assertEquals("local", ConfigurationManager.getInstance().getRunOn());

    }
    @Test
    public void testRunOnEnvVarValue(){
        String evvVar="remote";
        String setEnvVar;
       // setEnvVar=("runOn"), "remote");
        assertEquals("envVar",ConfigurationManager.getInstance().getRunOn());
    }
    private void setEnvVar(String envVar,String value){

    }
}
