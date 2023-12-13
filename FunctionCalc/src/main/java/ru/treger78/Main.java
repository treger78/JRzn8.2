package main.java.ru.treger78;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ScriptException {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.next();

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");

        System.out.println(engine.eval(expression));
    }
}
