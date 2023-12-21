public class LogLevels {
    
    public static String message(String logLine) {
          String logMessage = logLine.substring(logLine.indexOf(":") + 1);

        return logMessage.strip();
    }

    public static String logLevel(String logLine) {
          String logLevel = logLine.substring(1, logLine.indexOf("]"));

        return logLevel.toLowerCase();
    }

    public static String reformat(String logLine) {
        return String.format("%s (%s)", message(logLine), logLevel(logLine));
    }
}
