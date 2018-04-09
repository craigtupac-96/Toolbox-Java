import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptFromJava {

	public static void main(String[] args) {
		
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("nashorn");
		
		// javascript needs to be single quotes
		String script = "var welcome = 'Hello'; "
				+ "welcome += ', Craig'; " 
				+ "welcome;";
				
		Object result;
		try {
			result = engine.eval(script);
			System.out.println(result);
		} catch (ScriptException e) {
			System.out.println("There was a JavaScript error");
			e.printStackTrace();
		}
		
		
	}

}
