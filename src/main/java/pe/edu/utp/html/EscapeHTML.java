package pe.edu.utp.html;
import com.google.common.escape.Escaper;
import com.google.common.html.HtmlEscapers;

public class EscapeHTML {

    public static void main(String[] args) {

        String html = "<div onload='evil_function();'><b>Hello World</b></div>";

        Escaper escaper = HtmlEscapers.htmlEscaper();
        String comentario = escaper.escape(html);
        System.out.println("Comentario html = " + comentario);


    }

}
