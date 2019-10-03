package KT.formatter;

import KT.model.Lop;
import KT.service.LopService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;


@Component
public class LopFormatter implements Formatter<Lop> {
    private LopService lopService;

    @Autowired
    public LopFormatter(LopService lopService){
        this.lopService = lopService;
    }

    @Override
    public Lop parse(String text, Locale locale) throws ParseException {
        return lopService.findById(Long.parseLong(text));
    }

    @Override
    public String print(Lop object, Locale locale) {
        return "[" + object.getId() + ", " +object.getTenLop() + "]";
    }
}
