package fr.lernejo.logger;

interface Logger{
    void log(String message);
}

public class ConsoleLogger implements Logger {
    System.out.println(message);
}

public class LoggerFactory implements Logger {
    public static void getLogger(String name) {

    }
}