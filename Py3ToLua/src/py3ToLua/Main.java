
package py3ToLua;

import grammar.Python3Lexer;
import grammar.Python3Parser;

import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;

/**
 * @author camiloasc1
 *
 */
public class Main
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Python3Lexer lexer;
        try
        {
            String file = null;
            if (args.length > 0)
            {
                file = args[0];
            }
            if (file == null)
            {
                lexer = new Python3Lexer(new ANTLRInputStream(System.in));
            }
            else
            {
                lexer = new Python3Lexer(new ANTLRFileStream(file));
            }
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Python3Parser parser = new Python3Parser(tokens);
            
            ParserRuleContext tree;
            if (file == null)
            {
                tree = parser.single_input();
            }
            else
            {
                tree = parser.file_input();
            }

            Py3ToLuaVisitor visitor = new Py3ToLuaVisitor();
            String trad = visitor.visit(tree);
            System.out.println(trad);
            PrintWriter writer = new PrintWriter("stdout.lua", "UTF-8");
            writer.println(trad);
            writer.close();
        }
        catch (RecognitionException e)
        {
            // e.printStackTrace();
            System.err.println(e);
        }
        catch (IOException e)
        {
            // e.printStackTrace();
            System.err.println(e);
        }
    }
}
