package main.java.pages.header;

/**
 * Class pages.Header that contains instance of LogCont class
 */
public class Header {

    private LogCont logCont;
    /**
     * Default constructor
     */
    public Header() {
        logCont = new LogCont();
    }

    public LogCont getLogCont() {
        return logCont;
    }
}