import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslateServlet",value = "/translate")
public class TranslateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> dictionary= new HashMap<>();
        dictionary.put("hello","Xin chào");
        dictionary.put("how", "thế nào");
        dictionary.put("Thank","Cảm ơn");
        dictionary.put("Book","Sách");

        String search = request.getParameter("txtSearch");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        String rs = dictionary.get(search);
        if (rs!=null){
            printWriter.println("Word:" +search);
            printWriter.println("Result:" +rs);
        }else {
            printWriter.println("Not found");
        }
        printWriter.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
