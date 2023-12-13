package main.java.ru.treger78;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> result = (expression) -> {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");

            try {
                System.out.println(engine.eval(String.valueOf(expression)));
            } catch (ScriptException e) {
                throw new RuntimeException(e);
            }
        };

        result.accept(scanner.next());
    }
}
