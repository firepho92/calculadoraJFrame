/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajframe;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author alex
 */
public class ExpEval {
    public static String eval(String str){
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        try {
            Object result = engine.eval(str);
            str = result.toString();
        } catch (ScriptException ex) {
            str = null;
        } catch (NullPointerException ex){
            str = null;
        }
        return str;
    }
}
