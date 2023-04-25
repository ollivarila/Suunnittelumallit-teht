package org.example;

import java.util.Date;

public interface IClock extends Cloneable {
    String getTime();
    void setTime(Date time);
    void stopClock();
    void setTimeToNow();
}
