
package luaToPy3;

import grammar.LuaLexer;
import grammar.LuaParser;

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
        LuaLexer lexer;
        try
        {
            if (args.length > 0)
            {
                lexer = new LuaLexer(new ANTLRFileStream(args[0]));
            }
            else
            {
                lexer = new LuaLexer(new ANTLRInputStream(System.in));
            }
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LuaParser parser = new LuaParser(tokens);
            ParserRuleContext tree = parser.chunk();
            
            LuaToPy3Visitor visitor = new LuaToPy3Visitor();
            String trad = visitor.visit(tree);
            System.out.println(trad);
            PrintWriter writer = new PrintWriter("stdout.py", "UTF-8");
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
