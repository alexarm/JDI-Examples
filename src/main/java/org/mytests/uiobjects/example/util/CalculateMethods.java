package org.mytests.uiobjects.example.util;

import com.epam.jdi.uitests.web.selenium.elements.base.Element;
import com.epam.jdi.uitests.web.selenium.elements.common.Label;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CalculateMethods {
    public static double getStep(Element element) {
        double step = element.getWebElement().getSize().width / 100.0;
        return step;
    }

    public static int getCurrentPosition(Label sliderHandle) {
        return Integer.parseInt(sliderHandle.getText());
    }

    public static int getOffset(int position, Element sliderTrack, Label sliderHandle) {
        int offset = (int) Math.round((position - getCurrentPosition(sliderHandle)) * getStep(sliderTrack));
        return offset - 2;
    }

    public static String getDefaultTime() {
        TimeZone tz = TimeZone.getTimeZone("Europe/Moscow");
        SimpleDateFormat dateFormat = new SimpleDateFormat("h:mm a");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        calendar.add(Calendar.HOUR, -1);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        int unroundedMinutes = calendar.get(Calendar.MINUTE);
        int mod = unroundedMinutes % 15;
        calendar.add(Calendar.MINUTE, mod < 1 ? -mod : (15 - mod));

        String defaultTime = dateFormat.format(calendar.getTime()).toString();

        return defaultTime;
    }
}
