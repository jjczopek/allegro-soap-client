package pl.net.yuri.magister.client.gui.log;

import org.apache.log4j.WriterAppender;
import org.apache.log4j.spi.LoggingEvent;

import javax.swing.*;

/**
 * Simple example of creating a Log4j appender that will
 * write to a JTextArea.
 * <p/>
 * Found at: http://textareaappender.zcage.com/
 */
public class TextAreaAppender extends WriterAppender {

    private JTextArea jTextArea = null;

    /**
     * Set the target JTextArea for the logging information to appear.
     */
    public void setTextArea(JTextArea jTextArea) {
        this.jTextArea = jTextArea;
    }

    /**
     * Format and then append the loggingEvent to the stored
     * JTextArea.
     */
    public void append(LoggingEvent loggingEvent) {
        final String message = this.layout.format(loggingEvent);

        // Append formatted message to textarea using the Swing Thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                if (jTextArea != null) jTextArea.append(message);
            }
        });
    }
}