
package luaToPy3;

import grammar.LuaBaseVisitor;
import grammar.LuaParser.ArgsExpListContext;
import grammar.LuaParser.ArgsStrContext;
import grammar.LuaParser.ArgsTableConstrContext;
import grammar.LuaParser.BlockContext;
import grammar.LuaParser.ChunkContext;
import grammar.LuaParser.ExpAtomContext;
import grammar.LuaParser.ExpBinContext;
import grammar.LuaParser.ExpFuncDefContext;
import grammar.LuaParser.ExpLogContext;
import grammar.LuaParser.ExpMathContext;
import grammar.LuaParser.ExpPrefxExpContext;
import grammar.LuaParser.ExpStrConcatContext;
import grammar.LuaParser.ExpTableConstrContext;
import grammar.LuaParser.ExpUnaryContext;
import grammar.LuaParser.ExplistContext;
import grammar.LuaParser.FieldExpContext;
import grammar.LuaParser.FieldIndexContext;
import grammar.LuaParser.FieldStrContext;
import grammar.LuaParser.FieldlistContext;
import grammar.LuaParser.FuncbodyContext;
import grammar.LuaParser.FuncnameContext;
import grammar.LuaParser.FunctioncallContext;
import grammar.LuaParser.FunctiondefContext;
import grammar.LuaParser.LabelContext;
import grammar.LuaParser.NameAndArgsContext;
import grammar.LuaParser.NamelistContext;
import grammar.LuaParser.OpCompContext;
import grammar.LuaParser.ParlistContext;
import grammar.LuaParser.PrefixexpContext;
import grammar.LuaParser.RetstatContext;
import grammar.LuaParser.StatBreakContext;
import grammar.LuaParser.StatContext;
import grammar.LuaParser.StatDoContext;
import grammar.LuaParser.StatForContext;
import grammar.LuaParser.StatForEachContext;
import grammar.LuaParser.StatFunctCallContext;
import grammar.LuaParser.StatFunctDeclLocContext;
import grammar.LuaParser.StatFunctionDeclContext;
import grammar.LuaParser.StatGotoContext;
import grammar.LuaParser.StatIfContext;
import grammar.LuaParser.StatLabelContext;
import grammar.LuaParser.StatSepContext;
import grammar.LuaParser.StatUntilContext;
import grammar.LuaParser.StatVarAssignContext;
import grammar.LuaParser.StatVarAssignLocContext;
import grammar.LuaParser.StatWhileContext;
import grammar.LuaParser.TableconstructorContext;
import grammar.LuaParser.VarContext;
import grammar.LuaParser.VarOrExpContext;
import grammar.LuaParser.VarSuffixContext;
import grammar.LuaParser.VarlistContext;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * @author camiloasc1
 *
 */
public class LuaToPy3Visitor extends LuaBaseVisitor<String>
{
    private int indent = -1;
    private String currentClass;
    private HashMap<String, LinkedHashMap<String, String>> classes = new LinkedHashMap<String, LinkedHashMap<String, String>>();

    private String getIndent()
    {
        String indentStr = "";
        for (int i = 0; i < indent; i++)
        {
            indentStr += "    ";
        }
        return indentStr;
    }

    private <T extends ParseTree> String listVisit(List<T> list, String sep)
    {
        String trad = "";
        for (Iterator<T> it = list.iterator(); it.hasNext();)
        {
            trad += visit(it.next());
            if (it.hasNext())
            {
                trad += sep;
            }
        }
        return trad;
    }
    
    @SuppressWarnings("unused")
    private <T extends ParseTree, S extends ParseTree> String listVisit(List<T> list, List<S> sep)
    {
        int count = 0;
        String trad = "";
        for (Iterator<T> it = list.iterator(); it.hasNext();)
        {
            trad += visit(it.next());
            if (it.hasNext())
            {
                trad += visit(sep.get(count++));
            }
        }
        return trad;
    }

    private <T extends ParseTree> String listGetText(List<T> list, String sep)
    {
        String trad = "";
        for (Iterator<T> it = list.iterator(); it.hasNext();)
        {
            trad += it.next().getText();
            if (it.hasNext())
            {
                trad += sep;
            }
        }
        return trad;
    }
    
    public static void error(Token token, String errMsg)
    {
        System.err.println("Error: line " + token.getLine() + ":" + token.getCharPositionInLine() + " " + errMsg);
    }
    
    public static void warn(Token token, String errMsg)
    {
        System.err.println("Warning: line " + token.getLine() + ":" + token.getCharPositionInLine() + " " + errMsg);
    }

    public String visitClasses()
    {
        String trad = "";
        for (String cN : classes.keySet())
        {
            trad += "class " + cN + " :\n";
            LinkedHashMap<String, String> cL = classes.get(cN);
            for (String mN : cL.keySet())
            {
                trad += cL.get(mN);
            }
        }
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitChunk(lua.LuaParser.ChunkContext)
     */
    @Override
    public String visitChunk(ChunkContext ctx)
    {
        String blockTrad = visitBlock(ctx.block());
        return visitClasses() + blockTrad;
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitBlock(lua.LuaParser.BlockContext)
     */
    @Override
    public String visitBlock(BlockContext ctx)
    {
        String trad = "";
        indent++;

        for (StatContext stat : ctx.stat())
        {
            String statTrad = visit(stat);
            if ((statTrad != null) && !statTrad.isEmpty())
            {
                trad += getIndent() + statTrad + "\n";
            }
        }

        if (ctx.retstat() != null)
        {
            trad += getIndent() + visitRetstat(ctx.retstat()) + "\n";
        }

        indent--;
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitStatNOP(lua.LuaParser.StatNOPContext)
     */
    @Override
    public String visitStatSep(StatSepContext ctx)
    {
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitStatVarAssign(lua.LuaParser.StatVarAssignContext)
     */
    @Override
    public String visitStatVarAssign(StatVarAssignContext ctx)
    {
        return visitVarlist(ctx.varlist()) + " = " + visitExplist(ctx.explist());
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitStatFunctCall(lua.LuaParser.StatFunctCallContext)
     */
    @Override
    public String visitStatFunctCall(StatFunctCallContext ctx)
    {
        return visitFunctioncall(ctx.functioncall());
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitStatLabel(lua.LuaParser.StatLabelContext)
     */
    @Override
    public String visitStatLabel(StatLabelContext ctx)
    {
        error(ctx.start, "Labels/Goto not supported.");
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitStatBreak(lua.LuaParser.StatBreakContext)
     */
    @Override
    public String visitStatBreak(StatBreakContext ctx)
    {
        return "break";
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitStatGoto(lua.LuaParser.StatGotoContext)
     */
    @Override
    public String visitStatGoto(StatGotoContext ctx)
    {
        error(ctx.start, "Labels/Goto not supported.");
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitStatDo(lua.LuaParser.StatDoContext)
     */
    @Override
    public String visitStatDo(StatDoContext ctx)
    {
        // Is like a nested block
        return "if True :\n" + visitBlock(ctx.block());
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitStatWhile(lua.LuaParser.StatWhileContext)
     */
    @Override
    public String visitStatWhile(StatWhileContext ctx)
    {
        return "while " + visit(ctx.exp()) + " :\n" + visitBlock(ctx.block());
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitStatUntil(lua.LuaParser.StatUntilContext)
     */
    @Override
    public String visitStatUntil(StatUntilContext ctx)
    {
        return "while not (" + visit(ctx.exp()) + ") :\n" + visitBlock(ctx.block());
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitStatIf(lua.LuaParser.StatIfContext)
     */
    @Override
    public String visitStatIf(StatIfContext ctx)
    {
        int blockCount = 0;
        String trad = "";
        trad += "if " + visit(ctx.exp(blockCount)) + " :\n";
        trad += visitBlock(ctx.block(blockCount++));
        for (@SuppressWarnings("unused")
        TerminalNode _ : ctx.ELSEIF())
        {
            trad += getIndent() + "elif " + visit(ctx.exp(blockCount)) + " :\n";
            trad += visitBlock(ctx.block(blockCount++));
        }
        // for (int i = 0; i < ctx.ELSEIF().size(); i++)
        // {
        // trad += getIndent() + "elif " + visit(ctx.exp(blockCount)) + " :\n";
        // trad += visitBlock(ctx.block(blockCount++));
        // }
        if (ctx.ELSE() != null)
        {
            trad += getIndent() + "else :\n";
            trad += visitBlock(ctx.block(blockCount++));
        }
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitStatFor(lua.LuaParser.StatForContext)
     */
    @Override
    public String visitStatFor(StatForContext ctx)
    {
        String trad = "";
        trad += "for " + ctx.NAME().getText() + " in range(" + listVisit(ctx.exp(), ", ") + ") :\n";
        trad += visitBlock(ctx.block());
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitStatForEach(lua.LuaParser.StatForEachContext)
     */
    @Override
    public String visitStatForEach(StatForEachContext ctx)
    {
        return "for " + visitNamelist(ctx.namelist()) + " in " + visitExplist(ctx.explist()) + " :\n" + visitBlock(ctx.block());
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitStatFunctionDecl(lua.LuaParser.StatFunctionDeclContext)
     */
    @Override
    public String visitStatFunctionDecl(StatFunctionDeclContext ctx)
    {
        String funcName = visitFuncname(ctx.funcname());
        if (Flags.get(Flags.CLASS))
        {
            int lastIndent = indent;
            indent = 1;
            if (funcName.compareTo("new") == 0)
            {
                funcName = "__init__";
            }
            classes.get(currentClass).put(funcName, getIndent() + "def " + funcName + visitFuncbody(ctx.funcbody()));
            indent = lastIndent;
            currentClass = null;
            Flags.clear(Flags.CLASS);
            return null;
        }
        return "def " + funcName + " " + visitFuncbody(ctx.funcbody());
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitStatFunctDeclLoc(lua.LuaParser.StatFunctDeclLocContext)
     */
    @Override
    public String visitStatFunctDeclLoc(StatFunctDeclLocContext ctx)
    {
        // In Python all function are local
        return "def " + ctx.NAME().getText() + " :\n" + visitFuncbody(ctx.funcbody());
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitStatVarAssignLoc(lua.LuaParser.StatVarAssignLocContext)
     */
    @Override
    public String visitStatVarAssignLoc(StatVarAssignLocContext ctx)
    {
        // In Python all variables are local
        return visitNamelist(ctx.namelist()) + " = " + visitExplist(ctx.explist());
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitRetstat(lua.LuaParser.RetstatContext)
     */
    @Override
    public String visitRetstat(RetstatContext ctx)
    {
        String trad = "";
        trad += "return";
        if (ctx.explist() != null)
        {
            trad += " " + visitExplist(ctx.explist());
        }
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitLabel(lua.LuaParser.LabelContext)
     */
    @Override
    public String visitLabel(LabelContext ctx)
    {
        error(ctx.start, "Labels/Goto not supported.");
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitFuncname(lua.LuaParser.FuncnameContext)
     */
    @Override
    public String visitFuncname(FuncnameContext ctx)
    {
        if (ctx.COLON() != null)
        {
            if (ctx.NAME().size() > 2)
            {
                error(ctx.NAME(2).getSymbol(), "Nested declarations not supported.");
                return null;
            }
            String className = ctx.NAME(0).getText();
            if (!classes.containsKey(className))
            {
                classes.put(className, new LinkedHashMap<String, String>());
            }
            Flags.set(Flags.SELF);
            Flags.set(Flags.CLASS);
            currentClass = className;
            return ctx.NAME(1).getText();
        }
        if (ctx.NAME().size() > 1)
        {
            error(ctx.NAME(1).getSymbol(), "Nested declarations not supported.");
        }
        return ctx.NAME(0).getText();
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitVarlist(lua.LuaParser.VarlistContext)
     */
    @Override
    public String visitVarlist(VarlistContext ctx)
    {
        return listVisit(ctx.var(), ", ");
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitNamelist(lua.LuaParser.NamelistContext)
     */
    @Override
    public String visitNamelist(NamelistContext ctx)
    {
        return listGetText(ctx.NAME(), ", ");
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitExplist(lua.LuaParser.ExplistContext)
     */
    @Override
    public String visitExplist(ExplistContext ctx)
    {
        if (ctx == null)
            return null;
        return listVisit(ctx.exp(), ", ");
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitExpAtom(lua.LuaParser.ExpAtomContext)
     */
    @Override
    public String visitExpAtom(ExpAtomContext ctx)
    {
        switch (ctx.getText())
        {
            case "nil":
                return "None";
            case "false":
                return "False";
            case "true":
                return "True";
            case "...":
                return "vararg";

            default:
                return ctx.getText();
        }

    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitExpFuncDef(lua.LuaParser.ExpFuncDefContext)
     */
    @Override
    public String visitExpFuncDef(ExpFuncDefContext ctx)
    {
        return visitFunctiondef(ctx.functiondef());
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitExpPrefxExp(lua.LuaParser.ExpPrefxExpContext)
     */
    @Override
    public String visitExpPrefxExp(ExpPrefxExpContext ctx)
    {
        return visitPrefixexp(ctx.prefixexp());
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitExpTableConstr(lua.LuaParser.ExpTableConstrContext)
     */
    @Override
    public String visitExpTableConstr(ExpTableConstrContext ctx)
    {
        return visitTableconstructor(ctx.tableconstructor());
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitExpStrConcat(lua.LuaParser.ExpStrConcatContext)
     */
    @Override
    public String visitExpStrConcat(ExpStrConcatContext ctx)
    {
        return visit(ctx.exp(0)) + " + " + visit(ctx.exp(1));
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitExpUnary(lua.LuaParser.ExpUnaryContext)
     */
    @Override
    public String visitExpUnary(ExpUnaryContext ctx)
    {
        switch (ctx.opUnary().getText())
        {
            case "#":
                return "len(" + visit(ctx.exp()) + ")";
            default:
                return ctx.opUnary().getText() + " " + visit(ctx.exp());
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitExpMath(lua.LuaParser.ExpMathContext)
     */
    @Override
    public String visitExpMath(ExpMathContext ctx)
    {
        String trad = "";
        trad += visit(ctx.exp(0)) + " ";
        if (ctx.opExp() != null)
        {
            trad += ctx.opExp().getText();
        }
        else if (ctx.opMulDivMod() != null)
        {
            trad += ctx.opMulDivMod().getText();
        }
        else if (ctx.opAddSub() != null)
        {
            trad += ctx.opAddSub().getText();
        }
        trad += " " + visit(ctx.exp(1));
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitExpBin(lua.LuaParser.ExpBinContext)
     */
    @Override
    public String visitExpBin(ExpBinContext ctx)
    {
        String trad = "";
        trad += visit(ctx.exp(0)) + " ";
        if (ctx.opShift() != null)
        {
            trad += ctx.opShift().getText();
        }
        else if (ctx.opBinAnd() != null)
        {
            trad += ctx.opBinAnd().getText();
        }
        else if (ctx.opBinXor() != null)
        {
            trad += ctx.opBinXor().getText();
        }
        else if (ctx.opBinOr() != null)
        {
            trad += ctx.opBinOr().getText();
        }
        trad += " " + visit(ctx.exp(1));
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitExpLog(lua.LuaParser.ExpLogContext)
     */
    @Override
    public String visitExpLog(ExpLogContext ctx)
    {
        String trad = "";
        trad += visit(ctx.exp(0)) + " ";
        if (ctx.opComp() != null)
        {
            trad += visitOpComp(ctx.opComp());
        }
        else if (ctx.opLogAnd() != null)
        {
            trad += ctx.opLogAnd().getText();
        }
        else if (ctx.opLogOr() != null)
        {
            trad += ctx.opLogOr().getText();
        }
        trad += " " + visit(ctx.exp(1));
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitVar(lua.LuaParser.VarContext)
     */
    @Override
    public String visitVar(VarContext ctx)
    {
        String trad = "";
        if (ctx.NAME() != null)
        {
            String varTrad = ctx.NAME().getText();
            if (Lua.isFunction(varTrad))
            {
                warn(ctx.NAME().getSymbol(), "Warning: Lua lib is not fully supported");
                String funcTrad = Lua.functionTrad(varTrad);
                if (funcTrad == null)
                    return "# " + varTrad;
                return funcTrad;
            }
            else if (Lua.isLib(varTrad))
            {
                warn(ctx.NAME().getSymbol(), "Warning: Lua lib is not fully supported");
                String suffixTrad = visitVarSuffix(ctx.varSuffix(0)).substring(1);
                String funcTrad = Lua.functionTrad(varTrad, suffixTrad);
                if (funcTrad == null)
                    return "# " + varTrad;
                return funcTrad;
            }
            else
            {
                trad += varTrad;
            }
        }
        else if (ctx.exp() != null)
        {
            trad += "(" + visit(ctx.exp()) + ")";
        }
        for (VarSuffixContext namearg : ctx.varSuffix())
        {
            trad += visitVarSuffix(namearg);
        }
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitPrefixexp(lua.LuaParser.PrefixexpContext)
     */
    @Override
    public String visitPrefixexp(PrefixexpContext ctx)
    {
        String trad = "";
        trad += visitVarOrExp(ctx.varOrExp());
        for (NameAndArgsContext namearg : ctx.nameAndArgs())
        {
            trad += visitNameAndArgs(namearg);
        }
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitFunctioncall(lua.LuaParser.FunctioncallContext)
     */
    @Override
    public String visitFunctioncall(FunctioncallContext ctx)
    {
        String trad = "";
        trad += visitVarOrExp(ctx.varOrExp());
        for (NameAndArgsContext namearg : ctx.nameAndArgs())
        {
            trad += visitNameAndArgs(namearg);
        }
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitVarOrExp(lua.LuaParser.VarOrExpContext)
     */
    @Override
    public String visitVarOrExp(VarOrExpContext ctx)
    {
        if (ctx.var() != null)
            return visitVar(ctx.var());
        else if (ctx.exp() != null)
            return "(" + visit(ctx.exp()) + ")";
        return "";
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitNameAndArgs(lua.LuaParser.NameAndArgsContext)
     */
    @Override
    public String visitNameAndArgs(NameAndArgsContext ctx)
    {
        String trad = "";
        if (ctx.NAME() != null)
        {
            String name = ctx.NAME().getText();
            if (name.compareTo("new") == 0)
            {
                trad += "";
            }
            else
            {
                trad += "." + name;
            }
        }
        trad += visit(ctx.args());
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitVarSuffix(lua.LuaParser.VarSuffixContext)
     */
    @Override
    public String visitVarSuffix(VarSuffixContext ctx)
    {
        String trad = "";
        for (NameAndArgsContext namearg : ctx.nameAndArgs())
        {
            trad += visitNameAndArgs(namearg);
        }
        if (ctx.exp() != null)
        {
            trad += "[" + visit(ctx.exp()) + "]";
        }
        else if (ctx.NAME() != null)
        {
            trad += "." + ctx.NAME().getText();
        }
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitArgsExpList(lua.LuaParser.ArgsExpListContext)
     */
    @Override
    public String visitArgsExpList(ArgsExpListContext ctx)
    {
        if (ctx.explist() != null)
            return "(" + visitExplist(ctx.explist()) + ")";
        return "()";
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitArgsTableConstr(lua.LuaParser.ArgsTableConstrContext)
     */
    @Override
    public String visitArgsTableConstr(ArgsTableConstrContext ctx)
    {
        return visitTableconstructor(ctx.tableconstructor());
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitArgsStr(lua.LuaParser.ArgsStrContext)
     */
    @Override
    public String visitArgsStr(ArgsStrContext ctx)
    {
        return visitString(ctx.string());
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitFunctiondef(lua.LuaParser.FunctiondefContext)
     */
    @Override
    public String visitFunctiondef(FunctiondefContext ctx)
    {
        // return "def " + visitFuncbody(ctx.funcbody());
        error(ctx.start, "Anonymous functions not supported.");
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitFuncbody(lua.LuaParser.FuncbodyContext)
     */
    @Override
    public String visitFuncbody(FuncbodyContext ctx)
    {
        String trad = "";
        trad += "(";
        if (Flags.get(Flags.SELF))
        {
            trad += "self";
            Flags.clear(Flags.SELF);
            if (ctx.parlist() != null)
            {
                trad += ", ";
            }
        }
        if (ctx.parlist() != null)
        {
            trad += visitParlist(ctx.parlist());
        }
        trad += ") :\n" + visitBlock(ctx.block());
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitParlist(lua.LuaParser.ParlistContext)
     */
    @Override
    public String visitParlist(ParlistContext ctx)
    {
        String trad = "";
        if (ctx.namelist() != null)
        {
            trad += visitNamelist(ctx.namelist());
            if (ctx.VARARGS() != null)
            {
                trad += ", ";
            }
        }
        if (ctx.VARARGS() != null)
        {
            trad += "*vararg";
        }
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitTableconstructor(lua.LuaParser.TableconstructorContext)
     */
    @Override
    public String visitTableconstructor(TableconstructorContext ctx)
    {
        if (ctx.fieldlist() != null)
            return "{" + visitFieldlist(ctx.fieldlist()) + "}";
        return "{ }";
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitFieldlist(lua.LuaParser.FieldlistContext)
     */
    @Override
    public String visitFieldlist(FieldlistContext ctx)
    {
        return listVisit(ctx.field(), ", ");
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitFieldIndex(lua.LuaParser.FieldIndexContext)
     */
    @Override
    public String visitFieldIndex(FieldIndexContext ctx)
    {
        return visit(ctx.exp(0)) + " : " + visit(ctx.exp(1));
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitFieldStr(lua.LuaParser.FieldStrContext)
     */
    @Override
    public String visitFieldStr(FieldStrContext ctx)
    {
        return ctx.NAME().getText() + " : " + visit(ctx.exp());
    }

    /*
     * (non-Javadoc)
     *
     * @see lua.LuaBaseVisitor#visitFieldExp(lua.LuaParser.FieldExpContext)
     */
    @Override
    public String visitFieldExp(FieldExpContext ctx)
    {
        return visit(ctx.exp());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.LuaBaseVisitor#visitOpComp(grammar.LuaParser.OpCompContext)
     */
    @Override
    public String visitOpComp(OpCompContext ctx)
    {
        String trad = "";
        switch (ctx.getText())
        {
            case "~=":

                trad = "!=";
                break;

            default:
                trad = ctx.getText();
                break;
        }
        return trad;
    }

}
